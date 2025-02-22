theory CommonExtraInv 
  imports TrafficLights
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s controller' \<noteq> controller'green' \<longrightarrow> getVarBool s trafficLight' = RED') \<and>
(getPstate s controller' = controller'green' \<longrightarrow> getVarBool s trafficLight' = GREEN' \<and>
 getVarBool s requestButtonPressed' = False) \<and>
(getPstate s controller' = controller'minimalRed' \<longrightarrow> ltime s controller' \<le> MINIMAL_RED_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s controller' = controller'redToGreen' \<longrightarrow> ltime s controller' \<le> RED_TO_GREEN_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s controller' = controller'green' \<longrightarrow> ltime s controller' \<le> GREEN_TIME_LIMIT'TIMEOUT) \<and>
(getPstate s controller' \<in> {controller'minimalRed', controller'redAfterMinimalRed', controller'redToGreen',
 controller'green'})"

end