theory BaggageCarousel imports VCProving.VCTheory
begin

abbreviation v_startButton' :: variable where "v_startButton' \<equiv> (Suc 0)"
abbreviation v_pSensor' :: variable where "v_pSensor' \<equiv> (Suc (Suc 0))"
abbreviation v_weight' :: variable where "v_weight' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_stuck' :: variable where "v_stuck' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_engine' :: variable where "v_engine' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"

abbreviation p_Carousel' :: process where "p_Carousel' \<equiv> (Suc 0)"

abbreviation p_Carousel's_turnedOff' :: pstate where "p_Carousel's_turnedOff' \<equiv> (Suc (Suc 0))"
abbreviation p_Carousel's_turnedOn' :: pstate where "p_Carousel's_turnedOn' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_DETECTED' :: bool where "v_DETECTED' \<equiv> True"
abbreviation v_NOT_DETECTED' :: bool where "v_NOT_DETECTED' \<equiv> False"
abbreviation v_HIGH' :: bool where "v_HIGH' \<equiv> True"
abbreviation v_LOW' :: bool where "v_LOW' \<equiv> False"
abbreviation v_TURN_ON' :: bool where "v_TURN_ON' \<equiv> True"
abbreviation v_TURN_OFF' :: bool where "v_TURN_OFF' \<equiv> False"
abbreviation v_IDLE_TIMEOUT' :: nat where "v_IDLE_TIMEOUT' \<equiv> 30000"

abbreviation v_IDLE_TIMEOUT'TIMEOUT :: nat where "v_IDLE_TIMEOUT'TIMEOUT \<equiv> 300"

end

