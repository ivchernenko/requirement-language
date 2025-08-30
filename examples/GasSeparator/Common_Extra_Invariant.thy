theory Common_Extra_Invariant
  imports GasSeparator
begin


definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waiting' \<longrightarrow>
  getVarBool s v_purge' = v_TURN_OFF' \<and> getVarBool s v_release' = v_TURN_OFF' \<and> getVarBool s v_AutoLED' = v_TURN_ON' \<and>
   getVarBool s v_ManualLED' = v_TURN_ON' \<and> getPstate s p_AutoModeControl' = STOP \<and> getPstate s p_EmergencyControl' = STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_autoMode' \<longrightarrow>
   getVarBool s v_AutoLED' = v_TURN_ON' \<and> getVarBool s v_ManualLED' = v_TURN_OFF'\<and> getVarBool s v_SafetyLED' = v_TURN_OFF' \<and>
   getVarBool s v_EmergencyLED' = v_TURN_OFF' \<and> getPstate s p_AutoModeControl' \<noteq> STOP \<and> getPstate s p_EmergencyControl' \<noteq> STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waitingForStageCompletion' \<longrightarrow>
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = True \<and> getVarBool s v_SafetyLED' = v_TURN_OFF' \<and> 
  getVarBool s v_EmergencyLED' = v_TURN_OFF' \<and>  getPstate s p_EmergencyControl' \<noteq> STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waitingForEmptying' \<longrightarrow> 
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = v_TURN_OFF' \<and> getVarBool s v_SafetyLED' = v_TURN_ON' \<and>
   getVarBool s v_EmergencyLED' = v_TURN_OFF' \<and> getPstate s p_EmergencyControl' \<noteq> STOP) \<and>
(getPstate  s p_ButtonPressControl' = p_ButtonPressControl's_purge' \<longrightarrow>
  getVarBool s v_purge' = v_TURN_ON' \<and> getVarBool s v_release' = v_TURN_ON' \<and> getPstate s p_AutoModeControl' = STOP \<and>
   getPstate s p_EmergencyControl' = STOP)
"