theory ExtraInv_R9
  imports CommonExtraInv "../Pattern6_Def"
begin

definition extraInv where "extraInv s \<equiv> commonExtraInv s \<and>
P6inv1 s (getPstate s Controller' = Controller'backLifting' \<and> getVarBool s up' = True) (\<lambda> s1 s2. getVarBool s1 enabled' = True \<and> getVarBool s2 enabled' = False)
(\<lambda> s3. getVarBool s3 up' = True) (\<lambda> s4. getVarBool s4  upper' = True)"

theorem extra1: "VC1 extraInv s0"
  apply(unfold VC1_def extraInv_def  P6inv1_def)
  using cei1 VC1_def by auto

theorem extra182: "VC182 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC182_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei182 VC182_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra542: "VC542 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC542_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei542 VC542_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra722: "VC722 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC722_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei722 VC722_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  apply(rule P6inv1_rule[of s0])
     apply auto
  done

theorem extra902: "VC902 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC902_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei902 VC902_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra1082: "VC1082 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC1082_def extraInv_def)
  apply simp
  done

theorem extra1262: "VC1262 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC1262_def extraInv_def)
    apply(rule impI)
  apply(rule conjI)
  using cei1262 VC1262_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  apply(rule P6inv1_rule[of s0])
     apply auto
  done

theorem extra1622: "VC1622 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC1622_def extraInv_def)
    apply(rule impI)
  apply(rule conjI)
  using cei1622 VC1622_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  apply(rule P6inv1_rule[of s0])
     apply auto
  done

theorem extra1802: "VC1802 extraInv env s0 onOff'value startButton'value rollerButton'value vibrationButton'value buttonUp'value buttonDown'value
 upper'value lower'value"
  apply(unfold VC1802_def extraInv_def)
    apply(rule impI)
  apply(rule conjI)
  using cei1802 VC1802_def apply auto[1]
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  apply(rule P6inv1_rule[of s0])
     apply auto
  done

end
