theory ExtraInv_R7_2
  imports CommonExtraInv "../Patterns"
begin

definition extraInv where "extraInv s \<equiv> commonExtraInv s \<and>
(getPstate s Motion' = Motion'movement' \<longrightarrow> 
P1inv s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT) (ltime s Motion' - 1)
(\<lambda> s1. getVarBool s1 motion' = False)  (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False)  ) \<and>
(getPstate s Motion' \<noteq>  Motion'movement' \<and> getPstate s Lighting' = Lighting'morningLighting' \<longrightarrow> 
P1inv s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT) (LIGHTING_TIME'TIMEOUT + ltime s Lighting' - 1)
(\<lambda> s1. getVarBool s1 motion' = False)  (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False) ) \<and>
(getPstate s Motion' \<noteq>  Motion'movement' \<and> getPstate s Lighting' = Lighting'morningOrDay' \<longrightarrow> 
P1inv s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT) (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT)
(\<lambda> s1. getVarBool s1 motion' = False)  (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False) )  \<and>
(getPstate s Motion' \<noteq>  Motion'movement' \<and> getPstate s Lighting' \<in> {Lighting'night', Lighting'earlyMorning', Lighting'evening'} \<longrightarrow> 
P1inv s (LIGHTING_TIME'TIMEOUT + MORNING_LIGHTING_TIME'TIMEOUT) 0
(\<lambda> s1. getVarBool s1 motion' = False)  (\<lambda> s3. getVarBool s3 dayLight' = False \<and> getVarBool s3 dimLight'= False \<or> getVarBool s3 motion' = True)
(\<lambda> s2. (getVarBool s2 dayLight' = True \<or> getVarBool s2 dimLight' = True) \<and> getVarBool s2 motion' = False))"

theorem extra1: "VC1 extraInv s0"
  apply(unfold VC1_def extraInv_def commonExtraInv_def P1inv_def)
  apply auto
  done

theorem extra148: "VC148 extraInv env s0 motion_value light_value"
  apply(unfold VC148_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei148 VC148_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(auto intro: P1inv_rule[of s0])
  done

theorem extra166: "VC166 extraInv env s0 motion_value light_value"
  apply(unfold VC166_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei166 VC166_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra184: "VC184 extraInv env s0 motion_value light_value"
  apply(unfold VC184_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei184 VC184_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra202: "VC202 extraInv env s0 motion_value light_value"
  apply(unfold VC202_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei202 VC202_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(auto intro: P1inv_rule[of s0])
  done

theorem extra238: "VC238 extraInv env s0 motion_value light_value"
  apply(unfold VC238_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei238 VC238_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

theorem extra256: "VC256 extraInv env s0 motion_value light_value"
  apply(unfold VC256_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei256 VC256_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra274: "VC274 extraInv env s0 motion_value light_value"
  apply(unfold VC274_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei274 VC274_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra146: "VC146 extraInv env s0 motion_value light_value"
  apply(unfold VC146_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei146 VC146_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra147: "VC147 extraInv env s0 motion_value light_value"
  apply(unfold VC147_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei147 VC147_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra149: "VC149 extraInv env s0 motion_value light_value"
  apply(unfold VC149_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei149 VC149_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

theorem extra150: "VC150 extraInv env s0 motion_value light_value"
  apply(unfold VC150_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei150 VC150_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra151: "VC151 extraInv env s0 motion_value light_value"
  apply(unfold VC151_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei151 VC151_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra152: "VC152 extraInv env s0 motion_value light_value"
  apply(unfold VC152_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei152 VC152_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

theorem extra153: "VC153 extraInv env s0 motion_value light_value"
  apply(unfold VC153_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei153 VC153_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply(simp;(rule impI;simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

theorem extra164: "VC164 extraInv env s0 motion_value light_value"
  apply(unfold VC164_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei164 VC164_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra165: "VC165 extraInv env s0 motion_value light_value"
  apply(unfold VC165_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei165 VC165_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra167: "VC167 extraInv env s0 motion_value light_value"
  apply(unfold VC167_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei167 VC167_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply simp
  done

theorem extra168: "VC168 extraInv env s0 motion_value light_value"
  apply(unfold VC168_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei168 VC168_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply simp
  apply(rule conjI)
   apply(simp;(rule impI; simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

theorem extra169: "VC169 extraInv env s0 motion_value light_value"
  apply(unfold VC169_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei169 VC169_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply simp
  apply(rule conjI)
   apply simp
  apply(rule conjI)
   apply simp
     apply(simp;(rule impI; simp)?)
   apply(rule P1inv_rule[of s0])
     apply auto
  done

theorem extra170: "VC170 extraInv env s0 motion_value light_value"
  apply(unfold VC170_def extraInv_def)
  apply(rule impI)
  apply(rule conjI)
  using cei170 VC170_def apply auto[1]
 apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(rule conjI)
   apply simp
  apply(rule conjI)
  apply simp
  apply(rule conjI)
     apply(simp;(rule impI; simp)?)
   apply(rule P1inv_rule[of s0])
      apply auto
  done

end