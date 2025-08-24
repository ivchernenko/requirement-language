theory Requirements
  imports Common_Extra_Invariant VCProving.Basic_Patterns VCProving.Derived_Patterns P_2_Timeouts_Patterns
begin

definition R1 where "R1 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_liquidLevel' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True) s"

definition Einv1 where "Einv1 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_EngineController' \<noteq> p_EngineController's_turnedOff')
  (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_liquidLevel' = v_HIGH') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True) s"

definition R2 where "R2 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_LOW') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition Einv2 where "Einv2 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_EngineController' \<in> {p_EngineController's_turningOn', p_EngineController's_turnedOn'})
  (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_LOW') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R3 where "R3 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition Einv3 where "Einv3 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_EngineController' \<in> {p_EngineController's_turningOn', p_EngineController's_turnedOn'})
  (\<lambda> s1. getVarBool s1 v_ignition' = False) (\<lambda> s2. getVarBool s2 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R4 where "R4 s \<equiv>
P4_3_part (v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT)
   (\<lambda>  s1. getVarBool s1 v_ignition' = True)
   (\<lambda> s2.  getVarBool s2 v_liquidLevel' = v_HIGH')
  (\<lambda> s2. getVarBool s2 v_ignition' = True) (\<lambda> s4. getVarBool s4 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s5. getVarBool s5 v_onOffButton' = v_PRESSED') s"

definition Einv4 where "Einv4 s \<equiv> common_extra_invariant s \<and>
P4_3_inv_part (v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT)
  (\<lambda> s. getPstate s p_EngineController' \<in> {STOP, p_EngineController's_turnedOff'})
  (\<lambda> s. getPstate s p_EngineController' = p_EngineController's_turnedOff') 
  (\<lambda> s. if getPstate s p_CoolingAgentController' = STOP then v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT
    else if getPstate s p_CoolingAgentController' = p_CoolingAgentController's_normal' then 0 else ltime s p_CoolingAgentController')
   (\<lambda>  s1. getVarBool s1 v_ignition' = True)
   (\<lambda> s2.  getVarBool s2 v_liquidLevel' = v_HIGH')
  (\<lambda> s2. getVarBool s2 v_ignition' = True) (\<lambda> s4. getVarBool s4 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s5. getVarBool s5 v_onOffButton' = v_PRESSED') s"

definition R5 where "R5 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_sound' = False) 
  (\<lambda> s2. \<not> (getVarBool s2 v_liquidLevel' = v_LOW' \<and>
    (let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s2 v_onOffButton' = v_PRESSED')))
   (\<lambda> s2. getVarBool s2 v_sound' = False) s"

definition Einv5 where "Einv5 s \<equiv> common_extra_invariant s \<and>
always2_inv_part 
   (\<lambda> s. getPstate s p_EngineController' \<in> {p_EngineController's_turningOn', p_EngineController's_turnedOn'} \<or> getPstate s p_Sound' = p_Sound's_sound')
   (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_sound' = False) 
  (\<lambda> s2. \<not> (getVarBool s2 v_liquidLevel' = v_LOW' \<and>
    (let s1 = pred s2 in toEnvP s1 \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s2 v_onOffButton' = v_PRESSED')))
   (\<lambda> s2. getVarBool s2 v_sound' = False) s"

definition R6 where "R6 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = True) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_HIGH') (\<lambda> s2. getVarBool s2 v_sound' = False) s"

definition Einv6 where "Einv6 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_EngineController' \<in> {STOP, p_EngineController's_turnedOff'})
   (\<lambda> s1. getVarBool s1 v_ignition' = True) (\<lambda> s2. getVarBool s2 v_liquidLevel' = v_HIGH') (\<lambda> s2. getVarBool s2 v_sound' = False) s"

definition R7 where "R7 s \<equiv>
P1_1_part v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT (\<lambda> s1. getVarBool s1 v_liquidLevel' = v_LOW') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True \<and> getVarBool s2 v_liquidLevel' = v_LOW') 
  (\<lambda> s3. getVarBool s3 v_ignition' = False \<or> getVarBool s3 v_liquidLevel' = v_HIGH') s"

definition Einv7 where "Einv7 s \<equiv> common_extra_invariant s \<and>
P1_1_inv_part v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT
   (\<lambda> s. if getPstate s p_CoolingAgentController' = p_CoolingAgentController's_lack' then ltime s p_CoolingAgentController' else 0)
  (\<lambda> s1. getVarBool s1 v_liquidLevel' = v_LOW') 
  (\<lambda> s2. getVarBool s2 v_ignition' = True \<and> getVarBool s2 v_liquidLevel' = v_LOW') 
  (\<lambda> s3. getVarBool s3 v_ignition' = False \<or> getVarBool s3 v_liquidLevel' = v_HIGH') s"

definition R8 where "R8 s \<equiv>
always2_part (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_speed' = v_LOW') 
  (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition Einv8 where "Einv8 s \<equiv> common_extra_invariant s \<and>
always2_inv_part (\<lambda> s. getPstate s p_EngineController' \<noteq> p_EngineController's_turnedOn')
  (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and>  getVarBool s2 v_speed' = v_LOW') 
  (\<lambda> s2. getVarBool s2 v_ignition' = False) s"

definition R9 where "R9 s \<equiv>
P_release_2_timeouts_part v_EMERGENCY_STOP_TIME'TIMEOUT (v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT + 1) (\<lambda> s1. getVarBool s1 v_ignition' = True)
  (\<lambda> s2. getVarBool s2 v_ignition' = True \<and> getVarBool s2 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s3. getVarBool s3 v_onOffButton' = v_PRESSED') 
  (\<lambda> s4. getVarBool s4 v_liquidLevel' = v_LOW') (\<lambda> s5. getVarBool s5 v_ignition' = True) s"

definition Einv9 where "Einv9 s \<equiv> common_extra_invariant s \<and>
P_release_2_timeouts_inv_part v_EMERGENCY_STOP_TIME'TIMEOUT (v_WARN_LIQUID_LACK_TIMEOUT'TIMEOUT + 1)
(\<lambda> s. getPstate s p_EngineController'\<in> {STOP, p_EngineController's_turnedOff'}) 
   (\<lambda> s. getPstate s p_EngineController' \<in> {p_EngineController's_turnedOn'})
  (\<lambda> s. if getPstate s p_EngineController' = p_EngineController's_turnedOn' then ltime s p_EngineController' - 1 else 0)
  (\<lambda> s. True)
  (\<lambda> s. if getPstate s p_CoolingAgentController' = p_CoolingAgentController's_lack' then ltime s p_CoolingAgentController' else 0)
   (\<lambda> s1. getVarBool s1 v_ignition' = True)
  (\<lambda> s2. getVarBool s2 v_ignition' = True \<and> getVarBool s2 v_onOffButton' = v_NOT_PRESSED') (\<lambda> s3. getVarBool s3 v_onOffButton' = v_PRESSED') 
  (\<lambda> s4. getVarBool s4 v_liquidLevel' = v_LOW') (\<lambda> s5. getVarBool s5 v_ignition' = True) s"


definition R10 where "R10 s \<equiv>
P1_2_part v_EMERGENCY_STOP_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_ignition' = True \<and> getVarBool s3 v_onOffButton' = v_PRESSED')
  (\<lambda> s4. getVarBool s4 v_ignition' = False \<or> getVarBool s4 v_onOffButton' = v_NOT_PRESSED') s"

definition Einv10 where "Einv10 s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part v_EMERGENCY_STOP_TIME'TIMEOUT
(\<lambda> s. getPstate s p_EngineController' \<noteq> p_EngineController's_turnedOn')
  (\<lambda> s. if getPstate s p_EngineController' = p_EngineController's_turnedOn' then ltime s p_EngineController' else 0)
   (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED') 
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED') (\<lambda> s3. getVarBool s3 v_ignition' = True \<and> getVarBool s3 v_onOffButton' = v_PRESSED')
  (\<lambda> s4. getVarBool s4 v_ignition' = False \<or> getVarBool s4 v_onOffButton' = v_NOT_PRESSED') s"

definition R11a where "R11a s \<equiv>
P1_2_part v_SOUND_TIME'TIMEOUT (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED')
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and> getVarBool s2 v_liquidLevel' = v_LOW')
  (\<lambda> s3. getVarBool s3 v_sound' = True \<and> \<not> (getVarBool s3 v_liquidLevel' = v_LOW' \<and>
    (let s2 = pred s3 in toEnvP s2 \<and> getVarBool s2 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s3 v_onOffButton' = v_PRESSED')))
  (\<lambda> s4. getVarBool s4 v_sound' = False \<or> (getVarBool s4 v_liquidLevel' = v_LOW' \<and>
    (let s3 = pred s4 in toEnvP s3 \<and> getVarBool s3 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s4 v_onOffButton' = v_PRESSED'))) s"

definition Einv11a where "Einv11a s \<equiv> common_extra_invariant s \<and>
P1_2_inv_part v_SOUND_TIME'TIMEOUT 
  (\<lambda> s. getPstate s p_EngineController' \<noteq>  p_EngineController's_turnedOff')
  (\<lambda> s. if getPstate s p_Sound' = p_Sound's_sound' then ltime s p_Sound' else 0)
  (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED')
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and> getVarBool s2 v_liquidLevel' = v_LOW')
  (\<lambda> s3. getVarBool s3 v_sound' = True \<and> \<not> (getVarBool s3 v_liquidLevel' = v_LOW' \<and>
    (let s2 = pred s3 in toEnvP s2 \<and> getVarBool s2 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s3 v_onOffButton' = v_PRESSED')))
  (\<lambda> s4. getVarBool s4 v_sound' = False \<or> (getVarBool s4 v_liquidLevel' = v_LOW' \<and>
    (let s3 = pred s4 in toEnvP s3 \<and> getVarBool s3 v_onOffButton' = v_NOT_PRESSED' \<and> getVarBool s4 v_onOffButton' = v_PRESSED'))) s"

definition R11b where "R11b s \<equiv>
P4_2_part (v_SOUND_TIME'TIMEOUT - 1) (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED')
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and> getVarBool s2 v_liquidLevel' = v_LOW')
(\<lambda> s3. getVarBool s3 v_sound' = True) (\<lambda> s4. getVarBool s4 v_ignition' = True) s"

definition Einv11b where "Einv11b s \<equiv> common_extra_invariant s \<and>
P4_2_inv_part (v_SOUND_TIME'TIMEOUT - 1)
  (\<lambda> s. getPstate s  p_EngineController' \<noteq> p_EngineController's_turnedOff')
  (\<lambda> s. if getPstate s p_Sound' = p_Sound's_sound' then ltime s p_Sound' - 1 else (v_SOUND_TIME'TIMEOUT -1))
   (\<lambda> s1. getVarBool s1 v_ignition' = False \<and> getVarBool s1 v_onOffButton' = v_NOT_PRESSED')
  (\<lambda> s2. getVarBool s2 v_onOffButton' = v_PRESSED' \<and> getVarBool s2 v_liquidLevel' = v_LOW')
(\<lambda> s3. getVarBool s3 v_sound' = True) (\<lambda> s4. getVarBool s4 v_ignition' = True) s"

definition R12 where "R12 s \<equiv>
always_part 
  (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_liquidLevel' = v_HIGH' \<and> getVarBool s1 v_Thigh' = True \<longrightarrow> getVarBool s1 v_valve' = True) s"

definition Einv12 where "Einv12 s \<equiv> common_extra_invariant s \<and>
always_inv_part 
  (\<lambda> s1. getVarBool s1 v_ignition' = True \<and> getVarBool s1 v_liquidLevel' = v_HIGH' \<and> getVarBool s1 v_Thigh' = True \<longrightarrow> getVarBool s1 v_valve' = True) s"

end