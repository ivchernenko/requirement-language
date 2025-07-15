theory Requirements
  imports Barrier VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always_part (\<lambda> s1.\<not> ( getVarBool s1 v_up' = True \<and> getVarBool s1 v_down' = True)) s"

definition R2 where "R2 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_peCarUnder' = True \<longrightarrow> getVarBool s1 v_down' = False) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
P3_2_part (\<lambda> s1. getVarBool s1 v_down' = True) (\<lambda> s2. getVarBool s2 v_closed' = True) (\<lambda> s3. getVarBool s3 v_up' = False)
 (\<lambda> s5. let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_carInFront' = False \<and> getVarBool s5 v_carInFront' = True) s"

definition R4 where "R4 s \<equiv> 
P1_1_part v_OPEN_TIME'TIMEOUT  (\<lambda> s1. getVarBool s1 v_green' = True)
   (\<lambda> s3. getVarBool s3 v_down' = False \<and> getVarBool s3 v_opened' = True \<and> getVarBool s3 v_peCarUnder' = False \<and> 
     (getVarBool s3 v_carInFront' = False \<or> (let s2 = pred s3 in toEnvP s2 \<longrightarrow> getVarBool s2 v_carInFront' = True)))
   (\<lambda> s5. getVarBool s5 v_down' = True \<or> getVarBool s5 v_opened' = False \<or> getVarBool s5 v_peCarUnder' = True \<or> 
     (getVarBool s5 v_carInFront' = True \<or> (let s4 = pred s5 in toEnvP s4 \<longrightarrow> getVarBool s4 v_carInFront' = False))) s"


definition R5 where "R5 s \<equiv> toEnvP s \<and>
(\<forall> s1 s2. substate s1 s2 \<and> substate s2 s \<and> toEnvP s1 \<and> toEnvP s2 \<and> toEnvNum s1 s2 = 1 \<and>
 getVarBool s1 carInFront' = False \<and> getVarBool s2 carInFront' = True \<and>  getVarBool s2 opened' = False \<longrightarrow> getVarBool s2 up' = True)"

definition R6 where "R6 s \<equiv> toEnvP s \<and>
P5_2 s OPEN_TIME'TIMEOUT  (\<lambda> s1. getVarBool s1 green' = False) (\<lambda> s2. getVarBool s2 green' = True) (\<lambda> s3. getVarBool s3 down' = False)"

definition R7 where "R7 s \<equiv> toEnvP s \<and>
P5_1 s OPEN_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 peCarUnder' = True) (\<lambda> s2. getVarBool s2 down' = False)"

definition R8 where "R8 s \<equiv> toEnvP s \<and>
(\<forall> s2 s1. substate s1 s2 \<and> substate s2 s \<and> toEnvP s1 \<and> toEnvP s2 \<and> substate s2 s \<and> toEnvNum s1 s2 = 1 \<and> getVarBool s1 down' = True \<and> getVarBool s2 peCarUnder' = True \<and>
getVarBool s2 opened' = False \<and> getVarBool s2 closed' = False \<longrightarrow>  getVarBool s2 up' = True)"

definition R9 where "R9 s \<equiv> toEnvP s \<and>
(\<forall> s2 s1. substate s1 s2 \<and> substate s2 s \<and> toEnvP s1 \<and> toEnvP s2 \<and> toEnvNum s1 s2 = 1 \<and>
 getVarBool s1 up' = True \<and> getVarBool s2 opened' = False \<longrightarrow> getVarBool s2 up' = True)"

definition R9' where "R9' s \<equiv> toEnvP s \<and>
always2 s (\<lambda> s1. getVarBool s1 up' = True) (\<lambda> s2. getVarBool s2 opened' = False) (\<lambda> s2. getVarBool s2  up' = True)"

definition R10 where "R10 s \<equiv> toEnvP s \<and>
(\<forall> s1 s2 s3. substate s1 s2 \<and> substate s2 s3 \<and> substate s3 s \<and> toEnvP s1 \<and> toEnvP s2 \<and> toEnvP s3 \<and> toEnvNum s1 s2 = 1 \<and> toEnvNum s2 s3 < OPEN_TIME'TIMEOUT \<and>
getVarBool s1 carInFront' = False \<and> getVarBool s2 carInFront' = True \<and> getVarBool s2 green' = True \<longrightarrow> getVarBool s3 down' = False)"

definition R11 where "R11 s \<equiv> toEnvP s \<and>
(\<forall> s1. substate s1 s \<and> toEnvP s1 \<and> (getVarBool s1 up' = True \<or> getVarBool s1 down' = True) \<longrightarrow> getVarBool s1 red' = True)"

definition R12 where "R12 s \<equiv> toEnvP s \<and> 
(\<forall> s1. substate s1 s \<and> toEnvP s1 \<and> getVarBool s1 red' = True \<longrightarrow> getVarBool s1 green' = False)"

end

