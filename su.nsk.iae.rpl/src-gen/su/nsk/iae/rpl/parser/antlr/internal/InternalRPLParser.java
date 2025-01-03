package su.nsk.iae.rpl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import su.nsk.iae.rpl.services.RPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DISJUNCTION", "RULE_CONJUNCTION", "RULE_NEGATION", "RULE_BOOLEAN_LITERAL", "RULE_POWER_OPERATOR", "RULE_INTEGER", "RULE_REAL", "RULE_IMPLICATION", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'derivedreq'", "'pattern'", "'('", "'const'", "':'", "','", "'formulas'", "')'", "'='", "'from'", "'with'", "'var'", "'lambda'", "'.'", "'frm'", "'final'", "'current'", "'futurereq'", "'pastreq'", "'futureeinv'", "'fun'", "'pasteinv'", "'derivedeinv'", "'/'", "'..'", "'['", "']'", "'-'", "'requirement'", "'extra'", "'invariant'", "'for'", "'lemmas'", "'{'", "'LS1'", "'LS2'", "'LS3'", "'}'", "'LS4'", "'LS5'", "'LS6'", "'LS7'", "'LS8'", "'LS9'", "'lemma'", "'init'", "'state'", "'premise'", "'alwaysimp'", "'=='", "'~='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'mod'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_BOOLEAN_LITERAL=9;
    public static final int RULE_REAL=12;
    public static final int RULE_DIGIT=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_POWER_OPERATOR=10;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_NEGATION=8;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_IMPLICATION=13;
    public static final int RULE_CONJUNCTION=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_DISJUNCTION=6;
    public static final int T__41=41;
    public static final int RULE_INTEGER=11;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRPL.g"; }



     	private RPLGrammarAccess grammarAccess;

        public InternalRPLParser(TokenStream input, RPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRPL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRPL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRPL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRPL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalRPL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalRPL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_elements_1_0= ruleElement ) )* )
            // InternalRPL.g:80:3: ( (lv_imports_0_0= ruleImport ) )? ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalRPL.g:80:3: ( (lv_imports_0_0= ruleImport ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRPL.g:81:4: (lv_imports_0_0= ruleImport )
                    {
                    // InternalRPL.g:81:4: (lv_imports_0_0= ruleImport )
                    // InternalRPL.g:82:5: lv_imports_0_0= ruleImport
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_imports_0_0=ruleImport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"imports",
                    						lv_imports_0_0,
                    						"su.nsk.iae.rpl.RPL.Import");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:99:3: ( (lv_elements_1_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22||LA2_0==33||(LA2_0>=39 && LA2_0<=41)||(LA2_0>=43 && LA2_0<=44)||(LA2_0>=50 && LA2_0<=51)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRPL.g:100:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalRPL.g:100:4: (lv_elements_1_0= ruleElement )
            	    // InternalRPL.g:101:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"su.nsk.iae.rpl.RPL.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalRPL.g:122:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRPL.g:122:47: (iv_ruleImport= ruleImport EOF )
            // InternalRPL.g:123:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRPL.g:129:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRPL.g:135:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalRPL.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalRPL.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalRPL.g:137:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRPL.g:141:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalRPL.g:142:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalRPL.g:142:4: (lv_importURI_1_0= RULE_STRING )
            // InternalRPL.g:143:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // InternalRPL.g:167:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalRPL.g:167:48: (iv_ruleElement= ruleElement EOF )
            // InternalRPL.g:168:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalRPL.g:174:1: ruleElement returns [EObject current=null] : (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDeclaration_0 = null;

        EObject this_DerivedRequirementPattern_1 = null;

        EObject this_FutureRequirementPattern_2 = null;

        EObject this_PastRequirementPattern_3 = null;

        EObject this_DerivedExtraInvariantPattern_4 = null;

        EObject this_FutureExtraInvariantPattern_5 = null;

        EObject this_PastExtraInvariantPattern_6 = null;

        EObject this_Requirement_7 = null;

        EObject this_ExtraInvariant_8 = null;



        	enterRule();

        try {
            // InternalRPL.g:180:2: ( (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant ) )
            // InternalRPL.g:181:2: (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant )
            {
            // InternalRPL.g:181:2: (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 44:
                {
                alt3=5;
                }
                break;
            case 41:
                {
                alt3=6;
                }
                break;
            case 43:
                {
                alt3=7;
                }
                break;
            case 50:
                {
                alt3=8;
                }
                break;
            case 51:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRPL.g:182:3: this_VarDeclaration_0= ruleVarDeclaration
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVarDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;


                    			current = this_VarDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:191:3: this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDerivedRequirementPatternParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedRequirementPattern_1=ruleDerivedRequirementPattern();

                    state._fsp--;


                    			current = this_DerivedRequirementPattern_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:200:3: this_FutureRequirementPattern_2= ruleFutureRequirementPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFutureRequirementPatternParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FutureRequirementPattern_2=ruleFutureRequirementPattern();

                    state._fsp--;


                    			current = this_FutureRequirementPattern_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRPL.g:209:3: this_PastRequirementPattern_3= rulePastRequirementPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPastRequirementPatternParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PastRequirementPattern_3=rulePastRequirementPattern();

                    state._fsp--;


                    			current = this_PastRequirementPattern_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRPL.g:218:3: this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDerivedExtraInvariantPatternParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DerivedExtraInvariantPattern_4=ruleDerivedExtraInvariantPattern();

                    state._fsp--;


                    			current = this_DerivedExtraInvariantPattern_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRPL.g:227:3: this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFutureExtraInvariantPatternParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FutureExtraInvariantPattern_5=ruleFutureExtraInvariantPattern();

                    state._fsp--;


                    			current = this_FutureExtraInvariantPattern_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRPL.g:236:3: this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPastExtraInvariantPatternParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PastExtraInvariantPattern_6=rulePastExtraInvariantPattern();

                    state._fsp--;


                    			current = this_PastExtraInvariantPattern_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRPL.g:245:3: this_Requirement_7= ruleRequirement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRequirementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Requirement_7=ruleRequirement();

                    state._fsp--;


                    			current = this_Requirement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRPL.g:254:3: this_ExtraInvariant_8= ruleExtraInvariant
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getExtraInvariantParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtraInvariant_8=ruleExtraInvariant();

                    state._fsp--;


                    			current = this_ExtraInvariant_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDerivedRequirementPattern"
    // InternalRPL.g:266:1: entryRuleDerivedRequirementPattern returns [EObject current=null] : iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF ;
    public final EObject entryRuleDerivedRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedRequirementPattern = null;


        try {
            // InternalRPL.g:266:66: (iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF )
            // InternalRPL.g:267:2: iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF
            {
             newCompositeNode(grammarAccess.getDerivedRequirementPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedRequirementPattern=ruleDerivedRequirementPattern();

            state._fsp--;

             current =iv_ruleDerivedRequirementPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivedRequirementPattern"


    // $ANTLR start "ruleDerivedRequirementPattern"
    // InternalRPL.g:273:1: ruleDerivedRequirementPattern returns [EObject current=null] : (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) ) ( (lv_lemmas_21_0= ruleDerivedLemmas ) )? otherlv_22= ';' ) ;
    public final EObject ruleDerivedRequirementPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fmParams_11_0 = null;

        EObject lv_fmParams_13_0 = null;

        EObject lv_definition_16_0 = null;

        AntlrDatatypeRuleToken lv_file_18_0 = null;

        EObject lv_lemmas_21_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:279:2: ( (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) ) ( (lv_lemmas_21_0= ruleDerivedLemmas ) )? otherlv_22= ';' ) )
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) ) ( (lv_lemmas_21_0= ruleDerivedLemmas ) )? otherlv_22= ';' )
            {
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) ) ( (lv_lemmas_21_0= ruleDerivedLemmas ) )? otherlv_22= ';' )
            // InternalRPL.g:281:3: otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) ) ( (lv_lemmas_21_0= ruleDerivedLemmas ) )? otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedRequirementPatternAccess().getDerivedreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:289:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:290:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:290:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:291:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDerivedRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:311:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRPL.g:312:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:320:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:321:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:321:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:322:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:339:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRPL.g:340:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:344:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:345:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:345:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:346:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:365:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRPL.g:366:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:374:4: ( (lv_fmParams_11_0= ruleFormulaParameter ) )
                    // InternalRPL.g:375:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:375:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    // InternalRPL.g:376:6: lv_fmParams_11_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_11_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:393:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRPL.g:394:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:398:5: ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:399:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:399:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    // InternalRPL.g:400:7: lv_fmParams_13_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_13_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getDerivedRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            // InternalRPL.g:423:3: ( (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) ) | (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRPL.g:424:4: (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) )
                    {
                    // InternalRPL.g:424:4: (otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) ) )
                    // InternalRPL.g:425:5: otherlv_15= '=' ( (lv_definition_16_0= ruleFormula ) )
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_14); 

                    					newLeafNode(otherlv_15, grammarAccess.getDerivedRequirementPatternAccess().getEqualsSignKeyword_7_0_0());
                    				
                    // InternalRPL.g:429:5: ( (lv_definition_16_0= ruleFormula ) )
                    // InternalRPL.g:430:6: (lv_definition_16_0= ruleFormula )
                    {
                    // InternalRPL.g:430:6: (lv_definition_16_0= ruleFormula )
                    // InternalRPL.g:431:7: lv_definition_16_0= ruleFormula
                    {

                    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getDefinitionFormulaParserRuleCall_7_0_1_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_definition_16_0=ruleFormula();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    							set(
                    								current,
                    								"definition",
                    								lv_definition_16_0,
                    								"su.nsk.iae.rpl.RPL.Formula");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:450:4: (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) )
                    {
                    // InternalRPL.g:450:4: (otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) ) )
                    // InternalRPL.g:451:5: otherlv_17= 'from' ( (lv_file_18_0= ruleFilePath ) ) otherlv_19= 'with' ( (otherlv_20= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,31,FOLLOW_16); 

                    					newLeafNode(otherlv_17, grammarAccess.getDerivedRequirementPatternAccess().getFromKeyword_7_1_0());
                    				
                    // InternalRPL.g:455:5: ( (lv_file_18_0= ruleFilePath ) )
                    // InternalRPL.g:456:6: (lv_file_18_0= ruleFilePath )
                    {
                    // InternalRPL.g:456:6: (lv_file_18_0= ruleFilePath )
                    // InternalRPL.g:457:7: lv_file_18_0= ruleFilePath
                    {

                    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFileFilePathParserRuleCall_7_1_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_file_18_0=ruleFilePath();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    							set(
                    								current,
                    								"file",
                    								lv_file_18_0,
                    								"su.nsk.iae.rpl.RPL.FilePath");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_7); 

                    					newLeafNode(otherlv_19, grammarAccess.getDerivedRequirementPatternAccess().getWithKeyword_7_1_2());
                    				
                    // InternalRPL.g:478:5: ( (otherlv_20= RULE_ID ) )
                    // InternalRPL.g:479:6: (otherlv_20= RULE_ID )
                    {
                    // InternalRPL.g:479:6: (otherlv_20= RULE_ID )
                    // InternalRPL.g:480:7: otherlv_20= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    						
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_20, grammarAccess.getDerivedRequirementPatternAccess().getExtraInvPatternDerivedExtraInvariantPatternCrossReference_7_1_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:493:3: ( (lv_lemmas_21_0= ruleDerivedLemmas ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRPL.g:494:4: (lv_lemmas_21_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:494:4: (lv_lemmas_21_0= ruleDerivedLemmas )
                    // InternalRPL.g:495:5: lv_lemmas_21_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getLemmasDerivedLemmasParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lemmas_21_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_21_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getDerivedRequirementPatternAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivedRequirementPattern"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalRPL.g:520:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalRPL.g:520:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalRPL.g:521:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalRPL.g:527:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:533:2: ( (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) )
            // InternalRPL.g:534:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            {
            // InternalRPL.g:534:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            // InternalRPL.g:535:3: otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalRPL.g:539:3: ( (lv_vars_1_0= ruleProgramVariable ) )
            // InternalRPL.g:540:4: (lv_vars_1_0= ruleProgramVariable )
            {
            // InternalRPL.g:540:4: (lv_vars_1_0= ruleProgramVariable )
            // InternalRPL.g:541:5: lv_vars_1_0= ruleProgramVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_vars_1_0=ruleProgramVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"su.nsk.iae.rpl.RPL.ProgramVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRPL.g:558:3: (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRPL.g:559:4: otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRPL.g:563:4: ( (lv_vars_3_0= ruleProgramVariable ) )
            	    // InternalRPL.g:564:5: (lv_vars_3_0= ruleProgramVariable )
            	    {
            	    // InternalRPL.g:564:5: (lv_vars_3_0= ruleProgramVariable )
            	    // InternalRPL.g:565:6: lv_vars_3_0= ruleProgramVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_vars_3_0=ruleProgramVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_3_0,
            	    							"su.nsk.iae.rpl.RPL.ProgramVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleProgramVariable"
    // InternalRPL.g:591:1: entryRuleProgramVariable returns [EObject current=null] : iv_ruleProgramVariable= ruleProgramVariable EOF ;
    public final EObject entryRuleProgramVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramVariable = null;


        try {
            // InternalRPL.g:591:56: (iv_ruleProgramVariable= ruleProgramVariable EOF )
            // InternalRPL.g:592:2: iv_ruleProgramVariable= ruleProgramVariable EOF
            {
             newCompositeNode(grammarAccess.getProgramVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramVariable=ruleProgramVariable();

            state._fsp--;

             current =iv_ruleProgramVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgramVariable"


    // $ANTLR start "ruleProgramVariable"
    // InternalRPL.g:598:1: ruleProgramVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProgramVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:604:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:605:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:605:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:606:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:606:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:607:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProgramVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProgramVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgramVariable"


    // $ANTLR start "entryRuleUpdateStateVariable"
    // InternalRPL.g:626:1: entryRuleUpdateStateVariable returns [EObject current=null] : iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF ;
    public final EObject entryRuleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStateVariable = null;


        try {
            // InternalRPL.g:626:60: (iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF )
            // InternalRPL.g:627:2: iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF
            {
             newCompositeNode(grammarAccess.getUpdateStateVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateStateVariable=ruleUpdateStateVariable();

            state._fsp--;

             current =iv_ruleUpdateStateVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateStateVariable"


    // $ANTLR start "ruleUpdateStateVariable"
    // InternalRPL.g:633:1: ruleUpdateStateVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:639:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:640:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:640:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:641:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:641:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:642:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUpdateStateVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUpdateStateVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateStateVariable"


    // $ANTLR start "entryRuleConstantParameter"
    // InternalRPL.g:661:1: entryRuleConstantParameter returns [EObject current=null] : iv_ruleConstantParameter= ruleConstantParameter EOF ;
    public final EObject entryRuleConstantParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParameter = null;


        try {
            // InternalRPL.g:661:58: (iv_ruleConstantParameter= ruleConstantParameter EOF )
            // InternalRPL.g:662:2: iv_ruleConstantParameter= ruleConstantParameter EOF
            {
             newCompositeNode(grammarAccess.getConstantParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantParameter=ruleConstantParameter();

            state._fsp--;

             current =iv_ruleConstantParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantParameter"


    // $ANTLR start "ruleConstantParameter"
    // InternalRPL.g:668:1: ruleConstantParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstantParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:674:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:675:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:675:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:676:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:676:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:677:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getConstantParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstantParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantParameter"


    // $ANTLR start "entryRuleFormulaParameter"
    // InternalRPL.g:696:1: entryRuleFormulaParameter returns [EObject current=null] : iv_ruleFormulaParameter= ruleFormulaParameter EOF ;
    public final EObject entryRuleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameter = null;


        try {
            // InternalRPL.g:696:57: (iv_ruleFormulaParameter= ruleFormulaParameter EOF )
            // InternalRPL.g:697:2: iv_ruleFormulaParameter= ruleFormulaParameter EOF
            {
             newCompositeNode(grammarAccess.getFormulaParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaParameter=ruleFormulaParameter();

            state._fsp--;

             current =iv_ruleFormulaParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulaParameter"


    // $ANTLR start "ruleFormulaParameter"
    // InternalRPL.g:703:1: ruleFormulaParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:709:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:710:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:710:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:711:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:711:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:712:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFormulaParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFormulaParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaParameter"


    // $ANTLR start "entryRuleFunctionalParameter"
    // InternalRPL.g:731:1: entryRuleFunctionalParameter returns [EObject current=null] : iv_ruleFunctionalParameter= ruleFunctionalParameter EOF ;
    public final EObject entryRuleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalParameter = null;


        try {
            // InternalRPL.g:731:60: (iv_ruleFunctionalParameter= ruleFunctionalParameter EOF )
            // InternalRPL.g:732:2: iv_ruleFunctionalParameter= ruleFunctionalParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionalParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalParameter=ruleFunctionalParameter();

            state._fsp--;

             current =iv_ruleFunctionalParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalParameter"


    // $ANTLR start "ruleFunctionalParameter"
    // InternalRPL.g:738:1: ruleFunctionalParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:744:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:745:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:745:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:746:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:746:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:747:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFunctionalParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFunctionalParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalParameter"


    // $ANTLR start "entryRuleFormula"
    // InternalRPL.g:766:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalRPL.g:766:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalRPL.g:767:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalRPL.g:773:1: ruleFormula returns [EObject current=null] : (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:779:2: ( (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) )
            // InternalRPL.g:780:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            {
            // InternalRPL.g:780:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            // InternalRPL.g:781:3: this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getFormulaAccess().getConjunctionFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ConjunctionFormula_0=ruleConjunctionFormula();

            state._fsp--;


            			current = this_ConjunctionFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:789:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DISJUNCTION) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRPL.g:790:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) )
            	    {
            	    // InternalRPL.g:790:4: ()
            	    // InternalRPL.g:791:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_14); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:801:4: ( (lv_right_3_0= ruleFormula ) )
            	    // InternalRPL.g:802:5: (lv_right_3_0= ruleFormula )
            	    {
            	    // InternalRPL.g:802:5: (lv_right_3_0= ruleFormula )
            	    // InternalRPL.g:803:6: lv_right_3_0= ruleFormula
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getRightFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.Formula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleConjunctionFormula"
    // InternalRPL.g:825:1: entryRuleConjunctionFormula returns [EObject current=null] : iv_ruleConjunctionFormula= ruleConjunctionFormula EOF ;
    public final EObject entryRuleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFormula = null;


        try {
            // InternalRPL.g:825:59: (iv_ruleConjunctionFormula= ruleConjunctionFormula EOF )
            // InternalRPL.g:826:2: iv_ruleConjunctionFormula= ruleConjunctionFormula EOF
            {
             newCompositeNode(grammarAccess.getConjunctionFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctionFormula=ruleConjunctionFormula();

            state._fsp--;

             current =iv_ruleConjunctionFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionFormula"


    // $ANTLR start "ruleConjunctionFormula"
    // InternalRPL.g:832:1: ruleConjunctionFormula returns [EObject current=null] : (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) ;
    public final EObject ruleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:838:2: ( (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) )
            // InternalRPL.g:839:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            {
            // InternalRPL.g:839:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            // InternalRPL.g:840:3: this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getPrimaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PrimaryFormula_0=rulePrimaryFormula();

            state._fsp--;


            			current = this_PrimaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:848:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_CONJUNCTION) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPL.g:849:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    {
            	    // InternalRPL.g:849:4: ()
            	    // InternalRPL.g:850:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionFormulaAccess().getConjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_14); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:860:4: ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    // InternalRPL.g:861:5: (lv_right_3_0= ruleConjunctionFormula )
            	    {
            	    // InternalRPL.g:861:5: (lv_right_3_0= ruleConjunctionFormula )
            	    // InternalRPL.g:862:6: lv_right_3_0= ruleConjunctionFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getRightConjunctionFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleConjunctionFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.ConjunctionFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionFormula"


    // $ANTLR start "entryRulePrimaryFormula"
    // InternalRPL.g:884:1: entryRulePrimaryFormula returns [EObject current=null] : iv_rulePrimaryFormula= rulePrimaryFormula EOF ;
    public final EObject entryRulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryFormula = null;


        try {
            // InternalRPL.g:884:55: (iv_rulePrimaryFormula= rulePrimaryFormula EOF )
            // InternalRPL.g:885:2: iv_rulePrimaryFormula= rulePrimaryFormula EOF
            {
             newCompositeNode(grammarAccess.getPrimaryFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryFormula=rulePrimaryFormula();

            state._fsp--;

             current =iv_rulePrimaryFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryFormula"


    // $ANTLR start "rulePrimaryFormula"
    // InternalRPL.g:891:1: rulePrimaryFormula returns [EObject current=null] : ( ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_patternInst_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:897:2: ( ( ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:898:2: ( ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:898:2: ( ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRPL.g:899:3: ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:899:3: ( (lv_patternInst_0_0= ruleRequirementPatternInstance ) )
                    // InternalRPL.g:900:4: (lv_patternInst_0_0= ruleRequirementPatternInstance )
                    {
                    // InternalRPL.g:900:4: (lv_patternInst_0_0= ruleRequirementPatternInstance )
                    // InternalRPL.g:901:5: lv_patternInst_0_0= ruleRequirementPatternInstance
                    {

                    					newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getPatternInstRequirementPatternInstanceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_patternInst_0_0=ruleRequirementPatternInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryFormulaRule());
                    					}
                    					set(
                    						current,
                    						"patternInst",
                    						lv_patternInst_0_0,
                    						"su.nsk.iae.rpl.RPL.RequirementPatternInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:919:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:919:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:920:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:924:4: ( (lv_nestedFormula_2_0= ruleFormula ) )
                    // InternalRPL.g:925:5: (lv_nestedFormula_2_0= ruleFormula )
                    {
                    // InternalRPL.g:925:5: (lv_nestedFormula_2_0= ruleFormula )
                    // InternalRPL.g:926:6: lv_nestedFormula_2_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getNestedFormulaFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestedFormula_2_0=ruleFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryFormulaRule());
                    						}
                    						set(
                    							current,
                    							"nestedFormula",
                    							lv_nestedFormula_2_0,
                    							"su.nsk.iae.rpl.RPL.Formula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryFormulaAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryFormula"


    // $ANTLR start "entryRuleFormulaParameterValue"
    // InternalRPL.g:952:1: entryRuleFormulaParameterValue returns [EObject current=null] : iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF ;
    public final EObject entryRuleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameterValue = null;


        try {
            // InternalRPL.g:952:62: (iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF )
            // InternalRPL.g:953:2: iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF
            {
             newCompositeNode(grammarAccess.getFormulaParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaParameterValue=ruleFormulaParameterValue();

            state._fsp--;

             current =iv_ruleFormulaParameterValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulaParameterValue"


    // $ANTLR start "ruleFormulaParameterValue"
    // InternalRPL.g:959:1: ruleFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) ;
    public final EObject ruleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:965:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) )
            // InternalRPL.g:966:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            {
            // InternalRPL.g:966:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            // InternalRPL.g:967:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) )
            {
            // InternalRPL.g:967:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRPL.g:968:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:972:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRPL.g:973:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:973:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:974:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_states_1_0=ruleUpdateStateVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFormulaParameterValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_1_0,
                    	    							"su.nsk.iae.rpl.RPL.UpdateStateVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:996:3: ( (lv_formula_3_0= ruleInnerFormula ) )
            // InternalRPL.g:997:4: (lv_formula_3_0= ruleInnerFormula )
            {
            // InternalRPL.g:997:4: (lv_formula_3_0= ruleInnerFormula )
            // InternalRPL.g:998:5: lv_formula_3_0= ruleInnerFormula
            {

            					newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getFormulaInnerFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_3_0=ruleInnerFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormulaParameterValueRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_3_0,
            						"su.nsk.iae.rpl.RPL.InnerFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaParameterValue"


    // $ANTLR start "entryRuleInnerFormula"
    // InternalRPL.g:1019:1: entryRuleInnerFormula returns [EObject current=null] : iv_ruleInnerFormula= ruleInnerFormula EOF ;
    public final EObject entryRuleInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFormula = null;


        try {
            // InternalRPL.g:1019:53: (iv_ruleInnerFormula= ruleInnerFormula EOF )
            // InternalRPL.g:1020:2: iv_ruleInnerFormula= ruleInnerFormula EOF
            {
             newCompositeNode(grammarAccess.getInnerFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInnerFormula=ruleInnerFormula();

            state._fsp--;

             current =iv_ruleInnerFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInnerFormula"


    // $ANTLR start "ruleInnerFormula"
    // InternalRPL.g:1026:1: ruleInnerFormula returns [EObject current=null] : (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) ;
    public final EObject ruleInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1032:2: ( (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) )
            // InternalRPL.g:1033:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            {
            // InternalRPL.g:1033:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            // InternalRPL.g:1034:3: this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getInnerFormulaAccess().getConjunctionInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ConjunctionInnerFormula_0=ruleConjunctionInnerFormula();

            state._fsp--;


            			current = this_ConjunctionInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1042:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_DISJUNCTION) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPL.g:1043:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) )
            	    {
            	    // InternalRPL.g:1043:4: ()
            	    // InternalRPL.g:1044:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInnerFormulaAccess().getInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_23); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getInnerFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1054:4: ( (lv_right_3_0= ruleInnerFormula ) )
            	    // InternalRPL.g:1055:5: (lv_right_3_0= ruleInnerFormula )
            	    {
            	    // InternalRPL.g:1055:5: (lv_right_3_0= ruleInnerFormula )
            	    // InternalRPL.g:1056:6: lv_right_3_0= ruleInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getInnerFormulaAccess().getRightInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleInnerFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInnerFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.InnerFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInnerFormula"


    // $ANTLR start "entryRuleConjunctionInnerFormula"
    // InternalRPL.g:1078:1: entryRuleConjunctionInnerFormula returns [EObject current=null] : iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF ;
    public final EObject entryRuleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionInnerFormula = null;


        try {
            // InternalRPL.g:1078:64: (iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF )
            // InternalRPL.g:1079:2: iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF
            {
             newCompositeNode(grammarAccess.getConjunctionInnerFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctionInnerFormula=ruleConjunctionInnerFormula();

            state._fsp--;

             current =iv_ruleConjunctionInnerFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionInnerFormula"


    // $ANTLR start "ruleConjunctionInnerFormula"
    // InternalRPL.g:1085:1: ruleConjunctionInnerFormula returns [EObject current=null] : (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) ;
    public final EObject ruleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1091:2: ( (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) )
            // InternalRPL.g:1092:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            {
            // InternalRPL.g:1092:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            // InternalRPL.g:1093:3: this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getPrimaryInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PrimaryInnerFormula_0=rulePrimaryInnerFormula();

            state._fsp--;


            			current = this_PrimaryInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1101:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_CONJUNCTION) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRPL.g:1102:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    {
            	    // InternalRPL.g:1102:4: ()
            	    // InternalRPL.g:1103:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionInnerFormulaAccess().getConnunctionInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_23); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionInnerFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1113:4: ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    // InternalRPL.g:1114:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    {
            	    // InternalRPL.g:1114:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    // InternalRPL.g:1115:6: lv_right_3_0= ruleConjunctionInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getRightConjunctionInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleConjunctionInnerFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionInnerFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.ConjunctionInnerFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionInnerFormula"


    // $ANTLR start "entryRulePrimaryInnerFormula"
    // InternalRPL.g:1137:1: entryRulePrimaryInnerFormula returns [EObject current=null] : iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF ;
    public final EObject entryRulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInnerFormula = null;


        try {
            // InternalRPL.g:1137:60: (iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF )
            // InternalRPL.g:1138:2: iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF
            {
             newCompositeNode(grammarAccess.getPrimaryInnerFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryInnerFormula=rulePrimaryInnerFormula();

            state._fsp--;

             current =iv_rulePrimaryInnerFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryInnerFormula"


    // $ANTLR start "rulePrimaryInnerFormula"
    // InternalRPL.g:1144:1: rulePrimaryInnerFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_patternInst_1_0 = null;

        EObject lv_nestedFormula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1150:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) )
            // InternalRPL.g:1151:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            {
            // InternalRPL.g:1151:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 36:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==24) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_4==25||(LA18_4>=28 && LA18_4<=29)||LA18_4==37) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_2==EOF||(LA18_2>=RULE_DISJUNCTION && LA18_2<=RULE_CONJUNCTION)||LA18_2==27||LA18_2==29||LA18_2==37) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRPL.g:1152:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:1152:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:1153:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:1153:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:1154:5: lv_atomic_0_0= ruleNegationFormula
                    {

                    					newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getAtomicNegationFormulaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atomic_0_0=ruleNegationFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryInnerFormulaRule());
                    					}
                    					set(
                    						current,
                    						"atomic",
                    						lv_atomic_0_0,
                    						"su.nsk.iae.rpl.RPL.NegationFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:1172:3: ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1172:3: ( (lv_patternInst_1_0= ruleRequirementPatternInstance ) )
                    // InternalRPL.g:1173:4: (lv_patternInst_1_0= ruleRequirementPatternInstance )
                    {
                    // InternalRPL.g:1173:4: (lv_patternInst_1_0= ruleRequirementPatternInstance )
                    // InternalRPL.g:1174:5: lv_patternInst_1_0= ruleRequirementPatternInstance
                    {

                    					newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getPatternInstRequirementPatternInstanceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_patternInst_1_0=ruleRequirementPatternInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryInnerFormulaRule());
                    					}
                    					set(
                    						current,
                    						"patternInst",
                    						lv_patternInst_1_0,
                    						"su.nsk.iae.rpl.RPL.RequirementPatternInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:1192:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1192:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    // InternalRPL.g:1193:4: otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryInnerFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRPL.g:1197:4: ( (lv_nestedFormula_3_0= ruleInnerFormula ) )
                    // InternalRPL.g:1198:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    {
                    // InternalRPL.g:1198:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    // InternalRPL.g:1199:6: lv_nestedFormula_3_0= ruleInnerFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getNestedFormulaInnerFormulaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestedFormula_3_0=ruleInnerFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryInnerFormulaRule());
                    						}
                    						set(
                    							current,
                    							"nestedFormula",
                    							lv_nestedFormula_3_0,
                    							"su.nsk.iae.rpl.RPL.InnerFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryInnerFormulaAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryInnerFormula"


    // $ANTLR start "entryRuleNegationFormula"
    // InternalRPL.g:1225:1: entryRuleNegationFormula returns [EObject current=null] : iv_ruleNegationFormula= ruleNegationFormula EOF ;
    public final EObject entryRuleNegationFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationFormula = null;


        try {
            // InternalRPL.g:1225:56: (iv_ruleNegationFormula= ruleNegationFormula EOF )
            // InternalRPL.g:1226:2: iv_ruleNegationFormula= ruleNegationFormula EOF
            {
             newCompositeNode(grammarAccess.getNegationFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationFormula=ruleNegationFormula();

            state._fsp--;

             current =iv_ruleNegationFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationFormula"


    // $ANTLR start "ruleNegationFormula"
    // InternalRPL.g:1232:1: ruleNegationFormula returns [EObject current=null] : ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) ;
    public final EObject ruleNegationFormula() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1238:2: ( ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) )
            // InternalRPL.g:1239:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            {
            // InternalRPL.g:1239:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            // InternalRPL.g:1240:3: ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) )
            {
            // InternalRPL.g:1240:3: ( (lv_neg_0_0= RULE_NEGATION ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NEGATION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRPL.g:1241:4: (lv_neg_0_0= RULE_NEGATION )
                    {
                    // InternalRPL.g:1241:4: (lv_neg_0_0= RULE_NEGATION )
                    // InternalRPL.g:1242:5: lv_neg_0_0= RULE_NEGATION
                    {
                    lv_neg_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_24); 

                    					newLeafNode(lv_neg_0_0, grammarAccess.getNegationFormulaAccess().getNegNEGATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNegationFormulaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"neg",
                    						lv_neg_0_0 != null,
                    						"su.nsk.iae.rpl.RPL.NEGATION");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:1258:3: ( (lv_right_1_0= ruleAtomicFormula ) )
            // InternalRPL.g:1259:4: (lv_right_1_0= ruleAtomicFormula )
            {
            // InternalRPL.g:1259:4: (lv_right_1_0= ruleAtomicFormula )
            // InternalRPL.g:1260:5: lv_right_1_0= ruleAtomicFormula
            {

            					newCompositeNode(grammarAccess.getNegationFormulaAccess().getRightAtomicFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleAtomicFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationFormulaRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"su.nsk.iae.rpl.RPL.AtomicFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationFormula"


    // $ANTLR start "entryRuleAtomicFormula"
    // InternalRPL.g:1281:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // InternalRPL.g:1281:54: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // InternalRPL.g:1282:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
            {
             newCompositeNode(grammarAccess.getAtomicFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicFormula=ruleAtomicFormula();

            state._fsp--;

             current =iv_ruleAtomicFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicFormula"


    // $ANTLR start "ruleAtomicFormula"
    // InternalRPL.g:1288:1: ruleAtomicFormula returns [EObject current=null] : ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) ;
    public final EObject ruleAtomicFormula() throws RecognitionException {
        EObject current = null;

        Token lv_boolLiteral_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_boolTerm_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1294:2: ( ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) )
            // InternalRPL.g:1295:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            {
            // InternalRPL.g:1295:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRPL.g:1296:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:1296:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:1297:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:1297:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:1298:5: lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL
                    {
                    lv_boolLiteral_0_0=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_0_0, grammarAccess.getAtomicFormulaAccess().getBoolLiteralBOOLEAN_LITERALTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"boolLiteral",
                    						lv_boolLiteral_0_0,
                    						"su.nsk.iae.rpl.RPL.BOOLEAN_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:1315:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1315:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalRPL.g:1316:4: otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicFormulaAccess().getFrmKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalRPL.g:1324:4: ( (lv_boolTerm_3_0= ruleTerm ) )
                    // InternalRPL.g:1325:5: (lv_boolTerm_3_0= ruleTerm )
                    {
                    // InternalRPL.g:1325:5: (lv_boolTerm_3_0= ruleTerm )
                    // InternalRPL.g:1326:6: lv_boolTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getAtomicFormulaAccess().getBoolTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_boolTerm_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicFormulaRule());
                    						}
                    						set(
                    							current,
                    							"boolTerm",
                    							lv_boolTerm_3_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:1349:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    {
                    // InternalRPL.g:1349:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    // InternalRPL.g:1350:4: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    {
                    // InternalRPL.g:1350:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRPL.g:1351:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRPL.g:1351:5: (otherlv_5= RULE_ID )
                    // InternalRPL.g:1352:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicFormulaAccess().getFmParamFormulaParameterCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalRPL.g:1363:4: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRPL.g:1364:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_7); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalRPL.g:1368:5: ( (otherlv_7= RULE_ID ) )
                            // InternalRPL.g:1369:6: (otherlv_7= RULE_ID )
                            {
                            // InternalRPL.g:1369:6: (otherlv_7= RULE_ID )
                            // InternalRPL.g:1370:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

                            							newLeafNode(otherlv_7, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_1_0());
                            						

                            }


                            }

                            // InternalRPL.g:1381:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==27) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalRPL.g:1382:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_7); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getAtomicFormulaAccess().getCommaKeyword_2_1_2_0());
                            	    					
                            	    // InternalRPL.g:1386:6: ( (otherlv_9= RULE_ID ) )
                            	    // InternalRPL.g:1387:7: (otherlv_9= RULE_ID )
                            	    {
                            	    // InternalRPL.g:1387:7: (otherlv_9= RULE_ID )
                            	    // InternalRPL.g:1388:8: otherlv_9= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            	    								}
                            	    							
                            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_12); 

                            	    								newLeafNode(otherlv_9, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,29,FOLLOW_2); 

                            					newLeafNode(otherlv_10, grammarAccess.getAtomicFormulaAccess().getRightParenthesisKeyword_2_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicFormula"


    // $ANTLR start "entryRuleRequirementPatternInstance"
    // InternalRPL.g:1410:1: entryRuleRequirementPatternInstance returns [EObject current=null] : iv_ruleRequirementPatternInstance= ruleRequirementPatternInstance EOF ;
    public final EObject entryRuleRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1410:67: (iv_ruleRequirementPatternInstance= ruleRequirementPatternInstance EOF )
            // InternalRPL.g:1411:2: iv_ruleRequirementPatternInstance= ruleRequirementPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getRequirementPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementPatternInstance=ruleRequirementPatternInstance();

            state._fsp--;

             current =iv_ruleRequirementPatternInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementPatternInstance"


    // $ANTLR start "ruleRequirementPatternInstance"
    // InternalRPL.g:1417:1: ruleRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) ;
    public final EObject ruleRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_cParams_4_0 = null;

        EObject lv_cParams_6_0 = null;

        EObject lv_fmParams_9_0 = null;

        EObject lv_fmParams_11_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1423:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) )
            // InternalRPL.g:1424:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            {
            // InternalRPL.g:1424:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            // InternalRPL.g:1425:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')'
            {
            // InternalRPL.g:1425:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1426:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1426:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1427:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getRequirementPatternInstanceAccess().getPatternRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1442:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRPL.g:1443:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1451:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1452:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1452:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1453:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_cParams_4_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_4_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1470:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==27) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRPL.g:1471:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_25); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1475:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1476:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1476:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1477:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_cParams_6_0=ruleTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_6_0,
                    	    								"su.nsk.iae.rpl.RPL.Term");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1496:3: (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRPL.g:1497:4: otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementPatternInstanceAccess().getFormulasKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:1505:4: ( (lv_fmParams_9_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1506:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1506:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1507:6: lv_fmParams_9_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_fmParams_9_0=ruleFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_9_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1524:4: (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==27) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRPL.g:1525:5: otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_29); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRequirementPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:1529:5: ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1530:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1530:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1531:7: lv_fmParams_11_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_fmParams_11_0=ruleFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_11_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1550:3: (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRPL.g:1551:4: otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementPatternInstanceAccess().getFinalKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1559:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRPL.g:1560:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRPL.g:1560:5: (otherlv_14= RULE_ID )
                    // InternalRPL.g:1561:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_14, grammarAccess.getRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1572:4: (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==38) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalRPL.g:1573:5: otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,38,FOLLOW_10); 

                            					newLeafNode(otherlv_15, grammarAccess.getRequirementPatternInstanceAccess().getCurrentKeyword_4_3_0());
                            				
                            otherlv_16=(Token)match(input,26,FOLLOW_7); 

                            					newLeafNode(otherlv_16, grammarAccess.getRequirementPatternInstanceAccess().getColonKeyword_4_3_1());
                            				
                            // InternalRPL.g:1581:5: ( (otherlv_17= RULE_ID ) )
                            // InternalRPL.g:1582:6: (otherlv_17= RULE_ID )
                            {
                            // InternalRPL.g:1582:6: (otherlv_17= RULE_ID )
                            // InternalRPL.g:1583:7: otherlv_17= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_21); 

                            							newLeafNode(otherlv_17, grammarAccess.getRequirementPatternInstanceAccess().getCurStateUpdateStateVariableCrossReference_4_3_2_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRequirementPatternInstanceAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementPatternInstance"


    // $ANTLR start "entryRuleFutureRequirementPattern"
    // InternalRPL.g:1604:1: entryRuleFutureRequirementPattern returns [EObject current=null] : iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF ;
    public final EObject entryRuleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureRequirementPattern = null;


        try {
            // InternalRPL.g:1604:65: (iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF )
            // InternalRPL.g:1605:2: iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF
            {
             newCompositeNode(grammarAccess.getFutureRequirementPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFutureRequirementPattern=ruleFutureRequirementPattern();

            state._fsp--;

             current =iv_ruleFutureRequirementPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFutureRequirementPattern"


    // $ANTLR start "ruleFutureRequirementPattern"
    // InternalRPL.g:1611:1: ruleFutureRequirementPattern returns [EObject current=null] : (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) ;
    public final EObject ruleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fmParams_11_0 = null;

        EObject lv_fmParams_13_0 = null;

        AntlrDatatypeRuleToken lv_file_16_0 = null;

        EObject lv_lessas_19_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1617:2: ( (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:1618:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:1618:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:1619:3: otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureRequirementPatternAccess().getFuturereqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:1627:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:1628:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:1628:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:1629:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFutureRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:1649:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRPL.g:1650:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1658:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:1659:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:1659:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:1660:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1677:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==27) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRPL.g:1678:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1682:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:1683:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:1683:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:1684:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1703:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRPL.g:1704:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:1712:4: ( (lv_fmParams_11_0= ruleFormulaParameter ) )
                    // InternalRPL.g:1713:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:1713:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    // InternalRPL.g:1714:6: lv_fmParams_11_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_11_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1731:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==27) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRPL.g:1732:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:1736:5: ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:1737:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:1737:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    // InternalRPL.g:1738:7: lv_fmParams_13_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_13_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_14, grammarAccess.getFutureRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getFutureRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:1765:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:1766:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:1766:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:1767:5: lv_file_16_0= ruleFilePath
            {

            					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFileFilePathParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_file_16_0=ruleFilePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_16_0,
            						"su.nsk.iae.rpl.RPL.FilePath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getFutureRequirementPatternAccess().getWithKeyword_9());
            		
            // InternalRPL.g:1788:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:1789:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:1789:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:1790:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_18, grammarAccess.getFutureRequirementPatternAccess().getExtraInvPatternFutureExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:1801:3: ( (lv_lessas_19_0= ruleFutureLemmas ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRPL.g:1802:4: (lv_lessas_19_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:1802:4: (lv_lessas_19_0= ruleFutureLemmas )
                    // InternalRPL.g:1803:5: lv_lessas_19_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getLessasFutureLemmasParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lessas_19_0=ruleFutureLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lessas",
                    						lv_lessas_19_0,
                    						"su.nsk.iae.rpl.RPL.FutureLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getFutureRequirementPatternAccess().getSemicolonKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFutureRequirementPattern"


    // $ANTLR start "entryRulePastRequirementPattern"
    // InternalRPL.g:1828:1: entryRulePastRequirementPattern returns [EObject current=null] : iv_rulePastRequirementPattern= rulePastRequirementPattern EOF ;
    public final EObject entryRulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastRequirementPattern = null;


        try {
            // InternalRPL.g:1828:63: (iv_rulePastRequirementPattern= rulePastRequirementPattern EOF )
            // InternalRPL.g:1829:2: iv_rulePastRequirementPattern= rulePastRequirementPattern EOF
            {
             newCompositeNode(grammarAccess.getPastRequirementPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastRequirementPattern=rulePastRequirementPattern();

            state._fsp--;

             current =iv_rulePastRequirementPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePastRequirementPattern"


    // $ANTLR start "rulePastRequirementPattern"
    // InternalRPL.g:1835:1: rulePastRequirementPattern returns [EObject current=null] : (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) ;
    public final EObject rulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fmParams_11_0 = null;

        EObject lv_fmParams_13_0 = null;

        AntlrDatatypeRuleToken lv_file_16_0 = null;

        EObject lv_lemmas_19_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1841:2: ( (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:1842:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:1842:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:1843:3: otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPastRequirementPatternAccess().getPastreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPastRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:1851:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:1852:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:1852:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:1853:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPastRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPastRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:1873:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRPL.g:1874:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1882:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:1883:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:1883:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:1884:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1901:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRPL.g:1902:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1906:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:1907:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:1907:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:1908:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1927:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPL.g:1928:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:1936:4: ( (lv_fmParams_11_0= ruleFormulaParameter ) )
                    // InternalRPL.g:1937:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:1937:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    // InternalRPL.g:1938:6: lv_fmParams_11_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_11_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1955:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==27) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRPL.g:1956:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:1960:5: ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:1961:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:1961:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    // InternalRPL.g:1962:7: lv_fmParams_13_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_13_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_32); 

            			newLeafNode(otherlv_14, grammarAccess.getPastRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getPastRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:1989:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:1990:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:1990:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:1991:5: lv_file_16_0= ruleFilePath
            {

            					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFileFilePathParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_file_16_0=ruleFilePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
            					}
            					set(
            						current,
            						"file",
            						lv_file_16_0,
            						"su.nsk.iae.rpl.RPL.FilePath");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getPastRequirementPatternAccess().getWithKeyword_9());
            		
            // InternalRPL.g:2012:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:2013:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:2013:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:2014:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_18, grammarAccess.getPastRequirementPatternAccess().getExtraInvPatternPastExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:2025:3: ( (lv_lemmas_19_0= rulePastLemmas ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRPL.g:2026:4: (lv_lemmas_19_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2026:4: (lv_lemmas_19_0= rulePastLemmas )
                    // InternalRPL.g:2027:5: lv_lemmas_19_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getLemmasPastLemmasParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lemmas_19_0=rulePastLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_19_0,
                    						"su.nsk.iae.rpl.RPL.PastLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPastRequirementPatternAccess().getSemicolonKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePastRequirementPattern"


    // $ANTLR start "entryRuleFutureExtraInvariantPattern"
    // InternalRPL.g:2052:1: entryRuleFutureExtraInvariantPattern returns [EObject current=null] : iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF ;
    public final EObject entryRuleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2052:68: (iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF )
            // InternalRPL.g:2053:2: iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF
            {
             newCompositeNode(grammarAccess.getFutureExtraInvariantPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFutureExtraInvariantPattern=ruleFutureExtraInvariantPattern();

            state._fsp--;

             current =iv_ruleFutureExtraInvariantPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFutureExtraInvariantPattern"


    // $ANTLR start "ruleFutureExtraInvariantPattern"
    // InternalRPL.g:2059:1: ruleFutureExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) ;
    public final EObject ruleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_fmParams_16_0 = null;

        EObject lv_fmParams_18_0 = null;

        AntlrDatatypeRuleToken lv_file_21_0 = null;

        EObject lv_lemmas_22_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2065:2: ( (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2066:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2066:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2067:3: otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureExtraInvariantPatternAccess().getFutureeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2075:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2076:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2076:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2077:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFutureExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2097:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRPL.g:2098:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2106:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2107:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2107:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2108:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2125:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==27) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalRPL.g:2126:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2130:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2131:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2131:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2132:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2151:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRPL.g:2152:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2160:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2161:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2161:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2162:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_fnParams_11_0=ruleFunctionalParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fnParams",
                    							lv_fnParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2179:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==27) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRPL.g:2180:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2184:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2185:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2185:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2186:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_fnParams_13_0=ruleFunctionalParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fnParams",
                    	    								lv_fnParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2205:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRPL.g:2206:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getFutureExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2214:4: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2215:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2215:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    // InternalRPL.g:2216:6: lv_fmParams_16_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_16_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_16_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2233:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==27) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalRPL.g:2234:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2238:5: ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2239:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2239:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2240:7: lv_fmParams_18_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_18_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_18_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_35); 

            			newLeafNode(otherlv_19, grammarAccess.getFutureExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2263:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRPL.g:2264:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getFutureExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2268:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2269:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2269:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2270:6: lv_file_21_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFileFilePathParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_file_21_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    						}
                    						set(
                    							current,
                    							"file",
                    							lv_file_21_0,
                    							"su.nsk.iae.rpl.RPL.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:2288:3: ( (lv_lemmas_22_0= ruleFutureLemmas ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==54) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRPL.g:2289:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2289:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    // InternalRPL.g:2290:5: lv_lemmas_22_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getLemmasFutureLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lemmas_22_0=ruleFutureLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_22_0,
                    						"su.nsk.iae.rpl.RPL.FutureLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getFutureExtraInvariantPatternAccess().getSemicolonKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFutureExtraInvariantPattern"


    // $ANTLR start "entryRulePastExtraInvariantPattern"
    // InternalRPL.g:2315:1: entryRulePastExtraInvariantPattern returns [EObject current=null] : iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF ;
    public final EObject entryRulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2315:66: (iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF )
            // InternalRPL.g:2316:2: iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF
            {
             newCompositeNode(grammarAccess.getPastExtraInvariantPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastExtraInvariantPattern=rulePastExtraInvariantPattern();

            state._fsp--;

             current =iv_rulePastExtraInvariantPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePastExtraInvariantPattern"


    // $ANTLR start "rulePastExtraInvariantPattern"
    // InternalRPL.g:2322:1: rulePastExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) ;
    public final EObject rulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_fmParams_16_0 = null;

        EObject lv_fmParams_18_0 = null;

        AntlrDatatypeRuleToken lv_file_21_0 = null;

        EObject lv_lemmas_22_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2328:2: ( (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2329:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2329:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2330:3: otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternAccess().getPasteinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2338:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2339:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2339:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2340:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPastExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2360:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRPL.g:2361:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2369:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2370:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2370:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2371:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2388:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalRPL.g:2389:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2393:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2394:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2394:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2395:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2414:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRPL.g:2415:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2423:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2424:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2424:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2425:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_fnParams_11_0=ruleFunctionalParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fnParams",
                    							lv_fnParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2442:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==27) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalRPL.g:2443:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2447:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2448:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2448:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2449:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_fnParams_13_0=ruleFunctionalParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fnParams",
                    	    								lv_fnParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2468:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRPL.g:2469:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getPastExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2477:4: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2478:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2478:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    // InternalRPL.g:2479:6: lv_fmParams_16_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_16_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_16_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2496:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==27) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRPL.g:2497:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2501:5: ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2502:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2502:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2503:7: lv_fmParams_18_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_18_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_18_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_35); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2526:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRPL.g:2527:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getPastExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2531:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2532:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2532:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2533:6: lv_file_21_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFileFilePathParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_file_21_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    						}
                    						set(
                    							current,
                    							"file",
                    							lv_file_21_0,
                    							"su.nsk.iae.rpl.RPL.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:2551:3: ( (lv_lemmas_22_0= rulePastLemmas ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRPL.g:2552:4: (lv_lemmas_22_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2552:4: (lv_lemmas_22_0= rulePastLemmas )
                    // InternalRPL.g:2553:5: lv_lemmas_22_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getLemmasPastLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lemmas_22_0=rulePastLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_22_0,
                    						"su.nsk.iae.rpl.RPL.PastLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getPastExtraInvariantPatternAccess().getSemicolonKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePastExtraInvariantPattern"


    // $ANTLR start "entryRuleDerivedExtraInvariantPattern"
    // InternalRPL.g:2578:1: entryRuleDerivedExtraInvariantPattern returns [EObject current=null] : iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF ;
    public final EObject entryRuleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2578:69: (iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF )
            // InternalRPL.g:2579:2: iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF
            {
             newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedExtraInvariantPattern=ruleDerivedExtraInvariantPattern();

            state._fsp--;

             current =iv_ruleDerivedExtraInvariantPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivedExtraInvariantPattern"


    // $ANTLR start "ruleDerivedExtraInvariantPattern"
    // InternalRPL.g:2585:1: ruleDerivedExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleDerivedLemmas ) )? otherlv_23= ';' ) ;
    public final EObject ruleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_fmParams_16_0 = null;

        EObject lv_fmParams_18_0 = null;

        AntlrDatatypeRuleToken lv_file_21_0 = null;

        EObject lv_lemmas_22_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2591:2: ( (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleDerivedLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2592:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleDerivedLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2592:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleDerivedLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2593:3: otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleDerivedLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getDerivedeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2601:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2602:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2602:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2603:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2623:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRPL.g:2624:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2632:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2633:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2633:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2634:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_cParams_6_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_6_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2651:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==27) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalRPL.g:2652:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2656:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2657:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2657:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2658:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_cParams_8_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_8_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2677:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==42) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRPL.g:2678:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2686:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2687:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2687:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2688:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_fnParams_11_0=ruleFunctionalParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fnParams",
                    							lv_fnParams_11_0,
                    							"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2705:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==27) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalRPL.g:2706:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2710:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2711:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2711:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2712:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_fnParams_13_0=ruleFunctionalParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fnParams",
                    	    								lv_fnParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2731:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRPL.g:2732:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2740:4: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2741:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2741:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    // InternalRPL.g:2742:6: lv_fmParams_16_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_fmParams_16_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_16_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2759:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==27) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalRPL.g:2760:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2764:5: ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2765:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2765:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2766:7: lv_fmParams_18_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_fmParams_18_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_18_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_35); 

            			newLeafNode(otherlv_19, grammarAccess.getDerivedExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2789:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRPL.g:2790:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getDerivedExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2794:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2795:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2795:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2796:6: lv_file_21_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFileFilePathParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_file_21_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						set(
                    							current,
                    							"file",
                    							lv_file_21_0,
                    							"su.nsk.iae.rpl.RPL.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:2814:3: ( (lv_lemmas_22_0= ruleDerivedLemmas ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRPL.g:2815:4: (lv_lemmas_22_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:2815:4: (lv_lemmas_22_0= ruleDerivedLemmas )
                    // InternalRPL.g:2816:5: lv_lemmas_22_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_lemmas_22_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_22_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getDerivedExtraInvariantPatternAccess().getSemicolonKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivedExtraInvariantPattern"


    // $ANTLR start "entryRuleFilePath"
    // InternalRPL.g:2841:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalRPL.g:2841:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalRPL.g:2842:2: iv_ruleFilePath= ruleFilePath EOF
            {
             newCompositeNode(grammarAccess.getFilePathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilePath=ruleFilePath();

            state._fsp--;

             current =iv_ruleFilePath.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilePath"


    // $ANTLR start "ruleFilePath"
    // InternalRPL.g:2848:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Dir_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:2854:2: ( ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) )
            // InternalRPL.g:2855:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            {
            // InternalRPL.g:2855:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            // InternalRPL.g:2856:3: (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID
            {
            // InternalRPL.g:2856:3: (kw= '/' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRPL.g:2857:4: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRPL.g:2863:3: (this_Dir_1= ruleDir kw= '/' )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==45) ) {
                        alt64=1;
                    }


                }
                else if ( (LA64_0==35||LA64_0==46) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalRPL.g:2864:4: this_Dir_1= ruleDir kw= '/'
            	    {

            	    				newCompositeNode(grammarAccess.getFilePathAccess().getDirParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_37);
            	    this_Dir_1=ruleDir();

            	    state._fsp--;


            	    				current.merge(this_Dir_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,45,FOLLOW_36); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_3);
            		

            			newLeafNode(this_ID_3, grammarAccess.getFilePathAccess().getIDTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilePath"


    // $ANTLR start "entryRuleDir"
    // InternalRPL.g:2891:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // InternalRPL.g:2891:43: (iv_ruleDir= ruleDir EOF )
            // InternalRPL.g:2892:2: iv_ruleDir= ruleDir EOF
            {
             newCompositeNode(grammarAccess.getDirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDir=ruleDir();

            state._fsp--;

             current =iv_ruleDir.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDir"


    // $ANTLR start "ruleDir"
    // InternalRPL.g:2898:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRPL.g:2904:2: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) )
            // InternalRPL.g:2905:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            {
            // InternalRPL.g:2905:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case 35:
                {
                alt65=2;
                }
                break;
            case 46:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalRPL.g:2906:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:2914:3: kw= '.'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:2920:3: kw= '..'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopFullStopKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDir"


    // $ANTLR start "entryRuleTerm"
    // InternalRPL.g:2929:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalRPL.g:2929:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalRPL.g:2930:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalRPL.g:2936:1: ruleTerm returns [EObject current=null] : (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2942:2: ( (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalRPL.g:2943:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalRPL.g:2943:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalRPL.g:2944:3: this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getConjunctionTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ConjunctionTerm_0=ruleConjunctionTerm();

            state._fsp--;


            			current = this_ConjunctionTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:2952:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_DISJUNCTION) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalRPL.g:2953:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalRPL.g:2953:4: ()
            	    // InternalRPL.g:2954:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_25); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getTermAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:2964:4: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalRPL.g:2965:5: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalRPL.g:2965:5: (lv_right_3_0= ruleTerm )
            	    // InternalRPL.g:2966:6: lv_right_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleConjunctionTerm"
    // InternalRPL.g:2988:1: entryRuleConjunctionTerm returns [EObject current=null] : iv_ruleConjunctionTerm= ruleConjunctionTerm EOF ;
    public final EObject entryRuleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionTerm = null;


        try {
            // InternalRPL.g:2988:56: (iv_ruleConjunctionTerm= ruleConjunctionTerm EOF )
            // InternalRPL.g:2989:2: iv_ruleConjunctionTerm= ruleConjunctionTerm EOF
            {
             newCompositeNode(grammarAccess.getConjunctionTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctionTerm=ruleConjunctionTerm();

            state._fsp--;

             current =iv_ruleConjunctionTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionTerm"


    // $ANTLR start "ruleConjunctionTerm"
    // InternalRPL.g:2995:1: ruleConjunctionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) ;
    public final EObject ruleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3001:2: ( (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) )
            // InternalRPL.g:3002:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            {
            // InternalRPL.g:3002:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            // InternalRPL.g:3003:3: this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3011:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_CONJUNCTION) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalRPL.g:3012:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    {
            	    // InternalRPL.g:3012:4: ()
            	    // InternalRPL.g:3013:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionTermAccess().getConjunctionTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_25); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionTermAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3023:4: ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    // InternalRPL.g:3024:5: (lv_right_3_0= ruleConjunctionTerm )
            	    {
            	    // InternalRPL.g:3024:5: (lv_right_3_0= ruleConjunctionTerm )
            	    // InternalRPL.g:3025:6: lv_right_3_0= ruleConjunctionTerm
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionTermAccess().getRightConjunctionTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleConjunctionTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.ConjunctionTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionTerm"


    // $ANTLR start "entryRuleNegationTerm"
    // InternalRPL.g:3047:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalRPL.g:3047:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalRPL.g:3048:2: iv_ruleNegationTerm= ruleNegationTerm EOF
            {
             newCompositeNode(grammarAccess.getNegationTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegationTerm=ruleNegationTerm();

            state._fsp--;

             current =iv_ruleNegationTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegationTerm"


    // $ANTLR start "ruleNegationTerm"
    // InternalRPL.g:3054:1: ruleNegationTerm returns [EObject current=null] : (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token this_NEGATION_1=null;
        EObject this_EqTerm_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3060:2: ( (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) )
            // InternalRPL.g:3061:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            {
            // InternalRPL.g:3061:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==RULE_BOOLEAN_LITERAL||(LA68_0>=RULE_INTEGER && LA68_0<=RULE_REAL)||LA68_0==24||LA68_0==49) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_NEGATION) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalRPL.g:3062:3: this_EqTerm_0= ruleEqTerm
                    {

                    			newCompositeNode(grammarAccess.getNegationTermAccess().getEqTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqTerm_0=ruleEqTerm();

                    state._fsp--;


                    			current = this_EqTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3071:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    {
                    // InternalRPL.g:3071:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    // InternalRPL.g:3072:4: this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) )
                    {
                    this_NEGATION_1=(Token)match(input,RULE_NEGATION,FOLLOW_38); 

                    				newLeafNode(this_NEGATION_1, grammarAccess.getNegationTermAccess().getNEGATIONTerminalRuleCall_1_0());
                    			
                    // InternalRPL.g:3076:4: ( (lv_right_2_0= ruleEqTerm ) )
                    // InternalRPL.g:3077:5: (lv_right_2_0= ruleEqTerm )
                    {
                    // InternalRPL.g:3077:5: (lv_right_2_0= ruleEqTerm )
                    // InternalRPL.g:3078:6: lv_right_2_0= ruleEqTerm
                    {

                    						newCompositeNode(grammarAccess.getNegationTermAccess().getRightEqTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleEqTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationTermRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.rpl.RPL.EqTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegationTerm"


    // $ANTLR start "entryRuleEqTerm"
    // InternalRPL.g:3100:1: entryRuleEqTerm returns [EObject current=null] : iv_ruleEqTerm= ruleEqTerm EOF ;
    public final EObject entryRuleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqTerm = null;


        try {
            // InternalRPL.g:3100:47: (iv_ruleEqTerm= ruleEqTerm EOF )
            // InternalRPL.g:3101:2: iv_ruleEqTerm= ruleEqTerm EOF
            {
             newCompositeNode(grammarAccess.getEqTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqTerm=ruleEqTerm();

            state._fsp--;

             current =iv_ruleEqTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqTerm"


    // $ANTLR start "ruleEqTerm"
    // InternalRPL.g:3107:1: ruleEqTerm returns [EObject current=null] : (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) ;
    public final EObject ruleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompareTerm_0 = null;

        Enumerator lv_eqPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3113:2: ( (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) )
            // InternalRPL.g:3114:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            {
            // InternalRPL.g:3114:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            // InternalRPL.g:3115:3: this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqTermAccess().getCompareTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_CompareTerm_0=ruleCompareTerm();

            state._fsp--;


            			current = this_CompareTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3123:3: ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==71) ) {
                    alt69=1;
                }
                else if ( (LA69_0==72) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalRPL.g:3124:4: () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) )
            	    {
            	    // InternalRPL.g:3124:4: ()
            	    // InternalRPL.g:3125:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqTermAccess().getEqTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3131:4: ( (lv_eqPred_2_0= ruleEqPredicate ) )
            	    // InternalRPL.g:3132:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    {
            	    // InternalRPL.g:3132:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    // InternalRPL.g:3133:6: lv_eqPred_2_0= ruleEqPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getEqPredEqPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_eqPred_2_0=ruleEqPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"eqPred",
            	    							lv_eqPred_2_0,
            	    							"su.nsk.iae.rpl.RPL.EqPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRPL.g:3150:4: ( (lv_right_3_0= ruleEqTerm ) )
            	    // InternalRPL.g:3151:5: (lv_right_3_0= ruleEqTerm )
            	    {
            	    // InternalRPL.g:3151:5: (lv_right_3_0= ruleEqTerm )
            	    // InternalRPL.g:3152:6: lv_right_3_0= ruleEqTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getRightEqTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleEqTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.EqTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqTerm"


    // $ANTLR start "entryRuleCompareTerm"
    // InternalRPL.g:3174:1: entryRuleCompareTerm returns [EObject current=null] : iv_ruleCompareTerm= ruleCompareTerm EOF ;
    public final EObject entryRuleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareTerm = null;


        try {
            // InternalRPL.g:3174:52: (iv_ruleCompareTerm= ruleCompareTerm EOF )
            // InternalRPL.g:3175:2: iv_ruleCompareTerm= ruleCompareTerm EOF
            {
             newCompositeNode(grammarAccess.getCompareTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareTerm=ruleCompareTerm();

            state._fsp--;

             current =iv_ruleCompareTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareTerm"


    // $ANTLR start "ruleCompareTerm"
    // InternalRPL.g:3181:1: ruleCompareTerm returns [EObject current=null] : (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) ;
    public final EObject ruleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AddTerm_0 = null;

        Enumerator lv_compPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3187:2: ( (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) )
            // InternalRPL.g:3188:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            {
            // InternalRPL.g:3188:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            // InternalRPL.g:3189:3: this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareTermAccess().getAddTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_AddTerm_0=ruleAddTerm();

            state._fsp--;


            			current = this_AddTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3197:3: ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            loop70:
            do {
                int alt70=2;
                switch ( input.LA(1) ) {
                case 73:
                    {
                    alt70=1;
                    }
                    break;
                case 74:
                    {
                    alt70=1;
                    }
                    break;
                case 75:
                    {
                    alt70=1;
                    }
                    break;
                case 76:
                    {
                    alt70=1;
                    }
                    break;

                }

                switch (alt70) {
            	case 1 :
            	    // InternalRPL.g:3198:4: () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) )
            	    {
            	    // InternalRPL.g:3198:4: ()
            	    // InternalRPL.g:3199:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareTermAccess().getCompareTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3205:4: ( (lv_compPred_2_0= ruleCompPredicate ) )
            	    // InternalRPL.g:3206:5: (lv_compPred_2_0= ruleCompPredicate )
            	    {
            	    // InternalRPL.g:3206:5: (lv_compPred_2_0= ruleCompPredicate )
            	    // InternalRPL.g:3207:6: lv_compPred_2_0= ruleCompPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getCompPredCompPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_compPred_2_0=ruleCompPredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compPred",
            	    							lv_compPred_2_0,
            	    							"su.nsk.iae.rpl.RPL.CompPredicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRPL.g:3224:4: ( (lv_right_3_0= ruleCompareTerm ) )
            	    // InternalRPL.g:3225:5: (lv_right_3_0= ruleCompareTerm )
            	    {
            	    // InternalRPL.g:3225:5: (lv_right_3_0= ruleCompareTerm )
            	    // InternalRPL.g:3226:6: lv_right_3_0= ruleCompareTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getRightCompareTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleCompareTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.CompareTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareTerm"


    // $ANTLR start "entryRuleAddTerm"
    // InternalRPL.g:3248:1: entryRuleAddTerm returns [EObject current=null] : iv_ruleAddTerm= ruleAddTerm EOF ;
    public final EObject entryRuleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTerm = null;


        try {
            // InternalRPL.g:3248:48: (iv_ruleAddTerm= ruleAddTerm EOF )
            // InternalRPL.g:3249:2: iv_ruleAddTerm= ruleAddTerm EOF
            {
             newCompositeNode(grammarAccess.getAddTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddTerm=ruleAddTerm();

            state._fsp--;

             current =iv_ruleAddTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddTerm"


    // $ANTLR start "ruleAddTerm"
    // InternalRPL.g:3255:1: ruleAddTerm returns [EObject current=null] : (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) ;
    public final EObject ruleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject this_MulTerm_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3261:2: ( (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) )
            // InternalRPL.g:3262:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            {
            // InternalRPL.g:3262:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            // InternalRPL.g:3263:3: this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddTermAccess().getMulTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_MulTerm_0=ruleMulTerm();

            state._fsp--;


            			current = this_MulTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3271:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==77) ) {
                    alt71=1;
                }
                else if ( (LA71_0==49) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalRPL.g:3272:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) )
            	    {
            	    // InternalRPL.g:3272:4: ()
            	    // InternalRPL.g:3273:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddTermAccess().getAddTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3279:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalRPL.g:3280:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalRPL.g:3280:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalRPL.g:3281:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_addOp_2_0=ruleAddOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"addOp",
            	    							lv_addOp_2_0,
            	    							"su.nsk.iae.rpl.RPL.AddOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRPL.g:3298:4: ( (lv_right_3_0= ruleAddTerm ) )
            	    // InternalRPL.g:3299:5: (lv_right_3_0= ruleAddTerm )
            	    {
            	    // InternalRPL.g:3299:5: (lv_right_3_0= ruleAddTerm )
            	    // InternalRPL.g:3300:6: lv_right_3_0= ruleAddTerm
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getRightAddTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleAddTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.AddTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddTerm"


    // $ANTLR start "entryRuleMulTerm"
    // InternalRPL.g:3322:1: entryRuleMulTerm returns [EObject current=null] : iv_ruleMulTerm= ruleMulTerm EOF ;
    public final EObject entryRuleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulTerm = null;


        try {
            // InternalRPL.g:3322:48: (iv_ruleMulTerm= ruleMulTerm EOF )
            // InternalRPL.g:3323:2: iv_ruleMulTerm= ruleMulTerm EOF
            {
             newCompositeNode(grammarAccess.getMulTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulTerm=ruleMulTerm();

            state._fsp--;

             current =iv_ruleMulTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulTerm"


    // $ANTLR start "ruleMulTerm"
    // InternalRPL.g:3329:1: ruleMulTerm returns [EObject current=null] : (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) ;
    public final EObject ruleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PowerTerm_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3335:2: ( (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) )
            // InternalRPL.g:3336:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            {
            // InternalRPL.g:3336:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            // InternalRPL.g:3337:3: this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulTermAccess().getPowerTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_PowerTerm_0=rulePowerTerm();

            state._fsp--;


            			current = this_PowerTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3345:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            loop72:
            do {
                int alt72=2;
                switch ( input.LA(1) ) {
                case 78:
                    {
                    alt72=1;
                    }
                    break;
                case 45:
                    {
                    alt72=1;
                    }
                    break;
                case 79:
                    {
                    alt72=1;
                    }
                    break;

                }

                switch (alt72) {
            	case 1 :
            	    // InternalRPL.g:3346:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) )
            	    {
            	    // InternalRPL.g:3346:4: ()
            	    // InternalRPL.g:3347:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulTermAccess().getMulTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3353:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalRPL.g:3354:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalRPL.g:3354:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalRPL.g:3355:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_mulOp_2_0=ruleMulOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"mulOp",
            	    							lv_mulOp_2_0,
            	    							"su.nsk.iae.rpl.RPL.MulOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalRPL.g:3372:4: ( (lv_right_3_0= ruleMulTerm ) )
            	    // InternalRPL.g:3373:5: (lv_right_3_0= ruleMulTerm )
            	    {
            	    // InternalRPL.g:3373:5: (lv_right_3_0= ruleMulTerm )
            	    // InternalRPL.g:3374:6: lv_right_3_0= ruleMulTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getRightMulTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleMulTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.MulTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulTerm"


    // $ANTLR start "entryRulePowerTerm"
    // InternalRPL.g:3396:1: entryRulePowerTerm returns [EObject current=null] : iv_rulePowerTerm= rulePowerTerm EOF ;
    public final EObject entryRulePowerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerTerm = null;


        try {
            // InternalRPL.g:3396:50: (iv_rulePowerTerm= rulePowerTerm EOF )
            // InternalRPL.g:3397:2: iv_rulePowerTerm= rulePowerTerm EOF
            {
             newCompositeNode(grammarAccess.getPowerTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerTerm=rulePowerTerm();

            state._fsp--;

             current =iv_rulePowerTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePowerTerm"


    // $ANTLR start "rulePowerTerm"
    // InternalRPL.g:3403:1: rulePowerTerm returns [EObject current=null] : (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) ;
    public final EObject rulePowerTerm() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3409:2: ( (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) )
            // InternalRPL.g:3410:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            {
            // InternalRPL.g:3410:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            // InternalRPL.g:3411:3: this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerTermAccess().getUnaryTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_UnaryTerm_0=ruleUnaryTerm();

            state._fsp--;


            			current = this_UnaryTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3419:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_POWER_OPERATOR) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalRPL.g:3420:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) )
            	    {
            	    // InternalRPL.g:3420:4: ()
            	    // InternalRPL.g:3421:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerTermAccess().getPowerTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_38); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerTermAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3431:4: ( (lv_right_3_0= rulePowerTerm ) )
            	    // InternalRPL.g:3432:5: (lv_right_3_0= rulePowerTerm )
            	    {
            	    // InternalRPL.g:3432:5: (lv_right_3_0= rulePowerTerm )
            	    // InternalRPL.g:3433:6: lv_right_3_0= rulePowerTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPowerTermAccess().getRightPowerTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_right_3_0=rulePowerTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowerTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.PowerTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePowerTerm"


    // $ANTLR start "entryRuleUnaryTerm"
    // InternalRPL.g:3455:1: entryRuleUnaryTerm returns [EObject current=null] : iv_ruleUnaryTerm= ruleUnaryTerm EOF ;
    public final EObject entryRuleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTerm = null;


        try {
            // InternalRPL.g:3455:50: (iv_ruleUnaryTerm= ruleUnaryTerm EOF )
            // InternalRPL.g:3456:2: iv_ruleUnaryTerm= ruleUnaryTerm EOF
            {
             newCompositeNode(grammarAccess.getUnaryTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryTerm=ruleUnaryTerm();

            state._fsp--;

             current =iv_ruleUnaryTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryTerm"


    // $ANTLR start "ruleUnaryTerm"
    // InternalRPL.g:3462:1: ruleUnaryTerm returns [EObject current=null] : (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) ;
    public final EObject ruleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryTerm_0 = null;

        Enumerator lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3468:2: ( (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) )
            // InternalRPL.g:3469:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            {
            // InternalRPL.g:3469:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==49) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case RULE_BOOLEAN_LITERAL:
                case 24:
                case 49:
                    {
                    alt74=2;
                    }
                    break;
                case RULE_INTEGER:
                    {
                    alt74=1;
                    }
                    break;
                case RULE_REAL:
                    {
                    alt74=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA74_0==RULE_ID||LA74_0==RULE_BOOLEAN_LITERAL||(LA74_0>=RULE_INTEGER && LA74_0<=RULE_REAL)||LA74_0==24) ) {
                alt74=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalRPL.g:3470:3: this_PrimaryTerm_0= rulePrimaryTerm
                    {

                    			newCompositeNode(grammarAccess.getUnaryTermAccess().getPrimaryTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryTerm_0=rulePrimaryTerm();

                    state._fsp--;


                    			current = this_PrimaryTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3479:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    {
                    // InternalRPL.g:3479:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    // InternalRPL.g:3480:4: ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) )
                    {
                    // InternalRPL.g:3480:4: ( (lv_unOp_1_0= ruleUnMinus ) )
                    // InternalRPL.g:3481:5: (lv_unOp_1_0= ruleUnMinus )
                    {
                    // InternalRPL.g:3481:5: (lv_unOp_1_0= ruleUnMinus )
                    // InternalRPL.g:3482:6: lv_unOp_1_0= ruleUnMinus
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getUnOpUnMinusEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_unOp_1_0=ruleUnMinus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryTermRule());
                    						}
                    						set(
                    							current,
                    							"unOp",
                    							lv_unOp_1_0,
                    							"su.nsk.iae.rpl.RPL.UnMinus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:3499:4: ( (lv_right_2_0= rulePrimaryTerm ) )
                    // InternalRPL.g:3500:5: (lv_right_2_0= rulePrimaryTerm )
                    {
                    // InternalRPL.g:3500:5: (lv_right_2_0= rulePrimaryTerm )
                    // InternalRPL.g:3501:6: lv_right_2_0= rulePrimaryTerm
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getRightPrimaryTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryTermRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.rpl.RPL.PrimaryTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryTerm"


    // $ANTLR start "entryRulePrimaryTerm"
    // InternalRPL.g:3523:1: entryRulePrimaryTerm returns [EObject current=null] : iv_rulePrimaryTerm= rulePrimaryTerm EOF ;
    public final EObject entryRulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryTerm = null;


        try {
            // InternalRPL.g:3523:52: (iv_rulePrimaryTerm= rulePrimaryTerm EOF )
            // InternalRPL.g:3524:2: iv_rulePrimaryTerm= rulePrimaryTerm EOF
            {
             newCompositeNode(grammarAccess.getPrimaryTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryTerm=rulePrimaryTerm();

            state._fsp--;

             current =iv_rulePrimaryTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryTerm"


    // $ANTLR start "rulePrimaryTerm"
    // InternalRPL.g:3530:1: rulePrimaryTerm returns [EObject current=null] : (this_Constant_0= ruleConstant | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | this_FunApplication_6= ruleFunApplication | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Constant_0 = null;

        EObject this_FunApplication_6 = null;

        EObject lv_nestedTerm_8_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3536:2: ( (this_Constant_0= ruleConstant | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | this_FunApplication_6= ruleFunApplication | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) )
            // InternalRPL.g:3537:2: (this_Constant_0= ruleConstant | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | this_FunApplication_6= ruleFunApplication | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            {
            // InternalRPL.g:3537:2: (this_Constant_0= ruleConstant | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | this_FunApplication_6= ruleFunApplication | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            int alt75=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
            case RULE_INTEGER:
            case RULE_REAL:
            case 49:
                {
                alt75=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_DISJUNCTION:
                case RULE_CONJUNCTION:
                case RULE_POWER_OPERATOR:
                case 27:
                case 28:
                case 29:
                case 37:
                case 45:
                case 49:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                    {
                    alt75=2;
                    }
                    break;
                case 47:
                    {
                    alt75=3;
                    }
                    break;
                case 24:
                    {
                    alt75=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalRPL.g:3538:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getPrimaryTermAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3547:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalRPL.g:3547:3: ( (otherlv_1= RULE_ID ) )
                    // InternalRPL.g:3548:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRPL.g:3548:4: (otherlv_1= RULE_ID )
                    // InternalRPL.g:3549:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryTermRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getPrimaryTermAccess().getVariableVariableCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:3561:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    {
                    // InternalRPL.g:3561:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    // InternalRPL.g:3562:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']'
                    {
                    // InternalRPL.g:3562:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPL.g:3563:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPL.g:3563:5: (otherlv_2= RULE_ID )
                    // InternalRPL.g:3564:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_44); 

                    						newLeafNode(otherlv_2, grammarAccess.getPrimaryTermAccess().getStateUpdateStateVariableCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTermAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalRPL.g:3579:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:3580:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:3580:5: (otherlv_4= RULE_ID )
                    // InternalRPL.g:3581:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_4, grammarAccess.getPrimaryTermAccess().getVariableProgramVariableCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryTermAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:3598:3: this_FunApplication_6= ruleFunApplication
                    {

                    			newCompositeNode(grammarAccess.getPrimaryTermAccess().getFunApplicationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunApplication_6=ruleFunApplication();

                    state._fsp--;


                    			current = this_FunApplication_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRPL.g:3607:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // InternalRPL.g:3607:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // InternalRPL.g:3608:4: otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryTermAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalRPL.g:3612:4: ( (lv_nestedTerm_8_0= ruleTerm ) )
                    // InternalRPL.g:3613:5: (lv_nestedTerm_8_0= ruleTerm )
                    {
                    // InternalRPL.g:3613:5: (lv_nestedTerm_8_0= ruleTerm )
                    // InternalRPL.g:3614:6: lv_nestedTerm_8_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getPrimaryTermAccess().getNestedTermTermParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestedTerm_8_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryTermRule());
                    						}
                    						set(
                    							current,
                    							"nestedTerm",
                    							lv_nestedTerm_8_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryTermAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryTerm"


    // $ANTLR start "entryRuleFunApplication"
    // InternalRPL.g:3640:1: entryRuleFunApplication returns [EObject current=null] : iv_ruleFunApplication= ruleFunApplication EOF ;
    public final EObject entryRuleFunApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunApplication = null;


        try {
            // InternalRPL.g:3640:55: (iv_ruleFunApplication= ruleFunApplication EOF )
            // InternalRPL.g:3641:2: iv_ruleFunApplication= ruleFunApplication EOF
            {
             newCompositeNode(grammarAccess.getFunApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunApplication=ruleFunApplication();

            state._fsp--;

             current =iv_ruleFunApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunApplication"


    // $ANTLR start "ruleFunApplication"
    // InternalRPL.g:3647:1: ruleFunApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:3653:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRPL.g:3654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRPL.g:3654:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRPL.g:3655:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalRPL.g:3655:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:3656:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:3656:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:3657:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFunApplicationAccess().getFnParamFunctionalParameterCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFunApplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:3672:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:3673:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:3673:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:3674:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getFunApplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunApplicationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunApplication"


    // $ANTLR start "entryRuleConstant"
    // InternalRPL.g:3693:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRPL.g:3693:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRPL.g:3694:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalRPL.g:3700:1: ruleConstant returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3706:2: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalRPL.g:3707:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalRPL.g:3707:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_INTEGER && LA76_0<=RULE_REAL)||LA76_0==49) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_BOOLEAN_LITERAL) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalRPL.g:3708:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // InternalRPL.g:3708:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // InternalRPL.g:3709:4: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // InternalRPL.g:3709:4: (lv_num_0_0= ruleNumericLiteral )
                    // InternalRPL.g:3710:5: lv_num_0_0= ruleNumericLiteral
                    {

                    					newCompositeNode(grammarAccess.getConstantAccess().getNumNumericLiteralParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_num_0_0=ruleNumericLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConstantRule());
                    					}
                    					set(
                    						current,
                    						"num",
                    						lv_num_0_0,
                    						"su.nsk.iae.rpl.RPL.NumericLiteral");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:3728:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:3728:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:3729:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:3729:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:3730:5: lv_bool_1_0= RULE_BOOLEAN_LITERAL
                    {
                    lv_bool_1_0=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_bool_1_0, grammarAccess.getConstantAccess().getBoolBOOLEAN_LITERALTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"bool",
                    						lv_bool_1_0,
                    						"su.nsk.iae.rpl.RPL.BOOLEAN_LITERAL");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalRPL.g:3750:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalRPL.g:3750:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalRPL.g:3751:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalRPL.g:3757:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:3763:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalRPL.g:3764:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalRPL.g:3764:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt77=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==RULE_REAL) ) {
                    alt77=2;
                }
                else if ( (LA77_1==RULE_INTEGER) ) {
                    alt77=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                alt77=1;
                }
                break;
            case RULE_REAL:
                {
                alt77=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalRPL.g:3765:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3774:3: this_RealLiteral_1= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalRPL.g:3786:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalRPL.g:3786:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalRPL.g:3787:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalRPL.g:3793:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:3799:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalRPL.g:3800:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalRPL.g:3800:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalRPL.g:3801:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalRPL.g:3801:3: ( (lv_sig_0_0= '-' ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==49) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRPL.g:3802:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:3802:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:3803:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,49,FOLLOW_46); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getIntegerLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:3815:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalRPL.g:3816:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalRPL.g:3816:4: (lv_value_1_0= RULE_INTEGER )
            // InternalRPL.g:3817:5: lv_value_1_0= RULE_INTEGER
            {
            lv_value_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIntegerLiteralAccess().getValueINTEGERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"su.nsk.iae.rpl.RPL.INTEGER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalRPL.g:3837:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalRPL.g:3837:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalRPL.g:3838:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalRPL.g:3844:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:3850:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRPL.g:3851:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRPL.g:3851:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRPL.g:3852:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRPL.g:3852:3: ( (lv_sig_0_0= '-' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==49) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRPL.g:3853:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:3853:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:3854:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,49,FOLLOW_47); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getRealLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:3866:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRPL.g:3867:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalRPL.g:3867:4: (lv_value_1_0= RULE_REAL )
            // InternalRPL.g:3868:5: lv_value_1_0= RULE_REAL
            {
            lv_value_1_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRealLiteralAccess().getValueREALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"su.nsk.iae.rpl.RPL.REAL");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRulePatternFreeFormula"
    // InternalRPL.g:3888:1: entryRulePatternFreeFormula returns [EObject current=null] : iv_rulePatternFreeFormula= rulePatternFreeFormula EOF ;
    public final EObject entryRulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormula = null;


        try {
            // InternalRPL.g:3888:59: (iv_rulePatternFreeFormula= rulePatternFreeFormula EOF )
            // InternalRPL.g:3889:2: iv_rulePatternFreeFormula= rulePatternFreeFormula EOF
            {
             newCompositeNode(grammarAccess.getPatternFreeFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternFreeFormula=rulePatternFreeFormula();

            state._fsp--;

             current =iv_rulePatternFreeFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternFreeFormula"


    // $ANTLR start "rulePatternFreeFormula"
    // InternalRPL.g:3895:1: rulePatternFreeFormula returns [EObject current=null] : (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) ;
    public final EObject rulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3901:2: ( (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) )
            // InternalRPL.g:3902:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:3902:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            // InternalRPL.g:3903:3: this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ConjunctionPatternFreeFormula_0=ruleConjunctionPatternFreeFormula();

            state._fsp--;


            			current = this_ConjunctionPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3911:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_DISJUNCTION) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalRPL.g:3912:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:3912:4: ()
            	    // InternalRPL.g:3913:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPatternFreeFormulaAccess().getPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_23); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getPatternFreeFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3923:4: ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    // InternalRPL.g:3924:5: (lv_right_3_0= rulePatternFreeFormula )
            	    {
            	    // InternalRPL.g:3924:5: (lv_right_3_0= rulePatternFreeFormula )
            	    // InternalRPL.g:3925:6: lv_right_3_0= rulePatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getRightPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=rulePatternFreeFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternFreeFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.PatternFreeFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternFreeFormula"


    // $ANTLR start "entryRuleConjunctionPatternFreeFormula"
    // InternalRPL.g:3947:1: entryRuleConjunctionPatternFreeFormula returns [EObject current=null] : iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF ;
    public final EObject entryRuleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionPatternFreeFormula = null;


        try {
            // InternalRPL.g:3947:70: (iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF )
            // InternalRPL.g:3948:2: iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF
            {
             newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctionPatternFreeFormula=ruleConjunctionPatternFreeFormula();

            state._fsp--;

             current =iv_ruleConjunctionPatternFreeFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionPatternFreeFormula"


    // $ANTLR start "ruleConjunctionPatternFreeFormula"
    // InternalRPL.g:3954:1: ruleConjunctionPatternFreeFormula returns [EObject current=null] : (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) ;
    public final EObject ruleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3960:2: ( (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) )
            // InternalRPL.g:3961:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:3961:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            // InternalRPL.g:3962:3: this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getPrimaryPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PrimaryPatternFreeFormula_0=rulePrimaryPatternFreeFormula();

            state._fsp--;


            			current = this_PrimaryPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3970:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_CONJUNCTION) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalRPL.g:3971:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:3971:4: ()
            	    // InternalRPL.g:3972:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_23); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionPatternFreeFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3982:4: ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    // InternalRPL.g:3983:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    {
            	    // InternalRPL.g:3983:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    // InternalRPL.g:3984:6: lv_right_3_0= ruleConjunctionPatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getRightConjunctionPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleConjunctionPatternFreeFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionPatternFreeFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.ConjunctionPatternFreeFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionPatternFreeFormula"


    // $ANTLR start "entryRulePrimaryPatternFreeFormula"
    // InternalRPL.g:4006:1: entryRulePrimaryPatternFreeFormula returns [EObject current=null] : iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF ;
    public final EObject entryRulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPatternFreeFormula = null;


        try {
            // InternalRPL.g:4006:66: (iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF )
            // InternalRPL.g:4007:2: iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF
            {
             newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryPatternFreeFormula=rulePrimaryPatternFreeFormula();

            state._fsp--;

             current =iv_rulePrimaryPatternFreeFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryPatternFreeFormula"


    // $ANTLR start "rulePrimaryPatternFreeFormula"
    // InternalRPL.g:4013:1: rulePrimaryPatternFreeFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4019:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:4020:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:4020:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID||(LA82_0>=RULE_NEGATION && LA82_0<=RULE_BOOLEAN_LITERAL)||LA82_0==36) ) {
                alt82=1;
            }
            else if ( (LA82_0==24) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalRPL.g:4021:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:4021:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:4022:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:4022:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:4023:5: lv_atomic_0_0= ruleNegationFormula
                    {

                    					newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaAccess().getAtomicNegationFormulaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atomic_0_0=ruleNegationFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryPatternFreeFormulaRule());
                    					}
                    					set(
                    						current,
                    						"atomic",
                    						lv_atomic_0_0,
                    						"su.nsk.iae.rpl.RPL.NegationFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:4041:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:4041:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:4042:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryPatternFreeFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:4046:4: ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:4047:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:4047:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    // InternalRPL.g:4048:6: lv_nestedFormula_2_0= rulePatternFreeFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaAccess().getNestedFormulaPatternFreeFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestedFormula_2_0=rulePatternFreeFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryPatternFreeFormulaRule());
                    						}
                    						set(
                    							current,
                    							"nestedFormula",
                    							lv_nestedFormula_2_0,
                    							"su.nsk.iae.rpl.RPL.PatternFreeFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryPatternFreeFormulaAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryPatternFreeFormula"


    // $ANTLR start "entryRuleRequirement"
    // InternalRPL.g:4074:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRPL.g:4074:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRPL.g:4075:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalRPL.g:4081:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_extraIn_19_0=null;
        Token otherlv_20=null;
        EObject lv_cParams_7_0 = null;

        EObject lv_cParams_9_0 = null;

        EObject lv_fmParams_12_0 = null;

        EObject lv_fmParams_14_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4087:2: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) )
            // InternalRPL.g:4088:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            {
            // InternalRPL.g:4088:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            // InternalRPL.g:4089:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalRPL.g:4093:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4094:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4094:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4095:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPL.g:4111:3: ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==30) ) {
                alt87=1;
            }
            else if ( (LA87_0==26) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalRPL.g:4112:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    {
                    // InternalRPL.g:4112:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    // InternalRPL.g:4113:5: otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getEqualsSignKeyword_2_0_0());
                    				
                    // InternalRPL.g:4117:5: ( (otherlv_3= RULE_ID ) )
                    // InternalRPL.g:4118:6: (otherlv_3= RULE_ID )
                    {
                    // InternalRPL.g:4118:6: (otherlv_3= RULE_ID )
                    // InternalRPL.g:4119:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    							newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_2_0_1_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftParenthesisKeyword_2_0_2());
                    				
                    // InternalRPL.g:4134:5: (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==25) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalRPL.g:4135:6: otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_10); 

                            						newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getConstKeyword_2_0_3_0());
                            					
                            otherlv_6=(Token)match(input,26,FOLLOW_25); 

                            						newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getColonKeyword_2_0_3_1());
                            					
                            // InternalRPL.g:4143:6: ( (lv_cParams_7_0= ruleTerm ) )
                            // InternalRPL.g:4144:7: (lv_cParams_7_0= ruleTerm )
                            {
                            // InternalRPL.g:4144:7: (lv_cParams_7_0= ruleTerm )
                            // InternalRPL.g:4145:8: lv_cParams_7_0= ruleTerm
                            {

                            								newCompositeNode(grammarAccess.getRequirementAccess().getCParamsTermParserRuleCall_2_0_3_2_0());
                            							
                            pushFollow(FOLLOW_11);
                            lv_cParams_7_0=ruleTerm();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRequirementRule());
                            								}
                            								add(
                            									current,
                            									"cParams",
                            									lv_cParams_7_0,
                            									"su.nsk.iae.rpl.RPL.Term");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalRPL.g:4162:6: (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==27) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // InternalRPL.g:4163:7: otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_25); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_3_3_0());
                            	    						
                            	    // InternalRPL.g:4167:7: ( (lv_cParams_9_0= ruleTerm ) )
                            	    // InternalRPL.g:4168:8: (lv_cParams_9_0= ruleTerm )
                            	    {
                            	    // InternalRPL.g:4168:8: (lv_cParams_9_0= ruleTerm )
                            	    // InternalRPL.g:4169:9: lv_cParams_9_0= ruleTerm
                            	    {

                            	    									newCompositeNode(grammarAccess.getRequirementAccess().getCParamsTermParserRuleCall_2_0_3_3_1_0());
                            	    								
                            	    pushFollow(FOLLOW_11);
                            	    lv_cParams_9_0=ruleTerm();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getRequirementRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"cParams",
                            	    										lv_cParams_9_0,
                            	    										"su.nsk.iae.rpl.RPL.Term");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalRPL.g:4188:5: (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==28) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalRPL.g:4189:6: otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            {
                            otherlv_10=(Token)match(input,28,FOLLOW_10); 

                            						newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFormulasKeyword_2_0_4_0());
                            					
                            otherlv_11=(Token)match(input,26,FOLLOW_29); 

                            						newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getColonKeyword_2_0_4_1());
                            					
                            // InternalRPL.g:4197:6: ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                            // InternalRPL.g:4198:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            {
                            // InternalRPL.g:4198:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            // InternalRPL.g:4199:8: lv_fmParams_12_0= rulePatternFreeFormulaParameterValue
                            {

                            								newCompositeNode(grammarAccess.getRequirementAccess().getFmParamsPatternFreeFormulaParameterValueParserRuleCall_2_0_4_2_0());
                            							
                            pushFollow(FOLLOW_12);
                            lv_fmParams_12_0=rulePatternFreeFormulaParameterValue();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRequirementRule());
                            								}
                            								add(
                            									current,
                            									"fmParams",
                            									lv_fmParams_12_0,
                            									"su.nsk.iae.rpl.RPL.PatternFreeFormulaParameterValue");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalRPL.g:4216:6: (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            loop85:
                            do {
                                int alt85=2;
                                int LA85_0 = input.LA(1);

                                if ( (LA85_0==27) ) {
                                    alt85=1;
                                }


                                switch (alt85) {
                            	case 1 :
                            	    // InternalRPL.g:4217:7: otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    {
                            	    otherlv_13=(Token)match(input,27,FOLLOW_29); 

                            	    							newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_4_3_0());
                            	    						
                            	    // InternalRPL.g:4221:7: ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    // InternalRPL.g:4222:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    {
                            	    // InternalRPL.g:4222:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    // InternalRPL.g:4223:9: lv_fmParams_14_0= rulePatternFreeFormulaParameterValue
                            	    {

                            	    									newCompositeNode(grammarAccess.getRequirementAccess().getFmParamsPatternFreeFormulaParameterValueParserRuleCall_2_0_4_3_1_0());
                            	    								
                            	    pushFollow(FOLLOW_12);
                            	    lv_fmParams_14_0=rulePatternFreeFormulaParameterValue();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getRequirementRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"fmParams",
                            	    										lv_fmParams_14_0,
                            	    										"su.nsk.iae.rpl.RPL.PatternFreeFormulaParameterValue");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop85;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,29,FOLLOW_5); 

                    					newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRightParenthesisKeyword_2_0_5());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:4248:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4248:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    // InternalRPL.g:4249:5: otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_7); 

                    					newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getColonKeyword_2_1_0());
                    				
                    // InternalRPL.g:4253:5: ( (otherlv_17= RULE_ID ) )
                    // InternalRPL.g:4254:6: (otherlv_17= RULE_ID )
                    {
                    // InternalRPL.g:4254:6: (otherlv_17= RULE_ID )
                    // InternalRPL.g:4255:7: otherlv_17= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    						
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_2_1_1_0());
                    						

                    }


                    }

                    otherlv_18=(Token)match(input,32,FOLLOW_7); 

                    					newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getWithKeyword_2_1_2());
                    				
                    // InternalRPL.g:4270:5: ( (lv_extraIn_19_0= RULE_ID ) )
                    // InternalRPL.g:4271:6: (lv_extraIn_19_0= RULE_ID )
                    {
                    // InternalRPL.g:4271:6: (lv_extraIn_19_0= RULE_ID )
                    // InternalRPL.g:4272:7: lv_extraIn_19_0= RULE_ID
                    {
                    lv_extraIn_19_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    							newLeafNode(lv_extraIn_19_0, grammarAccess.getRequirementAccess().getExtraInIDTerminalRuleCall_2_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"extraIn",
                    								lv_extraIn_19_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleExtraInvariant"
    // InternalRPL.g:4298:1: entryRuleExtraInvariant returns [EObject current=null] : iv_ruleExtraInvariant= ruleExtraInvariant EOF ;
    public final EObject entryRuleExtraInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraInvariant = null;


        try {
            // InternalRPL.g:4298:55: (iv_ruleExtraInvariant= ruleExtraInvariant EOF )
            // InternalRPL.g:4299:2: iv_ruleExtraInvariant= ruleExtraInvariant EOF
            {
             newCompositeNode(grammarAccess.getExtraInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtraInvariant=ruleExtraInvariant();

            state._fsp--;

             current =iv_ruleExtraInvariant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtraInvariant"


    // $ANTLR start "ruleExtraInvariant"
    // InternalRPL.g:4305:1: ruleExtraInvariant returns [EObject current=null] : (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) ;
    public final EObject ruleExtraInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_reqName_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRPL.g:4311:2: ( (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) )
            // InternalRPL.g:4312:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            {
            // InternalRPL.g:4312:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            // InternalRPL.g:4313:3: otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getExtraInvariantAccess().getExtraKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraInvariantAccess().getInvariantKeyword_1());
            		
            // InternalRPL.g:4321:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:4322:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:4322:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:4323:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtraInvariantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtraInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPL.g:4339:3: ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==26) ) {
                alt88=1;
            }
            else if ( (LA88_0==53) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalRPL.g:4340:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4340:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    // InternalRPL.g:4341:5: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtraInvariantAccess().getColonKeyword_3_0_0());
                    				
                    // InternalRPL.g:4345:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:4346:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:4346:6: (otherlv_4= RULE_ID )
                    // InternalRPL.g:4347:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_51); 

                    							newLeafNode(otherlv_4, grammarAccess.getExtraInvariantAccess().getPatternDerivedExtraInvariantPatternCrossReference_3_0_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getExtraInvariantAccess().getForKeyword_3_0_2());
                    				
                    // InternalRPL.g:4362:5: ( (lv_reqName_6_0= RULE_ID ) )
                    // InternalRPL.g:4363:6: (lv_reqName_6_0= RULE_ID )
                    {
                    // InternalRPL.g:4363:6: (lv_reqName_6_0= RULE_ID )
                    // InternalRPL.g:4364:7: lv_reqName_6_0= RULE_ID
                    {
                    lv_reqName_6_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    							newLeafNode(lv_reqName_6_0, grammarAccess.getExtraInvariantAccess().getReqNameIDTerminalRuleCall_3_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"reqName",
                    								lv_reqName_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:4382:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4382:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    // InternalRPL.g:4383:5: otherlv_7= 'for' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_7); 

                    					newLeafNode(otherlv_7, grammarAccess.getExtraInvariantAccess().getForKeyword_3_1_0());
                    				
                    // InternalRPL.g:4387:5: ( (otherlv_8= RULE_ID ) )
                    // InternalRPL.g:4388:6: (otherlv_8= RULE_ID )
                    {
                    // InternalRPL.g:4388:6: (otherlv_8= RULE_ID )
                    // InternalRPL.g:4389:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); 

                    							newLeafNode(otherlv_8, grammarAccess.getExtraInvariantAccess().getReqRequirementCrossReference_3_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExtraInvariantAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtraInvariant"


    // $ANTLR start "entryRulePatternFreeFormulaParameterValue"
    // InternalRPL.g:4410:1: entryRulePatternFreeFormulaParameterValue returns [EObject current=null] : iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF ;
    public final EObject entryRulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormulaParameterValue = null;


        try {
            // InternalRPL.g:4410:73: (iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF )
            // InternalRPL.g:4411:2: iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF
            {
             newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternFreeFormulaParameterValue=rulePatternFreeFormulaParameterValue();

            state._fsp--;

             current =iv_rulePatternFreeFormulaParameterValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternFreeFormulaParameterValue"


    // $ANTLR start "rulePatternFreeFormulaParameterValue"
    // InternalRPL.g:4417:1: rulePatternFreeFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) ;
    public final EObject rulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4423:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) )
            // InternalRPL.g:4424:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            {
            // InternalRPL.g:4424:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            // InternalRPL.g:4425:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) )
            {
            // InternalRPL.g:4425:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==34) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalRPL.g:4426:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternFreeFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:4430:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_ID) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalRPL.g:4431:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:4431:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:4432:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_states_1_0=ruleUpdateStateVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPatternFreeFormulaParameterValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"states",
                    	    							lv_states_1_0,
                    	    							"su.nsk.iae.rpl.RPL.UpdateStateVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternFreeFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:4454:3: ( (lv_formula_3_0= rulePatternFreeFormula ) )
            // InternalRPL.g:4455:4: (lv_formula_3_0= rulePatternFreeFormula )
            {
            // InternalRPL.g:4455:4: (lv_formula_3_0= rulePatternFreeFormula )
            // InternalRPL.g:4456:5: lv_formula_3_0= rulePatternFreeFormula
            {

            					newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getFormulaPatternFreeFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_3_0=rulePatternFreeFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternFreeFormulaParameterValueRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_3_0,
            						"su.nsk.iae.rpl.RPL.PatternFreeFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternFreeFormulaParameterValue"


    // $ANTLR start "entryRuleFutureLemmas"
    // InternalRPL.g:4477:1: entryRuleFutureLemmas returns [EObject current=null] : iv_ruleFutureLemmas= ruleFutureLemmas EOF ;
    public final EObject entryRuleFutureLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureLemmas = null;


        try {
            // InternalRPL.g:4477:53: (iv_ruleFutureLemmas= ruleFutureLemmas EOF )
            // InternalRPL.g:4478:2: iv_ruleFutureLemmas= ruleFutureLemmas EOF
            {
             newCompositeNode(grammarAccess.getFutureLemmasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFutureLemmas=ruleFutureLemmas();

            state._fsp--;

             current =iv_ruleFutureLemmas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFutureLemmas"


    // $ANTLR start "ruleFutureLemmas"
    // InternalRPL.g:4484:1: ruleFutureLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) ;
    public final EObject ruleFutureLemmas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_L1_5_0 = null;

        EObject lv_L2_7_0 = null;

        EObject lv_L3_9_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4490:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) )
            // InternalRPL.g:4491:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            {
            // InternalRPL.g:4491:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalRPL.g:4492:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalRPL.g:4492:3: ()
            // InternalRPL.g:4493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureLemmasAccess().getFutureLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4499:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalRPL.g:4500:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_1=(Token)match(input,54,FOLLOW_52); 

            				newLeafNode(otherlv_1, grammarAccess.getFutureLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,55,FOLLOW_53); 

            				newLeafNode(otherlv_2, grammarAccess.getFutureLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4508:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4509:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4509:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4510:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4513:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4514:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4514:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            loop91:
            do {
                int alt91=4;
                int LA91_0 = input.LA(1);

                if ( LA91_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt91=1;
                }
                else if ( LA91_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt91=2;
                }
                else if ( LA91_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt91=3;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalRPL.g:4515:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4515:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4516:6: {...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4516:112: ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4517:7: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4520:10: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4520:11: {...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4520:20: (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4520:21: otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,56,FOLLOW_54); 

            	    										newLeafNode(otherlv_4, grammarAccess.getFutureLemmasAccess().getLS1Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4524:10: ( (lv_L1_5_0= ruleLemma ) )
            	    // InternalRPL.g:4525:11: (lv_L1_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4525:11: (lv_L1_5_0= ruleLemma )
            	    // InternalRPL.g:4526:12: lv_L1_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL1LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
            	    lv_L1_5_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFutureLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L1",
            	    													lv_L1_5_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPL.g:4549:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4549:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4550:6: {...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4550:112: ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4551:7: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4554:10: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4554:11: {...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4554:20: (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4554:21: otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_54); 

            	    										newLeafNode(otherlv_6, grammarAccess.getFutureLemmasAccess().getLS2Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4558:10: ( (lv_L2_7_0= ruleLemma ) )
            	    // InternalRPL.g:4559:11: (lv_L2_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4559:11: (lv_L2_7_0= ruleLemma )
            	    // InternalRPL.g:4560:12: lv_L2_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL2LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
            	    lv_L2_7_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFutureLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L2",
            	    													lv_L2_7_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRPL.g:4583:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4583:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4584:6: {...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4584:112: ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4585:7: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4588:10: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4588:11: {...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4588:20: (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4588:21: otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,58,FOLLOW_54); 

            	    										newLeafNode(otherlv_8, grammarAccess.getFutureLemmasAccess().getLS3Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4592:10: ( (lv_L3_9_0= ruleLemma ) )
            	    // InternalRPL.g:4593:11: (lv_L3_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4593:11: (lv_L3_9_0= ruleLemma )
            	    // InternalRPL.g:4594:12: lv_L3_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL3LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
            	    lv_L3_9_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFutureLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L3",
            	    													lv_L3_9_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_10=(Token)match(input,59,FOLLOW_2); 

            				newLeafNode(otherlv_10, grammarAccess.getFutureLemmasAccess().getRightCurlyBracketKeyword_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFutureLemmas"


    // $ANTLR start "entryRulePastLemmas"
    // InternalRPL.g:4633:1: entryRulePastLemmas returns [EObject current=null] : iv_rulePastLemmas= rulePastLemmas EOF ;
    public final EObject entryRulePastLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastLemmas = null;


        try {
            // InternalRPL.g:4633:51: (iv_rulePastLemmas= rulePastLemmas EOF )
            // InternalRPL.g:4634:2: iv_rulePastLemmas= rulePastLemmas EOF
            {
             newCompositeNode(grammarAccess.getPastLemmasRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastLemmas=rulePastLemmas();

            state._fsp--;

             current =iv_rulePastLemmas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePastLemmas"


    // $ANTLR start "rulePastLemmas"
    // InternalRPL.g:4640:1: rulePastLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) ;
    public final EObject rulePastLemmas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_L4_5_0 = null;

        EObject lv_L5_7_0 = null;

        EObject lv_L6_9_0 = null;

        EObject lv_L7_11_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4646:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) )
            // InternalRPL.g:4647:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            {
            // InternalRPL.g:4647:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalRPL.g:4648:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalRPL.g:4648:3: ()
            // InternalRPL.g:4649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastLemmasAccess().getPastLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4655:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalRPL.g:4656:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_1=(Token)match(input,54,FOLLOW_52); 

            				newLeafNode(otherlv_1, grammarAccess.getPastLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,55,FOLLOW_55); 

            				newLeafNode(otherlv_2, grammarAccess.getPastLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4664:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4665:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4665:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4666:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4669:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4670:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4670:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            loop92:
            do {
                int alt92=5;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt92=3;
                }
                else if ( LA92_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt92=4;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalRPL.g:4671:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4671:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4672:6: {...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4672:110: ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4673:7: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4676:10: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4676:11: {...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4676:20: (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4676:21: otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,60,FOLLOW_54); 

            	    										newLeafNode(otherlv_4, grammarAccess.getPastLemmasAccess().getLS4Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4680:10: ( (lv_L4_5_0= ruleLemma ) )
            	    // InternalRPL.g:4681:11: (lv_L4_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4681:11: (lv_L4_5_0= ruleLemma )
            	    // InternalRPL.g:4682:12: lv_L4_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL4LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_55);
            	    lv_L4_5_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getPastLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L4",
            	    													lv_L4_5_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPL.g:4705:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4705:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4706:6: {...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4706:110: ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4707:7: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4710:10: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4710:11: {...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4710:20: (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4710:21: otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,61,FOLLOW_54); 

            	    										newLeafNode(otherlv_6, grammarAccess.getPastLemmasAccess().getLS5Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4714:10: ( (lv_L5_7_0= ruleLemma ) )
            	    // InternalRPL.g:4715:11: (lv_L5_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4715:11: (lv_L5_7_0= ruleLemma )
            	    // InternalRPL.g:4716:12: lv_L5_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL5LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_55);
            	    lv_L5_7_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getPastLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L5",
            	    													lv_L5_7_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRPL.g:4739:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4739:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4740:6: {...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4740:110: ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4741:7: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4744:10: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4744:11: {...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4744:20: (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4744:21: otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,62,FOLLOW_54); 

            	    										newLeafNode(otherlv_8, grammarAccess.getPastLemmasAccess().getLS6Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4748:10: ( (lv_L6_9_0= ruleLemma ) )
            	    // InternalRPL.g:4749:11: (lv_L6_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4749:11: (lv_L6_9_0= ruleLemma )
            	    // InternalRPL.g:4750:12: lv_L6_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL6LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_55);
            	    lv_L6_9_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getPastLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L6",
            	    													lv_L6_9_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRPL.g:4773:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4773:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4774:6: {...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // InternalRPL.g:4774:110: ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4775:7: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3);
            	    						
            	    // InternalRPL.g:4778:10: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4778:11: {...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4778:20: (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    // InternalRPL.g:4778:21: otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) )
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_54); 

            	    										newLeafNode(otherlv_10, grammarAccess.getPastLemmasAccess().getLS7Keyword_1_2_3_0());
            	    									
            	    // InternalRPL.g:4782:10: ( (lv_L7_11_0= ruleLemma ) )
            	    // InternalRPL.g:4783:11: (lv_L7_11_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4783:11: (lv_L7_11_0= ruleLemma )
            	    // InternalRPL.g:4784:12: lv_L7_11_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL7LemmaParserRuleCall_1_2_3_1_0());
            	    											
            	    pushFollow(FOLLOW_55);
            	    lv_L7_11_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getPastLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L7",
            	    													lv_L7_11_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_12=(Token)match(input,59,FOLLOW_2); 

            				newLeafNode(otherlv_12, grammarAccess.getPastLemmasAccess().getRightCurlyBracketKeyword_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePastLemmas"


    // $ANTLR start "entryRuleDerivedLemmas"
    // InternalRPL.g:4823:1: entryRuleDerivedLemmas returns [EObject current=null] : iv_ruleDerivedLemmas= ruleDerivedLemmas EOF ;
    public final EObject entryRuleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedLemmas = null;


        try {
            // InternalRPL.g:4823:54: (iv_ruleDerivedLemmas= ruleDerivedLemmas EOF )
            // InternalRPL.g:4824:2: iv_ruleDerivedLemmas= ruleDerivedLemmas EOF
            {
             newCompositeNode(grammarAccess.getDerivedLemmasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedLemmas=ruleDerivedLemmas();

            state._fsp--;

             current =iv_ruleDerivedLemmas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivedLemmas"


    // $ANTLR start "ruleDerivedLemmas"
    // InternalRPL.g:4830:1: ruleDerivedLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) ;
    public final EObject ruleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_L8_5_0 = null;

        EObject lv_L9_7_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4836:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) )
            // InternalRPL.g:4837:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            {
            // InternalRPL.g:4837:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRPL.g:4838:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRPL.g:4838:3: ()
            // InternalRPL.g:4839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedLemmasAccess().getDerivedLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4845:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRPL.g:4846:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_1=(Token)match(input,54,FOLLOW_52); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,55,FOLLOW_56); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4854:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4855:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4855:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4856:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4859:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4860:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4860:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            loop93:
            do {
                int alt93=3;
                int LA93_0 = input.LA(1);

                if ( LA93_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt93=1;
                }
                else if ( LA93_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt93=2;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalRPL.g:4861:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4861:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4862:6: {...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4862:113: ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4863:7: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4866:10: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4866:11: {...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4866:20: (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4866:21: otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,64,FOLLOW_54); 

            	    										newLeafNode(otherlv_4, grammarAccess.getDerivedLemmasAccess().getLS8Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4870:10: ( (lv_L8_5_0= ruleLemma ) )
            	    // InternalRPL.g:4871:11: (lv_L8_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4871:11: (lv_L8_5_0= ruleLemma )
            	    // InternalRPL.g:4872:12: lv_L8_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL8LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_56);
            	    lv_L8_5_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getDerivedLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L8",
            	    													lv_L8_5_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPL.g:4895:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4895:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4896:6: {...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4896:113: ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4897:7: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4900:10: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4900:11: {...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4900:20: (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4900:21: otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,65,FOLLOW_54); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedLemmasAccess().getLS9Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4904:10: ( (lv_L9_7_0= ruleLemma ) )
            	    // InternalRPL.g:4905:11: (lv_L9_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4905:11: (lv_L9_7_0= ruleLemma )
            	    // InternalRPL.g:4906:12: lv_L9_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL9LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_56);
            	    lv_L9_7_0=ruleLemma();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getDerivedLemmasRule());
            	    												}
            	    												set(
            	    													current,
            	    													"L9",
            	    													lv_L9_7_0,
            	    													"su.nsk.iae.rpl.RPL.Lemma");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_8=(Token)match(input,59,FOLLOW_2); 

            				newLeafNode(otherlv_8, grammarAccess.getDerivedLemmasAccess().getRightCurlyBracketKeyword_1_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivedLemmas"


    // $ANTLR start "entryRuleLemma"
    // InternalRPL.g:4945:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // InternalRPL.g:4945:46: (iv_ruleLemma= ruleLemma EOF )
            // InternalRPL.g:4946:2: iv_ruleLemma= ruleLemma EOF
            {
             newCompositeNode(grammarAccess.getLemmaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLemma=ruleLemma();

            state._fsp--;

             current =iv_ruleLemma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLemma"


    // $ANTLR start "ruleLemma"
    // InternalRPL.g:4952:1: ruleLemma returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleLemma() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        EObject lv_cVars_5_0 = null;

        EObject lv_cVars_7_0 = null;

        EObject lv_fnVars_10_0 = null;

        EObject lv_fnVars_12_0 = null;

        EObject lv_ifmVars_17_0 = null;

        EObject lv_ifmVars_19_0 = null;

        EObject lv_rfmVars_23_0 = null;

        EObject lv_rfmVars_25_0 = null;

        EObject lv_initState_29_0 = null;

        EObject lv_finalState_33_0 = null;

        EObject lv_prem_35_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4958:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) ) ) )
            // InternalRPL.g:4959:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRPL.g:4959:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) ) )
            // InternalRPL.g:4960:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalRPL.g:4960:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?) )
            // InternalRPL.g:4961:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLemmaAccess().getUnorderedGroup());
            			
            // InternalRPL.g:4964:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?)
            // InternalRPL.g:4965:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+ {...}?
            {
            // InternalRPL.g:4965:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) ) )+
            int cnt99=0;
            loop99:
            do {
                int alt99=8;
                int LA99_0 = input.LA(1);

                if ( LA99_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
                    alt99=1;
                }
                else if ( LA99_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
                    alt99=2;
                }
                else if ( LA99_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
                    alt99=3;
                }
                else if ( LA99_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
                    alt99=4;
                }
                else if ( LA99_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
                    alt99=5;
                }
                else if ( LA99_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
                    alt99=6;
                }
                else if ( LA99_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
                    alt99=7;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalRPL.g:4966:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    {
            	    // InternalRPL.g:4966:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    // InternalRPL.g:4967:4: {...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRPL.g:4967:99: ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) ) )
            	    // InternalRPL.g:4968:5: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRPL.g:4971:8: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? ) )
            	    // InternalRPL.g:4971:9: {...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:4971:18: (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? )
            	    // InternalRPL.g:4971:19: otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,66,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLemmaAccess().getLemmaKeyword_0_0());
            	    							
            	    // InternalRPL.g:4975:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRPL.g:4976:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRPL.g:4976:9: (lv_name_2_0= RULE_ID )
            	    // InternalRPL.g:4977:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getLemmaAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLemmaRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    // InternalRPL.g:4993:8: (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==25) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalRPL.g:4994:9: otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )*
            	            {
            	            otherlv_3=(Token)match(input,25,FOLLOW_10); 

            	            									newLeafNode(otherlv_3, grammarAccess.getLemmaAccess().getConstKeyword_0_2_0());
            	            								
            	            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            	            									newLeafNode(otherlv_4, grammarAccess.getLemmaAccess().getColonKeyword_0_2_1());
            	            								
            	            // InternalRPL.g:5002:9: ( (lv_cVars_5_0= ruleConstantParameter ) )
            	            // InternalRPL.g:5003:10: (lv_cVars_5_0= ruleConstantParameter )
            	            {
            	            // InternalRPL.g:5003:10: (lv_cVars_5_0= ruleConstantParameter )
            	            // InternalRPL.g:5004:11: lv_cVars_5_0= ruleConstantParameter
            	            {

            	            											newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_2_2_0());
            	            										
            	            pushFollow(FOLLOW_58);
            	            lv_cVars_5_0=ruleConstantParameter();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	            											}
            	            											add(
            	            												current,
            	            												"cVars",
            	            												lv_cVars_5_0,
            	            												"su.nsk.iae.rpl.RPL.ConstantParameter");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalRPL.g:5021:9: (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )*
            	            loop94:
            	            do {
            	                int alt94=2;
            	                int LA94_0 = input.LA(1);

            	                if ( (LA94_0==27) ) {
            	                    alt94=1;
            	                }


            	                switch (alt94) {
            	            	case 1 :
            	            	    // InternalRPL.g:5022:10: otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) )
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_7); 

            	            	    										newLeafNode(otherlv_6, grammarAccess.getLemmaAccess().getCommaKeyword_0_2_3_0());
            	            	    									
            	            	    // InternalRPL.g:5026:10: ( (lv_cVars_7_0= ruleConstantParameter ) )
            	            	    // InternalRPL.g:5027:11: (lv_cVars_7_0= ruleConstantParameter )
            	            	    {
            	            	    // InternalRPL.g:5027:11: (lv_cVars_7_0= ruleConstantParameter )
            	            	    // InternalRPL.g:5028:12: lv_cVars_7_0= ruleConstantParameter
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_2_3_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_58);
            	            	    lv_cVars_7_0=ruleConstantParameter();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getLemmaRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"cVars",
            	            	    													lv_cVars_7_0,
            	            	    													"su.nsk.iae.rpl.RPL.ConstantParameter");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop94;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRPL.g:5053:3: ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5053:3: ({...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5054:4: {...}? => ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRPL.g:5054:99: ( ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) ) )
            	    // InternalRPL.g:5055:5: ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRPL.g:5058:8: ({...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* ) )
            	    // InternalRPL.g:5058:9: {...}? => (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5058:18: (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )
            	    // InternalRPL.g:5058:19: otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )*
            	    {
            	    otherlv_8=(Token)match(input,42,FOLLOW_10); 

            	    								newLeafNode(otherlv_8, grammarAccess.getLemmaAccess().getFunKeyword_1_0());
            	    							
            	    otherlv_9=(Token)match(input,26,FOLLOW_7); 

            	    								newLeafNode(otherlv_9, grammarAccess.getLemmaAccess().getColonKeyword_1_1());
            	    							
            	    // InternalRPL.g:5066:8: ( (lv_fnVars_10_0= ruleFunctionalParameter ) )
            	    // InternalRPL.g:5067:9: (lv_fnVars_10_0= ruleFunctionalParameter )
            	    {
            	    // InternalRPL.g:5067:9: (lv_fnVars_10_0= ruleFunctionalParameter )
            	    // InternalRPL.g:5068:10: lv_fnVars_10_0= ruleFunctionalParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_58);
            	    lv_fnVars_10_0=ruleFunctionalParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"fnVars",
            	    											lv_fnVars_10_0,
            	    											"su.nsk.iae.rpl.RPL.FunctionalParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5085:8: (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )*
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==27) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // InternalRPL.g:5086:9: otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,27,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_11, grammarAccess.getLemmaAccess().getCommaKeyword_1_3_0());
            	    	    								
            	    	    // InternalRPL.g:5090:9: ( (lv_fnVars_12_0= ruleFunctionalParameter ) )
            	    	    // InternalRPL.g:5091:10: (lv_fnVars_12_0= ruleFunctionalParameter )
            	    	    {
            	    	    // InternalRPL.g:5091:10: (lv_fnVars_12_0= ruleFunctionalParameter )
            	    	    // InternalRPL.g:5092:11: lv_fnVars_12_0= ruleFunctionalParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_58);
            	    	    lv_fnVars_12_0=ruleFunctionalParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"fnVars",
            	    	    												lv_fnVars_12_0,
            	    	    												"su.nsk.iae.rpl.RPL.FunctionalParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop96;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRPL.g:5116:3: ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5116:3: ({...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5117:4: {...}? => ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRPL.g:5117:99: ( ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5118:5: ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRPL.g:5121:8: ({...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5121:9: {...}? => (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5121:18: (otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5121:19: otherlv_13= 'extra' otherlv_14= 'invariant' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_ifmVars_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )*
            	    {
            	    otherlv_13=(Token)match(input,51,FOLLOW_49); 

            	    								newLeafNode(otherlv_13, grammarAccess.getLemmaAccess().getExtraKeyword_2_0());
            	    							
            	    otherlv_14=(Token)match(input,52,FOLLOW_59); 

            	    								newLeafNode(otherlv_14, grammarAccess.getLemmaAccess().getInvariantKeyword_2_1());
            	    							
            	    otherlv_15=(Token)match(input,28,FOLLOW_10); 

            	    								newLeafNode(otherlv_15, grammarAccess.getLemmaAccess().getFormulasKeyword_2_2());
            	    							
            	    otherlv_16=(Token)match(input,26,FOLLOW_7); 

            	    								newLeafNode(otherlv_16, grammarAccess.getLemmaAccess().getColonKeyword_2_3());
            	    							
            	    // InternalRPL.g:5137:8: ( (lv_ifmVars_17_0= ruleFormulaParameter ) )
            	    // InternalRPL.g:5138:9: (lv_ifmVars_17_0= ruleFormulaParameter )
            	    {
            	    // InternalRPL.g:5138:9: (lv_ifmVars_17_0= ruleFormulaParameter )
            	    // InternalRPL.g:5139:10: lv_ifmVars_17_0= ruleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsFormulaParameterParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_58);
            	    lv_ifmVars_17_0=ruleFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ifmVars",
            	    											lv_ifmVars_17_0,
            	    											"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5156:8: (otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) ) )*
            	    loop97:
            	    do {
            	        int alt97=2;
            	        int LA97_0 = input.LA(1);

            	        if ( (LA97_0==27) ) {
            	            alt97=1;
            	        }


            	        switch (alt97) {
            	    	case 1 :
            	    	    // InternalRPL.g:5157:9: otherlv_18= ',' ( (lv_ifmVars_19_0= ruleFormulaParameter ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,27,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_18, grammarAccess.getLemmaAccess().getCommaKeyword_2_5_0());
            	    	    								
            	    	    // InternalRPL.g:5161:9: ( (lv_ifmVars_19_0= ruleFormulaParameter ) )
            	    	    // InternalRPL.g:5162:10: (lv_ifmVars_19_0= ruleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5162:10: (lv_ifmVars_19_0= ruleFormulaParameter )
            	    	    // InternalRPL.g:5163:11: lv_ifmVars_19_0= ruleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsFormulaParameterParserRuleCall_2_5_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_58);
            	    	    lv_ifmVars_19_0=ruleFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"ifmVars",
            	    	    												lv_ifmVars_19_0,
            	    	    												"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop97;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRPL.g:5187:3: ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5187:3: ({...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5188:4: {...}? => ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRPL.g:5188:99: ( ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5189:5: ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRPL.g:5192:8: ({...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5192:9: {...}? => (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5192:18: (otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5192:19: otherlv_20= 'requirement' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_rfmVars_23_0= ruleFormulaParameter ) ) (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )*
            	    {
            	    otherlv_20=(Token)match(input,50,FOLLOW_59); 

            	    								newLeafNode(otherlv_20, grammarAccess.getLemmaAccess().getRequirementKeyword_3_0());
            	    							
            	    otherlv_21=(Token)match(input,28,FOLLOW_10); 

            	    								newLeafNode(otherlv_21, grammarAccess.getLemmaAccess().getFormulasKeyword_3_1());
            	    							
            	    otherlv_22=(Token)match(input,26,FOLLOW_7); 

            	    								newLeafNode(otherlv_22, grammarAccess.getLemmaAccess().getColonKeyword_3_2());
            	    							
            	    // InternalRPL.g:5204:8: ( (lv_rfmVars_23_0= ruleFormulaParameter ) )
            	    // InternalRPL.g:5205:9: (lv_rfmVars_23_0= ruleFormulaParameter )
            	    {
            	    // InternalRPL.g:5205:9: (lv_rfmVars_23_0= ruleFormulaParameter )
            	    // InternalRPL.g:5206:10: lv_rfmVars_23_0= ruleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsFormulaParameterParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_58);
            	    lv_rfmVars_23_0=ruleFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"rfmVars",
            	    											lv_rfmVars_23_0,
            	    											"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5223:8: (otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) ) )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==27) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // InternalRPL.g:5224:9: otherlv_24= ',' ( (lv_rfmVars_25_0= ruleFormulaParameter ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,27,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_24, grammarAccess.getLemmaAccess().getCommaKeyword_3_4_0());
            	    	    								
            	    	    // InternalRPL.g:5228:9: ( (lv_rfmVars_25_0= ruleFormulaParameter ) )
            	    	    // InternalRPL.g:5229:10: (lv_rfmVars_25_0= ruleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5229:10: (lv_rfmVars_25_0= ruleFormulaParameter )
            	    	    // InternalRPL.g:5230:11: lv_rfmVars_25_0= ruleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsFormulaParameterParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_58);
            	    	    lv_rfmVars_25_0=ruleFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"rfmVars",
            	    	    												lv_rfmVars_25_0,
            	    	    												"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop98;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRPL.g:5254:3: ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5254:3: ({...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5255:4: {...}? => ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRPL.g:5255:99: ( ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5256:5: ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRPL.g:5259:8: ({...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5259:9: {...}? => (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5259:18: (otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5259:19: otherlv_26= 'init' otherlv_27= 'state' otherlv_28= ':' ( (lv_initState_29_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_26=(Token)match(input,67,FOLLOW_60); 

            	    								newLeafNode(otherlv_26, grammarAccess.getLemmaAccess().getInitKeyword_4_0());
            	    							
            	    otherlv_27=(Token)match(input,68,FOLLOW_10); 

            	    								newLeafNode(otherlv_27, grammarAccess.getLemmaAccess().getStateKeyword_4_1());
            	    							
            	    otherlv_28=(Token)match(input,26,FOLLOW_7); 

            	    								newLeafNode(otherlv_28, grammarAccess.getLemmaAccess().getColonKeyword_4_2());
            	    							
            	    // InternalRPL.g:5271:8: ( (lv_initState_29_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5272:9: (lv_initState_29_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5272:9: (lv_initState_29_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5273:10: lv_initState_29_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getInitStateUpdateStateVariableParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_61);
            	    lv_initState_29_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"initState",
            	    											lv_initState_29_0,
            	    											"su.nsk.iae.rpl.RPL.UpdateStateVariable");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRPL.g:5296:3: ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5296:3: ({...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5297:4: {...}? => ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRPL.g:5297:99: ( ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5298:5: ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRPL.g:5301:8: ({...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5301:9: {...}? => (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5301:18: (otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5301:19: otherlv_30= 'final' otherlv_31= 'state' otherlv_32= ':' ( (lv_finalState_33_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_30=(Token)match(input,37,FOLLOW_60); 

            	    								newLeafNode(otherlv_30, grammarAccess.getLemmaAccess().getFinalKeyword_5_0());
            	    							
            	    otherlv_31=(Token)match(input,68,FOLLOW_10); 

            	    								newLeafNode(otherlv_31, grammarAccess.getLemmaAccess().getStateKeyword_5_1());
            	    							
            	    otherlv_32=(Token)match(input,26,FOLLOW_7); 

            	    								newLeafNode(otherlv_32, grammarAccess.getLemmaAccess().getColonKeyword_5_2());
            	    							
            	    // InternalRPL.g:5313:8: ( (lv_finalState_33_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5314:9: (lv_finalState_33_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5314:9: (lv_finalState_33_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5315:10: lv_finalState_33_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFinalStateUpdateStateVariableParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_61);
            	    lv_finalState_33_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"finalState",
            	    											lv_finalState_33_0,
            	    											"su.nsk.iae.rpl.RPL.UpdateStateVariable");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRPL.g:5338:3: ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) )
            	    {
            	    // InternalRPL.g:5338:3: ({...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) ) )
            	    // InternalRPL.g:5339:4: {...}? => ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRPL.g:5339:99: ( ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) ) )
            	    // InternalRPL.g:5340:5: ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRPL.g:5343:8: ({...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' ) )
            	    // InternalRPL.g:5343:9: {...}? => (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5343:18: (otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';' )
            	    // InternalRPL.g:5343:19: otherlv_34= 'premise' ( (lv_prem_35_0= ruleLemmaPremiseFormula ) ) otherlv_36= ';'
            	    {
            	    otherlv_34=(Token)match(input,69,FOLLOW_62); 

            	    								newLeafNode(otherlv_34, grammarAccess.getLemmaAccess().getPremiseKeyword_6_0());
            	    							
            	    // InternalRPL.g:5347:8: ( (lv_prem_35_0= ruleLemmaPremiseFormula ) )
            	    // InternalRPL.g:5348:9: (lv_prem_35_0= ruleLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5348:9: (lv_prem_35_0= ruleLemmaPremiseFormula )
            	    // InternalRPL.g:5349:10: lv_prem_35_0= ruleLemmaPremiseFormula
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getPremLemmaPremiseFormulaParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_prem_35_0=ruleLemmaPremiseFormula();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"prem",
            	    											lv_prem_35_0,
            	    											"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_36=(Token)match(input,21,FOLLOW_61); 

            	    								newLeafNode(otherlv_36, grammarAccess.getLemmaAccess().getSemicolonKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLemmaAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canLeave(grammarAccess.getLemmaAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getLemmaAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLemma"


    // $ANTLR start "entryRuleLemmaPremiseFormula"
    // InternalRPL.g:5387:1: entryRuleLemmaPremiseFormula returns [EObject current=null] : iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF ;
    public final EObject entryRuleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5387:60: (iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF )
            // InternalRPL.g:5388:2: iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF
            {
             newCompositeNode(grammarAccess.getLemmaPremiseFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLemmaPremiseFormula=ruleLemmaPremiseFormula();

            state._fsp--;

             current =iv_ruleLemmaPremiseFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLemmaPremiseFormula"


    // $ANTLR start "ruleLemmaPremiseFormula"
    // InternalRPL.g:5394:1: ruleLemmaPremiseFormula returns [EObject current=null] : (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) ;
    public final EObject ruleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_IMPLICATION_2=null;
        EObject this_DisjunctionLemmaPremiseFormula_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5400:2: ( (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) )
            // InternalRPL.g:5401:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            {
            // InternalRPL.g:5401:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_NEGATION && LA100_0<=RULE_BOOLEAN_LITERAL)||LA100_0==24||LA100_0==36||LA100_0==70) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_ID) ) {
                int LA100_2 = input.LA(2);

                if ( (LA100_2==24) ) {
                    int LA100_3 = input.LA(3);

                    if ( (LA100_3==25||LA100_3==28||LA100_3==38||LA100_3==42) ) {
                        alt100=1;
                    }
                    else if ( (LA100_3==RULE_ID) ) {
                        int LA100_4 = input.LA(4);

                        if ( (LA100_4==27) ) {
                            alt100=1;
                        }
                        else if ( (LA100_4==29) ) {
                            int LA100_5 = input.LA(5);

                            if ( (LA100_5==EOF||(LA100_5>=RULE_DISJUNCTION && LA100_5<=RULE_CONJUNCTION)||LA100_5==21||LA100_5==29) ) {
                                alt100=1;
                            }
                            else if ( (LA100_5==RULE_IMPLICATION) ) {
                                alt100=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 100, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 100, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA100_2==EOF||(LA100_2>=RULE_DISJUNCTION && LA100_2<=RULE_CONJUNCTION)||LA100_2==21||LA100_2==29) ) {
                    alt100=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalRPL.g:5402:3: this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula
                    {

                    			newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjunctionLemmaPremiseFormula_0=ruleDisjunctionLemmaPremiseFormula();

                    state._fsp--;


                    			current = this_DisjunctionLemmaPremiseFormula_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:5411:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    {
                    // InternalRPL.g:5411:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    // InternalRPL.g:5412:4: ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    {
                    // InternalRPL.g:5412:4: ( (lv_left_1_0= ruleFunApplication ) )
                    // InternalRPL.g:5413:5: (lv_left_1_0= ruleFunApplication )
                    {
                    // InternalRPL.g:5413:5: (lv_left_1_0= ruleFunApplication )
                    // InternalRPL.g:5414:6: lv_left_1_0= ruleFunApplication
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getLeftFunApplicationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_left_1_0=ruleFunApplication();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaPremiseFormulaRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_1_0,
                    							"su.nsk.iae.rpl.RPL.FunApplication");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_IMPLICATION_2=(Token)match(input,RULE_IMPLICATION,FOLLOW_62); 

                    				newLeafNode(this_IMPLICATION_2, grammarAccess.getLemmaPremiseFormulaAccess().getIMPLICATIONTerminalRuleCall_1_1());
                    			
                    // InternalRPL.g:5435:4: ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5436:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5436:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5437:6: lv_right_3_0= ruleLemmaPremiseFormula
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getRightLemmaPremiseFormulaParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleLemmaPremiseFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaPremiseFormulaRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLemmaPremiseFormula"


    // $ANTLR start "entryRuleDisjunctionLemmaPremiseFormula"
    // InternalRPL.g:5459:1: entryRuleDisjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5459:71: (iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5460:2: iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjunctionLemmaPremiseFormula=ruleDisjunctionLemmaPremiseFormula();

            state._fsp--;

             current =iv_ruleDisjunctionLemmaPremiseFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunctionLemmaPremiseFormula"


    // $ANTLR start "ruleDisjunctionLemmaPremiseFormula"
    // InternalRPL.g:5466:1: ruleDisjunctionLemmaPremiseFormula returns [EObject current=null] : (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5472:2: ( (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5473:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5473:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5474:3: this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_ConjunctionLemmaPremiseFormula_0=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;


            			current = this_ConjunctionLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5482:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_DISJUNCTION) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalRPL.g:5483:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5483:4: ()
            	    // InternalRPL.g:5484:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_62); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5494:4: ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5495:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5495:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5496:6: lv_right_3_0= ruleDisjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getRightDisjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleDisjunctionLemmaPremiseFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisjunctionLemmaPremiseFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.DisjunctionLemmaPremiseFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunctionLemmaPremiseFormula"


    // $ANTLR start "entryRuleConjunctionLemmaPremiseFormula"
    // InternalRPL.g:5518:1: entryRuleConjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5518:71: (iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5519:2: iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF
            {
             newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjunctionLemmaPremiseFormula=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;

             current =iv_ruleConjunctionLemmaPremiseFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionLemmaPremiseFormula"


    // $ANTLR start "ruleConjunctionLemmaPremiseFormula"
    // InternalRPL.g:5525:1: ruleConjunctionLemmaPremiseFormula returns [EObject current=null] : (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5531:2: ( (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5532:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5532:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5533:3: this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getPrimaryLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PrimaryLemmaPremiseFormula_0=rulePrimaryLemmaPremiseFormula();

            state._fsp--;


            			current = this_PrimaryLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5541:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_CONJUNCTION) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalRPL.g:5542:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5542:4: ()
            	    // InternalRPL.g:5543:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_62); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5553:4: ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5554:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5554:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5555:6: lv_right_3_0= ruleConjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getRightConjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleConjunctionLemmaPremiseFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjunctionLemmaPremiseFormulaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.rpl.RPL.ConjunctionLemmaPremiseFormula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionLemmaPremiseFormula"


    // $ANTLR start "entryRulePrimaryLemmaPremiseFormula"
    // InternalRPL.g:5577:1: entryRulePrimaryLemmaPremiseFormula returns [EObject current=null] : iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF ;
    public final EObject entryRulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5577:67: (iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF )
            // InternalRPL.g:5578:2: iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF
            {
             newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryLemmaPremiseFormula=rulePrimaryLemmaPremiseFormula();

            state._fsp--;

             current =iv_rulePrimaryLemmaPremiseFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryLemmaPremiseFormula"


    // $ANTLR start "rulePrimaryLemmaPremiseFormula"
    // InternalRPL.g:5584:1: rulePrimaryLemmaPremiseFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_alwaysImp_1_0 = null;

        EObject lv_inst_2_0 = null;

        EObject lv_nestedFormula_4_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5590:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:5591:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:5591:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 36:
                {
                alt103=1;
                }
                break;
            case RULE_ID:
                {
                int LA103_2 = input.LA(2);

                if ( (LA103_2==24) ) {
                    int LA103_5 = input.LA(3);

                    if ( (LA103_5==25||LA103_5==28||LA103_5==38||LA103_5==42) ) {
                        alt103=3;
                    }
                    else if ( (LA103_5==RULE_ID) ) {
                        alt103=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA103_2==EOF||(LA103_2>=RULE_DISJUNCTION && LA103_2<=RULE_CONJUNCTION)||LA103_2==21||LA103_2==29) ) {
                    alt103=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;
                }
                }
                break;
            case 70:
                {
                alt103=2;
                }
                break;
            case 24:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalRPL.g:5592:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:5592:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:5593:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:5593:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:5594:5: lv_atomic_0_0= ruleNegationFormula
                    {

                    					newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getAtomicNegationFormulaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atomic_0_0=ruleNegationFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryLemmaPremiseFormulaRule());
                    					}
                    					set(
                    						current,
                    						"atomic",
                    						lv_atomic_0_0,
                    						"su.nsk.iae.rpl.RPL.NegationFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:5612:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    {
                    // InternalRPL.g:5612:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    // InternalRPL.g:5613:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    {
                    // InternalRPL.g:5613:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    // InternalRPL.g:5614:5: lv_alwaysImp_1_0= ruleAlwaysImplication
                    {

                    					newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getAlwaysImpAlwaysImplicationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alwaysImp_1_0=ruleAlwaysImplication();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryLemmaPremiseFormulaRule());
                    					}
                    					set(
                    						current,
                    						"alwaysImp",
                    						lv_alwaysImp_1_0,
                    						"su.nsk.iae.rpl.RPL.AlwaysImplication");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:5632:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    {
                    // InternalRPL.g:5632:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    // InternalRPL.g:5633:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    {
                    // InternalRPL.g:5633:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    // InternalRPL.g:5634:5: lv_inst_2_0= rulePastExtraInvariantPatternInstance
                    {

                    					newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getInstPastExtraInvariantPatternInstanceParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_inst_2_0=rulePastExtraInvariantPatternInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryLemmaPremiseFormulaRule());
                    					}
                    					set(
                    						current,
                    						"inst",
                    						lv_inst_2_0,
                    						"su.nsk.iae.rpl.RPL.PastExtraInvariantPatternInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:5652:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:5652:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    // InternalRPL.g:5653:4: otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:5657:4: ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5658:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5658:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5659:6: lv_nestedFormula_4_0= ruleLemmaPremiseFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getNestedFormulaLemmaPremiseFormulaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestedFormula_4_0=ruleLemmaPremiseFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryLemmaPremiseFormulaRule());
                    						}
                    						set(
                    							current,
                    							"nestedFormula",
                    							lv_nestedFormula_4_0,
                    							"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryLemmaPremiseFormula"


    // $ANTLR start "entryRuleAlwaysImplication"
    // InternalRPL.g:5685:1: entryRuleAlwaysImplication returns [EObject current=null] : iv_ruleAlwaysImplication= ruleAlwaysImplication EOF ;
    public final EObject entryRuleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplication = null;


        try {
            // InternalRPL.g:5685:58: (iv_ruleAlwaysImplication= ruleAlwaysImplication EOF )
            // InternalRPL.g:5686:2: iv_ruleAlwaysImplication= ruleAlwaysImplication EOF
            {
             newCompositeNode(grammarAccess.getAlwaysImplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlwaysImplication=ruleAlwaysImplication();

            state._fsp--;

             current =iv_ruleAlwaysImplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlwaysImplication"


    // $ANTLR start "ruleAlwaysImplication"
    // InternalRPL.g:5692:1: ruleAlwaysImplication returns [EObject current=null] : (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAtomicFormula ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAtomicFormula ) ) otherlv_7= ')' ) ;
    public final EObject ruleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5698:2: ( (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAtomicFormula ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAtomicFormula ) ) otherlv_7= ')' ) )
            // InternalRPL.g:5699:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAtomicFormula ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAtomicFormula ) ) otherlv_7= ')' )
            {
            // InternalRPL.g:5699:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAtomicFormula ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAtomicFormula ) ) otherlv_7= ')' )
            // InternalRPL.g:5700:3: otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAtomicFormula ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAtomicFormula ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationAccess().getAlwaysimpKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysImplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5708:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:5709:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:5709:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:5710:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlwaysImplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_64); 

            					newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_3());
            		
            // InternalRPL.g:5725:3: ( (lv_left_4_0= ruleAtomicFormula ) )
            // InternalRPL.g:5726:4: (lv_left_4_0= ruleAtomicFormula )
            {
            // InternalRPL.g:5726:4: (lv_left_4_0= ruleAtomicFormula )
            // InternalRPL.g:5727:5: lv_left_4_0= ruleAtomicFormula
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getLeftAtomicFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_64);
            lv_left_4_0=ruleAtomicFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysImplicationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"su.nsk.iae.rpl.RPL.AtomicFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_5());
            		
            // InternalRPL.g:5748:3: ( (lv_right_6_0= ruleAtomicFormula ) )
            // InternalRPL.g:5749:4: (lv_right_6_0= ruleAtomicFormula )
            {
            // InternalRPL.g:5749:4: (lv_right_6_0= ruleAtomicFormula )
            // InternalRPL.g:5750:5: lv_right_6_0= ruleAtomicFormula
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getRightAtomicFormulaParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_right_6_0=ruleAtomicFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysImplicationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"su.nsk.iae.rpl.RPL.AtomicFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAlwaysImplicationAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlwaysImplication"


    // $ANTLR start "entryRulePastExtraInvariantPatternInstance"
    // InternalRPL.g:5775:1: entryRulePastExtraInvariantPatternInstance returns [EObject current=null] : iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF ;
    public final EObject entryRulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPatternInstance = null;


        try {
            // InternalRPL.g:5775:74: (iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF )
            // InternalRPL.g:5776:2: iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastExtraInvariantPatternInstance=rulePastExtraInvariantPatternInstance();

            state._fsp--;

             current =iv_rulePastExtraInvariantPatternInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePastExtraInvariantPatternInstance"


    // $ANTLR start "rulePastExtraInvariantPatternInstance"
    // InternalRPL.g:5782:1: rulePastExtraInvariantPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) ;
    public final EObject rulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_cParams_4_0 = null;

        EObject lv_cParams_6_0 = null;

        EObject lv_fnParams_9_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fmParams_14_0 = null;

        EObject lv_fmParams_16_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5788:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) )
            // InternalRPL.g:5789:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
            {
            // InternalRPL.g:5789:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
            // InternalRPL.g:5790:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')'
            {
            // InternalRPL.g:5790:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:5791:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:5791:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:5792:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getPatternPastExtraInvariantPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5807:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==25) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalRPL.g:5808:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:5816:4: ( (lv_cParams_4_0= ruleConstantParameter ) )
                    // InternalRPL.g:5817:5: (lv_cParams_4_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:5817:5: (lv_cParams_4_0= ruleConstantParameter )
                    // InternalRPL.g:5818:6: lv_cParams_4_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_cParams_4_0=ruleConstantParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_4_0,
                    							"su.nsk.iae.rpl.RPL.ConstantParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5835:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==27) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalRPL.g:5836:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:5840:5: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:5841:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:5841:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    // InternalRPL.g:5842:7: lv_cParams_6_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    lv_cParams_6_0=ruleConstantParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cParams",
                    	    								lv_cParams_6_0,
                    	    								"su.nsk.iae.rpl.RPL.ConstantParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5861:3: (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==42) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalRPL.g:5862:4: otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFunKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:5870:4: ( (lv_fnParams_9_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:5871:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:5871:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    // InternalRPL.g:5872:6: lv_fnParams_9_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_fnParams_9_0=ruleFunctionalParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fnParams",
                    							lv_fnParams_9_0,
                    							"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5889:4: (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==27) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalRPL.g:5890:5: otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:5894:5: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:5895:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:5895:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:5896:7: lv_fnParams_11_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_67);
                    	    lv_fnParams_11_0=ruleFunctionalParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fnParams",
                    	    								lv_fnParams_11_0,
                    	    								"su.nsk.iae.rpl.RPL.FunctionalParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5915:3: (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==28) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalRPL.g:5916:4: otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:5924:4: ( (lv_fmParams_14_0= ruleFormulaParameter ) )
                    // InternalRPL.g:5925:5: (lv_fmParams_14_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:5925:5: (lv_fmParams_14_0= ruleFormulaParameter )
                    // InternalRPL.g:5926:6: lv_fmParams_14_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsFormulaParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_fmParams_14_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_14_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5943:4: (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==27) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalRPL.g:5944:5: otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_7); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:5948:5: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:5949:6: (lv_fmParams_16_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:5949:6: (lv_fmParams_16_0= ruleFormulaParameter )
                    	    // InternalRPL.g:5950:7: lv_fmParams_16_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsFormulaParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
                    	    lv_fmParams_16_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_16_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCurrentKeyword_5());
            		
            // InternalRPL.g:5973:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:5974:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:5974:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:5975:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_18, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getStateUpdateStateVariableCrossReference_6_0());
            				

            }


            }

            otherlv_19=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePastExtraInvariantPatternInstance"


    // $ANTLR start "ruleEqPredicate"
    // InternalRPL.g:5994:1: ruleEqPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) ;
    public final Enumerator ruleEqPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6000:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) )
            // InternalRPL.g:6001:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
            {
            // InternalRPL.g:6001:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==71) ) {
                alt110=1;
            }
            else if ( (LA110_0==72) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalRPL.g:6002:3: (enumLiteral_0= '==' )
                    {
                    // InternalRPL.g:6002:3: (enumLiteral_0= '==' )
                    // InternalRPL.g:6003:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6010:3: (enumLiteral_1= '~=' )
                    {
                    // InternalRPL.g:6010:3: (enumLiteral_1= '~=' )
                    // InternalRPL.g:6011:4: enumLiteral_1= '~='
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getNOT_EQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEqPredicateAccess().getNOT_EQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqPredicate"


    // $ANTLR start "ruleCompPredicate"
    // InternalRPL.g:6021:1: ruleCompPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRPL.g:6027:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalRPL.g:6028:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalRPL.g:6028:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt111=1;
                }
                break;
            case 74:
                {
                alt111=2;
                }
                break;
            case 75:
                {
                alt111=3;
                }
                break;
            case 76:
                {
                alt111=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalRPL.g:6029:3: (enumLiteral_0= '<' )
                    {
                    // InternalRPL.g:6029:3: (enumLiteral_0= '<' )
                    // InternalRPL.g:6030:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6037:3: (enumLiteral_1= '>' )
                    {
                    // InternalRPL.g:6037:3: (enumLiteral_1= '>' )
                    // InternalRPL.g:6038:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6045:3: (enumLiteral_2= '<=' )
                    {
                    // InternalRPL.g:6045:3: (enumLiteral_2= '<=' )
                    // InternalRPL.g:6046:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6053:3: (enumLiteral_3= '>=' )
                    {
                    // InternalRPL.g:6053:3: (enumLiteral_3= '>=' )
                    // InternalRPL.g:6054:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATER_EQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompPredicateAccess().getGREATER_EQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompPredicate"


    // $ANTLR start "ruleAddOperator"
    // InternalRPL.g:6064:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6070:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalRPL.g:6071:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalRPL.g:6071:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==77) ) {
                alt112=1;
            }
            else if ( (LA112_0==49) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalRPL.g:6072:3: (enumLiteral_0= '+' )
                    {
                    // InternalRPL.g:6072:3: (enumLiteral_0= '+' )
                    // InternalRPL.g:6073:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6080:3: (enumLiteral_1= '-' )
                    {
                    // InternalRPL.g:6080:3: (enumLiteral_1= '-' )
                    // InternalRPL.g:6081:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getBMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAddOperatorAccess().getBMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleMulOperator"
    // InternalRPL.g:6091:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRPL.g:6097:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) )
            // InternalRPL.g:6098:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            {
            // InternalRPL.g:6098:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt113=1;
                }
                break;
            case 45:
                {
                alt113=2;
                }
                break;
            case 79:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalRPL.g:6099:3: (enumLiteral_0= '*' )
                    {
                    // InternalRPL.g:6099:3: (enumLiteral_0= '*' )
                    // InternalRPL.g:6100:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6107:3: (enumLiteral_1= '/' )
                    {
                    // InternalRPL.g:6107:3: (enumLiteral_1= '/' )
                    // InternalRPL.g:6108:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6115:3: (enumLiteral_2= 'mod' )
                    {
                    // InternalRPL.g:6115:3: (enumLiteral_2= 'mod' )
                    // InternalRPL.g:6116:4: enumLiteral_2= 'mod'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMulOperatorAccess().getMODEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOperator"


    // $ANTLR start "ruleUnMinus"
    // InternalRPL.g:6126:1: ruleUnMinus returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleUnMinus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRPL.g:6132:2: ( (enumLiteral_0= '-' ) )
            // InternalRPL.g:6133:2: (enumLiteral_0= '-' )
            {
            // InternalRPL.g:6133:2: (enumLiteral_0= '-' )
            // InternalRPL.g:6134:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

            			current = grammarAccess.getUnMinusAccess().getUNMINUSEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getUnMinusAccess().getUNMINUSEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnMinus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000C1B8200400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000032000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0040000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000600800000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001001000320L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000320L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000001001B20L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002032000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002038000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001401000320L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002028000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040032000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040038000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000080200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400800000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000001001A20L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C042000000000L,0x000000000000002CL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000C042002000002L,0x000000000000002CL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000C042008000002L,0x000000000000002CL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000C042000000002L,0x000000000000002CL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000001001000320L,0x0000000000000040L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000044012000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000044018000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000004018000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000004008000000L});

}
