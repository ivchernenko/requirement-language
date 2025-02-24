theory Requirements
  imports "../Derived_Patterns"  CommonExtraInv
begin

(*
1. Если пользователи отсутствуют, то не более, чем через 2 мин. лента эскалатора прекращает
движение, если пользователи за это время не появились вновь.
2. Если есть пользователь, эскалатор двигался и тревожная кнопка не нажата, то эскалатор
продолжит движение в том же направлении.
3. При попадании предметов между ступенями движение прекращается не менее, чем на 1 с.
75
4. При нажатии тревожной кнопки движение должно прекратиться за приемлемое время (не
позже 0.2 секунды).
*)

definition R1 where "R1 s\<equiv> toEnvP  s \<and>
P1_2_part DELAY'TIMEOUT  (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 userAtTop' = False \<and> getVarBool s2 userAtBottom' = False)
(\<lambda> s3. (getVarBool s3 up' = True \<or> getVarBool s3 down' = True) \<and>
 getVarBool s3 userAtTop' = False \<and> getVarBool s3 userAtBottom' = False)
(\<lambda> s4. getVarBool s4 up' = False \<and> getVarBool s4 down' = False \<or> getVarBool s4 userAtTop' = True \<or> 
getVarBool s4 userAtBottom') s"

definition Einv1 where "Einv1 s\<equiv> commonExtraInv s \<and>
P1_2_inv_part DELAY'TIMEOUT (\<lambda> s. getVarBool s up' = False \<and> getVarBool s down' = False)
(\<lambda> s. if getPstate s Ctrl' \<in> {Ctrl'goUp', Ctrl'goDown'} then ltime s Ctrl' - 1
 else if getPstate s Ctrl' = Ctrl'stuckState' \<and> (getVarBool s up' = True \<or> getVarBool s down' = True) \<or>
getPstate s Ctrl' = Ctrl'emergency'
 then DELAY'TIMEOUT else 0)
  (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 userAtTop' = False \<and> getVarBool s2 userAtBottom' = False)
(\<lambda> s3. (getVarBool s3 up' = True \<or> getVarBool s3 down' = True) \<and>
 getVarBool s3 userAtTop' = False \<and> getVarBool s3 userAtBottom' = False)
(\<lambda> s4. getVarBool s4 up' = False \<and> getVarBool s4 down' = False \<or> getVarBool s4 userAtTop' = True \<or> 
getVarBool s4 userAtBottom') s"

definition R2 where "R2 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 up' = True \<and> getVarBool s1 alarmButton' = False \<and> getVarBool s1 stuck' = False)
(\<lambda> s2. getVarBool s2 userAtBottom' = True \<and> getVarBool s2 alarmButton' = False \<and> getVarBool s2 stuck' = False)
(\<lambda> s2. getVarBool s2 up' = True) s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getVarBool s up' = False\<or> getVarBool s alarmButton' = True \<or>
 getVarBool s stuck'= True)
 (\<lambda> s1. getVarBool s1 up' = True \<and> getVarBool s1 alarmButton' = False \<and> getVarBool s1 stuck' = False)
(\<lambda> s2. getVarBool s2 userAtBottom' = True \<and> getVarBool s2 alarmButton' = False \<and> getVarBool s2 stuck' = False)
(\<lambda> s2. getVarBool s2 up' = True) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
P2_2_part SUSPENSION_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 stuck' = True) (\<lambda> s3. getVarBool s3 up' = False \<and> getVarBool s3 down' = False) s"

definition Einv3 where "Einv3 s \<equiv>commonExtraInv s \<and>
P2_2_inv_part SUSPENSION_TIME'TIMEOUT (\<lambda> s. getVarBool s up' = False \<and> getVarBool s down' = False)
(\<lambda> s. if getPstate s Ctrl' = Ctrl'stuckState' then ltime s Ctrl' - 1 else SUSPENSION_TIME'TIMEOUT - 1)
 (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 stuck' = True) (\<lambda> s3. getVarBool s3 up' = False \<and> getVarBool s3 down' = False) s"

definition R4 where "R4 s \<equiv> toEnvP s \<and>
P1_2_part 1  (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 alarmButton')
(\<lambda> s3. (getVarBool s3 up' = True \<or> getVarBool s3 down' = True))
(\<lambda> s4. getVarBool s4 up' = False \<and> getVarBool s4 down' = False) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part 1 (\<lambda> s. getVarBool s up' = False \<and> getVarBool s down' = False)
(\<lambda> s. if getPstate s Ctrl' = Ctrl'emergency' then 1 else 0)
 (\<lambda> s1. getVarBool s1 up' = True \<or> getVarBool s1 down' = True)
 (\<lambda> s2. getVarBool s2 alarmButton')
(\<lambda> s3. (getVarBool s3 up' = True \<or> getVarBool s3 down' = True))
(\<lambda> s4. getVarBool s4 up' = False \<and> getVarBool s4 down' = False) s"

end