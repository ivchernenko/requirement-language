theory CommonExtraInv
  imports HandDryer
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s Ctrl' = Ctrl'drying' \<longrightarrow> getVarBool s dryer' = True) \<and>
(getPstate s Ctrl' = Ctrl'drying' \<longrightarrow> ltime s Ctrl' \<le> 10) \<and>
(getPstate s Ctrl' \<in> {Ctrl'waiting', Ctrl'drying'})"

end