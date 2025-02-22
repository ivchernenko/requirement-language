theory R3_Proofs imports Einv3_Proofs
 begin
definition R3_extended_inv where "R3_extended_inv s \<equiv> Einv3 s \<and> R3 s"

theorem extra1: "VC1 R3_extended_inv s0"
unfolding VC1_def R3_extended_inv_def Einv3_def R3_def P1_2_inv_part_used_patterns P1_2_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R3_extended_inv env s0  requestButton'value"
unfolding VC2_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv3: "VC3 R3_extended_inv env s0  requestButton'value"
unfolding VC3_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv4: "VC4 R3_extended_inv env s0  requestButton'value"
unfolding VC4_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv5: "VC5 R3_extended_inv env s0  requestButton'value"
unfolding VC5_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv6: "VC6 R3_extended_inv env s0  requestButton'value"
unfolding VC6_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv7: "VC7 R3_extended_inv env s0  requestButton'value"
unfolding VC7_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv8: "VC8 R3_extended_inv env s0  requestButton'value"
unfolding VC8_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv9: "VC9 R3_extended_inv env s0  requestButton'value"
unfolding VC9_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv10: "VC10 R3_extended_inv env s0  requestButton'value"
unfolding VC10_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv11: "VC11 R3_extended_inv env s0  requestButton'value"
unfolding VC11_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv12: "VC12 R3_extended_inv env s0  requestButton'value"
unfolding VC12_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv13: "VC13 R3_extended_inv env s0  requestButton'value"
unfolding VC13_def R3_extended_inv_def R3_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv3_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

end
