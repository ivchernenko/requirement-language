theory CommonExtraInv
  imports Turnstile "VCProving.VCTheoryLemmas"
begin

definition commonExtraInv where "commonExtraInv s \<equiv> toEnvP s \<and>
(getPstate s Controller' \<in> {Controller'isClosed', STOP} \<longrightarrow> getVarBool s open' = False) \<and>
(getPstate s Controller' \<in> {Controller'minimalOpened', Controller'isOpened'} \<longrightarrow> getVarBool s open' = True) \<and>
(getPstate s Controller' = Controller'minimalOpened' \<longrightarrow> ltime s Controller' \<le> 10) \<and>
(getPstate s Controller' = Controller'isOpened' \<longrightarrow> ltime s Controller' \<le> 90) \<and>
getPstate s Controller' \<in> {Controller'isClosed', Controller'minimalOpened', Controller'isOpened', STOP} \<and>
(getPstate s EntranceController' = EntranceController'isOpened' \<longrightarrow> getVarBool s enter' = True) \<and>
(getPstate s EntranceController' \<noteq> EntranceController'isOpened' \<longrightarrow> getVarBool s enter' = False) \<and>
getPstate s EntranceController' \<in> {EntranceController'isClosed', EntranceController'isOpened', STOP} \<and>
(getPstate s Unlocker' = Unlocker'unlock' \<longrightarrow> getVarBool s reset' = True) \<and>
(getPstate s Unlocker' = STOP \<longrightarrow> getVarBool s reset' = False) \<and>
(getPstate s Unlocker' = Unlocker'unlock' \<longrightarrow> ltime s Unlocker' \<le> 10) \<and>
getPstate s Unlocker' \<in> {Unlocker'unlock', STOP} \<and>
(getPstate s Init' = Init'init' \<longrightarrow> getPstate s Controller' = STOP \<and> getPstate s EntranceController' = STOP) \<and>
(getPstate s Init' = STOP \<longrightarrow> getPstate s Controller' \<noteq> STOP \<and> getPstate s EntranceController' \<noteq> STOP) \<and>
(getPstate s Init' \<in> {Init'init', STOP})
"

end