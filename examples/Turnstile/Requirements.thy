theory Requirements
  imports "../Derived_Patterns" CommonExtraInv
begin

definition R1 where "R1 s \<equiv> toEnvP s \<and>
P1_2_part 9 (\<lambda> s1. getVarBool s1 open' = True) (\<lambda> s2. getVarBool s2 PdOut') (\<lambda> s3. getVarBool s3 open' = True)
 (\<lambda> s4. getVarBool s4 open' = False) s"

definition Einv1 where "Einv1 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part 9 (\<lambda> s. getPstate s Controller' \<in> {Controller'isClosed', STOP}) 
(\<lambda> s. if getPstate s Controller' = Controller'minimalOpened' \<and> getVarBool s passed' = True
 then ltime s Controller' - 1 else 0)
  (\<lambda> s1. getVarBool s1 open' = True) (\<lambda> s2. getVarBool s2 PdOut') (\<lambda> s3. getVarBool s3 open' = True)
 (\<lambda> s4. getVarBool s4 open' = False) s"

definition R2 where "R2 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 paid' = False)
 (\<lambda> s2. getVarBool s2 open' = False) s"

definition Einv2 where "Einv2 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s Controller' \<in> {Controller'minimalOpened', Controller'isOpened'})
  (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 paid' = False)
 (\<lambda> s2. getVarBool s2 open' = False) s"

definition R3 where "R3 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 open' = False \<and> getVarBool s1 paid' = False) (\<lambda> s2. getVarBool s2 paid' = True)
(\<lambda> s2. getVarBool s2 open' = True) s"

definition Einv3 where "Einv3 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s Controller' \<in> {Controller'minimalOpened', Controller'isOpened'})
 (\<lambda> s1. getVarBool s1 open' = False \<and> getVarBool s1 paid' = False) (\<lambda> s2. getVarBool s2 paid' = True)
(\<lambda> s2. getVarBool s2 open' = True) s"

definition R4 where "R4 s \<equiv> toEnvP s \<and>
P1_2_part 100 (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 open' = True)
 (\<lambda> s3. getVarBool s3 open' = True) (\<lambda> s4. getVarBool s4 open' = False) s"

definition Einv4 where "Einv4 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part 100  (\<lambda> s. getPstate s Controller' \<in> {Controller'minimalOpened', Controller'isOpened'})
(\<lambda> s. if getPstate s Controller' = Controller'minimalOpened' then ltime s Controller'
 else if getPstate s Controller' = Controller'isOpened' then ltime s Controller' + 90 else 0)
 (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 open' = True)
 (\<lambda> s3. getVarBool s3 open' = True) (\<lambda> s4. getVarBool s4 open' = False) s"

definition R5 where "R5 s \<equiv> toEnvP s \<and>
P2_2_part 10 (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 open' = True)
 (\<lambda> s3. getVarBool s3 open' = True)  s"

definition Einv5 where "Einv5 s \<equiv> commonExtraInv s \<and>
P2_2_inv_part 10 (\<lambda> s. getPstate s Controller' \<in> {Controller'minimalOpened', Controller'isOpened'})
(\<lambda> s. if getPstate s Controller' = Controller'minimalOpened' then ltime s Controller' - 1 else  9)
 (\<lambda> s1. getVarBool s1 open' = False) (\<lambda> s2. getVarBool s2 open' = True)
 (\<lambda> s3. getVarBool s3 open' = True)  s"

definition R6 where "R6 s \<equiv> toEnvP s \<and>
always_part (\<lambda> s1. getVarBool s1 opened' \<longrightarrow> getVarBool s1 enter') s"

definition Einv6 where "Einv6 s \<equiv> commonExtraInv s \<and>
always_inv_part (\<lambda> s1. getVarBool s1 opened' \<longrightarrow> getVarBool s1 enter') s"

definition R7 where "R7 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 enter' = True) (\<lambda> s2. getVarBool s2 enter' = False)
 (\<lambda> s2. getVarBool s2 reset' = True) s"

definition Einv7 where "Einv7 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s EntranceController' \<noteq> EntranceController'isOpened')
 (\<lambda> s1. getVarBool s1 enter' = True) (\<lambda> s2. getVarBool s2 enter' = False)
 (\<lambda> s2. getVarBool s2 reset' = True) s"

end