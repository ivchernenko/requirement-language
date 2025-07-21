theory Common_Extra_Invariant
  imports Engine
begin

definition common_extra_invariant where "common_extra_invariant s == toEnvP s \<and>
(getPstate s p_EngineController' = p_EngineController's_turnedOff' \<longrightarrow>
  getPstate s p_CoolingAgentController' = STOP \<and> getPstate s p_IdleController' = STOP) \<and>
(getPstate s p_EngineController' \<noteq> p_EngineController's_turnedOff' \<longrightarrow> 
  getPstate s p_CoolingAgentController' \<noteq> STOP \<and> getPstate s p_IdleController' \<noteq> STOP) \<and>
(getPstate s p_IdleController' = p_IdleController's_work' \<longrightarrow> getVarBool s v_ignition' = True) \<and>
(getPstate s p_IdleController' \<noteq> p_IdleController's_work' \<longrightarrow> getVarBool s v_ignition' = False) \<and>
(getPstate s p_CoolingAgentController' = p_CoolingAgentController's_lack' \<longrightarrow> getVarBool s v_sound' = True) \<and>
(getPstate s p_CoolingAgentController' \<noteq> p_CoolingAgentController's_lack' \<longrightarrow> getVarBool s v_sound' = False) \<and>
getPstate s p_EngineController' \<in> 
  {p_EngineController's_turnedOff', p_EngineController's_turningOn', p_EngineController's_turnedOn', p_EngineController's_turningOff'} \<and>
getPstate s p_CoolingAgentController' \<in> {p_CoolingAgentController's_normal', p_CoolingAgentController's_lack', STOP} \<and>
getPstate s p_IdleController' \<in> {p_IdleController's_work', p_IdleController's_idle', STOP} \<and>
getPstate s p_StopEngine' = STOP"

end