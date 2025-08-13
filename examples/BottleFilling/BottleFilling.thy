theory BottleFilling imports VCProving.VCTheory
begin

abbreviation v_iLowLevel' :: variable where "v_iLowLevel' \<equiv> (Suc 0)"
abbreviation v_iHighLevel' :: variable where "v_iHighLevel' \<equiv> (Suc (Suc 0))"
abbreviation v_iLowTemp' :: variable where "v_iLowTemp' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_iHighTemp' :: variable where "v_iHighTemp' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_iBottleLevel' :: variable where "v_iBottleLevel' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_iBottlePosition' :: variable where "v_iBottlePosition' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_oFillTank' :: variable where "v_oFillTank' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_oSteam' :: variable where "v_oSteam' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_oFillBottle' :: variable where "v_oFillBottle' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_oConveyor' :: variable where "v_oConveyor' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"

abbreviation p_Initialization' :: process where "p_Initialization' \<equiv> (Suc 0)"
abbreviation p_ForceSterilization' :: process where "p_ForceSterilization' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_MainLoop' :: process where "p_MainLoop' \<equiv> (Suc (Suc 0))"
abbreviation p_NextBottle' :: process where "p_NextBottle' \<equiv> (Suc (Suc (Suc (Suc 0))))"

abbreviation p_Initialization's_keepSterilization' :: pstate where "p_Initialization's_keepSterilization' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Initialization's_waitForSterilization' :: pstate where "p_Initialization's_waitForSterilization' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Initialization's_begin' :: pstate where "p_Initialization's_begin' \<equiv> (Suc (Suc 0))"
abbreviation p_ForceSterilization's_sterilizationFor1min' :: pstate where "p_ForceSterilization's_sterilizationFor1min' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_ForceSterilization's_heatUp' :: pstate where "p_ForceSterilization's_heatUp' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_MainLoop's_waitForNextBottle' :: pstate where "p_MainLoop's_waitForNextBottle' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_MainLoop's_waitForFilling' :: pstate where "p_MainLoop's_waitForFilling' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_MainLoop's_begin' :: pstate where "p_MainLoop's_begin' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_NextBottle's_waitBottlePosition' :: pstate where "p_NextBottle's_waitBottlePosition' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation p_NextBottle's_begin' :: pstate where "p_NextBottle's_begin' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"

abbreviation v_TURNED_ON' :: bool where "v_TURNED_ON' \<equiv> True"
abbreviation v_TURNED_OFF' :: bool where "v_TURNED_OFF' \<equiv> False"


end

