theory Requirements
  imports Common_Extra_Inv VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv> toEnvP s \<and>
  always2_part (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED') (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN')
   (\<lambda> s1. getVarBool s1 v_lighting' = True) s"

definition Einv1 where "Einv1 s \<equiv> common_extra_inv s \<and>
  always2_inv_part (\<lambda> s. getPstate s p_FridgeDoorController' \<in> {p_FridgeDoorController's_open', p_FridgeDoorController's_longOpen'})
 (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED') (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN')
   (\<lambda> s1. getVarBool s1 v_lighting' = True) s"

definition R2 where "R2 s \<equiv> toEnvP s \<and>
  always2_part (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN') (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED')
   (\<lambda> s1. getVarBool s1 v_lighting' = False) s"

definition Einv2 where "Einv2 s \<equiv> common_extra_inv s \<and>
  always2_inv_part (\<lambda> s. getPstate s p_FridgeDoorController' \<in> {p_FridgeDoorController's_closed', STOP})
  (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN') (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED')
   (\<lambda> s1. getVarBool s1 v_lighting' = False) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
P1_1_part v_OPEN_DOOR_TIME_LIMIT'TIMEOUT (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN')
 (\<lambda> s2. getVarBool s2 v_doorSignal' = False \<and> getVarBool s2 v_fridgeDoor' = v_OPEN') 
 (\<lambda> s2. getVarBool s2 v_doorSignal' = True \<or> getVarBool s2 v_fridgeDoor' = v_CLOSED') s"

definition Einv3 where "Einv3 s \<equiv> common_extra_inv s \<and>
P1_1_inv_part v_OPEN_DOOR_TIME_LIMIT'TIMEOUT
 (\<lambda> s. if  getPstate s p_FridgeDoorController' = p_FridgeDoorController's_open' then ltime s p_FridgeDoorController' else 0)
 (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_OPEN')
 (\<lambda> s2. getVarBool s2 v_doorSignal' = False \<and> getVarBool s2 v_fridgeDoor' = v_OPEN') 
 (\<lambda> s2. getVarBool s2 v_doorSignal' = True \<or> getVarBool s2 v_fridgeDoor' = v_CLOSED') s"

definition R4 where "R4 s \<equiv> toEnvP s \<and>
P2_2_part v_OPEN_DOOR_TIME_LIMIT'TIMEOUT (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED')
 (\<lambda> s2. getVarBool s2 v_fridgeDoor' = v_OPEN') (\<lambda> s3. getVarBool s3 v_doorSignal' = False) s"


definition Einv4 where "Einv4 s \<equiv> common_extra_inv s \<and>
P2_2_inv_part v_OPEN_DOOR_TIME_LIMIT'TIMEOUT
(\<lambda> s. getPstate s p_FridgeDoorController' \<in> {p_FridgeDoorController's_open', p_FridgeDoorController's_longOpen'})
(\<lambda> s. if getPstate s p_FridgeDoorController' = p_FridgeDoorController's_open' then ltime s p_FridgeDoorController' - 1
 else if getPstate s p_FridgeDoorController' = p_FridgeDoorController's_longOpen' then v_OPEN_DOOR_TIME_LIMIT'TIMEOUT - 1 else 1)
 (\<lambda> s1. getVarBool s1 v_fridgeDoor' = v_CLOSED')
 (\<lambda> s2. getVarBool s2 v_fridgeDoor' = v_OPEN') (\<lambda> s3. getVarBool s3 v_doorSignal' = False) s"

definition R5 where "R5 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 v_fridgeCompressor' = False) (\<lambda> s2. getVarBool s2 v_fridgeTempGreaterMax' = True)
 (\<lambda> s2. getVarBool s2 v_fridgeCompressor' = True) s"

definition Einv5 where "Einv5 s \<equiv> common_extra_inv s \<and>
always2_inv_part (\<lambda> s. getVarBool s v_fridgeCompressor' = True)
 (\<lambda> s1. getVarBool s1 v_fridgeCompressor' = False) (\<lambda> s2. getVarBool s2 v_fridgeTempGreaterMax' = True)
 (\<lambda> s2. getVarBool s2 v_fridgeCompressor' = True) s"

end