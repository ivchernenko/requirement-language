theory Requirements
  imports Barrier VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv>
always_part (\<lambda> s1.\<not> ( getVarBool s1 v_up' = True \<and> getVarBool s1 v_down' = True)) s"

definition Einv1 where "Einv1 s \<equiv> 
always_inv_part (\<lambda> s1.\<not> ( getVarBool s1 v_up' = True \<and> getVarBool s1 v_down' = True)) s"

definition R2 where "R2 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_peCarUnder' = True \<longrightarrow> getVarBool s1 v_down' = False) s"

definition Einv2 where "Einv2 s \<equiv> 
always_inv_part (\<lambda> s1. getVarBool s1 v_peCarUnder' = True \<longrightarrow> getVarBool s1 v_down' = False) s"

definition R3 where "R3 s \<equiv> 
P3_2_part (\<lambda> s1. getVarBool s1 v_down' = True) (\<lambda> s2. getVarBool s2 v_closed' = True) (\<lambda> s3. getVarBool s3 v_up' = False)
 (\<lambda> s5. getVarBool s5 v_carInFront' = True \<and> (let s4 = pred s5 in toEnvP s4 \<and>  getVarBool s4 v_carInFront' = False)) s"

definition Einv3 where "Einv3 s \<equiv> 
P3_2_inv_part (\<lambda> s. getPstate s p_Opening' \<noteq> p_Opening's_closing') (\<lambda> s. getPstate s p_Opening' = STOP)
   (\<lambda> s1. getVarBool s1 v_down' = True) (\<lambda> s2. getVarBool s2 v_closed' = True) (\<lambda> s3. getVarBool s3 v_up' = False)
 (\<lambda> s5. getVarBool s5 v_carInFront' = True \<and> (let s4 = pred s5 in toEnvP s4 \<and>  getVarBool s4 v_carInFront' = False)) s"

definition R4 where "R4 s \<equiv> 
P1_1_part v_OPEN_TIME'TIMEOUT  (\<lambda> s1. getVarBool s1 v_green' = True)
   (\<lambda> s3. getVarBool s3 v_down' = False \<and> getVarBool s3 v_opened' = True \<and> getVarBool s3 v_peCarUnder' = False \<and> 
     (getVarBool s3 v_carInFront' = False \<or> (let s2 = pred s3 in toEnvP s2 \<longrightarrow> getVarBool s2 v_carInFront' = True)))
   (\<lambda> s5. getVarBool s5 v_down' = True \<or> getVarBool s5 v_opened' = False \<or> getVarBool s5 v_peCarUnder' = True \<or> 
     (getVarBool s5 v_carInFront' = True \<and> (let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_carInFront' = False))) s"

definition Einv4 where "Einv4 s \<equiv> 
P1_1_inv_part v_OPEN_TIME'TIMEOUT (\<lambda> s. if getPstate s p_Opening' = p_Opening's_open' then ltime s p_Opening' else 0)
   (\<lambda> s1. getVarBool s1 v_green' = True)
   (\<lambda> s3. getVarBool s3 v_down' = False \<and> getVarBool s3 v_opened' = True \<and> getVarBool s3 v_peCarUnder' = False \<and> 
     (getVarBool s3 v_carInFront' = False \<or> (let s2 = pred s3 in toEnvP s2 \<longrightarrow> getVarBool s2 v_carInFront' = True)))
   (\<lambda> s5. getVarBool s5 v_down' = True \<or> getVarBool s5 v_opened' = False \<or> getVarBool s5 v_peCarUnder' = True \<or> 
     (getVarBool s5 v_carInFront' = True \<and> (let s4 = pred s5 in toEnvP s4 \<and> getVarBool s4 v_carInFront' = False))) s"

definition R5 where "R5 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_carInFront' = False) (\<lambda> s2. getVarBool s2 v_carInFront' = True \<and> getVarBool s2 v_opened' = False)
  (\<lambda> s2. getVarBool s2 v_up' = True)  s"

definition Einv5 where "Einv5 s \<equiv> 
always2_inv_part (\<lambda> s. getPstate s p_CarController' = p_CarController's_waitingForCarPassing')
   (\<lambda> s1. getVarBool s1 v_carInFront' = False) (\<lambda> s2. getVarBool s2 v_carInFront' = True \<and> getVarBool s2 v_opened' = False)
  (\<lambda> s2. getVarBool s2 v_up' = True)  s"

definition R6 where "R6 s \<equiv> 
P2_2_part  v_OPEN_TIME'TIMEOUT  (\<lambda> s1. getVarBool s1 v_green' = False) (\<lambda> s2. getVarBool s2 v_green' = True)
  (\<lambda> s3. getVarBool s3 v_down' = False) s"

definition Einv6 where "Einv6 s \<equiv> 
P2_2_inv_part  v_OPEN_TIME'TIMEOUT (\<lambda> s. getPstate s p_Opening' = p_Opening's_open')
   (\<lambda> s. if getPstate s p_Opening' = p_Opening's_open' then ltime s p_Opening' - 1 else v_OPEN_TIME'TIMEOUT - 1)
   (\<lambda> s1. getVarBool s1 v_green' = False) (\<lambda> s2. getVarBool s2 v_green' = True)
  (\<lambda> s3. getVarBool s3 v_down' = False) s"

definition R7 where "R7 s \<equiv> 
P2_1_part v_OPEN_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_peCarUnder' = True) (\<lambda> s2. getVarBool s2 v_down' = False) s"

definition Einv7 where "Einv7 s \<equiv> 
P2_1_inv_part v_OPEN_TIME'TIMEOUT  (\<lambda> s. if getPstate s p_Opening' = p_Opening's_open' then ltime s p_Opening' - 1 else v_OPEN_TIME'TIMEOUT - 1)
  (\<lambda> s1. getVarBool s1 v_peCarUnder' = True) (\<lambda> s2. getVarBool s2 v_down' = False) s"

definition R8 where "R8 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_down' = False)
   (\<lambda> s2. getVarBool s2 v_peCarUnder' = True \<and> getVarBool s2 v_opened' = False \<and> getVarBool s2 v_closed' = False)
   (\<lambda> s2. getVarBool s2 v_up' = True) s"

definition Einv8 where "Einv8 s \<equiv> 
always2_inv_part (\<lambda> s. getPstate s p_Opening' = p_Opening's_closing')
  (\<lambda> s1. getVarBool s1 v_down' = False)
   (\<lambda> s2. getVarBool s2 v_peCarUnder' = True \<and> getVarBool s2 v_opened' = False \<and> getVarBool s2 v_closed' = False)
   (\<lambda> s2. getVarBool s2 v_up' = True) s"

definition R9 where "R9 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_up' = True) (\<lambda> s2. getVarBool s2 v_opened' = False) (\<lambda> s2. getVarBool s2 v_up' = True) s"

definition Einv9 where "Einv9 s \<equiv> 
always2_inv_part (\<lambda> s. getPstate s p_Opening' \<noteq> p_Opening's_opening')
   (\<lambda> s1. getVarBool s1 v_up' = True) (\<lambda> s2. getVarBool s2 v_opened' = False) (\<lambda> s2. getVarBool s2 v_up' = True) s"

definition R10 where "R10 s \<equiv> 
P2_2_part v_OPEN_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_carInFront' = False)
  (\<lambda> s2. getVarBool s2 v_carInFront' = True \<and> getVarBool s2 v_green' = True) (\<lambda> s3. getVarBool s3 v_down' = False) s"

definition Einv10 where "Einv10 s \<equiv> 
P2_2_inv_part v_OPEN_TIME'TIMEOUT (\<lambda> s. getPstate s p_CarController' = p_CarController's_waitingForCarPassing')
   (\<lambda> s. if getPstate s p_Opening' = p_Opening's_open' then ltime s p_Opening' - 1 else v_OPEN_TIME'TIMEOUT - 1)
   (\<lambda> s1. getVarBool s1 v_carInFront' = False)
  (\<lambda> s2. getVarBool s2 v_carInFront' = True \<and> getVarBool s2 v_green' = True) (\<lambda> s3. getVarBool s3 v_down' = False) s"

definition R11 where "R11 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_up' = True \<or> getVarBool s1 v_down' = True \<longrightarrow> getVarBool s1 v_red' = True)"

definition Einv11 where "Einv11 s \<equiv> 
always_inv_part (\<lambda> s1. getVarBool s1 v_up' = True \<or> getVarBool s1 v_down' = True \<longrightarrow> getVarBool s1 v_red' = True)"

definition R12 where "R12 s \<equiv> 
always_part (\<lambda> s1. \<not> (getVarBool s1 v_red' = True \<and> getVarBool s1 v_green' = True)) s"

definition Einv12 where "Einv12 s \<equiv> 
always_inv_part (\<lambda> s1. \<not> (getVarBool s1 v_red' = True \<and> getVarBool s1 v_green' = True)) s"

end

