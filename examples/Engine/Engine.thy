theory Engine imports VCProving.VCTheory
begin

abbreviation v_speed' :: variable where "v_speed' \<equiv> (Suc 0)"
abbreviation v_liquidLevel' :: variable where "v_liquidLevel' \<equiv> (Suc (Suc 0))"
abbreviation v_onOffButton' :: variable where "v_onOffButton' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_Thigh' :: variable where "v_Thigh' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_Tlow' :: variable where "v_Tlow' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_ignition' :: variable where "v_ignition' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_sound' :: variable where "v_sound' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_pump' :: variable where "v_pump' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_valve' :: variable where "v_valve' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"

abbreviation p_Cooling' :: process where "p_Cooling' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_CoolingAgentController' :: process where "p_CoolingAgentController' \<equiv> (Suc (Suc 0))"
abbreviation p_Sound' :: process where "p_Sound' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_EngineController' :: process where "p_EngineController' \<equiv> (Suc 0)"
abbreviation p_StopEngine' :: process where "p_StopEngine' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation p_Cooling's_ctrl' :: pstate where "p_Cooling's_ctrl' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_CoolingAgentController's_normal' :: pstate where "p_CoolingAgentController's_normal' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_CoolingAgentController's_lack' :: pstate where "p_CoolingAgentController's_lack' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Sound's_sound' :: pstate where "p_Sound's_sound' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation p_EngineController's_turningOff' :: pstate where "p_EngineController's_turningOff' \<equiv> (Suc (Suc 0))"
abbreviation p_EngineController's_turnedOff' :: pstate where "p_EngineController's_turnedOff' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_EngineController's_turningOn' :: pstate where "p_EngineController's_turningOn' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_EngineController's_turnedOn' :: pstate where "p_EngineController's_turnedOn' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_StopEngine's_stopEngine' :: pstate where "p_StopEngine's_stopEngine' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"

abbreviation v_EMERGENCY_STOP_TIME' :: nat where "v_EMERGENCY_STOP_TIME' \<equiv> 3000"
abbreviation v_SOUND_TIME' :: nat where "v_SOUND_TIME' \<equiv> 1000"
abbreviation v_WARN_LIQUID_LACK_TIMEOUT' :: nat where "v_WARN_LIQUID_LACK_TIMEOUT' \<equiv> 60000"
abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"
abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_NOT_PRESSED' :: bool where "v_NOT_PRESSED' \<equiv> False"
abbreviation v_HIGH' :: bool where "v_HIGH' \<equiv> True"
abbreviation v_LOW' :: bool where "v_LOW' \<equiv> False"

abbreviation v_EMERGENCY_STOP_TIME'TIMEOUT :: nat where "v_EMERGENCY_STOP_TIME'TIMEOUT \<equiv> 30"
abbreviation v_SOUND_TIME'TIMEOUT :: nat where "v_SOUND_TIME'TIMEOUT \<equiv> 10"
abbreviation v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT :: nat where "v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT \<equiv> 600"

end

