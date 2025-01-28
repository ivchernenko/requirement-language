theory CommonExtraInv_Proofs imports CommonExtraInv
 begin
theorem extra1: "VC1 commonExtraInv s0"unfolding VC1_def commonExtraInv_defapply auto

theorem cei2: "VC2commonExtraInv env s0  hands"
unfolding VC2_def commonExtraInv_defby fastforce

theorem cei3: "VC3commonExtraInv env s0  hands"
unfolding VC3_def commonExtraInv_defby fastforce

end
