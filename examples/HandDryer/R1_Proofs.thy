theory R1_Proofs imports einv1_Proofs
 begin
definition R1_extended_inv where "R1_extended_inv s \<equiv> einv1 s \<and> R1 s"

theorem extra1: "VC1 R1_extended_inv s0"
unfolding VC1_def R1_extended_inv_def einv1_def R1_def P1_2_inv_part_used_patterns P1_2_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R1_extended_inv env s0  hands'value"
unfolding VC2_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv3: "VC3 R1_extended_inv env s0  hands'value"
unfolding VC3_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv4: "VC4 R1_extended_inv env s0  hands'value"
unfolding VC4_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv5: "VC5 R1_extended_inv env s0  hands'value"
unfolding VC5_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv6: "VC6 R1_extended_inv env s0  hands'value"
unfolding VC6_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv7: "VC7 R1_extended_inv env s0  hands'value"
unfolding VC7_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv8: "VC8 R1_extended_inv env s0  hands'value"
unfolding VC8_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

theorem extendedInv9: "VC9 R1_extended_inv env s0  hands'value"
unfolding VC9_def R1_extended_inv_def R1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold einv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_2einv_imp_req)
  done

end
