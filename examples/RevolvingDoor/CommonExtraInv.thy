theory CommonExtraInv
  imports RevolvingDoor
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s Controller' = Controller'motionless' \<longrightarrow>
 getVarBool s rotation' = False \<and> getVarBool s brake' = False) \<and>
(getPstate s Controller' = Controller'rotating' \<longrightarrow> getVarBool s rotation' = True \<and> getVarBool s brake' = False) \<and>
(getPstate s Controller' = Controller'suspended' \<longrightarrow> getVarBool s rotation' = False \<and> getVarBool s brake' = True) \<and>
(getPstate s Controller' = Controller'rotating' \<longrightarrow> ltime s Controller' \<le> DELAY'TIMEOUT) \<and>
(getPstate s Controller' = Controller'suspended' \<longrightarrow> ltime s Controller' \<le> SUSPENSION_TIME'TIMEOUT) \<and>
(getPstate s Controller' \<in> {Controller'motionless', Controller'rotating', Controller'suspended'})"

end