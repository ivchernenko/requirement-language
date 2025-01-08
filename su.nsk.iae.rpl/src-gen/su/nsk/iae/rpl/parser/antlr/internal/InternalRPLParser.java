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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_DISJUNCTION", "RULE_CONJUNCTION", "RULE_NEGATION", "RULE_BOOLEAN_LITERAL", "RULE_POWER_OPERATOR", "RULE_REAL", "RULE_IMPLICATION", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'derivedreq'", "'pattern'", "'('", "'const'", "':'", "','", "'simple'", "'formulas'", "')'", "'='", "'from'", "'with'", "'var'", "'final'", "'current'", "'lambda'", "'.'", "'frm'", "'futurereq'", "'pastreq'", "'futureeinv'", "'fun'", "'pasteinv'", "'derivedeinv'", "'/'", "'..'", "'['", "']'", "'-'", "'requirement'", "'extra'", "'invariant'", "'for'", "'lemmas'", "'{'", "'LS1'", "'LS2'", "'LS3'", "'}'", "'LS4'", "'LS5'", "'LS6'", "'LS7'", "'LS8'", "'LS9'", "'lemma'", "'init'", "'state'", "'premise'", "'alwaysimp'", "'=='", "'~='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'mod'"
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
    public static final int RULE_BOOLEAN_LITERAL=10;
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
    public static final int RULE_POWER_OPERATOR=11;
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
    public static final int RULE_NEGATION=9;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_IMPLICATION=13;
    public static final int RULE_CONJUNCTION=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_DISJUNCTION=7;
    public static final int T__41=41;
    public static final int RULE_INTEGER=6;
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
    // InternalRPL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalRPL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalRPL.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            // InternalRPL.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalRPL.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
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
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"su.nsk.iae.rpl.RPL.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRPL.g:99:3: ( (lv_elements_1_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22||LA2_0==34||(LA2_0>=40 && LA2_0<=42)||(LA2_0>=44 && LA2_0<=45)||(LA2_0>=51 && LA2_0<=52)) ) {
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
            	    				
            	    pushFollow(FOLLOW_4);
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
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRPL.g:141:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalRPL.g:142:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalRPL.g:142:4: (lv_importURI_1_0= RULE_STRING )
            // InternalRPL.g:143:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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
            case 34:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            case 45:
                {
                alt3=5;
                }
                break;
            case 42:
                {
                alt3=6;
                }
                break;
            case 44:
                {
                alt3=7;
                }
                break;
            case 51:
                {
                alt3=8;
                }
                break;
            case 52:
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
    // InternalRPL.g:273:1: ruleDerivedRequirementPattern returns [EObject current=null] : (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_simpleFmParams_12_0 = null;

        EObject lv_simpleFmParam_14_0 = null;

        EObject lv_fmParams_17_0 = null;

        EObject lv_fmParams_19_0 = null;

        EObject lv_definition_22_0 = null;

        AntlrDatatypeRuleToken lv_file_24_0 = null;

        EObject lv_lemmas_27_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:279:2: ( (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' ) )
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' )
            {
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' )
            // InternalRPL.g:281:3: otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedRequirementPatternAccess().getDerivedreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:289:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:290:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:290:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:291:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_10); 

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
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:320:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:321:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:321:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:322:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
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
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:344:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:345:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:345:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:346:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

            // InternalRPL.g:365:3: (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRPL.g:366:4: otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedRequirementPatternAccess().getSimpleKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_5_1());
                    			
                    otherlv_11=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_5_2());
                    			
                    // InternalRPL.g:378:4: ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:379:5: (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:379:5: (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:380:6: lv_simpleFmParams_12_0= ruleSimpleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_simpleFmParams_12_0=ruleSimpleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"simpleFmParams",
                    							lv_simpleFmParams_12_0,
                    							"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:397:4: (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRPL.g:398:5: otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalRPL.g:402:5: ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:403:6: (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:403:6: (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:404:7: lv_simpleFmParam_14_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getSimpleFmParamSimpleFormulaParameterParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_simpleFmParam_14_0=ruleSimpleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParam",
                    	    								lv_simpleFmParam_14_0,
                    	    								"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
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

            // InternalRPL.g:423:3: (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRPL.g:424:4: otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:432:4: ( (lv_fmParams_17_0= ruleFormulaParameter ) )
                    // InternalRPL.g:433:5: (lv_fmParams_17_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:433:5: (lv_fmParams_17_0= ruleFormulaParameter )
                    // InternalRPL.g:434:6: lv_fmParams_17_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_17_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_17_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:451:4: (otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRPL.g:452:5: otherlv_18= ',' ( (lv_fmParams_19_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:456:5: ( (lv_fmParams_19_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:457:6: (lv_fmParams_19_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:457:6: (lv_fmParams_19_0= ruleFormulaParameter )
                    	    // InternalRPL.g:458:7: lv_fmParams_19_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_19_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_19_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getDerivedRequirementPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:481:3: ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRPL.g:482:4: (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) )
                    {
                    // InternalRPL.g:482:4: (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) )
                    // InternalRPL.g:483:5: otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) )
                    {
                    otherlv_21=(Token)match(input,31,FOLLOW_17); 

                    					newLeafNode(otherlv_21, grammarAccess.getDerivedRequirementPatternAccess().getEqualsSignKeyword_8_0_0());
                    				
                    // InternalRPL.g:487:5: ( (lv_definition_22_0= ruleFormula ) )
                    // InternalRPL.g:488:6: (lv_definition_22_0= ruleFormula )
                    {
                    // InternalRPL.g:488:6: (lv_definition_22_0= ruleFormula )
                    // InternalRPL.g:489:7: lv_definition_22_0= ruleFormula
                    {

                    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getDefinitionFormulaParserRuleCall_8_0_1_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_definition_22_0=ruleFormula();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    							set(
                    								current,
                    								"definition",
                    								lv_definition_22_0,
                    								"su.nsk.iae.rpl.RPL.Formula");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:508:4: (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) )
                    {
                    // InternalRPL.g:508:4: (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) )
                    // InternalRPL.g:509:5: otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) )
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_19); 

                    					newLeafNode(otherlv_23, grammarAccess.getDerivedRequirementPatternAccess().getFromKeyword_8_1_0());
                    				
                    // InternalRPL.g:513:5: ( (lv_file_24_0= ruleFilePath ) )
                    // InternalRPL.g:514:6: (lv_file_24_0= ruleFilePath )
                    {
                    // InternalRPL.g:514:6: (lv_file_24_0= ruleFilePath )
                    // InternalRPL.g:515:7: lv_file_24_0= ruleFilePath
                    {

                    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFileFilePathParserRuleCall_8_1_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_file_24_0=ruleFilePath();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    							set(
                    								current,
                    								"file",
                    								lv_file_24_0,
                    								"su.nsk.iae.rpl.RPL.FilePath");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_25=(Token)match(input,33,FOLLOW_8); 

                    					newLeafNode(otherlv_25, grammarAccess.getDerivedRequirementPatternAccess().getWithKeyword_8_1_2());
                    				
                    // InternalRPL.g:536:5: ( (otherlv_26= RULE_ID ) )
                    // InternalRPL.g:537:6: (otherlv_26= RULE_ID )
                    {
                    // InternalRPL.g:537:6: (otherlv_26= RULE_ID )
                    // InternalRPL.g:538:7: otherlv_26= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    						
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_26, grammarAccess.getDerivedRequirementPatternAccess().getExtraInvPatternDerivedExtraInvariantPatternCrossReference_8_1_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:551:3: ( (lv_lemmas_27_0= ruleDerivedLemmas ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==55) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPL.g:552:4: (lv_lemmas_27_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:552:4: (lv_lemmas_27_0= ruleDerivedLemmas )
                    // InternalRPL.g:553:5: lv_lemmas_27_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_lemmas_27_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_27_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getDerivedRequirementPatternAccess().getSemicolonKeyword_10());
            		

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
    // InternalRPL.g:578:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalRPL.g:578:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalRPL.g:579:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalRPL.g:585:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:591:2: ( (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) )
            // InternalRPL.g:592:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            {
            // InternalRPL.g:592:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            // InternalRPL.g:593:3: otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalRPL.g:597:3: ( (lv_vars_1_0= ruleProgramVariable ) )
            // InternalRPL.g:598:4: (lv_vars_1_0= ruleProgramVariable )
            {
            // InternalRPL.g:598:4: (lv_vars_1_0= ruleProgramVariable )
            // InternalRPL.g:599:5: lv_vars_1_0= ruleProgramVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalRPL.g:616:3: (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPL.g:617:4: otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRPL.g:621:4: ( (lv_vars_3_0= ruleProgramVariable ) )
            	    // InternalRPL.g:622:5: (lv_vars_3_0= ruleProgramVariable )
            	    {
            	    // InternalRPL.g:622:5: (lv_vars_3_0= ruleProgramVariable )
            	    // InternalRPL.g:623:6: lv_vars_3_0= ruleProgramVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop12;
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
    // InternalRPL.g:649:1: entryRuleProgramVariable returns [EObject current=null] : iv_ruleProgramVariable= ruleProgramVariable EOF ;
    public final EObject entryRuleProgramVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramVariable = null;


        try {
            // InternalRPL.g:649:56: (iv_ruleProgramVariable= ruleProgramVariable EOF )
            // InternalRPL.g:650:2: iv_ruleProgramVariable= ruleProgramVariable EOF
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
    // InternalRPL.g:656:1: ruleProgramVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProgramVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:662:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:663:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:663:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:664:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:664:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:665:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:684:1: entryRuleUpdateStateVariable returns [EObject current=null] : iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF ;
    public final EObject entryRuleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStateVariable = null;


        try {
            // InternalRPL.g:684:60: (iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF )
            // InternalRPL.g:685:2: iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF
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
    // InternalRPL.g:691:1: ruleUpdateStateVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:697:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:698:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:698:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:699:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:699:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:700:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:719:1: entryRuleConstantParameter returns [EObject current=null] : iv_ruleConstantParameter= ruleConstantParameter EOF ;
    public final EObject entryRuleConstantParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParameter = null;


        try {
            // InternalRPL.g:719:58: (iv_ruleConstantParameter= ruleConstantParameter EOF )
            // InternalRPL.g:720:2: iv_ruleConstantParameter= ruleConstantParameter EOF
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
    // InternalRPL.g:726:1: ruleConstantParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstantParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:732:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:733:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:733:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:734:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:734:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:735:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:754:1: entryRuleFormulaParameter returns [EObject current=null] : iv_ruleFormulaParameter= ruleFormulaParameter EOF ;
    public final EObject entryRuleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameter = null;


        try {
            // InternalRPL.g:754:57: (iv_ruleFormulaParameter= ruleFormulaParameter EOF )
            // InternalRPL.g:755:2: iv_ruleFormulaParameter= ruleFormulaParameter EOF
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
    // InternalRPL.g:761:1: ruleFormulaParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:767:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:768:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:768:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:769:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:769:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:770:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleSimpleFormulaParameter"
    // InternalRPL.g:789:1: entryRuleSimpleFormulaParameter returns [EObject current=null] : iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF ;
    public final EObject entryRuleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFormulaParameter = null;


        try {
            // InternalRPL.g:789:63: (iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF )
            // InternalRPL.g:790:2: iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF
            {
             newCompositeNode(grammarAccess.getSimpleFormulaParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleFormulaParameter=ruleSimpleFormulaParameter();

            state._fsp--;

             current =iv_ruleSimpleFormulaParameter; 
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
    // $ANTLR end "entryRuleSimpleFormulaParameter"


    // $ANTLR start "ruleSimpleFormulaParameter"
    // InternalRPL.g:796:1: ruleSimpleFormulaParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:802:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) )
            // InternalRPL.g:803:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            {
            // InternalRPL.g:803:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            // InternalRPL.g:804:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            {
            // InternalRPL.g:804:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:805:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:805:4: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:806:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSimpleFormulaParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleFormulaParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRPL.g:822:3: (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRPL.g:823:4: otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleFormulaParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:827:4: ( (lv_arity_2_0= RULE_INTEGER ) )
                    // InternalRPL.g:828:5: (lv_arity_2_0= RULE_INTEGER )
                    {
                    // InternalRPL.g:828:5: (lv_arity_2_0= RULE_INTEGER )
                    // InternalRPL.g:829:6: lv_arity_2_0= RULE_INTEGER
                    {
                    lv_arity_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_24); 

                    						newLeafNode(lv_arity_2_0, grammarAccess.getSimpleFormulaParameterAccess().getArityINTEGERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleFormulaParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arity",
                    							lv_arity_2_0,
                    							"su.nsk.iae.rpl.RPL.INTEGER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleFormulaParameterAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSimpleFormulaParameter"


    // $ANTLR start "entryRuleFunctionalParameter"
    // InternalRPL.g:854:1: entryRuleFunctionalParameter returns [EObject current=null] : iv_ruleFunctionalParameter= ruleFunctionalParameter EOF ;
    public final EObject entryRuleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalParameter = null;


        try {
            // InternalRPL.g:854:60: (iv_ruleFunctionalParameter= ruleFunctionalParameter EOF )
            // InternalRPL.g:855:2: iv_ruleFunctionalParameter= ruleFunctionalParameter EOF
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
    // InternalRPL.g:861:1: ruleFunctionalParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:867:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:868:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:868:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:869:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:869:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:870:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:889:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalRPL.g:889:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalRPL.g:890:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalRPL.g:896:1: ruleFormula returns [EObject current=null] : (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:902:2: ( (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) )
            // InternalRPL.g:903:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            {
            // InternalRPL.g:903:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            // InternalRPL.g:904:3: this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getFormulaAccess().getConjunctionFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionFormula_0=ruleConjunctionFormula();

            state._fsp--;


            			current = this_ConjunctionFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:912:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DISJUNCTION) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRPL.g:913:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) )
            	    {
            	    // InternalRPL.g:913:4: ()
            	    // InternalRPL.g:914:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_17); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:924:4: ( (lv_right_3_0= ruleFormula ) )
            	    // InternalRPL.g:925:5: (lv_right_3_0= ruleFormula )
            	    {
            	    // InternalRPL.g:925:5: (lv_right_3_0= ruleFormula )
            	    // InternalRPL.g:926:6: lv_right_3_0= ruleFormula
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getRightFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop14;
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
    // InternalRPL.g:948:1: entryRuleConjunctionFormula returns [EObject current=null] : iv_ruleConjunctionFormula= ruleConjunctionFormula EOF ;
    public final EObject entryRuleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFormula = null;


        try {
            // InternalRPL.g:948:59: (iv_ruleConjunctionFormula= ruleConjunctionFormula EOF )
            // InternalRPL.g:949:2: iv_ruleConjunctionFormula= ruleConjunctionFormula EOF
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
    // InternalRPL.g:955:1: ruleConjunctionFormula returns [EObject current=null] : (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) ;
    public final EObject ruleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:961:2: ( (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) )
            // InternalRPL.g:962:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            {
            // InternalRPL.g:962:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            // InternalRPL.g:963:3: this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getPrimaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryFormula_0=rulePrimaryFormula();

            state._fsp--;


            			current = this_PrimaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:971:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_CONJUNCTION) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPL.g:972:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    {
            	    // InternalRPL.g:972:4: ()
            	    // InternalRPL.g:973:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionFormulaAccess().getConjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_17); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:983:4: ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    // InternalRPL.g:984:5: (lv_right_3_0= ruleConjunctionFormula )
            	    {
            	    // InternalRPL.g:984:5: (lv_right_3_0= ruleConjunctionFormula )
            	    // InternalRPL.g:985:6: lv_right_3_0= ruleConjunctionFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getRightConjunctionFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop15;
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
    // InternalRPL.g:1007:1: entryRulePrimaryFormula returns [EObject current=null] : iv_rulePrimaryFormula= rulePrimaryFormula EOF ;
    public final EObject entryRulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryFormula = null;


        try {
            // InternalRPL.g:1007:55: (iv_rulePrimaryFormula= rulePrimaryFormula EOF )
            // InternalRPL.g:1008:2: iv_rulePrimaryFormula= rulePrimaryFormula EOF
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
    // InternalRPL.g:1014:1: rulePrimaryFormula returns [EObject current=null] : ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_patternInst_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1020:2: ( ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:1021:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:1021:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRPL.g:1022:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1022:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    // InternalRPL.g:1023:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    {
                    // InternalRPL.g:1023:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    // InternalRPL.g:1024:5: lv_patternInst_0_0= ruleOuterRequirementPatternInstance
                    {

                    					newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getPatternInstOuterRequirementPatternInstanceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_patternInst_0_0=ruleOuterRequirementPatternInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryFormulaRule());
                    					}
                    					set(
                    						current,
                    						"patternInst",
                    						lv_patternInst_0_0,
                    						"su.nsk.iae.rpl.RPL.OuterRequirementPatternInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:1042:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:1042:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:1043:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:1047:4: ( (lv_nestedFormula_2_0= ruleFormula ) )
                    // InternalRPL.g:1048:5: (lv_nestedFormula_2_0= ruleFormula )
                    {
                    // InternalRPL.g:1048:5: (lv_nestedFormula_2_0= ruleFormula )
                    // InternalRPL.g:1049:6: lv_nestedFormula_2_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getNestedFormulaFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOuterRequirementPatternInstance"
    // InternalRPL.g:1075:1: entryRuleOuterRequirementPatternInstance returns [EObject current=null] : iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF ;
    public final EObject entryRuleOuterRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1075:72: (iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF )
            // InternalRPL.g:1076:2: iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOuterRequirementPatternInstance=ruleOuterRequirementPatternInstance();

            state._fsp--;

             current =iv_ruleOuterRequirementPatternInstance; 
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
    // $ANTLR end "entryRuleOuterRequirementPatternInstance"


    // $ANTLR start "ruleOuterRequirementPatternInstance"
    // InternalRPL.g:1082:1: ruleOuterRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) ;
    public final EObject ruleOuterRequirementPatternInstance() throws RecognitionException {
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
            // InternalRPL.g:1088:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) )
            // InternalRPL.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            {
            // InternalRPL.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            // InternalRPL.g:1090:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')'
            {
            // InternalRPL.g:1090:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1091:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1091:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1092:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOuterRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getOuterRequirementPatternInstanceAccess().getPatternOuterRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOuterRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1107:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRPL.g:1108:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getOuterRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1116:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1117:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1117:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1118:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_cParams_4_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_4_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1135:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRPL.g:1136:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_28); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1140:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1141:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1141:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1142:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_cParams_6_0=ruleTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1161:3: (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPL.g:1162:4: otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:1170:4: ( (lv_fmParams_9_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1171:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1171:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1172:6: lv_fmParams_9_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_fmParams_9_0=ruleFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_9_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1189:4: (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRPL.g:1190:5: otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_30); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:1194:5: ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1195:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1195:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1196:7: lv_fmParams_11_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_fmParams_11_0=ruleFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1215:3: (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRPL.g:1216:4: otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getOuterRequirementPatternInstanceAccess().getFinalKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1224:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRPL.g:1225:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRPL.g:1225:5: (otherlv_14= RULE_ID )
                    // InternalRPL.g:1226:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOuterRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_14, grammarAccess.getOuterRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1237:4: (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRPL.g:1238:5: otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,36,FOLLOW_11); 

                            					newLeafNode(otherlv_15, grammarAccess.getOuterRequirementPatternInstanceAccess().getCurrentKeyword_4_3_0());
                            				
                            otherlv_16=(Token)match(input,26,FOLLOW_8); 

                            					newLeafNode(otherlv_16, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_4_3_1());
                            				
                            // InternalRPL.g:1246:5: ( (otherlv_17= RULE_ID ) )
                            // InternalRPL.g:1247:6: (otherlv_17= RULE_ID )
                            {
                            // InternalRPL.g:1247:6: (otherlv_17= RULE_ID )
                            // InternalRPL.g:1248:7: otherlv_17= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getOuterRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(otherlv_17, grammarAccess.getOuterRequirementPatternInstanceAccess().getCurStateUpdateStateVariableCrossReference_4_3_2_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getOuterRequirementPatternInstanceAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleOuterRequirementPatternInstance"


    // $ANTLR start "entryRuleFormulaParameterValue"
    // InternalRPL.g:1269:1: entryRuleFormulaParameterValue returns [EObject current=null] : iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF ;
    public final EObject entryRuleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameterValue = null;


        try {
            // InternalRPL.g:1269:62: (iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF )
            // InternalRPL.g:1270:2: iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF
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
    // InternalRPL.g:1276:1: ruleFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) ;
    public final EObject ruleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1282:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) )
            // InternalRPL.g:1283:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            {
            // InternalRPL.g:1283:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            // InternalRPL.g:1284:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) )
            {
            // InternalRPL.g:1284:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRPL.g:1285:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:1289:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRPL.g:1290:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:1290:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:1291:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    otherlv_2=(Token)match(input,38,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:1313:3: ( (lv_formula_3_0= ruleInnerFormula ) )
            // InternalRPL.g:1314:4: (lv_formula_3_0= ruleInnerFormula )
            {
            // InternalRPL.g:1314:4: (lv_formula_3_0= ruleInnerFormula )
            // InternalRPL.g:1315:5: lv_formula_3_0= ruleInnerFormula
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
    // InternalRPL.g:1336:1: entryRuleInnerFormula returns [EObject current=null] : iv_ruleInnerFormula= ruleInnerFormula EOF ;
    public final EObject entryRuleInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFormula = null;


        try {
            // InternalRPL.g:1336:53: (iv_ruleInnerFormula= ruleInnerFormula EOF )
            // InternalRPL.g:1337:2: iv_ruleInnerFormula= ruleInnerFormula EOF
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
    // InternalRPL.g:1343:1: ruleInnerFormula returns [EObject current=null] : (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) ;
    public final EObject ruleInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1349:2: ( (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) )
            // InternalRPL.g:1350:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            {
            // InternalRPL.g:1350:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            // InternalRPL.g:1351:3: this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getInnerFormulaAccess().getConjunctionInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionInnerFormula_0=ruleConjunctionInnerFormula();

            state._fsp--;


            			current = this_ConjunctionInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1359:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DISJUNCTION) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPL.g:1360:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) )
            	    {
            	    // InternalRPL.g:1360:4: ()
            	    // InternalRPL.g:1361:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInnerFormulaAccess().getInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_30); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getInnerFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1371:4: ( (lv_right_3_0= ruleInnerFormula ) )
            	    // InternalRPL.g:1372:5: (lv_right_3_0= ruleInnerFormula )
            	    {
            	    // InternalRPL.g:1372:5: (lv_right_3_0= ruleInnerFormula )
            	    // InternalRPL.g:1373:6: lv_right_3_0= ruleInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getInnerFormulaAccess().getRightInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop25;
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
    // InternalRPL.g:1395:1: entryRuleConjunctionInnerFormula returns [EObject current=null] : iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF ;
    public final EObject entryRuleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionInnerFormula = null;


        try {
            // InternalRPL.g:1395:64: (iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF )
            // InternalRPL.g:1396:2: iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF
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
    // InternalRPL.g:1402:1: ruleConjunctionInnerFormula returns [EObject current=null] : (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) ;
    public final EObject ruleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1408:2: ( (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) )
            // InternalRPL.g:1409:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            {
            // InternalRPL.g:1409:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            // InternalRPL.g:1410:3: this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getPrimaryInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryInnerFormula_0=rulePrimaryInnerFormula();

            state._fsp--;


            			current = this_PrimaryInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1418:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_CONJUNCTION) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPL.g:1419:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    {
            	    // InternalRPL.g:1419:4: ()
            	    // InternalRPL.g:1420:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionInnerFormulaAccess().getConjunctionInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_30); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionInnerFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1430:4: ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    // InternalRPL.g:1431:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    {
            	    // InternalRPL.g:1431:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    // InternalRPL.g:1432:6: lv_right_3_0= ruleConjunctionInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getRightConjunctionInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop26;
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
    // InternalRPL.g:1454:1: entryRulePrimaryInnerFormula returns [EObject current=null] : iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF ;
    public final EObject entryRulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInnerFormula = null;


        try {
            // InternalRPL.g:1454:60: (iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF )
            // InternalRPL.g:1455:2: iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF
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
    // InternalRPL.g:1461:1: rulePrimaryInnerFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_patternInst_1_0 = null;

        EObject lv_nestedFormula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1467:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) )
            // InternalRPL.g:1468:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            {
            // InternalRPL.g:1468:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 39:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==24) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==RULE_ID) ) {
                        alt27=1;
                    }
                    else if ( (LA27_4==25||(LA27_4>=28 && LA27_4<=30)||LA27_4==35) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==EOF||(LA27_2>=RULE_DISJUNCTION && LA27_2<=RULE_CONJUNCTION)||LA27_2==27||LA27_2==30||LA27_2==35) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRPL.g:1469:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:1469:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:1470:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:1470:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:1471:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:1489:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1489:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    // InternalRPL.g:1490:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    {
                    // InternalRPL.g:1490:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    // InternalRPL.g:1491:5: lv_patternInst_1_0= ruleBasicRequirementPatternInstance
                    {

                    					newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getPatternInstBasicRequirementPatternInstanceParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_patternInst_1_0=ruleBasicRequirementPatternInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryInnerFormulaRule());
                    					}
                    					set(
                    						current,
                    						"patternInst",
                    						lv_patternInst_1_0,
                    						"su.nsk.iae.rpl.RPL.BasicRequirementPatternInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:1509:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1509:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    // InternalRPL.g:1510:4: otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryInnerFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRPL.g:1514:4: ( (lv_nestedFormula_3_0= ruleInnerFormula ) )
                    // InternalRPL.g:1515:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    {
                    // InternalRPL.g:1515:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    // InternalRPL.g:1516:6: lv_nestedFormula_3_0= ruleInnerFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getNestedFormulaInnerFormulaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:1542:1: entryRuleNegationFormula returns [EObject current=null] : iv_ruleNegationFormula= ruleNegationFormula EOF ;
    public final EObject entryRuleNegationFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationFormula = null;


        try {
            // InternalRPL.g:1542:56: (iv_ruleNegationFormula= ruleNegationFormula EOF )
            // InternalRPL.g:1543:2: iv_ruleNegationFormula= ruleNegationFormula EOF
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
    // InternalRPL.g:1549:1: ruleNegationFormula returns [EObject current=null] : ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) ;
    public final EObject ruleNegationFormula() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1555:2: ( ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) )
            // InternalRPL.g:1556:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            {
            // InternalRPL.g:1556:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            // InternalRPL.g:1557:3: ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) )
            {
            // InternalRPL.g:1557:3: ( (lv_neg_0_0= RULE_NEGATION ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NEGATION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRPL.g:1558:4: (lv_neg_0_0= RULE_NEGATION )
                    {
                    // InternalRPL.g:1558:4: (lv_neg_0_0= RULE_NEGATION )
                    // InternalRPL.g:1559:5: lv_neg_0_0= RULE_NEGATION
                    {
                    lv_neg_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_34); 

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

            // InternalRPL.g:1575:3: ( (lv_right_1_0= ruleAtomicFormula ) )
            // InternalRPL.g:1576:4: (lv_right_1_0= ruleAtomicFormula )
            {
            // InternalRPL.g:1576:4: (lv_right_1_0= ruleAtomicFormula )
            // InternalRPL.g:1577:5: lv_right_1_0= ruleAtomicFormula
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
    // InternalRPL.g:1598:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // InternalRPL.g:1598:54: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // InternalRPL.g:1599:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
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
    // InternalRPL.g:1605:1: ruleAtomicFormula returns [EObject current=null] : ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) ;
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
            // InternalRPL.g:1611:2: ( ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) )
            // InternalRPL.g:1612:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            {
            // InternalRPL.g:1612:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
                {
                alt31=1;
                }
                break;
            case 39:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalRPL.g:1613:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:1613:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:1614:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:1614:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:1615:5: lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL
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
                    // InternalRPL.g:1632:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1632:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalRPL.g:1633:4: otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicFormulaAccess().getFrmKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalRPL.g:1641:4: ( (lv_boolTerm_3_0= ruleTerm ) )
                    // InternalRPL.g:1642:5: (lv_boolTerm_3_0= ruleTerm )
                    {
                    // InternalRPL.g:1642:5: (lv_boolTerm_3_0= ruleTerm )
                    // InternalRPL.g:1643:6: lv_boolTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getAtomicFormulaAccess().getBoolTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:1666:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    {
                    // InternalRPL.g:1666:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    // InternalRPL.g:1667:4: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    {
                    // InternalRPL.g:1667:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRPL.g:1668:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRPL.g:1668:5: (otherlv_5= RULE_ID )
                    // InternalRPL.g:1669:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicFormulaAccess().getFmParamFormulaParameterCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalRPL.g:1680:4: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==24) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRPL.g:1681:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalRPL.g:1685:5: ( (otherlv_7= RULE_ID ) )
                            // InternalRPL.g:1686:6: (otherlv_7= RULE_ID )
                            {
                            // InternalRPL.g:1686:6: (otherlv_7= RULE_ID )
                            // InternalRPL.g:1687:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                            							newLeafNode(otherlv_7, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_1_0());
                            						

                            }


                            }

                            // InternalRPL.g:1698:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==27) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalRPL.g:1699:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_8); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getAtomicFormulaAccess().getCommaKeyword_2_1_2_0());
                            	    					
                            	    // InternalRPL.g:1703:6: ( (otherlv_9= RULE_ID ) )
                            	    // InternalRPL.g:1704:7: (otherlv_9= RULE_ID )
                            	    {
                            	    // InternalRPL.g:1704:7: (otherlv_9= RULE_ID )
                            	    // InternalRPL.g:1705:8: otherlv_9= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            	    								}
                            	    							
                            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

                            	    								newLeafNode(otherlv_9, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBasicRequirementPatternInstance"
    // InternalRPL.g:1727:1: entryRuleBasicRequirementPatternInstance returns [EObject current=null] : iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF ;
    public final EObject entryRuleBasicRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1727:72: (iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF )
            // InternalRPL.g:1728:2: iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF
            {
             newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicRequirementPatternInstance=ruleBasicRequirementPatternInstance();

            state._fsp--;

             current =iv_ruleBasicRequirementPatternInstance; 
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
    // $ANTLR end "entryRuleBasicRequirementPatternInstance"


    // $ANTLR start "ruleBasicRequirementPatternInstance"
    // InternalRPL.g:1734:1: ruleBasicRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )? otherlv_24= ')' ) ;
    public final EObject ruleBasicRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_cParams_4_0 = null;

        EObject lv_cParams_6_0 = null;

        EObject lv_simpleFmParams_10_0 = null;

        EObject lv_simpleFmParams_12_0 = null;

        EObject lv_fmParams_15_0 = null;

        EObject lv_fmParams_17_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1740:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )? otherlv_24= ')' ) )
            // InternalRPL.g:1741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )? otherlv_24= ')' )
            {
            // InternalRPL.g:1741:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )? otherlv_24= ')' )
            // InternalRPL.g:1742:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )? otherlv_24= ')'
            {
            // InternalRPL.g:1742:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1743:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1743:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1744:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getBasicRequirementPatternInstanceAccess().getPatternBasicRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1759:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRPL.g:1760:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1768:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1769:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1769:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1770:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_cParams_4_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"cParams",
                    							lv_cParams_4_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1787:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRPL.g:1788:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_28); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1792:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1793:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1793:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1794:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_cParams_6_0=ruleTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1813:3: (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRPL.g:1814:4: otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicRequirementPatternInstanceAccess().getSimpleKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicRequirementPatternInstanceAccess().getFormulasKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,26,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_3_2());
                    			
                    // InternalRPL.g:1826:4: ( (lv_simpleFmParams_10_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:1827:5: (lv_simpleFmParams_10_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:1827:5: (lv_simpleFmParams_10_0= rulePatternFreeFormula )
                    // InternalRPL.g:1828:6: lv_simpleFmParams_10_0= rulePatternFreeFormula
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_simpleFmParams_10_0=rulePatternFreeFormula();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"simpleFmParams",
                    							lv_simpleFmParams_10_0,
                    							"su.nsk.iae.rpl.RPL.PatternFreeFormula");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1845:4: (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRPL.g:1846:5: otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_37); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalRPL.g:1850:5: ( (lv_simpleFmParams_12_0= rulePatternFreeFormula ) )
                    	    // InternalRPL.g:1851:6: (lv_simpleFmParams_12_0= rulePatternFreeFormula )
                    	    {
                    	    // InternalRPL.g:1851:6: (lv_simpleFmParams_12_0= rulePatternFreeFormula )
                    	    // InternalRPL.g:1852:7: lv_simpleFmParams_12_0= rulePatternFreeFormula
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_simpleFmParams_12_0=rulePatternFreeFormula();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParams",
                    	    								lv_simpleFmParams_12_0,
                    	    								"su.nsk.iae.rpl.RPL.PatternFreeFormula");
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

            // InternalRPL.g:1871:3: (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPL.g:1872:4: otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getBasicRequirementPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_14=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_14, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1880:4: ( (lv_fmParams_15_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1881:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1881:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1882:6: lv_fmParams_15_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_fmParams_15_0=ruleFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_15_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1899:4: (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==27) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRPL.g:1900:5: otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,27,FOLLOW_30); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1904:5: ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1905:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1905:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1906:7: lv_fmParams_17_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_fmParams_17_0=ruleFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_17_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameterValue");
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

            // InternalRPL.g:1925:3: (otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRPL.g:1926:4: otherlv_18= 'final' otherlv_19= ':' ( (otherlv_20= RULE_ID ) ) (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
                    {
                    otherlv_18=(Token)match(input,35,FOLLOW_11); 

                    				newLeafNode(otherlv_18, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinalKeyword_5_0());
                    			
                    otherlv_19=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:1934:4: ( (otherlv_20= RULE_ID ) )
                    // InternalRPL.g:1935:5: (otherlv_20= RULE_ID )
                    {
                    // InternalRPL.g:1935:5: (otherlv_20= RULE_ID )
                    // InternalRPL.g:1936:6: otherlv_20= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_20, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1947:4: (otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==36) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalRPL.g:1948:5: otherlv_21= 'current' otherlv_22= ':' ( (otherlv_23= RULE_ID ) )
                            {
                            otherlv_21=(Token)match(input,36,FOLLOW_11); 

                            					newLeafNode(otherlv_21, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurrentKeyword_5_3_0());
                            				
                            otherlv_22=(Token)match(input,26,FOLLOW_8); 

                            					newLeafNode(otherlv_22, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_5_3_1());
                            				
                            // InternalRPL.g:1956:5: ( (otherlv_23= RULE_ID ) )
                            // InternalRPL.g:1957:6: (otherlv_23= RULE_ID )
                            {
                            // InternalRPL.g:1957:6: (otherlv_23= RULE_ID )
                            // InternalRPL.g:1958:7: otherlv_23= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(otherlv_23, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurStateUpdateStateVariableCrossReference_5_3_2_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getBasicRequirementPatternInstanceAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleBasicRequirementPatternInstance"


    // $ANTLR start "entryRuleFutureRequirementPattern"
    // InternalRPL.g:1979:1: entryRuleFutureRequirementPattern returns [EObject current=null] : iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF ;
    public final EObject entryRuleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureRequirementPattern = null;


        try {
            // InternalRPL.g:1979:65: (iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF )
            // InternalRPL.g:1980:2: iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF
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
    // InternalRPL.g:1986:1: ruleFutureRequirementPattern returns [EObject current=null] : (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) ;
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
            // InternalRPL.g:1992:2: ( (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:1993:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:1993:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:1994:3: otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureRequirementPatternAccess().getFuturereqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2002:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2003:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2003:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2004:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2024:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRPL.g:2025:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2033:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2034:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2034:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2035:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalRPL.g:2052:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRPL.g:2053:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2057:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2058:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2058:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2059:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2078:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRPL.g:2079:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2087:4: ( (lv_fmParams_11_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2088:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2088:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    // InternalRPL.g:2089:6: lv_fmParams_11_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2106:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==27) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalRPL.g:2107:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2111:5: ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2112:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2112:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2113:7: lv_fmParams_13_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_14, grammarAccess.getFutureRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getFutureRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:2140:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:2141:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:2141:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:2142:5: lv_file_16_0= ruleFilePath
            {

            					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFileFilePathParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_17=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getFutureRequirementPatternAccess().getWithKeyword_9());
            		
            // InternalRPL.g:2163:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:2164:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:2164:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:2165:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_18, grammarAccess.getFutureRequirementPatternAccess().getExtraInvPatternFutureExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:2176:3: ( (lv_lessas_19_0= ruleFutureLemmas ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRPL.g:2177:4: (lv_lessas_19_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2177:4: (lv_lessas_19_0= ruleFutureLemmas )
                    // InternalRPL.g:2178:5: lv_lessas_19_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getLessasFutureLemmasParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_6);
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
    // InternalRPL.g:2203:1: entryRulePastRequirementPattern returns [EObject current=null] : iv_rulePastRequirementPattern= rulePastRequirementPattern EOF ;
    public final EObject entryRulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastRequirementPattern = null;


        try {
            // InternalRPL.g:2203:63: (iv_rulePastRequirementPattern= rulePastRequirementPattern EOF )
            // InternalRPL.g:2204:2: iv_rulePastRequirementPattern= rulePastRequirementPattern EOF
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
    // InternalRPL.g:2210:1: rulePastRequirementPattern returns [EObject current=null] : (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) ;
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
            // InternalRPL.g:2216:2: ( (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:2217:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:2217:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:2218:3: otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastRequirementPatternAccess().getPastreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2226:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2227:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2227:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2228:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getPastRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2248:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==25) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRPL.g:2249:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2257:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2258:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2258:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2259:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalRPL.g:2276:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRPL.g:2277:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2281:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2282:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2282:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2283:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2302:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRPL.g:2303:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2311:4: ( (lv_fmParams_11_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2312:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2312:5: (lv_fmParams_11_0= ruleFormulaParameter )
                    // InternalRPL.g:2313:6: lv_fmParams_11_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2330:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalRPL.g:2331:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2335:5: ( (lv_fmParams_13_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2336:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2336:6: (lv_fmParams_13_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2337:7: lv_fmParams_13_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_14, grammarAccess.getPastRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getPastRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:2364:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:2365:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:2365:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:2366:5: lv_file_16_0= ruleFilePath
            {

            					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFileFilePathParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_17=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getPastRequirementPatternAccess().getWithKeyword_9());
            		
            // InternalRPL.g:2387:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:2388:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:2388:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:2389:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_18, grammarAccess.getPastRequirementPatternAccess().getExtraInvPatternPastExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:2400:3: ( (lv_lemmas_19_0= rulePastLemmas ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRPL.g:2401:4: (lv_lemmas_19_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2401:4: (lv_lemmas_19_0= rulePastLemmas )
                    // InternalRPL.g:2402:5: lv_lemmas_19_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getLemmasPastLemmasParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_6);
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
    // InternalRPL.g:2427:1: entryRuleFutureExtraInvariantPattern returns [EObject current=null] : iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF ;
    public final EObject entryRuleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2427:68: (iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF )
            // InternalRPL.g:2428:2: iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF
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
    // InternalRPL.g:2434:1: ruleFutureExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) ;
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
            // InternalRPL.g:2440:2: ( (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2441:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2441:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2442:3: otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureExtraInvariantPatternAccess().getFutureeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2450:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2451:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2451:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2452:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2472:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRPL.g:2473:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2481:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2482:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2482:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2483:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalRPL.g:2500:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==27) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRPL.g:2501:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2505:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2506:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2506:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2507:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2526:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRPL.g:2527:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2535:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2536:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2536:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2537:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalRPL.g:2554:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==27) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalRPL.g:2555:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2559:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2560:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2560:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2561:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2580:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRPL.g:2581:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getFutureExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2589:4: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2590:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2590:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    // InternalRPL.g:2591:6: lv_fmParams_16_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2608:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==27) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalRPL.g:2609:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2613:5: ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2614:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2614:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2615:7: lv_fmParams_18_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,30,FOLLOW_42); 

            			newLeafNode(otherlv_19, grammarAccess.getFutureExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2638:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==32) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRPL.g:2639:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getFutureExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2643:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2644:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2644:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2645:6: lv_file_21_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFileFilePathParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalRPL.g:2663:3: ( (lv_lemmas_22_0= ruleFutureLemmas ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRPL.g:2664:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2664:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    // InternalRPL.g:2665:5: lv_lemmas_22_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getLemmasFutureLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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
    // InternalRPL.g:2690:1: entryRulePastExtraInvariantPattern returns [EObject current=null] : iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF ;
    public final EObject entryRulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2690:66: (iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF )
            // InternalRPL.g:2691:2: iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF
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
    // InternalRPL.g:2697:1: rulePastExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) ;
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
            // InternalRPL.g:2703:2: ( (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2704:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2704:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2705:3: otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternAccess().getPasteinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2713:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2714:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2714:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2715:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2735:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRPL.g:2736:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2744:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2745:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2745:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2746:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalRPL.g:2763:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==27) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRPL.g:2764:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2768:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2769:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2769:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2770:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2789:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==43) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRPL.g:2790:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2798:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2799:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2799:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2800:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalRPL.g:2817:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==27) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRPL.g:2818:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2822:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2823:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2823:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2824:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2843:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRPL.g:2844:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getPastExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2852:4: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    // InternalRPL.g:2853:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:2853:5: (lv_fmParams_16_0= ruleFormulaParameter )
                    // InternalRPL.g:2854:6: lv_fmParams_16_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2871:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==27) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalRPL.g:2872:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2876:5: ( (lv_fmParams_18_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:2877:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2877:6: (lv_fmParams_18_0= ruleFormulaParameter )
                    	    // InternalRPL.g:2878:7: lv_fmParams_18_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,30,FOLLOW_42); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2901:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==32) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRPL.g:2902:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getPastExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2906:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2907:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2907:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2908:6: lv_file_21_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFileFilePathParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalRPL.g:2926:3: ( (lv_lemmas_22_0= rulePastLemmas ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==55) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRPL.g:2927:4: (lv_lemmas_22_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2927:4: (lv_lemmas_22_0= rulePastLemmas )
                    // InternalRPL.g:2928:5: lv_lemmas_22_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getLemmasPastLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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
    // InternalRPL.g:2953:1: entryRuleDerivedExtraInvariantPattern returns [EObject current=null] : iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF ;
    public final EObject entryRuleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2953:69: (iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF )
            // InternalRPL.g:2954:2: iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF
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
    // InternalRPL.g:2960:1: ruleDerivedExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_simpleFmParams_17_0 = null;

        EObject lv_simpleFmParam_19_0 = null;

        EObject lv_fmParams_22_0 = null;

        EObject lv_fmParams_24_0 = null;

        AntlrDatatypeRuleToken lv_file_27_0 = null;

        EObject lv_lemmas_28_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2966:2: ( (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' ) )
            // InternalRPL.g:2967:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' )
            {
            // InternalRPL.g:2967:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' )
            // InternalRPL.g:2968:3: otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getDerivedeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2976:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2977:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2977:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2978:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2998:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==25) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRPL.g:2999:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:3007:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:3008:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:3008:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:3009:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalRPL.g:3026:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==27) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalRPL.g:3027:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:3031:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:3032:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:3032:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:3033:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:3052:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==43) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRPL.g:3053:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:3061:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:3062:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:3062:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:3063:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalRPL.g:3080:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==27) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalRPL.g:3081:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:3085:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:3086:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:3086:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:3087:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:3106:3: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==28) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRPL.g:3107:4: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_6_1());
                    			
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_6_2());
                    			
                    // InternalRPL.g:3119:4: ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:3120:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:3120:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:3121:6: lv_simpleFmParams_17_0= ruleSimpleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_simpleFmParams_17_0=ruleSimpleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"simpleFmParams",
                    							lv_simpleFmParams_17_0,
                    							"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:3138:4: (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==27) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalRPL.g:3139:5: otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalRPL.g:3143:5: ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:3144:6: (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3144:6: (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:3145:7: lv_simpleFmParam_19_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleFmParamSimpleFormulaParameterParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_simpleFmParam_19_0=ruleSimpleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParam",
                    	    								lv_simpleFmParam_19_0,
                    	    								"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
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
                    break;

            }

            // InternalRPL.g:3164:3: (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==29) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRPL.g:3165:4: otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_7_0());
                    			
                    otherlv_21=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_7_1());
                    			
                    // InternalRPL.g:3173:4: ( (lv_fmParams_22_0= ruleFormulaParameter ) )
                    // InternalRPL.g:3174:5: (lv_fmParams_22_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:3174:5: (lv_fmParams_22_0= ruleFormulaParameter )
                    // InternalRPL.g:3175:6: lv_fmParams_22_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_22_0=ruleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_22_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:3192:4: (otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==27) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalRPL.g:3193:5: otherlv_23= ',' ( (lv_fmParams_24_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_23=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRPL.g:3197:5: ( (lv_fmParams_24_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:3198:6: (lv_fmParams_24_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3198:6: (lv_fmParams_24_0= ruleFormulaParameter )
                    	    // InternalRPL.g:3199:7: lv_fmParams_24_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsFormulaParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_24_0=ruleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_24_0,
                    	    								"su.nsk.iae.rpl.RPL.FormulaParameter");
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
                    break;

            }

            otherlv_25=(Token)match(input,30,FOLLOW_42); 

            			newLeafNode(otherlv_25, grammarAccess.getDerivedExtraInvariantPatternAccess().getRightParenthesisKeyword_8());
            		
            // InternalRPL.g:3222:3: (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==32) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRPL.g:3223:4: otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) )
                    {
                    otherlv_26=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_26, grammarAccess.getDerivedExtraInvariantPatternAccess().getFromKeyword_9_0());
                    			
                    // InternalRPL.g:3227:4: ( (lv_file_27_0= ruleFilePath ) )
                    // InternalRPL.g:3228:5: (lv_file_27_0= ruleFilePath )
                    {
                    // InternalRPL.g:3228:5: (lv_file_27_0= ruleFilePath )
                    // InternalRPL.g:3229:6: lv_file_27_0= ruleFilePath
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFileFilePathParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_file_27_0=ruleFilePath();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						set(
                    							current,
                    							"file",
                    							lv_file_27_0,
                    							"su.nsk.iae.rpl.RPL.FilePath");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:3247:3: ( (lv_lemmas_28_0= ruleDerivedLemmas ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==55) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRPL.g:3248:4: (lv_lemmas_28_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:3248:4: (lv_lemmas_28_0= ruleDerivedLemmas )
                    // InternalRPL.g:3249:5: lv_lemmas_28_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getLemmasDerivedLemmasParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_lemmas_28_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_28_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getDerivedExtraInvariantPatternAccess().getSemicolonKeyword_11());
            		

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
    // InternalRPL.g:3274:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalRPL.g:3274:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalRPL.g:3275:2: iv_ruleFilePath= ruleFilePath EOF
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
    // InternalRPL.g:3281:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Dir_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:3287:2: ( ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) )
            // InternalRPL.g:3288:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            {
            // InternalRPL.g:3288:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            // InternalRPL.g:3289:3: (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID
            {
            // InternalRPL.g:3289:3: (kw= '/' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==46) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalRPL.g:3290:4: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRPL.g:3296:3: (this_Dir_1= ruleDir kw= '/' )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==46) ) {
                        alt77=1;
                    }


                }
                else if ( (LA77_0==38||LA77_0==47) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalRPL.g:3297:4: this_Dir_1= ruleDir kw= '/'
            	    {

            	    				newCompositeNode(grammarAccess.getFilePathAccess().getDirParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_46);
            	    this_Dir_1=ruleDir();

            	    state._fsp--;


            	    				current.merge(this_Dir_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,46,FOLLOW_45); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // InternalRPL.g:3324:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // InternalRPL.g:3324:43: (iv_ruleDir= ruleDir EOF )
            // InternalRPL.g:3325:2: iv_ruleDir= ruleDir EOF
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
    // InternalRPL.g:3331:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRPL.g:3337:2: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) )
            // InternalRPL.g:3338:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            {
            // InternalRPL.g:3338:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            int alt78=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt78=1;
                }
                break;
            case 38:
                {
                alt78=2;
                }
                break;
            case 47:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalRPL.g:3339:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3347:3: kw= '.'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:3353:3: kw= '..'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalRPL.g:3362:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalRPL.g:3362:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalRPL.g:3363:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalRPL.g:3369:1: ruleTerm returns [EObject current=null] : (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3375:2: ( (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalRPL.g:3376:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalRPL.g:3376:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalRPL.g:3377:3: this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getConjunctionTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionTerm_0=ruleConjunctionTerm();

            state._fsp--;


            			current = this_ConjunctionTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3385:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_DISJUNCTION) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalRPL.g:3386:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalRPL.g:3386:4: ()
            	    // InternalRPL.g:3387:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getTermAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3397:4: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalRPL.g:3398:5: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalRPL.g:3398:5: (lv_right_3_0= ruleTerm )
            	    // InternalRPL.g:3399:6: lv_right_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop79;
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
    // InternalRPL.g:3421:1: entryRuleConjunctionTerm returns [EObject current=null] : iv_ruleConjunctionTerm= ruleConjunctionTerm EOF ;
    public final EObject entryRuleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionTerm = null;


        try {
            // InternalRPL.g:3421:56: (iv_ruleConjunctionTerm= ruleConjunctionTerm EOF )
            // InternalRPL.g:3422:2: iv_ruleConjunctionTerm= ruleConjunctionTerm EOF
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
    // InternalRPL.g:3428:1: ruleConjunctionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) ;
    public final EObject ruleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3434:2: ( (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) )
            // InternalRPL.g:3435:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            {
            // InternalRPL.g:3435:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            // InternalRPL.g:3436:3: this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3444:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_CONJUNCTION) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalRPL.g:3445:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    {
            	    // InternalRPL.g:3445:4: ()
            	    // InternalRPL.g:3446:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionTermAccess().getConjunctionTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionTermAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3456:4: ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    // InternalRPL.g:3457:5: (lv_right_3_0= ruleConjunctionTerm )
            	    {
            	    // InternalRPL.g:3457:5: (lv_right_3_0= ruleConjunctionTerm )
            	    // InternalRPL.g:3458:6: lv_right_3_0= ruleConjunctionTerm
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionTermAccess().getRightConjunctionTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleConjunctionTerm"


    // $ANTLR start "entryRuleNegationTerm"
    // InternalRPL.g:3480:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalRPL.g:3480:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalRPL.g:3481:2: iv_ruleNegationTerm= ruleNegationTerm EOF
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
    // InternalRPL.g:3487:1: ruleNegationTerm returns [EObject current=null] : (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token this_NEGATION_1=null;
        EObject this_EqTerm_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3493:2: ( (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) )
            // InternalRPL.g:3494:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            {
            // InternalRPL.g:3494:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_INTEGER)||LA81_0==RULE_BOOLEAN_LITERAL||LA81_0==RULE_REAL||LA81_0==24||LA81_0==50) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_NEGATION) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalRPL.g:3495:3: this_EqTerm_0= ruleEqTerm
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
                    // InternalRPL.g:3504:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    {
                    // InternalRPL.g:3504:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    // InternalRPL.g:3505:4: this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) )
                    {
                    this_NEGATION_1=(Token)match(input,RULE_NEGATION,FOLLOW_47); 

                    				newLeafNode(this_NEGATION_1, grammarAccess.getNegationTermAccess().getNEGATIONTerminalRuleCall_1_0());
                    			
                    // InternalRPL.g:3509:4: ( (lv_right_2_0= ruleEqTerm ) )
                    // InternalRPL.g:3510:5: (lv_right_2_0= ruleEqTerm )
                    {
                    // InternalRPL.g:3510:5: (lv_right_2_0= ruleEqTerm )
                    // InternalRPL.g:3511:6: lv_right_2_0= ruleEqTerm
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
    // InternalRPL.g:3533:1: entryRuleEqTerm returns [EObject current=null] : iv_ruleEqTerm= ruleEqTerm EOF ;
    public final EObject entryRuleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqTerm = null;


        try {
            // InternalRPL.g:3533:47: (iv_ruleEqTerm= ruleEqTerm EOF )
            // InternalRPL.g:3534:2: iv_ruleEqTerm= ruleEqTerm EOF
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
    // InternalRPL.g:3540:1: ruleEqTerm returns [EObject current=null] : (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) ;
    public final EObject ruleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompareTerm_0 = null;

        Enumerator lv_eqPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3546:2: ( (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) )
            // InternalRPL.g:3547:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            {
            // InternalRPL.g:3547:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            // InternalRPL.g:3548:3: this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqTermAccess().getCompareTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_CompareTerm_0=ruleCompareTerm();

            state._fsp--;


            			current = this_CompareTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3556:3: ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==72) ) {
                    alt82=1;
                }
                else if ( (LA82_0==73) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalRPL.g:3557:4: () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) )
            	    {
            	    // InternalRPL.g:3557:4: ()
            	    // InternalRPL.g:3558:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqTermAccess().getEqTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3564:4: ( (lv_eqPred_2_0= ruleEqPredicate ) )
            	    // InternalRPL.g:3565:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    {
            	    // InternalRPL.g:3565:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    // InternalRPL.g:3566:6: lv_eqPred_2_0= ruleEqPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getEqPredEqPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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

            	    // InternalRPL.g:3583:4: ( (lv_right_3_0= ruleEqTerm ) )
            	    // InternalRPL.g:3584:5: (lv_right_3_0= ruleEqTerm )
            	    {
            	    // InternalRPL.g:3584:5: (lv_right_3_0= ruleEqTerm )
            	    // InternalRPL.g:3585:6: lv_right_3_0= ruleEqTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getRightEqTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop82;
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
    // InternalRPL.g:3607:1: entryRuleCompareTerm returns [EObject current=null] : iv_ruleCompareTerm= ruleCompareTerm EOF ;
    public final EObject entryRuleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareTerm = null;


        try {
            // InternalRPL.g:3607:52: (iv_ruleCompareTerm= ruleCompareTerm EOF )
            // InternalRPL.g:3608:2: iv_ruleCompareTerm= ruleCompareTerm EOF
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
    // InternalRPL.g:3614:1: ruleCompareTerm returns [EObject current=null] : (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) ;
    public final EObject ruleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AddTerm_0 = null;

        Enumerator lv_compPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3620:2: ( (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) )
            // InternalRPL.g:3621:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            {
            // InternalRPL.g:3621:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            // InternalRPL.g:3622:3: this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareTermAccess().getAddTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_AddTerm_0=ruleAddTerm();

            state._fsp--;


            			current = this_AddTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3630:3: ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            loop83:
            do {
                int alt83=2;
                switch ( input.LA(1) ) {
                case 74:
                    {
                    alt83=1;
                    }
                    break;
                case 75:
                    {
                    alt83=1;
                    }
                    break;
                case 76:
                    {
                    alt83=1;
                    }
                    break;
                case 77:
                    {
                    alt83=1;
                    }
                    break;

                }

                switch (alt83) {
            	case 1 :
            	    // InternalRPL.g:3631:4: () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) )
            	    {
            	    // InternalRPL.g:3631:4: ()
            	    // InternalRPL.g:3632:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareTermAccess().getCompareTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3638:4: ( (lv_compPred_2_0= ruleCompPredicate ) )
            	    // InternalRPL.g:3639:5: (lv_compPred_2_0= ruleCompPredicate )
            	    {
            	    // InternalRPL.g:3639:5: (lv_compPred_2_0= ruleCompPredicate )
            	    // InternalRPL.g:3640:6: lv_compPred_2_0= ruleCompPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getCompPredCompPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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

            	    // InternalRPL.g:3657:4: ( (lv_right_3_0= ruleCompareTerm ) )
            	    // InternalRPL.g:3658:5: (lv_right_3_0= ruleCompareTerm )
            	    {
            	    // InternalRPL.g:3658:5: (lv_right_3_0= ruleCompareTerm )
            	    // InternalRPL.g:3659:6: lv_right_3_0= ruleCompareTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getRightCompareTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop83;
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
    // InternalRPL.g:3681:1: entryRuleAddTerm returns [EObject current=null] : iv_ruleAddTerm= ruleAddTerm EOF ;
    public final EObject entryRuleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTerm = null;


        try {
            // InternalRPL.g:3681:48: (iv_ruleAddTerm= ruleAddTerm EOF )
            // InternalRPL.g:3682:2: iv_ruleAddTerm= ruleAddTerm EOF
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
    // InternalRPL.g:3688:1: ruleAddTerm returns [EObject current=null] : (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) ;
    public final EObject ruleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject this_MulTerm_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3694:2: ( (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) )
            // InternalRPL.g:3695:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            {
            // InternalRPL.g:3695:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            // InternalRPL.g:3696:3: this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddTermAccess().getMulTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_MulTerm_0=ruleMulTerm();

            state._fsp--;


            			current = this_MulTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3704:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==78) ) {
                    alt84=1;
                }
                else if ( (LA84_0==50) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalRPL.g:3705:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) )
            	    {
            	    // InternalRPL.g:3705:4: ()
            	    // InternalRPL.g:3706:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddTermAccess().getAddTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3712:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalRPL.g:3713:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalRPL.g:3713:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalRPL.g:3714:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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

            	    // InternalRPL.g:3731:4: ( (lv_right_3_0= ruleAddTerm ) )
            	    // InternalRPL.g:3732:5: (lv_right_3_0= ruleAddTerm )
            	    {
            	    // InternalRPL.g:3732:5: (lv_right_3_0= ruleAddTerm )
            	    // InternalRPL.g:3733:6: lv_right_3_0= ruleAddTerm
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getRightAddTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_50);
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
            	    break loop84;
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
    // InternalRPL.g:3755:1: entryRuleMulTerm returns [EObject current=null] : iv_ruleMulTerm= ruleMulTerm EOF ;
    public final EObject entryRuleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulTerm = null;


        try {
            // InternalRPL.g:3755:48: (iv_ruleMulTerm= ruleMulTerm EOF )
            // InternalRPL.g:3756:2: iv_ruleMulTerm= ruleMulTerm EOF
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
    // InternalRPL.g:3762:1: ruleMulTerm returns [EObject current=null] : (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) ;
    public final EObject ruleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PowerTerm_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3768:2: ( (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) )
            // InternalRPL.g:3769:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            {
            // InternalRPL.g:3769:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            // InternalRPL.g:3770:3: this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulTermAccess().getPowerTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_PowerTerm_0=rulePowerTerm();

            state._fsp--;


            			current = this_PowerTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3778:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            loop85:
            do {
                int alt85=2;
                switch ( input.LA(1) ) {
                case 79:
                    {
                    alt85=1;
                    }
                    break;
                case 46:
                    {
                    alt85=1;
                    }
                    break;
                case 80:
                    {
                    alt85=1;
                    }
                    break;

                }

                switch (alt85) {
            	case 1 :
            	    // InternalRPL.g:3779:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) )
            	    {
            	    // InternalRPL.g:3779:4: ()
            	    // InternalRPL.g:3780:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulTermAccess().getMulTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3786:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalRPL.g:3787:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalRPL.g:3787:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalRPL.g:3788:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
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

            	    // InternalRPL.g:3805:4: ( (lv_right_3_0= ruleMulTerm ) )
            	    // InternalRPL.g:3806:5: (lv_right_3_0= ruleMulTerm )
            	    {
            	    // InternalRPL.g:3806:5: (lv_right_3_0= ruleMulTerm )
            	    // InternalRPL.g:3807:6: lv_right_3_0= ruleMulTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getRightMulTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_51);
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
            	    break loop85;
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
    // InternalRPL.g:3829:1: entryRulePowerTerm returns [EObject current=null] : iv_rulePowerTerm= rulePowerTerm EOF ;
    public final EObject entryRulePowerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerTerm = null;


        try {
            // InternalRPL.g:3829:50: (iv_rulePowerTerm= rulePowerTerm EOF )
            // InternalRPL.g:3830:2: iv_rulePowerTerm= rulePowerTerm EOF
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
    // InternalRPL.g:3836:1: rulePowerTerm returns [EObject current=null] : (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) ;
    public final EObject rulePowerTerm() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3842:2: ( (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) )
            // InternalRPL.g:3843:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            {
            // InternalRPL.g:3843:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            // InternalRPL.g:3844:3: this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerTermAccess().getUnaryTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_UnaryTerm_0=ruleUnaryTerm();

            state._fsp--;


            			current = this_UnaryTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3852:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_POWER_OPERATOR) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalRPL.g:3853:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) )
            	    {
            	    // InternalRPL.g:3853:4: ()
            	    // InternalRPL.g:3854:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerTermAccess().getPowerTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_47); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerTermAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3864:4: ( (lv_right_3_0= rulePowerTerm ) )
            	    // InternalRPL.g:3865:5: (lv_right_3_0= rulePowerTerm )
            	    {
            	    // InternalRPL.g:3865:5: (lv_right_3_0= rulePowerTerm )
            	    // InternalRPL.g:3866:6: lv_right_3_0= rulePowerTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPowerTermAccess().getRightPowerTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_52);
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
            	    break loop86;
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
    // InternalRPL.g:3888:1: entryRuleUnaryTerm returns [EObject current=null] : iv_ruleUnaryTerm= ruleUnaryTerm EOF ;
    public final EObject entryRuleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTerm = null;


        try {
            // InternalRPL.g:3888:50: (iv_ruleUnaryTerm= ruleUnaryTerm EOF )
            // InternalRPL.g:3889:2: iv_ruleUnaryTerm= ruleUnaryTerm EOF
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
    // InternalRPL.g:3895:1: ruleUnaryTerm returns [EObject current=null] : (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) ;
    public final EObject ruleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryTerm_0 = null;

        Enumerator lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3901:2: ( (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) )
            // InternalRPL.g:3902:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            {
            // InternalRPL.g:3902:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==50) ) {
                switch ( input.LA(2) ) {
                case RULE_REAL:
                    {
                    alt87=1;
                    }
                    break;
                case RULE_ID:
                case RULE_BOOLEAN_LITERAL:
                case 24:
                case 50:
                    {
                    alt87=2;
                    }
                    break;
                case RULE_INTEGER:
                    {
                    alt87=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA87_0>=RULE_ID && LA87_0<=RULE_INTEGER)||LA87_0==RULE_BOOLEAN_LITERAL||LA87_0==RULE_REAL||LA87_0==24) ) {
                alt87=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalRPL.g:3903:3: this_PrimaryTerm_0= rulePrimaryTerm
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
                    // InternalRPL.g:3912:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    {
                    // InternalRPL.g:3912:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    // InternalRPL.g:3913:4: ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) )
                    {
                    // InternalRPL.g:3913:4: ( (lv_unOp_1_0= ruleUnMinus ) )
                    // InternalRPL.g:3914:5: (lv_unOp_1_0= ruleUnMinus )
                    {
                    // InternalRPL.g:3914:5: (lv_unOp_1_0= ruleUnMinus )
                    // InternalRPL.g:3915:6: lv_unOp_1_0= ruleUnMinus
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getUnOpUnMinusEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalRPL.g:3932:4: ( (lv_right_2_0= rulePrimaryTerm ) )
                    // InternalRPL.g:3933:5: (lv_right_2_0= rulePrimaryTerm )
                    {
                    // InternalRPL.g:3933:5: (lv_right_2_0= rulePrimaryTerm )
                    // InternalRPL.g:3934:6: lv_right_2_0= rulePrimaryTerm
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
    // InternalRPL.g:3956:1: entryRulePrimaryTerm returns [EObject current=null] : iv_rulePrimaryTerm= rulePrimaryTerm EOF ;
    public final EObject entryRulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryTerm = null;


        try {
            // InternalRPL.g:3956:52: (iv_rulePrimaryTerm= rulePrimaryTerm EOF )
            // InternalRPL.g:3957:2: iv_rulePrimaryTerm= rulePrimaryTerm EOF
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
    // InternalRPL.g:3963:1: rulePrimaryTerm returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_const_0_0 = null;

        EObject lv_funApp_6_0 = null;

        EObject lv_nestedTerm_8_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3969:2: ( ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) )
            // InternalRPL.g:3970:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            {
            // InternalRPL.g:3970:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            int alt88=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
            case RULE_REAL:
            case 50:
                {
                alt88=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt88=3;
                    }
                    break;
                case EOF:
                case RULE_DISJUNCTION:
                case RULE_CONJUNCTION:
                case RULE_POWER_OPERATOR:
                case 27:
                case 28:
                case 29:
                case 30:
                case 35:
                case 46:
                case 50:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                    {
                    alt88=2;
                    }
                    break;
                case 24:
                    {
                    alt88=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalRPL.g:3971:3: ( (lv_const_0_0= ruleConstant ) )
                    {
                    // InternalRPL.g:3971:3: ( (lv_const_0_0= ruleConstant ) )
                    // InternalRPL.g:3972:4: (lv_const_0_0= ruleConstant )
                    {
                    // InternalRPL.g:3972:4: (lv_const_0_0= ruleConstant )
                    // InternalRPL.g:3973:5: lv_const_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryTermAccess().getConstConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryTermRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_0_0,
                    						"su.nsk.iae.rpl.RPL.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:3991:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalRPL.g:3991:3: ( (otherlv_1= RULE_ID ) )
                    // InternalRPL.g:3992:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRPL.g:3992:4: (otherlv_1= RULE_ID )
                    // InternalRPL.g:3993:5: otherlv_1= RULE_ID
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
                    // InternalRPL.g:4005:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    {
                    // InternalRPL.g:4005:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    // InternalRPL.g:4006:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']'
                    {
                    // InternalRPL.g:4006:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPL.g:4007:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPL.g:4007:5: (otherlv_2= RULE_ID )
                    // InternalRPL.g:4008:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_53); 

                    						newLeafNode(otherlv_2, grammarAccess.getPrimaryTermAccess().getStateUpdateStateVariableCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTermAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalRPL.g:4023:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:4024:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:4024:5: (otherlv_4= RULE_ID )
                    // InternalRPL.g:4025:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_54); 

                    						newLeafNode(otherlv_4, grammarAccess.getPrimaryTermAccess().getVariableProgramVariableCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryTermAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:4042:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    {
                    // InternalRPL.g:4042:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    // InternalRPL.g:4043:4: (lv_funApp_6_0= ruleFunApplication )
                    {
                    // InternalRPL.g:4043:4: (lv_funApp_6_0= ruleFunApplication )
                    // InternalRPL.g:4044:5: lv_funApp_6_0= ruleFunApplication
                    {

                    					newCompositeNode(grammarAccess.getPrimaryTermAccess().getFunAppFunApplicationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_funApp_6_0=ruleFunApplication();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryTermRule());
                    					}
                    					set(
                    						current,
                    						"funApp",
                    						lv_funApp_6_0,
                    						"su.nsk.iae.rpl.RPL.FunApplication");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRPL.g:4062:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // InternalRPL.g:4062:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // InternalRPL.g:4063:4: otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryTermAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalRPL.g:4067:4: ( (lv_nestedTerm_8_0= ruleTerm ) )
                    // InternalRPL.g:4068:5: (lv_nestedTerm_8_0= ruleTerm )
                    {
                    // InternalRPL.g:4068:5: (lv_nestedTerm_8_0= ruleTerm )
                    // InternalRPL.g:4069:6: lv_nestedTerm_8_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getPrimaryTermAccess().getNestedTermTermParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_9=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:4095:1: entryRuleFunApplication returns [EObject current=null] : iv_ruleFunApplication= ruleFunApplication EOF ;
    public final EObject entryRuleFunApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunApplication = null;


        try {
            // InternalRPL.g:4095:55: (iv_ruleFunApplication= ruleFunApplication EOF )
            // InternalRPL.g:4096:2: iv_ruleFunApplication= ruleFunApplication EOF
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
    // InternalRPL.g:4102:1: ruleFunApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:4108:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRPL.g:4109:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRPL.g:4109:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRPL.g:4110:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalRPL.g:4110:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:4111:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:4111:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:4112:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getFunApplicationAccess().getFnParamFunctionalParameterCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFunApplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:4127:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:4128:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:4128:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:4129:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getFunApplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:4148:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRPL.g:4148:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRPL.g:4149:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalRPL.g:4155:1: ruleConstant returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4161:2: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalRPL.g:4162:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalRPL.g:4162:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_INTEGER||LA89_0==RULE_REAL||LA89_0==50) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_BOOLEAN_LITERAL) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalRPL.g:4163:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // InternalRPL.g:4163:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // InternalRPL.g:4164:4: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // InternalRPL.g:4164:4: (lv_num_0_0= ruleNumericLiteral )
                    // InternalRPL.g:4165:5: lv_num_0_0= ruleNumericLiteral
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
                    // InternalRPL.g:4183:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:4183:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:4184:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:4184:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:4185:5: lv_bool_1_0= RULE_BOOLEAN_LITERAL
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
    // InternalRPL.g:4205:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalRPL.g:4205:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalRPL.g:4206:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalRPL.g:4212:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:4218:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalRPL.g:4219:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalRPL.g:4219:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt90=2;
            switch ( input.LA(1) ) {
            case 50:
                {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==RULE_INTEGER) ) {
                    alt90=1;
                }
                else if ( (LA90_1==RULE_REAL) ) {
                    alt90=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                alt90=1;
                }
                break;
            case RULE_REAL:
                {
                alt90=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalRPL.g:4220:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalRPL.g:4229:3: this_RealLiteral_1= ruleRealLiteral
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
    // InternalRPL.g:4241:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalRPL.g:4241:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalRPL.g:4242:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalRPL.g:4248:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4254:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalRPL.g:4255:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalRPL.g:4255:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalRPL.g:4256:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalRPL.g:4256:3: ( (lv_sig_0_0= '-' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==50) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalRPL.g:4257:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4257:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4258:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,50,FOLLOW_23); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getIntegerLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4270:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalRPL.g:4271:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalRPL.g:4271:4: (lv_value_1_0= RULE_INTEGER )
            // InternalRPL.g:4272:5: lv_value_1_0= RULE_INTEGER
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
    // InternalRPL.g:4292:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalRPL.g:4292:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalRPL.g:4293:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalRPL.g:4299:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4305:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRPL.g:4306:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRPL.g:4306:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRPL.g:4307:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRPL.g:4307:3: ( (lv_sig_0_0= '-' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==50) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalRPL.g:4308:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4308:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4309:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,50,FOLLOW_55); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getRealLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4321:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRPL.g:4322:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalRPL.g:4322:4: (lv_value_1_0= RULE_REAL )
            // InternalRPL.g:4323:5: lv_value_1_0= RULE_REAL
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
    // InternalRPL.g:4343:1: entryRulePatternFreeFormula returns [EObject current=null] : iv_rulePatternFreeFormula= rulePatternFreeFormula EOF ;
    public final EObject entryRulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormula = null;


        try {
            // InternalRPL.g:4343:59: (iv_rulePatternFreeFormula= rulePatternFreeFormula EOF )
            // InternalRPL.g:4344:2: iv_rulePatternFreeFormula= rulePatternFreeFormula EOF
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
    // InternalRPL.g:4350:1: rulePatternFreeFormula returns [EObject current=null] : (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) ;
    public final EObject rulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4356:2: ( (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4357:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4357:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            // InternalRPL.g:4358:3: this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionPatternFreeFormula_0=ruleConjunctionPatternFreeFormula();

            state._fsp--;


            			current = this_ConjunctionPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4366:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==RULE_DISJUNCTION) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalRPL.g:4367:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4367:4: ()
            	    // InternalRPL.g:4368:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPatternFreeFormulaAccess().getPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_37); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getPatternFreeFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4378:4: ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    // InternalRPL.g:4379:5: (lv_right_3_0= rulePatternFreeFormula )
            	    {
            	    // InternalRPL.g:4379:5: (lv_right_3_0= rulePatternFreeFormula )
            	    // InternalRPL.g:4380:6: lv_right_3_0= rulePatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getRightPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop93;
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
    // InternalRPL.g:4402:1: entryRuleConjunctionPatternFreeFormula returns [EObject current=null] : iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF ;
    public final EObject entryRuleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionPatternFreeFormula = null;


        try {
            // InternalRPL.g:4402:70: (iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF )
            // InternalRPL.g:4403:2: iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF
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
    // InternalRPL.g:4409:1: ruleConjunctionPatternFreeFormula returns [EObject current=null] : (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) ;
    public final EObject ruleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4415:2: ( (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4416:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4416:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            // InternalRPL.g:4417:3: this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getPrimaryPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryPatternFreeFormula_0=rulePrimaryPatternFreeFormula();

            state._fsp--;


            			current = this_PrimaryPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4425:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_CONJUNCTION) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalRPL.g:4426:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4426:4: ()
            	    // InternalRPL.g:4427:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_37); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionPatternFreeFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4437:4: ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    // InternalRPL.g:4438:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    {
            	    // InternalRPL.g:4438:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    // InternalRPL.g:4439:6: lv_right_3_0= ruleConjunctionPatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getRightConjunctionPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop94;
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
    // InternalRPL.g:4461:1: entryRulePrimaryPatternFreeFormula returns [EObject current=null] : iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF ;
    public final EObject entryRulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPatternFreeFormula = null;


        try {
            // InternalRPL.g:4461:66: (iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF )
            // InternalRPL.g:4462:2: iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF
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
    // InternalRPL.g:4468:1: rulePrimaryPatternFreeFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4474:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:4475:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:4475:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID||(LA95_0>=RULE_NEGATION && LA95_0<=RULE_BOOLEAN_LITERAL)||LA95_0==39) ) {
                alt95=1;
            }
            else if ( (LA95_0==24) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalRPL.g:4476:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:4476:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:4477:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:4477:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:4478:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:4496:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:4496:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:4497:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryPatternFreeFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:4501:4: ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:4502:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:4502:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    // InternalRPL.g:4503:6: lv_nestedFormula_2_0= rulePatternFreeFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaAccess().getNestedFormulaPatternFreeFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:4529:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRPL.g:4529:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRPL.g:4530:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRPL.g:4536:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) ;
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
            // InternalRPL.g:4542:2: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) )
            // InternalRPL.g:4543:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            {
            // InternalRPL.g:4543:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            // InternalRPL.g:4544:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalRPL.g:4548:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4549:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4549:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4550:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); 

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

            // InternalRPL.g:4566:3: ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==31) ) {
                alt100=1;
            }
            else if ( (LA100_0==26) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalRPL.g:4567:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    {
                    // InternalRPL.g:4567:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    // InternalRPL.g:4568:5: otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getEqualsSignKeyword_2_0_0());
                    				
                    // InternalRPL.g:4572:5: ( (otherlv_3= RULE_ID ) )
                    // InternalRPL.g:4573:6: (otherlv_3= RULE_ID )
                    {
                    // InternalRPL.g:4573:6: (otherlv_3= RULE_ID )
                    // InternalRPL.g:4574:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_2_0_1_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_38); 

                    					newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftParenthesisKeyword_2_0_2());
                    				
                    // InternalRPL.g:4589:5: (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==25) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalRPL.g:4590:6: otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_11); 

                            						newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getConstKeyword_2_0_3_0());
                            					
                            otherlv_6=(Token)match(input,26,FOLLOW_28); 

                            						newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getColonKeyword_2_0_3_1());
                            					
                            // InternalRPL.g:4598:6: ( (lv_cParams_7_0= ruleTerm ) )
                            // InternalRPL.g:4599:7: (lv_cParams_7_0= ruleTerm )
                            {
                            // InternalRPL.g:4599:7: (lv_cParams_7_0= ruleTerm )
                            // InternalRPL.g:4600:8: lv_cParams_7_0= ruleTerm
                            {

                            								newCompositeNode(grammarAccess.getRequirementAccess().getCParamsTermParserRuleCall_2_0_3_2_0());
                            							
                            pushFollow(FOLLOW_14);
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

                            // InternalRPL.g:4617:6: (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==27) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // InternalRPL.g:4618:7: otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_28); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_3_3_0());
                            	    						
                            	    // InternalRPL.g:4622:7: ( (lv_cParams_9_0= ruleTerm ) )
                            	    // InternalRPL.g:4623:8: (lv_cParams_9_0= ruleTerm )
                            	    {
                            	    // InternalRPL.g:4623:8: (lv_cParams_9_0= ruleTerm )
                            	    // InternalRPL.g:4624:9: lv_cParams_9_0= ruleTerm
                            	    {

                            	    									newCompositeNode(grammarAccess.getRequirementAccess().getCParamsTermParserRuleCall_2_0_3_3_1_0());
                            	    								
                            	    pushFollow(FOLLOW_14);
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
                            	    break loop96;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalRPL.g:4643:5: (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==29) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalRPL.g:4644:6: otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFormulasKeyword_2_0_4_0());
                            					
                            otherlv_11=(Token)match(input,26,FOLLOW_30); 

                            						newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getColonKeyword_2_0_4_1());
                            					
                            // InternalRPL.g:4652:6: ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                            // InternalRPL.g:4653:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            {
                            // InternalRPL.g:4653:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            // InternalRPL.g:4654:8: lv_fmParams_12_0= rulePatternFreeFormulaParameterValue
                            {

                            								newCompositeNode(grammarAccess.getRequirementAccess().getFmParamsPatternFreeFormulaParameterValueParserRuleCall_2_0_4_2_0());
                            							
                            pushFollow(FOLLOW_15);
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

                            // InternalRPL.g:4671:6: (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==27) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // InternalRPL.g:4672:7: otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    {
                            	    otherlv_13=(Token)match(input,27,FOLLOW_30); 

                            	    							newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_4_3_0());
                            	    						
                            	    // InternalRPL.g:4676:7: ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    // InternalRPL.g:4677:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    {
                            	    // InternalRPL.g:4677:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    // InternalRPL.g:4678:9: lv_fmParams_14_0= rulePatternFreeFormulaParameterValue
                            	    {

                            	    									newCompositeNode(grammarAccess.getRequirementAccess().getFmParamsPatternFreeFormulaParameterValueParserRuleCall_2_0_4_3_1_0());
                            	    								
                            	    pushFollow(FOLLOW_15);
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
                            	    break loop98;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,30,FOLLOW_6); 

                    					newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRightParenthesisKeyword_2_0_5());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:4703:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4703:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    // InternalRPL.g:4704:5: otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getColonKeyword_2_1_0());
                    				
                    // InternalRPL.g:4708:5: ( (otherlv_17= RULE_ID ) )
                    // InternalRPL.g:4709:6: (otherlv_17= RULE_ID )
                    {
                    // InternalRPL.g:4709:6: (otherlv_17= RULE_ID )
                    // InternalRPL.g:4710:7: otherlv_17= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    						
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_20); 

                    							newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_2_1_1_0());
                    						

                    }


                    }

                    otherlv_18=(Token)match(input,33,FOLLOW_8); 

                    					newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getWithKeyword_2_1_2());
                    				
                    // InternalRPL.g:4725:5: ( (lv_extraIn_19_0= RULE_ID ) )
                    // InternalRPL.g:4726:6: (lv_extraIn_19_0= RULE_ID )
                    {
                    // InternalRPL.g:4726:6: (lv_extraIn_19_0= RULE_ID )
                    // InternalRPL.g:4727:7: lv_extraIn_19_0= RULE_ID
                    {
                    lv_extraIn_19_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
    // InternalRPL.g:4753:1: entryRuleExtraInvariant returns [EObject current=null] : iv_ruleExtraInvariant= ruleExtraInvariant EOF ;
    public final EObject entryRuleExtraInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraInvariant = null;


        try {
            // InternalRPL.g:4753:55: (iv_ruleExtraInvariant= ruleExtraInvariant EOF )
            // InternalRPL.g:4754:2: iv_ruleExtraInvariant= ruleExtraInvariant EOF
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
    // InternalRPL.g:4760:1: ruleExtraInvariant returns [EObject current=null] : (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) ;
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
            // InternalRPL.g:4766:2: ( (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) )
            // InternalRPL.g:4767:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            {
            // InternalRPL.g:4767:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            // InternalRPL.g:4768:3: otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getExtraInvariantAccess().getExtraKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraInvariantAccess().getInvariantKeyword_1());
            		
            // InternalRPL.g:4776:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:4777:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:4777:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:4778:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            // InternalRPL.g:4794:3: ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==26) ) {
                alt101=1;
            }
            else if ( (LA101_0==54) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalRPL.g:4795:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4795:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    // InternalRPL.g:4796:5: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtraInvariantAccess().getColonKeyword_3_0_0());
                    				
                    // InternalRPL.g:4800:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:4801:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:4801:6: (otherlv_4= RULE_ID )
                    // InternalRPL.g:4802:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_59); 

                    							newLeafNode(otherlv_4, grammarAccess.getExtraInvariantAccess().getPatternDerivedExtraInvariantPatternCrossReference_3_0_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,54,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getExtraInvariantAccess().getForKeyword_3_0_2());
                    				
                    // InternalRPL.g:4817:5: ( (lv_reqName_6_0= RULE_ID ) )
                    // InternalRPL.g:4818:6: (lv_reqName_6_0= RULE_ID )
                    {
                    // InternalRPL.g:4818:6: (lv_reqName_6_0= RULE_ID )
                    // InternalRPL.g:4819:7: lv_reqName_6_0= RULE_ID
                    {
                    lv_reqName_6_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
                    // InternalRPL.g:4837:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4837:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    // InternalRPL.g:4838:5: otherlv_7= 'for' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getExtraInvariantAccess().getForKeyword_3_1_0());
                    				
                    // InternalRPL.g:4842:5: ( (otherlv_8= RULE_ID ) )
                    // InternalRPL.g:4843:6: (otherlv_8= RULE_ID )
                    {
                    // InternalRPL.g:4843:6: (otherlv_8= RULE_ID )
                    // InternalRPL.g:4844:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

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
    // InternalRPL.g:4865:1: entryRulePatternFreeFormulaParameterValue returns [EObject current=null] : iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF ;
    public final EObject entryRulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormulaParameterValue = null;


        try {
            // InternalRPL.g:4865:73: (iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF )
            // InternalRPL.g:4866:2: iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF
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
    // InternalRPL.g:4872:1: rulePatternFreeFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) ;
    public final EObject rulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4878:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) )
            // InternalRPL.g:4879:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            {
            // InternalRPL.g:4879:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            // InternalRPL.g:4880:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) )
            {
            // InternalRPL.g:4880:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==37) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalRPL.g:4881:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternFreeFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:4885:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt102=0;
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==RULE_ID) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalRPL.g:4886:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:4886:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:4887:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt102 >= 1 ) break loop102;
                                EarlyExitException eee =
                                    new EarlyExitException(102, input);
                                throw eee;
                        }
                        cnt102++;
                    } while (true);

                    otherlv_2=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternFreeFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:4909:3: ( (lv_formula_3_0= rulePatternFreeFormula ) )
            // InternalRPL.g:4910:4: (lv_formula_3_0= rulePatternFreeFormula )
            {
            // InternalRPL.g:4910:4: (lv_formula_3_0= rulePatternFreeFormula )
            // InternalRPL.g:4911:5: lv_formula_3_0= rulePatternFreeFormula
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
    // InternalRPL.g:4932:1: entryRuleFutureLemmas returns [EObject current=null] : iv_ruleFutureLemmas= ruleFutureLemmas EOF ;
    public final EObject entryRuleFutureLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureLemmas = null;


        try {
            // InternalRPL.g:4932:53: (iv_ruleFutureLemmas= ruleFutureLemmas EOF )
            // InternalRPL.g:4933:2: iv_ruleFutureLemmas= ruleFutureLemmas EOF
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
    // InternalRPL.g:4939:1: ruleFutureLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) ;
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
            // InternalRPL.g:4945:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) )
            // InternalRPL.g:4946:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            {
            // InternalRPL.g:4946:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalRPL.g:4947:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalRPL.g:4947:3: ()
            // InternalRPL.g:4948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureLemmasAccess().getFutureLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4954:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalRPL.g:4955:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_60); 

            				newLeafNode(otherlv_1, grammarAccess.getFutureLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_61); 

            				newLeafNode(otherlv_2, grammarAccess.getFutureLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4963:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4964:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4964:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4965:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4968:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4969:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4969:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            loop104:
            do {
                int alt104=4;
                int LA104_0 = input.LA(1);

                if ( LA104_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt104=1;
                }
                else if ( LA104_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt104=2;
                }
                else if ( LA104_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt104=3;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalRPL.g:4970:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4970:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4971:6: {...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4971:112: ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4972:7: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4975:10: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4975:11: {...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4975:20: (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4975:21: otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_62); 

            	    										newLeafNode(otherlv_4, grammarAccess.getFutureLemmasAccess().getLS1Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4979:10: ( (lv_L1_5_0= ruleLemma ) )
            	    // InternalRPL.g:4980:11: (lv_L1_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4980:11: (lv_L1_5_0= ruleLemma )
            	    // InternalRPL.g:4981:12: lv_L1_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL1LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_61);
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
            	    // InternalRPL.g:5004:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5004:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5005:6: {...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:5005:112: ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5006:7: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:5009:10: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5009:11: {...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:5009:20: (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:5009:21: otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,58,FOLLOW_62); 

            	    										newLeafNode(otherlv_6, grammarAccess.getFutureLemmasAccess().getLS2Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:5013:10: ( (lv_L2_7_0= ruleLemma ) )
            	    // InternalRPL.g:5014:11: (lv_L2_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5014:11: (lv_L2_7_0= ruleLemma )
            	    // InternalRPL.g:5015:12: lv_L2_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL2LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_61);
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
            	    // InternalRPL.g:5038:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5038:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5039:6: {...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:5039:112: ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5040:7: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:5043:10: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5043:11: {...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:5043:20: (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:5043:21: otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,59,FOLLOW_62); 

            	    										newLeafNode(otherlv_8, grammarAccess.getFutureLemmasAccess().getLS3Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:5047:10: ( (lv_L3_9_0= ruleLemma ) )
            	    // InternalRPL.g:5048:11: (lv_L3_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5048:11: (lv_L3_9_0= ruleLemma )
            	    // InternalRPL.g:5049:12: lv_L3_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL3LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_61);
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
            	    break loop104;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_10=(Token)match(input,60,FOLLOW_2); 

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
    // InternalRPL.g:5088:1: entryRulePastLemmas returns [EObject current=null] : iv_rulePastLemmas= rulePastLemmas EOF ;
    public final EObject entryRulePastLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastLemmas = null;


        try {
            // InternalRPL.g:5088:51: (iv_rulePastLemmas= rulePastLemmas EOF )
            // InternalRPL.g:5089:2: iv_rulePastLemmas= rulePastLemmas EOF
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
    // InternalRPL.g:5095:1: rulePastLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) ;
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
            // InternalRPL.g:5101:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) )
            // InternalRPL.g:5102:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            {
            // InternalRPL.g:5102:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalRPL.g:5103:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalRPL.g:5103:3: ()
            // InternalRPL.g:5104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastLemmasAccess().getPastLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:5110:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalRPL.g:5111:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_60); 

            				newLeafNode(otherlv_1, grammarAccess.getPastLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_63); 

            				newLeafNode(otherlv_2, grammarAccess.getPastLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:5119:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:5120:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:5120:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:5121:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:5124:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:5125:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:5125:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            loop105:
            do {
                int alt105=5;
                int LA105_0 = input.LA(1);

                if ( LA105_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt105=1;
                }
                else if ( LA105_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt105=2;
                }
                else if ( LA105_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt105=3;
                }
                else if ( LA105_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt105=4;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalRPL.g:5126:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5126:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5127:6: {...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:5127:110: ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5128:7: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:5131:10: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5131:11: {...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5131:20: (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:5131:21: otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_62); 

            	    										newLeafNode(otherlv_4, grammarAccess.getPastLemmasAccess().getLS4Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:5135:10: ( (lv_L4_5_0= ruleLemma ) )
            	    // InternalRPL.g:5136:11: (lv_L4_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5136:11: (lv_L4_5_0= ruleLemma )
            	    // InternalRPL.g:5137:12: lv_L4_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL4LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_63);
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
            	    // InternalRPL.g:5160:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5160:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5161:6: {...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:5161:110: ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5162:7: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:5165:10: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5165:11: {...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5165:20: (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:5165:21: otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_62); 

            	    										newLeafNode(otherlv_6, grammarAccess.getPastLemmasAccess().getLS5Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:5169:10: ( (lv_L5_7_0= ruleLemma ) )
            	    // InternalRPL.g:5170:11: (lv_L5_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5170:11: (lv_L5_7_0= ruleLemma )
            	    // InternalRPL.g:5171:12: lv_L5_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL5LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_63);
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
            	    // InternalRPL.g:5194:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5194:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5195:6: {...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:5195:110: ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5196:7: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:5199:10: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5199:11: {...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5199:20: (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:5199:21: otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_62); 

            	    										newLeafNode(otherlv_8, grammarAccess.getPastLemmasAccess().getLS6Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:5203:10: ( (lv_L6_9_0= ruleLemma ) )
            	    // InternalRPL.g:5204:11: (lv_L6_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5204:11: (lv_L6_9_0= ruleLemma )
            	    // InternalRPL.g:5205:12: lv_L6_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL6LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_63);
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
            	    // InternalRPL.g:5228:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5228:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5229:6: {...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // InternalRPL.g:5229:110: ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5230:7: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3);
            	    						
            	    // InternalRPL.g:5233:10: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5233:11: {...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5233:20: (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    // InternalRPL.g:5233:21: otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) )
            	    {
            	    otherlv_10=(Token)match(input,64,FOLLOW_62); 

            	    										newLeafNode(otherlv_10, grammarAccess.getPastLemmasAccess().getLS7Keyword_1_2_3_0());
            	    									
            	    // InternalRPL.g:5237:10: ( (lv_L7_11_0= ruleLemma ) )
            	    // InternalRPL.g:5238:11: (lv_L7_11_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5238:11: (lv_L7_11_0= ruleLemma )
            	    // InternalRPL.g:5239:12: lv_L7_11_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL7LemmaParserRuleCall_1_2_3_1_0());
            	    											
            	    pushFollow(FOLLOW_63);
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
            	    break loop105;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_12=(Token)match(input,60,FOLLOW_2); 

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
    // InternalRPL.g:5278:1: entryRuleDerivedLemmas returns [EObject current=null] : iv_ruleDerivedLemmas= ruleDerivedLemmas EOF ;
    public final EObject entryRuleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedLemmas = null;


        try {
            // InternalRPL.g:5278:54: (iv_ruleDerivedLemmas= ruleDerivedLemmas EOF )
            // InternalRPL.g:5279:2: iv_ruleDerivedLemmas= ruleDerivedLemmas EOF
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
    // InternalRPL.g:5285:1: ruleDerivedLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) ;
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
            // InternalRPL.g:5291:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) )
            // InternalRPL.g:5292:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            {
            // InternalRPL.g:5292:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRPL.g:5293:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRPL.g:5293:3: ()
            // InternalRPL.g:5294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedLemmasAccess().getDerivedLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:5300:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRPL.g:5301:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_60); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_64); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:5309:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:5310:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:5310:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:5311:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:5314:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:5315:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:5315:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            loop106:
            do {
                int alt106=3;
                int LA106_0 = input.LA(1);

                if ( LA106_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt106=1;
                }
                else if ( LA106_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt106=2;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalRPL.g:5316:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5316:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5317:6: {...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:5317:113: ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5318:7: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:5321:10: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5321:11: {...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:5321:20: (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:5321:21: otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,65,FOLLOW_62); 

            	    										newLeafNode(otherlv_4, grammarAccess.getDerivedLemmasAccess().getLS8Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:5325:10: ( (lv_L8_5_0= ruleLemma ) )
            	    // InternalRPL.g:5326:11: (lv_L8_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5326:11: (lv_L8_5_0= ruleLemma )
            	    // InternalRPL.g:5327:12: lv_L8_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL8LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_64);
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
            	    // InternalRPL.g:5350:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5350:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5351:6: {...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:5351:113: ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5352:7: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:5355:10: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5355:11: {...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:5355:20: (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:5355:21: otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,66,FOLLOW_62); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedLemmasAccess().getLS9Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:5359:10: ( (lv_L9_7_0= ruleLemma ) )
            	    // InternalRPL.g:5360:11: (lv_L9_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5360:11: (lv_L9_7_0= ruleLemma )
            	    // InternalRPL.g:5361:12: lv_L9_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL9LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_64);
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
            	    break loop106;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_8=(Token)match(input,60,FOLLOW_2); 

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
    // InternalRPL.g:5400:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // InternalRPL.g:5400:46: (iv_ruleLemma= ruleLemma EOF )
            // InternalRPL.g:5401:2: iv_ruleLemma= ruleLemma EOF
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
    // InternalRPL.g:5407:1: ruleLemma returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleLemma() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_cVars_6_0 = null;

        EObject lv_cVars_8_0 = null;

        EObject lv_fnVars_11_0 = null;

        EObject lv_fnVars_13_0 = null;

        EObject lv_ifmVars_18_0 = null;

        EObject lv_ifmVars_20_0 = null;

        EObject lv_rfmVars_24_0 = null;

        EObject lv_rfmVars_26_0 = null;

        EObject lv_initState_30_0 = null;

        EObject lv_finalState_34_0 = null;

        EObject lv_prem_36_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5413:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) ) ) )
            // InternalRPL.g:5414:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRPL.g:5414:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) ) )
            // InternalRPL.g:5415:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalRPL.g:5415:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?) )
            // InternalRPL.g:5416:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLemmaAccess().getUnorderedGroup());
            			
            // InternalRPL.g:5419:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?)
            // InternalRPL.g:5420:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+ {...}?
            {
            // InternalRPL.g:5420:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) ) )+
            int cnt112=0;
            loop112:
            do {
                int alt112=8;
                int LA112_0 = input.LA(1);

                if ( LA112_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
                    alt112=1;
                }
                else if ( LA112_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
                    alt112=2;
                }
                else if ( LA112_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
                    alt112=3;
                }
                else if ( LA112_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
                    alt112=4;
                }
                else if ( LA112_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
                    alt112=5;
                }
                else if ( LA112_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
                    alt112=6;
                }
                else if ( LA112_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
                    alt112=7;
                }


                switch (alt112) {
            	case 1 :
            	    // InternalRPL.g:5421:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    {
            	    // InternalRPL.g:5421:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    // InternalRPL.g:5422:4: {...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRPL.g:5422:99: ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    // InternalRPL.g:5423:5: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRPL.g:5426:8: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    // InternalRPL.g:5426:9: {...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5426:18: (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    // InternalRPL.g:5426:19: otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,67,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLemmaAccess().getLemmaKeyword_0_0());
            	    							
            	    // InternalRPL.g:5430:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRPL.g:5431:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRPL.g:5431:9: (lv_name_2_0= RULE_ID )
            	    // InternalRPL.g:5432:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_60); 

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

            	    otherlv_3=(Token)match(input,56,FOLLOW_65); 

            	    								newLeafNode(otherlv_3, grammarAccess.getLemmaAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalRPL.g:5452:8: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==25) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // InternalRPL.g:5453:9: otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	            									newLeafNode(otherlv_4, grammarAccess.getLemmaAccess().getConstKeyword_0_3_0());
            	            								
            	            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            	            									newLeafNode(otherlv_5, grammarAccess.getLemmaAccess().getColonKeyword_0_3_1());
            	            								
            	            // InternalRPL.g:5461:9: ( (lv_cVars_6_0= ruleConstantParameter ) )
            	            // InternalRPL.g:5462:10: (lv_cVars_6_0= ruleConstantParameter )
            	            {
            	            // InternalRPL.g:5462:10: (lv_cVars_6_0= ruleConstantParameter )
            	            // InternalRPL.g:5463:11: lv_cVars_6_0= ruleConstantParameter
            	            {

            	            											newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_2_0());
            	            										
            	            pushFollow(FOLLOW_66);
            	            lv_cVars_6_0=ruleConstantParameter();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	            											}
            	            											add(
            	            												current,
            	            												"cVars",
            	            												lv_cVars_6_0,
            	            												"su.nsk.iae.rpl.RPL.ConstantParameter");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalRPL.g:5480:9: (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            loop107:
            	            do {
            	                int alt107=2;
            	                int LA107_0 = input.LA(1);

            	                if ( (LA107_0==27) ) {
            	                    alt107=1;
            	                }


            	                switch (alt107) {
            	            	case 1 :
            	            	    // InternalRPL.g:5481:10: otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    {
            	            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	            	    										newLeafNode(otherlv_7, grammarAccess.getLemmaAccess().getCommaKeyword_0_3_3_0());
            	            	    									
            	            	    // InternalRPL.g:5485:10: ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    // InternalRPL.g:5486:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    {
            	            	    // InternalRPL.g:5486:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    // InternalRPL.g:5487:12: lv_cVars_8_0= ruleConstantParameter
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_3_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_66);
            	            	    lv_cVars_8_0=ruleConstantParameter();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getLemmaRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"cVars",
            	            	    													lv_cVars_8_0,
            	            	    													"su.nsk.iae.rpl.RPL.ConstantParameter");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop107;
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
            	    // InternalRPL.g:5512:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5512:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5513:4: {...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRPL.g:5513:99: ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    // InternalRPL.g:5514:5: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRPL.g:5517:8: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    // InternalRPL.g:5517:9: {...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5517:18: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    // InternalRPL.g:5517:19: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getLemmaAccess().getFunKeyword_1_0());
            	    							
            	    otherlv_10=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_10, grammarAccess.getLemmaAccess().getColonKeyword_1_1());
            	    							
            	    // InternalRPL.g:5525:8: ( (lv_fnVars_11_0= ruleFunctionalParameter ) )
            	    // InternalRPL.g:5526:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    {
            	    // InternalRPL.g:5526:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    // InternalRPL.g:5527:10: lv_fnVars_11_0= ruleFunctionalParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_66);
            	    lv_fnVars_11_0=ruleFunctionalParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"fnVars",
            	    											lv_fnVars_11_0,
            	    											"su.nsk.iae.rpl.RPL.FunctionalParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5544:8: (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    loop109:
            	    do {
            	        int alt109=2;
            	        int LA109_0 = input.LA(1);

            	        if ( (LA109_0==27) ) {
            	            alt109=1;
            	        }


            	        switch (alt109) {
            	    	case 1 :
            	    	    // InternalRPL.g:5545:9: otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_12, grammarAccess.getLemmaAccess().getCommaKeyword_1_3_0());
            	    	    								
            	    	    // InternalRPL.g:5549:9: ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    // InternalRPL.g:5550:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    {
            	    	    // InternalRPL.g:5550:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    // InternalRPL.g:5551:11: lv_fnVars_13_0= ruleFunctionalParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_66);
            	    	    lv_fnVars_13_0=ruleFunctionalParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"fnVars",
            	    	    												lv_fnVars_13_0,
            	    	    												"su.nsk.iae.rpl.RPL.FunctionalParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop109;
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
            	    // InternalRPL.g:5575:3: ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5575:3: ({...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5576:4: {...}? => ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRPL.g:5576:99: ( ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5577:5: ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRPL.g:5580:8: ({...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5580:9: {...}? => (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5580:18: (otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5580:19: otherlv_14= 'extra' otherlv_15= 'invariant' otherlv_16= 'formulas' otherlv_17= ':' ( (lv_ifmVars_18_0= ruleFormulaParameter ) ) (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )*
            	    {
            	    otherlv_14=(Token)match(input,52,FOLLOW_57); 

            	    								newLeafNode(otherlv_14, grammarAccess.getLemmaAccess().getExtraKeyword_2_0());
            	    							
            	    otherlv_15=(Token)match(input,53,FOLLOW_13); 

            	    								newLeafNode(otherlv_15, grammarAccess.getLemmaAccess().getInvariantKeyword_2_1());
            	    							
            	    otherlv_16=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_16, grammarAccess.getLemmaAccess().getFormulasKeyword_2_2());
            	    							
            	    otherlv_17=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_17, grammarAccess.getLemmaAccess().getColonKeyword_2_3());
            	    							
            	    // InternalRPL.g:5596:8: ( (lv_ifmVars_18_0= ruleFormulaParameter ) )
            	    // InternalRPL.g:5597:9: (lv_ifmVars_18_0= ruleFormulaParameter )
            	    {
            	    // InternalRPL.g:5597:9: (lv_ifmVars_18_0= ruleFormulaParameter )
            	    // InternalRPL.g:5598:10: lv_ifmVars_18_0= ruleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsFormulaParameterParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_66);
            	    lv_ifmVars_18_0=ruleFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ifmVars",
            	    											lv_ifmVars_18_0,
            	    											"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5615:8: (otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) ) )*
            	    loop110:
            	    do {
            	        int alt110=2;
            	        int LA110_0 = input.LA(1);

            	        if ( (LA110_0==27) ) {
            	            alt110=1;
            	        }


            	        switch (alt110) {
            	    	case 1 :
            	    	    // InternalRPL.g:5616:9: otherlv_19= ',' ( (lv_ifmVars_20_0= ruleFormulaParameter ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_19, grammarAccess.getLemmaAccess().getCommaKeyword_2_5_0());
            	    	    								
            	    	    // InternalRPL.g:5620:9: ( (lv_ifmVars_20_0= ruleFormulaParameter ) )
            	    	    // InternalRPL.g:5621:10: (lv_ifmVars_20_0= ruleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5621:10: (lv_ifmVars_20_0= ruleFormulaParameter )
            	    	    // InternalRPL.g:5622:11: lv_ifmVars_20_0= ruleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsFormulaParameterParserRuleCall_2_5_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_66);
            	    	    lv_ifmVars_20_0=ruleFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"ifmVars",
            	    	    												lv_ifmVars_20_0,
            	    	    												"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop110;
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
            	    // InternalRPL.g:5646:3: ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5646:3: ({...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5647:4: {...}? => ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRPL.g:5647:99: ( ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5648:5: ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRPL.g:5651:8: ({...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5651:9: {...}? => (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5651:18: (otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5651:19: otherlv_21= 'requirement' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_rfmVars_24_0= ruleFormulaParameter ) ) (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,51,FOLLOW_13); 

            	    								newLeafNode(otherlv_21, grammarAccess.getLemmaAccess().getRequirementKeyword_3_0());
            	    							
            	    otherlv_22=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_22, grammarAccess.getLemmaAccess().getFormulasKeyword_3_1());
            	    							
            	    otherlv_23=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_23, grammarAccess.getLemmaAccess().getColonKeyword_3_2());
            	    							
            	    // InternalRPL.g:5663:8: ( (lv_rfmVars_24_0= ruleFormulaParameter ) )
            	    // InternalRPL.g:5664:9: (lv_rfmVars_24_0= ruleFormulaParameter )
            	    {
            	    // InternalRPL.g:5664:9: (lv_rfmVars_24_0= ruleFormulaParameter )
            	    // InternalRPL.g:5665:10: lv_rfmVars_24_0= ruleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsFormulaParameterParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_66);
            	    lv_rfmVars_24_0=ruleFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"rfmVars",
            	    											lv_rfmVars_24_0,
            	    											"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5682:8: (otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) ) )*
            	    loop111:
            	    do {
            	        int alt111=2;
            	        int LA111_0 = input.LA(1);

            	        if ( (LA111_0==27) ) {
            	            alt111=1;
            	        }


            	        switch (alt111) {
            	    	case 1 :
            	    	    // InternalRPL.g:5683:9: otherlv_25= ',' ( (lv_rfmVars_26_0= ruleFormulaParameter ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_25, grammarAccess.getLemmaAccess().getCommaKeyword_3_4_0());
            	    	    								
            	    	    // InternalRPL.g:5687:9: ( (lv_rfmVars_26_0= ruleFormulaParameter ) )
            	    	    // InternalRPL.g:5688:10: (lv_rfmVars_26_0= ruleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5688:10: (lv_rfmVars_26_0= ruleFormulaParameter )
            	    	    // InternalRPL.g:5689:11: lv_rfmVars_26_0= ruleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsFormulaParameterParserRuleCall_3_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_66);
            	    	    lv_rfmVars_26_0=ruleFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"rfmVars",
            	    	    												lv_rfmVars_26_0,
            	    	    												"su.nsk.iae.rpl.RPL.FormulaParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop111;
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
            	    // InternalRPL.g:5713:3: ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5713:3: ({...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5714:4: {...}? => ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRPL.g:5714:99: ( ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5715:5: ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRPL.g:5718:8: ({...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5718:9: {...}? => (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5718:18: (otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5718:19: otherlv_27= 'init' otherlv_28= 'state' otherlv_29= ':' ( (lv_initState_30_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_27=(Token)match(input,68,FOLLOW_67); 

            	    								newLeafNode(otherlv_27, grammarAccess.getLemmaAccess().getInitKeyword_4_0());
            	    							
            	    otherlv_28=(Token)match(input,69,FOLLOW_11); 

            	    								newLeafNode(otherlv_28, grammarAccess.getLemmaAccess().getStateKeyword_4_1());
            	    							
            	    otherlv_29=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_29, grammarAccess.getLemmaAccess().getColonKeyword_4_2());
            	    							
            	    // InternalRPL.g:5730:8: ( (lv_initState_30_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5731:9: (lv_initState_30_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5731:9: (lv_initState_30_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5732:10: lv_initState_30_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getInitStateUpdateStateVariableParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_68);
            	    lv_initState_30_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"initState",
            	    											lv_initState_30_0,
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
            	    // InternalRPL.g:5755:3: ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5755:3: ({...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5756:4: {...}? => ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRPL.g:5756:99: ( ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5757:5: ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRPL.g:5760:8: ({...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5760:9: {...}? => (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5760:18: (otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5760:19: otherlv_31= 'final' otherlv_32= 'state' otherlv_33= ':' ( (lv_finalState_34_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_31=(Token)match(input,35,FOLLOW_67); 

            	    								newLeafNode(otherlv_31, grammarAccess.getLemmaAccess().getFinalKeyword_5_0());
            	    							
            	    otherlv_32=(Token)match(input,69,FOLLOW_11); 

            	    								newLeafNode(otherlv_32, grammarAccess.getLemmaAccess().getStateKeyword_5_1());
            	    							
            	    otherlv_33=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_33, grammarAccess.getLemmaAccess().getColonKeyword_5_2());
            	    							
            	    // InternalRPL.g:5772:8: ( (lv_finalState_34_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5773:9: (lv_finalState_34_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5773:9: (lv_finalState_34_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5774:10: lv_finalState_34_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFinalStateUpdateStateVariableParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_68);
            	    lv_finalState_34_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"finalState",
            	    											lv_finalState_34_0,
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
            	    // InternalRPL.g:5797:3: ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) )
            	    {
            	    // InternalRPL.g:5797:3: ({...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) ) )
            	    // InternalRPL.g:5798:4: {...}? => ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRPL.g:5798:99: ( ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) ) )
            	    // InternalRPL.g:5799:5: ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRPL.g:5802:8: ({...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' ) )
            	    // InternalRPL.g:5802:9: {...}? => (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5802:18: (otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';' )
            	    // InternalRPL.g:5802:19: otherlv_35= 'premise' ( (lv_prem_36_0= ruleLemmaPremiseFormula ) ) otherlv_37= '}' otherlv_38= ';'
            	    {
            	    otherlv_35=(Token)match(input,70,FOLLOW_69); 

            	    								newLeafNode(otherlv_35, grammarAccess.getLemmaAccess().getPremiseKeyword_6_0());
            	    							
            	    // InternalRPL.g:5806:8: ( (lv_prem_36_0= ruleLemmaPremiseFormula ) )
            	    // InternalRPL.g:5807:9: (lv_prem_36_0= ruleLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5807:9: (lv_prem_36_0= ruleLemmaPremiseFormula )
            	    // InternalRPL.g:5808:10: lv_prem_36_0= ruleLemmaPremiseFormula
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getPremLemmaPremiseFormulaParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_70);
            	    lv_prem_36_0=ruleLemmaPremiseFormula();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"prem",
            	    											lv_prem_36_0,
            	    											"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_37=(Token)match(input,60,FOLLOW_6); 

            	    								newLeafNode(otherlv_37, grammarAccess.getLemmaAccess().getRightCurlyBracketKeyword_6_2());
            	    							
            	    otherlv_38=(Token)match(input,21,FOLLOW_68); 

            	    								newLeafNode(otherlv_38, grammarAccess.getLemmaAccess().getSemicolonKeyword_6_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
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
    // InternalRPL.g:5850:1: entryRuleLemmaPremiseFormula returns [EObject current=null] : iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF ;
    public final EObject entryRuleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5850:60: (iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF )
            // InternalRPL.g:5851:2: iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF
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
    // InternalRPL.g:5857:1: ruleLemmaPremiseFormula returns [EObject current=null] : (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) ;
    public final EObject ruleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_IMPLICATION_2=null;
        EObject this_DisjunctionLemmaPremiseFormula_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5863:2: ( (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) )
            // InternalRPL.g:5864:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            {
            // InternalRPL.g:5864:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_NEGATION && LA113_0<=RULE_BOOLEAN_LITERAL)||LA113_0==24||LA113_0==39||LA113_0==71) ) {
                alt113=1;
            }
            else if ( (LA113_0==RULE_ID) ) {
                int LA113_2 = input.LA(2);

                if ( (LA113_2==24) ) {
                    int LA113_3 = input.LA(3);

                    if ( (LA113_3==RULE_ID) ) {
                        int LA113_4 = input.LA(4);

                        if ( (LA113_4==27) ) {
                            alt113=1;
                        }
                        else if ( (LA113_4==30) ) {
                            int LA113_5 = input.LA(5);

                            if ( (LA113_5==EOF||(LA113_5>=RULE_DISJUNCTION && LA113_5<=RULE_CONJUNCTION)||LA113_5==30||LA113_5==60) ) {
                                alt113=1;
                            }
                            else if ( (LA113_5==RULE_IMPLICATION) ) {
                                alt113=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 113, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 113, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA113_3==25||LA113_3==29||LA113_3==36||LA113_3==43) ) {
                        alt113=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA113_2==EOF||(LA113_2>=RULE_DISJUNCTION && LA113_2<=RULE_CONJUNCTION)||LA113_2==30||LA113_2==60) ) {
                    alt113=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalRPL.g:5865:3: this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula
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
                    // InternalRPL.g:5874:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    {
                    // InternalRPL.g:5874:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    // InternalRPL.g:5875:4: ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    {
                    // InternalRPL.g:5875:4: ( (lv_left_1_0= ruleFunApplication ) )
                    // InternalRPL.g:5876:5: (lv_left_1_0= ruleFunApplication )
                    {
                    // InternalRPL.g:5876:5: (lv_left_1_0= ruleFunApplication )
                    // InternalRPL.g:5877:6: lv_left_1_0= ruleFunApplication
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getLeftFunApplicationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_71);
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

                    this_IMPLICATION_2=(Token)match(input,RULE_IMPLICATION,FOLLOW_69); 

                    				newLeafNode(this_IMPLICATION_2, grammarAccess.getLemmaPremiseFormulaAccess().getIMPLICATIONTerminalRuleCall_1_1());
                    			
                    // InternalRPL.g:5898:4: ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5899:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5899:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5900:6: lv_right_3_0= ruleLemmaPremiseFormula
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
    // InternalRPL.g:5922:1: entryRuleDisjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5922:71: (iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5923:2: iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5929:1: ruleDisjunctionLemmaPremiseFormula returns [EObject current=null] : (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5935:2: ( (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5936:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5936:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5937:3: this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionLemmaPremiseFormula_0=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;


            			current = this_ConjunctionLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5945:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==RULE_DISJUNCTION) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalRPL.g:5946:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5946:4: ()
            	    // InternalRPL.g:5947:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_69); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5957:4: ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5958:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5958:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5959:6: lv_right_3_0= ruleDisjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getRightDisjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop114;
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
    // InternalRPL.g:5981:1: entryRuleConjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5981:71: (iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5982:2: iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5988:1: ruleConjunctionLemmaPremiseFormula returns [EObject current=null] : (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5994:2: ( (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5995:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5995:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5996:3: this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getPrimaryLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryLemmaPremiseFormula_0=rulePrimaryLemmaPremiseFormula();

            state._fsp--;


            			current = this_PrimaryLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:6004:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==RULE_CONJUNCTION) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalRPL.g:6005:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:6005:4: ()
            	    // InternalRPL.g:6006:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_69); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:6016:4: ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:6017:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:6017:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:6018:6: lv_right_3_0= ruleConjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getRightConjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop115;
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
    // InternalRPL.g:6040:1: entryRulePrimaryLemmaPremiseFormula returns [EObject current=null] : iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF ;
    public final EObject entryRulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:6040:67: (iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF )
            // InternalRPL.g:6041:2: iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF
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
    // InternalRPL.g:6047:1: rulePrimaryLemmaPremiseFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) ;
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
            // InternalRPL.g:6053:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:6054:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:6054:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 39:
                {
                alt116=1;
                }
                break;
            case RULE_ID:
                {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==24) ) {
                    int LA116_5 = input.LA(3);

                    if ( (LA116_5==25||LA116_5==29||LA116_5==36||LA116_5==43) ) {
                        alt116=3;
                    }
                    else if ( (LA116_5==RULE_ID) ) {
                        alt116=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_2==EOF||(LA116_2>=RULE_DISJUNCTION && LA116_2<=RULE_CONJUNCTION)||LA116_2==30||LA116_2==60) ) {
                    alt116=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                alt116=2;
                }
                break;
            case 24:
                {
                alt116=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalRPL.g:6055:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:6055:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:6056:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:6056:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:6057:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:6075:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    {
                    // InternalRPL.g:6075:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    // InternalRPL.g:6076:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    {
                    // InternalRPL.g:6076:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    // InternalRPL.g:6077:5: lv_alwaysImp_1_0= ruleAlwaysImplication
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
                    // InternalRPL.g:6095:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    {
                    // InternalRPL.g:6095:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    // InternalRPL.g:6096:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    {
                    // InternalRPL.g:6096:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    // InternalRPL.g:6097:5: lv_inst_2_0= rulePastExtraInvariantPatternInstance
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
                    // InternalRPL.g:6115:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:6115:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    // InternalRPL.g:6116:4: otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_69); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:6120:4: ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:6121:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:6121:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:6122:6: lv_nestedFormula_4_0= ruleLemmaPremiseFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getNestedFormulaLemmaPremiseFormulaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:6148:1: entryRuleAlwaysImplication returns [EObject current=null] : iv_ruleAlwaysImplication= ruleAlwaysImplication EOF ;
    public final EObject entryRuleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplication = null;


        try {
            // InternalRPL.g:6148:58: (iv_ruleAlwaysImplication= ruleAlwaysImplication EOF )
            // InternalRPL.g:6149:2: iv_ruleAlwaysImplication= ruleAlwaysImplication EOF
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
    // InternalRPL.g:6155:1: ruleAlwaysImplication returns [EObject current=null] : (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) ;
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
            // InternalRPL.g:6161:2: ( (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) )
            // InternalRPL.g:6162:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            {
            // InternalRPL.g:6162:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            // InternalRPL.g:6163:3: otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationAccess().getAlwaysimpKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysImplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:6171:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:6172:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:6172:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:6173:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlwaysImplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_3());
            		
            // InternalRPL.g:6188:3: ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:6189:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:6189:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:6190:5: lv_left_4_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getLeftAlwaysImplicationParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_72);
            lv_left_4_0=ruleAlwaysImplicationParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysImplicationRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_4_0,
            						"su.nsk.iae.rpl.RPL.AlwaysImplicationParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_73); 

            			newLeafNode(otherlv_5, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_5());
            		
            // InternalRPL.g:6211:3: ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:6212:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:6212:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:6213:5: lv_right_6_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getRightAlwaysImplicationParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_right_6_0=ruleAlwaysImplicationParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysImplicationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_6_0,
            						"su.nsk.iae.rpl.RPL.AlwaysImplicationParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAlwaysImplicationParameterValue"
    // InternalRPL.g:6238:1: entryRuleAlwaysImplicationParameterValue returns [EObject current=null] : iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF ;
    public final EObject entryRuleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplicationParameterValue = null;


        try {
            // InternalRPL.g:6238:72: (iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF )
            // InternalRPL.g:6239:2: iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF
            {
             newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlwaysImplicationParameterValue=ruleAlwaysImplicationParameterValue();

            state._fsp--;

             current =iv_ruleAlwaysImplicationParameterValue; 
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
    // $ANTLR end "entryRuleAlwaysImplicationParameterValue"


    // $ANTLR start "ruleAlwaysImplicationParameterValue"
    // InternalRPL.g:6245:1: ruleAlwaysImplicationParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) ;
    public final EObject ruleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:6251:2: ( ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) )
            // InternalRPL.g:6252:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            {
            // InternalRPL.g:6252:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            // InternalRPL.g:6253:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) )
            {
            // InternalRPL.g:6253:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==37) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalRPL.g:6254:4: otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:6258:4: ( (lv_state_1_0= ruleUpdateStateVariable ) )
                    // InternalRPL.g:6259:5: (lv_state_1_0= ruleUpdateStateVariable )
                    {
                    // InternalRPL.g:6259:5: (lv_state_1_0= ruleUpdateStateVariable )
                    // InternalRPL.g:6260:6: lv_state_1_0= ruleUpdateStateVariable
                    {

                    						newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueAccess().getStateUpdateStateVariableParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_state_1_0=ruleUpdateStateVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlwaysImplicationParameterValueRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_1_0,
                    							"su.nsk.iae.rpl.RPL.UpdateStateVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:6282:3: ( (lv_formula_3_0= ruleNegationFormula ) )
            // InternalRPL.g:6283:4: (lv_formula_3_0= ruleNegationFormula )
            {
            // InternalRPL.g:6283:4: (lv_formula_3_0= ruleNegationFormula )
            // InternalRPL.g:6284:5: lv_formula_3_0= ruleNegationFormula
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueAccess().getFormulaNegationFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_3_0=ruleNegationFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlwaysImplicationParameterValueRule());
            					}
            					set(
            						current,
            						"formula",
            						lv_formula_3_0,
            						"su.nsk.iae.rpl.RPL.NegationFormula");
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
    // $ANTLR end "ruleAlwaysImplicationParameterValue"


    // $ANTLR start "entryRulePastExtraInvariantPatternInstance"
    // InternalRPL.g:6305:1: entryRulePastExtraInvariantPatternInstance returns [EObject current=null] : iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF ;
    public final EObject entryRulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPatternInstance = null;


        try {
            // InternalRPL.g:6305:74: (iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF )
            // InternalRPL.g:6306:2: iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF
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
    // InternalRPL.g:6312:1: rulePastExtraInvariantPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) ;
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
            // InternalRPL.g:6318:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) )
            // InternalRPL.g:6319:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
            {
            // InternalRPL.g:6319:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
            // InternalRPL.g:6320:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )? otherlv_17= 'current' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')'
            {
            // InternalRPL.g:6320:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:6321:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:6321:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:6322:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getPatternPastExtraInvariantPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_75); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:6337:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==25) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalRPL.g:6338:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:6346:4: ( (lv_cParams_4_0= ruleConstantParameter ) )
                    // InternalRPL.g:6347:5: (lv_cParams_4_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:6347:5: (lv_cParams_4_0= ruleConstantParameter )
                    // InternalRPL.g:6348:6: lv_cParams_4_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    // InternalRPL.g:6365:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==27) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalRPL.g:6366:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:6370:5: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:6371:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:6371:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    // InternalRPL.g:6372:7: lv_cParams_6_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_76);
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
                    	    break loop118;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6391:3: (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==43) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalRPL.g:6392:4: otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFunKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:6400:4: ( (lv_fnParams_9_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:6401:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:6401:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    // InternalRPL.g:6402:6: lv_fnParams_9_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_77);
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

                    // InternalRPL.g:6419:4: (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==27) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalRPL.g:6420:5: otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:6424:5: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:6425:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:6425:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:6426:7: lv_fnParams_11_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6445:3: (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==29) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalRPL.g:6446:4: otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )*
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:6454:4: ( (lv_fmParams_14_0= ruleFormulaParameter ) )
                    // InternalRPL.g:6455:5: (lv_fmParams_14_0= ruleFormulaParameter )
                    {
                    // InternalRPL.g:6455:5: (lv_fmParams_14_0= ruleFormulaParameter )
                    // InternalRPL.g:6456:6: lv_fmParams_14_0= ruleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsFormulaParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_78);
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

                    // InternalRPL.g:6473:4: (otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==27) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalRPL.g:6474:5: otherlv_15= ',' ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:6478:5: ( (lv_fmParams_16_0= ruleFormulaParameter ) )
                    	    // InternalRPL.g:6479:6: (lv_fmParams_16_0= ruleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:6479:6: (lv_fmParams_16_0= ruleFormulaParameter )
                    	    // InternalRPL.g:6480:7: lv_fmParams_16_0= ruleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsFormulaParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_78);
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
                    	    break loop122;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCurrentKeyword_5());
            		
            // InternalRPL.g:6503:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:6504:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:6504:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:6505:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_18, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getStateUpdateStateVariableCrossReference_6_0());
            				

            }


            }

            otherlv_19=(Token)match(input,30,FOLLOW_2); 

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
    // InternalRPL.g:6524:1: ruleEqPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) ;
    public final Enumerator ruleEqPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6530:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) )
            // InternalRPL.g:6531:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
            {
            // InternalRPL.g:6531:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==72) ) {
                alt124=1;
            }
            else if ( (LA124_0==73) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalRPL.g:6532:3: (enumLiteral_0= '==' )
                    {
                    // InternalRPL.g:6532:3: (enumLiteral_0= '==' )
                    // InternalRPL.g:6533:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6540:3: (enumLiteral_1= '~=' )
                    {
                    // InternalRPL.g:6540:3: (enumLiteral_1= '~=' )
                    // InternalRPL.g:6541:4: enumLiteral_1= '~='
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

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
    // InternalRPL.g:6551:1: ruleCompPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRPL.g:6557:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalRPL.g:6558:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalRPL.g:6558:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt125=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt125=1;
                }
                break;
            case 75:
                {
                alt125=2;
                }
                break;
            case 76:
                {
                alt125=3;
                }
                break;
            case 77:
                {
                alt125=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // InternalRPL.g:6559:3: (enumLiteral_0= '<' )
                    {
                    // InternalRPL.g:6559:3: (enumLiteral_0= '<' )
                    // InternalRPL.g:6560:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6567:3: (enumLiteral_1= '>' )
                    {
                    // InternalRPL.g:6567:3: (enumLiteral_1= '>' )
                    // InternalRPL.g:6568:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6575:3: (enumLiteral_2= '<=' )
                    {
                    // InternalRPL.g:6575:3: (enumLiteral_2= '<=' )
                    // InternalRPL.g:6576:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6583:3: (enumLiteral_3= '>=' )
                    {
                    // InternalRPL.g:6583:3: (enumLiteral_3= '>=' )
                    // InternalRPL.g:6584:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

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
    // InternalRPL.g:6594:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6600:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalRPL.g:6601:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalRPL.g:6601:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==78) ) {
                alt126=1;
            }
            else if ( (LA126_0==50) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalRPL.g:6602:3: (enumLiteral_0= '+' )
                    {
                    // InternalRPL.g:6602:3: (enumLiteral_0= '+' )
                    // InternalRPL.g:6603:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6610:3: (enumLiteral_1= '-' )
                    {
                    // InternalRPL.g:6610:3: (enumLiteral_1= '-' )
                    // InternalRPL.g:6611:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalRPL.g:6621:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRPL.g:6627:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) )
            // InternalRPL.g:6628:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            {
            // InternalRPL.g:6628:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            int alt127=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt127=1;
                }
                break;
            case 46:
                {
                alt127=2;
                }
                break;
            case 80:
                {
                alt127=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalRPL.g:6629:3: (enumLiteral_0= '*' )
                    {
                    // InternalRPL.g:6629:3: (enumLiteral_0= '*' )
                    // InternalRPL.g:6630:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6637:3: (enumLiteral_1= '/' )
                    {
                    // InternalRPL.g:6637:3: (enumLiteral_1= '/' )
                    // InternalRPL.g:6638:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6645:3: (enumLiteral_2= 'mod' )
                    {
                    // InternalRPL.g:6645:3: (enumLiteral_2= 'mod' )
                    // InternalRPL.g:6646:4: enumLiteral_2= 'mod'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

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
    // InternalRPL.g:6656:1: ruleUnMinus returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleUnMinus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRPL.g:6662:2: ( (enumLiteral_0= '-' ) )
            // InternalRPL.g:6663:2: (enumLiteral_0= '-' )
            {
            // InternalRPL.g:6663:2: (enumLiteral_0= '-' )
            // InternalRPL.g:6664:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0018370400500002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0018370400400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000072000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000068000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000C04000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000862000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000001001660L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000868000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A001000620L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000848000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000620L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000872000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000878000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008001000620L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080062000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080068000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000100200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080072000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080078000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000804000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000001001460L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0018080800000000L,0x0000000000000058L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0018080802000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0018080808000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0018080800000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000008001000620L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x000000A000000620L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000081022000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000081028000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000001028000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000001008000000L});

}
