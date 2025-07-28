theory P_2_Timeouts_Patterns imports VCProving.Basic_Patterns 
begin

definition P_2_timeouts where "P_2_timeouts t1 t2 A1 A2 A3 A4 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A1 r3))) r2 r1) \<or> ((since t1 A3 A2 r2 r1) \<or> (since t2 A4 True r2 r1)))) s)"

definition P_2_timeouts_part where "P_2_timeouts_part t1 t2 A1 A2 A3 A4 s \<equiv> (P_2_timeouts t1 t2 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) (\<lambda> s s1 . (A4 s1)) s)"

definition P_2_timeouts_inv where "P_2_timeouts_inv t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2_1 A3_1 A4_1 s \<equiv> ((((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A1 r3))) r2 r1) \<or> ((since t1 A3_1 A2_1 r2 r1) \<or> (since t2 A4_1 True r2 r1)))) s) \<and> (previous_inv b_0 (\<lambda> r4 r3 . (\<not> (A1 r3))) s)) \<and> (since_inv t1 b_1 t1_0 A3_1 A2_1 s)) \<and> (since_inv t2 b_2 t1_1 A4_1 True s))"

definition P_2_timeouts_inv_part where "P_2_timeouts_inv_part t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2 A3 A4 s \<equiv> (P_2_timeouts_inv t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) (\<lambda> s s1 . (A4 s1)) s)"

lemma P_2_timeouts_inv_saving_gen: "
P_2_timeouts_inv t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2_1 A3_1 A4_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((True \<and> (((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> (always_imp s0 (A2_1 s0) (A2_1 s))) \<and> ((always_imp s0 (A4_1 s0) (A4_1 s)) \<and> True))) \<and> (((b_0 s0) \<and> True) \<or> ((((t1 = 0) \<and> (A2_1 s s)) \<or> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((b_1 s) \<and> ((t1 <= ((t1_0 s0) + 1)) \<and> (A3_1 s s)))))) \<or> (((t2 = 0) \<and> True) \<or> ((always_imp s0 (A4_1 s0) (A4_1 s)) \<and> (True \<and> ((b_2 s) \<and> ((t2 <= ((t1_1 s0) + 1)) \<and> (A4_1 s s))))))))) \<and> ((b_0 s) --> (\<not> (A1 s)))) \<and> ((b_1 s) --> ((((t1_0 s) = 0) \<and> (A2_1 s s)) \<or> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((b_1 s) \<and> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A3_1 s s)))))))) \<and> ((b_2 s) --> ((((t1_1 s) = 0) \<and> True) \<or> ((always_imp s0 (A4_1 s0) (A4_1 s)) \<and> (True \<and> ((b_2 s) \<and> (((t1_1 s) <= ((t1_1 s0) + 1)) \<and> (A4_1 s s)))))))) \<Longrightarrow>
P_2_timeouts_inv t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2_1 A3_1 A4_1 s"

unfolding P_2_timeouts_inv_def
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
apply(erule conjE)
apply(erule conjE)
subgoal premises prems3
apply(rule conjI)
apply(insert prems3(1,2,4))[1]
apply(erule always_rule)
  apply simp
  apply(erule conjE)
  subgoal premises prems4
  apply(rule conjI)
  apply(insert prems4(1,2))[1]
    apply(rule always_disj_rule)
    apply simp
      apply(erule conjE)
      subgoal premises prems5
      apply(rule conjI)
      apply(insert prems5(1,2))[1]
        apply(rule weak_previous_LS4)
        apply simp
          apply(rule always_imp_refl)
      apply(insert prems5(1,3))
        apply(rule always_disj_rule)
        apply simp
          apply(erule conjE)
          subgoal premises prems6
          apply(rule conjI)
          apply(insert prems6(1,2))[1]
            apply(rule since_L4)
            apply simp
              apply(erule conjE)
              subgoal premises prems7
              apply(rule conjI)
              apply(insert prems7(1,2))[1]
                apply assumption
              apply(insert prems7(1,3))
                apply assumption
              done
          apply(insert prems6(1,3))
            apply(rule since_L4)
            apply simp
              apply(erule conjE)
              subgoal premises prems8
              apply(rule conjI)
              apply(insert prems8(1,2))[1]
                apply assumption
              apply(insert prems8(1,3))
                apply(rule always_imp_refl)
              done
          done
      done
  apply(insert prems4(1,3))
    apply(erule disjE)
    apply(rule disjI1)
      apply(rule weak_previous_one_point[OF prems3(3)])
      apply simp
        apply(erule conjE)
        subgoal premises prems9
        apply(rule conjI)
        apply(insert prems9(1,2))[1]
          apply assumption
        apply(insert prems9(1,3))
          apply(rule always_imp_refl)
        done
    apply(rule disjI2)
      apply(erule disjE)
      apply(rule disjI1)
        apply(rule since_L7[OF prems2(3)])
        apply simp
          apply(erule disjE)
          apply(rule disjI1)
            apply(erule conjE)
            subgoal premises prems10
            apply(rule conjI)
            apply(insert prems10(1,2))[1]
              apply assumption
            apply(insert prems10(1,3))
              apply assumption
            done
          apply(rule disjI2)
            apply(erule conjE)
            subgoal premises prems11
            apply(rule conjI)
            apply(insert prems11(1,2))[1]
              apply assumption
            apply(insert prems11(1,3))
              apply(erule conjE)
              subgoal premises prems12
              apply(rule conjI)
              apply(insert prems12(1,2))[1]
                apply assumption
              apply(insert prems12(1,3))
                apply(erule conjE)
                subgoal premises prems13
                apply(rule conjI)
                apply(insert prems13(1,2))[1]
                  apply assumption
                apply(insert prems13(1,3))
                  apply(erule conjE)
                  subgoal premises prems14
                  apply(rule conjI)
                  apply(insert prems14(1,2))[1]
                    apply assumption
                  apply(insert prems14(1,3))
                    apply assumption
                  done
                done
              done
            done
      apply(rule disjI2)
        apply(rule since_L7[OF prems1(3)])
        apply simp
          apply(erule disjE)
          apply(rule disjI1)
            apply(erule conjE)
            subgoal premises prems15
            apply(rule conjI)
            apply(insert prems15(1,2))[1]
              apply assumption
            apply(insert prems15(1,3))
              apply assumption
            done
          apply(rule disjI2)
            apply(erule conjE)
            subgoal premises prems16
            apply(rule conjI)
            apply(insert prems16(1,2))[1]
              apply assumption
            apply(insert prems16(1,3))
              apply(erule conjE)
              subgoal premises prems17
              apply(rule conjI)
              apply(insert prems17(1,2))[1]
                apply(rule always_imp_refl)
              apply(insert prems17(1,3))
                apply(erule conjE)
                subgoal premises prems18
                apply(rule conjI)
                apply(insert prems18(1,2))[1]
                  apply assumption
                apply(insert prems18(1,3))
                  apply(erule conjE)
                  subgoal premises prems19
                  apply(rule conjI)
                  apply(insert prems19(1,2))[1]
                    apply assumption
                  apply(insert prems19(1,3))
                    apply assumption
                  done
                done
              done
            done
  done
apply(insert prems3(1,3,5))
  apply(erule previous_rule)
  apply simp
  apply(rule impI)
  apply(erule impE)
  apply assumption
  subgoal premises prems20
  apply(insert prems20(1,3))
    apply assumption
  done
done
apply(insert prems2(1,3,5))
  apply(erule since_one_point)
  apply simp
  apply(rule impI)
  apply(erule impE)
  apply assumption
  subgoal premises prems21
  apply(insert prems21(1,3))
    apply(erule disjE)
    apply(rule disjI1)
      apply(erule conjE)
      subgoal premises prems22
      apply(rule conjI)
      apply(insert prems22(1,2))[1]
        apply assumption
      apply(insert prems22(1,3))
        apply assumption
      done
    apply(rule disjI2)
      apply(erule conjE)
      subgoal premises prems23
      apply(rule conjI)
      apply(insert prems23(1,2))[1]
        apply assumption
      apply(insert prems23(1,3))
        apply(erule conjE)
        subgoal premises prems24
        apply(rule conjI)
        apply(insert prems24(1,2))[1]
          apply assumption
        apply(insert prems24(1,3))
          apply(erule conjE)
          subgoal premises prems25
          apply(rule conjI)
          apply(insert prems25(1,2))[1]
            apply assumption
          apply(insert prems25(1,3))
            apply(erule conjE)
            subgoal premises prems26
            apply(rule conjI)
            apply(insert prems26(1,2))[1]
              apply assumption
            apply(insert prems26(1,3))
              apply assumption
            done
          done
        done
      done
  done
done
apply(insert prems1(1,3,5))
  apply(erule since_one_point)
  apply simp
  apply(rule impI)
  apply(erule impE)
  apply assumption
  subgoal premises prems27
  apply(insert prems27(1,3))
    apply(erule disjE)
    apply(rule disjI1)
      apply(erule conjE)
      subgoal premises prems28
      apply(rule conjI)
      apply(insert prems28(1,2))[1]
        apply assumption
      apply(insert prems28(1,3))
        apply assumption
      done
    apply(rule disjI2)
      apply(erule conjE)
      subgoal premises prems29
      apply(rule conjI)
      apply(insert prems29(1,2))[1]
        apply assumption
      apply(insert prems29(1,3))
        apply(erule conjE)
        subgoal premises prems30
        apply(rule conjI)
        apply(insert prems30(1,2))[1]
          apply(rule always_imp_refl)
        apply(insert prems30(1,3))
          apply(erule conjE)
          subgoal premises prems31
          apply(rule conjI)
          apply(insert prems31(1,2))[1]
            apply assumption
          apply(insert prems31(1,3))
            apply(erule conjE)
            subgoal premises prems32
            apply(rule conjI)
            apply(insert prems32(1,2))[1]
              apply assumption
            apply(insert prems32(1,3))
              apply assumption
            done
          done
        done
      done
  done
done
done

lemma P_2_timeoutseinv_imp_req_gen: "
P_2_timeouts_inv t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2_1 A3_1 A4_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (((always_imp s0 (A3_1 s0) (A3 s0)) \<and> (always_imp s0 (A2_1 s0) (A2 s0))) \<and> ((always_imp s0 (A4_1 s0) (A4 s0)) \<and> True))) \<Longrightarrow>
P_2_timeouts t1 t2 A1 A2 A3 A4 s0"

unfolding P_2_timeouts_inv_def P_2_timeouts_def
subgoal premises prems1
apply(insert prems1(1,2))
apply(simp only: conj_assoc)
apply(erule conjE)
subgoal premises prems2
apply(insert prems2(1,2) prems1(3))
apply(erule always_einv2req)
apply simp
  apply(rule always_disj_rule)
  apply simp
    apply(erule conjE)
    subgoal premises prems3
    apply(rule conjI)
    apply(insert prems3(1,2))[1]
      apply(rule weak_previous_LS5)
      apply simp
        apply(rule always_imp_refl)
    apply(insert prems3(1,3))
      apply(rule always_disj_rule)
      apply simp
        apply(erule conjE)
        subgoal premises prems4
        apply(rule conjI)
        apply(insert prems4(1,2))[1]
          apply(rule since_L5)
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
          apply(rule since_L5)
          apply simp
            apply(erule conjE)
            subgoal premises prems6
            apply(rule conjI)
            apply(insert prems6(1,2))[1]
              apply assumption
            apply(insert prems6(1,3))
              apply(rule always_imp_refl)
            done
        done
    done
done
done
done

lemma P_2_timeouts_inv_saving: "
P_2_timeouts_inv_part t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2 A3 A4 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((b_0 s0) \<or> ((((t1 = 0) \<and> (A2 s)) \<or> ((b_1 s) \<and> ((t1 <= ((t1_0 s0) + 1)) \<and> (A3 s)))) \<or> ((t2 = 0) \<or> ((b_2 s) \<and> ((t2 <= ((t1_1 s0) + 1)) \<and> (A4 s)))))) \<and> ((b_0 s) --> (\<not> (A1 s)))) \<and> ((b_1 s) --> ((((t1_0 s) = 0) \<and> (A2 s)) \<or> ((b_1 s) \<and> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A3 s)))))) \<and> ((b_2 s) --> (((t1_1 s) = 0) \<or> ((b_2 s) \<and> (((t1_1 s) <= ((t1_1 s0) + 1)) \<and> (A4 s)))))) \<Longrightarrow>
P_2_timeouts_inv_part t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2 A3 A4 s"

unfolding P_2_timeouts_inv_part_def P_2_timeouts_part_def
apply(simp add: P_2_timeouts_inv_saving_gen always_imp_refl)
done

lemma P_2_timeoutseinv_imp_req: "
P_2_timeouts_inv_part t1 t2 b_0 b_1 t1_0 b_2 t1_1 A1 A2 A3 A4 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P_2_timeouts_part t1 t2 A1 A2 A3 A4 s"

unfolding P_2_timeouts_inv_part_def P_2_timeouts_part_def
apply(simp add: P_2_timeoutseinv_imp_req_gen always_imp_refl)
done



lemmas P_2_timeouts_used_patterns = P_2_timeouts_def always_used_patterns weak_previous_def since_def since_def 

lemmas P_2_timeouts_inv_used_patterns = P_2_timeouts_inv_def always_inv_used_patterns weak_previous_def since_def since_def previous_inv_def since_inv_def since_inv_def 

lemmas P_2_timeouts_inv_part_used_patterns = P_2_timeouts_inv_part_def P_2_timeouts_inv_used_patterns

lemmas P_2_timeouts_part_used_patterns = P_2_timeouts_part_def P_2_timeouts_used_patterns

end
