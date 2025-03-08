theory Einv7_Proofs imports Requirements CommonExtraInv_Proofs 
begin
theorem extra1: "VC1 Einv7 s0"
unfolding VC1_def Einv7_def always2_inv_part_used_patterns commonExtraInv_def
by auto

theorem extra2: "VC2 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC2_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra3: "VC3 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC3_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra4: "VC4 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC4_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra5: "VC5 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC5_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra6: "VC6 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC6_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra7: "VC7 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC7_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra8: "VC8 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC8_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra9: "VC9 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC9_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra10: "VC10 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC10_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra11: "VC11 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC11_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra12: "VC12 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC12_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra13: "VC13 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC13_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra14: "VC14 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC14_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra15: "VC15 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC15_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra16: "VC16 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC16_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra17: "VC17 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC17_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei17 apply((auto simp add: VC17_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra18: "VC18 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC18_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei18 apply((auto simp add: VC18_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra19: "VC19 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC19_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei19 apply((auto simp add: VC19_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra20: "VC20 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC20_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei20 apply((auto simp add: VC20_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra21: "VC21 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC21_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei21 apply((auto simp add: VC21_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra22: "VC22 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC22_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei22 apply((auto simp add: VC22_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra23: "VC23 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC23_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei23 apply((auto simp add: VC23_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra24: "VC24 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC24_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei24 apply((auto simp add: VC24_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra25: "VC25 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC25_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei25 apply((auto simp add: VC25_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra26: "VC26 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC26_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei26 apply((auto simp add: VC26_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra27: "VC27 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC27_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei27 apply((auto simp add: VC27_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra28: "VC28 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC28_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei28 apply((auto simp add: VC28_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra29: "VC29 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC29_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei29 apply((auto simp add: VC29_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra30: "VC30 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC30_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei30 apply((auto simp add: VC30_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra31: "VC31 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC31_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei31 apply((auto simp add: VC31_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra32: "VC32 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC32_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei32 apply((auto simp add: VC32_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra33: "VC33 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC33_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei33 apply((auto simp add: VC33_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra34: "VC34 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC34_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei34 apply((auto simp add: VC34_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra35: "VC35 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC35_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei35 apply((auto simp add: VC35_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra36: "VC36 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC36_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei36 apply((auto simp add: VC36_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra37: "VC37 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC37_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei37 apply((auto simp add: VC37_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra38: "VC38 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC38_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei38 apply((auto simp add: VC38_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra39: "VC39 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC39_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei39 apply((auto simp add: VC39_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra40: "VC40 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC40_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei40 apply((auto simp add: VC40_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra41: "VC41 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC41_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei41 apply((auto simp add: VC41_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra42: "VC42 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC42_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei42 apply((auto simp add: VC42_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra43: "VC43 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC43_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei43 apply((auto simp add: VC43_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra44: "VC44 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC44_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei44 apply((auto simp add: VC44_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra45: "VC45 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC45_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei45 apply((auto simp add: VC45_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra46: "VC46 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC46_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei46 apply((auto simp add: VC46_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra47: "VC47 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC47_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei47 apply((auto simp add: VC47_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra48: "VC48 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC48_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei48 apply((auto simp add: VC48_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra49: "VC49 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC49_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei49 apply((auto simp add: VC49_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra50: "VC50 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC50_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei50 apply((auto simp add: VC50_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra51: "VC51 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC51_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei51 apply((auto simp add: VC51_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra52: "VC52 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC52_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei52 apply((auto simp add: VC52_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra53: "VC53 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC53_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei53 apply((auto simp add: VC53_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra54: "VC54 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC54_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei54 apply((auto simp add: VC54_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra55: "VC55 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC55_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei55 apply((auto simp add: VC55_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra56: "VC56 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC56_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei56 apply((auto simp add: VC56_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra57: "VC57 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC57_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei57 apply((auto simp add: VC57_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra58: "VC58 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC58_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei58 apply((auto simp add: VC58_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra59: "VC59 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC59_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei59 apply((auto simp add: VC59_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra60: "VC60 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC60_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei60 apply((auto simp add: VC60_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra61: "VC61 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC61_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei61 apply((auto simp add: VC61_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra62: "VC62 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC62_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei62 apply((auto simp add: VC62_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra63: "VC63 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC63_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei63 apply((auto simp add: VC63_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra64: "VC64 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC64_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei64 apply((auto simp add: VC64_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra65: "VC65 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC65_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei65 apply((auto simp add: VC65_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra66: "VC66 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC66_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei66 apply((auto simp add: VC66_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra67: "VC67 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC67_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei67 apply((auto simp add: VC67_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra68: "VC68 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC68_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei68 apply((auto simp add: VC68_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra69: "VC69 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC69_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei69 apply((auto simp add: VC69_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra70: "VC70 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC70_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei70 apply((auto simp add: VC70_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra71: "VC71 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC71_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei71 apply((auto simp add: VC71_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra72: "VC72 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC72_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei72 apply((auto simp add: VC72_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra73: "VC73 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC73_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei73 apply((auto simp add: VC73_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra74: "VC74 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC74_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei74 apply((auto simp add: VC74_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra75: "VC75 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC75_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei75 apply((auto simp add: VC75_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra76: "VC76 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC76_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei76 apply((auto simp add: VC76_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra77: "VC77 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC77_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei77 apply((auto simp add: VC77_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra78: "VC78 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC78_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei78 apply((auto simp add: VC78_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra79: "VC79 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC79_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei79 apply((auto simp add: VC79_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra80: "VC80 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC80_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei80 apply((auto simp add: VC80_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra81: "VC81 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC81_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei81 apply((auto simp add: VC81_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra82: "VC82 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC82_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei82 apply((auto simp add: VC82_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra83: "VC83 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC83_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei83 apply((auto simp add: VC83_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra84: "VC84 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC84_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei84 apply((auto simp add: VC84_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra85: "VC85 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC85_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei85 apply((auto simp add: VC85_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra86: "VC86 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC86_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei86 apply((auto simp add: VC86_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra87: "VC87 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC87_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei87 apply((auto simp add: VC87_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra88: "VC88 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC88_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei88 apply((auto simp add: VC88_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra89: "VC89 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC89_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei89 apply((auto simp add: VC89_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra90: "VC90 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC90_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei90 apply((auto simp add: VC90_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra91: "VC91 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC91_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei91 apply((auto simp add: VC91_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra92: "VC92 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC92_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei92 apply((auto simp add: VC92_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra93: "VC93 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC93_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei93 apply((auto simp add: VC93_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra94: "VC94 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC94_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei94 apply((auto simp add: VC94_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra95: "VC95 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC95_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei95 apply((auto simp add: VC95_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra96: "VC96 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC96_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei96 apply((auto simp add: VC96_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra97: "VC97 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC97_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei97 apply((auto simp add: VC97_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra98: "VC98 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC98_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei98 apply((auto simp add: VC98_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra99: "VC99 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC99_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei99 apply((auto simp add: VC99_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra100: "VC100 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC100_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei100 apply((auto simp add: VC100_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra101: "VC101 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC101_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei101 apply((auto simp add: VC101_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra102: "VC102 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC102_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei102 apply((auto simp add: VC102_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra103: "VC103 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC103_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei103 apply((auto simp add: VC103_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra104: "VC104 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC104_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei104 apply((auto simp add: VC104_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra105: "VC105 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC105_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei105 apply((auto simp add: VC105_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra106: "VC106 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC106_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei106 apply((auto simp add: VC106_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra107: "VC107 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC107_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei107 apply((auto simp add: VC107_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra108: "VC108 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC108_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei108 apply((auto simp add: VC108_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra109: "VC109 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC109_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei109 apply((auto simp add: VC109_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra110: "VC110 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC110_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei110 apply((auto simp add: VC110_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra111: "VC111 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC111_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei111 apply((auto simp add: VC111_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra112: "VC112 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC112_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei112 apply((auto simp add: VC112_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra113: "VC113 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC113_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei113 apply((auto simp add: VC113_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra114: "VC114 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC114_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei114 apply((auto simp add: VC114_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra115: "VC115 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC115_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei115 apply((auto simp add: VC115_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra116: "VC116 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC116_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei116 apply((auto simp add: VC116_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra117: "VC117 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC117_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei117 apply((auto simp add: VC117_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra118: "VC118 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC118_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei118 apply((auto simp add: VC118_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra119: "VC119 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC119_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei119 apply((auto simp add: VC119_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra120: "VC120 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC120_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei120 apply((auto simp add: VC120_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra121: "VC121 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC121_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei121 apply((auto simp add: VC121_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra122: "VC122 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC122_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei122 apply((auto simp add: VC122_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra123: "VC123 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC123_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei123 apply((auto simp add: VC123_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra124: "VC124 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC124_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei124 apply((auto simp add: VC124_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra125: "VC125 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC125_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei125 apply((auto simp add: VC125_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra126: "VC126 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC126_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei126 apply((auto simp add: VC126_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra127: "VC127 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC127_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei127 apply((auto simp add: VC127_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra128: "VC128 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC128_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei128 apply((auto simp add: VC128_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra129: "VC129 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC129_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei129 apply((auto simp add: VC129_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra130: "VC130 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC130_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei130 apply((auto simp add: VC130_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra131: "VC131 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC131_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei131 apply((auto simp add: VC131_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra132: "VC132 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC132_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei132 apply((auto simp add: VC132_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra133: "VC133 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC133_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei133 apply((auto simp add: VC133_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra134: "VC134 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC134_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei134 apply((auto simp add: VC134_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra135: "VC135 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC135_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei135 apply((auto simp add: VC135_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra136: "VC136 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC136_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei136 apply((auto simp add: VC136_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra137: "VC137 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC137_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei137 apply((auto simp add: VC137_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra138: "VC138 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC138_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei138 apply((auto simp add: VC138_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra139: "VC139 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC139_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei139 apply((auto simp add: VC139_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra140: "VC140 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC140_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei140 apply((auto simp add: VC140_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra141: "VC141 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC141_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei141 apply((auto simp add: VC141_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra142: "VC142 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC142_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei142 apply((auto simp add: VC142_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra143: "VC143 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC143_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei143 apply((auto simp add: VC143_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra144: "VC144 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC144_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei144 apply((auto simp add: VC144_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra145: "VC145 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC145_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei145 apply((auto simp add: VC145_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra146: "VC146 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC146_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei146 apply((auto simp add: VC146_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra147: "VC147 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC147_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei147 apply((auto simp add: VC147_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra148: "VC148 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC148_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei148 apply((auto simp add: VC148_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra149: "VC149 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC149_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei149 apply((auto simp add: VC149_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra150: "VC150 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC150_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei150 apply((auto simp add: VC150_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra151: "VC151 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC151_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei151 apply((auto simp add: VC151_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra152: "VC152 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC152_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei152 apply((auto simp add: VC152_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra153: "VC153 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC153_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei153 apply((auto simp add: VC153_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra154: "VC154 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC154_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei154 apply((auto simp add: VC154_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra155: "VC155 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC155_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei155 apply((auto simp add: VC155_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra156: "VC156 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC156_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei156 apply((auto simp add: VC156_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra157: "VC157 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC157_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei157 apply((auto simp add: VC157_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra158: "VC158 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC158_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei158 apply((auto simp add: VC158_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra159: "VC159 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC159_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei159 apply((auto simp add: VC159_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra160: "VC160 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC160_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei160 apply((auto simp add: VC160_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra161: "VC161 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC161_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei161 apply((auto simp add: VC161_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra162: "VC162 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC162_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei162 apply((auto simp add: VC162_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra163: "VC163 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC163_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei163 apply((auto simp add: VC163_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra164: "VC164 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC164_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei164 apply((auto simp add: VC164_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra165: "VC165 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC165_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei165 apply((auto simp add: VC165_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra166: "VC166 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC166_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei166 apply((auto simp add: VC166_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra167: "VC167 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC167_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei167 apply((auto simp add: VC167_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra168: "VC168 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC168_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei168 apply((auto simp add: VC168_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra169: "VC169 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC169_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei169 apply((auto simp add: VC169_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra170: "VC170 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC170_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei170 apply((auto simp add: VC170_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra171: "VC171 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC171_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei171 apply((auto simp add: VC171_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra172: "VC172 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC172_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei172 apply((auto simp add: VC172_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra173: "VC173 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC173_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei173 apply((auto simp add: VC173_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra174: "VC174 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC174_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei174 apply((auto simp add: VC174_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra175: "VC175 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC175_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei175 apply((auto simp add: VC175_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra176: "VC176 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC176_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei176 apply((auto simp add: VC176_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra177: "VC177 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC177_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei177 apply((auto simp add: VC177_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra178: "VC178 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC178_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei178 apply((auto simp add: VC178_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra179: "VC179 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC179_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei179 apply((auto simp add: VC179_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra180: "VC180 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC180_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei180 apply((auto simp add: VC180_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra181: "VC181 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC181_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei181 apply((auto simp add: VC181_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra182: "VC182 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC182_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei182 apply((auto simp add: VC182_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra183: "VC183 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC183_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei183 apply((auto simp add: VC183_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra184: "VC184 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC184_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei184 apply((auto simp add: VC184_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra185: "VC185 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC185_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei185 apply((auto simp add: VC185_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra186: "VC186 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC186_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei186 apply((auto simp add: VC186_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra187: "VC187 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC187_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei187 apply((auto simp add: VC187_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra188: "VC188 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC188_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei188 apply((auto simp add: VC188_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra189: "VC189 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC189_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei189 apply((auto simp add: VC189_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra190: "VC190 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC190_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei190 apply((auto simp add: VC190_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra191: "VC191 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC191_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei191 apply((auto simp add: VC191_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra192: "VC192 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC192_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei192 apply((auto simp add: VC192_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra193: "VC193 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC193_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei193 apply((auto simp add: VC193_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra194: "VC194 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC194_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei194 apply((auto simp add: VC194_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra195: "VC195 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC195_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei195 apply((auto simp add: VC195_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra196: "VC196 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC196_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei196 apply((auto simp add: VC196_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra197: "VC197 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC197_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei197 apply((auto simp add: VC197_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra198: "VC198 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC198_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei198 apply((auto simp add: VC198_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra199: "VC199 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC199_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei199 apply((auto simp add: VC199_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra200: "VC200 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC200_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei200 apply((auto simp add: VC200_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra201: "VC201 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC201_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei201 apply((auto simp add: VC201_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra202: "VC202 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC202_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei202 apply((auto simp add: VC202_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra203: "VC203 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC203_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei203 apply((auto simp add: VC203_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra204: "VC204 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC204_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei204 apply((auto simp add: VC204_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra205: "VC205 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC205_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei205 apply((auto simp add: VC205_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra206: "VC206 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC206_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei206 apply((auto simp add: VC206_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra207: "VC207 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC207_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei207 apply((auto simp add: VC207_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra208: "VC208 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC208_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei208 apply((auto simp add: VC208_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra209: "VC209 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC209_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei209 apply((auto simp add: VC209_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra210: "VC210 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC210_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei210 apply((auto simp add: VC210_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra211: "VC211 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC211_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei211 apply((auto simp add: VC211_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra212: "VC212 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC212_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei212 apply((auto simp add: VC212_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra213: "VC213 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC213_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei213 apply((auto simp add: VC213_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra214: "VC214 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC214_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei214 apply((auto simp add: VC214_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra215: "VC215 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC215_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei215 apply((auto simp add: VC215_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra216: "VC216 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC216_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei216 apply((auto simp add: VC216_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra217: "VC217 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC217_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei217 apply((auto simp add: VC217_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra218: "VC218 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC218_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei218 apply((auto simp add: VC218_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra219: "VC219 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC219_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei219 apply((auto simp add: VC219_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra220: "VC220 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC220_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei220 apply((auto simp add: VC220_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra221: "VC221 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC221_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei221 apply((auto simp add: VC221_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra222: "VC222 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC222_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei222 apply((auto simp add: VC222_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra223: "VC223 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC223_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei223 apply((auto simp add: VC223_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra224: "VC224 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC224_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei224 apply((auto simp add: VC224_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra225: "VC225 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC225_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei225 apply((auto simp add: VC225_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra226: "VC226 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC226_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei226 apply((auto simp add: VC226_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra227: "VC227 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC227_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei227 apply((auto simp add: VC227_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra228: "VC228 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC228_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei228 apply((auto simp add: VC228_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra229: "VC229 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC229_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei229 apply((auto simp add: VC229_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra230: "VC230 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC230_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei230 apply((auto simp add: VC230_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra231: "VC231 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC231_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei231 apply((auto simp add: VC231_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra232: "VC232 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC232_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei232 apply((auto simp add: VC232_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra233: "VC233 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC233_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei233 apply((auto simp add: VC233_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra234: "VC234 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC234_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei234 apply((auto simp add: VC234_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra235: "VC235 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC235_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei235 apply((auto simp add: VC235_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra236: "VC236 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC236_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei236 apply((auto simp add: VC236_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra237: "VC237 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC237_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei237 apply((auto simp add: VC237_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra238: "VC238 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC238_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei238 apply((auto simp add: VC238_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra239: "VC239 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC239_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei239 apply((auto simp add: VC239_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra240: "VC240 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC240_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei240 apply((auto simp add: VC240_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra241: "VC241 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC241_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei241 apply((auto simp add: VC241_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra242: "VC242 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC242_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei242 apply((auto simp add: VC242_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra243: "VC243 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC243_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei243 apply((auto simp add: VC243_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra244: "VC244 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC244_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei244 apply((auto simp add: VC244_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra245: "VC245 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC245_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei245 apply((auto simp add: VC245_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra246: "VC246 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC246_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei246 apply((auto simp add: VC246_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra247: "VC247 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC247_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei247 apply((auto simp add: VC247_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra248: "VC248 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC248_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei248 apply((auto simp add: VC248_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra249: "VC249 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC249_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei249 apply((auto simp add: VC249_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra250: "VC250 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC250_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei250 apply((auto simp add: VC250_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra251: "VC251 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC251_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei251 apply((auto simp add: VC251_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra252: "VC252 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC252_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei252 apply((auto simp add: VC252_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra253: "VC253 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC253_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei253 apply((auto simp add: VC253_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra254: "VC254 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC254_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei254 apply((auto simp add: VC254_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra255: "VC255 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC255_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei255 apply((auto simp add: VC255_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra256: "VC256 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC256_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei256 apply((auto simp add: VC256_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra257: "VC257 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC257_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei257 apply((auto simp add: VC257_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra258: "VC258 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC258_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei258 apply((auto simp add: VC258_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra259: "VC259 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC259_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei259 apply((auto simp add: VC259_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra260: "VC260 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC260_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei260 apply((auto simp add: VC260_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra261: "VC261 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC261_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei261 apply((auto simp add: VC261_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra262: "VC262 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC262_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei262 apply((auto simp add: VC262_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra263: "VC263 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC263_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei263 apply((auto simp add: VC263_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra264: "VC264 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC264_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei264 apply((auto simp add: VC264_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra265: "VC265 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC265_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei265 apply((auto simp add: VC265_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra266: "VC266 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC266_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei266 apply((auto simp add: VC266_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra267: "VC267 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC267_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei267 apply((auto simp add: VC267_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra268: "VC268 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC268_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei268 apply((auto simp add: VC268_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra269: "VC269 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC269_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei269 apply((auto simp add: VC269_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra270: "VC270 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC270_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei270 apply((auto simp add: VC270_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra271: "VC271 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC271_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei271 apply((auto simp add: VC271_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra272: "VC272 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC272_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei272 apply((auto simp add: VC272_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra273: "VC273 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC273_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei273 apply((auto simp add: VC273_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra274: "VC274 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC274_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei274 apply((auto simp add: VC274_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra275: "VC275 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC275_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei275 apply((auto simp add: VC275_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra276: "VC276 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC276_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei276 apply((auto simp add: VC276_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra277: "VC277 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC277_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei277 apply((auto simp add: VC277_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra278: "VC278 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC278_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei278 apply((auto simp add: VC278_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra279: "VC279 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC279_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei279 apply((auto simp add: VC279_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra280: "VC280 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC280_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei280 apply((auto simp add: VC280_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra281: "VC281 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC281_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei281 apply((auto simp add: VC281_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra282: "VC282 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC282_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei282 apply((auto simp add: VC282_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra283: "VC283 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC283_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei283 apply((auto simp add: VC283_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra284: "VC284 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC284_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei284 apply((auto simp add: VC284_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra285: "VC285 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC285_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei285 apply((auto simp add: VC285_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra286: "VC286 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC286_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei286 apply((auto simp add: VC286_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra287: "VC287 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC287_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei287 apply((auto simp add: VC287_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra288: "VC288 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC288_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei288 apply((auto simp add: VC288_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra289: "VC289 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC289_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei289 apply((auto simp add: VC289_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra290: "VC290 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC290_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei290 apply((auto simp add: VC290_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra291: "VC291 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC291_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei291 apply((auto simp add: VC291_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra292: "VC292 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC292_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei292 apply((auto simp add: VC292_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra293: "VC293 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC293_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei293 apply((auto simp add: VC293_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra294: "VC294 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC294_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei294 apply((auto simp add: VC294_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra295: "VC295 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC295_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei295 apply((auto simp add: VC295_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra296: "VC296 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC296_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei296 apply((auto simp add: VC296_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra297: "VC297 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC297_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei297 apply((auto simp add: VC297_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra298: "VC298 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC298_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei298 apply((auto simp add: VC298_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra299: "VC299 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC299_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei299 apply((auto simp add: VC299_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra300: "VC300 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC300_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei300 apply((auto simp add: VC300_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra301: "VC301 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC301_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei301 apply((auto simp add: VC301_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra302: "VC302 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC302_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei302 apply((auto simp add: VC302_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra303: "VC303 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC303_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei303 apply((auto simp add: VC303_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra304: "VC304 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC304_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei304 apply((auto simp add: VC304_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra305: "VC305 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC305_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei305 apply((auto simp add: VC305_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra306: "VC306 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC306_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei306 apply((auto simp add: VC306_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra307: "VC307 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC307_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei307 apply((auto simp add: VC307_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra308: "VC308 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC308_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei308 apply((auto simp add: VC308_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra309: "VC309 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC309_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei309 apply((auto simp add: VC309_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra310: "VC310 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC310_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei310 apply((auto simp add: VC310_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra311: "VC311 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC311_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei311 apply((auto simp add: VC311_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra312: "VC312 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC312_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei312 apply((auto simp add: VC312_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra313: "VC313 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC313_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei313 apply((auto simp add: VC313_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra314: "VC314 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC314_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei314 apply((auto simp add: VC314_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra315: "VC315 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC315_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei315 apply((auto simp add: VC315_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra316: "VC316 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC316_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei316 apply((auto simp add: VC316_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra317: "VC317 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC317_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei317 apply((auto simp add: VC317_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra318: "VC318 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC318_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei318 apply((auto simp add: VC318_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra319: "VC319 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC319_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei319 apply((auto simp add: VC319_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra320: "VC320 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC320_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei320 apply((auto simp add: VC320_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra321: "VC321 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC321_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei321 apply((auto simp add: VC321_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra322: "VC322 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC322_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei322 apply((auto simp add: VC322_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra323: "VC323 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC323_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei323 apply((auto simp add: VC323_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra324: "VC324 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC324_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei324 apply((auto simp add: VC324_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra325: "VC325 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC325_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei325 apply((auto simp add: VC325_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra326: "VC326 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC326_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei326 apply((auto simp add: VC326_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra327: "VC327 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC327_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei327 apply((auto simp add: VC327_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra328: "VC328 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC328_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei328 apply((auto simp add: VC328_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra329: "VC329 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC329_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei329 apply((auto simp add: VC329_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra330: "VC330 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC330_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei330 apply((auto simp add: VC330_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra331: "VC331 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC331_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei331 apply((auto simp add: VC331_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra332: "VC332 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC332_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei332 apply((auto simp add: VC332_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra333: "VC333 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC333_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei333 apply((auto simp add: VC333_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra334: "VC334 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC334_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei334 apply((auto simp add: VC334_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra335: "VC335 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC335_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei335 apply((auto simp add: VC335_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra336: "VC336 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC336_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei336 apply((auto simp add: VC336_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra337: "VC337 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC337_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei337 apply((auto simp add: VC337_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra338: "VC338 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC338_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei338 apply((auto simp add: VC338_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra339: "VC339 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC339_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei339 apply((auto simp add: VC339_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra340: "VC340 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC340_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei340 apply((auto simp add: VC340_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra341: "VC341 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC341_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei341 apply((auto simp add: VC341_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra342: "VC342 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC342_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei342 apply((auto simp add: VC342_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra343: "VC343 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC343_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei343 apply((auto simp add: VC343_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra344: "VC344 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC344_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei344 apply((auto simp add: VC344_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra345: "VC345 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC345_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei345 apply((auto simp add: VC345_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra346: "VC346 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC346_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei346 apply((auto simp add: VC346_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra347: "VC347 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC347_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei347 apply((auto simp add: VC347_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra348: "VC348 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC348_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei348 apply((auto simp add: VC348_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra349: "VC349 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC349_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei349 apply((auto simp add: VC349_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra350: "VC350 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC350_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei350 apply((auto simp add: VC350_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra351: "VC351 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC351_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei351 apply((auto simp add: VC351_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra352: "VC352 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC352_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei352 apply((auto simp add: VC352_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra353: "VC353 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC353_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei353 apply((auto simp add: VC353_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra354: "VC354 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC354_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei354 apply((auto simp add: VC354_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra355: "VC355 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC355_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei355 apply((auto simp add: VC355_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra356: "VC356 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC356_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei356 apply((auto simp add: VC356_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra357: "VC357 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC357_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei357 apply((auto simp add: VC357_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra358: "VC358 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC358_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei358 apply((auto simp add: VC358_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra359: "VC359 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC359_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei359 apply((auto simp add: VC359_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra360: "VC360 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC360_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei360 apply((auto simp add: VC360_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra361: "VC361 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC361_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei361 apply((auto simp add: VC361_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra362: "VC362 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC362_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei362 apply((auto simp add: VC362_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra363: "VC363 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC363_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei363 apply((auto simp add: VC363_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra364: "VC364 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC364_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei364 apply((auto simp add: VC364_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra365: "VC365 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC365_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei365 apply((auto simp add: VC365_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra366: "VC366 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC366_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei366 apply((auto simp add: VC366_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra367: "VC367 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC367_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei367 apply((auto simp add: VC367_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra368: "VC368 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC368_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei368 apply((auto simp add: VC368_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra369: "VC369 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC369_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei369 apply((auto simp add: VC369_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra370: "VC370 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC370_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei370 apply((auto simp add: VC370_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra371: "VC371 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC371_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei371 apply((auto simp add: VC371_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra372: "VC372 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC372_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei372 apply((auto simp add: VC372_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra373: "VC373 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC373_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei373 apply((auto simp add: VC373_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra374: "VC374 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC374_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei374 apply((auto simp add: VC374_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra375: "VC375 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC375_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei375 apply((auto simp add: VC375_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra376: "VC376 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC376_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei376 apply((auto simp add: VC376_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra377: "VC377 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC377_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei377 apply((auto simp add: VC377_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra378: "VC378 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC378_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei378 apply((auto simp add: VC378_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra379: "VC379 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC379_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei379 apply((auto simp add: VC379_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra380: "VC380 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC380_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei380 apply((auto simp add: VC380_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra381: "VC381 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC381_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei381 apply((auto simp add: VC381_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra382: "VC382 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC382_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei382 apply((auto simp add: VC382_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra383: "VC383 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC383_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei383 apply((auto simp add: VC383_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra384: "VC384 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC384_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei384 apply((auto simp add: VC384_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra385: "VC385 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC385_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei385 apply((auto simp add: VC385_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra386: "VC386 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC386_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei386 apply((auto simp add: VC386_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra387: "VC387 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC387_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei387 apply((auto simp add: VC387_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra388: "VC388 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC388_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei388 apply((auto simp add: VC388_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra389: "VC389 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC389_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei389 apply((auto simp add: VC389_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra390: "VC390 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC390_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei390 apply((auto simp add: VC390_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra391: "VC391 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC391_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei391 apply((auto simp add: VC391_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra392: "VC392 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC392_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei392 apply((auto simp add: VC392_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra393: "VC393 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC393_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei393 apply((auto simp add: VC393_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra394: "VC394 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC394_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei394 apply((auto simp add: VC394_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra395: "VC395 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC395_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei395 apply((auto simp add: VC395_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra396: "VC396 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC396_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei396 apply((auto simp add: VC396_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra397: "VC397 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC397_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei397 apply((auto simp add: VC397_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra398: "VC398 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC398_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei398 apply((auto simp add: VC398_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra399: "VC399 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC399_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei399 apply((auto simp add: VC399_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra400: "VC400 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC400_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei400 apply((auto simp add: VC400_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra401: "VC401 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC401_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei401 apply((auto simp add: VC401_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra402: "VC402 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC402_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei402 apply((auto simp add: VC402_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra403: "VC403 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC403_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei403 apply((auto simp add: VC403_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra404: "VC404 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC404_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei404 apply((auto simp add: VC404_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra405: "VC405 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC405_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei405 apply((auto simp add: VC405_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra406: "VC406 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC406_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei406 apply((auto simp add: VC406_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra407: "VC407 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC407_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei407 apply((auto simp add: VC407_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra408: "VC408 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC408_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei408 apply((auto simp add: VC408_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra409: "VC409 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC409_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei409 apply((auto simp add: VC409_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra410: "VC410 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC410_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei410 apply((auto simp add: VC410_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra411: "VC411 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC411_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei411 apply((auto simp add: VC411_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra412: "VC412 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC412_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei412 apply((auto simp add: VC412_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra413: "VC413 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC413_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei413 apply((auto simp add: VC413_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra414: "VC414 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC414_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei414 apply((auto simp add: VC414_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra415: "VC415 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC415_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei415 apply((auto simp add: VC415_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra416: "VC416 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC416_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei416 apply((auto simp add: VC416_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra417: "VC417 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC417_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei417 apply((auto simp add: VC417_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra418: "VC418 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC418_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei418 apply((auto simp add: VC418_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra419: "VC419 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC419_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei419 apply((auto simp add: VC419_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra420: "VC420 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC420_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei420 apply((auto simp add: VC420_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra421: "VC421 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC421_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei421 apply((auto simp add: VC421_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra422: "VC422 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC422_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei422 apply((auto simp add: VC422_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra423: "VC423 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC423_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei423 apply((auto simp add: VC423_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra424: "VC424 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC424_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei424 apply((auto simp add: VC424_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra425: "VC425 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC425_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei425 apply((auto simp add: VC425_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra426: "VC426 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC426_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei426 apply((auto simp add: VC426_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra427: "VC427 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC427_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei427 apply((auto simp add: VC427_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra428: "VC428 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC428_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei428 apply((auto simp add: VC428_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra429: "VC429 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC429_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei429 apply((auto simp add: VC429_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra430: "VC430 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC430_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei430 apply((auto simp add: VC430_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra431: "VC431 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC431_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei431 apply((auto simp add: VC431_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra432: "VC432 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC432_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei432 apply((auto simp add: VC432_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra433: "VC433 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC433_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei433 apply((auto simp add: VC433_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra434: "VC434 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC434_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei434 apply((auto simp add: VC434_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra435: "VC435 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC435_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei435 apply((auto simp add: VC435_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra436: "VC436 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC436_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei436 apply((auto simp add: VC436_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra437: "VC437 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC437_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei437 apply((auto simp add: VC437_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra438: "VC438 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC438_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei438 apply((auto simp add: VC438_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra439: "VC439 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC439_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei439 apply((auto simp add: VC439_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra440: "VC440 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC440_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei440 apply((auto simp add: VC440_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra441: "VC441 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC441_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei441 apply((auto simp add: VC441_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra442: "VC442 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC442_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei442 apply((auto simp add: VC442_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra443: "VC443 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC443_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei443 apply((auto simp add: VC443_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra444: "VC444 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC444_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei444 apply((auto simp add: VC444_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra445: "VC445 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC445_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei445 apply((auto simp add: VC445_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra446: "VC446 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC446_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei446 apply((auto simp add: VC446_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra447: "VC447 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC447_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei447 apply((auto simp add: VC447_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra448: "VC448 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC448_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei448 apply((auto simp add: VC448_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra449: "VC449 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC449_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei449 apply((auto simp add: VC449_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra450: "VC450 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC450_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei450 apply((auto simp add: VC450_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra451: "VC451 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC451_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei451 apply((auto simp add: VC451_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra452: "VC452 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC452_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei452 apply((auto simp add: VC452_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra453: "VC453 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC453_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei453 apply((auto simp add: VC453_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra454: "VC454 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC454_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei454 apply((auto simp add: VC454_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra455: "VC455 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC455_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei455 apply((auto simp add: VC455_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra456: "VC456 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC456_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei456 apply((auto simp add: VC456_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra457: "VC457 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC457_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei457 apply((auto simp add: VC457_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra458: "VC458 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC458_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei458 apply((auto simp add: VC458_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra459: "VC459 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC459_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei459 apply((auto simp add: VC459_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra460: "VC460 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC460_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei460 apply((auto simp add: VC460_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra461: "VC461 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC461_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei461 apply((auto simp add: VC461_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra462: "VC462 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC462_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei462 apply((auto simp add: VC462_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra463: "VC463 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC463_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei463 apply((auto simp add: VC463_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra464: "VC464 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC464_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei464 apply((auto simp add: VC464_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra465: "VC465 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC465_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei465 apply((auto simp add: VC465_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra466: "VC466 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC466_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei466 apply((auto simp add: VC466_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra467: "VC467 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC467_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei467 apply((auto simp add: VC467_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra468: "VC468 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC468_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei468 apply((auto simp add: VC468_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra469: "VC469 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC469_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei469 apply((auto simp add: VC469_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra470: "VC470 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC470_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei470 apply((auto simp add: VC470_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra471: "VC471 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC471_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei471 apply((auto simp add: VC471_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra472: "VC472 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC472_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei472 apply((auto simp add: VC472_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra473: "VC473 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC473_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei473 apply((auto simp add: VC473_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra474: "VC474 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC474_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei474 apply((auto simp add: VC474_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra475: "VC475 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC475_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei475 apply((auto simp add: VC475_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra476: "VC476 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC476_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei476 apply((auto simp add: VC476_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra477: "VC477 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC477_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei477 apply((auto simp add: VC477_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra478: "VC478 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC478_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei478 apply((auto simp add: VC478_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra479: "VC479 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC479_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei479 apply((auto simp add: VC479_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra480: "VC480 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC480_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei480 apply((auto simp add: VC480_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra481: "VC481 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC481_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei481 apply((auto simp add: VC481_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra482: "VC482 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC482_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei482 apply((auto simp add: VC482_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra483: "VC483 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC483_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei483 apply((auto simp add: VC483_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra484: "VC484 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC484_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei484 apply((auto simp add: VC484_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra485: "VC485 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC485_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei485 apply((auto simp add: VC485_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra486: "VC486 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC486_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei486 apply((auto simp add: VC486_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra487: "VC487 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC487_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei487 apply((auto simp add: VC487_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra488: "VC488 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC488_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei488 apply((auto simp add: VC488_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra489: "VC489 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC489_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei489 apply((auto simp add: VC489_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra490: "VC490 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC490_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei490 apply((auto simp add: VC490_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra491: "VC491 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC491_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei491 apply((auto simp add: VC491_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra492: "VC492 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC492_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei492 apply((auto simp add: VC492_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra493: "VC493 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC493_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei493 apply((auto simp add: VC493_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra494: "VC494 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC494_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei494 apply((auto simp add: VC494_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra495: "VC495 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC495_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei495 apply((auto simp add: VC495_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra496: "VC496 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC496_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei496 apply((auto simp add: VC496_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra497: "VC497 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC497_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei497 apply((auto simp add: VC497_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra498: "VC498 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC498_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei498 apply((auto simp add: VC498_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra499: "VC499 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC499_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei499 apply((auto simp add: VC499_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra500: "VC500 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC500_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei500 apply((auto simp add: VC500_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra501: "VC501 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC501_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei501 apply((auto simp add: VC501_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra502: "VC502 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC502_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei502 apply((auto simp add: VC502_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra503: "VC503 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC503_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei503 apply((auto simp add: VC503_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra504: "VC504 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC504_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei504 apply((auto simp add: VC504_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra505: "VC505 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC505_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei505 apply((auto simp add: VC505_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra506: "VC506 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC506_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei506 apply((auto simp add: VC506_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra507: "VC507 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC507_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei507 apply((auto simp add: VC507_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra508: "VC508 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC508_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei508 apply((auto simp add: VC508_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra509: "VC509 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC509_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei509 apply((auto simp add: VC509_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra510: "VC510 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC510_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei510 apply((auto simp add: VC510_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra511: "VC511 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC511_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei511 apply((auto simp add: VC511_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra512: "VC512 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC512_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei512 apply((auto simp add: VC512_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra513: "VC513 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC513_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei513 apply((auto simp add: VC513_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra514: "VC514 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC514_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei514 apply((auto simp add: VC514_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra515: "VC515 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC515_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei515 apply((auto simp add: VC515_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra516: "VC516 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC516_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei516 apply((auto simp add: VC516_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra517: "VC517 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC517_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei517 apply((auto simp add: VC517_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra518: "VC518 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC518_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei518 apply((auto simp add: VC518_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra519: "VC519 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC519_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei519 apply((auto simp add: VC519_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra520: "VC520 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC520_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei520 apply((auto simp add: VC520_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra521: "VC521 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC521_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei521 apply((auto simp add: VC521_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra522: "VC522 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC522_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei522 apply((auto simp add: VC522_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra523: "VC523 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC523_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei523 apply((auto simp add: VC523_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra524: "VC524 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC524_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei524 apply((auto simp add: VC524_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra525: "VC525 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC525_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei525 apply((auto simp add: VC525_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra526: "VC526 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC526_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei526 apply((auto simp add: VC526_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra527: "VC527 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC527_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei527 apply((auto simp add: VC527_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra528: "VC528 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC528_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei528 apply((auto simp add: VC528_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra529: "VC529 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC529_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei529 apply((auto simp add: VC529_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra530: "VC530 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC530_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei530 apply((auto simp add: VC530_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra531: "VC531 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC531_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei531 apply((auto simp add: VC531_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra532: "VC532 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC532_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei532 apply((auto simp add: VC532_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra533: "VC533 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC533_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei533 apply((auto simp add: VC533_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra534: "VC534 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC534_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei534 apply((auto simp add: VC534_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra535: "VC535 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC535_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei535 apply((auto simp add: VC535_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra536: "VC536 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC536_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei536 apply((auto simp add: VC536_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra537: "VC537 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC537_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei537 apply((auto simp add: VC537_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra538: "VC538 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC538_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei538 apply((auto simp add: VC538_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra539: "VC539 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC539_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei539 apply((auto simp add: VC539_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra540: "VC540 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC540_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei540 apply((auto simp add: VC540_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra541: "VC541 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC541_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei541 apply((auto simp add: VC541_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra542: "VC542 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC542_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei542 apply((auto simp add: VC542_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra543: "VC543 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC543_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei543 apply((auto simp add: VC543_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra544: "VC544 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC544_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei544 apply((auto simp add: VC544_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra545: "VC545 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC545_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei545 apply((auto simp add: VC545_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra546: "VC546 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC546_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei546 apply((auto simp add: VC546_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra547: "VC547 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC547_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei547 apply((auto simp add: VC547_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra548: "VC548 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC548_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei548 apply((auto simp add: VC548_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra549: "VC549 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC549_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei549 apply((auto simp add: VC549_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra550: "VC550 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC550_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei550 apply((auto simp add: VC550_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra551: "VC551 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC551_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei551 apply((auto simp add: VC551_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra552: "VC552 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC552_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei552 apply((auto simp add: VC552_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra553: "VC553 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC553_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei553 apply((auto simp add: VC553_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra554: "VC554 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC554_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei554 apply((auto simp add: VC554_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra555: "VC555 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC555_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei555 apply((auto simp add: VC555_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra556: "VC556 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC556_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei556 apply((auto simp add: VC556_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra557: "VC557 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC557_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei557 apply((auto simp add: VC557_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra558: "VC558 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC558_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei558 apply((auto simp add: VC558_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra559: "VC559 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC559_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei559 apply((auto simp add: VC559_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra560: "VC560 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC560_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei560 apply((auto simp add: VC560_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra561: "VC561 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC561_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei561 apply((auto simp add: VC561_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra562: "VC562 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC562_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei562 apply((auto simp add: VC562_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra563: "VC563 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC563_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei563 apply((auto simp add: VC563_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra564: "VC564 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC564_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei564 apply((auto simp add: VC564_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra565: "VC565 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC565_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei565 apply((auto simp add: VC565_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra566: "VC566 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC566_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei566 apply((auto simp add: VC566_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra567: "VC567 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC567_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei567 apply((auto simp add: VC567_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra568: "VC568 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC568_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei568 apply((auto simp add: VC568_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra569: "VC569 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC569_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei569 apply((auto simp add: VC569_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra570: "VC570 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC570_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei570 apply((auto simp add: VC570_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra571: "VC571 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC571_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei571 apply((auto simp add: VC571_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra572: "VC572 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC572_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei572 apply((auto simp add: VC572_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra573: "VC573 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC573_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei573 apply((auto simp add: VC573_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra574: "VC574 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC574_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei574 apply((auto simp add: VC574_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra575: "VC575 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC575_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei575 apply((auto simp add: VC575_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra576: "VC576 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC576_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei576 apply((auto simp add: VC576_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra577: "VC577 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC577_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei577 apply((auto simp add: VC577_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra578: "VC578 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC578_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei578 apply((auto simp add: VC578_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra579: "VC579 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC579_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei579 apply((auto simp add: VC579_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra580: "VC580 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC580_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei580 apply((auto simp add: VC580_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra581: "VC581 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC581_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei581 apply((auto simp add: VC581_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra582: "VC582 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC582_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei582 apply((auto simp add: VC582_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra583: "VC583 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC583_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei583 apply((auto simp add: VC583_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra584: "VC584 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC584_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei584 apply((auto simp add: VC584_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra585: "VC585 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC585_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei585 apply((auto simp add: VC585_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra586: "VC586 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC586_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei586 apply((auto simp add: VC586_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra587: "VC587 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC587_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei587 apply((auto simp add: VC587_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra588: "VC588 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC588_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei588 apply((auto simp add: VC588_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra589: "VC589 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC589_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei589 apply((auto simp add: VC589_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra590: "VC590 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC590_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei590 apply((auto simp add: VC590_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra591: "VC591 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC591_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei591 apply((auto simp add: VC591_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra592: "VC592 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC592_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei592 apply((auto simp add: VC592_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra593: "VC593 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC593_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei593 apply((auto simp add: VC593_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra594: "VC594 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC594_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei594 apply((auto simp add: VC594_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra595: "VC595 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC595_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei595 apply((auto simp add: VC595_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra596: "VC596 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC596_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei596 apply((auto simp add: VC596_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra597: "VC597 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC597_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei597 apply((auto simp add: VC597_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra598: "VC598 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC598_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei598 apply((auto simp add: VC598_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra599: "VC599 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC599_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei599 apply((auto simp add: VC599_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra600: "VC600 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC600_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei600 apply((auto simp add: VC600_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra601: "VC601 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC601_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei601 apply((auto simp add: VC601_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra602: "VC602 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC602_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei602 apply((auto simp add: VC602_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra603: "VC603 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC603_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei603 apply((auto simp add: VC603_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra604: "VC604 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC604_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei604 apply((auto simp add: VC604_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra605: "VC605 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC605_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei605 apply((auto simp add: VC605_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra606: "VC606 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC606_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei606 apply((auto simp add: VC606_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra607: "VC607 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC607_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei607 apply((auto simp add: VC607_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra608: "VC608 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC608_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei608 apply((auto simp add: VC608_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra609: "VC609 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC609_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei609 apply((auto simp add: VC609_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra610: "VC610 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC610_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei610 apply((auto simp add: VC610_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra611: "VC611 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC611_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei611 apply((auto simp add: VC611_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra612: "VC612 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC612_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei612 apply((auto simp add: VC612_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra613: "VC613 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC613_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei613 apply((auto simp add: VC613_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra614: "VC614 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC614_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei614 apply((auto simp add: VC614_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra615: "VC615 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC615_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei615 apply((auto simp add: VC615_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra616: "VC616 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC616_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei616 apply((auto simp add: VC616_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra617: "VC617 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC617_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei617 apply((auto simp add: VC617_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra618: "VC618 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC618_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei618 apply((auto simp add: VC618_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra619: "VC619 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC619_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei619 apply((auto simp add: VC619_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra620: "VC620 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC620_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei620 apply((auto simp add: VC620_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra621: "VC621 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC621_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei621 apply((auto simp add: VC621_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra622: "VC622 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC622_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei622 apply((auto simp add: VC622_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra623: "VC623 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC623_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei623 apply((auto simp add: VC623_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra624: "VC624 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC624_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei624 apply((auto simp add: VC624_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra625: "VC625 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC625_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei625 apply((auto simp add: VC625_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra626: "VC626 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC626_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei626 apply((auto simp add: VC626_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra627: "VC627 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC627_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei627 apply((auto simp add: VC627_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra628: "VC628 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC628_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei628 apply((auto simp add: VC628_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra629: "VC629 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC629_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei629 apply((auto simp add: VC629_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra630: "VC630 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC630_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei630 apply((auto simp add: VC630_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra631: "VC631 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC631_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei631 apply((auto simp add: VC631_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra632: "VC632 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC632_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei632 apply((auto simp add: VC632_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra633: "VC633 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC633_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei633 apply((auto simp add: VC633_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra634: "VC634 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC634_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei634 apply((auto simp add: VC634_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra635: "VC635 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC635_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei635 apply((auto simp add: VC635_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra636: "VC636 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC636_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei636 apply((auto simp add: VC636_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra637: "VC637 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC637_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei637 apply((auto simp add: VC637_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra638: "VC638 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC638_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei638 apply((auto simp add: VC638_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra639: "VC639 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC639_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei639 apply((auto simp add: VC639_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra640: "VC640 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC640_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei640 apply((auto simp add: VC640_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra641: "VC641 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC641_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei641 apply((auto simp add: VC641_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra642: "VC642 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC642_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei642 apply((auto simp add: VC642_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra643: "VC643 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC643_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei643 apply((auto simp add: VC643_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra644: "VC644 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC644_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei644 apply((auto simp add: VC644_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra645: "VC645 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC645_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei645 apply((auto simp add: VC645_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra646: "VC646 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC646_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei646 apply((auto simp add: VC646_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra647: "VC647 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC647_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei647 apply((auto simp add: VC647_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra648: "VC648 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC648_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei648 apply((auto simp add: VC648_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra649: "VC649 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC649_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei649 apply((auto simp add: VC649_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra650: "VC650 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC650_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei650 apply((auto simp add: VC650_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra651: "VC651 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC651_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei651 apply((auto simp add: VC651_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra652: "VC652 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC652_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei652 apply((auto simp add: VC652_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra653: "VC653 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC653_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei653 apply((auto simp add: VC653_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra654: "VC654 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC654_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei654 apply((auto simp add: VC654_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra655: "VC655 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC655_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei655 apply((auto simp add: VC655_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra656: "VC656 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC656_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei656 apply((auto simp add: VC656_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra657: "VC657 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC657_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei657 apply((auto simp add: VC657_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra658: "VC658 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC658_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei658 apply((auto simp add: VC658_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra659: "VC659 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC659_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei659 apply((auto simp add: VC659_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra660: "VC660 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC660_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei660 apply((auto simp add: VC660_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra661: "VC661 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC661_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei661 apply((auto simp add: VC661_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra662: "VC662 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC662_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei662 apply((auto simp add: VC662_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra663: "VC663 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC663_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei663 apply((auto simp add: VC663_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra664: "VC664 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC664_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei664 apply((auto simp add: VC664_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra665: "VC665 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC665_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei665 apply((auto simp add: VC665_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra666: "VC666 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC666_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei666 apply((auto simp add: VC666_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra667: "VC667 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC667_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei667 apply((auto simp add: VC667_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra668: "VC668 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC668_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei668 apply((auto simp add: VC668_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra669: "VC669 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC669_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei669 apply((auto simp add: VC669_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra670: "VC670 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC670_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei670 apply((auto simp add: VC670_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra671: "VC671 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC671_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei671 apply((auto simp add: VC671_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra672: "VC672 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC672_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei672 apply((auto simp add: VC672_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra673: "VC673 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC673_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei673 apply((auto simp add: VC673_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra674: "VC674 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC674_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei674 apply((auto simp add: VC674_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra675: "VC675 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC675_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei675 apply((auto simp add: VC675_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra676: "VC676 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC676_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei676 apply((auto simp add: VC676_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra677: "VC677 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC677_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei677 apply((auto simp add: VC677_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra678: "VC678 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC678_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei678 apply((auto simp add: VC678_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra679: "VC679 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC679_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei679 apply((auto simp add: VC679_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra680: "VC680 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC680_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei680 apply((auto simp add: VC680_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra681: "VC681 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC681_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei681 apply((auto simp add: VC681_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra682: "VC682 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC682_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei682 apply((auto simp add: VC682_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra683: "VC683 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC683_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei683 apply((auto simp add: VC683_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra684: "VC684 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC684_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei684 apply((auto simp add: VC684_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra685: "VC685 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC685_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei685 apply((auto simp add: VC685_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra686: "VC686 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC686_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei686 apply((auto simp add: VC686_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra687: "VC687 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC687_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei687 apply((auto simp add: VC687_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra688: "VC688 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC688_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei688 apply((auto simp add: VC688_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra689: "VC689 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC689_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei689 apply((auto simp add: VC689_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra690: "VC690 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC690_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei690 apply((auto simp add: VC690_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra691: "VC691 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC691_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei691 apply((auto simp add: VC691_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra692: "VC692 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC692_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei692 apply((auto simp add: VC692_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra693: "VC693 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC693_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei693 apply((auto simp add: VC693_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra694: "VC694 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC694_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei694 apply((auto simp add: VC694_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra695: "VC695 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC695_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei695 apply((auto simp add: VC695_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra696: "VC696 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC696_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei696 apply((auto simp add: VC696_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra697: "VC697 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC697_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei697 apply((auto simp add: VC697_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra698: "VC698 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC698_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei698 apply((auto simp add: VC698_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra699: "VC699 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC699_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei699 apply((auto simp add: VC699_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra700: "VC700 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC700_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei700 apply((auto simp add: VC700_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra701: "VC701 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC701_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei701 apply((auto simp add: VC701_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra702: "VC702 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC702_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei702 apply((auto simp add: VC702_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra703: "VC703 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC703_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei703 apply((auto simp add: VC703_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra704: "VC704 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC704_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei704 apply((auto simp add: VC704_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra705: "VC705 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC705_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei705 apply((auto simp add: VC705_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra706: "VC706 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC706_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei706 apply((auto simp add: VC706_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra707: "VC707 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC707_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei707 apply((auto simp add: VC707_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra708: "VC708 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC708_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei708 apply((auto simp add: VC708_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra709: "VC709 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC709_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei709 apply((auto simp add: VC709_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra710: "VC710 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC710_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei710 apply((auto simp add: VC710_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra711: "VC711 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC711_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei711 apply((auto simp add: VC711_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra712: "VC712 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC712_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei712 apply((auto simp add: VC712_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra713: "VC713 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC713_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei713 apply((auto simp add: VC713_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra714: "VC714 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC714_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei714 apply((auto simp add: VC714_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra715: "VC715 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC715_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei715 apply((auto simp add: VC715_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra716: "VC716 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC716_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei716 apply((auto simp add: VC716_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra717: "VC717 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC717_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei717 apply((auto simp add: VC717_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra718: "VC718 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC718_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei718 apply((auto simp add: VC718_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra719: "VC719 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC719_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei719 apply((auto simp add: VC719_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra720: "VC720 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC720_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei720 apply((auto simp add: VC720_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra721: "VC721 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC721_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei721 apply((auto simp add: VC721_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra722: "VC722 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC722_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei722 apply((auto simp add: VC722_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra723: "VC723 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC723_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei723 apply((auto simp add: VC723_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra724: "VC724 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC724_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei724 apply((auto simp add: VC724_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra725: "VC725 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC725_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei725 apply((auto simp add: VC725_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra726: "VC726 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC726_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei726 apply((auto simp add: VC726_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra727: "VC727 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC727_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei727 apply((auto simp add: VC727_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra728: "VC728 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC728_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei728 apply((auto simp add: VC728_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra729: "VC729 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC729_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei729 apply((auto simp add: VC729_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra730: "VC730 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC730_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei730 apply((auto simp add: VC730_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra731: "VC731 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC731_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei731 apply((auto simp add: VC731_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra732: "VC732 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC732_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei732 apply((auto simp add: VC732_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra733: "VC733 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC733_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei733 apply((auto simp add: VC733_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra734: "VC734 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC734_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei734 apply((auto simp add: VC734_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra735: "VC735 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC735_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei735 apply((auto simp add: VC735_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra736: "VC736 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC736_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei736 apply((auto simp add: VC736_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra737: "VC737 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC737_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei737 apply((auto simp add: VC737_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra738: "VC738 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC738_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei738 apply((auto simp add: VC738_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra739: "VC739 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC739_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei739 apply((auto simp add: VC739_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra740: "VC740 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC740_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei740 apply((auto simp add: VC740_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra741: "VC741 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC741_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei741 apply((auto simp add: VC741_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra742: "VC742 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC742_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei742 apply((auto simp add: VC742_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra743: "VC743 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC743_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei743 apply((auto simp add: VC743_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra744: "VC744 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC744_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei744 apply((auto simp add: VC744_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra745: "VC745 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC745_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei745 apply((auto simp add: VC745_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra746: "VC746 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC746_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei746 apply((auto simp add: VC746_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra747: "VC747 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC747_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei747 apply((auto simp add: VC747_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra748: "VC748 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC748_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei748 apply((auto simp add: VC748_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra749: "VC749 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC749_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei749 apply((auto simp add: VC749_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra750: "VC750 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC750_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei750 apply((auto simp add: VC750_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra751: "VC751 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC751_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei751 apply((auto simp add: VC751_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra752: "VC752 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC752_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei752 apply((auto simp add: VC752_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra753: "VC753 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC753_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei753 apply((auto simp add: VC753_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra754: "VC754 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC754_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei754 apply((auto simp add: VC754_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra755: "VC755 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC755_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei755 apply((auto simp add: VC755_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra756: "VC756 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC756_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei756 apply((auto simp add: VC756_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra757: "VC757 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC757_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei757 apply((auto simp add: VC757_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra758: "VC758 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC758_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei758 apply((auto simp add: VC758_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra759: "VC759 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC759_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei759 apply((auto simp add: VC759_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra760: "VC760 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC760_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei760 apply((auto simp add: VC760_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra761: "VC761 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC761_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei761 apply((auto simp add: VC761_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra762: "VC762 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC762_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei762 apply((auto simp add: VC762_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra763: "VC763 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC763_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei763 apply((auto simp add: VC763_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra764: "VC764 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC764_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei764 apply((auto simp add: VC764_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra765: "VC765 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC765_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei765 apply((auto simp add: VC765_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra766: "VC766 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC766_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei766 apply((auto simp add: VC766_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra767: "VC767 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC767_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei767 apply((auto simp add: VC767_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra768: "VC768 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC768_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei768 apply((auto simp add: VC768_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra769: "VC769 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC769_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei769 apply((auto simp add: VC769_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra770: "VC770 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC770_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei770 apply((auto simp add: VC770_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra771: "VC771 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC771_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei771 apply((auto simp add: VC771_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra772: "VC772 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC772_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei772 apply((auto simp add: VC772_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra773: "VC773 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC773_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei773 apply((auto simp add: VC773_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra774: "VC774 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC774_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei774 apply((auto simp add: VC774_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra775: "VC775 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC775_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei775 apply((auto simp add: VC775_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra776: "VC776 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC776_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei776 apply((auto simp add: VC776_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra777: "VC777 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC777_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei777 apply((auto simp add: VC777_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra778: "VC778 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC778_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei778 apply((auto simp add: VC778_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra779: "VC779 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC779_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei779 apply((auto simp add: VC779_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra780: "VC780 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC780_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei780 apply((auto simp add: VC780_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra781: "VC781 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC781_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei781 apply((auto simp add: VC781_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra782: "VC782 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC782_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei782 apply((auto simp add: VC782_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra783: "VC783 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC783_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei783 apply((auto simp add: VC783_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra784: "VC784 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC784_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei784 apply((auto simp add: VC784_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra785: "VC785 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC785_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei785 apply((auto simp add: VC785_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra786: "VC786 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC786_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei786 apply((auto simp add: VC786_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra787: "VC787 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC787_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei787 apply((auto simp add: VC787_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra788: "VC788 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC788_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei788 apply((auto simp add: VC788_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra789: "VC789 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC789_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei789 apply((auto simp add: VC789_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra790: "VC790 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC790_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei790 apply((auto simp add: VC790_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra791: "VC791 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC791_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei791 apply((auto simp add: VC791_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra792: "VC792 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC792_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei792 apply((auto simp add: VC792_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra793: "VC793 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC793_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei793 apply((auto simp add: VC793_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra794: "VC794 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC794_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei794 apply((auto simp add: VC794_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra795: "VC795 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC795_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei795 apply((auto simp add: VC795_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra796: "VC796 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC796_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei796 apply((auto simp add: VC796_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra797: "VC797 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC797_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei797 apply((auto simp add: VC797_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra798: "VC798 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC798_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei798 apply((auto simp add: VC798_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra799: "VC799 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC799_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei799 apply((auto simp add: VC799_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra800: "VC800 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC800_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei800 apply((auto simp add: VC800_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra801: "VC801 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC801_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei801 apply((auto simp add: VC801_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra802: "VC802 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC802_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei802 apply((auto simp add: VC802_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra803: "VC803 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC803_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei803 apply((auto simp add: VC803_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra804: "VC804 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC804_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei804 apply((auto simp add: VC804_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra805: "VC805 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC805_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei805 apply((auto simp add: VC805_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra806: "VC806 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC806_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei806 apply((auto simp add: VC806_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra807: "VC807 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC807_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei807 apply((auto simp add: VC807_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra808: "VC808 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC808_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei808 apply((auto simp add: VC808_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra809: "VC809 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC809_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei809 apply((auto simp add: VC809_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra810: "VC810 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC810_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei810 apply((auto simp add: VC810_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra811: "VC811 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC811_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei811 apply((auto simp add: VC811_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra812: "VC812 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC812_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei812 apply((auto simp add: VC812_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra813: "VC813 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC813_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei813 apply((auto simp add: VC813_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra814: "VC814 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC814_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei814 apply((auto simp add: VC814_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra815: "VC815 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC815_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei815 apply((auto simp add: VC815_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra816: "VC816 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC816_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei816 apply((auto simp add: VC816_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra817: "VC817 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC817_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei817 apply((auto simp add: VC817_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra818: "VC818 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC818_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei818 apply((auto simp add: VC818_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra819: "VC819 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC819_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei819 apply((auto simp add: VC819_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra820: "VC820 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC820_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei820 apply((auto simp add: VC820_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra821: "VC821 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC821_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei821 apply((auto simp add: VC821_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra822: "VC822 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC822_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei822 apply((auto simp add: VC822_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra823: "VC823 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC823_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei823 apply((auto simp add: VC823_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra824: "VC824 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC824_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei824 apply((auto simp add: VC824_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra825: "VC825 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC825_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei825 apply((auto simp add: VC825_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra826: "VC826 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC826_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei826 apply((auto simp add: VC826_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra827: "VC827 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC827_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei827 apply((auto simp add: VC827_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra828: "VC828 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC828_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei828 apply((auto simp add: VC828_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra829: "VC829 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC829_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei829 apply((auto simp add: VC829_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra830: "VC830 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC830_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei830 apply((auto simp add: VC830_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra831: "VC831 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC831_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei831 apply((auto simp add: VC831_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra832: "VC832 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC832_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei832 apply((auto simp add: VC832_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra833: "VC833 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC833_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei833 apply((auto simp add: VC833_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra834: "VC834 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC834_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei834 apply((auto simp add: VC834_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra835: "VC835 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC835_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei835 apply((auto simp add: VC835_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra836: "VC836 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC836_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei836 apply((auto simp add: VC836_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra837: "VC837 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC837_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei837 apply((auto simp add: VC837_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra838: "VC838 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC838_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei838 apply((auto simp add: VC838_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra839: "VC839 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC839_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei839 apply((auto simp add: VC839_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra840: "VC840 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC840_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei840 apply((auto simp add: VC840_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra841: "VC841 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC841_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei841 apply((auto simp add: VC841_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra842: "VC842 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC842_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei842 apply((auto simp add: VC842_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra843: "VC843 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC843_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei843 apply((auto simp add: VC843_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra844: "VC844 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC844_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei844 apply((auto simp add: VC844_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra845: "VC845 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC845_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei845 apply((auto simp add: VC845_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra846: "VC846 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC846_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei846 apply((auto simp add: VC846_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra847: "VC847 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC847_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei847 apply((auto simp add: VC847_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra848: "VC848 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC848_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei848 apply((auto simp add: VC848_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra849: "VC849 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC849_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei849 apply((auto simp add: VC849_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra850: "VC850 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC850_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei850 apply((auto simp add: VC850_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra851: "VC851 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC851_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei851 apply((auto simp add: VC851_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra852: "VC852 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC852_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei852 apply((auto simp add: VC852_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra853: "VC853 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC853_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei853 apply((auto simp add: VC853_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra854: "VC854 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC854_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei854 apply((auto simp add: VC854_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra855: "VC855 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC855_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei855 apply((auto simp add: VC855_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra856: "VC856 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC856_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei856 apply((auto simp add: VC856_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra857: "VC857 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC857_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei857 apply((auto simp add: VC857_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra858: "VC858 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC858_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei858 apply((auto simp add: VC858_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra859: "VC859 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC859_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei859 apply((auto simp add: VC859_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra860: "VC860 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC860_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei860 apply((auto simp add: VC860_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra861: "VC861 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC861_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei861 apply((auto simp add: VC861_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra862: "VC862 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC862_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei862 apply((auto simp add: VC862_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra863: "VC863 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC863_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei863 apply((auto simp add: VC863_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra864: "VC864 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC864_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei864 apply((auto simp add: VC864_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra865: "VC865 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC865_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei865 apply((auto simp add: VC865_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra866: "VC866 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC866_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei866 apply((auto simp add: VC866_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra867: "VC867 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC867_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei867 apply((auto simp add: VC867_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra868: "VC868 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC868_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei868 apply((auto simp add: VC868_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra869: "VC869 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC869_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei869 apply((auto simp add: VC869_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra870: "VC870 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC870_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei870 apply((auto simp add: VC870_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra871: "VC871 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC871_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei871 apply((auto simp add: VC871_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra872: "VC872 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC872_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei872 apply((auto simp add: VC872_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra873: "VC873 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC873_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei873 apply((auto simp add: VC873_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra874: "VC874 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC874_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei874 apply((auto simp add: VC874_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra875: "VC875 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC875_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei875 apply((auto simp add: VC875_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra876: "VC876 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC876_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei876 apply((auto simp add: VC876_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra877: "VC877 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC877_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei877 apply((auto simp add: VC877_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra878: "VC878 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC878_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei878 apply((auto simp add: VC878_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra879: "VC879 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC879_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei879 apply((auto simp add: VC879_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra880: "VC880 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC880_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei880 apply((auto simp add: VC880_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra881: "VC881 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC881_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei881 apply((auto simp add: VC881_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra882: "VC882 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC882_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei882 apply((auto simp add: VC882_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra883: "VC883 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC883_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei883 apply((auto simp add: VC883_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra884: "VC884 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC884_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei884 apply((auto simp add: VC884_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra885: "VC885 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC885_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei885 apply((auto simp add: VC885_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra886: "VC886 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC886_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei886 apply((auto simp add: VC886_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra887: "VC887 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC887_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei887 apply((auto simp add: VC887_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra888: "VC888 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC888_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei888 apply((auto simp add: VC888_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra889: "VC889 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC889_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei889 apply((auto simp add: VC889_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra890: "VC890 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC890_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei890 apply((auto simp add: VC890_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra891: "VC891 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC891_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei891 apply((auto simp add: VC891_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra892: "VC892 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC892_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei892 apply((auto simp add: VC892_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra893: "VC893 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC893_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei893 apply((auto simp add: VC893_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra894: "VC894 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC894_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei894 apply((auto simp add: VC894_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra895: "VC895 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC895_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei895 apply((auto simp add: VC895_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra896: "VC896 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC896_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei896 apply((auto simp add: VC896_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra897: "VC897 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC897_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei897 apply((auto simp add: VC897_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra898: "VC898 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC898_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei898 apply((auto simp add: VC898_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra899: "VC899 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC899_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei899 apply((auto simp add: VC899_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra900: "VC900 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC900_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei900 apply((auto simp add: VC900_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra901: "VC901 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC901_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei901 apply((auto simp add: VC901_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra902: "VC902 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC902_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei902 apply((auto simp add: VC902_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra903: "VC903 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC903_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei903 apply((auto simp add: VC903_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra904: "VC904 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC904_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei904 apply((auto simp add: VC904_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra905: "VC905 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC905_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei905 apply((auto simp add: VC905_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra906: "VC906 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC906_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei906 apply((auto simp add: VC906_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra907: "VC907 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC907_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei907 apply((auto simp add: VC907_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra908: "VC908 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC908_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei908 apply((auto simp add: VC908_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra909: "VC909 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC909_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei909 apply((auto simp add: VC909_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra910: "VC910 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC910_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei910 apply((auto simp add: VC910_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra911: "VC911 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC911_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei911 apply((auto simp add: VC911_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra912: "VC912 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC912_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei912 apply((auto simp add: VC912_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra913: "VC913 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC913_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei913 apply((auto simp add: VC913_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra914: "VC914 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC914_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei914 apply((auto simp add: VC914_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra915: "VC915 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC915_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei915 apply((auto simp add: VC915_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra916: "VC916 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC916_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei916 apply((auto simp add: VC916_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra917: "VC917 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC917_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei917 apply((auto simp add: VC917_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra918: "VC918 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC918_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei918 apply((auto simp add: VC918_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra919: "VC919 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC919_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei919 apply((auto simp add: VC919_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra920: "VC920 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC920_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei920 apply((auto simp add: VC920_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra921: "VC921 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC921_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei921 apply((auto simp add: VC921_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra922: "VC922 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC922_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei922 apply((auto simp add: VC922_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra923: "VC923 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC923_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei923 apply((auto simp add: VC923_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra924: "VC924 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC924_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei924 apply((auto simp add: VC924_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra925: "VC925 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC925_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei925 apply((auto simp add: VC925_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra926: "VC926 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC926_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei926 apply((auto simp add: VC926_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra927: "VC927 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC927_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei927 apply((auto simp add: VC927_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra928: "VC928 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC928_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei928 apply((auto simp add: VC928_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra929: "VC929 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC929_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei929 apply((auto simp add: VC929_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra930: "VC930 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC930_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei930 apply((auto simp add: VC930_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra931: "VC931 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC931_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei931 apply((auto simp add: VC931_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra932: "VC932 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC932_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei932 apply((auto simp add: VC932_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra933: "VC933 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC933_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei933 apply((auto simp add: VC933_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra934: "VC934 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC934_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei934 apply((auto simp add: VC934_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra935: "VC935 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC935_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei935 apply((auto simp add: VC935_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra936: "VC936 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC936_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei936 apply((auto simp add: VC936_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra937: "VC937 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC937_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei937 apply((auto simp add: VC937_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra938: "VC938 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC938_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei938 apply((auto simp add: VC938_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra939: "VC939 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC939_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei939 apply((auto simp add: VC939_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra940: "VC940 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC940_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei940 apply((auto simp add: VC940_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra941: "VC941 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC941_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei941 apply((auto simp add: VC941_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra942: "VC942 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC942_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei942 apply((auto simp add: VC942_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra943: "VC943 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC943_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei943 apply((auto simp add: VC943_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra944: "VC944 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC944_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei944 apply((auto simp add: VC944_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra945: "VC945 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC945_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei945 apply((auto simp add: VC945_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra946: "VC946 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC946_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei946 apply((auto simp add: VC946_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra947: "VC947 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC947_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei947 apply((auto simp add: VC947_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra948: "VC948 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC948_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei948 apply((auto simp add: VC948_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra949: "VC949 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC949_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei949 apply((auto simp add: VC949_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra950: "VC950 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC950_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei950 apply((auto simp add: VC950_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra951: "VC951 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC951_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei951 apply((auto simp add: VC951_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra952: "VC952 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC952_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei952 apply((auto simp add: VC952_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra953: "VC953 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC953_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei953 apply((auto simp add: VC953_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra954: "VC954 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC954_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei954 apply((auto simp add: VC954_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra955: "VC955 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC955_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei955 apply((auto simp add: VC955_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra956: "VC956 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC956_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei956 apply((auto simp add: VC956_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra957: "VC957 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC957_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei957 apply((auto simp add: VC957_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra958: "VC958 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC958_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei958 apply((auto simp add: VC958_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra959: "VC959 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC959_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei959 apply((auto simp add: VC959_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra960: "VC960 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC960_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei960 apply((auto simp add: VC960_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra961: "VC961 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC961_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei961 apply((auto simp add: VC961_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra962: "VC962 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC962_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei962 apply((auto simp add: VC962_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra963: "VC963 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC963_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei963 apply((auto simp add: VC963_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra964: "VC964 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC964_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei964 apply((auto simp add: VC964_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra965: "VC965 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC965_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei965 apply((auto simp add: VC965_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra966: "VC966 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC966_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei966 apply((auto simp add: VC966_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra967: "VC967 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC967_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei967 apply((auto simp add: VC967_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra968: "VC968 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC968_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei968 apply((auto simp add: VC968_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra969: "VC969 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC969_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei969 apply((auto simp add: VC969_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra970: "VC970 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC970_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei970 apply((auto simp add: VC970_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra971: "VC971 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC971_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei971 apply((auto simp add: VC971_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra972: "VC972 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC972_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei972 apply((auto simp add: VC972_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra973: "VC973 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC973_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei973 apply((auto simp add: VC973_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra974: "VC974 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC974_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei974 apply((auto simp add: VC974_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra975: "VC975 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC975_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei975 apply((auto simp add: VC975_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra976: "VC976 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC976_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei976 apply((auto simp add: VC976_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra977: "VC977 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC977_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei977 apply((auto simp add: VC977_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra978: "VC978 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC978_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei978 apply((auto simp add: VC978_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra979: "VC979 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC979_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei979 apply((auto simp add: VC979_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra980: "VC980 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC980_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei980 apply((auto simp add: VC980_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra981: "VC981 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC981_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei981 apply((auto simp add: VC981_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra982: "VC982 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC982_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei982 apply((auto simp add: VC982_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra983: "VC983 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC983_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei983 apply((auto simp add: VC983_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra984: "VC984 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC984_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei984 apply((auto simp add: VC984_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra985: "VC985 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC985_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei985 apply((auto simp add: VC985_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra986: "VC986 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC986_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei986 apply((auto simp add: VC986_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra987: "VC987 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC987_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei987 apply((auto simp add: VC987_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra988: "VC988 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC988_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei988 apply((auto simp add: VC988_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra989: "VC989 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC989_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei989 apply((auto simp add: VC989_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra990: "VC990 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC990_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei990 apply((auto simp add: VC990_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra991: "VC991 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC991_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei991 apply((auto simp add: VC991_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra992: "VC992 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC992_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei992 apply((auto simp add: VC992_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra993: "VC993 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC993_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei993 apply((auto simp add: VC993_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra994: "VC994 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC994_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei994 apply((auto simp add: VC994_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra995: "VC995 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC995_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei995 apply((auto simp add: VC995_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra996: "VC996 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC996_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei996 apply((auto simp add: VC996_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra997: "VC997 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC997_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei997 apply((auto simp add: VC997_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra998: "VC998 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC998_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei998 apply((auto simp add: VC998_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra999: "VC999 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC999_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei999 apply((auto simp add: VC999_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1000: "VC1000 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1000_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1000 apply((auto simp add: VC1000_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1001: "VC1001 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1001_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1001 apply((auto simp add: VC1001_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1002: "VC1002 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1002_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1002 apply((auto simp add: VC1002_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1003: "VC1003 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1003_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1003 apply((auto simp add: VC1003_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1004: "VC1004 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1004_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1004 apply((auto simp add: VC1004_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1005: "VC1005 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1005_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1005 apply((auto simp add: VC1005_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1006: "VC1006 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1006_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1006 apply((auto simp add: VC1006_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1007: "VC1007 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1007_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1007 apply((auto simp add: VC1007_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1008: "VC1008 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1008_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1008 apply((auto simp add: VC1008_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra1009: "VC1009 Einv7 env s0  PdOut'value paid'value opened'value"
unfolding VC1009_def Einv7_def
 apply(rule impI)
  apply(rule conjI)
    using cei1009 apply((auto simp add: VC1009_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

end
