theory R1_Proofs imports R1
 begin
theorem extra1: "VC1 R1_extended_inv s0"unfolding VC1_def R1_extended_inv_def extraInv1_def R1_def extraInv1_used_patternsR1_used_patterns
apply auto

theorem extendedInv2: "VC2 R1_extended_inv env s0  hands"
unfolding VC2_def R1_extended_inv_defR1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold extraInv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_inv_imp_req)
  done

theorem extendedInv3: "VC3 R1_extended_inv env s0  hands"
unfolding VC3_def R1_extended_inv_defR1_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold extraInv1_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: P1_inv_imp_req)
  done

end
