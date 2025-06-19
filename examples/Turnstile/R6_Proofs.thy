theory R6_Proofs imports Einv6_Proofs 
begin
definition R6_extended_inv where "R6_extended_inv s \<equiv> Einv6 s \<and> R6 s"

theorem extra1: "VC1 R6_extended_inv s0"
unfolding VC1_def R6_extended_inv_def Einv6_def R6_def always_inv_part_used_patterns always_part_used_patterns commonExtraInv_def
by auto

theorem extendedInv2: "VC2 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC2_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv3: "VC3 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC3_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv4: "VC4 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC4_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv5: "VC5 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC5_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv6: "VC6 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC6_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv7: "VC7 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC7_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv8: "VC8 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC8_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv9: "VC9 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC9_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv10: "VC10 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC10_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv11: "VC11 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC11_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv12: "VC12 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC12_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv13: "VC13 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC13_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv14: "VC14 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC14_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv15: "VC15 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC15_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv16: "VC16 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC16_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv17: "VC17 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC17_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra17 apply((auto simp add: VC17_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv18: "VC18 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC18_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra18 apply((auto simp add: VC18_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv19: "VC19 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC19_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra19 apply((auto simp add: VC19_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv20: "VC20 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC20_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra20 apply((auto simp add: VC20_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv21: "VC21 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC21_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra21 apply((auto simp add: VC21_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv22: "VC22 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC22_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra22 apply((auto simp add: VC22_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv23: "VC23 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC23_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra23 apply((auto simp add: VC23_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv24: "VC24 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC24_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra24 apply((auto simp add: VC24_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv25: "VC25 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC25_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra25 apply((auto simp add: VC25_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv26: "VC26 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC26_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra26 apply((auto simp add: VC26_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv27: "VC27 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC27_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra27 apply((auto simp add: VC27_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv28: "VC28 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC28_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra28 apply((auto simp add: VC28_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv29: "VC29 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC29_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra29 apply((auto simp add: VC29_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv30: "VC30 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC30_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra30 apply((auto simp add: VC30_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv31: "VC31 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC31_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra31 apply((auto simp add: VC31_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv32: "VC32 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC32_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra32 apply((auto simp add: VC32_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv33: "VC33 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC33_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra33 apply((auto simp add: VC33_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv34: "VC34 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC34_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra34 apply((auto simp add: VC34_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv35: "VC35 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC35_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra35 apply((auto simp add: VC35_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv36: "VC36 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC36_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra36 apply((auto simp add: VC36_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv37: "VC37 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC37_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra37 apply((auto simp add: VC37_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv38: "VC38 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC38_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra38 apply((auto simp add: VC38_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv39: "VC39 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC39_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra39 apply((auto simp add: VC39_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv40: "VC40 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC40_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra40 apply((auto simp add: VC40_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv41: "VC41 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC41_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra41 apply((auto simp add: VC41_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv42: "VC42 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC42_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra42 apply((auto simp add: VC42_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv43: "VC43 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC43_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra43 apply((auto simp add: VC43_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv44: "VC44 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC44_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra44 apply((auto simp add: VC44_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv45: "VC45 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC45_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra45 apply((auto simp add: VC45_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv46: "VC46 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC46_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra46 apply((auto simp add: VC46_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv47: "VC47 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC47_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra47 apply((auto simp add: VC47_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv48: "VC48 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC48_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra48 apply((auto simp add: VC48_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv49: "VC49 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC49_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra49 apply((auto simp add: VC49_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv50: "VC50 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC50_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra50 apply((auto simp add: VC50_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv51: "VC51 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC51_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra51 apply((auto simp add: VC51_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv52: "VC52 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC52_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra52 apply((auto simp add: VC52_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv53: "VC53 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC53_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra53 apply((auto simp add: VC53_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv54: "VC54 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC54_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra54 apply((auto simp add: VC54_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv55: "VC55 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC55_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra55 apply((auto simp add: VC55_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv56: "VC56 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC56_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra56 apply((auto simp add: VC56_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv57: "VC57 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC57_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra57 apply((auto simp add: VC57_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv58: "VC58 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC58_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra58 apply((auto simp add: VC58_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv59: "VC59 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC59_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra59 apply((auto simp add: VC59_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv60: "VC60 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC60_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra60 apply((auto simp add: VC60_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv61: "VC61 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC61_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra61 apply((auto simp add: VC61_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv62: "VC62 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC62_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra62 apply((auto simp add: VC62_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv63: "VC63 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC63_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra63 apply((auto simp add: VC63_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv64: "VC64 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC64_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra64 apply((auto simp add: VC64_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv65: "VC65 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC65_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra65 apply((auto simp add: VC65_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv66: "VC66 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC66_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra66 apply((auto simp add: VC66_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv67: "VC67 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC67_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra67 apply((auto simp add: VC67_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv68: "VC68 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC68_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra68 apply((auto simp add: VC68_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv69: "VC69 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC69_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra69 apply((auto simp add: VC69_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv70: "VC70 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC70_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra70 apply((auto simp add: VC70_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv71: "VC71 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC71_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra71 apply((auto simp add: VC71_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv72: "VC72 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC72_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra72 apply((auto simp add: VC72_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv73: "VC73 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC73_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra73 apply((auto simp add: VC73_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv74: "VC74 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC74_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra74 apply((auto simp add: VC74_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv75: "VC75 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC75_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra75 apply((auto simp add: VC75_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv76: "VC76 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC76_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra76 apply((auto simp add: VC76_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv77: "VC77 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC77_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra77 apply((auto simp add: VC77_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv78: "VC78 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC78_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra78 apply((auto simp add: VC78_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv79: "VC79 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC79_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra79 apply((auto simp add: VC79_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv80: "VC80 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC80_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra80 apply((auto simp add: VC80_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv81: "VC81 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC81_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra81 apply((auto simp add: VC81_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv82: "VC82 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC82_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra82 apply((auto simp add: VC82_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv83: "VC83 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC83_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra83 apply((auto simp add: VC83_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv84: "VC84 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC84_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra84 apply((auto simp add: VC84_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv85: "VC85 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC85_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra85 apply((auto simp add: VC85_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv86: "VC86 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC86_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra86 apply((auto simp add: VC86_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv87: "VC87 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC87_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra87 apply((auto simp add: VC87_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv88: "VC88 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC88_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra88 apply((auto simp add: VC88_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv89: "VC89 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC89_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra89 apply((auto simp add: VC89_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv90: "VC90 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC90_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra90 apply((auto simp add: VC90_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv91: "VC91 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC91_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra91 apply((auto simp add: VC91_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv92: "VC92 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC92_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra92 apply((auto simp add: VC92_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv93: "VC93 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC93_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra93 apply((auto simp add: VC93_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv94: "VC94 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC94_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra94 apply((auto simp add: VC94_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv95: "VC95 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC95_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra95 apply((auto simp add: VC95_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv96: "VC96 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC96_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra96 apply((auto simp add: VC96_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv97: "VC97 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC97_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra97 apply((auto simp add: VC97_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv98: "VC98 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC98_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra98 apply((auto simp add: VC98_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv99: "VC99 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC99_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra99 apply((auto simp add: VC99_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv100: "VC100 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC100_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra100 apply((auto simp add: VC100_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv101: "VC101 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC101_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra101 apply((auto simp add: VC101_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv102: "VC102 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC102_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra102 apply((auto simp add: VC102_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv103: "VC103 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC103_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra103 apply((auto simp add: VC103_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv104: "VC104 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC104_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra104 apply((auto simp add: VC104_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv105: "VC105 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC105_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra105 apply((auto simp add: VC105_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv106: "VC106 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC106_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra106 apply((auto simp add: VC106_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv107: "VC107 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC107_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra107 apply((auto simp add: VC107_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv108: "VC108 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC108_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra108 apply((auto simp add: VC108_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv109: "VC109 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC109_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra109 apply((auto simp add: VC109_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv110: "VC110 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC110_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra110 apply((auto simp add: VC110_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv111: "VC111 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC111_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra111 apply((auto simp add: VC111_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv112: "VC112 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC112_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra112 apply((auto simp add: VC112_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv113: "VC113 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC113_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra113 apply((auto simp add: VC113_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv114: "VC114 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC114_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra114 apply((auto simp add: VC114_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv115: "VC115 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC115_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra115 apply((auto simp add: VC115_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv116: "VC116 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC116_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra116 apply((auto simp add: VC116_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv117: "VC117 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC117_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra117 apply((auto simp add: VC117_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv118: "VC118 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC118_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra118 apply((auto simp add: VC118_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv119: "VC119 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC119_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra119 apply((auto simp add: VC119_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv120: "VC120 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC120_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra120 apply((auto simp add: VC120_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv121: "VC121 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC121_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra121 apply((auto simp add: VC121_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv122: "VC122 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC122_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra122 apply((auto simp add: VC122_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv123: "VC123 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC123_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra123 apply((auto simp add: VC123_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv124: "VC124 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC124_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra124 apply((auto simp add: VC124_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv125: "VC125 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC125_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra125 apply((auto simp add: VC125_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv126: "VC126 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC126_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra126 apply((auto simp add: VC126_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv127: "VC127 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC127_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra127 apply((auto simp add: VC127_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv128: "VC128 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC128_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra128 apply((auto simp add: VC128_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv129: "VC129 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC129_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra129 apply((auto simp add: VC129_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv130: "VC130 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC130_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra130 apply((auto simp add: VC130_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv131: "VC131 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC131_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra131 apply((auto simp add: VC131_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv132: "VC132 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC132_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra132 apply((auto simp add: VC132_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv133: "VC133 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC133_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra133 apply((auto simp add: VC133_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv134: "VC134 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC134_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra134 apply((auto simp add: VC134_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv135: "VC135 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC135_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra135 apply((auto simp add: VC135_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv136: "VC136 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC136_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra136 apply((auto simp add: VC136_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv137: "VC137 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC137_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra137 apply((auto simp add: VC137_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv138: "VC138 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC138_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra138 apply((auto simp add: VC138_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv139: "VC139 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC139_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra139 apply((auto simp add: VC139_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv140: "VC140 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC140_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra140 apply((auto simp add: VC140_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv141: "VC141 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC141_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra141 apply((auto simp add: VC141_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv142: "VC142 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC142_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra142 apply((auto simp add: VC142_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv143: "VC143 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC143_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra143 apply((auto simp add: VC143_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv144: "VC144 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC144_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra144 apply((auto simp add: VC144_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv145: "VC145 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC145_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra145 apply((auto simp add: VC145_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv146: "VC146 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC146_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra146 apply((auto simp add: VC146_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv147: "VC147 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC147_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra147 apply((auto simp add: VC147_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv148: "VC148 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC148_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra148 apply((auto simp add: VC148_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv149: "VC149 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC149_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra149 apply((auto simp add: VC149_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv150: "VC150 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC150_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra150 apply((auto simp add: VC150_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv151: "VC151 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC151_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra151 apply((auto simp add: VC151_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv152: "VC152 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC152_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra152 apply((auto simp add: VC152_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv153: "VC153 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC153_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra153 apply((auto simp add: VC153_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv154: "VC154 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC154_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra154 apply((auto simp add: VC154_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv155: "VC155 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC155_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra155 apply((auto simp add: VC155_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv156: "VC156 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC156_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra156 apply((auto simp add: VC156_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv157: "VC157 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC157_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra157 apply((auto simp add: VC157_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv158: "VC158 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC158_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra158 apply((auto simp add: VC158_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv159: "VC159 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC159_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra159 apply((auto simp add: VC159_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv160: "VC160 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC160_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra160 apply((auto simp add: VC160_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv161: "VC161 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC161_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra161 apply((auto simp add: VC161_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv162: "VC162 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC162_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra162 apply((auto simp add: VC162_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv163: "VC163 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC163_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra163 apply((auto simp add: VC163_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv164: "VC164 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC164_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra164 apply((auto simp add: VC164_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv165: "VC165 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC165_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra165 apply((auto simp add: VC165_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv166: "VC166 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC166_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra166 apply((auto simp add: VC166_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv167: "VC167 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC167_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra167 apply((auto simp add: VC167_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv168: "VC168 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC168_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra168 apply((auto simp add: VC168_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv169: "VC169 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC169_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra169 apply((auto simp add: VC169_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv170: "VC170 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC170_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra170 apply((auto simp add: VC170_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv171: "VC171 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC171_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra171 apply((auto simp add: VC171_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv172: "VC172 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC172_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra172 apply((auto simp add: VC172_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv173: "VC173 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC173_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra173 apply((auto simp add: VC173_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv174: "VC174 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC174_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra174 apply((auto simp add: VC174_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv175: "VC175 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC175_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra175 apply((auto simp add: VC175_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv176: "VC176 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC176_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra176 apply((auto simp add: VC176_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv177: "VC177 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC177_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra177 apply((auto simp add: VC177_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv178: "VC178 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC178_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra178 apply((auto simp add: VC178_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv179: "VC179 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC179_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra179 apply((auto simp add: VC179_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv180: "VC180 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC180_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra180 apply((auto simp add: VC180_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv181: "VC181 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC181_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra181 apply((auto simp add: VC181_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv182: "VC182 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC182_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra182 apply((auto simp add: VC182_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv183: "VC183 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC183_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra183 apply((auto simp add: VC183_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv184: "VC184 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC184_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra184 apply((auto simp add: VC184_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv185: "VC185 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC185_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra185 apply((auto simp add: VC185_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv186: "VC186 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC186_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra186 apply((auto simp add: VC186_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv187: "VC187 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC187_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra187 apply((auto simp add: VC187_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv188: "VC188 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC188_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra188 apply((auto simp add: VC188_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv189: "VC189 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC189_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra189 apply((auto simp add: VC189_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv190: "VC190 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC190_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra190 apply((auto simp add: VC190_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv191: "VC191 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC191_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra191 apply((auto simp add: VC191_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv192: "VC192 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC192_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra192 apply((auto simp add: VC192_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv193: "VC193 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC193_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra193 apply((auto simp add: VC193_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv194: "VC194 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC194_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra194 apply((auto simp add: VC194_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv195: "VC195 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC195_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra195 apply((auto simp add: VC195_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv196: "VC196 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC196_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra196 apply((auto simp add: VC196_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv197: "VC197 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC197_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra197 apply((auto simp add: VC197_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv198: "VC198 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC198_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra198 apply((auto simp add: VC198_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv199: "VC199 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC199_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra199 apply((auto simp add: VC199_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv200: "VC200 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC200_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra200 apply((auto simp add: VC200_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv201: "VC201 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC201_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra201 apply((auto simp add: VC201_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv202: "VC202 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC202_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra202 apply((auto simp add: VC202_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv203: "VC203 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC203_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra203 apply((auto simp add: VC203_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv204: "VC204 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC204_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra204 apply((auto simp add: VC204_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv205: "VC205 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC205_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra205 apply((auto simp add: VC205_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv206: "VC206 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC206_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra206 apply((auto simp add: VC206_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv207: "VC207 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC207_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra207 apply((auto simp add: VC207_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv208: "VC208 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC208_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra208 apply((auto simp add: VC208_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv209: "VC209 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC209_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra209 apply((auto simp add: VC209_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv210: "VC210 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC210_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra210 apply((auto simp add: VC210_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv211: "VC211 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC211_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra211 apply((auto simp add: VC211_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv212: "VC212 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC212_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra212 apply((auto simp add: VC212_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv213: "VC213 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC213_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra213 apply((auto simp add: VC213_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv214: "VC214 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC214_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra214 apply((auto simp add: VC214_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv215: "VC215 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC215_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra215 apply((auto simp add: VC215_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv216: "VC216 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC216_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra216 apply((auto simp add: VC216_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv217: "VC217 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC217_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra217 apply((auto simp add: VC217_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv218: "VC218 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC218_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra218 apply((auto simp add: VC218_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv219: "VC219 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC219_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra219 apply((auto simp add: VC219_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv220: "VC220 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC220_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra220 apply((auto simp add: VC220_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv221: "VC221 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC221_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra221 apply((auto simp add: VC221_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv222: "VC222 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC222_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra222 apply((auto simp add: VC222_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv223: "VC223 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC223_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra223 apply((auto simp add: VC223_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv224: "VC224 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC224_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra224 apply((auto simp add: VC224_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv225: "VC225 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC225_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra225 apply((auto simp add: VC225_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv226: "VC226 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC226_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra226 apply((auto simp add: VC226_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv227: "VC227 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC227_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra227 apply((auto simp add: VC227_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv228: "VC228 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC228_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra228 apply((auto simp add: VC228_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv229: "VC229 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC229_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra229 apply((auto simp add: VC229_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv230: "VC230 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC230_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra230 apply((auto simp add: VC230_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv231: "VC231 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC231_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra231 apply((auto simp add: VC231_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv232: "VC232 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC232_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra232 apply((auto simp add: VC232_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv233: "VC233 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC233_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra233 apply((auto simp add: VC233_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv234: "VC234 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC234_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra234 apply((auto simp add: VC234_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv235: "VC235 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC235_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra235 apply((auto simp add: VC235_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv236: "VC236 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC236_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra236 apply((auto simp add: VC236_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv237: "VC237 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC237_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra237 apply((auto simp add: VC237_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv238: "VC238 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC238_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra238 apply((auto simp add: VC238_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv239: "VC239 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC239_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra239 apply((auto simp add: VC239_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv240: "VC240 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC240_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra240 apply((auto simp add: VC240_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv241: "VC241 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC241_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra241 apply((auto simp add: VC241_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv242: "VC242 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC242_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra242 apply((auto simp add: VC242_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv243: "VC243 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC243_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra243 apply((auto simp add: VC243_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv244: "VC244 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC244_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra244 apply((auto simp add: VC244_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv245: "VC245 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC245_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra245 apply((auto simp add: VC245_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv246: "VC246 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC246_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra246 apply((auto simp add: VC246_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv247: "VC247 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC247_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra247 apply((auto simp add: VC247_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv248: "VC248 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC248_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra248 apply((auto simp add: VC248_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv249: "VC249 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC249_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra249 apply((auto simp add: VC249_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv250: "VC250 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC250_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra250 apply((auto simp add: VC250_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv251: "VC251 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC251_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra251 apply((auto simp add: VC251_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv252: "VC252 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC252_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra252 apply((auto simp add: VC252_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv253: "VC253 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC253_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra253 apply((auto simp add: VC253_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv254: "VC254 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC254_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra254 apply((auto simp add: VC254_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv255: "VC255 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC255_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra255 apply((auto simp add: VC255_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv256: "VC256 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC256_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra256 apply((auto simp add: VC256_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv257: "VC257 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC257_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra257 apply((auto simp add: VC257_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv258: "VC258 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC258_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra258 apply((auto simp add: VC258_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv259: "VC259 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC259_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra259 apply((auto simp add: VC259_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv260: "VC260 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC260_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra260 apply((auto simp add: VC260_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv261: "VC261 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC261_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra261 apply((auto simp add: VC261_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv262: "VC262 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC262_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra262 apply((auto simp add: VC262_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv263: "VC263 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC263_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra263 apply((auto simp add: VC263_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv264: "VC264 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC264_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra264 apply((auto simp add: VC264_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv265: "VC265 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC265_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra265 apply((auto simp add: VC265_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv266: "VC266 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC266_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra266 apply((auto simp add: VC266_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv267: "VC267 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC267_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra267 apply((auto simp add: VC267_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv268: "VC268 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC268_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra268 apply((auto simp add: VC268_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv269: "VC269 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC269_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra269 apply((auto simp add: VC269_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv270: "VC270 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC270_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra270 apply((auto simp add: VC270_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv271: "VC271 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC271_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra271 apply((auto simp add: VC271_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv272: "VC272 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC272_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra272 apply((auto simp add: VC272_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv273: "VC273 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC273_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra273 apply((auto simp add: VC273_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv274: "VC274 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC274_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra274 apply((auto simp add: VC274_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv275: "VC275 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC275_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra275 apply((auto simp add: VC275_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv276: "VC276 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC276_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra276 apply((auto simp add: VC276_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv277: "VC277 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC277_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra277 apply((auto simp add: VC277_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv278: "VC278 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC278_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra278 apply((auto simp add: VC278_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv279: "VC279 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC279_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra279 apply((auto simp add: VC279_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv280: "VC280 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC280_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra280 apply((auto simp add: VC280_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv281: "VC281 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC281_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra281 apply((auto simp add: VC281_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv282: "VC282 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC282_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra282 apply((auto simp add: VC282_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv283: "VC283 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC283_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra283 apply((auto simp add: VC283_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv284: "VC284 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC284_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra284 apply((auto simp add: VC284_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv285: "VC285 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC285_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra285 apply((auto simp add: VC285_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv286: "VC286 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC286_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra286 apply((auto simp add: VC286_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv287: "VC287 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC287_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra287 apply((auto simp add: VC287_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv288: "VC288 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC288_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra288 apply((auto simp add: VC288_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv289: "VC289 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC289_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra289 apply((auto simp add: VC289_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv290: "VC290 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC290_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra290 apply((auto simp add: VC290_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv291: "VC291 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC291_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra291 apply((auto simp add: VC291_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv292: "VC292 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC292_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra292 apply((auto simp add: VC292_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv293: "VC293 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC293_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra293 apply((auto simp add: VC293_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv294: "VC294 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC294_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra294 apply((auto simp add: VC294_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv295: "VC295 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC295_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra295 apply((auto simp add: VC295_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv296: "VC296 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC296_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra296 apply((auto simp add: VC296_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv297: "VC297 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC297_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra297 apply((auto simp add: VC297_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv298: "VC298 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC298_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra298 apply((auto simp add: VC298_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv299: "VC299 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC299_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra299 apply((auto simp add: VC299_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv300: "VC300 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC300_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra300 apply((auto simp add: VC300_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv301: "VC301 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC301_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra301 apply((auto simp add: VC301_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv302: "VC302 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC302_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra302 apply((auto simp add: VC302_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv303: "VC303 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC303_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra303 apply((auto simp add: VC303_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv304: "VC304 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC304_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra304 apply((auto simp add: VC304_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv305: "VC305 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC305_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra305 apply((auto simp add: VC305_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv306: "VC306 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC306_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra306 apply((auto simp add: VC306_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv307: "VC307 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC307_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra307 apply((auto simp add: VC307_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv308: "VC308 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC308_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra308 apply((auto simp add: VC308_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv309: "VC309 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC309_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra309 apply((auto simp add: VC309_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv310: "VC310 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC310_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra310 apply((auto simp add: VC310_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv311: "VC311 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC311_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra311 apply((auto simp add: VC311_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv312: "VC312 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC312_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra312 apply((auto simp add: VC312_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv313: "VC313 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC313_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra313 apply((auto simp add: VC313_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv314: "VC314 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC314_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra314 apply((auto simp add: VC314_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv315: "VC315 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC315_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra315 apply((auto simp add: VC315_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv316: "VC316 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC316_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra316 apply((auto simp add: VC316_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv317: "VC317 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC317_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra317 apply((auto simp add: VC317_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv318: "VC318 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC318_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra318 apply((auto simp add: VC318_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv319: "VC319 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC319_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra319 apply((auto simp add: VC319_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv320: "VC320 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC320_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra320 apply((auto simp add: VC320_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv321: "VC321 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC321_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra321 apply((auto simp add: VC321_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv322: "VC322 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC322_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra322 apply((auto simp add: VC322_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv323: "VC323 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC323_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra323 apply((auto simp add: VC323_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv324: "VC324 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC324_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra324 apply((auto simp add: VC324_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv325: "VC325 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC325_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra325 apply((auto simp add: VC325_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv326: "VC326 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC326_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra326 apply((auto simp add: VC326_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv327: "VC327 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC327_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra327 apply((auto simp add: VC327_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv328: "VC328 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC328_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra328 apply((auto simp add: VC328_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv329: "VC329 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC329_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra329 apply((auto simp add: VC329_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv330: "VC330 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC330_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra330 apply((auto simp add: VC330_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv331: "VC331 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC331_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra331 apply((auto simp add: VC331_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv332: "VC332 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC332_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra332 apply((auto simp add: VC332_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv333: "VC333 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC333_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra333 apply((auto simp add: VC333_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv334: "VC334 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC334_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra334 apply((auto simp add: VC334_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv335: "VC335 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC335_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra335 apply((auto simp add: VC335_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv336: "VC336 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC336_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra336 apply((auto simp add: VC336_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv337: "VC337 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC337_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra337 apply((auto simp add: VC337_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv338: "VC338 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC338_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra338 apply((auto simp add: VC338_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv339: "VC339 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC339_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra339 apply((auto simp add: VC339_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv340: "VC340 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC340_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra340 apply((auto simp add: VC340_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv341: "VC341 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC341_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra341 apply((auto simp add: VC341_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv342: "VC342 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC342_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra342 apply((auto simp add: VC342_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv343: "VC343 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC343_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra343 apply((auto simp add: VC343_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv344: "VC344 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC344_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra344 apply((auto simp add: VC344_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv345: "VC345 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC345_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra345 apply((auto simp add: VC345_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv346: "VC346 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC346_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra346 apply((auto simp add: VC346_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv347: "VC347 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC347_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra347 apply((auto simp add: VC347_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv348: "VC348 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC348_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra348 apply((auto simp add: VC348_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv349: "VC349 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC349_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra349 apply((auto simp add: VC349_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv350: "VC350 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC350_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra350 apply((auto simp add: VC350_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv351: "VC351 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC351_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra351 apply((auto simp add: VC351_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv352: "VC352 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC352_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra352 apply((auto simp add: VC352_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv353: "VC353 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC353_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra353 apply((auto simp add: VC353_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv354: "VC354 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC354_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra354 apply((auto simp add: VC354_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv355: "VC355 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC355_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra355 apply((auto simp add: VC355_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv356: "VC356 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC356_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra356 apply((auto simp add: VC356_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv357: "VC357 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC357_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra357 apply((auto simp add: VC357_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv358: "VC358 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC358_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra358 apply((auto simp add: VC358_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv359: "VC359 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC359_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra359 apply((auto simp add: VC359_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv360: "VC360 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC360_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra360 apply((auto simp add: VC360_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv361: "VC361 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC361_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra361 apply((auto simp add: VC361_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv362: "VC362 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC362_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra362 apply((auto simp add: VC362_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv363: "VC363 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC363_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra363 apply((auto simp add: VC363_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv364: "VC364 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC364_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra364 apply((auto simp add: VC364_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv365: "VC365 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC365_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra365 apply((auto simp add: VC365_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv366: "VC366 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC366_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra366 apply((auto simp add: VC366_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv367: "VC367 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC367_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra367 apply((auto simp add: VC367_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv368: "VC368 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC368_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra368 apply((auto simp add: VC368_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv369: "VC369 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC369_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra369 apply((auto simp add: VC369_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv370: "VC370 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC370_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra370 apply((auto simp add: VC370_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv371: "VC371 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC371_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra371 apply((auto simp add: VC371_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv372: "VC372 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC372_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra372 apply((auto simp add: VC372_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv373: "VC373 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC373_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra373 apply((auto simp add: VC373_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv374: "VC374 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC374_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra374 apply((auto simp add: VC374_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv375: "VC375 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC375_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra375 apply((auto simp add: VC375_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv376: "VC376 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC376_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra376 apply((auto simp add: VC376_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv377: "VC377 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC377_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra377 apply((auto simp add: VC377_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv378: "VC378 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC378_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra378 apply((auto simp add: VC378_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv379: "VC379 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC379_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra379 apply((auto simp add: VC379_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv380: "VC380 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC380_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra380 apply((auto simp add: VC380_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv381: "VC381 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC381_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra381 apply((auto simp add: VC381_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv382: "VC382 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC382_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra382 apply((auto simp add: VC382_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv383: "VC383 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC383_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra383 apply((auto simp add: VC383_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv384: "VC384 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC384_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra384 apply((auto simp add: VC384_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv385: "VC385 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC385_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra385 apply((auto simp add: VC385_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv386: "VC386 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC386_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra386 apply((auto simp add: VC386_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv387: "VC387 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC387_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra387 apply((auto simp add: VC387_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv388: "VC388 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC388_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra388 apply((auto simp add: VC388_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv389: "VC389 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC389_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra389 apply((auto simp add: VC389_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv390: "VC390 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC390_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra390 apply((auto simp add: VC390_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv391: "VC391 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC391_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra391 apply((auto simp add: VC391_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv392: "VC392 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC392_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra392 apply((auto simp add: VC392_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv393: "VC393 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC393_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra393 apply((auto simp add: VC393_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv394: "VC394 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC394_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra394 apply((auto simp add: VC394_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv395: "VC395 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC395_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra395 apply((auto simp add: VC395_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv396: "VC396 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC396_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra396 apply((auto simp add: VC396_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv397: "VC397 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC397_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra397 apply((auto simp add: VC397_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv398: "VC398 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC398_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra398 apply((auto simp add: VC398_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv399: "VC399 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC399_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra399 apply((auto simp add: VC399_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv400: "VC400 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC400_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra400 apply((auto simp add: VC400_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv401: "VC401 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC401_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra401 apply((auto simp add: VC401_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv402: "VC402 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC402_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra402 apply((auto simp add: VC402_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv403: "VC403 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC403_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra403 apply((auto simp add: VC403_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv404: "VC404 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC404_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra404 apply((auto simp add: VC404_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv405: "VC405 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC405_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra405 apply((auto simp add: VC405_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv406: "VC406 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC406_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra406 apply((auto simp add: VC406_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv407: "VC407 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC407_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra407 apply((auto simp add: VC407_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv408: "VC408 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC408_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra408 apply((auto simp add: VC408_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv409: "VC409 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC409_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra409 apply((auto simp add: VC409_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv410: "VC410 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC410_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra410 apply((auto simp add: VC410_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv411: "VC411 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC411_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra411 apply((auto simp add: VC411_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv412: "VC412 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC412_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra412 apply((auto simp add: VC412_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv413: "VC413 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC413_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra413 apply((auto simp add: VC413_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv414: "VC414 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC414_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra414 apply((auto simp add: VC414_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv415: "VC415 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC415_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra415 apply((auto simp add: VC415_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv416: "VC416 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC416_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra416 apply((auto simp add: VC416_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv417: "VC417 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC417_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra417 apply((auto simp add: VC417_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv418: "VC418 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC418_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra418 apply((auto simp add: VC418_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv419: "VC419 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC419_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra419 apply((auto simp add: VC419_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv420: "VC420 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC420_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra420 apply((auto simp add: VC420_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv421: "VC421 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC421_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra421 apply((auto simp add: VC421_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv422: "VC422 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC422_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra422 apply((auto simp add: VC422_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv423: "VC423 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC423_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra423 apply((auto simp add: VC423_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv424: "VC424 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC424_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra424 apply((auto simp add: VC424_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv425: "VC425 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC425_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra425 apply((auto simp add: VC425_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv426: "VC426 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC426_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra426 apply((auto simp add: VC426_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv427: "VC427 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC427_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra427 apply((auto simp add: VC427_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv428: "VC428 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC428_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra428 apply((auto simp add: VC428_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv429: "VC429 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC429_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra429 apply((auto simp add: VC429_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv430: "VC430 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC430_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra430 apply((auto simp add: VC430_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv431: "VC431 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC431_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra431 apply((auto simp add: VC431_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv432: "VC432 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC432_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra432 apply((auto simp add: VC432_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv433: "VC433 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC433_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra433 apply((auto simp add: VC433_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv434: "VC434 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC434_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra434 apply((auto simp add: VC434_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv435: "VC435 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC435_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra435 apply((auto simp add: VC435_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv436: "VC436 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC436_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra436 apply((auto simp add: VC436_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv437: "VC437 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC437_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra437 apply((auto simp add: VC437_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv438: "VC438 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC438_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra438 apply((auto simp add: VC438_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv439: "VC439 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC439_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra439 apply((auto simp add: VC439_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv440: "VC440 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC440_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra440 apply((auto simp add: VC440_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv441: "VC441 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC441_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra441 apply((auto simp add: VC441_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv442: "VC442 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC442_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra442 apply((auto simp add: VC442_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv443: "VC443 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC443_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra443 apply((auto simp add: VC443_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv444: "VC444 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC444_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra444 apply((auto simp add: VC444_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv445: "VC445 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC445_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra445 apply((auto simp add: VC445_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv446: "VC446 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC446_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra446 apply((auto simp add: VC446_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv447: "VC447 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC447_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra447 apply((auto simp add: VC447_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv448: "VC448 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC448_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra448 apply((auto simp add: VC448_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv449: "VC449 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC449_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra449 apply((auto simp add: VC449_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv450: "VC450 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC450_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra450 apply((auto simp add: VC450_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv451: "VC451 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC451_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra451 apply((auto simp add: VC451_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv452: "VC452 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC452_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra452 apply((auto simp add: VC452_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv453: "VC453 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC453_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra453 apply((auto simp add: VC453_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv454: "VC454 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC454_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra454 apply((auto simp add: VC454_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv455: "VC455 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC455_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra455 apply((auto simp add: VC455_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv456: "VC456 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC456_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra456 apply((auto simp add: VC456_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv457: "VC457 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC457_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra457 apply((auto simp add: VC457_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv458: "VC458 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC458_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra458 apply((auto simp add: VC458_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv459: "VC459 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC459_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra459 apply((auto simp add: VC459_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv460: "VC460 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC460_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra460 apply((auto simp add: VC460_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv461: "VC461 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC461_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra461 apply((auto simp add: VC461_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv462: "VC462 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC462_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra462 apply((auto simp add: VC462_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv463: "VC463 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC463_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra463 apply((auto simp add: VC463_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv464: "VC464 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC464_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra464 apply((auto simp add: VC464_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv465: "VC465 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC465_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra465 apply((auto simp add: VC465_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv466: "VC466 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC466_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra466 apply((auto simp add: VC466_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv467: "VC467 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC467_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra467 apply((auto simp add: VC467_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv468: "VC468 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC468_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra468 apply((auto simp add: VC468_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv469: "VC469 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC469_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra469 apply((auto simp add: VC469_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv470: "VC470 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC470_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra470 apply((auto simp add: VC470_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv471: "VC471 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC471_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra471 apply((auto simp add: VC471_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv472: "VC472 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC472_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra472 apply((auto simp add: VC472_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv473: "VC473 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC473_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra473 apply((auto simp add: VC473_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv474: "VC474 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC474_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra474 apply((auto simp add: VC474_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv475: "VC475 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC475_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra475 apply((auto simp add: VC475_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv476: "VC476 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC476_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra476 apply((auto simp add: VC476_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv477: "VC477 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC477_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra477 apply((auto simp add: VC477_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv478: "VC478 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC478_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra478 apply((auto simp add: VC478_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv479: "VC479 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC479_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra479 apply((auto simp add: VC479_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv480: "VC480 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC480_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra480 apply((auto simp add: VC480_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv481: "VC481 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC481_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra481 apply((auto simp add: VC481_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv482: "VC482 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC482_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra482 apply((auto simp add: VC482_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv483: "VC483 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC483_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra483 apply((auto simp add: VC483_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv484: "VC484 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC484_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra484 apply((auto simp add: VC484_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv485: "VC485 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC485_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra485 apply((auto simp add: VC485_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv486: "VC486 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC486_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra486 apply((auto simp add: VC486_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv487: "VC487 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC487_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra487 apply((auto simp add: VC487_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv488: "VC488 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC488_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra488 apply((auto simp add: VC488_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv489: "VC489 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC489_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra489 apply((auto simp add: VC489_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv490: "VC490 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC490_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra490 apply((auto simp add: VC490_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv491: "VC491 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC491_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra491 apply((auto simp add: VC491_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv492: "VC492 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC492_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra492 apply((auto simp add: VC492_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv493: "VC493 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC493_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra493 apply((auto simp add: VC493_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv494: "VC494 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC494_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra494 apply((auto simp add: VC494_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv495: "VC495 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC495_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra495 apply((auto simp add: VC495_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv496: "VC496 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC496_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra496 apply((auto simp add: VC496_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv497: "VC497 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC497_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra497 apply((auto simp add: VC497_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv498: "VC498 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC498_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra498 apply((auto simp add: VC498_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv499: "VC499 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC499_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra499 apply((auto simp add: VC499_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv500: "VC500 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC500_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra500 apply((auto simp add: VC500_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv501: "VC501 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC501_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra501 apply((auto simp add: VC501_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv502: "VC502 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC502_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra502 apply((auto simp add: VC502_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv503: "VC503 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC503_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra503 apply((auto simp add: VC503_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv504: "VC504 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC504_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra504 apply((auto simp add: VC504_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv505: "VC505 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC505_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra505 apply((auto simp add: VC505_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv506: "VC506 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC506_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra506 apply((auto simp add: VC506_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv507: "VC507 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC507_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra507 apply((auto simp add: VC507_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv508: "VC508 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC508_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra508 apply((auto simp add: VC508_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv509: "VC509 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC509_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra509 apply((auto simp add: VC509_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv510: "VC510 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC510_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra510 apply((auto simp add: VC510_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv511: "VC511 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC511_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra511 apply((auto simp add: VC511_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv512: "VC512 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC512_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra512 apply((auto simp add: VC512_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv513: "VC513 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC513_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra513 apply((auto simp add: VC513_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv514: "VC514 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC514_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra514 apply((auto simp add: VC514_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv515: "VC515 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC515_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra515 apply((auto simp add: VC515_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv516: "VC516 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC516_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra516 apply((auto simp add: VC516_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv517: "VC517 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC517_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra517 apply((auto simp add: VC517_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv518: "VC518 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC518_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra518 apply((auto simp add: VC518_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv519: "VC519 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC519_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra519 apply((auto simp add: VC519_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv520: "VC520 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC520_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra520 apply((auto simp add: VC520_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv521: "VC521 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC521_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra521 apply((auto simp add: VC521_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv522: "VC522 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC522_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra522 apply((auto simp add: VC522_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv523: "VC523 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC523_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra523 apply((auto simp add: VC523_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv524: "VC524 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC524_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra524 apply((auto simp add: VC524_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv525: "VC525 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC525_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra525 apply((auto simp add: VC525_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv526: "VC526 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC526_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra526 apply((auto simp add: VC526_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv527: "VC527 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC527_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra527 apply((auto simp add: VC527_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv528: "VC528 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC528_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra528 apply((auto simp add: VC528_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv529: "VC529 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC529_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra529 apply((auto simp add: VC529_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv530: "VC530 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC530_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra530 apply((auto simp add: VC530_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv531: "VC531 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC531_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra531 apply((auto simp add: VC531_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv532: "VC532 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC532_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra532 apply((auto simp add: VC532_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv533: "VC533 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC533_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra533 apply((auto simp add: VC533_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv534: "VC534 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC534_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra534 apply((auto simp add: VC534_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv535: "VC535 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC535_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra535 apply((auto simp add: VC535_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv536: "VC536 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC536_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra536 apply((auto simp add: VC536_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv537: "VC537 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC537_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra537 apply((auto simp add: VC537_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv538: "VC538 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC538_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra538 apply((auto simp add: VC538_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv539: "VC539 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC539_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra539 apply((auto simp add: VC539_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv540: "VC540 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC540_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra540 apply((auto simp add: VC540_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv541: "VC541 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC541_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra541 apply((auto simp add: VC541_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv542: "VC542 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC542_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra542 apply((auto simp add: VC542_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv543: "VC543 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC543_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra543 apply((auto simp add: VC543_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv544: "VC544 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC544_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra544 apply((auto simp add: VC544_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv545: "VC545 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC545_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra545 apply((auto simp add: VC545_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv546: "VC546 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC546_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra546 apply((auto simp add: VC546_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv547: "VC547 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC547_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra547 apply((auto simp add: VC547_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv548: "VC548 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC548_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra548 apply((auto simp add: VC548_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv549: "VC549 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC549_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra549 apply((auto simp add: VC549_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv550: "VC550 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC550_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra550 apply((auto simp add: VC550_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv551: "VC551 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC551_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra551 apply((auto simp add: VC551_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv552: "VC552 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC552_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra552 apply((auto simp add: VC552_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv553: "VC553 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC553_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra553 apply((auto simp add: VC553_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv554: "VC554 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC554_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra554 apply((auto simp add: VC554_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv555: "VC555 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC555_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra555 apply((auto simp add: VC555_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv556: "VC556 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC556_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra556 apply((auto simp add: VC556_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv557: "VC557 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC557_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra557 apply((auto simp add: VC557_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv558: "VC558 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC558_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra558 apply((auto simp add: VC558_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv559: "VC559 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC559_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra559 apply((auto simp add: VC559_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv560: "VC560 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC560_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra560 apply((auto simp add: VC560_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv561: "VC561 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC561_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra561 apply((auto simp add: VC561_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv562: "VC562 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC562_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra562 apply((auto simp add: VC562_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv563: "VC563 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC563_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra563 apply((auto simp add: VC563_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv564: "VC564 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC564_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra564 apply((auto simp add: VC564_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv565: "VC565 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC565_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra565 apply((auto simp add: VC565_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv566: "VC566 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC566_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra566 apply((auto simp add: VC566_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv567: "VC567 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC567_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra567 apply((auto simp add: VC567_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv568: "VC568 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC568_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra568 apply((auto simp add: VC568_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv569: "VC569 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC569_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra569 apply((auto simp add: VC569_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv570: "VC570 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC570_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra570 apply((auto simp add: VC570_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv571: "VC571 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC571_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra571 apply((auto simp add: VC571_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv572: "VC572 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC572_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra572 apply((auto simp add: VC572_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv573: "VC573 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC573_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra573 apply((auto simp add: VC573_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv574: "VC574 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC574_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra574 apply((auto simp add: VC574_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv575: "VC575 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC575_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra575 apply((auto simp add: VC575_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv576: "VC576 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC576_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra576 apply((auto simp add: VC576_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv577: "VC577 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC577_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra577 apply((auto simp add: VC577_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv578: "VC578 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC578_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra578 apply((auto simp add: VC578_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv579: "VC579 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC579_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra579 apply((auto simp add: VC579_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv580: "VC580 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC580_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra580 apply((auto simp add: VC580_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv581: "VC581 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC581_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra581 apply((auto simp add: VC581_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv582: "VC582 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC582_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra582 apply((auto simp add: VC582_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv583: "VC583 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC583_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra583 apply((auto simp add: VC583_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv584: "VC584 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC584_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra584 apply((auto simp add: VC584_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv585: "VC585 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC585_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra585 apply((auto simp add: VC585_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv586: "VC586 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC586_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra586 apply((auto simp add: VC586_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv587: "VC587 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC587_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra587 apply((auto simp add: VC587_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv588: "VC588 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC588_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra588 apply((auto simp add: VC588_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv589: "VC589 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC589_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra589 apply((auto simp add: VC589_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv590: "VC590 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC590_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra590 apply((auto simp add: VC590_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv591: "VC591 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC591_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra591 apply((auto simp add: VC591_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv592: "VC592 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC592_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra592 apply((auto simp add: VC592_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv593: "VC593 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC593_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra593 apply((auto simp add: VC593_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv594: "VC594 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC594_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra594 apply((auto simp add: VC594_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv595: "VC595 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC595_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra595 apply((auto simp add: VC595_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv596: "VC596 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC596_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra596 apply((auto simp add: VC596_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv597: "VC597 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC597_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra597 apply((auto simp add: VC597_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv598: "VC598 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC598_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra598 apply((auto simp add: VC598_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv599: "VC599 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC599_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra599 apply((auto simp add: VC599_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv600: "VC600 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC600_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra600 apply((auto simp add: VC600_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv601: "VC601 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC601_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra601 apply((auto simp add: VC601_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv602: "VC602 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC602_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra602 apply((auto simp add: VC602_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv603: "VC603 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC603_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra603 apply((auto simp add: VC603_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv604: "VC604 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC604_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra604 apply((auto simp add: VC604_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv605: "VC605 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC605_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra605 apply((auto simp add: VC605_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv606: "VC606 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC606_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra606 apply((auto simp add: VC606_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv607: "VC607 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC607_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra607 apply((auto simp add: VC607_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv608: "VC608 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC608_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra608 apply((auto simp add: VC608_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv609: "VC609 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC609_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra609 apply((auto simp add: VC609_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv610: "VC610 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC610_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra610 apply((auto simp add: VC610_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv611: "VC611 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC611_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra611 apply((auto simp add: VC611_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv612: "VC612 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC612_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra612 apply((auto simp add: VC612_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv613: "VC613 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC613_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra613 apply((auto simp add: VC613_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv614: "VC614 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC614_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra614 apply((auto simp add: VC614_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv615: "VC615 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC615_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra615 apply((auto simp add: VC615_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv616: "VC616 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC616_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra616 apply((auto simp add: VC616_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv617: "VC617 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC617_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra617 apply((auto simp add: VC617_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv618: "VC618 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC618_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra618 apply((auto simp add: VC618_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv619: "VC619 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC619_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra619 apply((auto simp add: VC619_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv620: "VC620 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC620_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra620 apply((auto simp add: VC620_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv621: "VC621 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC621_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra621 apply((auto simp add: VC621_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv622: "VC622 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC622_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra622 apply((auto simp add: VC622_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv623: "VC623 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC623_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra623 apply((auto simp add: VC623_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv624: "VC624 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC624_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra624 apply((auto simp add: VC624_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv625: "VC625 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC625_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra625 apply((auto simp add: VC625_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv626: "VC626 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC626_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra626 apply((auto simp add: VC626_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv627: "VC627 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC627_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra627 apply((auto simp add: VC627_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv628: "VC628 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC628_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra628 apply((auto simp add: VC628_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv629: "VC629 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC629_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra629 apply((auto simp add: VC629_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv630: "VC630 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC630_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra630 apply((auto simp add: VC630_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv631: "VC631 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC631_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra631 apply((auto simp add: VC631_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv632: "VC632 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC632_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra632 apply((auto simp add: VC632_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv633: "VC633 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC633_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra633 apply((auto simp add: VC633_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv634: "VC634 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC634_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra634 apply((auto simp add: VC634_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv635: "VC635 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC635_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra635 apply((auto simp add: VC635_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv636: "VC636 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC636_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra636 apply((auto simp add: VC636_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv637: "VC637 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC637_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra637 apply((auto simp add: VC637_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv638: "VC638 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC638_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra638 apply((auto simp add: VC638_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv639: "VC639 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC639_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra639 apply((auto simp add: VC639_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv640: "VC640 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC640_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra640 apply((auto simp add: VC640_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv641: "VC641 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC641_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra641 apply((auto simp add: VC641_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv642: "VC642 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC642_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra642 apply((auto simp add: VC642_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv643: "VC643 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC643_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra643 apply((auto simp add: VC643_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv644: "VC644 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC644_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra644 apply((auto simp add: VC644_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv645: "VC645 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC645_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra645 apply((auto simp add: VC645_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv646: "VC646 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC646_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra646 apply((auto simp add: VC646_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv647: "VC647 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC647_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra647 apply((auto simp add: VC647_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv648: "VC648 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC648_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra648 apply((auto simp add: VC648_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv649: "VC649 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC649_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra649 apply((auto simp add: VC649_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv650: "VC650 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC650_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra650 apply((auto simp add: VC650_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv651: "VC651 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC651_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra651 apply((auto simp add: VC651_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv652: "VC652 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC652_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra652 apply((auto simp add: VC652_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv653: "VC653 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC653_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra653 apply((auto simp add: VC653_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv654: "VC654 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC654_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra654 apply((auto simp add: VC654_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv655: "VC655 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC655_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra655 apply((auto simp add: VC655_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv656: "VC656 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC656_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra656 apply((auto simp add: VC656_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv657: "VC657 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC657_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra657 apply((auto simp add: VC657_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv658: "VC658 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC658_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra658 apply((auto simp add: VC658_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv659: "VC659 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC659_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra659 apply((auto simp add: VC659_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv660: "VC660 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC660_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra660 apply((auto simp add: VC660_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv661: "VC661 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC661_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra661 apply((auto simp add: VC661_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv662: "VC662 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC662_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra662 apply((auto simp add: VC662_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv663: "VC663 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC663_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra663 apply((auto simp add: VC663_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv664: "VC664 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC664_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra664 apply((auto simp add: VC664_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv665: "VC665 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC665_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra665 apply((auto simp add: VC665_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv666: "VC666 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC666_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra666 apply((auto simp add: VC666_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv667: "VC667 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC667_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra667 apply((auto simp add: VC667_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv668: "VC668 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC668_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra668 apply((auto simp add: VC668_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv669: "VC669 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC669_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra669 apply((auto simp add: VC669_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv670: "VC670 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC670_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra670 apply((auto simp add: VC670_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv671: "VC671 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC671_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra671 apply((auto simp add: VC671_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv672: "VC672 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC672_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra672 apply((auto simp add: VC672_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv673: "VC673 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC673_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra673 apply((auto simp add: VC673_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv674: "VC674 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC674_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra674 apply((auto simp add: VC674_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv675: "VC675 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC675_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra675 apply((auto simp add: VC675_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv676: "VC676 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC676_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra676 apply((auto simp add: VC676_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv677: "VC677 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC677_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra677 apply((auto simp add: VC677_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv678: "VC678 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC678_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra678 apply((auto simp add: VC678_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv679: "VC679 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC679_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra679 apply((auto simp add: VC679_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv680: "VC680 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC680_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra680 apply((auto simp add: VC680_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv681: "VC681 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC681_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra681 apply((auto simp add: VC681_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv682: "VC682 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC682_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra682 apply((auto simp add: VC682_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv683: "VC683 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC683_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra683 apply((auto simp add: VC683_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv684: "VC684 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC684_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra684 apply((auto simp add: VC684_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv685: "VC685 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC685_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra685 apply((auto simp add: VC685_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv686: "VC686 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC686_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra686 apply((auto simp add: VC686_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv687: "VC687 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC687_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra687 apply((auto simp add: VC687_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv688: "VC688 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC688_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra688 apply((auto simp add: VC688_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv689: "VC689 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC689_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra689 apply((auto simp add: VC689_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv690: "VC690 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC690_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra690 apply((auto simp add: VC690_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv691: "VC691 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC691_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra691 apply((auto simp add: VC691_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv692: "VC692 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC692_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra692 apply((auto simp add: VC692_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv693: "VC693 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC693_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra693 apply((auto simp add: VC693_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv694: "VC694 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC694_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra694 apply((auto simp add: VC694_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv695: "VC695 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC695_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra695 apply((auto simp add: VC695_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv696: "VC696 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC696_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra696 apply((auto simp add: VC696_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv697: "VC697 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC697_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra697 apply((auto simp add: VC697_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv698: "VC698 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC698_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra698 apply((auto simp add: VC698_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv699: "VC699 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC699_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra699 apply((auto simp add: VC699_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv700: "VC700 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC700_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra700 apply((auto simp add: VC700_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv701: "VC701 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC701_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra701 apply((auto simp add: VC701_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv702: "VC702 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC702_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra702 apply((auto simp add: VC702_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv703: "VC703 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC703_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra703 apply((auto simp add: VC703_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv704: "VC704 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC704_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra704 apply((auto simp add: VC704_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv705: "VC705 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC705_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra705 apply((auto simp add: VC705_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv706: "VC706 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC706_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra706 apply((auto simp add: VC706_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv707: "VC707 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC707_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra707 apply((auto simp add: VC707_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv708: "VC708 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC708_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra708 apply((auto simp add: VC708_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv709: "VC709 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC709_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra709 apply((auto simp add: VC709_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv710: "VC710 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC710_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra710 apply((auto simp add: VC710_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv711: "VC711 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC711_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra711 apply((auto simp add: VC711_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv712: "VC712 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC712_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra712 apply((auto simp add: VC712_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv713: "VC713 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC713_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra713 apply((auto simp add: VC713_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv714: "VC714 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC714_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra714 apply((auto simp add: VC714_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv715: "VC715 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC715_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra715 apply((auto simp add: VC715_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv716: "VC716 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC716_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra716 apply((auto simp add: VC716_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv717: "VC717 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC717_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra717 apply((auto simp add: VC717_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv718: "VC718 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC718_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra718 apply((auto simp add: VC718_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv719: "VC719 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC719_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra719 apply((auto simp add: VC719_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv720: "VC720 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC720_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra720 apply((auto simp add: VC720_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv721: "VC721 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC721_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra721 apply((auto simp add: VC721_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv722: "VC722 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC722_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra722 apply((auto simp add: VC722_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv723: "VC723 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC723_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra723 apply((auto simp add: VC723_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv724: "VC724 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC724_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra724 apply((auto simp add: VC724_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv725: "VC725 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC725_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra725 apply((auto simp add: VC725_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv726: "VC726 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC726_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra726 apply((auto simp add: VC726_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv727: "VC727 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC727_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra727 apply((auto simp add: VC727_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv728: "VC728 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC728_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra728 apply((auto simp add: VC728_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv729: "VC729 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC729_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra729 apply((auto simp add: VC729_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv730: "VC730 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC730_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra730 apply((auto simp add: VC730_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv731: "VC731 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC731_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra731 apply((auto simp add: VC731_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv732: "VC732 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC732_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra732 apply((auto simp add: VC732_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv733: "VC733 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC733_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra733 apply((auto simp add: VC733_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv734: "VC734 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC734_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra734 apply((auto simp add: VC734_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv735: "VC735 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC735_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra735 apply((auto simp add: VC735_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv736: "VC736 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC736_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra736 apply((auto simp add: VC736_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv737: "VC737 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC737_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra737 apply((auto simp add: VC737_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv738: "VC738 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC738_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra738 apply((auto simp add: VC738_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv739: "VC739 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC739_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra739 apply((auto simp add: VC739_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv740: "VC740 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC740_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra740 apply((auto simp add: VC740_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv741: "VC741 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC741_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra741 apply((auto simp add: VC741_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv742: "VC742 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC742_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra742 apply((auto simp add: VC742_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv743: "VC743 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC743_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra743 apply((auto simp add: VC743_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv744: "VC744 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC744_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra744 apply((auto simp add: VC744_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv745: "VC745 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC745_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra745 apply((auto simp add: VC745_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv746: "VC746 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC746_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra746 apply((auto simp add: VC746_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv747: "VC747 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC747_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra747 apply((auto simp add: VC747_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv748: "VC748 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC748_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra748 apply((auto simp add: VC748_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv749: "VC749 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC749_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra749 apply((auto simp add: VC749_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv750: "VC750 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC750_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra750 apply((auto simp add: VC750_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv751: "VC751 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC751_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra751 apply((auto simp add: VC751_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv752: "VC752 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC752_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra752 apply((auto simp add: VC752_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv753: "VC753 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC753_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra753 apply((auto simp add: VC753_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv754: "VC754 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC754_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra754 apply((auto simp add: VC754_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv755: "VC755 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC755_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra755 apply((auto simp add: VC755_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv756: "VC756 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC756_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra756 apply((auto simp add: VC756_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv757: "VC757 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC757_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra757 apply((auto simp add: VC757_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv758: "VC758 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC758_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra758 apply((auto simp add: VC758_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv759: "VC759 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC759_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra759 apply((auto simp add: VC759_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv760: "VC760 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC760_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra760 apply((auto simp add: VC760_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv761: "VC761 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC761_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra761 apply((auto simp add: VC761_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv762: "VC762 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC762_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra762 apply((auto simp add: VC762_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv763: "VC763 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC763_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra763 apply((auto simp add: VC763_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv764: "VC764 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC764_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra764 apply((auto simp add: VC764_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv765: "VC765 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC765_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra765 apply((auto simp add: VC765_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv766: "VC766 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC766_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra766 apply((auto simp add: VC766_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv767: "VC767 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC767_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra767 apply((auto simp add: VC767_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv768: "VC768 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC768_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra768 apply((auto simp add: VC768_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv769: "VC769 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC769_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra769 apply((auto simp add: VC769_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv770: "VC770 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC770_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra770 apply((auto simp add: VC770_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv771: "VC771 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC771_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra771 apply((auto simp add: VC771_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv772: "VC772 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC772_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra772 apply((auto simp add: VC772_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv773: "VC773 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC773_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra773 apply((auto simp add: VC773_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv774: "VC774 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC774_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra774 apply((auto simp add: VC774_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv775: "VC775 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC775_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra775 apply((auto simp add: VC775_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv776: "VC776 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC776_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra776 apply((auto simp add: VC776_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv777: "VC777 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC777_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra777 apply((auto simp add: VC777_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv778: "VC778 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC778_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra778 apply((auto simp add: VC778_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv779: "VC779 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC779_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra779 apply((auto simp add: VC779_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv780: "VC780 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC780_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra780 apply((auto simp add: VC780_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv781: "VC781 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC781_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra781 apply((auto simp add: VC781_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv782: "VC782 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC782_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra782 apply((auto simp add: VC782_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv783: "VC783 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC783_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra783 apply((auto simp add: VC783_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv784: "VC784 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC784_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra784 apply((auto simp add: VC784_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv785: "VC785 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC785_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra785 apply((auto simp add: VC785_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv786: "VC786 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC786_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra786 apply((auto simp add: VC786_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv787: "VC787 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC787_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra787 apply((auto simp add: VC787_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv788: "VC788 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC788_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra788 apply((auto simp add: VC788_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv789: "VC789 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC789_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra789 apply((auto simp add: VC789_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv790: "VC790 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC790_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra790 apply((auto simp add: VC790_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv791: "VC791 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC791_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra791 apply((auto simp add: VC791_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv792: "VC792 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC792_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra792 apply((auto simp add: VC792_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv793: "VC793 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC793_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra793 apply((auto simp add: VC793_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv794: "VC794 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC794_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra794 apply((auto simp add: VC794_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv795: "VC795 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC795_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra795 apply((auto simp add: VC795_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv796: "VC796 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC796_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra796 apply((auto simp add: VC796_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv797: "VC797 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC797_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra797 apply((auto simp add: VC797_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv798: "VC798 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC798_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra798 apply((auto simp add: VC798_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv799: "VC799 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC799_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra799 apply((auto simp add: VC799_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv800: "VC800 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC800_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra800 apply((auto simp add: VC800_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv801: "VC801 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC801_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra801 apply((auto simp add: VC801_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv802: "VC802 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC802_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra802 apply((auto simp add: VC802_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv803: "VC803 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC803_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra803 apply((auto simp add: VC803_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv804: "VC804 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC804_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra804 apply((auto simp add: VC804_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv805: "VC805 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC805_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra805 apply((auto simp add: VC805_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv806: "VC806 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC806_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra806 apply((auto simp add: VC806_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv807: "VC807 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC807_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra807 apply((auto simp add: VC807_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv808: "VC808 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC808_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra808 apply((auto simp add: VC808_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv809: "VC809 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC809_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra809 apply((auto simp add: VC809_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv810: "VC810 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC810_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra810 apply((auto simp add: VC810_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv811: "VC811 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC811_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra811 apply((auto simp add: VC811_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv812: "VC812 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC812_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra812 apply((auto simp add: VC812_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv813: "VC813 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC813_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra813 apply((auto simp add: VC813_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv814: "VC814 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC814_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra814 apply((auto simp add: VC814_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv815: "VC815 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC815_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra815 apply((auto simp add: VC815_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv816: "VC816 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC816_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra816 apply((auto simp add: VC816_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv817: "VC817 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC817_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra817 apply((auto simp add: VC817_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv818: "VC818 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC818_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra818 apply((auto simp add: VC818_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv819: "VC819 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC819_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra819 apply((auto simp add: VC819_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv820: "VC820 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC820_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra820 apply((auto simp add: VC820_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv821: "VC821 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC821_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra821 apply((auto simp add: VC821_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv822: "VC822 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC822_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra822 apply((auto simp add: VC822_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv823: "VC823 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC823_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra823 apply((auto simp add: VC823_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv824: "VC824 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC824_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra824 apply((auto simp add: VC824_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv825: "VC825 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC825_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra825 apply((auto simp add: VC825_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv826: "VC826 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC826_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra826 apply((auto simp add: VC826_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv827: "VC827 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC827_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra827 apply((auto simp add: VC827_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv828: "VC828 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC828_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra828 apply((auto simp add: VC828_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv829: "VC829 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC829_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra829 apply((auto simp add: VC829_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv830: "VC830 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC830_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra830 apply((auto simp add: VC830_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv831: "VC831 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC831_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra831 apply((auto simp add: VC831_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv832: "VC832 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC832_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra832 apply((auto simp add: VC832_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv833: "VC833 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC833_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra833 apply((auto simp add: VC833_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv834: "VC834 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC834_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra834 apply((auto simp add: VC834_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv835: "VC835 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC835_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra835 apply((auto simp add: VC835_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv836: "VC836 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC836_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra836 apply((auto simp add: VC836_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv837: "VC837 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC837_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra837 apply((auto simp add: VC837_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv838: "VC838 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC838_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra838 apply((auto simp add: VC838_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv839: "VC839 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC839_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra839 apply((auto simp add: VC839_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv840: "VC840 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC840_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra840 apply((auto simp add: VC840_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv841: "VC841 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC841_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra841 apply((auto simp add: VC841_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv842: "VC842 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC842_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra842 apply((auto simp add: VC842_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv843: "VC843 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC843_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra843 apply((auto simp add: VC843_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv844: "VC844 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC844_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra844 apply((auto simp add: VC844_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv845: "VC845 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC845_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra845 apply((auto simp add: VC845_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv846: "VC846 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC846_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra846 apply((auto simp add: VC846_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv847: "VC847 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC847_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra847 apply((auto simp add: VC847_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv848: "VC848 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC848_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra848 apply((auto simp add: VC848_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv849: "VC849 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC849_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra849 apply((auto simp add: VC849_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv850: "VC850 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC850_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra850 apply((auto simp add: VC850_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv851: "VC851 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC851_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra851 apply((auto simp add: VC851_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv852: "VC852 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC852_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra852 apply((auto simp add: VC852_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv853: "VC853 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC853_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra853 apply((auto simp add: VC853_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv854: "VC854 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC854_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra854 apply((auto simp add: VC854_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv855: "VC855 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC855_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra855 apply((auto simp add: VC855_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv856: "VC856 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC856_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra856 apply((auto simp add: VC856_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv857: "VC857 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC857_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra857 apply((auto simp add: VC857_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv858: "VC858 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC858_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra858 apply((auto simp add: VC858_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv859: "VC859 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC859_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra859 apply((auto simp add: VC859_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv860: "VC860 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC860_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra860 apply((auto simp add: VC860_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv861: "VC861 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC861_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra861 apply((auto simp add: VC861_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv862: "VC862 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC862_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra862 apply((auto simp add: VC862_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv863: "VC863 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC863_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra863 apply((auto simp add: VC863_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv864: "VC864 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC864_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra864 apply((auto simp add: VC864_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv865: "VC865 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC865_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra865 apply((auto simp add: VC865_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv866: "VC866 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC866_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra866 apply((auto simp add: VC866_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv867: "VC867 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC867_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra867 apply((auto simp add: VC867_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv868: "VC868 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC868_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra868 apply((auto simp add: VC868_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv869: "VC869 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC869_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra869 apply((auto simp add: VC869_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv870: "VC870 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC870_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra870 apply((auto simp add: VC870_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv871: "VC871 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC871_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra871 apply((auto simp add: VC871_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv872: "VC872 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC872_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra872 apply((auto simp add: VC872_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv873: "VC873 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC873_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra873 apply((auto simp add: VC873_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv874: "VC874 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC874_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra874 apply((auto simp add: VC874_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv875: "VC875 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC875_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra875 apply((auto simp add: VC875_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv876: "VC876 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC876_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra876 apply((auto simp add: VC876_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv877: "VC877 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC877_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra877 apply((auto simp add: VC877_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv878: "VC878 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC878_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra878 apply((auto simp add: VC878_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv879: "VC879 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC879_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra879 apply((auto simp add: VC879_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv880: "VC880 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC880_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra880 apply((auto simp add: VC880_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv881: "VC881 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC881_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra881 apply((auto simp add: VC881_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv882: "VC882 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC882_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra882 apply((auto simp add: VC882_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv883: "VC883 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC883_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra883 apply((auto simp add: VC883_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv884: "VC884 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC884_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra884 apply((auto simp add: VC884_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv885: "VC885 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC885_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra885 apply((auto simp add: VC885_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv886: "VC886 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC886_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra886 apply((auto simp add: VC886_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv887: "VC887 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC887_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra887 apply((auto simp add: VC887_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv888: "VC888 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC888_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra888 apply((auto simp add: VC888_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv889: "VC889 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC889_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra889 apply((auto simp add: VC889_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv890: "VC890 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC890_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra890 apply((auto simp add: VC890_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv891: "VC891 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC891_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra891 apply((auto simp add: VC891_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv892: "VC892 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC892_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra892 apply((auto simp add: VC892_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv893: "VC893 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC893_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra893 apply((auto simp add: VC893_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv894: "VC894 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC894_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra894 apply((auto simp add: VC894_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv895: "VC895 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC895_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra895 apply((auto simp add: VC895_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv896: "VC896 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC896_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra896 apply((auto simp add: VC896_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv897: "VC897 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC897_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra897 apply((auto simp add: VC897_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv898: "VC898 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC898_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra898 apply((auto simp add: VC898_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv899: "VC899 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC899_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra899 apply((auto simp add: VC899_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv900: "VC900 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC900_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra900 apply((auto simp add: VC900_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv901: "VC901 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC901_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra901 apply((auto simp add: VC901_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv902: "VC902 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC902_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra902 apply((auto simp add: VC902_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv903: "VC903 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC903_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra903 apply((auto simp add: VC903_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv904: "VC904 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC904_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra904 apply((auto simp add: VC904_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv905: "VC905 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC905_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra905 apply((auto simp add: VC905_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv906: "VC906 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC906_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra906 apply((auto simp add: VC906_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv907: "VC907 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC907_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra907 apply((auto simp add: VC907_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv908: "VC908 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC908_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra908 apply((auto simp add: VC908_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv909: "VC909 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC909_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra909 apply((auto simp add: VC909_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv910: "VC910 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC910_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra910 apply((auto simp add: VC910_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv911: "VC911 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC911_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra911 apply((auto simp add: VC911_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv912: "VC912 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC912_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra912 apply((auto simp add: VC912_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv913: "VC913 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC913_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra913 apply((auto simp add: VC913_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv914: "VC914 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC914_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra914 apply((auto simp add: VC914_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv915: "VC915 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC915_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra915 apply((auto simp add: VC915_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv916: "VC916 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC916_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra916 apply((auto simp add: VC916_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv917: "VC917 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC917_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra917 apply((auto simp add: VC917_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv918: "VC918 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC918_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra918 apply((auto simp add: VC918_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv919: "VC919 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC919_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra919 apply((auto simp add: VC919_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv920: "VC920 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC920_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra920 apply((auto simp add: VC920_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv921: "VC921 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC921_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra921 apply((auto simp add: VC921_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv922: "VC922 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC922_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra922 apply((auto simp add: VC922_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv923: "VC923 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC923_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra923 apply((auto simp add: VC923_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv924: "VC924 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC924_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra924 apply((auto simp add: VC924_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv925: "VC925 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC925_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra925 apply((auto simp add: VC925_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv926: "VC926 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC926_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra926 apply((auto simp add: VC926_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv927: "VC927 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC927_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra927 apply((auto simp add: VC927_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv928: "VC928 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC928_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra928 apply((auto simp add: VC928_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv929: "VC929 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC929_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra929 apply((auto simp add: VC929_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv930: "VC930 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC930_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra930 apply((auto simp add: VC930_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv931: "VC931 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC931_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra931 apply((auto simp add: VC931_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv932: "VC932 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC932_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra932 apply((auto simp add: VC932_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv933: "VC933 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC933_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra933 apply((auto simp add: VC933_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv934: "VC934 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC934_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra934 apply((auto simp add: VC934_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv935: "VC935 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC935_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra935 apply((auto simp add: VC935_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv936: "VC936 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC936_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra936 apply((auto simp add: VC936_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv937: "VC937 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC937_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra937 apply((auto simp add: VC937_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv938: "VC938 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC938_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra938 apply((auto simp add: VC938_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv939: "VC939 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC939_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra939 apply((auto simp add: VC939_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv940: "VC940 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC940_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra940 apply((auto simp add: VC940_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv941: "VC941 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC941_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra941 apply((auto simp add: VC941_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv942: "VC942 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC942_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra942 apply((auto simp add: VC942_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv943: "VC943 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC943_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra943 apply((auto simp add: VC943_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv944: "VC944 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC944_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra944 apply((auto simp add: VC944_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv945: "VC945 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC945_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra945 apply((auto simp add: VC945_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv946: "VC946 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC946_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra946 apply((auto simp add: VC946_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv947: "VC947 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC947_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra947 apply((auto simp add: VC947_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv948: "VC948 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC948_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra948 apply((auto simp add: VC948_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv949: "VC949 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC949_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra949 apply((auto simp add: VC949_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv950: "VC950 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC950_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra950 apply((auto simp add: VC950_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv951: "VC951 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC951_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra951 apply((auto simp add: VC951_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv952: "VC952 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC952_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra952 apply((auto simp add: VC952_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv953: "VC953 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC953_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra953 apply((auto simp add: VC953_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv954: "VC954 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC954_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra954 apply((auto simp add: VC954_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv955: "VC955 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC955_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra955 apply((auto simp add: VC955_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv956: "VC956 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC956_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra956 apply((auto simp add: VC956_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv957: "VC957 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC957_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra957 apply((auto simp add: VC957_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv958: "VC958 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC958_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra958 apply((auto simp add: VC958_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv959: "VC959 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC959_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra959 apply((auto simp add: VC959_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv960: "VC960 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC960_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra960 apply((auto simp add: VC960_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv961: "VC961 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC961_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra961 apply((auto simp add: VC961_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv962: "VC962 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC962_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra962 apply((auto simp add: VC962_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv963: "VC963 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC963_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra963 apply((auto simp add: VC963_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv964: "VC964 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC964_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra964 apply((auto simp add: VC964_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv965: "VC965 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC965_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra965 apply((auto simp add: VC965_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv966: "VC966 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC966_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra966 apply((auto simp add: VC966_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv967: "VC967 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC967_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra967 apply((auto simp add: VC967_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv968: "VC968 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC968_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra968 apply((auto simp add: VC968_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv969: "VC969 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC969_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra969 apply((auto simp add: VC969_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv970: "VC970 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC970_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra970 apply((auto simp add: VC970_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv971: "VC971 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC971_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra971 apply((auto simp add: VC971_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv972: "VC972 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC972_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra972 apply((auto simp add: VC972_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv973: "VC973 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC973_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra973 apply((auto simp add: VC973_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv974: "VC974 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC974_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra974 apply((auto simp add: VC974_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv975: "VC975 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC975_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra975 apply((auto simp add: VC975_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv976: "VC976 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC976_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra976 apply((auto simp add: VC976_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv977: "VC977 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC977_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra977 apply((auto simp add: VC977_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv978: "VC978 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC978_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra978 apply((auto simp add: VC978_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv979: "VC979 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC979_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra979 apply((auto simp add: VC979_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv980: "VC980 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC980_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra980 apply((auto simp add: VC980_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv981: "VC981 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC981_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra981 apply((auto simp add: VC981_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv982: "VC982 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC982_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra982 apply((auto simp add: VC982_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv983: "VC983 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC983_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra983 apply((auto simp add: VC983_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv984: "VC984 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC984_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra984 apply((auto simp add: VC984_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv985: "VC985 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC985_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra985 apply((auto simp add: VC985_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv986: "VC986 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC986_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra986 apply((auto simp add: VC986_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv987: "VC987 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC987_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra987 apply((auto simp add: VC987_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv988: "VC988 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC988_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra988 apply((auto simp add: VC988_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv989: "VC989 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC989_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra989 apply((auto simp add: VC989_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv990: "VC990 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC990_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra990 apply((auto simp add: VC990_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv991: "VC991 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC991_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra991 apply((auto simp add: VC991_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv992: "VC992 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC992_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra992 apply((auto simp add: VC992_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv993: "VC993 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC993_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra993 apply((auto simp add: VC993_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv994: "VC994 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC994_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra994 apply((auto simp add: VC994_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv995: "VC995 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC995_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra995 apply((auto simp add: VC995_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv996: "VC996 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC996_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra996 apply((auto simp add: VC996_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv997: "VC997 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC997_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra997 apply((auto simp add: VC997_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv998: "VC998 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC998_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra998 apply((auto simp add: VC998_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv999: "VC999 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC999_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra999 apply((auto simp add: VC999_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1000: "VC1000 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1000_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1000 apply((auto simp add: VC1000_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1001: "VC1001 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1001_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1001 apply((auto simp add: VC1001_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1002: "VC1002 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1002_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1002 apply((auto simp add: VC1002_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1003: "VC1003 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1003_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1003 apply((auto simp add: VC1003_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1004: "VC1004 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1004_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1004 apply((auto simp add: VC1004_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1005: "VC1005 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1005_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1005 apply((auto simp add: VC1005_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1006: "VC1006 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1006_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1006 apply((auto simp add: VC1006_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1007: "VC1007 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1007_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1007 apply((auto simp add: VC1007_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1008: "VC1008 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1008_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1008 apply((auto simp add: VC1008_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

theorem extendedInv1009: "VC1009 R6_extended_inv env s0  PdOut'value paid'value opened'value"
unfolding VC1009_def R6_extended_inv_def R6_def  apply(rule impI)
  apply(rule context_conjI)
  using extra1009 apply((auto simp add: VC1009_def)[1];fastforce)
  apply(rule conjI)
   apply simp
  apply(unfold Einv6_def commonExtraInv_def)
  apply(erule conjE)+
  apply(auto simp add: always_einv_imp_req split: if_splits)
  done

end
