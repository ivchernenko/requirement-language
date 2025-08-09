theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_engine' = False) 
  (\<lambda> s2. getVarBool s2 v_startButton' = v_PRESSED' \<and> getVarBool s2 v_weight' = v_LOW' \<and> getVarBool s2 v_stuck' = v_NOT_DETECTED') 
  (\<lambda> s2. getVarBool s2 v_engine' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_engine' = True) (\<lambda> s2. getVarBool s2 v_stuck' = v_DETECTED' \<or> getVarBool s2 v_weight' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_engine' = False) s"

definition R3 where "R3 s \<equiv>
P1_1_part v_IDLE_TIMEOUT'TIMEOUT (\<lambda> s1. getVarBool s1 v_pSensor' = False) (\<lambda> s2. getVarBool s2 v_engine' = True \<and> getVarBool s2 v_pSensor' = False)
(\<lambda> s3. getVarBool s3 v_engine' = False \<or> getVarBool s3 v_pSensor' = True) s"

definition R4 where "R4 s \<equiv>
P4_2_part (v_IDLE_TIMEOUT'TIMEOUT - 1)
   (\<lambda> s1. getVarBool s1 v_engine' = True) (\<lambda> s2. getVarBool s2 v_pSensor' = v_DETECTED') (\<lambda> s3. getVarBool s3 v_engine' = True) 
  (\<lambda> s4. getVarBool s4 v_stuck' = v_DETECTED' \<or> getVarBool s4 v_weight' = v_HIGH') s"

end