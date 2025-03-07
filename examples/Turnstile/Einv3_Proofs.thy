theory Einv3_Proofs imports Requirements CommonExtraInv_Proofs 
begin
theorem extra1: "VC1 Einv3 s0"
unfolding VC1_def Einv3_def always2_inv_part_used_patterns commonExtraInv_def
by auto

theorem extra2: "VC2 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC2_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra3: "VC3 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC3_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra4: "VC4 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC4_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra5: "VC5 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC5_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra6: "VC6 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC6_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra7: "VC7 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC7_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra8: "VC8 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC8_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra9: "VC9 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC9_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra10: "VC10 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC10_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra11: "VC11 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC11_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra12: "VC12 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC12_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra13: "VC13 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC13_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra14: "VC14 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC14_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei14 apply((auto simp add: VC14_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra15: "VC15 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC15_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei15 apply((auto simp add: VC15_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra16: "VC16 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC16_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei16 apply((auto simp add: VC16_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra17: "VC17 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC17_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei17 apply((auto simp add: VC17_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra18: "VC18 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC18_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei18 apply((auto simp add: VC18_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra19: "VC19 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC19_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei19 apply((auto simp add: VC19_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra20: "VC20 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC20_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei20 apply((auto simp add: VC20_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra21: "VC21 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC21_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei21 apply((auto simp add: VC21_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra22: "VC22 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC22_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei22 apply((auto simp add: VC22_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra23: "VC23 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC23_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei23 apply((auto simp add: VC23_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra24: "VC24 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC24_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei24 apply((auto simp add: VC24_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra25: "VC25 Einv3 env s0  PdOut'value paid'value opened'value"
unfolding VC25_def Einv3_def
 apply(rule impI)
  apply(rule conjI)
    using cei25 apply((auto simp add: VC25_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

end
