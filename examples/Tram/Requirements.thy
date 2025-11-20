theory Requirements 
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns Tram_Requirement_Patterns_Patterns
begin

definition R1 where "R1 s \<equiv>
always_part (\<lambda> s1. \<not> (getVarBool s1 v_open' = True \<and> getVarBool s1 v_close' = True)) s"

definition Einv1 where "Einv1 s \<equiv> common_extra_invariant s \<and>
always_inv_part (\<lambda> s1. \<not> (getVarBool s1 v_open' = True \<and> getVarBool s1 v_close' = True)) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_open' = False \<and> getVarBool s1 v_antiClamp' = False) (\<lambda> s2. getVarBool s2 v_openCloseButton' \<noteq> v_PRESSED')
   (\<lambda> s2. getVarBool s2 v_open' = False) s"

definition Einv2 where "Einv2 s \<equiv>common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_AutoDoors' = p_AutoDoors's_opening' \<or> getPstate s p_Closing' = p_Closing's_opening')  (\<lambda> s1. getVarBool s1 v_open' = False \<and> getVarBool s1 v_antiClamp' = False) (\<lambda> s2. getVarBool s2 v_openCloseButton' \<noteq> v_PRESSED')
   (\<lambda> s2. getVarBool s2 v_open' = False) s"

definition R3 where "R3 s \<equiv>
P1_2_part 1 (\<lambda> s1. getVarBool s1 v_close' = True) (\<lambda> s2. getVarBool s2 v_closed' = False \<and> getVarBool s2 v_antiClamp' = v_DETECTED') 
  (\<lambda> s3. getVarBool s3 v_open' = False \<and> getVarBool s3 v_opened' = False) (\<lambda> s4. getVarBool s4 v_open' = True \<or> getVarBool s4 v_opened' = True) s"

definition Einv3 where "Einv3 s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part 1 (\<lambda> s. getPstate s p_Closing' \<noteq> p_Closing's_closing') (\<lambda> s. if getPstate s p_Closing' = p_Closing's_opening' then 1 else 0)
 (\<lambda> s1. getVarBool s1 v_close' = True) (\<lambda> s2. getVarBool s2 v_closed' = False \<and> getVarBool s2 v_antiClamp' = v_DETECTED') 
  (\<lambda> s3. getVarBool s3 v_open' = False \<and> getVarBool s3 v_opened' = False) (\<lambda> s4. getVarBool s4 v_open' = True \<or> getVarBool s4 v_opened' = True) s"

definition R4  where "R4 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_open' = True) (\<lambda> s2. getVarBool s2 v_opened' = False) (\<lambda> s2. getVarBool s2 v_open' = True) s"

definition Einv4  where "Einv4 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_AutoDoors' \<noteq> p_AutoDoors's_opening' \<and> getPstate s p_Closing' \<noteq> p_Closing's_opening')
   (\<lambda> s1. getVarBool s1 v_open' = True) (\<lambda> s2. getVarBool s2 v_opened' = False) (\<lambda> s2. getVarBool s2 v_open' = True) s"

definition R5 where "R5 s \<equiv>
R5_pattern_part v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT (\<lambda> s1. getVarBool s1 v_close' = True)
   (\<lambda> s2. getVarBool s2 v_closed' = False \<and> getVarBool s2 v_antiClamp' = v_DETECTED') (\<lambda> s3. getVarBool s3 v_opened')
   (\<lambda> s4. getVarBool s4 v_close' = False) (\<lambda> s5. getVarBool s5 v_emergencyMode') s"

definition Einv5 where "Einv5 s \<equiv> common_extra_invariant s \<and>
R5_pattern_inv_part v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT
  (\<lambda> s. if getPstate s p_Closing' = ERROR then 0 else if getPstate s p_AutoDoors' = p_AutoDoors's_closingDelay' then ltime s p_AutoDoors'
     else v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT)
   (\<lambda> s. True) (\<lambda> s. getPstate s p_Closing' \<noteq> p_Closing's_closing') (\<lambda> s. getPstate s p_Closing' \<noteq> p_Closing's_opening')
  (\<lambda> s. getPstate s p_Closing' = p_Closing's_opening')
   (\<lambda> s1. getVarBool s1 v_close' = True)
   (\<lambda> s2. getVarBool s2 v_closed' = False \<and> getVarBool s2 v_antiClamp' = v_DETECTED') (\<lambda> s3. getVarBool s3 v_opened')
   (\<lambda> s4. getVarBool s4 v_close' = False) (\<lambda> s5. getVarBool s5 v_emergencyMode') s"

definition R6 where "R6 s \<equiv>
R6_pattern_part (\<lambda> s1. getVarBool s1 v_requestStopButton' = v_PRESSED') 
  (\<lambda> s2. let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_open' = True \<and> getVarBool s2 v_opened' = True) 
  (\<lambda> s3. getVarBool s3 v_openCloseButton' \<noteq> v_PRESSED') (\<lambda> s4. getVarBool s4 v_sound' = True) s"

definition Einv6 where "Einv6 s \<equiv> common_extra_invariant s \<and>
R6_pattern_inv_part (\<lambda> s .getPstate s p_AutoDoors' = p_AutoDoors's_open') (\<lambda> s. 0)
   (\<lambda> s1. getVarBool s1 v_requestStopButton' = v_PRESSED') 
  (\<lambda> s2. let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_open' = True \<and> getVarBool s2 v_opened' = True) 
  (\<lambda> s3. getVarBool s3 v_openCloseButton' \<noteq> v_PRESSED') (\<lambda> s4. getVarBool s4 v_sound' = True) s"

end
