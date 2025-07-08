theory MassageChair imports VCProving.VCTheory
begin

abbreviation v_onOff' :: variable where "v_onOff' \<equiv> (Suc 0)"
abbreviation v_startButton' :: variable where "v_startButton' \<equiv> (Suc (Suc 0))"
abbreviation v_rollerButton' :: variable where "v_rollerButton' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_vibrationButton' :: variable where "v_vibrationButton' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_buttonUp' :: variable where "v_buttonUp' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_buttonDown' :: variable where "v_buttonDown' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_upper' :: variable where "v_upper' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_lower' :: variable where "v_lower' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_roller' :: variable where "v_roller' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_vibration' :: variable where "v_vibration' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation v_up' :: variable where "v_up' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation v_down' :: variable where "v_down' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))"
abbreviation v_enabled' :: variable where "v_enabled' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))))"

abbreviation p_Vibration' :: process where "p_Vibration' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Roller' :: process where "p_Roller' \<equiv> (Suc (Suc 0))"
abbreviation p_BackMovement' :: process where "p_BackMovement' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Controller' :: process where "p_Controller' \<equiv> (Suc 0)"

abbreviation p_Vibration's_waiting' :: pstate where "p_Vibration's_waiting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_Vibration's_massaging' :: pstate where "p_Vibration's_massaging' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation p_Roller's_waiting' :: pstate where "p_Roller's_waiting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Roller's_massaging' :: pstate where "p_Roller's_massaging' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_BackMovement's_ctrl' :: pstate where "p_BackMovement's_ctrl' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation p_Controller's_turnedOff' :: pstate where "p_Controller's_turnedOff' \<equiv> (Suc (Suc 0))"
abbreviation p_Controller's_turningOn' :: pstate where "p_Controller's_turningOn' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Controller's_turningOff' :: pstate where "p_Controller's_turningOff' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_Controller's_turnedOn' :: pstate where "p_Controller's_turnedOn' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Controller's_backLifting' :: pstate where "p_Controller's_backLifting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"

abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"
abbreviation v_ROLLER_MASSAGE_TIME' :: nat where "v_ROLLER_MASSAGE_TIME' \<equiv> 600000"
abbreviation v_VIBRATION_MASSAGE_TIME' :: nat where "v_VIBRATION_MASSAGE_TIME' \<equiv> 1800000"
abbreviation v_ON_OFF_TIME' :: nat where "v_ON_OFF_TIME' \<equiv> 1000"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"

abbreviation v_ROLLER_MASSAGE_TIME'TIMEOUT :: nat where "v_ROLLER_MASSAGE_TIME'TIMEOUT \<equiv> 6000"
abbreviation v_VIBRATION_MASSAGE_TIME'TIMEOUT :: nat where "v_VIBRATION_MASSAGE_TIME'TIMEOUT \<equiv> 18000"
abbreviation v_ON_OFF_TIME'TIMEOUT :: nat where "v_ON_OFF_TIME'TIMEOUT \<equiv> 10"

end

