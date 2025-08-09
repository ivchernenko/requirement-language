theory Common_Extra_Invariant
  imports BaggageCarousel 
begin

definition common_extra_invariant where "common_extra_invariant s \<equiv> toEnvP s \<and>
(getPstate s p_Carousel' = p_Carousel's_turnedOff' \<longrightarrow> getPstate s p_ProblemController' = STOP) \<and>
(getPstate s p_ProblemController' = p_ProblemController's_ctrl' \<longrightarrow> getVarBool s v_engine' = True) \<and>
(getPstate s p_ProblemController' = STOP \<longrightarrow> getVarBool s v_engine' = False) \<and>
(getPstate s p_Carousel' = p_Carousel's_turnedOn' \<longrightarrow> ltime s p_Carousel' \<le> v_IDLE_TIMEOUT'TIMEOUT) \<and>
getPstate s p_Carousel' \<in> {p_Carousel's_turnedOff', p_Carousel's_turnedOn'} \<and>
getPstate s p_ProblemController' \<in> {p_ProblemController's_ctrl', STOP}"

end