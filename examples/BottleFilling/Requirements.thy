theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns BottleFilling_Requirement_Patterns
begin

definition R1 where "R1 s \<equiv>
P1_2_part 2 (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = True) 
  (\<lambda> s3. getVarBool s3 v_oFillTank' = True \<and> getVarBool s3 v_oSteam' = False)
  (\<lambda> s4. getVarBool s4 v_oFillTank' = False \<and> getVarBool s4 v_oSteam' = True) s"

definition Einv1 where "Einv1 s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part 2 (\<lambda> s. getPstate s p_Initialization' \<noteq> p_Initialization's_begin')
   (\<lambda> s. 0) (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = True) 
  (\<lambda> s3. getVarBool s3 v_oFillTank' = True \<and> getVarBool s3 v_oSteam' = False)
  (\<lambda> s4. getVarBool s4 v_oFillTank' = False \<and> getVarBool s4 v_oSteam' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_oSteam' = True \<and> getVarBool s1 v_iLowLevel') (\<lambda> s2. getVarBool s2 v_iHighTemp' = False) (\<lambda> s2. getVarBool s2 v_oSteam' = True) s"

definition Einv2 where "Einv2 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Initialization' = p_Initialization's_begin') (\<lambda> s1. getVarBool s1 v_oSteam' = True \<and> getVarBool s1 v_iLowLevel') (\<lambda> s2. getVarBool s2 v_iHighTemp' = False) (\<lambda> s2. getVarBool s2 v_oSteam' = True) s"

definition  R3 where "R3 s \<equiv>
R3_pattern_part (60 * 10 - 1) (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = True) (\<lambda> s3. getVarBool s3 v_iHighTemp' = True)
  (\<lambda> s4. getVarBool s4 v_oSteam' = True) (\<lambda> s5. False) s"

definition  Einv3 where "Einv3 s \<equiv> common_extra_invariant s \<and>
R3_pattern_inv_part (60 * 10 - 1) 
  (\<lambda> s. if getPstate s p_ForceSterilization' = p_ForceSterilization's_sterilizationFor1min' then ltime s p_ForceSterilization' - 1 else (60 * 10 - 1))
  (\<lambda> (s::state) . False)
  (\<lambda> s. getPstate s p_Initialization' \<noteq> p_Initialization's_begin') (\<lambda> s. getPstate s p_ForceSterilization' \<noteq> p_ForceSterilization's_heatUp') 
   (\<lambda> s. getPstate s p_ForceSterilization' = p_ForceSterilization's_heatUp')
 (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = True) (\<lambda> s3. getVarBool s3 v_iHighTemp' = True)
  (\<lambda> s4. getVarBool s4 v_oSteam' = True) (\<lambda> (s5::state) . False) s"

definition R4 where "R4  s \<equiv>
P1_2_part 2 (\<lambda> s1. getVarBool s1 v_oFillBottle' = True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = True \<and> getVarBool s2 v_iLowLevel' = False) 
  (\<lambda> s3. getVarBool s3 v_oFillTank' = False) (\<lambda> s4. getVarBool s4 v_oFillTank' = True) s"

definition Einv4 where "Einv4  s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part 2 (\<lambda> s. getPstate s p_MainLoop' \<noteq> p_MainLoop's_waitForFilling') (\<lambda> s. if getPstate s p_Initialization' = p_Initialization's_begin' then 1 else 0)
   (\<lambda> s1. getVarBool s1 v_oFillBottle' = True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = True \<and> getVarBool s2 v_iLowLevel' = False) 
  (\<lambda> s3. getVarBool s3 v_oFillTank' = False) (\<lambda> s4. getVarBool s4 v_oFillTank' = True) s"

definition R5 where "R5 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = False) (\<lambda> s2. getVarBool s2 v_oFillTank' = True) s"

definition Einv5 where "Einv5 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Initialization' \<noteq> p_Initialization's_begin')
   (\<lambda> s1. getVarBool s1 v_oFillTank' = True) (\<lambda> s2. getVarBool s2 v_iHighLevel' = False) (\<lambda> s2. getVarBool s2 v_oFillTank' = True) s"

definition R6 where "R6 s \<equiv>
P1_2_part 3 (\<lambda> s1. getVarBool s1 v_oFillBottle' = True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = True \<and> getVarBool s2 v_iLowLevel' = True) 
  (\<lambda> s3. getVarBool s3 v_oConveyor' = False) (\<lambda> s4. getVarBool s4 v_oConveyor' = True) s"

definition Einv6 where "Einv6 s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part 3 (\<lambda> s. getPstate s p_MainLoop' \<noteq> p_MainLoop's_waitForFilling') (\<lambda> s. if getPstate s p_MainLoop' = p_MainLoop's_begin' then 1 else 0)
  (\<lambda> s1. getVarBool s1 v_oFillBottle' = True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = True \<and> getVarBool s2 v_iLowLevel' = True) 
  (\<lambda> s3. getVarBool s3 v_oConveyor' = False) (\<lambda> s4. getVarBool s4 v_oConveyor' = True) s"

definition R7 where "R7 s \<equiv>
always2_part (\<lambda> s1 . getVarBool s1 v_oConveyor' = True) (\<lambda> s2 . getVarBool s2 v_iBottlePosition' = True) (\<lambda> s2. getVarBool s2 v_oFillBottle' = False) s"

definition Einv7 where "Einv7 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_NextBottle' = STOP)
   (\<lambda> s1 . getVarBool s1 v_oConveyor' = True) (\<lambda> s2 . getVarBool s2 v_iBottlePosition' = True) (\<lambda> s2. getVarBool s2 v_oFillBottle' = False) s"

definition R8 where "R8 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_oFillBottle' =True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = False) (\<lambda> s2. getVarBool s2 v_oFillBottle' = True) s"

definition Einv8 where "Einv8 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_MainLoop' \<noteq> p_MainLoop's_waitForFilling')
  (\<lambda> s1. getVarBool s1 v_oFillBottle' =True) (\<lambda> s2. getVarBool s2 v_iBottleLevel' = False) (\<lambda> s2. getVarBool s2 v_oFillBottle' = True) s"

end

