theory SmartLighting imports VCProving.VCTheory
begin

abbreviation v_motion' :: variable where "v_motion' \<equiv> (Suc 0)"
abbreviation v_light' :: variable where "v_light' \<equiv> (Suc (Suc 0))"
abbreviation v_dayLight' :: variable where "v_dayLight' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_dimLight' :: variable where "v_dimLight' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_timeOfDay' :: variable where "v_timeOfDay' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_turnedOn' :: variable where "v_turnedOn' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))))))"

abbreviation p_Motion' :: process where "p_Motion' \<equiv> (Suc (Suc 0))"
abbreviation p_Init' :: process where "p_Init' \<equiv> (Suc 0)"
abbreviation p_Lighting' :: process where "p_Lighting' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation p_Motion's_noMovement' :: pstate where "p_Motion's_noMovement' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Motion's_movement' :: pstate where "p_Motion's_movement' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Init's_init' :: pstate where "p_Init's_init' \<equiv> (Suc (Suc 0))"
abbreviation p_Lighting's_earlyMorning' :: pstate where "p_Lighting's_earlyMorning' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_Lighting's_morningLighting' :: pstate where "p_Lighting's_morningLighting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Lighting's_morningOrDay' :: pstate where "p_Lighting's_morningOrDay' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_Lighting's_night' :: pstate where "p_Lighting's_night' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_Lighting's_evening' :: pstate where "p_Lighting's_evening' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"

abbreviation v_TURNED_ON' :: bool where "v_TURNED_ON' \<equiv> True"
abbreviation v_TURNED_OFF' :: bool where "v_TURNED_OFF' \<equiv> False"
abbreviation v_LOW' :: bool where "v_LOW' \<equiv> False"
abbreviation v_NIGHT' :: int where "v_NIGHT' \<equiv> 0"
abbreviation v_EARLY_MORNING' :: int where "v_EARLY_MORNING' \<equiv> 1"
abbreviation v_MORNING_LIGHTING' :: int where "v_MORNING_LIGHTING' \<equiv> 2"
abbreviation v_DAY' :: int where "v_DAY' \<equiv> 3"
abbreviation v_EVENING' :: int where "v_EVENING' \<equiv> 4"
abbreviation v_LIGHTING_TIME' :: nat where "v_LIGHTING_TIME' \<equiv> 300000"
abbreviation v_MORNING_LIGHTING_TIME' :: nat where "v_MORNING_LIGHTING_TIME' \<equiv> 1800000"

abbreviation v_LIGHTING_TIME'TIMEOUT :: nat where "v_LIGHTING_TIME'TIMEOUT \<equiv> 3000"
abbreviation v_MORNING_LIGHTING_TIME'TIMEOUT :: nat where "v_MORNING_LIGHTING_TIME'TIMEOUT \<equiv> 18000"

end

