theory R1_Proofs imports Einv1_Proofs
 begin
definition R1_extended_inv where "R1_extended_inv s \<equiv> Einv1 s \<and> R1 s"

theorem extra1: "VC1 R1_extended_inv s0"
unfolding VC1_def R1_extended_inv_def Einv1_def R1_def P1_2_inv_part_used_patterns P1_2_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC2_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv3: "VC3 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC3_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv4: "VC4 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC4_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv5: "VC5 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC5_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv6: "VC6 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC6_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv7: "VC7 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC7_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv8: "VC8 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC8_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv9: "VC9 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC9_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv10: "VC10 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC10_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv11: "VC11 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC11_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv12: "VC12 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC12_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv13: "VC13 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC13_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv14: "VC14 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC14_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv15: "VC15 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC15_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv16: "VC16 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC16_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv17: "VC17 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC17_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra17 apply((auto simp add: VC17_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv18: "VC18 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC18_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra18 apply((auto simp add: VC18_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv19: "VC19 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC19_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra19 apply((auto simp add: VC19_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv20: "VC20 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC20_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra20 apply((auto simp add: VC20_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv21: "VC21 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC21_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra21 apply((auto simp add: VC21_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv22: "VC22 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC22_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra22 apply((auto simp add: VC22_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv23: "VC23 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC23_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra23 apply((auto simp add: VC23_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv24: "VC24 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC24_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra24 apply((auto simp add: VC24_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv25: "VC25 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC25_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra25 apply((auto simp add: VC25_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv26: "VC26 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC26_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra26 apply((auto simp add: VC26_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv27: "VC27 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC27_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra27 apply((auto simp add: VC27_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv28: "VC28 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC28_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra28 apply((auto simp add: VC28_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv29: "VC29 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC29_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra29 apply((auto simp add: VC29_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv30: "VC30 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC30_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra30 apply((auto simp add: VC30_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv31: "VC31 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC31_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra31 apply((auto simp add: VC31_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv32: "VC32 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC32_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra32 apply((auto simp add: VC32_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv33: "VC33 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC33_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra33 apply((auto simp add: VC33_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv34: "VC34 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC34_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra34 apply((auto simp add: VC34_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv35: "VC35 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC35_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra35 apply((auto simp add: VC35_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv36: "VC36 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC36_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra36 apply((auto simp add: VC36_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv37: "VC37 R1_extended_inv env s0  userAtTop'value userAtBottom'value directionSwitch'value alarmButton'value stuck'value"
unfolding VC37_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra37 apply((auto simp add: VC37_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

end
