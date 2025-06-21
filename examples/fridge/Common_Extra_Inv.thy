theory Common_Extra_Inv
  imports Fridge
begin

definition common_extra_inv where "common_extra_inv s \<equiv> toEnvP s \<and>
(getPstate s p_FridgeDoorController' \<in> { p_FridgeDoorController's_closed', STOP} \<longrightarrow>
   getVarBool s v_lighting' = False \<and> getVarBool s v_doorSignal' = False \<and> getVarBool s v_fridgeDoor' = v_CLOSED') \<and>
(getPstate s p_FridgeDoorController' = p_FridgeDoorController's_open' \<longrightarrow>
   getVarBool s v_lighting' = True \<and> getVarBool s v_doorSignal' = False \<and> getVarBool s v_fridgeDoor' = v_OPEN') \<and>
(getPstate s p_FridgeDoorController' = p_FridgeDoorController's_longOpen' \<longrightarrow>
   getVarBool s v_lighting' = True \<and> getVarBool s v_doorSignal' = True \<and> getVarBool s v_fridgeDoor' = v_OPEN') \<and>
(getPstate s p_FridgeDoorController' = p_FridgeDoorController's_open' \<longrightarrow>
   ltime s p_FridgeDoorController' \<le> v_OPEN_DOOR_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s p_FridgeDoorController' \<in>
   {p_FridgeDoorController's_closed', p_FridgeDoorController's_open', p_FridgeDoorController's_longOpen', STOP}) \<and>
(getPstate s p_Init' = p_Init's_begin' \<longrightarrow> getPstate s p_FridgeDoorController' = STOP) \<and>
(getPstate s p_Init' = STOP \<longrightarrow> getPstate s p_FridgeDoorController' \<noteq> STOP) \<and>
(getPstate s p_Init' \<in> {p_Init's_begin', STOP})"

end