theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_switch' = False) (\<lambda> s2. getVarBool s2 v_switch' = True) (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition Einv1 where "Einv1 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Controller' = p_Controller's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_switch' = False) (\<lambda> s2. getVarBool s2 v_switch' = True) (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_intake' = True) (\<lambda> s2. getVarBool s2 v_maxLevel' = False \<and> getVarBool s2 v_switch' = True)
   (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition Einv2 where "Einv2 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda>s. getPstate s p_Filling'\<noteq> p_Filling's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_intake' = True) (\<lambda> s2. getVarBool s2 v_maxLevel' = False \<and> getVarBool s2 v_switch' = True)
   (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition R3 where "R3 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_intake' = True) (\<lambda> s2. getVarBool s2 v_maxLevel' = True) (\<lambda> s2. getVarBool s2 v_intake' = False) s"

definition Einv3 where "Einv3 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s.  getPstate s p_Filling'\<noteq> p_Filling's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_intake' = True) (\<lambda> s2. getVarBool s2 v_maxLevel' = True) (\<lambda> s2. getVarBool s2 v_intake' = False) s"

definition R4 where "R4 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_intake' = False) (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_minLevel' = False) 
  (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition Einv4 where "Einv4 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s.  getPstate s p_Filling' = p_Filling's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_intake' = False) (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_minLevel' = False) 
  (\<lambda> s2. getVarBool s2 v_intake' = True) s"

definition R5 where "R5 s \<equiv>
always_part (\<lambda> s1. getVarBool s1 v_waterPresence' = False \<longrightarrow> getVarBool s1 v_heater' = False) s"

definition Einv5 where "Einv5 s \<equiv> common_extra_invariant s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 v_waterPresence' = False \<longrightarrow> getVarBool s1 v_heater' = False) s"

definition R6 where "R6 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_waterPresence' = False) 
  (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_maxTemp' = False) 
  (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition Einv6 where "Einv6 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Heating' \<in> {p_Heating's_turnedOff', p_Heating's_turnedOn'}) 
   (\<lambda> s1. getVarBool s1 v_waterPresence' = False) 
  (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_maxTemp' = False) 
  (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition R7 where "R7 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_heater' = False) 
  (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_minTemp' = False) 
  (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition Einv7 where "Einv7 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Heating' = p_Heating's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_heater' = False) 
  (\<lambda> s2. getVarBool s2 v_switch' = True \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_minTemp' = False) 
  (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition R8 where "R8 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_heater' = True) 
  (\<lambda> s2. getVarBool s2 v_maxTemp' = False \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_switch' = True) (\<lambda> s2. getVarBool s2 v_heater' = True)
 s"

definition Einv8 where "Einv8 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Heating' \<noteq> p_Heating's_turnedOn')
   (\<lambda> s1. getVarBool s1 v_heater' = True) 
  (\<lambda> s2. getVarBool s2 v_maxTemp' = False \<and> getVarBool s2 v_waterPresence' = True \<and> getVarBool s2 v_switch' = True) (\<lambda> s2. getVarBool s2 v_heater' = True)
 s"

end
