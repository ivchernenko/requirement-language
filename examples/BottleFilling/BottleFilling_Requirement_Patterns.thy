theory BottleFilling_Requirement_Patterns imports VCProving.Basic_Patterns VCProving.Derived_Patterns 
begin

definition R3_pattern where "R3_pattern t A11 A12 A2 A3 A4 s \<equiv> (P5 A11 A12 A2 (\<lambda> r2 r1 . True) (\<lambda> r2 r1 . False) (\<lambda> r2 r1 . (constrained_weak_until t A3 A4 r2 r1)) s)"

definition R3_pattern_part where "R3_pattern_part t A11 A12 A2 A3 A4 s \<equiv> (R3_pattern t A11 A12 A2 (\<lambda> s s1 . (A3 s1)) (\<lambda> s s1 . (A4 s1)) s)"

definition R3_pattern_inv where "R3_pattern_inv t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3_1 A4_1 s \<equiv> (P5_inv b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 (\<lambda> r2 r1 . True) (\<lambda> r2 r1 . False) (\<lambda> r2 r1 . (constrained_weak_until_inv t t1_0 A3_1 A4_1 r2 r1)) s)"

definition R3_pattern_inv_part where "R3_pattern_inv_part t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3 A4 s \<equiv> (R3_pattern_inv t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 (\<lambda> s s1 . (A3 s1)) (\<lambda> s s1 . (A4 s1)) s)"

lemma R3_pattern_inv_saving_gen: "
R3_pattern_inv t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3_1 A4_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((((True \<and> True) \<and> (True \<and> (((True \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((always_imp s0 (A4_1 s0) (A4_1 s)) \<and> ((((t1_0 s0) < t) \<and> (((A4_1 s s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A3_1 s s)))) \<or> (((t1_0 s0) >= t) \<and> ((t1_0 s) <= ((t1_0 s0) + 1))))))) \<and> (True \<and> True)) \<and> ((\<not> (w_0_0_0 s0)) \<or> ((((A2 s) \<and> ((A4_1 s s) \<or> (((t1_0 s) = 0) \<and> (A3_1 s s)))) \<or> (((b_0_0 s0) \<and> True) \<and> False)) \<or> ((w_0_0_0 s) \<and> (\<not> (A2 s)))))))) \<and> (((b_1_0_0 s0) \<and> (True \<and> True)) \<or> ((((A2 s) \<and> ((A4_1 s s) \<or> (((t1_0 s) = 0) \<and> (A3_1 s s)))) \<or> (((b_0_0 s0) \<and> True) \<and> False)) \<or> ((w_0_0_0 s) \<and> (\<not> (A2 s)))))) \<and> ((b_1_0_0 s) --> (((b_0_0_0 s0) \<and> True) \<or> (\<not> (A12 s))))) \<and> ((b_0_0_0 s) --> (\<not> (A11 s)))) \<and> ((b_0_0 s) --> True)) \<Longrightarrow>
R3_pattern_inv t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3_1 A4_1 s"

unfolding R3_pattern_inv_def
apply(erule P5_inv_saving_gen)
  apply simp
  apply(erule conjE)
  subgoal premises prems1
  apply(rule conjI)
  apply(insert prems1(1,2))[1]
    apply(erule conjE)
    subgoal premises prems2
    apply(rule conjI)
    apply(insert prems2(1,2))[1]
      apply(erule conjE)
      subgoal premises prems3
      apply(rule conjI)
      apply(insert prems3(1,2))[1]
        apply(erule conjE)
        subgoal premises prems4
        apply(rule conjI)
        apply(insert prems4(1,2))[1]
          apply(erule conjE)
          subgoal premises prems5
          apply(rule conjI)
          apply(insert prems5(1,2))[1]
            apply(erule conjE)
            subgoal premises prems6
            apply(rule conjI)
            apply(insert prems6(1,2))[1]
              apply simp
            apply(insert prems6(1,3))
              apply simp
            done
          apply(insert prems5(1,3))
            apply(erule conjE)
            subgoal premises prems7
            apply(rule conjI)
            apply(insert prems7(1,2))[1]
              apply simp
            apply(insert prems7(1,3))
              apply(erule conjE)
              subgoal premises prems8
              apply(rule conjI)
              apply(insert prems8(1,2))[1]
                apply(erule conjE)
                subgoal premises prems9
                apply(rule conjI)
                apply(insert prems9(1,2))[1]
                  apply(erule conjE)
                  subgoal premises prems10
                  apply(rule conjI)
                  apply(insert prems10(1,2))[1]
                    apply simp
                  apply(insert prems10(1,3))
                    apply(rule constrained_weak_until_rule)
                    apply simp
                      apply(erule conjE)
                      subgoal premises prems11
                      apply(rule conjI)
                      apply(insert prems11(1,2))[1]
                        apply simp
                      apply(insert prems11(1,3))
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
                              apply simp
                            apply(insert prems13(1,3))
                              apply(erule disjE)
                              apply(rule disjI1)
                                apply(erule conjE)
                                subgoal premises prems14
                                apply(rule conjI)
                                apply(insert prems14(1,2))[1]
                                  apply simp
                                apply(insert prems14(1,3))
                                  apply simp
                                done
                              apply(rule disjI2)
                                apply(erule conjE)
                                subgoal premises prems15
                                apply(rule conjI)
                                apply(insert prems15(1,2))[1]
                                  apply simp
                                apply(insert prems15(1,3))
                                  apply simp
                                done
                            done
                          apply(rule disjI2)
                            apply simp
                        done
                      done
                  done
                apply(insert prems9(1,3))
                  apply(erule conjE)
                  subgoal premises prems16
                  apply(rule conjI)
                  apply(insert prems16(1,2))[1]
                    apply(rule always_imp_refl)
                  apply(insert prems16(1,3))
                    apply(rule always_imp_refl)
                  done
                done
              apply(insert prems8(1,3))
                apply(erule disjE)
                apply(rule disjI1)
                  apply simp
                apply(rule disjI2)
                  apply(erule disjE)
                  apply(rule disjI1)
                    apply(erule disjE)
                    apply(rule disjI1)
                      apply(erule conjE)
                      subgoal premises prems17
                      apply(rule conjI)
                      apply(insert prems17(1,2))[1]
                        apply simp
                      apply(insert prems17(1,3))
                        apply(rule constrained_weak_until_one_point)
                        apply simp
                          apply(erule disjE)
                          apply(rule disjI1)
                            apply simp
                          apply(rule disjI2)
                            apply(erule conjE)
                            subgoal premises prems18
                            apply(rule conjI)
                            apply(insert prems18(1,2))[1]
                              apply simp
                            apply(insert prems18(1,3))
                              apply simp
                            done
                      done
                    apply(rule disjI2)
                      apply(erule conjE)
                      subgoal premises prems19
                      apply(rule conjI)
                      apply(insert prems19(1,2))[1]
                        apply(erule conjE)
                        subgoal premises prems20
                        apply(rule conjI)
                        apply(insert prems20(1,2))[1]
                          apply simp
                        apply(insert prems20(1,3))
                          apply(rule always_imp_refl)
                        done
                      apply(insert prems19(1,3))
                        apply simp
                      done
                  apply(rule disjI2)
                    apply(erule conjE)
                    subgoal premises prems21
                    apply(rule conjI)
                    apply(insert prems21(1,2))[1]
                      apply simp
                    apply(insert prems21(1,3))
                      apply simp
                    done
              done
            done
          done
        apply(insert prems4(1,3))
          apply(erule disjE)
          apply(rule disjI1)
            apply(erule conjE)
            subgoal premises prems22
            apply(rule conjI)
            apply(insert prems22(1,2))[1]
              apply simp
            apply(insert prems22(1,3))
              apply(erule conjE)
              subgoal premises prems23
              apply(rule conjI)
              apply(insert prems23(1,2))[1]
                apply simp
              apply(insert prems23(1,3))
                apply simp
              done
            done
          apply(rule disjI2)
            apply(erule disjE)
            apply(rule disjI1)
              apply(erule disjE)
              apply(rule disjI1)
                apply(erule conjE)
                subgoal premises prems24
                apply(rule conjI)
                apply(insert prems24(1,2))[1]
                  apply simp
                apply(insert prems24(1,3))
                  apply(rule constrained_weak_until_one_point)
                  apply simp
                    apply(erule disjE)
                    apply(rule disjI1)
                      apply simp
                    apply(rule disjI2)
                      apply(erule conjE)
                      subgoal premises prems25
                      apply(rule conjI)
                      apply(insert prems25(1,2))[1]
                        apply simp
                      apply(insert prems25(1,3))
                        apply simp
                      done
                done
              apply(rule disjI2)
                apply(erule conjE)
                subgoal premises prems26
                apply(rule conjI)
                apply(insert prems26(1,2))[1]
                  apply(erule conjE)
                  subgoal premises prems27
                  apply(rule conjI)
                  apply(insert prems27(1,2))[1]
                    apply simp
                  apply(insert prems27(1,3))
                    apply(rule always_imp_refl)
                  done
                apply(insert prems26(1,3))
                  apply simp
                done
            apply(rule disjI2)
              apply(erule conjE)
              subgoal premises prems28
              apply(rule conjI)
              apply(insert prems28(1,2))[1]
                apply simp
              apply(insert prems28(1,3))
                apply simp
              done
        done
      apply(insert prems3(1,3))
        apply(rule impI)
        apply(erule impE)
        apply assumption
        subgoal premises prems29
        apply(insert prems29(1,3))
          apply(erule disjE)
          apply(rule disjI1)
            apply(erule conjE)
            subgoal premises prems30
            apply(rule conjI)
            apply(insert prems30(1,2))[1]
              apply simp
            apply(insert prems30(1,3))
              apply simp
            done
          apply(rule disjI2)
            apply simp
        done
      done
    apply(insert prems2(1,3))
      apply(rule impI)
      apply(erule impE)
      apply assumption
      subgoal premises prems31
      apply(insert prems31(1,3))
        apply simp
      done
    done
  apply(insert prems1(1,3))
    apply(rule impI)
    apply(erule impE)
    apply assumption
    subgoal premises prems32
    apply(insert prems32(1,3))
      apply simp
    done
  done
done

lemma R3_patterneinv_imp_req_gen: "
R3_pattern_inv t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3_1 A4_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
((True \<and> True) \<and> (True \<and> ((True \<and> ((always_imp s0 (A3_1 s0) (A3 s0)) \<and> (always_imp s0 (A4_1 s0) (A4 s0)))) \<and> (True \<and> True)))) \<Longrightarrow>
R3_pattern t A11 A12 A2 A3 A4 s0"

unfolding R3_pattern_inv_def R3_pattern_def
apply(erule P5einv_imp_req_gen)
apply simp
  apply(erule conjE)
  subgoal premises prems3
  apply(rule conjI)
  apply(insert prems3(1,2))[1]
    apply(erule conjE)
    subgoal premises prems4
    apply(rule conjI)
    apply(insert prems4(1,2))[1]
      apply simp
    apply(insert prems4(1,3))
      apply simp
    done
  apply(insert prems3(1,3))
    apply(erule conjE)
    subgoal premises prems5
    apply(rule conjI)
    apply(insert prems5(1,2))[1]
      apply simp
    apply(insert prems5(1,3))
      apply(erule conjE)
      subgoal premises prems6
      apply(rule conjI)
      apply(insert prems6(1,2))[1]
        apply(erule conjE)
        subgoal premises prems7
        apply(rule conjI)
        apply(insert prems7(1,2))[1]
          apply simp
        apply(insert prems7(1,3))
          apply(rule constrained_weak_until_einv2req)
          apply simp
            apply(erule conjE)
            subgoal premises prems8
            apply(rule conjI)
            apply(insert prems8(1,2))[1]
              apply simp
            apply(insert prems8(1,3))
              apply simp
            done
        done
      apply(insert prems6(1,3))
        apply(erule conjE)
        subgoal premises prems9
        apply(rule conjI)
        apply(insert prems9(1,2))[1]
          apply(rule always_imp_refl)
        apply(insert prems9(1,3))
          apply(rule always_imp_refl)
        done
      done
    done
  done
done

lemma R3_pattern_inv_saving: "
R3_pattern_inv_part t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3 A4 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((((((t1_0 s0) < t) \<and> (((A4 s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A3 s)))) \<or> (((t1_0 s0) >= t) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((\<not> (w_0_0_0 s0)) \<or> ((((A2 s) \<and> ((A4 s) \<or> (((t1_0 s) = 0) \<and> (A3 s)))) \<or> ((b_0_0 s0) \<and> False)) \<or> ((w_0_0_0 s) \<and> (\<not> (A2 s)))))) \<and> ((b_1_0_0 s0) \<or> ((((A2 s) \<and> ((A4 s) \<or> (((t1_0 s) = 0) \<and> (A3 s)))) \<or> ((b_0_0 s0) \<and> False)) \<or> ((w_0_0_0 s) \<and> (\<not> (A2 s)))))) \<and> ((b_1_0_0 s) --> ((b_0_0_0 s0) \<or> (\<not> (A12 s))))) \<and> ((b_0_0_0 s) --> (\<not> (A11 s)))) \<and> ((b_0_0 s) --> True)) \<Longrightarrow>
R3_pattern_inv_part t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3 A4 s"

unfolding R3_pattern_inv_part_def R3_pattern_part_def
apply(simp add: R3_pattern_inv_saving_gen always_imp_refl)
done

lemma R3_patterneinv_imp_req: "
R3_pattern_inv_part t t1_0 b_0_0 b_0_0_0 b_1_0_0 w_0_0_0 A11 A12 A2 A3 A4 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
R3_pattern_part t A11 A12 A2 A3 A4 s"

unfolding R3_pattern_inv_part_def R3_pattern_part_def
apply(simp add: R3_patterneinv_imp_req_gen always_imp_refl)
done



lemmas R3_pattern_used_patterns = R3_pattern_def P5_used_patterns constrained_weak_until_def 

lemmas R3_pattern_inv_used_patterns = R3_pattern_inv_def P5_inv_used_patterns constrained_weak_until_inv_def 

lemmas R3_pattern_inv_part_used_patterns = R3_pattern_inv_part_def R3_pattern_inv_used_patterns

lemmas R3_pattern_part_used_patterns = R3_pattern_part_def R3_pattern_used_patterns

end
