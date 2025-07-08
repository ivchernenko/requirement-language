theory Requirements
  imports CommonExtraInv VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

(* Если при открытой двери нажата кнопка запуска стирки, то включается блокировка замка двери
*)
definition R1 where "R1 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_lock' = False) (\<lambda> s2. getVarBool s2 v_startButton' = True) (\<lambda> s2. getVarBool s2 v_lock' = True) s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_idle')
   (\<lambda> s1. getVarBool s1 v_lock' = False) (\<lambda> s2. getVarBool s2 v_startButton' = True) (\<lambda> s2. getVarBool s2 v_lock' = True) s"

(*Если только что подан сигнал блокировки двери, то после срабатывания замка начнется подача воды и включается вращение *)
definition R2 where "R2 s \<equiv>
P5_part (\<lambda> s1. getVarBool s1 v_lock' = False) (\<lambda> s2. getVarBool s2 v_lock' = True)
    (\<lambda> s3. getVarBool s3 v_locked' = True)
  (\<lambda> s4. True) (\<lambda> s4. False) 
 (\<lambda> s2. getVarBool s2 v_filling' \<and> (getVarBool s2 v_left' \<or> getVarBool s2 v_right')) s "

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
P5_inv_part (\<lambda> s. True)  (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_idle') (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_locking' ) 
  (\<lambda> s. getPstate s p_Washing' = p_Washing's_locking')
 (\<lambda> s1. getVarBool s1 v_lock' = False) (\<lambda> s2. getVarBool s2 v_lock' = True)  (\<lambda> s3. getVarBool s3 v_locked' = True)
  (\<lambda> s4. True)  (\<lambda> s4. False)  (\<lambda> s2. getVarBool s2 v_filling' \<and> (getVarBool s2 v_left' \<or> getVarBool s2 v_right')) s "

(*Подача воды начинается только при закрытой двери (Если подача воды не включена и замок двери не заблокирован, то подача воды
 не начнется)*)
definition R3 where "R3 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_filling' = False) (\<lambda> s2. getVarBool s2 v_locked' = False) (\<lambda> s2. getVarBool s2 v_filling' = False) s"

definition Einv3 where "Einv3 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' = p_Washing's_waterSupply')
 (\<lambda> s1. getVarBool s1 v_filling' = False) (\<lambda> s2. getVarBool s2 v_locked' = False) (\<lambda> s2. getVarBool s2 v_filling' = False) s"

(*Подача воды продолжается, пока бак не заполнен*)
definition R4 where "R4 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_filling' = True) (\<lambda> s2. getVarBool s2 v_waterLevel' \<noteq> v_SUFFICIENT')
   (\<lambda> s2. getVarBool s2 v_filling' = True) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_waterSupply')
   (\<lambda> s1. getVarBool s1 v_filling' = True) (\<lambda> s2. getVarBool s2 v_waterLevel' \<noteq> v_SUFFICIENT')
   (\<lambda> s2. getVarBool s2 v_filling' = True) s"

(*После наполнения бака выключается подача воды и включается индикатор стирки*)
definition R5 where "R5 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_filling' = True) (\<lambda> s2. getVarBool s2 v_waterLevel' = v_SUFFICIENT')
   (\<lambda> s2.  getVarBool s2 v_filling' = False \<and> getVarBool s2 v_washing' = True) s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_waterSupply')
  (\<lambda> s1. getVarBool s1 v_filling' = True) (\<lambda> s2. getVarBool s2 v_waterLevel' = v_SUFFICIENT')
   (\<lambda> s2.  getVarBool s2 v_filling' = False \<and> getVarBool s2 v_washing' = True) s"

(*Если стирка только что началась, то она продолжается  a) не более 30 мин, b) не менее 30 мин*)
definition R6a where "R6a s \<equiv> 
P1_2_part v_WASHING_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_washing' = False) (\<lambda> s2. getVarBool s2 v_washing' = True)
   (\<lambda> s3. getVarBool s3 v_washing' = True) (\<lambda> s4. getVarBool s4 v_washing' = False) s"

definition Einv6a where "Einv6a s \<equiv> commonExtraInv s \<and>
P1_2_inv_part v_WASHING_TIME'TIMEOUT (\<lambda> s. getPstate s p_Washing' = p_Washing's_wash')
   (\<lambda> s. if getPstate s p_Washing' = p_Washing's_wash' then ltime s p_Washing' else 0)
   (\<lambda> s1. getVarBool s1 v_washing' = False) (\<lambda> s2. getVarBool s2 v_washing' = True)
   (\<lambda> s3. getVarBool s3 v_washing' = True) (\<lambda> s4. getVarBool s4 v_washing' = False) s"

definition R6b where "R6b s \<equiv> 
P2_2_part v_WASHING_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_washing' = False) (\<lambda> s2. getVarBool s2 v_washing' = True)
   (\<lambda> s3. getVarBool s3 v_washing' = True) s"

definition Einv6b where "Einv6b s \<equiv> commonExtraInv s \<and>
P2_2_inv_part v_WASHING_TIME'TIMEOUT (\<lambda> s. getPstate s p_Washing' = p_Washing's_wash')
   (\<lambda> s. if getPstate s p_Washing' = p_Washing's_wash' then ltime s p_Washing' - 1 else v_WASHING_TIME'TIMEOUT -1)
   (\<lambda> s1. getVarBool s1 v_washing' = False) (\<lambda> s2. getVarBool s2 v_washing' = True)
   (\<lambda> s3. getVarBool s3 v_washing' = True) s"

(*После завершения стирки выполняется слив воды*)
definition R7 where "R7 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_washing' = True) (\<lambda> s2. getVarBool s2 v_washing' = False) (\<lambda> s2. getVarBool s2 v_drain' = True) s"

definition Einv7 where "Einv7 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_wash')
 (\<lambda> s1. getVarBool s1 v_washing' = True) (\<lambda> s2. getVarBool s2 v_washing' = False) (\<lambda> s2. getVarBool s2 v_drain' = True) s"

(*Слив воды продолжается, пока бак не пуст*)
definition R8 where "R8 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_drain' = True) (\<lambda> s2. getVarBool s2 v_waterPresence' = True)
   (\<lambda> s2. getVarBool s2 v_drain' = True) s"

definition Einv8 where "Einv8 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_draining')
 (\<lambda> s1. getVarBool s1 v_drain' = True) (\<lambda> s2. getVarBool s2 v_waterPresence' = True)
   (\<lambda> s2. getVarBool s2 v_drain' = True) s"

(*После слива воды закрывается клапан слива воды и разблокируется дверь*)
definition R9 where "R9 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_drain' = True) (\<lambda> s2. getVarBool s2 v_waterPresence' = False)
   (\<lambda> s2. getVarBool s2 v_drain' = False \<and> getVarBool s2 v_lock' = False) s"

definition Einv9 where "Einv9 s \<equiv> commonExtraInv s \<and> 
always2_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_draining')
 (\<lambda> s1. getVarBool s1 v_drain' = True) (\<lambda> s2. getVarBool s2 v_waterPresence' = False)
   (\<lambda> s2. getVarBool s2 v_drain' = False \<and> getVarBool s2 v_lock' = False) s"

(*Если дверь не закрыта, барабан не вращается*)
definition R10 where "R10 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_lock' = False \<longrightarrow> getVarBool s1 v_left' = False \<and> getVarBool s1 v_right' = False) s"

definition Einv10 where "Einv10 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 v_lock' = False \<longrightarrow> getVarBool s1 v_left' = False \<and> getVarBool s1 v_right' = False) s"

(*Если только что подан сигнал блокировки двери, то вращение не начнется и не начнется подача воды, пока не сработает блокировка замка*)
definition R11 where "R11 s \<equiv>
P3_4_part (\<lambda> s1. getVarBool s1 v_lock' = False)  (\<lambda> s2. getVarBool s2 v_lock' = True)
 (\<lambda> s3. getVarBool s3 v_left' = False \<and> getVarBool s3 v_right' = False \<and> getVarBool s3 v_filling' = False) 
(\<lambda> s4. getVarBool s4 v_locked' = True) s"

definition Einv11 where "Einv11 s \<equiv> commonExtraInv s \<and>
P3_4_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_idle') (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_locking') 
  (\<lambda> s. getPstate s p_Washing' = p_Washing's_locking')
   (\<lambda> s1. getVarBool s1 v_lock' = False)  (\<lambda> s2. getVarBool s2 v_lock' = True)
 (\<lambda> s3. getVarBool s3 v_left' = False \<and> getVarBool s3 v_right' = False \<and> getVarBool s3 v_filling' = False) 
(\<lambda> s4. getVarBool s4 v_locked' = True) s"

(*Запрещена одновременная подача сигналов left и right*)
definition R12 where "R12 s \<equiv> 
always_part (\<lambda> s1. \<not> (getVarBool s1 v_left' = True \<and> getVarBool s1 v_right' = True)) s"

definition Einv12 where "Einv12 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. \<not> (getVarBool s1 v_left' = True \<and> getVarBool s1 v_right' = True)) s"

(*Если только что включилось вращение, то не более, чем через минуту оно отключится.*)
definition R13a where "R13a s \<equiv> 
P1_2_part v_DIRECTION_CHANGE_PERIOD'TIMEOUT (\<lambda> s1. getVarBool s1 v_left' = False) (\<lambda> s2. getVarBool s2 v_left' = True)
   (\<lambda> s3. getVarBool s3 v_left' = True) (\<lambda> s2. getVarBool s2 v_left' = False) s"

definition Einv13a where "Einv13a s \<equiv> commonExtraInv s \<and>
P1_2_inv_part v_DIRECTION_CHANGE_PERIOD'TIMEOUT (\<lambda> s. getPstate s p_Drum' = p_Drum's_leftRotation')
  (\<lambda> s. if getPstate s p_Drum' = p_Drum's_leftRotation' then ltime s p_Drum' else 0)
   (\<lambda> s1. getVarBool s1 v_left' = False) (\<lambda> s2. getVarBool s2 v_left' = True)
   (\<lambda> s3. getVarBool s3 v_left' = True) (\<lambda> s2. getVarBool s2 v_left' = False) s"

(*Если только что включилось вращение, то оно не отключится по крайней мере в течение минуты или пока не будет выпущена вода.
*)
definition R13b where "R13b s \<equiv> 
P4_3_part (v_DIRECTION_CHANGE_PERIOD'TIMEOUT - 1)
   (\<lambda> s1. getVarBool s1 v_left' = False) (\<lambda> s2. getVarBool s2 v_left' = True)
   (\<lambda> s3. getVarBool s3 v_left' = True) (\<lambda> s2. getVarBool s2 v_drain' = True) (\<lambda> s3. getVarBool s3 v_drain' = False) s"

definition Einv13b where "Einv13b s \<equiv> commonExtraInv s \<and>
P4_3_inv_part (v_DIRECTION_CHANGE_PERIOD'TIMEOUT - 1) (\<lambda> s. getPstate s p_Drum' = p_Drum's_leftRotation')
  (\<lambda> s. getPstate s p_Washing' = p_Washing's_draining')
  (\<lambda> s. if getPstate s p_Drum' = p_Drum's_leftRotation' then ltime s p_Drum' - 1 else v_DIRECTION_CHANGE_PERIOD'TIMEOUT - 1)
   (\<lambda> s1. getVarBool s1 v_left' = False) (\<lambda> s2. getVarBool s2 v_left' = True)
   (\<lambda> s3. getVarBool s3 v_left' = True) (\<lambda> s2. getVarBool s2 v_drain' = True) (\<lambda> s3. getVarBool s3 v_drain' = False) s"

(*Если вращение только что выключилось, то после остановки вращения должно включиться вращение в противоположную сторону, если к этому времени вода не была выпущена полностью
*)
definition R14 where "R14 s \<equiv> 
P5_part (\<lambda> s1. getVarBool s1 v_left' = True) (\<lambda> s2. getVarBool s2 v_left' = False) (\<lambda> s3. getVarInt s3 v_freq' = 0)
  (\<lambda> s2. getVarBool s2 v_drain' = True) (\<lambda> s3. getVarBool s3 v_drain' = False) (\<lambda> s4. getVarBool s4 v_right') s"

definition Einv14 where "Einv14 s \<equiv> commonExtraInv s \<and>
P5_inv_part (\<lambda> s. getPstate s p_Washing' \<noteq> p_Washing's_draining') (\<lambda> s. getPstate s p_Drum' \<noteq> p_Drum's_leftRotation')
  (\<lambda> s. getPstate s p_Drum' \<noteq> p_Drum's_leftToRight') (\<lambda> s. getPstate s p_Drum' = p_Drum's_leftToRight')
 (\<lambda> s1. getVarBool s1 v_left' = True) (\<lambda> s2. getVarBool s2 v_left' = False) (\<lambda> s3. getVarInt s3 v_freq' = 0)
  (\<lambda> s2. getVarBool s2 v_drain' = True) (\<lambda> s3. getVarBool s3 v_drain' = False) (\<lambda> s4. getVarBool s4 v_right') s"

end