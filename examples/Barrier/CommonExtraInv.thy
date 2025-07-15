theory CommonExtraInv
  imports Barrier
begin

definition commonExtraInv where  "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s p_Opening' = p_Opening's_open' \<longrightarrow> getVarBool s v_green' = True \<and> getVarBool s v_red' = False \<and> getVarBool s v_up' = False \<and>
   getVarBool s v_down' = False) \<and>
(getPstate s p_Opening' = p_Opening's_closing' \<longrightarrow> getVarBool s v_green' = False \<and> getVarBool s v_red' = True \<and> getVarBool s v_up' = False \<and>
   getVarBool s v_down' = True) \<and>
(getPstate s p_Opening' = STOP \<longrightarrow> getVarBool s v_green' = False \<and> getVarBool s v_up' = False \<and> getVarBool s v_down' = False) \<and>
(getPstate s p_Opening' = p_Opening's_open' \<longrightarrow> ltime s p_Opening' \<le> v_OPEN_TIME'TIMEOUT) \<and>
(getPstate s p_CarController' \<in> {p_CarController's_waitingForCar', p_CarController's_waitingForCarPassing'}) \<and>
(getPstate s p_Opening' \<in> {p_Opening's_opening', p_Opening's_open', p_Opening's_closing', STOP}) \<and>
(getPstate s p_CarController' = p_CarController's_waitingForCar' \<longrightarrow> getVarBool s v_carInFront' = False) \<and>
(getPstate s p_CarController' = p_CarController's_waitingForCarPassing' \<longrightarrow> getVarBool s v_carInFront' = True)"

end