theory CommonExtraInv
  imports MassageChair
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s p_Controller' \<in> {p_Controller's_turnedOn', p_Controller's_turningOff'} \<longrightarrow>
   getVarBool s v_enabled' = True \<and> getPstate s p_BackMovement' = p_BackMovement's_ctrl') \<and>
(getPstate s p_Controller' \<in> {p_Controller's_turnedOff', p_Controller's_turningOn', p_Controller's_backLifting'} \<longrightarrow> 
  getVarBool s v_enabled' = False \<and> getPstate s p_Roller' = STOP \<and> getPstate s p_Vibration' = STOP \<and>
   getPstate s p_BackMovement' = STOP) \<and>
(getPstate s p_Roller'\<noteq> p_Roller's_massaging' \<longrightarrow> getVarBool s v_roller' = False) \<and>
(getPstate s p_Roller' = p_Roller's_massaging' \<longrightarrow> getVarBool s v_roller' = True) \<and>
(getPstate s p_Vibration' \<noteq> p_Vibration's_massaging' \<longrightarrow> getVarBool s v_vibration' = False) \<and>
(getPstate s p_Vibration' = p_Vibration's_massaging' \<longrightarrow> getVarBool s v_vibration' = True) \<and>
(getPstate s p_Roller' = p_Roller's_massaging' \<longrightarrow> ltime s p_Roller' \<le> v_ROLLER_MASSAGE_TIME'TIMEOUT) \<and>
(getPstate s p_Vibration' = p_Vibration's_massaging' \<longrightarrow> ltime s p_Vibration' \<le> v_VIBRATION_MASSAGE_TIME'TIMEOUT) \<and>
(getPstate s p_Roller' \<in> {p_Roller's_waiting', p_Roller's_massaging', STOP}) \<and>
(getPstate s p_Vibration' \<in> {p_Vibration's_waiting', p_Vibration's_massaging', STOP}) \<and>
(getPstate s p_Controller' = p_Controller's_turnedOn' \<longrightarrow> ltime s p_Controller' \<le> v_ON_OFF_TIME'TIMEOUT)"

end