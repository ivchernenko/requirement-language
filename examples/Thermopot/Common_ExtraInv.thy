theory Common_ExtraInv
  imports Thermopot
begin

definition common_extraInv where "common_extraInv s \<equiv> toEnvP s \<and>
(getPstate s p_HeaterController' \<in> {p_HeaterController's_begin', STOP} \<longrightarrow>
   getVarBool s v_boilingMode' = False \<and> getVarBool s v_maintainingMode' = False \<and> getVarBool s v_heater' = False) \<and>
(getPstate s p_HeaterController'  = p_HeaterController's_heating' \<longrightarrow>
   getVarBool s v_boilingMode' = True \<and> getVarBool s v_maintainingMode' = False) \<and>
(getPstate s p_HeaterController'= p_HeaterController's_maintaining' \<longrightarrow>
   getVarBool s v_boilingMode' = False \<and> getVarBool s v_maintainingMode' = True) \<and>
(getPstate s p_HeaterController' \<in>
   {p_HeaterController's_begin', p_HeaterController's_heating', p_HeaterController's_maintaining', STOP}) \<and>
(getPstate s p_TempSelection' \<in> {p_TempSelection's_tempSelection', STOP}) \<and>
(getPstate s p_Init' = p_Init's_begin' \<longrightarrow> getPstate s p_TempSelection' = STOP \<and> getPstate s p_HeaterController' = STOP) \<and>
(getPstate s p_Init' = STOP \<longrightarrow>
   getPstate s p_TempSelection' = p_TempSelection's_tempSelection' \<and> getPstate s p_HeaterController' \<noteq> STOP) \<and>
(getPstate s p_Init' \<in> {p_Init's_begin', STOP})"

end