theory Ex_Derived_Patterns imports Basic_Patterns Derived_Patterns 
begin

definition EDTL_trigger_prev_final_nontemporal_or_tau_delay_true where "EDTL_trigger_prev_final_nontemporal_or_tau_delay_true finalt trigger finale release Inv reaction s \<equiv> ((always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (trigger r3))) r2 r1) \<or> ((release r2 r1) \<or> (constrained_weak_until (finalt + 1) (\<lambda> r4 r3 . ((Inv r4 r3) \<and> (\<not> (finale r3)))) (\<lambda> r4 r3 . ((release r4 r3) \<or> ((finale r3) \<and> ((reaction r4 r3) \<and> (Inv r4 r3))))) r2 r1)))) s) \<and>(always (\<lambda> r2 r1 . ((dual_constrained_since finalt finalt (\<lambda> r4 r3 . ((weak_previous (\<lambda> r6 r5 . (\<not> (trigger r5))) r4 r3) \<or> (finale r3))) (\<lambda> r4 r3 . (finale r3)) r2 r1) \<or> (reaction r2 r1))) s))"

definition EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part where "EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part finalt trigger finale release Inv reaction s \<equiv> (EDTL_trigger_prev_final_nontemporal_or_tau_delay_true finalt trigger finale (\<lambda> s s1 . (release s1)) (\<lambda> s s1 . (Inv s1)) (\<lambda> s s1 . (reaction s1)) s)"

definition EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv where "EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release_1 Inv_1 reaction_1 s \<equiv> (((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (trigger r3))) r2 r1) \<or> ((release_1 r2 r1) \<or> (constrained_weak_until_inv (finalt + 1) t1_0 (\<lambda> r4 r3 . ((Inv_1 r4 r3) \<and> (\<not> (finale r3)))) (\<lambda> r4 r3 . ((release_1 r4 r3) \<or> ((finale r3) \<and> ((reaction_1 r4 r3) \<and> (Inv_1 r4 r3))))) r2 r1)))) s) \<and> (previous_inv b_0 (\<lambda> r4 r3 . (\<not> (trigger r3))) s)) \<and> (((always_inv (\<lambda> r2 r1 . ((dual_constrained_since finalt finalt (\<lambda> r4 r3 . ((weak_previous (\<lambda> r6 r5 . (\<not> (trigger r5))) r4 r3) \<or> (finale r3))) (\<lambda> r4 r3 . (finale r3)) r2 r1) \<or> (reaction_1 r2 r1))) s) \<and> (dual_constrained_since_inv finalt finalt b_2 t1_1_0 t2_1_0 (\<lambda> r4 r3 . ((weak_previous (\<lambda> r6 r5 . (\<not> (trigger r5))) r4 r3) \<or> (finale r3))) (\<lambda> r4 r3 . (finale r3)) s)) \<and> (previous_inv b_1 (\<lambda> r6 r5 . (\<not> (trigger r5))) s)))"

definition EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part where "EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release Inv reaction s \<equiv> (EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale (\<lambda> s s1 . (release s1)) (\<lambda> s s1 . (Inv s1)) (\<lambda> s s1 . (reaction s1)) s)"

lemma EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_saving_gen: "
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release_1 Inv_1 reaction_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((True \<and> ((always_imp s0 (\<lambda> r1 . (release_1 s0 r1)) (\<lambda> r1 . (release_1 s r1))) \<and> (((always_imp s0 (\<lambda> r3 . (Inv_1 s0 r3)) (\<lambda> r3 . (Inv_1 s r3))) \<and> True) \<and> (((always_imp s0 (\<lambda> r3 . (release_1 s0 r3)) (\<lambda> r3 . (release_1 s r3))) \<and> (True \<and> ((always_imp s0 (\<lambda> r3 . (reaction_1 s0 r3)) (\<lambda> r3 . (reaction_1 s r3))) \<and> (always_imp s0 (\<lambda> r3 . (Inv_1 s0 r3)) (\<lambda> r3 . (Inv_1 s r3)))))) \<and> ((((t1_0 s0) < (finalt + 1)) \<and> ((((release_1 s s) \<or> ((finale s) \<and> ((reaction_1 s s) \<and> (Inv_1 s s)))) \<and> ((t1_0 s) <= ((finalt + 1) + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> ((Inv_1 s s) \<and> (\<not> (finale s)))))) \<or> (((t1_0 s0) >= (finalt + 1)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))))))) \<and> (((b_0 s0) \<and> True) \<or> ((release_1 s s) \<or> (((release_1 s s) \<or> ((finale s) \<and> ((reaction_1 s s) \<and> (Inv_1 s s)))) \<or> (((t1_0 s) = 0) \<and> ((Inv_1 s s) \<and> (\<not> (finale s)))))))) \<and> ((b_0 s) --> (\<not> (trigger s)))) \<and> ((((((True \<and> True) \<and> True) \<and> (always_imp s0 (\<lambda> r1 . (reaction_1 s0 r1)) (\<lambda> r1 . (reaction_1 s r1)))) \<and> ((((finalt > 0) \<or> (finale s)) \<and> ((((b_1 s0) \<and> True) \<or> (finale s)) \<or> ((b_2 s0) \<and> ((True \<and> True) \<and> (True \<and> (((t1_1_0 s0) < finalt) \<and> (finalt <= ((t2_1_0 s0) + 1)))))))) \<or> (reaction_1 s s))) \<and> ((b_2 s) --> ((((t1_1_0 s) > 0) \<or> (finale s)) \<and> ((((b_1 s0) \<and> True) \<or> (finale s)) \<or> ((b_2 s0) \<and> ((True \<and> True) \<and> (True \<and> (((t1_1_0 s0) < (t1_1_0 s)) \<and> ((t2_1_0 s) <= ((t2_1_0 s0) + 1)))))))))) \<and> ((b_1 s) --> (\<not> (trigger s))))) \<Longrightarrow>
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release_1 Inv_1 reaction_1 s"

unfolding EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_def
apply(erule conjE)
apply(erule conjE)
subgoal premises prems1
apply(rule conjI)
apply(insert prems1(1,2,4))[1]
  apply(erule conjE)
  apply(erule conjE)
  subgoal premises prems2
  apply(rule conjI)
  apply(insert prems2(1,2,4))[1]
  apply(erule always_inv_saving_gen)
    apply simp
    apply(erule conjE)
    subgoal premises prems3
    apply(rule conjI)
    apply(insert prems3(1,2))[1]
      apply(rule always_disj_rule)
      apply simp
        apply(erule conjE)
        subgoal premises prems4
        apply(rule conjI)
        apply(insert prems4(1,2))[1]
          apply(rule weak_previous_L4)
          apply simp
            apply(rule always_imp_refl)
        apply(insert prems4(1,3))
          apply(rule always_disj_rule)
          apply simp
            apply(erule conjE)
            subgoal premises prems5
            apply(rule conjI)
            apply(insert prems5(1,2))[1]
              apply simp
            apply(insert prems5(1,3))
              apply(rule constrained_weak_until_L1)
              apply simp
                apply(erule conjE)
                subgoal premises prems6
                apply(rule conjI)
                apply(insert prems6(1,2))[1]
                  apply(rule always_conj_rule)
                  apply simp
                    apply(erule conjE)
                    subgoal premises prems7
                    apply(rule conjI)
                    apply(insert prems7(1,2))[1]
                      apply simp
                    apply(insert prems7(1,3))
                      apply(rule always_imp_refl)
                    done
                apply(insert prems6(1,3))
                  apply(erule conjE)
                  subgoal premises prems8
                  apply(rule conjI)
                  apply(insert prems8(1,2))[1]
                    apply(rule always_disj_rule)
                    apply simp
                      apply(erule conjE)
                      subgoal premises prems9
                      apply(rule conjI)
                      apply(insert prems9(1,2))[1]
                        apply simp
                      apply(insert prems9(1,3))
                        apply(rule always_conj_rule)
                        apply simp
                          apply(erule conjE)
                          subgoal premises prems10
                          apply(rule conjI)
                          apply(insert prems10(1,2))[1]
                            apply(rule always_imp_refl)
                          apply(insert prems10(1,3))
                            apply(rule always_conj_rule)
                            apply simp
                              apply(erule conjE)
                              subgoal premises prems11
                              apply(rule conjI)
                              apply(insert prems11(1,2))[1]
                                apply simp
                              apply(insert prems11(1,3))
                                apply simp
                              done
                          done
                      done
                  apply(insert prems8(1,3))
                    apply(erule disjE)
                    apply(rule disjI1)
                      apply(erule conjE)
                      subgoal premises prems12
                      apply(rule conjI)
                      apply(insert prems12(1,2))[1]
                        apply simp
                      apply(insert prems12(1,3))
                        apply(erule disjE)
                        apply(rule disjI1)
                          apply(erule conjE)
                          subgoal premises prems13
                          apply(rule conjI)
                          apply(insert prems13(1,2))[1]
                            apply(erule disjE)
                            apply(rule disjI1)
                              apply simp
                            apply(rule disjI2)
                              apply(erule conjE)
                              subgoal premises prems14
                              apply(rule conjI)
                              apply(insert prems14(1,2))[1]
                                apply simp
                              apply(insert prems14(1,3))
                                apply(erule conjE)
                                subgoal premises prems15
                                apply(rule conjI)
                                apply(insert prems15(1,2))[1]
                                  apply simp
                                apply(insert prems15(1,3))
                                  apply simp
                                done
                              done
                          apply(insert prems13(1,3))
                            apply simp
                          done
                        apply(rule disjI2)
                          apply(erule conjE)
                          subgoal premises prems16
                          apply(rule conjI)
                          apply(insert prems16(1,2))[1]
                            apply simp
                          apply(insert prems16(1,3))
                            apply(erule conjE)
                            subgoal premises prems17
                            apply(rule conjI)
                            apply(insert prems17(1,2))[1]
                              apply simp
                            apply(insert prems17(1,3))
                              apply simp
                            done
                          done
                      done
                    apply(rule disjI2)
                      apply simp
                  done
                done
            done
        done
    apply(insert prems3(1,3))
      apply(erule disjE)
      apply(rule disjI1)
        apply(rule weak_previous_L7[OF prems2(3)])
        apply simp
          apply(erule conjE)
          subgoal premises prems18
          apply(rule conjI)
          apply(insert prems18(1,2))[1]
            apply simp
          apply(insert prems18(1,3))
            apply(rule always_imp_refl)
          done
      apply(rule disjI2)
        apply(erule disjE)
        apply(rule disjI1)
          apply simp
        apply(rule disjI2)
          apply(rule constrained_weak_until_L2)
          apply simp
            apply(erule disjE)
            apply(rule disjI1)
              apply(erule disjE)
              apply(rule disjI1)
                apply simp
              apply(rule disjI2)
                apply(erule conjE)
                subgoal premises prems19
                apply(rule conjI)
                apply(insert prems19(1,2))[1]
                  apply simp
                apply(insert prems19(1,3))
                  apply(erule conjE)
                  subgoal premises prems20
                  apply(rule conjI)
                  apply(insert prems20(1,2))[1]
                    apply simp
                  apply(insert prems20(1,3))
                    apply simp
                  done
                done
            apply(rule disjI2)
              apply(erule conjE)
              subgoal premises prems21
              apply(rule conjI)
              apply(insert prems21(1,2))[1]
                apply simp
              apply(insert prems21(1,3))
                apply(erule conjE)
                subgoal premises prems22
                apply(rule conjI)
                apply(insert prems22(1,2))[1]
                  apply simp
                apply(insert prems22(1,3))
                  apply simp
                done
              done
    done
  apply(insert prems2(1,3,5))
    apply(erule previous_inv_L6)
    apply simp
    apply(rule impI)
    apply(erule impE)
    apply assumption
    subgoal premises prems23
    apply(insert prems23(1,3))
      apply simp
    done
  done
apply(insert prems1(1,3,5))
  apply(erule conjE)
  apply(erule conjE)
  subgoal premises prems24
  apply(rule conjI)
  apply(insert prems24(1,2,4))[1]
  apply(erule conjE)
  apply(erule conjE)
  subgoal premises prems25
  apply(rule conjI)
  apply(insert prems25(1,2,4))[1]
  apply(erule always_inv_saving_gen)
    apply simp
    apply(erule conjE)
    subgoal premises prems26
    apply(rule conjI)
    apply(insert prems26(1,2))[1]
      apply(rule always_disj_rule)
      apply simp
        apply(erule conjE)
        subgoal premises prems27
        apply(rule conjI)
        apply(insert prems27(1,2))[1]
          apply(rule dual_constrained_since_L4)
          apply simp
            apply(erule conjE)
            subgoal premises prems28
            apply(rule conjI)
            apply(insert prems28(1,2))[1]
              apply(rule always_disj_rule)
              apply simp
                apply(erule conjE)
                subgoal premises prems29
                apply(rule conjI)
                apply(insert prems29(1,2))[1]
                  apply(rule weak_previous_L4)
                  apply simp
                    apply(rule always_imp_refl)
                apply(insert prems29(1,3))
                  apply(rule always_imp_refl)
                done
            apply(insert prems28(1,3))
              apply(rule always_imp_refl)
            done
        apply(insert prems27(1,3))
          apply simp
        done
    apply(insert prems26(1,3))
      apply(erule disjE)
      apply(rule disjI1)
        apply(rule dual_constrained_since_L7[OF prems25(3)])
        apply simp
          apply(erule conjE)
          subgoal premises prems30
          apply(rule conjI)
          apply(insert prems30(1,2))[1]
            apply(erule disjE)
            apply(rule disjI1)
              apply simp
            apply(rule disjI2)
              apply simp
          apply(insert prems30(1,3))
            apply(erule disjE)
            apply(rule disjI1)
              apply(erule disjE)
              apply(rule disjI1)
                apply(rule weak_previous_L7[OF prems24(3)])
                apply simp
                  apply(erule conjE)
                  subgoal premises prems31
                  apply(rule conjI)
                  apply(insert prems31(1,2))[1]
                    apply simp
                  apply(insert prems31(1,3))
                    apply(rule always_imp_refl)
                  done
              apply(rule disjI2)
                apply simp
            apply(rule disjI2)
              apply(erule conjE)
              subgoal premises prems32
              apply(rule conjI)
              apply(insert prems32(1,2))[1]
                apply simp
              apply(insert prems32(1,3))
                apply(erule conjE)
                subgoal premises prems33
                apply(rule conjI)
                apply(insert prems33(1,2))[1]
                  apply(rule always_disj_rule)
                  apply simp
                    apply(erule conjE)
                    subgoal premises prems34
                    apply(rule conjI)
                    apply(insert prems34(1,2))[1]
                      apply(rule weak_previous_L4)
                      apply simp
                        apply(rule always_imp_refl)
                    apply(insert prems34(1,3))
                      apply(rule always_imp_refl)
                    done
                apply(insert prems33(1,3))
                  apply(erule conjE)
                  subgoal premises prems35
                  apply(rule conjI)
                  apply(insert prems35(1,2))[1]
                    apply(rule always_imp_refl)
                  apply(insert prems35(1,3))
                    apply simp
                  done
                done
              done
          done
      apply(rule disjI2)
        apply simp
    done
  apply(insert prems25(1,3,5))
    apply(erule dual_constrained_since_L6)
    apply simp
    apply(rule impI)
    apply(erule impE)
    apply assumption
    subgoal premises prems36
    apply(insert prems36(1,3))
      apply(erule conjE)
      subgoal premises prems37
      apply(rule conjI)
      apply(insert prems37(1,2))[1]
        apply(erule disjE)
        apply(rule disjI1)
          apply simp
        apply(rule disjI2)
          apply simp
      apply(insert prems37(1,3))
        apply(erule disjE)
        apply(rule disjI1)
          apply(erule disjE)
          apply(rule disjI1)
            apply(rule weak_previous_L7[OF prems24(3)])
            apply simp
              apply(erule conjE)
              subgoal premises prems38
              apply(rule conjI)
              apply(insert prems38(1,2))[1]
                apply simp
              apply(insert prems38(1,3))
                apply(rule always_imp_refl)
              done
          apply(rule disjI2)
            apply simp
        apply(rule disjI2)
          apply(erule conjE)
          subgoal premises prems39
          apply(rule conjI)
          apply(insert prems39(1,2))[1]
            apply simp
          apply(insert prems39(1,3))
            apply(erule conjE)
            subgoal premises prems40
            apply(rule conjI)
            apply(insert prems40(1,2))[1]
              apply(rule always_disj_rule)
              apply simp
                apply(erule conjE)
                subgoal premises prems41
                apply(rule conjI)
                apply(insert prems41(1,2))[1]
                  apply(rule weak_previous_L4)
                  apply simp
                    apply(rule always_imp_refl)
                apply(insert prems41(1,3))
                  apply(rule always_imp_refl)
                done
            apply(insert prems40(1,3))
              apply(erule conjE)
              subgoal premises prems42
              apply(rule conjI)
              apply(insert prems42(1,2))[1]
                apply(rule always_imp_refl)
              apply(insert prems42(1,3))
                apply simp
              done
            done
          done
      done
    done
  done
  apply(insert prems24(1,3,5))
    apply(erule previous_inv_L6)
    apply simp
    apply(rule impI)
    apply(erule impE)
    apply assumption
    subgoal premises prems43
    apply(insert prems43(1,3))
      apply simp
    done
  done
done
done

lemma EDTL_trigger_prev_final_nontemporal_or_tau_delay_trueeinv_imp_req_gen: "
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release_1 Inv_1 reaction_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
((True \<and> ((always_imp s0 (\<lambda> r1 . (release_1 s0 r1)) (\<lambda> r1 . (release s0 r1))) \<and> (((always_imp s0 (\<lambda> r3 . (Inv_1 s0 r3)) (\<lambda> r3 . (Inv s0 r3))) \<and> True) \<and> ((always_imp s0 (\<lambda> r3 . (release_1 s0 r3)) (\<lambda> r3 . (release s0 r3))) \<and> (True \<and> ((always_imp s0 (\<lambda> r3 . (reaction_1 s0 r3)) (\<lambda> r3 . (reaction s0 r3))) \<and> (always_imp s0 (\<lambda> r3 . (Inv_1 s0 r3)) (\<lambda> r3 . (Inv s0 r3))))))))) \<and> (((True \<and> True) \<and> True) \<and> (always_imp s0 (\<lambda> r1 . (reaction_1 s0 r1)) (\<lambda> r1 . (reaction s0 r1))))) \<Longrightarrow>
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true finalt trigger finale release Inv reaction s0"

unfolding EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_def EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_def
apply(erule conjE)
apply(erule conjE)
subgoal premises prems1
apply(rule conjI)
apply(insert prems1(1,2,4))[1]
  subgoal premises prems2
  apply(insert prems2(1,2))
  apply(erule conjE)
  subgoal premises prems3
  apply(insert prems3(1,2) prems2(3))
  apply(erule always_einv_imp_req_gen)
  apply simp
    apply(rule always_disj_rule)
    apply simp
      apply(erule conjE)
      subgoal premises prems4
      apply(rule conjI)
      apply(insert prems4(1,2))[1]
        apply(rule weak_previous_L5)
        apply simp
          apply(rule always_imp_refl)
      apply(insert prems4(1,3))
        apply(rule always_disj_rule)
        apply simp
          apply(erule conjE)
          subgoal premises prems5
          apply(rule conjI)
          apply(insert prems5(1,2))[1]
            apply simp
          apply(insert prems5(1,3))
            apply(rule constrained_weak_until_L3)
            apply simp
              apply(erule conjE)
              subgoal premises prems6
              apply(rule conjI)
              apply(insert prems6(1,2))[1]
                apply(rule always_conj_rule)
                apply simp
                  apply(erule conjE)
                  subgoal premises prems7
                  apply(rule conjI)
                  apply(insert prems7(1,2))[1]
                    apply simp
                  apply(insert prems7(1,3))
                    apply(rule always_imp_refl)
                  done
              apply(insert prems6(1,3))
                apply(rule always_disj_rule)
                apply simp
                  apply(erule conjE)
                  subgoal premises prems8
                  apply(rule conjI)
                  apply(insert prems8(1,2))[1]
                    apply simp
                  apply(insert prems8(1,3))
                    apply(rule always_conj_rule)
                    apply simp
                      apply(erule conjE)
                      subgoal premises prems9
                      apply(rule conjI)
                      apply(insert prems9(1,2))[1]
                        apply(rule always_imp_refl)
                      apply(insert prems9(1,3))
                        apply(rule always_conj_rule)
                        apply simp
                          apply(erule conjE)
                          subgoal premises prems10
                          apply(rule conjI)
                          apply(insert prems10(1,2))[1]
                            apply simp
                          apply(insert prems10(1,3))
                            apply simp
                          done
                      done
                  done
              done
          done
      done
  done
  done
apply(insert prems1(1,3,5))
  subgoal premises prems11
  apply(insert prems11(1,2))
  apply(simp only: conj_assoc)
  apply(erule conjE)
  subgoal premises prems12
  apply(insert prems12(1,2) prems11(3))
  apply(erule always_einv_imp_req_gen)
  apply simp
    apply(rule always_disj_rule)
    apply simp
      apply(erule conjE)
      subgoal premises prems13
      apply(rule conjI)
      apply(insert prems13(1,2))[1]
        apply(rule dual_constrained_since_L5)
        apply simp
          apply(erule conjE)
          subgoal premises prems14
          apply(rule conjI)
          apply(insert prems14(1,2))[1]
            apply(rule always_disj_rule)
            apply simp
              apply(erule conjE)
              subgoal premises prems15
              apply(rule conjI)
              apply(insert prems15(1,2))[1]
                apply(rule weak_previous_L5)
                apply simp
                  apply(rule always_imp_refl)
              apply(insert prems15(1,3))
                apply(rule always_imp_refl)
              done
          apply(insert prems14(1,3))
            apply(rule always_imp_refl)
          done
      apply(insert prems13(1,3))
        apply simp
      done
  done
  done
done
done

lemma EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_saving: "
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release Inv reaction s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((((t1_0 s0) < (finalt + 1)) \<and> ((((release s) \<or> ((finale s) \<and> ((reaction s) \<and> (Inv s)))) \<and> ((t1_0 s) <= ((finalt + 1) + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> ((Inv s) \<and> (\<not> (finale s)))))) \<or> (((t1_0 s0) >= (finalt + 1)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((b_0 s0) \<or> ((release s) \<or> (((release s) \<or> ((finale s) \<and> ((reaction s) \<and> (Inv s)))) \<or> (((t1_0 s) = 0) \<and> ((Inv s) \<and> (\<not> (finale s)))))))) \<and> ((b_0 s) --> (\<not> (trigger s)))) \<and> ((((((finalt > 0) \<or> (finale s)) \<and> (((b_1 s0) \<or> (finale s)) \<or> ((b_2 s0) \<and> (((t1_1_0 s0) < finalt) \<and> (finalt <= ((t2_1_0 s0) + 1)))))) \<or> (reaction s)) \<and> ((b_2 s) --> ((((t1_1_0 s) > 0) \<or> (finale s)) \<and> (((b_1 s0) \<or> (finale s)) \<or> ((b_2 s0) \<and> (((t1_1_0 s0) < (t1_1_0 s)) \<and> ((t2_1_0 s) <= ((t2_1_0 s0) + 1)))))))) \<and> ((b_1 s) --> (\<not> (trigger s))))) \<Longrightarrow>
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release Inv reaction s"

unfolding EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part_def EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part_def
apply(simp add: EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_saving_gen always_imp_refl)
done

lemma EDTL_trigger_prev_final_nontemporal_or_tau_delay_trueeinv_imp_req: "
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part finalt b_0 t1_0 b_1 b_2 t1_1_0 t2_1_0 trigger finale release Inv reaction s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part finalt trigger finale release Inv reaction s"

unfolding EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part_def EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part_def
apply(simp add: EDTL_trigger_prev_final_nontemporal_or_tau_delay_trueeinv_imp_req_gen always_imp_refl)
done



lemmas EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_used_patterns = EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_def always_used_patterns weak_previous_def constrained_weak_until_def always_used_patterns dual_constrained_since_def weak_previous_def 

lemmas EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_used_patterns = EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_def always_inv_used_patterns weak_previous_def constrained_weak_until_inv_def previous_inv_def always_inv_used_patterns dual_constrained_since_def weak_previous_def dual_constrained_since_inv_def weak_previous_def previous_inv_def 

lemmas EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part_used_patterns = EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_part_def EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_inv_used_patterns

lemmas EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part_used_patterns = EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_part_def EDTL_trigger_prev_final_nontemporal_or_tau_delay_true_used_patterns

end
