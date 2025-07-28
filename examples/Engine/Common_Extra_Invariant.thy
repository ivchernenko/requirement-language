theory Common_Extra_Invariant
  imports Engine
begin

definition common_extra_invariant where "common_extra_invariant s == toEnvP s \<and>
(getPstate s p_EngineController' \<in> {p_EngineController's_turningOff', p_EngineController's_turnedOff'} \<longrightarrow>
  getPstate s p_CoolingAgentController' = STOP \<and> getVarBool s v_ignition' = False) \<and>
(getPstate s p_EngineController' \<in> {p_EngineController's_turningOn', p_EngineController's_turnedOn'} \<longrightarrow> 
  getPstate s p_CoolingAgentController' \<noteq> STOP \<and> getPstate s p_Sound' = STOP \<and> getVarBool s v_ignition' = True) \<and>
(getPstate s p_CoolingAgentController' = p_CoolingAgentController's_lack' \<longrightarrow> getVarBool s v_sound' = True) \<and>
(getPstate s p_CoolingAgentController' = p_CoolingAgentController's_normal' \<longrightarrow>
  getPstate s p_Cooling' = p_Cooling's_ctrl' \<and> getVarBool s v_sound' = False) \<and>
(getPstate s p_CoolingAgentController' \<noteq> p_CoolingAgentController's_normal' \<longrightarrow> getPstate s p_Cooling' = STOP) \<and>
(getPstate s p_Cooling' = STOP \<longrightarrow> getVarBool s v_valve' = False) \<and>
(getPstate s p_Sound' = p_Sound's_sound' \<longrightarrow> getVarBool s v_sound' = True) \<and>
(getPstate s p_EngineController' = p_EngineController's_turnedOn' \<longrightarrow> ltime s p_EngineController' \<le> v_EMERGENCY_STOP_TIME'TIMEOUT) \<and>
(getPstate s p_CoolingAgentController' = p_CoolingAgentController's_lack' \<longrightarrow> ltime s p_CoolingAgentController' \<le> v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT) \<and>
(getPstate s p_Sound' = p_Sound's_sound' \<longrightarrow> ltime s p_Sound' \<le> v_SOUND_TIME'TIMEOUT) \<and>
getPstate s p_EngineController' \<in> 
  {p_EngineController's_turnedOff', p_EngineController's_turningOn', p_EngineController's_turnedOn', p_EngineController's_turningOff'} \<and>
getPstate s p_CoolingAgentController' \<in> {p_CoolingAgentController's_normal', p_CoolingAgentController's_lack', STOP} \<and>
getPstate s p_StopEngine' = STOP \<and>
getPstate s p_Cooling' \<in> {p_Cooling's_ctrl', STOP} \<and>
getPstate s p_Sound' \<in> {p_Sound's_sound', STOP}"

end