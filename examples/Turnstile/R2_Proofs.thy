theory R2_Proofs imports Einv2_Proofs 
begin
definition R2_extended_inv where "R2_extended_inv s \<equiv> Einv2 s \<and> R2 s"

theorem extra1: "VC1 R2_extended_inv s0"
unfolding VC1_def R2_extended_inv_def Einv2_def R2_def always2_inv_part_used_patterns always2_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC2_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv3: "VC3 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC3_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv4: "VC4 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC4_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv5: "VC5 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC5_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv6: "VC6 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC6_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv7: "VC7 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC7_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv8: "VC8 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC8_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv9: "VC9 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC9_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv10: "VC10 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC10_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv11: "VC11 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC11_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv12: "VC12 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC12_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv13: "VC13 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC13_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv14: "VC14 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC14_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv15: "VC15 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC15_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv16: "VC16 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC16_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv17: "VC17 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC17_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra17 apply((auto simp add: VC17_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv18: "VC18 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC18_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra18 apply((auto simp add: VC18_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv19: "VC19 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC19_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra19 apply((auto simp add: VC19_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv20: "VC20 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC20_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra20 apply((auto simp add: VC20_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv21: "VC21 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC21_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra21 apply((auto simp add: VC21_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv22: "VC22 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC22_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra22 apply((auto simp add: VC22_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv23: "VC23 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC23_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra23 apply((auto simp add: VC23_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv24: "VC24 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC24_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra24 apply((auto simp add: VC24_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

theorem extendedInv25: "VC25 R2_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC25_def R2_extended_inv_def R2_def  apply(rule impI)
  apply(rule context_conjI)
  using extra25 apply((auto simp add: VC25_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv2_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always2einv_imp_req)
  done

end
