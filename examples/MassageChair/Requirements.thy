theory Requirements
  imports CommonExtraInv VCProving.Basic_Patterns VCProving.Derived_Patterns
begin

definition R1 where "R1 s \<equiv> 
always_part (\<lambda> s1. \<not> (getVarBool s1 v_up' = True \<and> getVarBool s1 v_down' = True)) s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. \<not> (getVarBool s1 v_up' = True \<and> getVarBool s1 v_down' = True)) s"

definition R2 where "R2 s \<equiv>
always_part
   (\<lambda> s1. getVarBool s1 v_buttonDown' = False \<or> getVarBool s1 v_lower' = True \<longrightarrow> getVarBool s1 v_down' = False) s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
always_inv_part
   (\<lambda> s1. getVarBool s1 v_buttonDown' = False \<or> getVarBool s1 v_lower' = True \<longrightarrow> getVarBool s1 v_down' = False) s"

definition R3 where "R3 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_enabled' = False \<longrightarrow> getVarBool s1 v_down' = False) s"

definition Einv3 where "Einv3 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 v_enabled' = False \<longrightarrow> getVarBool s1 v_down' = False) s"

definition R4 where "R4 s \<equiv> 
always2_part (\<lambda> s1. getVarBool s1 v_enabled' = False)
   (\<lambda> s2. getVarBool s2 v_enabled' = True \<and> getVarBool s2 v_rollerButton' = False)
   (\<lambda> s2. getVarBool s2 v_roller' = False) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s p_Controller' \<in> {p_Controller's_turnedOn', p_Controller's_turningOff'})
   (\<lambda> s1. getVarBool s1 v_enabled' = False)
   (\<lambda> s2. getVarBool s2 v_enabled' = True \<and> getVarBool s2 v_rollerButton' = False)
   (\<lambda> s2. getVarBool s2 v_roller' = False) s"

definition R5 where "R5 s \<equiv> 
always_part (\<lambda> s1. getVarBool s1 v_rollerButton' = v_PRESSED' \<and> getVarBool s1 v_enabled' = True \<longrightarrow>
   getVarBool s1 v_roller' = True) s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 v_rollerButton' = v_PRESSED' \<and> getVarBool s1 v_enabled' = True \<longrightarrow>
   getVarBool s1 v_roller' = True) s"

abbreviation MASSAGE_TIME where "MASSAGE_TIME \<equiv> v_ROLLER_MASSAGE_TIME'TIMEOUT + v_VIBRATION_MASSAGE_TIME'TIMEOUT"

definition R6 where "R6 s \<equiv> 
P1_1_part MASSAGE_TIME (\<lambda> s1. getVarBool s1 v_roller' = True \<or> getVarBool s1 v_vibration' = True)
(\<lambda> s2. (getVarBool s2 v_roller' = True \<or> getVarBool s2 v_vibration' = True) \<and> getVarBool s2 v_startButton' \<noteq> v_PRESSED')
 (\<lambda> s3. getVarBool s3 v_roller' = False \<and> getVarBool s3 v_vibration' = False \<or> getVarBool s3 v_startButton' =
   v_PRESSED')
  s"

definition Einv6 where "Einv6 s \<equiv> commonExtraInv s \<and>
P1_1_inv_part MASSAGE_TIME
   (\<lambda> s.
    if getPstate s p_Roller' \<noteq> p_Roller's_massaging' \<and> getPstate s p_Vibration' \<noteq> p_Vibration's_massaging' then 0 
    else if getPstate s p_Roller' = p_Roller's_waiting' \<and> getPstate s p_Vibration' = p_Vibration's_massaging'
      then ltime s p_Vibration'
    else if getPstate s p_Roller' = p_Roller's_massaging' \<and> getPstate s p_Vibration' = p_Vibration's_waiting'
      then ltime s p_Roller'
    else if getPstate s p_Roller' = STOP \<and> getPstate s p_Vibration' = p_Vibration's_massaging' 
      then (v_ROLLER_MASSAGE_TIME'TIMEOUT + ltime s p_Vibration')
    else if getPstate s p_Roller' = p_Roller's_massaging' \<and> getPstate s p_Vibration' = STOP
      then (v_VIBRATION_MASSAGE_TIME'TIMEOUT + ltime s p_Roller')
    else if getPstate s p_Roller' = p_Roller's_massaging' \<and> getPstate s p_Vibration' = p_Vibration's_massaging' \<and>
      ltime s p_Roller' \<le> ltime s p_Vibration'
      then ltime s p_Vibration'
    else ltime s p_Roller')
   (\<lambda> s1. getVarBool s1 v_roller' = True \<or> getVarBool s1 v_vibration' = True)
(\<lambda> s2. (getVarBool s2 v_roller' = True \<or> getVarBool s2 v_vibration' = True) \<and> getVarBool s2 v_startButton' \<noteq> v_PRESSED')
 (\<lambda> s3. getVarBool s3 v_roller' = False \<and> getVarBool s3 v_vibration' = False \<or> getVarBool s3 v_startButton' =
   v_PRESSED')
  s"

definition R7 where "R7 s \<equiv> 
P6_1_part v_ON_OFF_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_enabled' = True)
   (\<lambda> s2. getVarBool s2 v_onOff' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_onOff' \<noteq> v_PRESSED')
    (\<lambda> s3. getVarBool s3 v_roller' = False \<and> getVarBool s3 v_vibration' = False) s"

definition Einv7 where "Einv7 s \<equiv> commonExtraInv s \<and>
P6_1_inv_part v_ON_OFF_TIME'TIMEOUT
  (\<lambda> s. getPstate s p_Controller' \<noteq> p_Controller's_turningOff')
   (\<lambda> s. if getPstate s p_Controller' = p_Controller's_turnedOn' then ltime s p_Controller' else 0)
  (\<lambda> s. getPstate s p_Controller' \<noteq> p_Controller's_turningOff')
   (\<lambda> s1. getVarBool s1 v_enabled' = True)
   (\<lambda> s2. getVarBool s2 v_onOff' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_onOff' \<noteq> v_PRESSED')
    (\<lambda> s3. getVarBool s3 v_roller' = False \<and> getVarBool s3 v_vibration' = False) s"

definition R8 where "R8 s \<equiv> 
P6_2_part v_ON_OFF_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_enabled' = True)
   (\<lambda> s2. getVarBool s2 v_onOff' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_onOff' \<noteq> v_PRESSED')
    (\<lambda> s4. getVarBool s4 v_up' = True) (\<lambda> s5. getVarBool s5 v_upper' = True)
   s"

definition Einv8 where "Einv8 s \<equiv> commonExtraInv s \<and>
P6_2_inv_part v_ON_OFF_TIME'TIMEOUT
  (\<lambda> s. getPstate s p_Controller' \<noteq> p_Controller's_turningOff')
   (\<lambda> s. if getPstate s p_Controller' = p_Controller's_turnedOn' then ltime s p_Controller' else 0)
  (\<lambda> s. getPstate s p_Controller' \<noteq> p_Controller's_turningOff')
  (\<lambda> s. getPstate s p_Controller' = p_Controller's_backLifting' \<and> getVarBool s v_up' = True)
   (\<lambda> s1. getVarBool s1 v_enabled' = True)
   (\<lambda> s2. getVarBool s2 v_onOff' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_onOff' \<noteq> v_PRESSED')
    (\<lambda> s4. getVarBool s4 v_up' = True) (\<lambda> s5. getVarBool s5 v_upper' = True)
   s"

end



