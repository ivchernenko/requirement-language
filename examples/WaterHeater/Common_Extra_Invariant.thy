theory Common_Extra_Invariant
  imports WaterHeater
begin

definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_Controller' = p_Controller's_turnedOff' \<longrightarrow> getPstate s p_Filling' = STOP \<and> getPstate s p_Heating' = STOP) \<and>
(getPstate s p_Controller' = p_Controller's_turnedOn' \<longrightarrow> getPstate s p_Filling' \<noteq> STOP \<and> getPstate s p_Heating' \<noteq> STOP) \<and>
(getPstate s p_Filling' = p_Filling's_turnedOn' \<longrightarrow> getVarBool s v_intake' = True) \<and>
(getPstate s p_Filling' \<noteq> p_Filling's_turnedOn' \<longrightarrow> getVarBool s v_intake' = False) \<and>
(getPstate s p_Heating' = p_Heating's_turnedOn' \<longrightarrow> getVarBool s v_heater' = True) \<and>
(getPstate s p_Heating' \<noteq> p_Heating's_turnedOn' \<longrightarrow> getVarBool s v_heater' = False) \<and>
getPstate s p_Controller'\<in> {p_Controller's_turnedOff', p_Controller's_turnedOn'} \<and>
getPstate s p_Filling' \<in> {p_Filling's_turnedOff', p_Filling's_turnedOn', STOP} \<and>
getPstate s p_Heating' \<in> {p_Heating's_noWater', p_Heating's_turnedOff', p_Heating's_turnedOn', STOP}"

end
