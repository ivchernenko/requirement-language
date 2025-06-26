theory WashingMachine imports VCProving.VCTheory
begin

abbreviation v_startButton' :: variable where "v_startButton' \<equiv> (Suc 0)"
abbreviation v_locked' :: variable where "v_locked' \<equiv> (Suc (Suc 0))"
abbreviation v_waterLevel' :: variable where "v_waterLevel' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_waterPresence' :: variable where "v_waterPresence' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_temp' :: variable where "v_temp' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_freq' :: variable where "v_freq' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_left' :: variable where "v_left' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_right' :: variable where "v_right' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_filling' :: variable where "v_filling' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_drain' :: variable where "v_drain' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation v_heater' :: variable where "v_heater' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation v_lock' :: variable where "v_lock' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))"
abbreviation v_washing' :: variable where "v_washing' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))))"

abbreviation p_Drum' :: process where "p_Drum' \<equiv> (Suc (Suc 0))"
abbreviation p_Washing' :: process where "p_Washing' \<equiv> (Suc 0)"

abbreviation p_Drum's_leftRotation' :: pstate where "p_Drum's_leftRotation' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Drum's_leftToRight' :: pstate where "p_Drum's_leftToRight' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_Drum's_rightToLeft' :: pstate where "p_Drum's_rightToLeft' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation p_Drum's_rightRotation' :: pstate where "p_Drum's_rightRotation' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_Washing's_idle' :: pstate where "p_Washing's_idle' \<equiv> (Suc (Suc 0))"
abbreviation p_Washing's_locking' :: pstate where "p_Washing's_locking' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Washing's_draining' :: pstate where "p_Washing's_draining' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_Washing's_wash' :: pstate where "p_Washing's_wash' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_Washing's_waterSupply' :: pstate where "p_Washing's_waterSupply' \<equiv> (Suc (Suc (Suc (Suc 0))))"

abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"
abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"
abbreviation v_WASHING_TIME' :: nat where "v_WASHING_TIME' \<equiv> 1800000"
abbreviation v_DIRECTION_CHANGE_PERIOD' :: nat where "v_DIRECTION_CHANGE_PERIOD' \<equiv> 60000"
abbreviation v_MIN_TEMP' :: int where "v_MIN_TEMP' \<equiv> 30"
abbreviation v_MAX_TEMP' :: int where "v_MAX_TEMP' \<equiv> 40"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_SUFFICIENT' :: bool where "v_SUFFICIENT' \<equiv> True"

abbreviation v_WASHING_TIME'TIMEOUT :: nat where "v_WASHING_TIME'TIMEOUT \<equiv> 18000"
abbreviation v_DIRECTION_CHANGE_PERIOD'TIMEOUT :: nat where "v_DIRECTION_CHANGE_PERIOD'TIMEOUT \<equiv> 600"

end

