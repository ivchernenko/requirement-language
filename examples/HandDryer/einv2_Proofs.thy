theory einv2_Proofs imports Requirements CommonExtraInv_Proofs
 begin
theorem extra1: "VC1 einv2 s0"
unfolding VC1_def einv2_def always2_inv_part_used_patterns commonExtraInv_def
by auto

theorem extra2: "VC2 einv2 env s0  hands'value"
unfolding VC2_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei2 apply((auto simp add: VC2_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra3: "VC3 einv2 env s0  hands'value"
unfolding VC3_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei3 apply((auto simp add: VC3_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra4: "VC4 einv2 env s0  hands'value"
unfolding VC4_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei4 apply((auto simp add: VC4_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra5: "VC5 einv2 env s0  hands'value"
unfolding VC5_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei5 apply((auto simp add: VC5_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra6: "VC6 einv2 env s0  hands'value"
unfolding VC6_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei6 apply((auto simp add: VC6_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra7: "VC7 einv2 env s0  hands'value"
unfolding VC7_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei7 apply((auto simp add: VC7_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra8: "VC8 einv2 env s0  hands'value"
unfolding VC8_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei8 apply((auto simp add: VC8_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

theorem extra9: "VC9 einv2 env s0  hands'value"
unfolding VC9_def einv2_def
 apply(rule impI)
  apply(rule conjI)
    using cei9 apply((auto simp add: VC9_def)[1];fastforce)
  apply(unfold commonExtraInv_def)
  apply(erule conjE)+
  apply(erule always2_inv_saving)
   apply(auto split: if_splits)
  done

end
