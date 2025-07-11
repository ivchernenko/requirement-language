theory Requirements
  imports CommonExtraInv VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_NIGHT' \<longrightarrow> getVarBool s1 v_dayLight' = False \<and> getVarBool s1 v_dimLight' = False) s"

definition R2 where "R2 s \<equiv> 
P4_2_part v_LIGHTING_TIME'TIMEOUT (\<lambda> s1. getVarInt s1 v_timeOfDay' \<noteq> v_NIGHT')
  (\<lambda> s2. getVarInt s2 v_timeOfDay' \<noteq> v_NIGHT' \<and> getVarBool s2 v_motion' = True \<and> getVarBool s v_light' = v_LOW')
 (\<lambda> s3. getVarBool s3 v_dayLight' = v_TURNED_ON' \<or> getVarBool s3 v_dimLight' = v_TURNED_ON') (\<lambda> s4. getVarInt s4 v_timeOfDay' = v_NIGHT') s"


definition R3 where "R3 s ==
P2_2_part (v_MORNING_LIGHTING_TIME'TIMEOUT + 1) (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EARLY_MORNING')
   (\<lambda> s2. getVarInt s2 v_timeOfDay' = v_MORNING_LIGHTING') (\<lambda> s3. getVarBool s3 v_dimLight' = v_TURNED_ON') s"

definition R4 where "R4 s \<equiv> 
  always2_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_DAY') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dimLight' = False) s"

definition R5 where "R5 s \<equiv> 
always2_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EVENING') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dayLight' = False) s"

definition R6 where "R6 s == toEnvP s \<and>
(\<forall> s1. substate s1 s \<and> toEnvP s1 \<and> getVarBool s1 dayLight' = TURNED_ON' \<longrightarrow> getVarBool s1 dimLight' = TURNED_OFF')"

definition R7 where "R7  s \<equiv> toEnvP s \<and>
P1 s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT) (\<lambda> s1. getVarBool s1 motion' = False)
 (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False)"

definition R7_1 where "R7_1 s \<equiv> toEnvP s \<and>
always s (\<lambda> s1. getVarBool s1 motion' = False \<longrightarrow> constrained_until s1 s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False)
 (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True))"

definition R8 where "R8 s \<equiv> toEnvP s \<and>
P1 s (LIGHTING_TIME'TIMEOUT - 1) (\<lambda> s2. P2ex s2 (\<lambda> s1. getVarBool s1 motion' = True \<and> getVarBool s2 motion' = False))
 (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True \<or>
 P2ex s3 (\<lambda> s2'.  getVarInt s2' timeOfDay' = MORNING_LIGHTING' \<or> getVarInt s3 timeOfDay' = MORNING_LIGHTING'))
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False \<and>
 P2all s2 (\<lambda> s1'. getVarInt s1' timeOfDay' \<noteq> MORNING_LIGHTING' \<and>getVarInt s2 timeOfDay' \<noteq> MORNING_LIGHTING'))"

end