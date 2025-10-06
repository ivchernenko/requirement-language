theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns EDTL_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part 
  (\<lambda> s1. getVarBool s1 v_AutoLED' = False \<and> getVarBool s1 v_ManualLED' = False \<and> getVarBool s1 v_SafetyLED' = False \<and> getVarBool s1 v_EmergencyLED' = False)
  (\<lambda> s2. getVarBool s2 v_AutoBtn' = True) (\<lambda> s2. getVarBool s2 v_filling' = True \<and> getVarBool s2 v_release' = True \<and> getVarBool s2 v_FillingLED' = True) s"

definition R2 where "R2 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_filling' = False \<and> getVarBool s1 v_filling' = True)) in
  let final = (\<lambda> s3. getVarBool s3 v_Lfull' = True) in
  let release = (\<lambda> s4. getVarBool s4 v_EmergencyBtn' = True \<or> getVarBool s4 v_ThighAbnormally' = True \<or> getVarBool s4 v_PhighAbnormally' = True) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s4 \<and>  getVarBool s4 v_filling' = True \<and> getVarBool s4 v_release' = True \<and> getVarBool s4 v_FillingLED' = True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_filling' = False \<and> getVarBool s5 v_release' = False \<and> getVarBool s5 v_FillingLED' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R3 where "R3 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_filling' = False \<and> getVarBool s1 v_filling' = True)) in
  let final = (\<lambda> s3. getVarBool s3 v_Lfull' = True) in
  let release = (\<lambda> s4. getVarBool s4 v_ManualBtn' \<or> getVarBool s4 v_EmergencyBtn' \<or> getVarBool s4 v_ThighAbnormally' \<or> getVarBool s4 v_PhighAbnormally') in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_DegasLED' = True \<and> getVarBool s5 v_heater' = True) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R4 where "R4 s \<equiv>
  let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_DegasLED' = False \<and> getVarBool s1 v_DegasLED' = True)) in
  let finalt = v_DEGASSING_TIMEOUT'TIMEOUT in
  let finale = (\<lambda> s3. getVarBool s3 v_Ldeg' = False) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_DegasLED' = True) in
  let reaction = (\<lambda> s6. getVarBool s6 v_DegasLED' = False) in
  EDTL_final_nontemporal_or_tau_delay_true_part finalt trigger finale release invariant reaction s"

definition R5 where "R5 s \<equiv>
  let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_heater' = False \<and> getVarBool s1 v_heater' = True)) in
  let finalt = v_HEATING_TIMEOUT'TIMEOUT in
  let finale = (\<lambda> s3. let s2 = pred s3 in toEnvP s2 \<and> getVarBool s3 v_Thigh' = True \<or> getVarBool s3 v_Phigh' = True \<or> getVarBool s2 v_DegasLED' = False) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_heater' = True) in
  let reaction = (\<lambda> s6. getVarBool s6 v_heater' = False) in
  EDTL_final_nontemporal_or_tau_delay_true_part finalt trigger finale release invariant reaction s"

definition R6 where "R6 s \<equiv>
  let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_heater' = False \<and> getVarBool s1 v_heater' = True)) in
  let finalt = v_ACCUMULATING_TIMEOUT'TIMEOUT in
  let finale = (\<lambda> s3. getVarBool s3 v_Phigh' = True) in
  let release = (\<lambda> s4. let s3 = pred s4 in toEnvP s3 \<and> getVarBool s3 v_DegasLED' = False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s5 \<and> getVarBool s4 v_release' = False) in
  let reaction = (\<lambda> s6. getVarBool s6 v_release' = True) in
  EDTL_final_nontemporal_or_tau_delay_true_part finalt trigger finale release invariant reaction s"

definition R7 where "R7 s \<equiv>
  let trigger =  (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_release' = False \<and> getVarBool s1 v_release' = True)) in
  let finalt = v_RELEASE_TIMEOUT'TIMEOUT in
  let finale = (\<lambda> s3. (let s2 = pred s3 in toEnvP s2 \<and> getVarBool s3 v_Plow' = False \<or> getVarBool s2 v_DegasLED' = False)) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s5 \<and> getVarBool s4 v_release' = True) in
  let reaction = (\<lambda> s6. getVarBool s6 v_release' = False) in
  EDTL_final_nontemporal_or_tau_delay_true_part finalt trigger finale release invariant reaction s"

definition R8 where "R8 s \<equiv>
  always2_part 
  (\<lambda> s1. getVarBool s1 v_release' = True \<and> getVarBool s1 v_DegasLED' = True) (\<lambda> s2. getVarBool s2 v_Plow' = False) (\<lambda> s2. getVarBool s2 v_heater' = True) s"

definition R9 where "R9 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_DegasLED' = False \<and> getVarBool s1 v_DegasLED' = True)) in
  let final = (\<lambda> s3. let s2 = pred s3 in toEnvP s2 \<and> getVarBool s2 v_DegasLED' = False) in
  let release = (\<lambda> s4. getVarBool s4 v_ManualBtn' = True) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_emptying' = True \<and> getVarBool s5 v_inert' = True) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R10 where "R10 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_inert' = False \<and> getVarBool s1 v_inert' = True)) in
  let final = (\<lambda> s3. getVarBool s3 v_Llow' = False) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s5 \<and> getVarBool s4 v_inert' = True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_inert' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R11 where "R11 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in (let s0 = pred s1 in toEnvP s0 \<and> toEnvP s1 \<and> getVarBool s0 v_emptying' = False \<and> getVarBool s1 v_emptying' = True)) in
  let final = (\<lambda> s3. getVarBool s3 v_Lempty' = True) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s5 \<and> getVarBool s4 v_emptying' = True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_emptying' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R12 where "R12 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_SafetyLED' = False \<and> getVarBool s1 v_DegasLED' = False) in
  let final = (\<lambda> s3. let s2 =pred s3 in toEnvP s2 \<and> getVarBool s2 v_emptying' = True \<and> getVarBool s3 v_Lempty' = True) in
  let release = (\<lambda> s4. getVarBool s4 v_ManualBtn' \<or> getVarBool s4 v_SafetyStopBtn' \<or> getVarBool s4 v_EmergencyBtn' \<or> getVarBool s4 v_ThighAbnormally'
     \<or> getVarBool s4 v_PhighAbnormally' = True) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_filling' = True \<and> getVarBool s5 v_release' = True \<and> getVarBool s5 v_FillingLED' =True) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R13 where "R13 s \<equiv>
always2_part 
  (\<lambda> s1. getVarBool s1 v_AutoLED' = True) 
  (\<lambda> s2. getVarBool s2 v_SafetyStopBtn' = True \<and> getVarBool s2 v_ManualBtn' = False \<and> getVarBool s2 v_EmergencyBtn' = False
     \<and> getVarBool s2 v_ThighAbnormally' = False \<and> getVarBool s2 v_PhighAbnormally' = False)
  (\<lambda> s2. getVarBool s2 v_SafetyLED' = True) s"

definition R14 where "R14 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_SafetyLED' = False \<and> getVarBool s1 v_SafetyLED' = True)) in
  let final = (\<lambda> s2. let s1 = pred s2 in  (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_purge' = True \<and> getVarBool s1 v_purge' = False)) in
  let release = (\<lambda> s4. getVarBool s4 v_EmergencyBtn' = True \<or> getVarBool s4 v_ThighAbnormally' = True \<or> getVarBool s4 v_PhighAbnormally' = True) in
  let invariant = (\<lambda> s5. let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_SafetyLED' = True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_SafetyLED' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R15 where "R15 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_AutoLED' = True
     \<and> (getVarBool s2 v_SafetyStopBtn' \<or> getVarBool s2 v_EmergencyBtn' \<or> getVarBool s2 v_ThighAbnormally' \<or> getVarBool s2 v_PhighAbnormally')) in
  let final = (\<lambda> s2. let s1 = pred s2 in  (let s0 = pred s1 in toEnvP s0 \<and> getVarBool s0 v_emptying' = True \<and> getVarBool s1 v_emptying' = False)) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_purge' = True) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R16 where "R16 s \<equiv>
P1_2_part 1 (\<lambda> s1. getVarBool s1 v_AutoLED' = True) 
  (\<lambda> s2. getVarBool s2 v_EmergencyBtn' \<or> getVarBool s2 v_ThighAbnormally' \<or> getVarBool s2 v_PhighAbnormally')
  (\<lambda> s3. getVarBool s3 v_emptying' = False) (\<lambda> s4. getVarBool s4 v_emptying' = True) s"

definition R17 where "R17 s \<equiv>
let final =  v_PURGE_TIMEOUT'TIMEOUT in
let delay = 1 in
let trigger =  (\<lambda> s2. let s1 = pred s2 in let s0 = pred s1 in  toEnvP s0 \<and> getVarBool s0 v_purge' =False \<and> getVarBool s1 v_purge' = True) in
let invariant = (\<lambda> s3. let s2 = pred s3 in toEnvP s2 \<and> getVarBool s2 v_purge' = True \<and> getVarBool s2 v_release' = True) in
let reaction = (\<lambda> s3. let s2 = pred s3 in toEnvP s2 \<and> getVarBool s2 v_purge' = False \<and> getVarBool s2 v_release' = False) in
EDTL_release_false_final_tau_delay_tau_part final delay trigger invariant reaction s"

definition R18 where "R18 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  toEnvP s1 \<and> getVarBool s1 v_filling' = True \<and> getVarBool s2 v_ManualBtn' = True) in
  let final = (\<lambda> s3. getVarBool s3 v_Lfull' = True) in
  let release = (\<lambda> s4. getVarBool s4 v_EmergencyBtn' = True \<or> getVarBool s4 v_ThighAbnormally' = True \<or> getVarBool s4 v_PhighAbnormally' = True) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_DegasLED' = False \<and> getVarBool s5 v_heater' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R19 where "R19 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  toEnvP s1 \<and> getVarBool s1 v_DegasLED' = True \<and> getVarBool s2 v_ManualBtn' = True) in
  let final = (\<lambda> s3. let s2 =pred s3 in toEnvP s2 \<and> getVarBool s2 v_DegasLED' = False) in
  let release = (\<lambda> s4. getVarBool s4 v_EmergencyBtn' = True \<or> getVarBool s4 v_ThighAbnormally' = True \<or> getVarBool s4 v_PhighAbnormally' = True) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_emptying' = False \<and> getVarBool s5 v_inert' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R20 where "R20 s \<equiv>
 let trigger = (\<lambda> s2. let s1 = pred s2 in  toEnvP s1 \<and> getVarBool s1 v_emptying' = True \<and> getVarBool s2 v_ManualBtn' = True) in
  let final = (\<lambda> s3. getVarBool s3 v_Lempty' = True) in
  let release = (\<lambda> s4. False) in
  let invariant = (\<lambda> s5. True) in
  let reaction = (\<lambda> s5. getVarBool s5 v_filling' = False \<and> getVarBool s5 v_release' = False) in
  EDTL_delay_true_part trigger final release invariant reaction s"

definition R21 where "R21 s \<equiv>
always_part (\<lambda> s1. getVarBool s1 v_DegasLED' = False \<and> getVarBool s1 v_emptying'=  False \<or> getVarBool s1 v_filling' = False) s"

