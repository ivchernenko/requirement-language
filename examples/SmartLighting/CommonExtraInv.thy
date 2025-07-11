theory CommonExtraInv
  imports SmartLighting
begin

definition commonExtraInv where "commonExtraInv s== toEnvP s \<and>
(getPstate s p_Motion' = p_Motion's_noMovement' \<longrightarrow> getVarBool s v_turnedOn' = False) \<and>
(getPstate s p_Motion' = p_Motion's_movement' \<longrightarrow> getVarBool s v_turnedOn' = True) \<and>
(getPstate s p_Motion' = STOP \<longrightarrow> getVarBool s v_turnedOn' = False) \<and>
(getPstate s p_Motion' = p_Motion's_movement' \<longrightarrow> ltime s p_Motion' \<le> v_LIGHTING_TIME'TIMEOUT) \<and>
getPstate s p_Motion' \<in> {p_Motion's_noMovement', p_Motion's_movement', STOP} \<and>
(getPstate s p_Lighting' = p_Lighting's_night' \<longrightarrow> getVarBool s v_dayLight' = False \<and> getVarBool s v_dimLight' = False \<and>
   getVarInt s v_timeOfDay' = v_NIGHT') \<and>
(getPstate s p_Lighting' = p_Lighting's_night' \<longrightarrow> getPstate s p_Motion' = STOP) \<and>
(getPstate s p_Lighting' \<notin> {p_Lighting's_night', STOP} \<longrightarrow> getPstate s p_Motion' \<noteq> STOP) \<and>
(getPstate s p_Lighting' = p_Lighting's_earlyMorning' \<longrightarrow> getVarBool s v_dayLight' = False \<and> getVarInt s v_timeOfDay' = v_EARLY_MORNING') \<and>
(getPstate s p_Lighting' = p_Lighting's_morningLighting' \<longrightarrow> getVarBool s v_dimLight' = True \<and> getVarBool s v_dayLight' = False \<and>
   getVarInt s v_timeOfDay' = v_MORNING_LIGHTING') \<and>
(getPstate s p_Lighting' = p_Lighting's_morningOrDay' \<longrightarrow> getVarInt s v_timeOfDay' = v_DAY') \<and>
(getPstate s p_Lighting' = p_Lighting's_evening' \<longrightarrow> getVarInt s v_timeOfDay' = v_EVENING') \<and>
(getPstate s p_Lighting' = p_Lighting's_morningLighting' \<longrightarrow> ltime s p_Lighting' \<le> v_MORNING_LIGHTING_TIME'TIMEOUT) \<and>
(getPstate s p_Lighting' \<in> {p_Lighting's_night', p_Lighting's_earlyMorning', p_Lighting's_morningLighting', p_Lighting's_morningOrDay', 
  p_Lighting's_evening', STOP}) \<and>
(getPstate s p_Init' = p_Init's_init' \<longrightarrow> getPstate s p_Motion' = STOP \<and> getPstate s p_Lighting' = STOP) \<and>
(getPstate s p_Init' = STOP \<longrightarrow>  getPstate s p_Lighting' \<noteq> STOP)"




end