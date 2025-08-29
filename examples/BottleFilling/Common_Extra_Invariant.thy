theory Common_Extra_Invariant
  imports BottleFilling
begin

definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_Initialization' \<noteq> p_Initialization's_begin' \<longrightarrow> getVarBool s v_oFillTank' = v_TURNED_OFF') \<and>
(getPstate s p_ForceSterilization' \<noteq> STOP \<longrightarrow> getPstate s p_Initialization' = p_Initialization's_waitForSterilization') \<and>
(getPstate s p_Initialization' = p_Initialization's_keepSterilization' \<longrightarrow> getPstate s p_MainLoop' \<noteq> STOP) \<and>
(getPstate s p_Initialization' \<noteq> p_Initialization's_keepSterilization' \<longrightarrow> getPstate s p_MainLoop' = STOP) \<and>
(getPstate s p_NextBottle' \<noteq> STOP \<longrightarrow> getPstate s p_MainLoop' = p_MainLoop's_waitForNextBottle') \<and>
(getPstate s p_ForceSterilization' \<in> {p_ForceSterilization's_heatUp', p_ForceSterilization's_sterilizationFor1min'} \<longrightarrow> getVarBool s v_oSteam' = v_TURNED_ON') \<and>
(getPstate s p_ForceSterilization' = p_ForceSterilization's_sterilizationFor1min' \<longrightarrow> ltime s p_ForceSterilization' \<le> 1 * 60 * 1000) \<and>
(getPstate s p_MainLoop' \<noteq> p_MainLoop's_waitForFilling' \<longrightarrow> getVarBool s v_oFillBottle' = False) \<and>
(getPstate s p_NextBottle' \<noteq> STOP \<longrightarrow> getVarBool s v_oConveyor' = True) \<and>
(getPstate s p_NextBottle' = STOP \<longrightarrow> getVarBool s v_oConveyor' = False)
"
end