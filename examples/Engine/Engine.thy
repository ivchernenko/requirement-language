theory Engine imports VCProving.VCTheory
begin

abbreviation v_accelerator' :: variable where "v_accelerator' \<equiv> (Suc 0)"
abbreviation v_liquidLevel' :: variable where "v_liquidLevel' \<equiv> (Suc (Suc 0))"
abbreviation v_onOffButton' :: variable where "v_onOffButton' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_ignition' :: variable where "v_ignition' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_sound' :: variable where "v_sound' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"

abbreviation p_CoolingAgentController' :: process where "p_CoolingAgentController' \<equiv> (Suc (Suc 0))"
abbreviation p_IdleController' :: process where "p_IdleController' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_EngineController' :: process where "p_EngineController' \<equiv> (Suc 0)"
abbreviation p_StopEngine' :: process where "p_StopEngine' \<equiv> (Suc (Suc (Suc (Suc 0))))"

abbreviation p_CoolingAgentController's_normal' :: pstate where "p_CoolingAgentController's_normal' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_CoolingAgentController's_lack' :: pstate where "p_CoolingAgentController's_lack' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_IdleController's_idle' :: pstate where "p_IdleController's_idle' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_IdleController's_work' :: pstate where "p_IdleController's_work' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_EngineController's_turnedOff' :: pstate where "p_EngineController's_turnedOff' \<equiv> (Suc (Suc 0))"
abbreviation p_EngineController's_turningOn' :: pstate where "p_EngineController's_turningOn' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_EngineController's_turningOff' :: pstate where "p_EngineController's_turningOff' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_EngineController's_turnedOn' :: pstate where "p_EngineController's_turnedOn' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_StopEngine's_stopEngine' :: pstate where "p_StopEngine's_stopEngine' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"

abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"
abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_NOT_PRESSED' :: bool where "v_NOT_PRESSED' \<equiv> False"
abbreviation v_HIGH' :: bool where "v_HIGH' \<equiv> True"
abbreviation v_LOW' :: bool where "v_LOW' \<equiv> False"
abbreviation v_IDLE_TIMEOUT' :: nat where "v_IDLE_TIMEOUT' \<equiv> 30000"
abbreviation v_WARN_LIQUID_LACK_TIMEOUT' :: nat where "v_WARN_LIQUID_LACK_TIMEOUT' \<equiv> 60000"

abbreviation v_IDLE_TIMEOUT'TIMEOUT :: nat where "v_IDLE_TIMEOUT'TIMEOUT \<equiv> 300"
abbreviation v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT :: nat where "v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT \<equiv> 600"

end

