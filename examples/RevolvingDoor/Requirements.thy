theory Requirements
  imports "../Derived_Patterns"  CommonExtraInv
begin

(*
1. При входе пользователя дверь начинает вращаться, если на перегородки
    не оказывается давление.
2. Вращение продолжается, пока пользователь находится внутри пространства 
   вращения, если на перегородки не оказывается давление.
3. Если пользователь покинул пространство вращения, то не более, чем через 
  DELAY секунд вращение остановится, если за это время пользователи 
  не появятся вновь.
4. Если на секционные перегородки оказывается давление, то вращение 
   приостанавливается не менее, чем на SUSPENSION_TIME секунд.
5. Если на секционные перегородки перестали оказывать давление, то не более, 
   чем через SUSPENSION_TIME секунд вращение возобновится.
6. Запрещена одновременная подача сигналов rotation и brake.
*)

definition R1 where "R1 s \<equiv> toEnvP s \<and> 
always2_part (\<lambda> s1. getVarBool s1 rotation' = False) (\<lambda> s2. getVarBool s2 user' \<and> \<not> getVarBool s2 pressure')
(\<lambda> s2. getVarBool s2 rotation' = True) s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and> 
always2_inv_part (\<lambda> s. getPstate s Controller' = Controller'rotating')
 (\<lambda> s1. getVarBool s1 rotation' = False) (\<lambda> s2. getVarBool s2 user' \<and> \<not> getVarBool s2 pressure')
(\<lambda> s2. getVarBool s2 rotation' = True) s"

definition R2 where "R2 s \<equiv> toEnvP s \<and> 
always2_part (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' \<and> \<not> getVarBool s2 pressure')
(\<lambda> s2. getVarBool s2 rotation' = True) s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and> 
always2_inv_part (\<lambda> s. getPstate s Controller' \<noteq> Controller'rotating')
 (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' \<and> \<not> getVarBool s2 pressure')
(\<lambda> s2. getVarBool s2 rotation' = True) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
P1_2_part DELAY'TIMEOUT (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' = False)
(\<lambda> s3. getVarBool s3 rotation' = True \<and> getVarBool s3 user' = False) 
(\<lambda> s3. getVarBool s3 rotation' = False \<or> getVarBool s3 user' = True) s"

definition Einv3 where "Einv3 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part DELAY'TIMEOUT (\<lambda> s. getPstate s Controller' \<noteq> Controller'rotating')
(\<lambda> s. if getPstate s Controller' = Controller'rotating' then ltime s Controller' else 0)
 (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' = False)
(\<lambda> s3. getVarBool s3 rotation' = True \<and> getVarBool s3 user' = False) 
(\<lambda> s3. getVarBool s3 rotation' = False \<or> getVarBool s3 user' = True) s"

definition R4 where "R4 s \<equiv> toEnvP s \<and> 
P2_2_part SUSPENSION_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 pressure' = True)
(\<lambda> s3. getVarBool s3 brake' = True) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and> 
P2_2_inv_part SUSPENSION_TIME'TIMEOUT (\<lambda> s. getPstate s Controller' \<noteq> Controller'rotating')
(\<lambda> s. if getPstate s Controller' = Controller'suspended' then ltime s Controller' - 1 else SUSPENSION_TIME'TIMEOUT -1)
 (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 pressure' = True)
(\<lambda> s3. getVarBool s3 brake' = True) s"

definition R5 where "R5 s \<equiv> toEnvP s \<and>
P1_2_part SUSPENSION_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 brake' = True) (\<lambda> s2. getVarBool s2 pressure' = False)
(\<lambda> s3. getVarBool s3 rotation' = False \<and> getVarBool s3 pressure' = False)
 (\<lambda> s4. getVarBool s4 rotation' = True \<or> getVarBool s4 pressure' = True) s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part SUSPENSION_TIME'TIMEOUT (\<lambda> s. getPstate s Controller' \<noteq> Controller'suspended')
(\<lambda> s. if getPstate s Controller' = Controller'suspended' then ltime s Controller' else 0)
 (\<lambda> s1. getVarBool s1 brake' = True) (\<lambda> s2. getVarBool s2 pressure' = False)
(\<lambda> s3. getVarBool s3 rotation' = False \<and> getVarBool s3 pressure' = False)
 (\<lambda> s4. getVarBool s4 rotation' = True \<or> getVarBool s4 pressure' = True) s"

definition R6 where "R6 s \<equiv> toEnvP s \<and>
always_part (\<lambda> s1. getVarBool s1 rotation' = False \<or> getVarBool s1 brake' = False) s"

definition Einv6 where "Einv6 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 rotation' = False \<or> getVarBool s1 brake' = False) s"

end