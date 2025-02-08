theory example_Patterns imports Patterns
 begin
definition P1 where "P1 t A1 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_until t A2 A3 r2 r1))) s)"

definition P1_part where "P1_part t A1 A2 A3 s \<equiv> (P1 t A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P1_inv where "P1_inv t t1_0 A1 A2_1 A3_1 s \<equiv> (always_inv (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_until_inv t t1_0 A2_1 A3_1 r2 r1))) s)"

definition P1_inv_part where "P1_inv_part t t1_0 A1 A2 A3 s \<equiv> (P1_inv t t1_0 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P1_inv_saving_gen: "
P1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> (((t1_0 s0) = 0) \<or> (((A3_1 s s) \<and> ((t1_0 s0) <= t)) \<or> ((A2_1 s s) \<and> ((t1_0 s0) < (t1_0 s)))))))) \<and> ((\<not> (A1 s)) \<or> ((A3_1 s s) \<or> ((A2_1 s s) \<and> ((t1_0 s) > 0))))) \<Longrightarrow>
P1_inv t t1_0 A1 A2_1 A3_1 s"

lemma P1einv_imp_req_gen: "
P1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> ((always_imp s0 (A3_1 s0) (A3 s0)) \<and> ((t1_0 s0) <= t)))) \<Longrightarrow>
P1 t A1 A2 A3 s0"

lemma P1_inv_saving: "
P1_inv_part t t1_0 A1 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((t1_0 s0) = 0) \<or> (((A3 s) \<and> ((t1_0 s0) <= t)) \<or> ((A2 s) \<and> ((t1_0 s0) < (t1_0 s))))) \<and> ((\<not> (A1 s)) \<or> ((A3 s) \<or> ((A2 s) \<and> ((t1_0 s) > 0))))) \<Longrightarrow>
P1_inv_part t t1_0 A1 A2 A3 s"

lemma P1einv_imp_req: "
P1_inv_part t t1_0 A1 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
((t1_0 s) <= t) \<Longrightarrow>
P1_part t A1 A2 A3 s"

lemmas P1_used_patterns = always_def constrained_until_def 

lemmas P1_inv_used_patterns = always_inv_def constrained_until_inv_def 

end
