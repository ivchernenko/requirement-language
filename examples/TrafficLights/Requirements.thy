theory Requirements
  imports "../Derived_Patterns"  CommonExtraInv
begin

abbreviation T1:: nat where
 "T1 \<equiv> MINIMAL_RED_TIME_LIMIT'TIMEOUT + RED_TO_GREEN_TIME_LIMIT'TIMEOUT"
abbreviation T2:: nat where "T2 \<equiv> GREEN_TIME_LIMIT'TIMEOUT"
abbreviation T3:: nat where "T3 \<equiv> 10"

definition R1 where "R1 s \<equiv> toEnvP s \<and> 
P1_2_part T1 (\<lambda> s1. getVarBool s1 trafficLight' = RED' \<and> getVarBool s1 requestButton' = NOT_PRESSED')
(\<lambda> s2. getVarBool s2 requestButton' = PRESSED') (\<lambda> s3. getVarBool s3 trafficLight' = RED')
 (\<lambda> s4. getVarBool s4 trafficLight' = GREEN') s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and> 
P1_2_inv_part T1 (\<lambda> s. getPstate s controller' = controller'green')
(\<lambda> s. if getPstate s controller' = controller'minimalRed' \<and> getVarBool s requestButtonPressed' = True
 then ltime s controller' - 1
else if getPstate s controller' = controller'redAfterMinimalRed' \<and> getVarBool s requestButtonPressed' = True
then MINIMAL_RED_TIME_LIMIT'TIMEOUT
else if getPstate s controller' \<in> {controller'minimalRed', controller'redAfterMinimalRed'}
 \<and> getVarBool s requestButtonPressed' = False then 0
else if getPstate s controller' = controller'redToGreen' then MINIMAL_RED_TIME_LIMIT'TIMEOUT + ltime s controller'
else 0 )
 (\<lambda> s1. getVarBool s1 trafficLight' = RED' \<and> getVarBool s1 requestButton' = NOT_PRESSED')
(\<lambda> s2. getVarBool s2 requestButton' = PRESSED') (\<lambda> s3. getVarBool s3 trafficLight' = RED')
 (\<lambda> s4. getVarBool s4 trafficLight' = GREEN') s"

definition R2 where "R2 s \<equiv> toEnvP s \<and>
P2_2_part T2 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq> GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = GREEN')
(\<lambda> s1. getVarBool s1 trafficLight' = GREEN') s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
P2_2_inv_part T2 (\<lambda> s. getPstate s controller' = controller'green')
 (\<lambda> s. if getPstate s controller' = controller'green' then ltime s controller' - 1 else T2 - 1)
 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq> GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = GREEN')
(\<lambda> s1. getVarBool s1 trafficLight' = GREEN') s"

definition R3 where "R3 s \<equiv> toEnvP s \<and> 
P1_2_part (T2 + T3) (\<lambda> s1. getVarBool s1 trafficLight' \<noteq> GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = GREEN')
(\<lambda> s1. getVarBool s1 trafficLight' = GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = RED')  s"

definition Einv3 where "Einv3 s \<equiv> commonExtraInv s \<and> 
P1_2_inv_part (T2 + T3) (\<lambda> s. getPstate s controller' = controller'green') 
(\<lambda> s. if getPstate s controller' = controller'green' then ltime s controller' else 0)
 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq> GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = GREEN')
(\<lambda> s1. getVarBool s1 trafficLight' = GREEN') (\<lambda> s1. getVarBool s1 trafficLight' = RED')  s"

definition R4 where "R4 s \<equiv> toEnvP s \<and>
P3_2_part (\<lambda> s1. getVarBool s1 trafficLight' \<noteq>  RED') (\<lambda> s1. getVarBool s1 trafficLight' =  RED')
(\<lambda> s1. getVarBool s1 trafficLight' =  RED') (\<lambda> s4. getVarBool s4 requestButton' = PRESSED') s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
P3_2_inv_part (\<lambda> s. getPstate s controller' \<noteq> controller'green')
 (\<lambda> s. getPstate s controller' \<in> {controller'minimalRed', controller'redAfterMinimalRed'}
 \<and> getVarBool s requestButtonPressed' = False)
 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq>  RED') (\<lambda> s1. getVarBool s1 trafficLight' =  RED')
(\<lambda> s1. getVarBool s1 trafficLight' =  RED') (\<lambda> s4. getVarBool s4 requestButton' = PRESSED') s"

definition R5 where "R5 s \<equiv> toEnvP s \<and>
P2_2_part T1 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq>  RED') (\<lambda> s1. getVarBool s1 trafficLight' =  RED')
(\<lambda> s1. getVarBool s1 trafficLight' =  RED') s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
P2_2_inv_part T1  (\<lambda> s. getPstate s controller' \<noteq> controller'green') 
(\<lambda> s. if getPstate s controller' = controller'minimalRed' then ltime s controller' - 1
 else if getPstate s controller' = controller'redAfterMinimalRed' then MINIMAL_RED_TIME_LIMIT'TIMEOUT
else if getPstate s controller' = controller'redToGreen' then MINIMAL_RED_TIME_LIMIT'TIMEOUT + ltime s controller'
else T1 - 1)
 (\<lambda> s1. getVarBool s1 trafficLight' \<noteq>  RED') (\<lambda> s1. getVarBool s1 trafficLight' =  RED')
(\<lambda> s1. getVarBool s1 trafficLight' =  RED') s"


end