theory Tram imports VCProving.VCTheory
begin

abbreviation v_openCloseButton' :: variable where "v_openCloseButton' \<equiv> (Suc 0)"
abbreviation v_antiClamp' :: variable where "v_antiClamp' \<equiv> (Suc (Suc 0))"
abbreviation v_opened' :: variable where "v_opened' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_closed' :: variable where "v_closed' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_normalButton' :: variable where "v_normalButton' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_requestStopButton' :: variable where "v_requestStopButton' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_open' :: variable where "v_open' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_close' :: variable where "v_close' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_emergencyMode' :: variable where "v_emergencyMode' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_sound' :: variable where "v_sound' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation v_attempts' :: variable where "v_attempts' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"

abbreviation p_RequestStopController' :: process where "p_RequestStopController' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Init' :: process where "p_Init' \<equiv> (Suc 0)"
abbreviation p_Closing' :: process where "p_Closing' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_AutoDoors' :: process where "p_AutoDoors' \<equiv> (Suc (Suc 0))"

abbreviation p_RequestStopController's_waiting' :: pstate where "p_RequestStopController's_waiting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation p_RequestStopController's_signal' :: pstate where "p_RequestStopController's_signal' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))"
abbreviation p_Init's_init' :: pstate where "p_Init's_init' \<equiv> (Suc (Suc 0))"
abbreviation p_Closing's_closing' :: pstate where "p_Closing's_closing' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_Closing's_opening' :: pstate where "p_Closing's_opening' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation p_AutoDoors's_closingDelay' :: pstate where "p_AutoDoors's_closingDelay' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_AutoDoors's_closing' :: pstate where "p_AutoDoors's_closing' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_AutoDoors's_closed' :: pstate where "p_AutoDoors's_closed' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_AutoDoors's_emergencyMode' :: pstate where "p_AutoDoors's_emergencyMode' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_AutoDoors's_opening' :: pstate where "p_AutoDoors's_opening' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_AutoDoors's_open' :: pstate where "p_AutoDoors's_open' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"

abbreviation v_CLOSING_ATTEMPTS_INTERVAL' :: nat where "v_CLOSING_ATTEMPTS_INTERVAL' \<equiv> 120000"
abbreviation v_REQ_STOP_SIGNAL_DURATION' :: nat where "v_REQ_STOP_SIGNAL_DURATION' \<equiv> 1000"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_DETECTED' :: bool where "v_DETECTED' \<equiv> True"
abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"
abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"

abbreviation v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT :: nat where "v_CLOSING_ATTEMPTS_INTERVAL'TIMEOUT \<equiv> 1200"
abbreviation v_REQ_STOP_SIGNAL_DURATION'TIMEOUT :: nat where "v_REQ_STOP_SIGNAL_DURATION'TIMEOUT \<equiv> 10"

end

