theory CommonExtraInv
  imports WashingMachine
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s p_Washing' = p_Washing's_idle' \<longrightarrow> 
  getVarBool s v_filling' = False \<and> getVarBool s v_drain' = False \<and> getVarBool s v_heater' = False \<and> getVarBool s v_lock' = False \<and>
   getVarBool s v_washing' = False) \<and>
(getPstate s p_Washing' = p_Washing's_locking' \<longrightarrow> 
getVarBool s v_filling' = False \<and> getVarBool s v_drain' = False \<and> getVarBool s v_heater' = False \<and> getVarBool s v_lock' = True \<and>
   getVarBool s v_washing' = False) \<and>
(getPstate s p_Washing' = p_Washing's_waterSupply' \<longrightarrow> 
getVarBool s v_filling' = True \<and> getVarBool s v_drain' = False \<and> getVarBool s v_heater' = False \<and> getVarBool s v_lock' = True \<and>
   getVarBool s v_washing' = False) \<and>
(getPstate s p_Washing' = p_Washing's_wash' \<longrightarrow> 
  getVarBool s v_filling' = False \<and> getVarBool s v_drain' = False \<and> getVarBool s v_lock' = True \<and> getVarBool s v_washing' = True) \<and>
(getPstate s p_Washing' = p_Washing's_wash' \<longrightarrow> ltime s p_Washing' \<le> v_WASHING_TIME'TIMEOUT) \<and>
(getPstate s p_Washing' = p_Washing's_draining' \<longrightarrow> 
  getVarBool s v_filling' = False \<and> getVarBool s v_drain' = True \<and> getVarBool s v_heater' = False \<and> getVarBool s v_lock' = True \<and>
   getVarBool s v_washing' = False) \<and>
(getPstate s p_Washing' \<in> {p_Washing's_idle', p_Washing's_locking'} \<longrightarrow> getPstate s p_Drum' = STOP) \<and>
(getPstate s p_Washing' \<in> {p_Washing's_waterSupply', p_Washing's_wash', p_Washing's_draining'} \<longrightarrow> getPstate s p_Drum' \<noteq> STOP) \<and>
(getPstate s p_Washing' \<in>
   {p_Washing's_idle', p_Washing's_locking', p_Washing's_waterSupply',  p_Washing's_wash', p_Washing's_draining'}) \<and>
(getPstate s p_Drum' = p_Drum's_leftRotation' \<longrightarrow> getVarBool s v_left' = True \<and> getVarBool s v_right' = False) \<and>
(getPstate s p_Drum' = p_Drum's_rightRotation' \<longrightarrow> getVarBool s v_left' = False \<and> getVarBool s v_right' = True) \<and>
(getPstate s p_Drum' \<in> {p_Drum's_leftToRight', p_Drum's_rightToLeft', STOP} \<longrightarrow>
   getVarBool s v_left' = False \<and> getVarBool s v_right' =False) \<and>
(getPstate s p_Drum' \<in> {p_Drum's_leftRotation', p_Drum's_leftToRight', p_Drum's_rightRotation', p_Drum's_rightToLeft', STOP}) \<and>
(getPstate s p_Drum' \<in> {p_Drum's_leftRotation', p_Drum's_rightRotation'} \<longrightarrow> ltime s p_Drum' \<le> v_DIRECTION_CHANGE_PERIOD'TIMEOUT)"

end
  