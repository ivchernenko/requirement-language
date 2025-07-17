theory VendingMachine imports VCProving.VCTheory
begin

abbreviation v_button1' :: variable where "v_button1' \<equiv> (Suc 0)"
abbreviation v_button2' :: variable where "v_button2' \<equiv> (Suc (Suc 0))"
abbreviation v_deposited' :: variable where "v_deposited' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation v_given1' :: variable where "v_given1' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation v_given2' :: variable where "v_given2' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation v_paidOut' :: variable where "v_paidOut' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation v_cancel' :: variable where "v_cancel' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation v_product1' :: variable where "v_product1' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation v_product2' :: variable where "v_product2' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation v_lockChanger' :: variable where "v_lockChanger' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))"
abbreviation v_change' :: variable where "v_change' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))"
abbreviation v_mode' :: variable where "v_mode' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))"
abbreviation v_credit' :: variable where "v_credit' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))))))"
abbreviation v_dispense' :: variable where "v_dispense' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))))))))"

abbreviation p_Sale2' :: process where "p_Sale2' \<equiv> (Suc (Suc (Suc 0)))"
abbreviation p_Sale1' :: process where "p_Sale1' \<equiv> (Suc (Suc 0))"
abbreviation p_Controller' :: process where "p_Controller' \<equiv> (Suc 0)"

abbreviation p_Sale2's_delivery' :: pstate where "p_Sale2's_delivery' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))))"
abbreviation p_Sale2's_addMoney' :: pstate where "p_Sale2's_addMoney' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0))))))))"
abbreviation p_Sale1's_delivery' :: pstate where "p_Sale1's_delivery' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc (Suc 0)))))))"
abbreviation p_Sale1's_addMoney' :: pstate where "p_Sale1's_addMoney' \<equiv> (Suc (Suc (Suc (Suc (Suc (Suc 0))))))"
abbreviation p_Controller's_sale' :: pstate where "p_Controller's_sale' \<equiv> (Suc (Suc (Suc (Suc 0))))"
abbreviation p_Controller's_waiting' :: pstate where "p_Controller's_waiting' \<equiv> (Suc (Suc 0))"
abbreviation p_Controller's_payOut' :: pstate where "p_Controller's_payOut' \<equiv> (Suc (Suc (Suc (Suc (Suc 0)))))"
abbreviation p_Controller's_choice' :: pstate where "p_Controller's_choice' \<equiv> (Suc (Suc (Suc 0)))"

abbreviation v_IDLE' :: int where "v_IDLE' \<equiv> 0"
abbreviation v_CHOICE' :: int where "v_CHOICE' \<equiv> 1"
abbreviation v_ADD_MONEY' :: int where "v_ADD_MONEY' \<equiv> 2"
abbreviation v_DELIVERY' :: int where "v_DELIVERY' \<equiv> 3"
abbreviation v_PAYING_OUT' :: int where "v_PAYING_OUT' \<equiv> 4"
abbreviation v_PRICE1' :: int where "v_PRICE1' \<equiv> 10"
abbreviation v_PRICE2' :: int where "v_PRICE2' \<equiv> 50"
abbreviation v_DELIVERY_TIME_LIMIT' :: nat where "v_DELIVERY_TIME_LIMIT' \<equiv> 3000"
abbreviation v_PRESSED' :: bool where "v_PRESSED' \<equiv> True"

abbreviation v_DELIVERY_TIME_LIMIT'TIMEOUT :: nat where "v_DELIVERY_TIME_LIMIT'TIMEOUT \<equiv> 30"

end

