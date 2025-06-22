theory Thermopot imports VCProving.VCTheory
begin

abbreviation v_temperature' :: variable where "v_temperature' \<equiv> (Suc 0)"
abbreviation v_button1' :: variable where "v_button1' \<equiv> (Suc (Suc 0))"
abbreviation v_button2' :: variable where "v_button2' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_button3' :: variable where "v_button3' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_boilingButton' :: variable where "v_boilingButton' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_heater' :: variable where "v_heater' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_lid' :: variable where "v_lid' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_selectedTemp' :: variable where "v_selectedTemp' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_boilingMode' :: variable where "v_boilingMode' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_maintainingMode' :: variable where "v_maintainingMode' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"

abbreviation p_Init' :: process where "p_Init' \<equiv> (Suc 0)"
abbreviation p_HeaterController' :: process where "p_HeaterController' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_TempSelection' :: process where "p_TempSelection' \<equiv> (Suc (Suc 0))"

abbreviation p_Init's_begin' :: pstate where "p_Init's_begin' \<equiv> (Suc (Suc 0))"
abbreviation p_HeaterController's_heating' :: pstate where "p_HeaterController's_heating' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_HeaterController's_begin' :: pstate where "p_HeaterController's_begin' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_HeaterController's_maintaining' :: pstate where "p_HeaterController's_maintaining' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_TempSelection's_tempSelection' :: pstate where "p_TempSelection's_tempSelection' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation v_TEMP2' :: int where "v_TEMP2' \<equiv> 85"
abbreviation v_TEMP3' :: int where "v_TEMP3' \<equiv> 60"
abbreviation v_LOCKED' :: bool where "v_LOCKED' \<equiv> True"
abbreviation v_UNLOCKED' :: bool where "v_UNLOCKED' \<equiv> False"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"
abbreviation v_BOILING_POINT' :: int where "v_BOILING_POINT' \<equiv> 100"
abbreviation v_TEMP1' :: int where "v_TEMP1' \<equiv> 98"


end

