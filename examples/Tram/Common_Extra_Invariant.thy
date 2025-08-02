theory Common_Extra_Invariant
  imports Tram
begin

definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_AutoDoors' \<notin> {p_AutoDoors's_closing', p_AutoDoors's_closingDelay'} \<longrightarrow> getPstate s p_Closing' = STOP) \<and>
  (getPstate s p_AutoDoors' = p_AutoDoors's_closed' \<longrightarrow> getVarBool s v_open' = False) \<and>
(getPstate s p_AutoDoors' = p_AutoDoors's_opening' \<longrightarrow> getVarBool s v_open' = True) \<and>
(getPstate s p_AutoDoors' = p_AutoDoors's_open' \<longrightarrow> getVarBool s v_open' = False \<and>  getPstate s p_RequestStopController' = STOP) \<and>
(getPstate s p_AutoDoors' \<notin> {p_AutoDoors's_open', STOP} \<longrightarrow> getPstate s p_RequestStopController'\<noteq> STOP) \<and>
(getPstate s p_AutoDoors' = p_AutoDoors's_closingDelay' \<longrightarrow> 
  getPstate s p_Closing' = ERROR \<and> getVarBool s v_open' = False \<and> 0 < getVarInt s v_attempts' \<and> getVarInt s v_attempts' < 4) \<and>
(getPstate s  p_AutoDoors' = p_AutoDoors's_emergencyMode' \<longrightarrow> getVarBool s v_open' = False \<and> getVarInt s v_attempts' = 4) \<and>
(getPstate s p_Closing' = p_Closing's_closing' \<longrightarrow> getVarBool s v_close' = True \<and> getVarBool s v_open' = False) \<and> 
(getPstate s p_Closing' \<noteq> p_Closing's_closing' \<longrightarrow> getVarBool s v_close' = False) \<and>
(getPstate s p_RequestStopController' = p_RequestStopController's_signal' \<longrightarrow> getVarBool s v_sound' = v_TURN_ON') \<and>
(getPstate s p_RequestStopController' \<noteq> p_RequestStopController's_signal' \<longrightarrow> getVarBool s v_sound' = v_TURN_OFF')\<and>
(getPstate s p_RequestStopController' = p_RequestStopController's_signal' \<longrightarrow> ltime s p_RequestStopController' \<le> v_REQ_STOP_SIGNAL_DURATION') \<and>
(getPstate s p_AutoDoors' = p_AutoDoors's_closingDelay' \<longrightarrow> ltime s  p_AutoDoors' \<le> v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT) \<and>
(getPstate s p_Closing' \<noteq> STOP \<longrightarrow> 0 \<le> getVarInt s v_attempts' \<and> getVarInt s v_attempts' < 4) \<and>
getVarInt s v_attempts' \<le> 4 \<and>
getPstate s p_AutoDoors' \<in> 
  {p_AutoDoors's_closed', p_AutoDoors's_opening', p_AutoDoors's_open', p_AutoDoors's_closing', p_AutoDoors's_closingDelay', p_AutoDoors's_emergencyMode'
  , STOP} \<and>
getPstate s p_Closing' \<in> {p_Closing's_closing', p_Closing's_opening', STOP} \<and>
getPstate s p_RequestStopController' \<in> {p_RequestStopController's_waiting', p_RequestStopController's_signal', STOP} \<and>
(getPstate s p_Init' = p_Init's_init' \<longrightarrow> getPstate s p_AutoDoors' = STOP \<and> getPstate s p_RequestStopController' = STOP) \<and>
(getPstate s p_Init' = STOP \<longrightarrow> getPstate s p_AutoDoors' \<noteq> STOP) \<and>
getPstate s p_Init' \<in> {p_Init's_init', STOP} \<and>
(getPstate s p_AutoDoors' = STOP \<longrightarrow> getVarBool s v_open' = False \<and> getVarInt s v_attempts' = 0)"

end