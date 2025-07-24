theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_liquidLevel' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_LOW') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R3 where "R3 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R4 where "R4 s \<equiv>
P4_3_part (v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT + 1)
   (\<lambda>  s1. getVarBool s1 v_ignition' = True)
   (\<lambda> s2.  getVarBool s2 v_liquidLevel' = v_HIGH')
  (\<lambda> s2. getVarBool s2 v_ignition' = True) (\<lambda> s4. getVarBool s4 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s5. getVarBool s5 v_onOffButton' = v_PRESSED') s"

definition R5 where "R5 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_sound' = False) 
  (\<lambda> s2. \<not> (getVarBool s2 v_liquidLevel' = v_LOW' \<and>
    (let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s2 v_onOffButton' = v_PRESSED')))
   (\<lambda> s2. getVarBool s2 v_sound' = False) s"

definition R6 where "R6 s \<equiv>
always_part (\<lambda> s1. getVarBool s1 v_liquidLevel' = v_HIGH' \<longrightarrow> getVarBool s1 v_sound' = False) s"

definition R7 where "R7 s \<equiv>
P1_1_part v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT (\<lambda> s1. getVarBool s1 v_liquidLevel' = v_LOW') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True \<and> getVarBool s2 v_liquidLevel' = v_LOW') 
  (\<lambda> s3. getVarBool s3 v_ignition' = False \<or> getVarBool s3 v_liquidLevel' = v_HIGH') s"

definition R8 where "R8 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_liquidLevel' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R10 where "R10 s \<equiv>
P1_2_part v_EMERGENCY_STOP_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_ignition' = True \<and> getVarBool s3 v_onOffButton' = v_PRESSED')
  (\<lambda> s4. getVarBool s4 v_ignition' = False \<or> getVarBool s4 v_onOffButton' = v_NOT_PRESSED') s"