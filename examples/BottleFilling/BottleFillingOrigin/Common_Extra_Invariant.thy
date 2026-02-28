theory Common_Extra_Invariant
  imports BottleFilling
begin

definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_TankFilling' \<noteq> STOP \<longrightarrow> getPstate s p_Initialization' = p_Initialization's_waitForFilling') \<and>
(getPstate s p_ForcedSterilization' \<noteq> STOP \<longrightarrow>
   getPstate s p_Initialization' = p_Initialization's_waitForSterilization') \<and>
(getPstate s p_Initialization' \<noteq> STOP \<longrightarrow> getPstate s p_MainLoop' = STOP) \<and>
(getPstate s p_Initialization' = STOP \<longrightarrow> getPstate s p_MainLoop' \<noteq> STOP) \<and>
(getPstate s p_NextBottle' \<noteq> STOP \<longrightarrow> getPstate s p_MainLoop' = p_MainLoop's_waitForNextBottle') \<and>
(getPstate s p_BottleFilling' = p_BottleFilling's_begin' \<longrightarrow>
   getPstate s p_MainLoop' = p_MainLoop's_waitForFilling') \<and>
(getPstate s p_Initialization' \<noteq> STOP \<longrightarrow> getPstate s p_KeepSterilization' = STOP) \<and>
(getPstate s p_Initialization' = STOP \<longrightarrow> getPstate s p_KeepSterilization' \<noteq> STOP) \<and>
(getPstate s p_TankFilling' = STOP \<longrightarrow> getVarBool s v_oFillTank' = False) \<and>
(getPstate s p_ForcedSterilization' \<noteq> STOP \<longrightarrow> getVarBool s v_oSteam' = True) \<and>
(getPstate s p_KeepSterilization' = p_KeepSterilization's_waitLowTemp' \<longrightarrow> getVarBool s v_oSteam' = False) \<and>
(getPstate s p_KeepSterilization' = p_KeepSterilization's_waitHighTemp' \<longrightarrow> getVarBool s v_oSteam' = True) \<and>
(getPstate s p_BottleFilling' =  p_BottleFilling's_begin' \<longrightarrow> getVarBool s v_oFillBottle' = True) \<and>
(getPstate s p_BottleFilling' = STOP \<longrightarrow> getVarBool s v_oFillBottle' = False) \<and>
(getPstate s p_NextBottle' \<noteq> STOP \<longrightarrow> getVarBool s v_oConveyor' = True) \<and>
(getPstate s p_NextBottle' = STOP \<longrightarrow> getVarBool s v_oConveyor' = False) \<and>
(getPstate s p_ForcedSterilization' = p_ForcedSterilization's_sterilizationFor1min' \<longrightarrow> 
  ltime s p_ForcedSterilization' \<le> 1 * 60 * 10) \<and>
getPstate s p_Initialization' \<in> 
  {p_Initialization's_begin', p_Initialization's_waitForFilling', p_Initialization's_waitForSterilization', STOP} \<and>
getPstate s p_MainLoop' \<in> {p_MainLoop's_begin', p_MainLoop's_waitForNextBottle', p_MainLoop's_waitForFilling', STOP}\<and>
getPstate s p_TankFilling' \<in> {p_TankFilling's_tankFilled', STOP} \<and>
getPstate s p_ForcedSterilization' \<in>
   {p_ForcedSterilization's_heatUp', p_ForcedSterilization's_sterilizationFor1min', STOP} \<and>
getPstate s p_KeepSterilization' \<in>
   {p_KeepSterilization's_waitLowTemp', p_KeepSterilization's_waitHighTemp', STOP} \<and>
getPstate s p_BottleFilling' \<in> {p_BottleFilling's_begin', STOP} \<and>
getPstate s p_NextBottle' \<in> {p_NextBottle's_begin', p_NextBottle's_waitBottlePosition', STOP} \<and>
(toEnvNum emptyState s = 1 \<longrightarrow>
   getVarBool s v_oSteam' = False \<and> getVarBool s v_oFillTank' = False \<and> getVarBool s v_oFillBottle' = False \<and>
 getVarBool s v_oConveyor' = False)
"

end