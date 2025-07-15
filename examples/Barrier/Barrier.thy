theory Barrier imports VCProving.VCTheory
begin

abbreviation v_carInFront' :: variable where "v_carInFront' \<equiv> (Suc 0)"
abbreviation v_peCarUnder' :: variable where "v_peCarUnder' \<equiv> (Suc (Suc 0))"
abbreviation v_opened' :: variable where "v_opened' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_closed' :: variable where "v_closed' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_up' :: variable where "v_up' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_down' :: variable where "v_down' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_green' :: variable where "v_green' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_red' :: variable where "v_red' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"

abbreviation p_CarController' :: process where "p_CarController' \<equiv> (Suc 0)"
abbreviation p_Opening' :: process where "p_Opening' \<equiv> (Suc (Suc 0))"

abbreviation p_CarController's_waitingForCarPassing' :: pstate where "p_CarController's_waitingForCarPassing' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_CarController's_waitingForCar' :: pstate where "p_CarController's_waitingForCar' \<equiv> (Suc (Suc 0))"
abbreviation p_Opening's_closing' :: pstate where "p_Opening's_closing' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_Opening's_opening' :: pstate where "p_Opening's_opening' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Opening's_open' :: pstate where "p_Opening's_open' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"

abbreviation v_OPEN_TIME' :: nat where "v_OPEN_TIME' \<equiv> 600000"

abbreviation v_OPEN_TIME'TIMEOUT :: nat where "v_OPEN_TIME'TIMEOUT \<equiv> 6000"

end

