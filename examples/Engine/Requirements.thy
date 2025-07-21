theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and> getVarBool s2 v_accelerator' = True \<and> getVarBool s2 v_liquidLevel' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_LOW') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R3 where "R3 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s2 v_accelerator' = v_NOT_PRESSED')
  (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R4 where "R4 s \<equiv>
always2_part (\<lambda>  s1. getVarBool s1 v_ignition' = True)
   (\<lambda> s2. getVarBool s2 v_accelerator' = True \<and> getVarBool s2 v_liquidLevel' = v_HIGH' \<and>
     \<not> (let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_onOffButton' = True \<and> getVarBool s2 v_onOffButton' = False))
  (\<lambda> s2. getVarBool s2 v_ignition' = True) s"

definition R5 where "R5 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = True) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_LOW') (\<lambda> s2. getVarBool s2 v_sound') s"

definition R6 where "R6 s \<equiv>
always_part (\<lambda> s1. getVarBool s1 v_liquidLevel' = v_HIGH' \<longrightarrow> getVarBool s1 v_sound' = False) s"