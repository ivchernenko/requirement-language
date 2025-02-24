theory CommonExtraInv
  imports Escalator
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s Ctrl' = Ctrl'motionless' \<longrightarrow> getVarBool s up' = False \<and> getVarBool s down' = False) \<and>
(getPstate s Ctrl'  = Ctrl'goUp' \<longrightarrow> getVarBool s up' = True \<and> getVarBool s down' = False) \<and>
(getPstate s Ctrl'  = Ctrl'goDown' \<longrightarrow> getVarBool s up' = False \<and> getVarBool s down' = True) \<and>
(getPstate s Ctrl' \<in> {Ctrl'goUp', Ctrl'goDown'} \<longrightarrow> ltime s Ctrl' \<le> DELAY'TIMEOUT) \<and>
(getPstate s Ctrl' = Ctrl'stuckState' \<longrightarrow> ltime s Ctrl' \<le> SUSPENSION_TIME'TIMEOUT) \<and>
(getPstate s Ctrl' \<in> {Ctrl'motionless', Ctrl'goUp', Ctrl'goDown', Ctrl'stuckState', Ctrl'emergency'}) \<and>
(getPstate s Ctrl' = Ctrl'stuckState' \<and> ltime s Ctrl' > 1 \<longrightarrow> getVarBool s up' = False \<and> getVarBool s down' = False)
 \<and> (getPstate s Ctrl' = Ctrl'stuckState' \<and> (getVarBool s up' \<or> getVarBool s down') \<longrightarrow> getVarBool s stuck' = True)
 \<and> (getPstate s Ctrl' = Ctrl'emergency' \<and> (getVarBool s up' \<or> getVarBool s down') \<longrightarrow> getVarBool s alarmButton' = True)
"

end