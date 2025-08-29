theory Common_Extra_Invariant
  imports GasSeparator
begin


definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_autoMode' \<longrightarrow>
   getVarBool s v_AutoLED' = v_TURN_ON' \<and> getPstate s p_AutoModeControl' \<noteq> STOP \<and> getPstate s p_IndicatorControl' \<noteq> STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_emptying' \<longrightarrow>
   getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_DegasLED' = v_TURN_OFF'\<and> getVarBool s v_EmergencyLED' = v_TURN_ON' \<and>
   getVarBool s v_EmptyingLED' = v_TURN_ON' \<and> getPstate s p_AutoModeControl' = STOP \<and> getPstate s p_IndicatorControl' \<noteq> STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waitingForStageCompletion' \<longrightarrow>
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = True \<and> getPstate s p_IndicatorControl' \<noteq> STOP)
"