theory Einv4_Proofs imports Requirements CommonExtraInv_Proofs
 begin
theorem extra1: "VC1 Einv4 s0"
unfolding VC1_def Einv4_def P3_2_inv_part_used_patterns commonExtraInv_def
by auto

theorem extra2: "VC2 Einv4 env s0  requestButton'value"
unfolding VC2_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra3: "VC3 Einv4 env s0  requestButton'value"
unfolding VC3_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra4: "VC4 Einv4 env s0  requestButton'value"
unfolding VC4_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra5: "VC5 Einv4 env s0  requestButton'value"
unfolding VC5_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra6: "VC6 Einv4 env s0  requestButton'value"
unfolding VC6_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra7: "VC7 Einv4 env s0  requestButton'value"
unfolding VC7_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra8: "VC8 Einv4 env s0  requestButton'value"
unfolding VC8_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra9: "VC9 Einv4 env s0  requestButton'value"
unfolding VC9_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra10: "VC10 Einv4 env s0  requestButton'value"
unfolding VC10_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei10 apply((auto simp add: VC10_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra11: "VC11 Einv4 env s0  requestButton'value"
unfolding VC11_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei11 apply((auto simp add: VC11_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra12: "VC12 Einv4 env s0  requestButton'value"
unfolding VC12_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei12 apply((auto simp add: VC12_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra13: "VC13 Einv4 env s0  requestButton'value"
unfolding VC13_def Einv4_def
 apply(rule impI)
  apply(rule conjI)
    using cei13 apply((auto simp add: VC13_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule P3_2_inv_saving)
   apply(auto split: if_splits)
  done

end
