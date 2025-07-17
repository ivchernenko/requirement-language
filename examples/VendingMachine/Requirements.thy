theory Requirements
  imports VendingMachine VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv> 
P3_4_part (\<lambda> s1. getVarInt s1 v_mode'= v_IDLE') (\<lambda> s2. getVarInt s2 v_mode' = v_CHOICE') (\<lambda> s3. getVarBool s3 v_product1' = False)
 (\<lambda> s4. getVarBool s4 v_button1' = True) s"

definition R2 where "R2 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_product1' = False) (\<lambda> s2. getVarInt s2 v_credit' < v_PRICE1')
 (\<lambda> s2. getVarBool s2 v_product1' = False) s"

definition R3 where "R3 s \<equiv> 
P3_4_part (\<lambda> s1. getVarInt s1 v_mode' = v_CHOICE')
 (\<lambda> s2. getVarBool s2 v_cancel' = False \<and> getVarBool s2 v_button1' = v_PRESSED' \<and> getVarInt s2 v_credit' < v_PRICE1')
(\<lambda> s3. getVarBool s3 v_lockChanger' = False \<and> getVarInt s3 v_mode' = v_ADD_MONEY')
 (\<lambda> s4. getVarBool s4 v_cancel' = True \<or> getVarInt s4 v_credit' \<ge> v_PRICE1') s"

definition R4 where "R4 s \<equiv> 
P1_2_part 2 (\<lambda> s1. getVarBool s1 v_product1' = True) (\<lambda> s2. getVarBool s2 v_given1' = True \<and> getVarInt s2 v_credit' > 0)
(\<lambda> s3. getVarBool s3 v_dispense' = False \<and> getVarBool s3 v_paidOut' = False)
 (\<lambda> s4. getVarBool s4 v_dispense' = True \<and> getVarInt s4 v_change' = getVarInt s4 v_credit' \<or> getVarBool s4 v_paidOut' =True) s"

definition R5 where "R5 s \<equiv>
always_part (\<lambda> s1. getVarInt s1 v_mode' = v_IDLE' \<longrightarrow> getVarBool s1 v_lockChanger' = False)"

definition R6 where "R6 s \<equiv>
always_part (\<lambda> s1.  getVarInt s1 v_mode' = v_IDLE' \<longrightarrow> getVarInt s1 v_credit' \<le> 0)"

definition R7 where "R7 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_lockChanger' = False) (\<lambda> s2. True)
 (\<lambda>  s2. let s1 = pred s2 in toEnvP s1 \<and> getVarInt s2 v_credit' = getVarInt s1 v_credit' + getVarInt s2 v_deposited') s"

definition R8 where "R8 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_product1' = True) (\<lambda> s2. getVarBool s2 v_given1' = True)
 (\<lambda> s2. let s1 = pred s2 in toEnvP s1 \<and> getVarInt s2 v_credit' = getVarInt s1 v_credit' - v_PRICE1') s"

definition R9 where "R9 s \<equiv> 
P1_2_part 1 (\<lambda> s1. getVarBool s1 v_product1' = True) (\<lambda> s2. getVarBool s2 v_product1' = False \<and> getVarBool s2 v_given1' = False)
(\<lambda> s3. getVarInt s3 v_mode' \<noteq> v_CHOICE') (\<lambda> s4. getVarInt s4 v_mode' = v_CHOICE') s"

definition R10 where "R10 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_product1' = True \<or> getVarBool s1 v_product2' = True \<longrightarrow> getVarBool s1 v_lockChanger' = True) s"

definition R11 where "R11 s \<equiv> 
always_part (\<lambda> s1. \<not> (getVarBool s1 v_product1' = True \<and> getVarBool s1 v_product2' = True)) s"

end