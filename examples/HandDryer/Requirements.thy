theory Requirements
imports "../Derived_Patterns" CommonExtraInv
begin

definition R1 where
"R1 s \<equiv> toEnvP s \<and>
P1_2_part 1 (\<lambda> s1. getVarBool s1 hands' = False \<and> getVarBool s1 dryer' = False) (\<lambda> s2. getVarBool s2 hands' = True)
(\<lambda> s3. getVarBool s3 hands' = True) (\<lambda>s4. getVarBool s4 dryer' = True) s"

definition einv1 where
"einv1 s \<equiv> commonExtraInv s \<and>
P1_2_inv_part 1 (\<lambda> s. getPstate s Ctrl' = Ctrl'drying') (\<lambda> s. 0) (\<lambda> s1. getVarBool s1 hands' = False \<and> getVarBool s1 dryer' = False) (\<lambda> s2. getVarBool s2 hands' = True)
(\<lambda> s3. getVarBool s3 hands' = True) (\<lambda>s4. getVarBool s4 dryer' = True) s"

definition R2 where
"R2 s \<equiv> toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 dryer' = False) (\<lambda> s2. getVarBool s2 hands' = False)
 (\<lambda> s2. getVarBool s2 dryer' = False) s"

definition einv2 where
"einv2 s \<equiv> commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getPstate s Ctrl' = Ctrl'drying')  (\<lambda> s1. getVarBool s1 dryer' = False) (\<lambda> s2. getVarBool s2 hands' = False)
 (\<lambda> s2. getVarBool s2 dryer' = False) s"

definition R3 where
"R3 s \<equiv>
toEnvP s \<and>
P1_2_part 10 (\<lambda> s1. getVarBool s1 hands' = True \<and> getVarBool s1 dryer' = True) (\<lambda> s2. getVarBool s2 hands' = False)
(\<lambda> s3. getVarBool s3 dryer' = True \<and> getVarBool s3 hands' = False)
 (\<lambda> s4. getVarBool s4 dryer' = False \<or> getVarBool s4 hands' = True) s"

definition einv3 where
"einv3 s \<equiv>
commonExtraInv s \<and>
P1_2_inv_part 10  (\<lambda> s. getVarBool s dryer' = False)
 (\<lambda> s. if getPstate s Ctrl' = Ctrl'drying' then ltime s Ctrl' - 1 else 10) 
 (\<lambda> s1. getVarBool s1 hands' = True \<and> getVarBool s1 dryer' = True) (\<lambda> s2. getVarBool s2 hands' = False)
(\<lambda> s3. getVarBool s3 dryer' = True \<and> getVarBool s3 hands' = False)
 (\<lambda> s4. getVarBool s4 dryer' = False \<or> getVarBool s4 hands' = True) s"

definition R4 where
"R4 s \<equiv>
toEnvP s \<and>
always2_part (\<lambda> s1. getVarBool s1 dryer' = True) (\<lambda> s2. getVarBool s2 hands' = True)
 (\<lambda> s2. getVarBool s2 dryer' = True) s"

definition einv4 where
"einv4 s \<equiv>
commonExtraInv s \<and>
always2_inv_part (\<lambda> s. getVarBool s dryer' = False) 
 (\<lambda> s1. getVarBool s1 dryer' = True) (\<lambda> s2. getVarBool s2 hands' = True)
 (\<lambda> s2. getVarBool s2 dryer' = True) s"

end