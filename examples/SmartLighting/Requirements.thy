theory Requirements
  imports CommonExtraInv VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_NIGHT' \<longrightarrow> getVarBool s1 v_dayLight' = False \<and> getVarBool s1 v_dimLight' = False) s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_NIGHT' \<longrightarrow> getVarBool s1 v_dayLight' = False \<and> getVarBool s1 v_dimLight' = False) s"

definition R2 where "R2 s \<equiv> 
P4_2_part (v_LIGHTING_TIME'TIMEOUT - 1) (\<lambda> s1. getVarInt s1 v_timeOfDay' \<noteq> v_NIGHT')
  (\<lambda> s2. getVarInt s2 v_timeOfDay' \<noteq> v_NIGHT' \<and> getVarBool s2 v_motion' = True \<and> getVarBool s2 v_light' = v_LOW')
 (\<lambda> s3. getVarBool s3 v_dayLight' = v_TURNED_ON' \<or> getVarBool s3 v_dimLight' = v_TURNED_ON') (\<lambda> s4. getVarInt s4 v_timeOfDay' = v_NIGHT') s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
P4_2_inv_part (v_LIGHTING_TIME'TIMEOUT - 1) 
  (\<lambda> s. getPstate s p_Lighting' = p_Lighting's_night')
  (\<lambda> s. if getPstate s p_Lighting' = p_Lighting's_night' \<or> getPstate s p_Motion' \<noteq> p_Motion's_movement' then (v_LIGHTING_TIME'TIMEOUT - 1) 
    else ltime s p_Motion' - 1)
  (\<lambda> s1. getVarInt s1 v_timeOfDay' \<noteq> v_NIGHT')
  (\<lambda> s2. getVarInt s2 v_timeOfDay' \<noteq> v_NIGHT' \<and> getVarBool s2 v_motion' = True \<and> getVarBool s2 v_light' = v_LOW')
 (\<lambda> s3. getVarBool s3 v_dayLight' = v_TURNED_ON' \<or> getVarBool s3 v_dimLight' = v_TURNED_ON') (\<lambda> s4. getVarInt s4 v_timeOfDay' = v_NIGHT') s"

definition R3 where "R3 s ==
P2_2_part (v_MORNING_LIGHTING_TIME'TIMEOUT + 1) (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EARLY_MORNING')
   (\<lambda> s2. getVarInt s2 v_timeOfDay' = v_MORNING_LIGHTING') (\<lambda> s3. getVarBool s3 v_dimLight' = v_TURNED_ON') s"

definition Einv3 where "Einv3 s == commonExtraInv s \<and>
P2_2_inv_part (v_MORNING_LIGHTING_TIME'TIMEOUT + 1) 
  (\<lambda> s. getPstate s p_Lighting' \<noteq> p_Lighting's_earlyMorning')
  (\<lambda> s. if getPstate s p_Lighting' = p_Lighting's_morningLighting' then ltime s p_Lighting' - 1 else v_MORNING_LIGHTING_TIME'TIMEOUT)
  (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EARLY_MORNING')
   (\<lambda> s2. getVarInt s2 v_timeOfDay' = v_MORNING_LIGHTING') (\<lambda> s3. getVarBool s3 v_dimLight' = v_TURNED_ON') s"

definition R4 where "R4 s \<equiv> 
  always2_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_DAY') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dimLight' = False) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
  always2_inv_part (\<lambda> s. getPstate s p_Lighting' \<noteq> p_Lighting's_morningOrDay')
   (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_DAY') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dimLight' = False) s"

definition R5 where "R5 s \<equiv> 
always2_part (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EVENING') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dayLight' = False) s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Lighting' \<noteq> p_Lighting's_evening')
   (\<lambda> s1. getVarInt s1 v_timeOfDay' = v_EVENING') (\<lambda> s2. True) (\<lambda> s2. getVarBool s2 v_dayLight' = False) s"

definition R6 where "R6 s == 
always_part (\<lambda> s1. \<not> (getVarBool s1 v_dayLight' = v_TURNED_ON' \<and> getVarBool s1 v_dimLight' = v_TURNED_ON')) s"

definition Einv6 where "Einv6 s == commonExtraInv s \<and>
always_inv_part (\<lambda> s1. \<not> (getVarBool s1 v_dayLight' = v_TURNED_ON' \<and> getVarBool s1 v_dimLight' = v_TURNED_ON')) s"

definition R7 where "R7  s \<equiv> 
P1_1_part (v_LIGHTING_TIME'TIMEOUT + v_MORNING_LIGHTING_TIME'TIMEOUT) (\<lambda> s1. getVarBool s1 v_motion' = False)
(\<lambda> s2. (getVarBool s2 v_dayLight' = True \<or> getVarBool s2 v_dimLight' = True) \<and> getVarBool s2 v_motion' = False)
 (\<lambda> s3. getVarBool s3 v_dayLight' = False \<and> getVarBool s3 v_dimLight'= False \<or> getVarBool s3 v_motion' = True) s"

definition Einv7 where "Einv7  s \<equiv> commonExtraInv s \<and>
P1_1_inv_part (v_LIGHTING_TIME'TIMEOUT + v_MORNING_LIGHTING_TIME'TIMEOUT)
  (\<lambda> s. if getPstate s p_Motion' = p_Motion's_movement' then ltime s p_Motion' - 1 
    else if getPstate s p_Motion' \<noteq> p_Motion's_movement' \<and> getPstate s p_Lighting' = p_Lighting's_morningLighting' 
      then v_LIGHTING_TIME'TIMEOUT + ltime s p_Lighting' - 1
    else if getPstate s p_Motion' \<noteq> p_Motion's_movement' \<and> getPstate s p_Lighting' = p_Lighting's_morningOrDay'
       then v_LIGHTING_TIME'TIMEOUT + v_MORNING_LIGHTING_TIME'TIMEOUT else 0)
   (\<lambda> s1. getVarBool s1 v_motion' = False)
(\<lambda> s2. (getVarBool s2 v_dayLight' = True \<or> getVarBool s2 v_dimLight' = True) \<and> getVarBool s2 v_motion' = False)
 (\<lambda> s3. getVarBool s3 v_dayLight' = False \<and> getVarBool s3 v_dimLight'= False \<or> getVarBool s3 v_motion' = True) s"

definition R8 where "R8 s \<equiv> 
P1_2_part (v_LIGHTING_TIME'TIMEOUT - 1) (\<lambda> s1. getVarBool s1 v_motion' = True) (\<lambda> s2. getVarBool s2 v_motion' = False)
(\<lambda> s2. (getVarBool s2 v_dayLight' = True \<or> getVarBool s2 v_dimLight' = True) \<and> getVarBool s2 v_motion' = False \<and>
   getVarInt s2 v_timeOfDay' \<noteq> v_MORNING_LIGHTING' \<and>
 (let s1 = pred s2 in toEnvP s1 \<longrightarrow> getVarInt s1 v_timeOfDay' \<noteq> v_MORNING_LIGHTING'))
 (\<lambda> s3. getVarBool s3 v_dayLight' = False \<and> getVarBool s3 v_dimLight'= False \<or> getVarBool s3 v_motion' = True \<or>
   getVarInt s3 v_timeOfDay' = v_MORNING_LIGHTING' \<or>
  (let s2 = pred s3 in toEnvP s2 \<and> getVarInt s2 v_timeOfDay' = v_MORNING_LIGHTING')) s"

definition Einv8 where "Einv8 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part (v_LIGHTING_TIME'TIMEOUT - 1)
  (\<lambda> s. getVarBool s v_motion' = False)
(\<lambda> s. if getPstate s p_Motion' = p_Motion's_movement' then ltime s p_Motion' - 1 else 0)
   (\<lambda> s1. getVarBool s1 v_motion' = True) (\<lambda> s2. getVarBool s2 v_motion' = False)
(\<lambda> s2. (getVarBool s2 v_dayLight' = True \<or> getVarBool s2 v_dimLight' = True) \<and> getVarBool s2 v_motion' = False \<and>
   getVarInt s2 v_timeOfDay' \<noteq> v_MORNING_LIGHTING' \<and>
 (let s1 = pred s2 in toEnvP s1 \<longrightarrow> getVarInt s1 v_timeOfDay' \<noteq> v_MORNING_LIGHTING'))
 (\<lambda> s3. getVarBool s3 v_dayLight' = False \<and> getVarBool s3 v_dimLight'= False \<or> getVarBool s3 v_motion' = True \<or>
   getVarInt s3 v_timeOfDay' = v_MORNING_LIGHTING' \<or>
  (let s2 = pred s3 in toEnvP s2 \<and> getVarInt s2 v_timeOfDay' = v_MORNING_LIGHTING')) s"

end