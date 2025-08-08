theory WaterHeater imports VCProving.VCTheory
begin

abbreviation v_switch' :: variable where "v_switch' \<equiv> (Suc 0)"
abbreviation v_maxLevel' :: variable where "v_maxLevel' \<equiv> (Suc (Suc 0))"
abbreviation v_minLevel' :: variable where "v_minLevel' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_waterPresence' :: variable where "v_waterPresence' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_maxTemp' :: variable where "v_maxTemp' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_minTemp' :: variable where "v_minTemp' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_intake' :: variable where "v_intake' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_heater' :: variable where "v_heater' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"

abbreviation p_Heating' :: process where "p_Heating' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Filling' :: process where "p_Filling' \<equiv> (Suc (Suc 0))"
abbreviation p_Controller' :: process where "p_Controller' \<equiv> (Suc 0)"

abbreviation p_Heating's_turnedOff' :: pstate where "p_Heating's_turnedOff' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_Heating's_noWater' :: pstate where "p_Heating's_noWater' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_Heating's_turnedOn' :: pstate where "p_Heating's_turnedOn' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Filling's_turnedOff' :: pstate where "p_Filling's_turnedOff' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_Filling's_turnedOn' :: pstate where "p_Filling's_turnedOn' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Controller's_turnedOff' :: pstate where "p_Controller's_turnedOff' \<equiv> (Suc (Suc 0))"
abbreviation p_Controller's_turnedOn' :: pstate where "p_Controller's_turnedOn' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation v_TURNED_ON' :: bool where "v_TURNED_ON' \<equiv> True"
abbreviation v_TURNED_OFF' :: bool where "v_TURNED_OFF' \<equiv> False"


end

