theory Requirements
  imports "../Derived_Patterns"  RevolvingDoor
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

definition R2 where "R2 s \<equiv> toEnvP s \<and> 
always2_part (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' \<and> \<not> getVarBool s2 pressure')
(\<lambda> s2. getVarBool s2 rotation' = True) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
P1_2_part DELAY'TIMEOUT (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 user' = False)
(\<lambda> s3. getVarBool s3 rotation' = True \<and> getVarBool s3 user' = False) 
(\<lambda> s3. getVarBool s3 rotation' = False \<or> getVarBool s3 user' = True) s"

definition R4 where "R4 s \<equiv> toEnvP s \<and> 
P2_2_part SUSPENSION_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 rotation' = True) (\<lambda> s2. getVarBool s2 pressure' = True)
(\<lambda> s3. getVarBool s3 brake' = True) s"

definition R5 where "R5 s \<equiv> toEnvP s \<and> (\<forall> s1 s2. substate s1 s2 \<and> substate s2 s \<and>
toEnvP s1 \<and> toEnvP s2 \<and> toEnvNum s1 s2 = 1 \<and> toEnvNum s2 s \<ge> SUSPENSION_TIME'TIMEOUT \<and>
getVarBool s1 brake \<and> \<not> getVarBool s2 pressure \<longrightarrow>
(\<exists> s4. toEnvP s4 \<and> substate s2 s4 \<and> substate s4 s \<and> toEnvNum s2 s4 \<le> SUSPENSION_TIME'TIMEOUT \<and>
(getVarBool s4 rotation = True \<or> getVarBool s4 pressure) \<and>
(\<forall> s3. toEnvP s3 \<and> substate s2 s3 \<and> substate s3 s4 \<and> s3 \<noteq> s4 \<longrightarrow> getVarBool s3 rotation = False \<and> \<not> getVarBool s3 pressure)))"

definition R6 where "R6 s \<equiv> toEnvP s \<and> (\<forall> s1. substate s1 s \<and> toEnvP s1 \<and> getVarBool s1 brake \<longrightarrow>
 getVarBool s1 rotation = False)"

definition env where "env s \<equiv> True"

end