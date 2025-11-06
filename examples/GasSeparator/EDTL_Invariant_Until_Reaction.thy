theory EDTL_Invariant_Until_Reaction
  imports VCProving.Basic_Patterns
begin

definition EDTL_invariant_until_reaction_presenting_between where "EDTL_invariant_until_reaction_presenting_between fin delay trigger Inv reaction s \<equiv>
   (always (\<lambda> r2 r1 . ((\<not> (trigger r1)) \<or> (constrained_until3 fin (fin + delay) Inv (\<lambda> r4 r3 . ((reaction r4 r3) \<and> (Inv r4 r3))) r2 r1))) s)"

definition EDTL_invariant_until_reaction_presenting_between_part where 
  "EDTL_invariant_until_reaction_presenting_between_part fin delay trigger Inv reaction s \<equiv>
   (EDTL_invariant_until_reaction_presenting_between fin delay trigger (\<lambda> s s1 . (Inv s1)) (\<lambda> s s1 . (reaction s1)) s)"

definition EDTL_invariant_until_reaction_presenting_between_inv where
  "EDTL_invariant_until_reaction_presenting_between_inv fin delay P1 t2_1_0 trigger Inv_1 reaction_1 s \<equiv> 
  (always_inv (\<lambda> r2 r1 . ((\<not> (trigger r1)) \<or> (constrained_until3_inv fin (fin + delay) P1 t2_1_0 Inv_1 (\<lambda> r4 r3 . ((reaction_1 r4 r3) \<and> (Inv_1 r4 r3))) r2 r1))) s)"

definition EDTL_invariant_until_reaction_presenting_between_inv_part where 
  "EDTL_invariant_until_reaction_presenting_between_inv_part fin delay P1 t2_1_0 trigger Inv reaction s \<equiv>
   (EDTL_invariant_until_reaction_presenting_between_inv fin delay P1 t2_1_0 trigger (\<lambda> s s1 . (Inv s1)) (\<lambda> s s1 . (reaction s1)) s)"

lemma EDTL_invariant_until_reaction_presenting_between_inv_saving_gen: "
EDTL_invariant_until_reaction_presenting_between_inv fin delay P1 t2_1 trigger Inv reaction s \<Longrightarrow>
consecutive s s' \<Longrightarrow>
(True \<and> always_imp s (Inv s) (Inv s') \<and> (always_imp s (reaction s) (reaction s') \<and> always_imp s (Inv s) (Inv s')) 
  \<and> (\<forall>t1_2'.
       P1 s' t1_2' \<longrightarrow>
       (\<exists>t1_2.
           P1 s t1_2 \<and>
           (t2_1 s = STOP \<or>
            t2_1 s \<le> t1_2 \<or> (reaction s' s' \<and> Inv s' s') \<and> fin \<le> t1_2 + 1 \<and> t2_1 s \<le> fin + delay \<or> Inv s' s' \<and> t1_2' \<le> t1_2 + 1 \<and> t2_1 s < t2_1 s'))))
   \<and> (\<not> trigger s' \<or> fin = STOP \<and> reaction s' s' \<and> Inv s' s' \<or> Inv s' s' \<and> (\<forall>t1_2. P1 s' t1_2 = (t1_2 = STOP)) \<and> STOP < t2_1 s') \<Longrightarrow>
EDTL_invariant_until_reaction_presenting_between_inv fin delay P1 t2_1 trigger Inv reaction s'"
  unfolding EDTL_invariant_until_reaction_presenting_between_inv_def
  apply(erule always_rule)
   apply simp
  apply(erule conjE)
  subgoal premises prems1
    apply(rule conjI)
     apply(insert prems1(1,2))[1]
     apply(rule always_disj_rule)
      apply simp
     apply(erule conjE)
    subgoal premises prems2
      apply(rule conjI)
       apply(insert prems2(1,2))[1]
       apply(rule always_imp_refl)
      apply(insert prems2(1,3))
      apply(rule constrained_until3_rule)
      apply simp
       apply(erule conjE)
      subgoal premises prems3
        apply(rule conjI)
         apply(insert prems3(1,2))[1]
         apply assumption
        apply(insert prems3(1,3))
        apply(erule conjE)
        subgoal premises prems4
          apply(rule conjI)
           apply(insert prems4(1,2))[1]
           apply(rule always_conj_rule)
            apply simp
           apply(erule conjE)
          subgoal premises prems5
            apply(rule conjI)
             apply(insert prems5(1,2))[1]
             apply assumption
            apply(insert prems5(1,3))
            apply assumption
            done
          apply(insert prems4(1,3))
          apply assumption
          done
        done
      done
    apply(insert prems1(1,3))
    apply(erule disjE)
     apply(rule disjI1)
     apply assumption
    apply(rule disjI2)
    apply(rule constrained_until3_one_point)
     apply simp
    apply assumption
    done
  done

lemma EDTL_invariant_until_reaction_presenting_between_einv_imp_req_gen: "
EDTL_invariant_until_reaction_presenting_between_inv fin delay P1 t2_1 trigger Inv' reaction' s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<and> always_imp s (Inv' s) (Inv s) \<and> (always_imp s (reaction' s) (reaction s) \<and> always_imp s (Inv' s) (Inv s)) \<and> (\<exists>t1_2. P1 s t1_2) \<and> t2_1 s \<le> fin + delay
 \<Longrightarrow>
EDTL_invariant_until_reaction_presenting_between fin delay trigger Inv reaction s"
  unfolding EDTL_invariant_until_reaction_presenting_between_inv_def EDTL_invariant_until_reaction_presenting_between_def
  apply(erule always_einv2req)
   apply simp
  apply(rule always_disj_rule)
   apply simp
  apply(erule conjE)
  subgoal premises prems1
    apply(rule conjI)
     apply(insert prems1(1,2))[1]
     apply(rule always_imp_refl)
    apply(insert prems1(1,3))
    apply(rule constrained_until3_einv2req)
     apply simp
    apply(erule conjE)
    subgoal premises prems2
      apply(rule conjI)
       apply(insert prems2(1,2))[1]
       apply assumption
      apply(insert prems2(1,3))
      apply(erule conjE)
      subgoal premises prems3
        apply(rule conjI)
         apply(insert prems3(1,2))[1]
         apply(rule always_conj_rule)
          apply simp
         apply(erule conjE)
        subgoal premises prems4
          apply(rule conjI)
           apply(insert prems4(1,2))[1]
           apply assumption
          apply(insert prems4(1,3))
          apply assumption
          done
        apply(insert prems3(1,3))
        apply assumption
        done
      done
    done
  done

end
