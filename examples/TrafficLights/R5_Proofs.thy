theory R5_Proofs imports Einv5_Proofs
 begin
definition R5_extended_inv where "R5_extended_inv s \<equiv> Einv5 s \<and> R5 s"

theorem extra1: "VC1 R5_extended_inv s0"
unfolding VC1_def R5_extended_inv_def Einv5_def R5_def P2_2_inv_part_used_patterns P2_2_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R5_extended_inv env s0  requestButton'value"
unfolding VC2_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv3: "VC3 R5_extended_inv env s0  requestButton'value"
unfolding VC3_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv4: "VC4 R5_extended_inv env s0  requestButton'value"
unfolding VC4_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv5: "VC5 R5_extended_inv env s0  requestButton'value"
unfolding VC5_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv6: "VC6 R5_extended_inv env s0  requestButton'value"
unfolding VC6_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv7: "VC7 R5_extended_inv env s0  requestButton'value"
unfolding VC7_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv8: "VC8 R5_extended_inv env s0  requestButton'value"
unfolding VC8_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv9: "VC9 R5_extended_inv env s0  requestButton'value"
unfolding VC9_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv10: "VC10 R5_extended_inv env s0  requestButton'value"
unfolding VC10_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv11: "VC11 R5_extended_inv env s0  requestButton'value"
unfolding VC11_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv12: "VC12 R5_extended_inv env s0  requestButton'value"
unfolding VC12_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

theorem extendedInv13: "VC13 R5_extended_inv env s0  requestButton'value"
unfolding VC13_def R5_extended_inv_def R5_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv5_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P2_2einv_imp_req)
  done

end
