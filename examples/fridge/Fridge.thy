theory Fridge imports VCProving.VCTheory
begin

abbreviation v_fridgeTempGreaterMin' :: variable where "v_fridgeTempGreaterMin' \<equiv> (Suc 0)"
abbreviation v_fridgeTempGreaterMax' :: variable where "v_fridgeTempGreaterMax' \<equiv> (Suc (Suc 0))"
abbreviation v_freezerTempGreaterMin' :: variable where "v_freezerTempGreaterMin' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_freezerTempGreaterMax' :: variable where "v_freezerTempGreaterMax' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_fridgeDoor' :: variable where "v_fridgeDoor' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_fridgeCompressor' :: variable where "v_fridgeCompressor' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_freezerCompressor' :: variable where "v_freezerCompressor' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_lighting' :: variable where "v_lighting' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_doorSignal' :: variable where "v_doorSignal' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"

abbreviation p_Init' :: process where "p_Init' \<equiv> (Suc 0)"
abbreviation p_FridgeCompressorController' :: process where "p_FridgeCompressorController' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_FridgeDoorController' :: process where "p_FridgeDoorController' \<equiv> (Suc (Suc 0))"
abbreviation p_FreezerCompressorController' :: process where "p_FreezerCompressorController' \<equiv> (Suc (Suc (Suc (Suc 0))))"

abbreviation p_Init's_begin' :: pstate where "p_Init's_begin' \<equiv> (Suc (Suc 0))"
abbreviation p_FridgeCompressorController's_checkTemp' :: pstate where "p_FridgeCompressorController's_checkTemp' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_FridgeDoorController's_closed' :: pstate where "p_FridgeDoorController's_closed' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_FridgeDoorController's_open' :: pstate where "p_FridgeDoorController's_open' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_FridgeDoorController's_longOpen' :: pstate where "p_FridgeDoorController's_longOpen' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_FreezerCompressorController's_checkTemp' :: pstate where "p_FreezerCompressorController's_checkTemp' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"

abbreviation v_OPEN' :: bool where "v_OPEN' \<equiv> True"
abbreviation v_CLOSED' :: bool where "v_CLOSED' \<equiv> False"
abbreviation v_OPEN_DOOR_TIME_LIMIT' :: nat where "v_OPEN_DOOR_TIME_LIMIT' \<equiv> 30000"

abbreviation v_OPEN_DOOR_TIME_LIMIT'TIMEOUT :: nat where "v_OPEN_DOOR_TIME_LIMIT'TIMEOUT \<equiv> 300"

end

