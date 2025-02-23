theory R6_Proofs imports Einv6_Proofs
 begin
definition R6_extended_inv where "R6_extended_inv s \<equiv> Einv6 s \<and> R6 s"

theorem extra1: "VC1 R6_extended_inv s0"
unfolding VC1_def R6_extended_inv_def Einv6_def R6_def always_inv_part_used_patterns always_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R6_extended_inv env s0  user'value pressure'value"
unfolding VC2_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv3: "VC3 R6_extended_inv env s0  user'value pressure'value"
unfolding VC3_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv4: "VC4 R6_extended_inv env s0  user'value pressure'value"
unfolding VC4_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv5: "VC5 R6_extended_inv env s0  user'value pressure'value"
unfolding VC5_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv6: "VC6 R6_extended_inv env s0  user'value pressure'value"
unfolding VC6_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv7: "VC7 R6_extended_inv env s0  user'value pressure'value"
unfolding VC7_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv8: "VC8 R6_extended_inv env s0  user'value pressure'value"
unfolding VC8_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv9: "VC9 R6_extended_inv env s0  user'value pressure'value"
unfolding VC9_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv10: "VC10 R6_extended_inv env s0  user'value pressure'value"
unfolding VC10_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv11: "VC11 R6_extended_inv env s0  user'value pressure'value"
unfolding VC11_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv12: "VC12 R6_extended_inv env s0  user'value pressure'value"
unfolding VC12_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv13: "VC13 R6_extended_inv env s0  user'value pressure'value"
unfolding VC13_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv14: "VC14 R6_extended_inv env s0  user'value pressure'value"
unfolding VC14_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv15: "VC15 R6_extended_inv env s0  user'value pressure'value"
unfolding VC15_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

theorem extendedInv16: "VC16 R6_extended_inv env s0  user'value pressure'value"
unfolding VC16_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req)
  done

end
