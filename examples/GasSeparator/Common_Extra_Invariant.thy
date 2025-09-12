theory Common_Extra_Invariant
  imports GasSeparator
begin


definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waiting' \<longrightarrow>
  getVarBool s v_purge' = v_TURN_OFF' \<and> getVarBool s v_release' = v_TURN_OFF' \<and> getVarBool s v_AutoLED' = v_TURN_OFF' \<and>
   getVarBool s v_ManualLED' = v_TURN_OFF' \<and> getPstate s p_AutoModeControl' = STOP \<and> getPstate s p_EmergencyControl' = STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_autoMode' \<longrightarrow>
   getVarBool s v_AutoLED' = v_TURN_ON' \<and> getVarBool s v_ManualLED' = v_TURN_OFF'\<and> getVarBool s v_SafetyLED' = v_TURN_OFF' \<and>
   getVarBool s v_EmergencyLED' = v_TURN_OFF' \<and> getPstate s p_AutoModeControl' \<noteq> STOP) \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waitingForStageCompletion' \<longrightarrow>
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = True \<and> getVarBool s v_SafetyLED' = v_TURN_OFF' \<and> 
  getVarBool s v_EmergencyLED' = v_TURN_OFF') \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_waitingForEmptying' \<longrightarrow> 
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = v_TURN_OFF' \<and> getVarBool s v_SafetyLED' = v_TURN_ON' \<and>
   getVarBool s v_EmergencyLED' = v_TURN_OFF') \<and>
(getPstate  s p_ButtonPressControl' = p_ButtonPressControl's_purge' \<longrightarrow>
  getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = v_TURN_OFF' \<and> getVarBool s v_SafetyLED' = v_TURN_ON' \<and>
  getVarBool s v_EmergencyLED' = v_TURN_OFF' \<and> getVarBool s v_purge' = v_TURN_ON' \<and> getVarBool s v_release' = v_TURN_ON' \<and>
   getPstate s p_AutoModeControl' = STOP \<and> getPstate s p_EmergencyControl' = STOP) \<and>
(getPstate s p_ButtonPressControl' = STOP \<longrightarrow>
   getVarBool s v_AutoLED' = v_TURN_OFF' \<and> getVarBool s v_ManualLED' = v_TURN_OFF' \<and> getVarBool s v_SafetyLED' = v_TURN_OFF' \<and>
   getVarBool s v_EmergencyLED' = v_TURN_ON') \<and>
(getPstate s p_EmergencyControl' = p_EmergencyControl's_autoMode' \<longrightarrow> getPstate s p_ButtonPressControl' \<noteq> STOP) \<and>
(getPstate s p_EmergencyControl' = p_EmergencyControl's_emptying' \<longrightarrow> getVarBool s v_EmptyingLED' = v_TURN_ON' \<and>  getPstate s p_ButtonPressControl' = STOP)\<and>
(getPstate s p_EmergencyControl' = p_EmergencyControl's_purge' \<longrightarrow> getPstate s p_ButtonPressControl' = STOP) \<and>
(getPstate s p_AutoModeControl' = p_AutoModeControl's_filling' \<longrightarrow>
   getVarBool s v_filling' = v_TURN_ON' \<and> getVarBool s v_release' = v_TURN_ON' \<and> getVarBool s v_FillingLED' = v_TURN_ON') \<and>
(getPstate s p_AutoModeControl' \<noteq> p_AutoModeControl's_filling' \<longrightarrow> getVarBool s v_filling' = v_TURN_OFF' \<and> getVarBool s v_FillingLED' = v_TURN_OFF') \<and>
(getPstate s p_AutoModeControl' = p_AutoModeControl's_degassing' \<longrightarrow>
   getVarBool s v_release' = v_TURN_OFF' \<and> getVarBool s v_DegasLED' = v_TURN_ON' \<and>  getPstate s p_DegassingControl' \<noteq> STOP) \<and>
(getPstate s p_AutoModeControl' \<noteq> p_AutoModeControl's_degassing' \<longrightarrow> getVarBool s v_DegasLED' = v_TURN_OFF' \<and> getPstate s p_DegassingControl' = STOP) \<and>
(getPstate s p_AutoModeControl' = p_AutoModeControl's_emptying' \<longrightarrow> getVarBool s v_EmptyingLED' = v_TURN_OFF') \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_heating' \<longrightarrow>
  getVarBool s v_heater' = v_TURN_ON' \<and> getVarBool s v_HeatingLED' = v_TURN_ON' \<and> getVarBool s v_release' = v_TURN_OFF') \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_accumulating' \<longrightarrow> 
  getVarBool s v_heater' = v_TURN_OFF' \<and> getVarBool s v_release' = v_TURN_OFF' \<and> getVarBool s v_GasAccumulatingLED' = v_TURN_ON') \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_releasing' \<longrightarrow> 
  getVarBool s v_heater' = v_TURN_OFF' \<and> getVarBool s v_release' = v_TURN_ON' \<and> getVarBool s v_ReleasingLED' = v_TURN_ON' \<and>
  getVarBool s v_HeatingLED' = v_TURN_OFF' \<and> getVarBool s v_GasAccumulatingLED' = v_TURN_OFF') \<and>
(getPstate s p_ButtonPressControl' = p_ButtonPressControl's_purge' \<longrightarrow> ltime s p_ButtonPressControl' \<le> v_PURGE_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_EmergencyControl' = p_EmergencyControl's_purge' \<longrightarrow> ltime s p_EmergencyControl' \<le> v_PURGE_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_AutoModeControl' = p_AutoModeControl's_degassing' \<longrightarrow> ltime s p_AutoModeControl' \<le> v_DEGASSING_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_heating' \<longrightarrow> ltime s p_DegassingControl' \<le> v_HEATING_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_accumulating' \<longrightarrow> ltime s p_DegassingControl' \<le> v_ACCUMULATING_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_DegassingControl' = p_DegassingControl's_releasing' \<longrightarrow> ltime s p_DegassingControl' \<le> v_RELEASE_TIMEOUT'TIMEOUT) \<and>
getPstate s p_ButtonPressControl' \<in> {p_ButtonPressControl's_waiting', p_ButtonPressControl's_autoMode', p_ButtonPressControl's_waitingForEmptying', 
  p_ButtonPressControl's_purge', p_ButtonPressControl's_waitingForStageCompletion', STOP} \<and>
getPstate s p_EmergencyControl' \<in> {p_EmergencyControl's_autoMode', p_EmergencyControl's_emptying', p_EmergencyControl's_purge', STOP} \<and>
getPstate s p_AutoModeControl' \<in> {p_AutoModeControl's_filling', p_AutoModeControl's_degassing', p_AutoModeControl's_emptying', STOP} \<and>
getPstate s p_DegassingControl' \<in> {p_DegassingControl's_heating', p_DegassingControl's_accumulating', p_DegassingControl's_releasing', STOP}"

end
