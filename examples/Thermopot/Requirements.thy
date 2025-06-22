theory Requirements
  imports Thermopot VCProving.Basic_Patterns VCProving.Derived_Patterns Common_ExtraInv
begin

definition R1 where "R1 s \<equiv>
   always2_part (\<lambda> s1. getVarBool s1 v_boilingMode' = True) (\<lambda> s2. getVarInt s2 v_temperature' < v_BOILING_POINT')
 (\<lambda> s2. getVarBool s2 v_lid' = v_LOCKED') s"

definition Einv1 where "Einv1 s \<equiv> common_extraInv s \<and>
   always2_inv_part  (\<lambda> s. getPstate s p_HeaterController' \<noteq> p_HeaterController's_heating')
 (\<lambda> s1. getVarBool s1 v_boilingMode' = True) (\<lambda> s2. getVarInt s2 v_temperature' < v_BOILING_POINT')
 (\<lambda> s2. getVarBool s2 v_lid' = v_LOCKED') s"

definition R2 where "R2 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_maintainingMode' = True)
 (\<lambda> s2. getVarBool s2 v_boilingButton' \<noteq> v_PRESSED' \<and> getVarInt s2 v_temperature' \<ge> getVarInt s2 v_selectedTemp')
 (\<lambda> s2. getVarBool s2 v_heater' = False) s"

definition Einv2 where "Einv2 s \<equiv> common_extraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_HeaterController' \<noteq> p_HeaterController's_maintaining')
 (\<lambda> s1. getVarBool s1 v_maintainingMode' = True)
 (\<lambda> s2. getVarBool s2 v_boilingButton' \<noteq> v_PRESSED' \<and> getVarInt s2 v_temperature' \<ge> getVarInt s2 v_selectedTemp')
 (\<lambda> s2. getVarBool s2 v_heater' = False) s"

definition R3 where "R3 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_maintainingMode' = True)
 (\<lambda> s2. getVarBool s2 v_boilingButton' \<noteq> v_PRESSED' \<and> getVarInt s2 v_temperature' < getVarInt s2 v_selectedTemp' - 5)
 (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition Einv3 where "Einv3 s \<equiv> common_extraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_HeaterController' \<noteq> p_HeaterController's_maintaining')
 (\<lambda> s1. getVarBool s1 v_maintainingMode' = True)
 (\<lambda> s2. getVarBool s2 v_boilingButton' \<noteq> v_PRESSED' \<and> getVarInt s2 v_temperature' < getVarInt s2 v_selectedTemp' - 5)
 (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition R4 where "R4 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_button1' = v_PRESSED' \<longrightarrow> getVarInt s1 v_selectedTemp' = v_TEMP1') s"

definition Einv4 where "Einv4 s \<equiv> common_extraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 v_button1' = v_PRESSED' \<longrightarrow> getVarInt s1 v_selectedTemp' = v_TEMP1') s"

definition R5 where "R5 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_boilingMode' = False \<and> getVarBool s1 v_maintainingMode' = False) (\<lambda> s2. True)
 (\<lambda> s2. getVarBool s2 v_heater' = False) s"

definition Einv5 where "Einv5 s \<equiv> common_extraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_HeaterController' \<in> {p_HeaterController's_heating', p_HeaterController's_maintaining'})
 (\<lambda> s1. getVarBool s1 v_boilingMode' = False \<and> getVarBool s1 v_maintainingMode' = False) (\<lambda> s2. True)
 (\<lambda> s2. getVarBool s2 v_heater' = False) s"

end