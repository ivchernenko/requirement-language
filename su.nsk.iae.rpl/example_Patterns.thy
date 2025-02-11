theory example_Patterns imports Patterns
 begin
definition always2 where "always2 A11 A12 A2 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (A2 r2 r1)))) s)"

definition always2_part where "always2_part A11 A12 A2 s \<equiv> (always2 A11 A12 (\<lambda> s s1 . (A2 s1)) s)"

definition always2_inv where "always2_inv b_0 A11 A12 A2_1 s \<equiv> ((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (A2_1 r2 r1)))) s) \<and> (b_0 s --> (previous_inv (\<lambda> r4 r3 . (\<not> (A11 r3))) s))"

definition always2_inv_part where "always2_inv_part b_0 A11 A12 A2 s \<equiv> (always2_inv b_0 A11 A12 (\<lambda> s s1 . (A2 s1)) s)"



lemma always2_inv_saving_gen: "
always2_inv b_0 A11 A12 A2_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((True \<and> (True \<and> (always_imp s0 (\<lambda> r1 . (A2_1 s0 r1)) (\<lambda> r1 . (A2_1 s r1))))) \<and> (((b_0 s) \<and> True) \<or> ((\<not> (A12 s)) \<or> (A2_1 s s)))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
always2_inv b_0 A11 A12 A2_1 s"

lemma always2einv_imp_req_gen: "
always2_inv b_0 A11 A12 A2_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (True \<and> (always_imp s0 (\<lambda> r1 . (A2_1 s0 r1)) (\<lambda> r1 . (A2 s0 r1))))) \<Longrightarrow>
always2 A11 A12 A2 s0"

lemma always2_inv_saving: "
always2_inv_part b_0 A11 A12 A2 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((b_0 s) \<or> ((\<not> (A12 s)) \<or> (A2 s))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
always2_inv_part b_0 A11 A12 A2 s"

lemma always2einv_imp_req: "
always2_inv_part b_0 A11 A12 A2 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
always2_part A11 A12 A2 s"

lemmas always2_used_patterns = always_def weak_previous_def 

lemmas always2_inv_used_patterns = always_inv_def weak_previous_def previous_inv_def 

definition P1_1 where "P1_1 t A1 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_until t A2 A3 r2 r1))) s)"

definition P1_1_part where "P1_1_part t A1 A2 A3 s \<equiv> (P1_1 t A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P1_1_inv where "P1_1_inv t t1_0 A1 A2_1 A3_1 s \<equiv> (always_inv (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_until_inv t t1_0 A2_1 A3_1 r2 r1))) s)"

definition P1_1_inv_part where "P1_1_inv_part t t1_0 A1 A2 A3 s \<equiv> (P1_1_inv t t1_0 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P1_1_inv_saving_gen: "
P1_1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> (((t1_0 s0) = 0) \<or> (((A3_1 s s) \<and> ((t1_0 s0) <= t)) \<or> ((A2_1 s s) \<and> ((t1_0 s0) < (t1_0 s)))))))) \<and> ((\<not> (A1 s)) \<or> ((A3_1 s s) \<or> ((A2_1 s s) \<and> ((t1_0 s) > 0))))) \<Longrightarrow>
P1_1_inv t t1_0 A1 A2_1 A3_1 s"

lemma P1_1einv_imp_req_gen: "
P1_1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> ((always_imp s0 (A3_1 s0) (A3 s0)) \<and> ((t1_0 s0) <= t)))) \<Longrightarrow>
P1_1 t A1 A2 A3 s0"

lemma P1_1_inv_saving: "
P1_1_inv_part t t1_0 A1 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((t1_0 s0) = 0) \<or> (((A3 s) \<and> ((t1_0 s0) <= t)) \<or> ((A2 s) \<and> ((t1_0 s0) < (t1_0 s))))) \<and> ((\<not> (A1 s)) \<or> ((A3 s) \<or> ((A2 s) \<and> ((t1_0 s) > 0))))) \<Longrightarrow>
P1_1_inv_part t t1_0 A1 A2 A3 s"

lemma P1_1einv_imp_req: "
P1_1_inv_part t t1_0 A1 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
((t1_0 s) <= t) \<Longrightarrow>
P1_1_part t A1 A2 A3 s"

lemmas P1_1_used_patterns = always_def constrained_until_def 

lemmas P1_1_inv_used_patterns = always_inv_def constrained_until_inv_def 

definition P1_2 where "P1_2 t A11 A12 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_until t A2 A3 r2 r1)))) s)"

definition P1_2_part where "P1_2_part t A11 A12 A2 A3 s \<equiv> (P1_2 t A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P1_2_inv where "P1_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s \<equiv> ((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_until_inv t t1_0 A2_1 A3_1 r2 r1)))) s) \<and> (b_0 s --> (previous_inv (\<lambda> r4 r3 . (\<not> (A11 r3))) s))"

definition P1_2_inv_part where "P1_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s \<equiv> (P1_2_inv t b_0 t1_0 A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P1_2_inv_saving_gen: "
P1_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> (((t1_0 s0) = 0) \<or> (((A3_1 s s) \<and> ((t1_0 s0) <= t)) \<or> ((A2_1 s s) \<and> ((t1_0 s0) < (t1_0 s))))))))) \<and> (((b_0 s) \<and> True) \<or> ((\<not> (A12 s)) \<or> ((A3_1 s s) \<or> ((A2_1 s s) \<and> ((t1_0 s) > 0)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P1_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s"

lemma P1_2einv_imp_req_gen: "
P1_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> ((always_imp s0 (A3_1 s0) (A3 s0)) \<and> ((t1_0 s0) <= t))))) \<Longrightarrow>
P1_2 t A11 A12 A2 A3 s0"

lemma P1_2_inv_saving: "
P1_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((t1_0 s0) = 0) \<or> (((A3 s) \<and> ((t1_0 s0) <= t)) \<or> ((A2 s) \<and> ((t1_0 s0) < (t1_0 s))))) \<and> ((b_0 s) \<or> ((\<not> (A12 s)) \<or> ((A3 s) \<or> ((A2 s) \<and> ((t1_0 s) > 0)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P1_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s"

lemma P1_2einv_imp_req: "
P1_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
((t1_0 s) <= t) \<Longrightarrow>
P1_2_part t A11 A12 A2 A3 s"

lemmas P1_2_used_patterns = always_def weak_previous_def constrained_until_def 

lemmas P1_2_inv_used_patterns = always_inv_def weak_previous_def constrained_until_inv_def previous_inv_def 

definition P2_1 where "P2_1 t A1 A2 s \<equiv> (always (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_always t A2 r2 r1))) s)"

definition P2_1_part where "P2_1_part t A1 A2 s \<equiv> (P2_1 t A1 (\<lambda> s s1 . (A2 s1)) s)"

definition P2_1_inv where "P2_1_inv t t1_0 A1 A2_1 s \<equiv> (always_inv (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_always_inv t t1_0 A2_1 r2 r1))) s)"

definition P2_1_inv_part where "P2_1_inv_part t t1_0 A1 A2 s \<equiv> (P2_1_inv t t1_0 A1 (\<lambda> s s1 . (A2 s1)) s)"



lemma P2_1_inv_saving_gen: "
P2_1_inv t t1_0 A1 A2_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((True \<and> ((t = 0) \<or> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> (((((t1_0 s0) + 1) >= t) \<or> (A2_1 s s)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))))) \<and> ((\<not> (A1 s)) \<or> ((t = 0) \<or> (((t1_0 s) = 0) \<and> (A2_1 s s))))) \<Longrightarrow>
P2_1_inv t t1_0 A1 A2_1 s"

lemma P2_1einv_imp_req_gen: "
P2_1_inv t t1_0 A1 A2_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (always_imp s0 (A2_1 s0) (A2 s0))) \<Longrightarrow>
P2_1 t A1 A2 s0"

lemma P2_1_inv_saving: "
P2_1_inv_part t t1_0 A1 A2 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((t = 0) \<or> (((((t1_0 s0) + 1) >= t) \<or> (A2 s)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((\<not> (A1 s)) \<or> ((t = 0) \<or> (((t1_0 s) = 0) \<and> (A2 s))))) \<Longrightarrow>
P2_1_inv_part t t1_0 A1 A2 s"

lemma P2_1einv_imp_req: "
P2_1_inv_part t t1_0 A1 A2 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P2_1_part t A1 A2 s"

lemmas P2_1_used_patterns = always_def constrained_always_def 

lemmas P2_1_inv_used_patterns = always_inv_def constrained_always_inv_def 

definition P2_2 where "P2_2 t A11 A12 A2 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_always t A2 r2 r1)))) s)"

definition P2_2_part where "P2_2_part t A11 A12 A2 s \<equiv> (P2_2 t A11 A12 (\<lambda> s s1 . (A2 s1)) s)"

definition P2_2_inv where "P2_2_inv t b_0 t1_0 A11 A12 A2_1 s \<equiv> ((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_always_inv t t1_0 A2_1 r2 r1)))) s) \<and> (b_0 s --> (previous_inv (\<lambda> r4 r3 . (\<not> (A11 r3))) s))"

definition P2_2_inv_part where "P2_2_inv_part t b_0 t1_0 A11 A12 A2 s \<equiv> (P2_2_inv t b_0 t1_0 A11 A12 (\<lambda> s s1 . (A2 s1)) s)"



lemma P2_2_inv_saving_gen: "
P2_2_inv t b_0 t1_0 A11 A12 A2_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((True \<and> (True \<and> ((t = 0) \<or> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> (((((t1_0 s0) + 1) >= t) \<or> (A2_1 s s)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1))))))) \<and> (((b_0 s) \<and> True) \<or> ((\<not> (A12 s)) \<or> ((t = 0) \<or> (((t1_0 s) = 0) \<and> (A2_1 s s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P2_2_inv t b_0 t1_0 A11 A12 A2_1 s"

lemma P2_2einv_imp_req_gen: "
P2_2_inv t b_0 t1_0 A11 A12 A2_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (True \<and> (always_imp s0 (A2_1 s0) (A2 s0)))) \<Longrightarrow>
P2_2 t A11 A12 A2 s0"

lemma P2_2_inv_saving: "
P2_2_inv_part t b_0 t1_0 A11 A12 A2 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((t = 0) \<or> (((((t1_0 s0) + 1) >= t) \<or> (A2 s)) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((b_0 s) \<or> ((\<not> (A12 s)) \<or> ((t = 0) \<or> (((t1_0 s) = 0) \<and> (A2 s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P2_2_inv_part t b_0 t1_0 A11 A12 A2 s"

lemma P2_2einv_imp_req: "
P2_2_inv_part t b_0 t1_0 A11 A12 A2 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P2_2_part t A11 A12 A2 s"

lemmas P2_2_used_patterns = always_def weak_previous_def constrained_always_def 

lemmas P2_2_inv_used_patterns = always_inv_def weak_previous_def constrained_always_inv_def previous_inv_def 

definition P3_1 where "P3_1 A1 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (weak_until A2 A3 r2 r1))) s)"

definition P3_1_part where "P3_1_part A1 A2 A3 s \<equiv> (P3_1 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P3_1_inv where "P3_1_inv w_0 A1 A2_1 A3_1 s \<equiv> (always_inv (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (weak_until_inv w_0 A2_1 A3_1 r2 r1))) s)"

definition P3_1_inv_part where "P3_1_inv_part w_0 A1 A2 A3 s \<equiv> (P3_1_inv w_0 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P3_1_inv_saving_gen: "
P3_1_inv w_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((\<not> (w_0 s0)) \<or> ((A3_1 s s) \<or> ((w_0 s) \<and> (A2_1 s s))))))) \<and> ((\<not> (A1 s)) \<or> ((A3_1 s s) \<or> ((w_0 s) \<and> (A2_1 s s))))) \<Longrightarrow>
P3_1_inv w_0 A1 A2_1 A3_1 s"

lemma P3_1einv_imp_req_gen: "
P3_1_inv w_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> (always_imp s0 (A3_1 s0) (A3 s0)))) \<Longrightarrow>
P3_1 A1 A2 A3 s0"

lemma P3_1_inv_saving: "
P3_1_inv_part w_0 A1 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((\<not> (w_0 s0)) \<or> ((A3 s) \<or> ((w_0 s) \<and> (A2 s)))) \<and> ((\<not> (A1 s)) \<or> ((A3 s) \<or> ((w_0 s) \<and> (A2 s))))) \<Longrightarrow>
P3_1_inv_part w_0 A1 A2 A3 s"

lemma P3_1einv_imp_req: "
P3_1_inv_part w_0 A1 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P3_1_part A1 A2 A3 s"

lemmas P3_1_used_patterns = always_def weak_until_def 

lemmas P3_1_inv_used_patterns = always_inv_def weak_until_inv_def 

definition P3_2 where "P3_2 A11 A12 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (weak_until A2 A3 r2 r1)))) s)"

definition P3_2_part where "P3_2_part A11 A12 A2 A3 s \<equiv> (P3_2 A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P3_2_inv where "P3_2_inv b_0 w_0 A11 A12 A2_1 A3_1 s \<equiv> ((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (weak_until_inv w_0 A2_1 A3_1 r2 r1)))) s) \<and> (b_0 s --> (previous_inv (\<lambda> r4 r3 . (\<not> (A11 r3))) s))"

definition P3_2_inv_part where "P3_2_inv_part b_0 w_0 A11 A12 A2 A3 s \<equiv> (P3_2_inv b_0 w_0 A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P3_2_inv_saving_gen: "
P3_2_inv b_0 w_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((\<not> (w_0 s0)) \<or> ((A3_1 s s) \<or> ((w_0 s) \<and> (A2_1 s s)))))))) \<and> (((b_0 s) \<and> True) \<or> ((\<not> (A12 s)) \<or> ((A3_1 s s) \<or> ((w_0 s) \<and> (A2_1 s s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P3_2_inv b_0 w_0 A11 A12 A2_1 A3_1 s"

lemma P3_2einv_imp_req_gen: "
P3_2_inv b_0 w_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> (always_imp s0 (A3_1 s0) (A3 s0))))) \<Longrightarrow>
P3_2 A11 A12 A2 A3 s0"

lemma P3_2_inv_saving: "
P3_2_inv_part b_0 w_0 A11 A12 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((\<not> (w_0 s0)) \<or> ((A3 s) \<or> ((w_0 s) \<and> (A2 s)))) \<and> ((b_0 s) \<or> ((\<not> (A12 s)) \<or> ((A3 s) \<or> ((w_0 s) \<and> (A2 s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P3_2_inv_part b_0 w_0 A11 A12 A2 A3 s"

lemma P3_2einv_imp_req: "
P3_2_inv_part b_0 w_0 A11 A12 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P3_2_part A11 A12 A2 A3 s"

lemmas P3_2_used_patterns = always_def weak_previous_def weak_until_def 

lemmas P3_2_inv_used_patterns = always_inv_def weak_previous_def weak_until_inv_def previous_inv_def 

definition P4_1 where "P4_1 t A1 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_weak_until t A2 A3 r2 r1))) s)"

definition P4_1_part where "P4_1_part t A1 A2 A3 s \<equiv> (P4_1 t A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P4_1_inv where "P4_1_inv t t1_0 A1 A2_1 A3_1 s \<equiv> (always_inv (\<lambda> r2 r1 . ((\<not> (A1 r1)) \<or> (constrained_weak_until_inv t t1_0 A2_1 A3_1 r2 r1))) s)"

definition P4_1_inv_part where "P4_1_inv_part t t1_0 A1 A2 A3 s \<equiv> (P4_1_inv t t1_0 A1 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P4_1_inv_saving_gen: "
P4_1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((((t1_0 s0) < t) \<and> (((A3_1 s s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A2_1 s s)))) \<or> (((t1_0 s0) >= t) \<and> ((t1_0 s) <= ((t1_0 s0) + 1))))))) \<and> ((\<not> (A1 s)) \<or> ((A3_1 s s) \<or> (((t1_0 s) = 0) \<and> (A2_1 s s))))) \<Longrightarrow>
P4_1_inv t t1_0 A1 A2_1 A3_1 s"

lemma P4_1einv_imp_req_gen: "
P4_1_inv t t1_0 A1 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> (always_imp s0 (A3_1 s0) (A3 s0)))) \<Longrightarrow>
P4_1 t A1 A2 A3 s0"

lemma P4_1_inv_saving: "
P4_1_inv_part t t1_0 A1 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((((t1_0 s0) < t) \<and> (((A3 s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A2 s)))) \<or> (((t1_0 s0) >= t) + ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((\<not> (A1 s)) \<or> ((A3 s) \<or> (((t1_0 s) = 0) \<and> (A2 s))))) \<Longrightarrow>
P4_1_inv_part t t1_0 A1 A2 A3 s"

lemma P4_1einv_imp_req: "
P4_1_inv_part t t1_0 A1 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P4_1_part t A1 A2 A3 s"

lemmas P4_1_used_patterns = always_def constrained_weak_until_def 

lemmas P4_1_inv_used_patterns = always_inv_def constrained_weak_until_inv_def 

definition P4_2 where "P4_2 t A11 A12 A2 A3 s \<equiv> (always (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_weak_until t A2 A3 r2 r1)))) s)"

definition P4_2_part where "P4_2_part t A11 A12 A2 A3 s \<equiv> (P4_2 t A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"

definition P4_2_inv where "P4_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s \<equiv> ((always_inv (\<lambda> r2 r1 . ((weak_previous (\<lambda> r4 r3 . (\<not> (A11 r3))) r2 r1) \<or> ((\<not> (A12 r1)) \<or> (constrained_weak_until_inv t t1_0 A2_1 A3_1 r2 r1)))) s) \<and> (b_0 s --> (previous_inv (\<lambda> r4 r3 . (\<not> (A11 r3))) s))"

definition P4_2_inv_part where "P4_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s \<equiv> (P4_2_inv t b_0 t1_0 A11 A12 (\<lambda> s s1 . (A2 s1)) (\<lambda> s s1 . (A3 s1)) s)"



lemma P4_2_inv_saving_gen: "
P4_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
(((True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2_1 s)) \<and> ((always_imp s0 (A3_1 s0) (A3_1 s)) \<and> ((((t1_0 s0) < t) \<and> (((A3_1 s s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A2_1 s s)))) \<or> (((t1_0 s0) >= t) \<and> ((t1_0 s) <= ((t1_0 s0) + 1)))))))) \<and> (((b_0 s) \<and> True) \<or> ((\<not> (A12 s)) \<or> ((A3_1 s s) \<or> (((t1_0 s) = 0) \<and> (A2_1 s s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P4_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s"

lemma P4_2einv_imp_req_gen: "
P4_2_inv t b_0 t1_0 A11 A12 A2_1 A3_1 s0 \<Longrightarrow>
toEnvP s0 \<Longrightarrow>
(True \<and> (True \<and> ((always_imp s0 (A2_1 s0) (A2 s0)) \<and> (always_imp s0 (A3_1 s0) (A3 s0))))) \<Longrightarrow>
P4_2 t A11 A12 A2 A3 s0"

lemma P4_2_inv_saving: "
P4_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s0 \<Longrightarrow>
consecutive s0 s \<Longrightarrow>
((((((t1_0 s0) < t) \<and> (((A3 s) \<and> ((t1_0 s) <= (t + 1))) \<or> (((t1_0 s) <= ((t1_0 s0) + 1)) \<and> (A2 s)))) \<or> (((t1_0 s0) >= t) + ((t1_0 s) <= ((t1_0 s0) + 1)))) \<and> ((b_0 s) \<or> ((\<not> (A12 s)) \<or> ((A3 s) \<or> (((t1_0 s) = 0) \<and> (A2 s)))))) \<and> ((b_0 s) --> (\<not> (A11 s)))) \<Longrightarrow>
P4_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s"

lemma P4_2einv_imp_req: "
P4_2_inv_part t b_0 t1_0 A11 A12 A2 A3 s \<Longrightarrow>
toEnvP s \<Longrightarrow>
True \<Longrightarrow>
P4_2_part t A11 A12 A2 A3 s"

lemmas P4_2_used_patterns = always_def weak_previous_def constrained_weak_until_def 

lemmas P4_2_inv_used_patterns = always_inv_def weak_previous_def constrained_weak_until_inv_def previous_inv_def 

end
