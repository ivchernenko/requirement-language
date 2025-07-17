theory CommonExtraInv
  imports VendingMachine
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s p_Controller' = p_Controller's_waiting' \<longrightarrow>
 getVarInt s v_mode' = v_IDLE' \<and> getVarBool s v_lockChanger' = False \<and> getVarInt s v_credit' \<le> 0) \<and>
(getPstate s p_Controller' = p_Controller's_choice' \<longrightarrow> getVarInt s v_mode' = v_CHOICE' \<and> getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Controller' = p_Controller's_payOut' \<longrightarrow> getVarInt s v_mode' = v_PAYING_OUT' \<and> getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Controller' \<noteq> p_Controller's_sale' \<longrightarrow> getPstate s p_Sale1' = STOP \<and> getPstate s p_Sale2' = STOP) \<and>
(getPstate s p_Controller' \<noteq> p_Controller's_payOut' \<longrightarrow> getVarBool s v_dispense' = False \<and> getVarInt s v_change' = 0) \<and>
(getPstate s p_Controller' \<in> {p_Controller's_waiting', p_Controller's_choice', p_Controller's_sale', p_Controller's_payOut'}) \<and>
(getPstate s p_Sale1' = p_Sale1's_addMoney' \<longrightarrow> getVarInt s v_mode' = v_ADD_MONEY' \<and> getVarBool s v_lockChanger' = False \<and>
\<not> (getVarBool s v_cancel' \<or> getVarInt s v_credit' \<ge> v_PRICE1')) \<and>
(getPstate s p_Sale1' = p_Sale1's_delivery' \<longrightarrow>
 getVarInt s v_mode' = v_DELIVERY' \<and> getVarInt s v_credit' \<ge> v_PRICE1' \<and> getVarBool s v_product1' = True \<and>
 getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Sale1' = p_Sale1's_delivery' \<longrightarrow> ltime s p_Sale1' \<le> v_DELIVERY_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s p_Sale1' \<noteq> p_Sale1's_delivery' \<longrightarrow> getVarBool s v_product1' = False)  \<and>
(getPstate s p_Sale1' = ERROR \<longrightarrow> getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Sale1' \<in> {p_Sale1's_addMoney', p_Sale1's_delivery', STOP, ERROR}) \<and>
(getPstate s p_Sale2' = p_Sale2's_addMoney' \<longrightarrow> getVarInt s v_mode' = v_ADD_MONEY' \<and> getVarBool s v_lockChanger' = False \<and>
\<not> (getVarBool s v_cancel' \<or> getVarInt s v_credit' \<ge> v_PRICE2')) \<and>
(getPstate s p_Sale2' =p_Sale2's_delivery' \<longrightarrow>
 getVarInt s v_mode' = v_DELIVERY' \<and> getVarInt s v_credit' \<ge> v_PRICE2' \<and> getVarBool s v_product2' = True \<and>
getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Sale2' = p_Sale2's_delivery' \<longrightarrow> ltime s p_Sale2' \<le> v_DELIVERY_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s p_Sale2' \<noteq> p_Sale2's_delivery' \<longrightarrow> getVarBool s v_product2' = False)  \<and>
(getPstate s p_Sale2' = ERROR \<longrightarrow> getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Sale2' \<in> {p_Sale2's_addMoney', p_Sale2's_delivery', STOP, ERROR}) \<and>
(getPstate s p_Controller' = p_Controller's_sale' \<and> getPstate s p_Sale1' = STOP \<and> getPstate s p_Sale2' = STOP \<longrightarrow>
getVarBool s v_lockChanger' = True) \<and>
(getPstate s p_Sale1' \<noteq> STOP \<longrightarrow> getPstate s p_Sale2' = STOP) \<and>
(getPstate s p_Sale2' \<noteq> STOP \<longrightarrow> getPstate s p_Sale1' = STOP) \<and>
(getPstate s p_Sale1' = ERROR \<longrightarrow> getVarInt s v_mode' = v_DELIVERY') \<and>
(getPstate s p_Sale2' = ERROR \<longrightarrow> getVarInt s v_mode' = v_DELIVERY')"

end