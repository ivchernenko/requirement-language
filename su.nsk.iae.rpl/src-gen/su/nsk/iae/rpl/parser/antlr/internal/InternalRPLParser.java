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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_DISJUNCTION", "RULE_CONJUNCTION", "RULE_NEGATION", "RULE_BOOLEAN_LITERAL", "RULE_POWER_OPERATOR", "RULE_REAL", "RULE_IMPLICATION", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'derivedreq'", "'pattern'", "'('", "'const'", "':'", "','", "'simple'", "'formulas'", "')'", "'='", "'from'", "'with'", "'var'", "'lambda'", "'.'", "'frm'", "'final'", "'current'", "'futurereq'", "'pastreq'", "'futureeinv'", "'fun'", "'pasteinv'", "'derivedeinv'", "'/'", "'..'", "'['", "']'", "'-'", "'requirement'", "'extra'", "'invariant'", "'for'", "'lemmas'", "'{'", "'LS1'", "'LS2'", "'LS3'", "'}'", "'LS4'", "'LS5'", "'LS6'", "'LS7'", "'LS8'", "'LS9'", "'lemma'", "'init'", "'state'", "'premise'", "'alwaysimp'", "'=='", "'~='", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'mod'"
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
    // InternalRPL.g:273:1: ruleDerivedRequirementPattern returns [EObject current=null] : (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' ) ;
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
            // InternalRPL.g:279:2: ( (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' ) )
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' )
            {
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';' )
            // InternalRPL.g:281:3: otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParam_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'from' ( (lv_file_24_0= ruleFilePath ) ) otherlv_25= 'with' ( (otherlv_26= RULE_ID ) ) ) ) ( (lv_lemmas_27_0= ruleDerivedLemmas ) )? otherlv_28= ';'
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

            // InternalRPL.g:423:3: (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRPL.g:424:4: otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:432:4: ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:433:5: (lv_fmParams_17_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:433:5: (lv_fmParams_17_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:434:6: lv_fmParams_17_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_17_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_17_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:451:4: (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRPL.g:452:5: otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:456:5: ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:457:6: (lv_fmParams_19_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:457:6: (lv_fmParams_19_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:458:7: lv_fmParams_19_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_19_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_19_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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


    // $ANTLR start "entryRuleSimpleFormulaParameter"
    // InternalRPL.g:754:1: entryRuleSimpleFormulaParameter returns [EObject current=null] : iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF ;
    public final EObject entryRuleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFormulaParameter = null;


        try {
            // InternalRPL.g:754:63: (iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF )
            // InternalRPL.g:755:2: iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF
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
    // InternalRPL.g:761:1: ruleSimpleFormulaParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:767:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) )
            // InternalRPL.g:768:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            {
            // InternalRPL.g:768:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            // InternalRPL.g:769:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            {
            // InternalRPL.g:769:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:770:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:770:4: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:771:5: lv_name_0_0= RULE_ID
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

            // InternalRPL.g:787:3: (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRPL.g:788:4: otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleFormulaParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:792:4: ( (lv_arity_2_0= RULE_INTEGER ) )
                    // InternalRPL.g:793:5: (lv_arity_2_0= RULE_INTEGER )
                    {
                    // InternalRPL.g:793:5: (lv_arity_2_0= RULE_INTEGER )
                    // InternalRPL.g:794:6: lv_arity_2_0= RULE_INTEGER
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


    // $ANTLR start "entryRuleRegularFormulaParameter"
    // InternalRPL.g:819:1: entryRuleRegularFormulaParameter returns [EObject current=null] : iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF ;
    public final EObject entryRuleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularFormulaParameter = null;


        try {
            // InternalRPL.g:819:64: (iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF )
            // InternalRPL.g:820:2: iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF
            {
             newCompositeNode(grammarAccess.getRegularFormulaParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularFormulaParameter=ruleRegularFormulaParameter();

            state._fsp--;

             current =iv_ruleRegularFormulaParameter; 
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
    // $ANTLR end "entryRuleRegularFormulaParameter"


    // $ANTLR start "ruleRegularFormulaParameter"
    // InternalRPL.g:826:1: ruleRegularFormulaParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:832:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:833:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:833:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:834:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:834:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:835:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRegularFormulaParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRegularFormulaParameterRule());
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
    // $ANTLR end "ruleRegularFormulaParameter"


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
    // InternalRPL.g:1082:1: ruleOuterRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) ;
    public final EObject ruleOuterRequirementPatternInstance() throws RecognitionException {
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
        EObject lv_cParams_4_0 = null;

        EObject lv_cParams_6_0 = null;

        EObject lv_simpleFmParams_10_0 = null;

        EObject lv_simpleFmParams_12_0 = null;

        EObject lv_fmParams_15_0 = null;

        EObject lv_fmParams_17_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1088:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) )
            // InternalRPL.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            {
            // InternalRPL.g:1089:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            // InternalRPL.g:1090:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')'
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

            otherlv_1=(Token)match(input,24,FOLLOW_10); 

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
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1116:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1117:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1117:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1118:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_12);
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
                    	    otherlv_5=(Token)match(input,27,FOLLOW_27); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1140:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1141:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1141:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1142:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

            // InternalRPL.g:1161:3: (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPL.g:1162:4: otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_3_2());
                    			
                    // InternalRPL.g:1174:4: ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) )
                    // InternalRPL.g:1175:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    {
                    // InternalRPL.g:1175:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    // InternalRPL.g:1176:6: lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParameterValueParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_simpleFmParams_10_0=rulePatternFreeFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"simpleFmParams",
                    							lv_simpleFmParams_10_0,
                    							"su.nsk.iae.rpl.RPL.PatternFreeFormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1193:4: (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRPL.g:1194:5: otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_28); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalRPL.g:1198:5: ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    // InternalRPL.g:1199:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1199:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    // InternalRPL.g:1200:7: lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParameterValueParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_simpleFmParams_12_0=rulePatternFreeFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParams",
                    	    								lv_simpleFmParams_12_0,
                    	    								"su.nsk.iae.rpl.RPL.PatternFreeFormulaParameterValue");
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

            // InternalRPL.g:1219:3: (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRPL.g:1220:4: otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_14=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_14, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1228:4: ( (lv_fmParams_15_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1229:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1229:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1230:6: lv_fmParams_15_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_15_0=ruleFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_15_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1247:4: (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRPL.g:1248:5: otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,27,FOLLOW_28); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1252:5: ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1253:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1253:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1254:7: lv_fmParams_17_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_17_0=ruleFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOuterRequirementPatternInstanceRule());
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
                    	    break loop21;
                        }
                    } while (true);


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
    // InternalRPL.g:1281:1: entryRuleFormulaParameterValue returns [EObject current=null] : iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF ;
    public final EObject entryRuleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameterValue = null;


        try {
            // InternalRPL.g:1281:62: (iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF )
            // InternalRPL.g:1282:2: iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF
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
    // InternalRPL.g:1288:1: ruleFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) ;
    public final EObject ruleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1294:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) )
            // InternalRPL.g:1295:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            {
            // InternalRPL.g:1295:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            // InternalRPL.g:1296:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) )
            {
            // InternalRPL.g:1296:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRPL.g:1297:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:1301:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
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
                    	    // InternalRPL.g:1302:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:1302:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:1303:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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

                    otherlv_2=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:1325:3: ( (lv_formula_3_0= ruleInnerFormula ) )
            // InternalRPL.g:1326:4: (lv_formula_3_0= ruleInnerFormula )
            {
            // InternalRPL.g:1326:4: (lv_formula_3_0= ruleInnerFormula )
            // InternalRPL.g:1327:5: lv_formula_3_0= ruleInnerFormula
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
    // InternalRPL.g:1348:1: entryRuleInnerFormula returns [EObject current=null] : iv_ruleInnerFormula= ruleInnerFormula EOF ;
    public final EObject entryRuleInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFormula = null;


        try {
            // InternalRPL.g:1348:53: (iv_ruleInnerFormula= ruleInnerFormula EOF )
            // InternalRPL.g:1349:2: iv_ruleInnerFormula= ruleInnerFormula EOF
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
    // InternalRPL.g:1355:1: ruleInnerFormula returns [EObject current=null] : (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) ;
    public final EObject ruleInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1361:2: ( (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) )
            // InternalRPL.g:1362:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            {
            // InternalRPL.g:1362:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            // InternalRPL.g:1363:3: this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getInnerFormulaAccess().getConjunctionInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionInnerFormula_0=ruleConjunctionInnerFormula();

            state._fsp--;


            			current = this_ConjunctionInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1371:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DISJUNCTION) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPL.g:1372:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) )
            	    {
            	    // InternalRPL.g:1372:4: ()
            	    // InternalRPL.g:1373:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInnerFormulaAccess().getInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getInnerFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1383:4: ( (lv_right_3_0= ruleInnerFormula ) )
            	    // InternalRPL.g:1384:5: (lv_right_3_0= ruleInnerFormula )
            	    {
            	    // InternalRPL.g:1384:5: (lv_right_3_0= ruleInnerFormula )
            	    // InternalRPL.g:1385:6: lv_right_3_0= ruleInnerFormula
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
    // InternalRPL.g:1407:1: entryRuleConjunctionInnerFormula returns [EObject current=null] : iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF ;
    public final EObject entryRuleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionInnerFormula = null;


        try {
            // InternalRPL.g:1407:64: (iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF )
            // InternalRPL.g:1408:2: iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF
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
    // InternalRPL.g:1414:1: ruleConjunctionInnerFormula returns [EObject current=null] : (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) ;
    public final EObject ruleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1420:2: ( (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) )
            // InternalRPL.g:1421:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            {
            // InternalRPL.g:1421:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            // InternalRPL.g:1422:3: this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getPrimaryInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryInnerFormula_0=rulePrimaryInnerFormula();

            state._fsp--;


            			current = this_PrimaryInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1430:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_CONJUNCTION) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPL.g:1431:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    {
            	    // InternalRPL.g:1431:4: ()
            	    // InternalRPL.g:1432:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionInnerFormulaAccess().getConjunctionInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionInnerFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1442:4: ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    // InternalRPL.g:1443:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    {
            	    // InternalRPL.g:1443:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    // InternalRPL.g:1444:6: lv_right_3_0= ruleConjunctionInnerFormula
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
    // InternalRPL.g:1466:1: entryRulePrimaryInnerFormula returns [EObject current=null] : iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF ;
    public final EObject entryRulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInnerFormula = null;


        try {
            // InternalRPL.g:1466:60: (iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF )
            // InternalRPL.g:1467:2: iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF
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
    // InternalRPL.g:1473:1: rulePrimaryInnerFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_patternInst_1_0 = null;

        EObject lv_nestedFormula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1479:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) )
            // InternalRPL.g:1480:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            {
            // InternalRPL.g:1480:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 37:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==24) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==25||(LA27_4>=29 && LA27_4<=30)||LA27_4==38) ) {
                        alt27=2;
                    }
                    else if ( (LA27_4==RULE_ID) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==EOF||(LA27_2>=RULE_DISJUNCTION && LA27_2<=RULE_CONJUNCTION)||LA27_2==27||LA27_2==30||LA27_2==38) ) {
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
                    // InternalRPL.g:1481:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:1481:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:1482:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:1482:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:1483:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:1501:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1501:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    // InternalRPL.g:1502:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    {
                    // InternalRPL.g:1502:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    // InternalRPL.g:1503:5: lv_patternInst_1_0= ruleBasicRequirementPatternInstance
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
                    // InternalRPL.g:1521:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1521:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    // InternalRPL.g:1522:4: otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryInnerFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRPL.g:1526:4: ( (lv_nestedFormula_3_0= ruleInnerFormula ) )
                    // InternalRPL.g:1527:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    {
                    // InternalRPL.g:1527:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    // InternalRPL.g:1528:6: lv_nestedFormula_3_0= ruleInnerFormula
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
    // InternalRPL.g:1554:1: entryRuleNegationFormula returns [EObject current=null] : iv_ruleNegationFormula= ruleNegationFormula EOF ;
    public final EObject entryRuleNegationFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationFormula = null;


        try {
            // InternalRPL.g:1554:56: (iv_ruleNegationFormula= ruleNegationFormula EOF )
            // InternalRPL.g:1555:2: iv_ruleNegationFormula= ruleNegationFormula EOF
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
    // InternalRPL.g:1561:1: ruleNegationFormula returns [EObject current=null] : ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) ;
    public final EObject ruleNegationFormula() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1567:2: ( ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) )
            // InternalRPL.g:1568:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            {
            // InternalRPL.g:1568:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            // InternalRPL.g:1569:3: ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) )
            {
            // InternalRPL.g:1569:3: ( (lv_neg_0_0= RULE_NEGATION ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NEGATION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRPL.g:1570:4: (lv_neg_0_0= RULE_NEGATION )
                    {
                    // InternalRPL.g:1570:4: (lv_neg_0_0= RULE_NEGATION )
                    // InternalRPL.g:1571:5: lv_neg_0_0= RULE_NEGATION
                    {
                    lv_neg_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_30); 

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

            // InternalRPL.g:1587:3: ( (lv_right_1_0= ruleAtomicFormula ) )
            // InternalRPL.g:1588:4: (lv_right_1_0= ruleAtomicFormula )
            {
            // InternalRPL.g:1588:4: (lv_right_1_0= ruleAtomicFormula )
            // InternalRPL.g:1589:5: lv_right_1_0= ruleAtomicFormula
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
    // InternalRPL.g:1610:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // InternalRPL.g:1610:54: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // InternalRPL.g:1611:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
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
    // InternalRPL.g:1617:1: ruleAtomicFormula returns [EObject current=null] : ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) ;
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
            // InternalRPL.g:1623:2: ( ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) )
            // InternalRPL.g:1624:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            {
            // InternalRPL.g:1624:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
                {
                alt31=1;
                }
                break;
            case 37:
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
                    // InternalRPL.g:1625:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:1625:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:1626:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:1626:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:1627:5: lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL
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
                    // InternalRPL.g:1644:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1644:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalRPL.g:1645:4: otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicFormulaAccess().getFrmKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalRPL.g:1653:4: ( (lv_boolTerm_3_0= ruleTerm ) )
                    // InternalRPL.g:1654:5: (lv_boolTerm_3_0= ruleTerm )
                    {
                    // InternalRPL.g:1654:5: (lv_boolTerm_3_0= ruleTerm )
                    // InternalRPL.g:1655:6: lv_boolTerm_3_0= ruleTerm
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
                    // InternalRPL.g:1678:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    {
                    // InternalRPL.g:1678:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    // InternalRPL.g:1679:4: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    {
                    // InternalRPL.g:1679:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRPL.g:1680:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRPL.g:1680:5: (otherlv_5= RULE_ID )
                    // InternalRPL.g:1681:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicFormulaAccess().getFmParamFormulaParameterCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalRPL.g:1692:4: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==24) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRPL.g:1693:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalRPL.g:1697:5: ( (otherlv_7= RULE_ID ) )
                            // InternalRPL.g:1698:6: (otherlv_7= RULE_ID )
                            {
                            // InternalRPL.g:1698:6: (otherlv_7= RULE_ID )
                            // InternalRPL.g:1699:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                            							newLeafNode(otherlv_7, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_1_0());
                            						

                            }


                            }

                            // InternalRPL.g:1710:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==27) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalRPL.g:1711:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_8); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getAtomicFormulaAccess().getCommaKeyword_2_1_2_0());
                            	    					
                            	    // InternalRPL.g:1715:6: ( (otherlv_9= RULE_ID ) )
                            	    // InternalRPL.g:1716:7: (otherlv_9= RULE_ID )
                            	    {
                            	    // InternalRPL.g:1716:7: (otherlv_9= RULE_ID )
                            	    // InternalRPL.g:1717:8: otherlv_9= RULE_ID
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
    // InternalRPL.g:1739:1: entryRuleBasicRequirementPatternInstance returns [EObject current=null] : iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF ;
    public final EObject entryRuleBasicRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1739:72: (iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF )
            // InternalRPL.g:1740:2: iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF
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
    // InternalRPL.g:1746:1: ruleBasicRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) ;
    public final EObject ruleBasicRequirementPatternInstance() throws RecognitionException {
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
            // InternalRPL.g:1752:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) )
            // InternalRPL.g:1753:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            {
            // InternalRPL.g:1753:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            // InternalRPL.g:1754:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')'
            {
            // InternalRPL.g:1754:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1755:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1755:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1756:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getBasicRequirementPatternInstanceAccess().getPatternBasicRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1771:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRPL.g:1772:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1780:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1781:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1781:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1782:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalRPL.g:1799:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRPL.g:1800:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_27); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1804:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1805:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1805:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1806:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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

            // InternalRPL.g:1825:3: (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRPL.g:1826:4: otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicRequirementPatternInstanceAccess().getFormulasKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:1834:4: ( (lv_fmParams_9_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1835:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1835:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1836:6: lv_fmParams_9_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_fmParams_9_0=ruleFormulaParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_9_0,
                    							"su.nsk.iae.rpl.RPL.FormulaParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:1853:4: (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRPL.g:1854:5: otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_28); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:1858:5: ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1859:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1859:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1860:7: lv_fmParams_11_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_fmParams_11_0=ruleFormulaParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBasicRequirementPatternInstanceRule());
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1879:3: (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPL.g:1880:4: otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinalKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1888:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRPL.g:1889:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRPL.g:1889:5: (otherlv_14= RULE_ID )
                    // InternalRPL.g:1890:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_14, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1901:4: (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==39) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalRPL.g:1902:5: otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,39,FOLLOW_11); 

                            					newLeafNode(otherlv_15, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurrentKeyword_4_3_0());
                            				
                            otherlv_16=(Token)match(input,26,FOLLOW_8); 

                            					newLeafNode(otherlv_16, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_3_1());
                            				
                            // InternalRPL.g:1910:5: ( (otherlv_17= RULE_ID ) )
                            // InternalRPL.g:1911:6: (otherlv_17= RULE_ID )
                            {
                            // InternalRPL.g:1911:6: (otherlv_17= RULE_ID )
                            // InternalRPL.g:1912:7: otherlv_17= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(otherlv_17, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurStateUpdateStateVariableCrossReference_4_3_2_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getBasicRequirementPatternInstanceAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalRPL.g:1933:1: entryRuleFutureRequirementPattern returns [EObject current=null] : iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF ;
    public final EObject entryRuleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureRequirementPattern = null;


        try {
            // InternalRPL.g:1933:65: (iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF )
            // InternalRPL.g:1934:2: iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF
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
    // InternalRPL.g:1940:1: ruleFutureRequirementPattern returns [EObject current=null] : (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) ;
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
            // InternalRPL.g:1946:2: ( (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:1947:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:1947:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:1948:3: otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lessas_19_0= ruleFutureLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureRequirementPatternAccess().getFuturereqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:1956:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:1957:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:1957:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:1958:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:1978:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRPL.g:1979:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1987:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:1988:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:1988:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:1989:6: lv_cParams_6_0= ruleConstantParameter
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

                    // InternalRPL.g:2006:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRPL.g:2007:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2011:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2012:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2012:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2013:7: lv_cParams_8_0= ruleConstantParameter
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2032:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRPL.g:2033:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2041:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2042:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2042:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2043:6: lv_fmParams_11_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_11_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_11_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2060:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRPL.g:2061:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2065:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2066:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2066:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2067:7: lv_fmParams_13_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_13_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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

            otherlv_14=(Token)match(input,30,FOLLOW_36); 

            			newLeafNode(otherlv_14, grammarAccess.getFutureRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getFutureRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:2094:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:2095:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:2095:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:2096:5: lv_file_16_0= ruleFilePath
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
            		
            // InternalRPL.g:2117:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:2118:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:2118:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:2119:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_18, grammarAccess.getFutureRequirementPatternAccess().getExtraInvPatternFutureExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:2130:3: ( (lv_lessas_19_0= ruleFutureLemmas ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRPL.g:2131:4: (lv_lessas_19_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2131:4: (lv_lessas_19_0= ruleFutureLemmas )
                    // InternalRPL.g:2132:5: lv_lessas_19_0= ruleFutureLemmas
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
    // InternalRPL.g:2157:1: entryRulePastRequirementPattern returns [EObject current=null] : iv_rulePastRequirementPattern= rulePastRequirementPattern EOF ;
    public final EObject entryRulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastRequirementPattern = null;


        try {
            // InternalRPL.g:2157:63: (iv_rulePastRequirementPattern= rulePastRequirementPattern EOF )
            // InternalRPL.g:2158:2: iv_rulePastRequirementPattern= rulePastRequirementPattern EOF
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
    // InternalRPL.g:2164:1: rulePastRequirementPattern returns [EObject current=null] : (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) ;
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
            // InternalRPL.g:2170:2: ( (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' ) )
            // InternalRPL.g:2171:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            {
            // InternalRPL.g:2171:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';' )
            // InternalRPL.g:2172:3: otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'from' ( (lv_file_16_0= ruleFilePath ) ) otherlv_17= 'with' ( (otherlv_18= RULE_ID ) ) ( (lv_lemmas_19_0= rulePastLemmas ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastRequirementPatternAccess().getPastreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2180:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2181:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2181:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2182:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getPastRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2202:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRPL.g:2203:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2211:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2212:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2212:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2213:6: lv_cParams_6_0= ruleConstantParameter
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

                    // InternalRPL.g:2230:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==27) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalRPL.g:2231:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2235:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2236:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2236:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2237:7: lv_cParams_8_0= ruleConstantParameter
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2256:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRPL.g:2257:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2265:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2266:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2266:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2267:6: lv_fmParams_11_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_11_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_11_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2284:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRPL.g:2285:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2289:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2290:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2290:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2291:7: lv_fmParams_13_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_13_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_13_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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

            otherlv_14=(Token)match(input,30,FOLLOW_36); 

            			newLeafNode(otherlv_14, grammarAccess.getPastRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_15, grammarAccess.getPastRequirementPatternAccess().getFromKeyword_7());
            		
            // InternalRPL.g:2318:3: ( (lv_file_16_0= ruleFilePath ) )
            // InternalRPL.g:2319:4: (lv_file_16_0= ruleFilePath )
            {
            // InternalRPL.g:2319:4: (lv_file_16_0= ruleFilePath )
            // InternalRPL.g:2320:5: lv_file_16_0= ruleFilePath
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
            		
            // InternalRPL.g:2341:3: ( (otherlv_18= RULE_ID ) )
            // InternalRPL.g:2342:4: (otherlv_18= RULE_ID )
            {
            // InternalRPL.g:2342:4: (otherlv_18= RULE_ID )
            // InternalRPL.g:2343:5: otherlv_18= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_18, grammarAccess.getPastRequirementPatternAccess().getExtraInvPatternPastExtraInvariantPatternCrossReference_10_0());
            				

            }


            }

            // InternalRPL.g:2354:3: ( (lv_lemmas_19_0= rulePastLemmas ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRPL.g:2355:4: (lv_lemmas_19_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2355:4: (lv_lemmas_19_0= rulePastLemmas )
                    // InternalRPL.g:2356:5: lv_lemmas_19_0= rulePastLemmas
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
    // InternalRPL.g:2381:1: entryRuleFutureExtraInvariantPattern returns [EObject current=null] : iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF ;
    public final EObject entryRuleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2381:68: (iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF )
            // InternalRPL.g:2382:2: iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF
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
    // InternalRPL.g:2388:1: ruleFutureExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) ;
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
            // InternalRPL.g:2394:2: ( (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2395:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2395:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2396:3: otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= ruleFutureLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureExtraInvariantPatternAccess().getFutureeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2404:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2405:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2405:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2406:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2426:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRPL.g:2427:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2435:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2436:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2436:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2437:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalRPL.g:2454:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==27) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalRPL.g:2455:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2459:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2460:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2460:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2461:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2480:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRPL.g:2481:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2489:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2490:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2490:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2491:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:2508:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==27) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRPL.g:2509:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2513:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2514:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2514:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2515:7: lv_fnParams_13_0= ruleFunctionalParameter
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2534:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRPL.g:2535:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getFutureExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2543:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2544:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2544:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2545:6: lv_fmParams_16_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_16_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_16_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2562:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==27) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalRPL.g:2563:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2567:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2568:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2568:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2569:7: lv_fmParams_18_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_18_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_18_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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

            otherlv_19=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_19, grammarAccess.getFutureExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2592:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRPL.g:2593:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getFutureExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2597:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2598:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2598:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2599:6: lv_file_21_0= ruleFilePath
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

            // InternalRPL.g:2617:3: ( (lv_lemmas_22_0= ruleFutureLemmas ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRPL.g:2618:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2618:4: (lv_lemmas_22_0= ruleFutureLemmas )
                    // InternalRPL.g:2619:5: lv_lemmas_22_0= ruleFutureLemmas
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
    // InternalRPL.g:2644:1: entryRulePastExtraInvariantPattern returns [EObject current=null] : iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF ;
    public final EObject entryRulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2644:66: (iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF )
            // InternalRPL.g:2645:2: iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF
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
    // InternalRPL.g:2651:1: rulePastExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) ;
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
            // InternalRPL.g:2657:2: ( (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' ) )
            // InternalRPL.g:2658:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            {
            // InternalRPL.g:2658:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';' )
            // InternalRPL.g:2659:3: otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )? ( (lv_lemmas_22_0= rulePastLemmas ) )? otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternAccess().getPasteinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2667:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2668:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2668:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2669:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2689:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==25) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRPL.g:2690:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2698:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2699:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2699:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2700:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalRPL.g:2717:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==27) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRPL.g:2718:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2722:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2723:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2723:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2724:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2743:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRPL.g:2744:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2752:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2753:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2753:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2754:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:2771:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==27) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRPL.g:2772:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2776:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2777:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2777:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2778:7: lv_fnParams_13_0= ruleFunctionalParameter
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2797:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==29) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRPL.g:2798:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getPastExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2806:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2807:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2807:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2808:6: lv_fmParams_16_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_16_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_16_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:2825:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==27) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRPL.g:2826:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2830:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2831:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2831:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2832:7: lv_fmParams_18_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_18_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_18_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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

            otherlv_19=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2855:3: (otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==32) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRPL.g:2856:4: otherlv_20= 'from' ( (lv_file_21_0= ruleFilePath ) )
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getPastExtraInvariantPatternAccess().getFromKeyword_8_0());
                    			
                    // InternalRPL.g:2860:4: ( (lv_file_21_0= ruleFilePath ) )
                    // InternalRPL.g:2861:5: (lv_file_21_0= ruleFilePath )
                    {
                    // InternalRPL.g:2861:5: (lv_file_21_0= ruleFilePath )
                    // InternalRPL.g:2862:6: lv_file_21_0= ruleFilePath
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

            // InternalRPL.g:2880:3: ( (lv_lemmas_22_0= rulePastLemmas ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRPL.g:2881:4: (lv_lemmas_22_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2881:4: (lv_lemmas_22_0= rulePastLemmas )
                    // InternalRPL.g:2882:5: lv_lemmas_22_0= rulePastLemmas
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
    // InternalRPL.g:2907:1: entryRuleDerivedExtraInvariantPattern returns [EObject current=null] : iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF ;
    public final EObject entryRuleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2907:69: (iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF )
            // InternalRPL.g:2908:2: iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF
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
    // InternalRPL.g:2914:1: ruleDerivedExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' ) ;
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
            // InternalRPL.g:2920:2: ( (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' ) )
            // InternalRPL.g:2921:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' )
            {
            // InternalRPL.g:2921:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';' )
            // InternalRPL.g:2922:3: otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )? ( (lv_lemmas_28_0= ruleDerivedLemmas ) )? otherlv_29= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getDerivedeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2930:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2931:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2931:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2932:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2952:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRPL.g:2953:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2961:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2962:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2962:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2963:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalRPL.g:2980:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==27) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalRPL.g:2981:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2985:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2986:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2986:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2987:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:3006:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==43) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRPL.g:3007:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:3015:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:3016:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:3016:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:3017:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:3034:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==27) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalRPL.g:3035:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:3039:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:3040:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:3040:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:3041:7: lv_fnParams_13_0= ruleFunctionalParameter
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:3060:3: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==28) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRPL.g:3061:4: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_6_1());
                    			
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_6_2());
                    			
                    // InternalRPL.g:3073:4: ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:3074:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:3074:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:3075:6: lv_simpleFmParams_17_0= ruleSimpleFormulaParameter
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

                    // InternalRPL.g:3092:4: (otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==27) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalRPL.g:3093:5: otherlv_18= ',' ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalRPL.g:3097:5: ( (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:3098:6: (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3098:6: (lv_simpleFmParam_19_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:3099:7: lv_simpleFmParam_19_0= ruleSimpleFormulaParameter
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:3118:3: (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==29) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRPL.g:3119:4: otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_7_0());
                    			
                    otherlv_21=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_7_1());
                    			
                    // InternalRPL.g:3127:4: ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:3128:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:3128:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:3129:6: lv_fmParams_22_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_fmParams_22_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_22_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:3146:4: (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==27) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalRPL.g:3147:5: otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_23=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRPL.g:3151:5: ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:3152:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3152:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:3153:7: lv_fmParams_24_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_fmParams_24_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_24_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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

            otherlv_25=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_25, grammarAccess.getDerivedExtraInvariantPatternAccess().getRightParenthesisKeyword_8());
            		
            // InternalRPL.g:3176:3: (otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==32) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalRPL.g:3177:4: otherlv_26= 'from' ( (lv_file_27_0= ruleFilePath ) )
                    {
                    otherlv_26=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_26, grammarAccess.getDerivedExtraInvariantPatternAccess().getFromKeyword_9_0());
                    			
                    // InternalRPL.g:3181:4: ( (lv_file_27_0= ruleFilePath ) )
                    // InternalRPL.g:3182:5: (lv_file_27_0= ruleFilePath )
                    {
                    // InternalRPL.g:3182:5: (lv_file_27_0= ruleFilePath )
                    // InternalRPL.g:3183:6: lv_file_27_0= ruleFilePath
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

            // InternalRPL.g:3201:3: ( (lv_lemmas_28_0= ruleDerivedLemmas ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==55) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRPL.g:3202:4: (lv_lemmas_28_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:3202:4: (lv_lemmas_28_0= ruleDerivedLemmas )
                    // InternalRPL.g:3203:5: lv_lemmas_28_0= ruleDerivedLemmas
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
    // InternalRPL.g:3228:1: entryRuleFilePath returns [String current=null] : iv_ruleFilePath= ruleFilePath EOF ;
    public final String entryRuleFilePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilePath = null;


        try {
            // InternalRPL.g:3228:48: (iv_ruleFilePath= ruleFilePath EOF )
            // InternalRPL.g:3229:2: iv_ruleFilePath= ruleFilePath EOF
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
    // InternalRPL.g:3235:1: ruleFilePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFilePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Dir_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:3241:2: ( ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID ) )
            // InternalRPL.g:3242:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            {
            // InternalRPL.g:3242:2: ( (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID )
            // InternalRPL.g:3243:3: (kw= '/' )? (this_Dir_1= ruleDir kw= '/' )* this_ID_3= RULE_ID
            {
            // InternalRPL.g:3243:3: (kw= '/' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==46) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRPL.g:3244:4: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRPL.g:3250:3: (this_Dir_1= ruleDir kw= '/' )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ID) ) {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==46) ) {
                        alt75=1;
                    }


                }
                else if ( (LA75_0==36||LA75_0==47) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalRPL.g:3251:4: this_Dir_1= ruleDir kw= '/'
            	    {

            	    				newCompositeNode(grammarAccess.getFilePathAccess().getDirParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_43);
            	    this_Dir_1=ruleDir();

            	    state._fsp--;


            	    				current.merge(this_Dir_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			
            	    kw=(Token)match(input,46,FOLLOW_42); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFilePathAccess().getSolidusKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // InternalRPL.g:3278:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // InternalRPL.g:3278:43: (iv_ruleDir= ruleDir EOF )
            // InternalRPL.g:3279:2: iv_ruleDir= ruleDir EOF
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
    // InternalRPL.g:3285:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRPL.g:3291:2: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) )
            // InternalRPL.g:3292:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            {
            // InternalRPL.g:3292:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt76=1;
                }
                break;
            case 36:
                {
                alt76=2;
                }
                break;
            case 47:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalRPL.g:3293:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3301:3: kw= '.'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:3307:3: kw= '..'
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
    // InternalRPL.g:3316:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalRPL.g:3316:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalRPL.g:3317:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalRPL.g:3323:1: ruleTerm returns [EObject current=null] : (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3329:2: ( (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalRPL.g:3330:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalRPL.g:3330:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalRPL.g:3331:3: this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getConjunctionTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionTerm_0=ruleConjunctionTerm();

            state._fsp--;


            			current = this_ConjunctionTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3339:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_DISJUNCTION) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalRPL.g:3340:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalRPL.g:3340:4: ()
            	    // InternalRPL.g:3341:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getTermAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3351:4: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalRPL.g:3352:5: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalRPL.g:3352:5: (lv_right_3_0= ruleTerm )
            	    // InternalRPL.g:3353:6: lv_right_3_0= ruleTerm
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
            	    break loop77;
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
    // InternalRPL.g:3375:1: entryRuleConjunctionTerm returns [EObject current=null] : iv_ruleConjunctionTerm= ruleConjunctionTerm EOF ;
    public final EObject entryRuleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionTerm = null;


        try {
            // InternalRPL.g:3375:56: (iv_ruleConjunctionTerm= ruleConjunctionTerm EOF )
            // InternalRPL.g:3376:2: iv_ruleConjunctionTerm= ruleConjunctionTerm EOF
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
    // InternalRPL.g:3382:1: ruleConjunctionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) ;
    public final EObject ruleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3388:2: ( (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) )
            // InternalRPL.g:3389:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            {
            // InternalRPL.g:3389:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            // InternalRPL.g:3390:3: this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3398:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_CONJUNCTION) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalRPL.g:3399:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    {
            	    // InternalRPL.g:3399:4: ()
            	    // InternalRPL.g:3400:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionTermAccess().getConjunctionTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionTermAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3410:4: ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    // InternalRPL.g:3411:5: (lv_right_3_0= ruleConjunctionTerm )
            	    {
            	    // InternalRPL.g:3411:5: (lv_right_3_0= ruleConjunctionTerm )
            	    // InternalRPL.g:3412:6: lv_right_3_0= ruleConjunctionTerm
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
            	    break loop78;
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
    // InternalRPL.g:3434:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalRPL.g:3434:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalRPL.g:3435:2: iv_ruleNegationTerm= ruleNegationTerm EOF
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
    // InternalRPL.g:3441:1: ruleNegationTerm returns [EObject current=null] : (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token this_NEGATION_1=null;
        EObject this_EqTerm_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3447:2: ( (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) )
            // InternalRPL.g:3448:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            {
            // InternalRPL.g:3448:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_INTEGER)||LA79_0==RULE_BOOLEAN_LITERAL||LA79_0==RULE_REAL||LA79_0==24||LA79_0==50) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_NEGATION) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalRPL.g:3449:3: this_EqTerm_0= ruleEqTerm
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
                    // InternalRPL.g:3458:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    {
                    // InternalRPL.g:3458:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    // InternalRPL.g:3459:4: this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) )
                    {
                    this_NEGATION_1=(Token)match(input,RULE_NEGATION,FOLLOW_44); 

                    				newLeafNode(this_NEGATION_1, grammarAccess.getNegationTermAccess().getNEGATIONTerminalRuleCall_1_0());
                    			
                    // InternalRPL.g:3463:4: ( (lv_right_2_0= ruleEqTerm ) )
                    // InternalRPL.g:3464:5: (lv_right_2_0= ruleEqTerm )
                    {
                    // InternalRPL.g:3464:5: (lv_right_2_0= ruleEqTerm )
                    // InternalRPL.g:3465:6: lv_right_2_0= ruleEqTerm
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
    // InternalRPL.g:3487:1: entryRuleEqTerm returns [EObject current=null] : iv_ruleEqTerm= ruleEqTerm EOF ;
    public final EObject entryRuleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqTerm = null;


        try {
            // InternalRPL.g:3487:47: (iv_ruleEqTerm= ruleEqTerm EOF )
            // InternalRPL.g:3488:2: iv_ruleEqTerm= ruleEqTerm EOF
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
    // InternalRPL.g:3494:1: ruleEqTerm returns [EObject current=null] : (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) ;
    public final EObject ruleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompareTerm_0 = null;

        Enumerator lv_eqPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3500:2: ( (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) )
            // InternalRPL.g:3501:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            {
            // InternalRPL.g:3501:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            // InternalRPL.g:3502:3: this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqTermAccess().getCompareTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_CompareTerm_0=ruleCompareTerm();

            state._fsp--;


            			current = this_CompareTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3510:3: ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==72) ) {
                    alt80=1;
                }
                else if ( (LA80_0==73) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalRPL.g:3511:4: () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) )
            	    {
            	    // InternalRPL.g:3511:4: ()
            	    // InternalRPL.g:3512:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqTermAccess().getEqTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3518:4: ( (lv_eqPred_2_0= ruleEqPredicate ) )
            	    // InternalRPL.g:3519:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    {
            	    // InternalRPL.g:3519:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    // InternalRPL.g:3520:6: lv_eqPred_2_0= ruleEqPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getEqPredEqPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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

            	    // InternalRPL.g:3537:4: ( (lv_right_3_0= ruleEqTerm ) )
            	    // InternalRPL.g:3538:5: (lv_right_3_0= ruleEqTerm )
            	    {
            	    // InternalRPL.g:3538:5: (lv_right_3_0= ruleEqTerm )
            	    // InternalRPL.g:3539:6: lv_right_3_0= ruleEqTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getRightEqTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "ruleEqTerm"


    // $ANTLR start "entryRuleCompareTerm"
    // InternalRPL.g:3561:1: entryRuleCompareTerm returns [EObject current=null] : iv_ruleCompareTerm= ruleCompareTerm EOF ;
    public final EObject entryRuleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareTerm = null;


        try {
            // InternalRPL.g:3561:52: (iv_ruleCompareTerm= ruleCompareTerm EOF )
            // InternalRPL.g:3562:2: iv_ruleCompareTerm= ruleCompareTerm EOF
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
    // InternalRPL.g:3568:1: ruleCompareTerm returns [EObject current=null] : (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) ;
    public final EObject ruleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AddTerm_0 = null;

        Enumerator lv_compPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3574:2: ( (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) )
            // InternalRPL.g:3575:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            {
            // InternalRPL.g:3575:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            // InternalRPL.g:3576:3: this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareTermAccess().getAddTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_AddTerm_0=ruleAddTerm();

            state._fsp--;


            			current = this_AddTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3584:3: ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            loop81:
            do {
                int alt81=2;
                switch ( input.LA(1) ) {
                case 74:
                    {
                    alt81=1;
                    }
                    break;
                case 75:
                    {
                    alt81=1;
                    }
                    break;
                case 76:
                    {
                    alt81=1;
                    }
                    break;
                case 77:
                    {
                    alt81=1;
                    }
                    break;

                }

                switch (alt81) {
            	case 1 :
            	    // InternalRPL.g:3585:4: () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) )
            	    {
            	    // InternalRPL.g:3585:4: ()
            	    // InternalRPL.g:3586:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareTermAccess().getCompareTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3592:4: ( (lv_compPred_2_0= ruleCompPredicate ) )
            	    // InternalRPL.g:3593:5: (lv_compPred_2_0= ruleCompPredicate )
            	    {
            	    // InternalRPL.g:3593:5: (lv_compPred_2_0= ruleCompPredicate )
            	    // InternalRPL.g:3594:6: lv_compPred_2_0= ruleCompPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getCompPredCompPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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

            	    // InternalRPL.g:3611:4: ( (lv_right_3_0= ruleCompareTerm ) )
            	    // InternalRPL.g:3612:5: (lv_right_3_0= ruleCompareTerm )
            	    {
            	    // InternalRPL.g:3612:5: (lv_right_3_0= ruleCompareTerm )
            	    // InternalRPL.g:3613:6: lv_right_3_0= ruleCompareTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getRightCompareTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
    // $ANTLR end "ruleCompareTerm"


    // $ANTLR start "entryRuleAddTerm"
    // InternalRPL.g:3635:1: entryRuleAddTerm returns [EObject current=null] : iv_ruleAddTerm= ruleAddTerm EOF ;
    public final EObject entryRuleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTerm = null;


        try {
            // InternalRPL.g:3635:48: (iv_ruleAddTerm= ruleAddTerm EOF )
            // InternalRPL.g:3636:2: iv_ruleAddTerm= ruleAddTerm EOF
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
    // InternalRPL.g:3642:1: ruleAddTerm returns [EObject current=null] : (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) ;
    public final EObject ruleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject this_MulTerm_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3648:2: ( (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) )
            // InternalRPL.g:3649:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            {
            // InternalRPL.g:3649:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            // InternalRPL.g:3650:3: this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddTermAccess().getMulTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_MulTerm_0=ruleMulTerm();

            state._fsp--;


            			current = this_MulTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3658:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==78) ) {
                    alt82=1;
                }
                else if ( (LA82_0==50) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalRPL.g:3659:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) )
            	    {
            	    // InternalRPL.g:3659:4: ()
            	    // InternalRPL.g:3660:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddTermAccess().getAddTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3666:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalRPL.g:3667:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalRPL.g:3667:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalRPL.g:3668:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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

            	    // InternalRPL.g:3685:4: ( (lv_right_3_0= ruleAddTerm ) )
            	    // InternalRPL.g:3686:5: (lv_right_3_0= ruleAddTerm )
            	    {
            	    // InternalRPL.g:3686:5: (lv_right_3_0= ruleAddTerm )
            	    // InternalRPL.g:3687:6: lv_right_3_0= ruleAddTerm
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getRightAddTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
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
    // $ANTLR end "ruleAddTerm"


    // $ANTLR start "entryRuleMulTerm"
    // InternalRPL.g:3709:1: entryRuleMulTerm returns [EObject current=null] : iv_ruleMulTerm= ruleMulTerm EOF ;
    public final EObject entryRuleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulTerm = null;


        try {
            // InternalRPL.g:3709:48: (iv_ruleMulTerm= ruleMulTerm EOF )
            // InternalRPL.g:3710:2: iv_ruleMulTerm= ruleMulTerm EOF
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
    // InternalRPL.g:3716:1: ruleMulTerm returns [EObject current=null] : (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) ;
    public final EObject ruleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PowerTerm_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3722:2: ( (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) )
            // InternalRPL.g:3723:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            {
            // InternalRPL.g:3723:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            // InternalRPL.g:3724:3: this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulTermAccess().getPowerTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_PowerTerm_0=rulePowerTerm();

            state._fsp--;


            			current = this_PowerTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3732:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            loop83:
            do {
                int alt83=2;
                switch ( input.LA(1) ) {
                case 79:
                    {
                    alt83=1;
                    }
                    break;
                case 46:
                    {
                    alt83=1;
                    }
                    break;
                case 80:
                    {
                    alt83=1;
                    }
                    break;

                }

                switch (alt83) {
            	case 1 :
            	    // InternalRPL.g:3733:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) )
            	    {
            	    // InternalRPL.g:3733:4: ()
            	    // InternalRPL.g:3734:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulTermAccess().getMulTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3740:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalRPL.g:3741:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalRPL.g:3741:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalRPL.g:3742:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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

            	    // InternalRPL.g:3759:4: ( (lv_right_3_0= ruleMulTerm ) )
            	    // InternalRPL.g:3760:5: (lv_right_3_0= ruleMulTerm )
            	    {
            	    // InternalRPL.g:3760:5: (lv_right_3_0= ruleMulTerm )
            	    // InternalRPL.g:3761:6: lv_right_3_0= ruleMulTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getRightMulTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
    // $ANTLR end "ruleMulTerm"


    // $ANTLR start "entryRulePowerTerm"
    // InternalRPL.g:3783:1: entryRulePowerTerm returns [EObject current=null] : iv_rulePowerTerm= rulePowerTerm EOF ;
    public final EObject entryRulePowerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerTerm = null;


        try {
            // InternalRPL.g:3783:50: (iv_rulePowerTerm= rulePowerTerm EOF )
            // InternalRPL.g:3784:2: iv_rulePowerTerm= rulePowerTerm EOF
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
    // InternalRPL.g:3790:1: rulePowerTerm returns [EObject current=null] : (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) ;
    public final EObject rulePowerTerm() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3796:2: ( (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) )
            // InternalRPL.g:3797:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            {
            // InternalRPL.g:3797:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            // InternalRPL.g:3798:3: this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerTermAccess().getUnaryTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_UnaryTerm_0=ruleUnaryTerm();

            state._fsp--;


            			current = this_UnaryTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3806:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==RULE_POWER_OPERATOR) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalRPL.g:3807:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) )
            	    {
            	    // InternalRPL.g:3807:4: ()
            	    // InternalRPL.g:3808:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerTermAccess().getPowerTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_44); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerTermAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3818:4: ( (lv_right_3_0= rulePowerTerm ) )
            	    // InternalRPL.g:3819:5: (lv_right_3_0= rulePowerTerm )
            	    {
            	    // InternalRPL.g:3819:5: (lv_right_3_0= rulePowerTerm )
            	    // InternalRPL.g:3820:6: lv_right_3_0= rulePowerTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPowerTermAccess().getRightPowerTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
    // $ANTLR end "rulePowerTerm"


    // $ANTLR start "entryRuleUnaryTerm"
    // InternalRPL.g:3842:1: entryRuleUnaryTerm returns [EObject current=null] : iv_ruleUnaryTerm= ruleUnaryTerm EOF ;
    public final EObject entryRuleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTerm = null;


        try {
            // InternalRPL.g:3842:50: (iv_ruleUnaryTerm= ruleUnaryTerm EOF )
            // InternalRPL.g:3843:2: iv_ruleUnaryTerm= ruleUnaryTerm EOF
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
    // InternalRPL.g:3849:1: ruleUnaryTerm returns [EObject current=null] : (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) ;
    public final EObject ruleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryTerm_0 = null;

        Enumerator lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3855:2: ( (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) )
            // InternalRPL.g:3856:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            {
            // InternalRPL.g:3856:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==50) ) {
                switch ( input.LA(2) ) {
                case RULE_INTEGER:
                    {
                    alt85=1;
                    }
                    break;
                case RULE_REAL:
                    {
                    alt85=1;
                    }
                    break;
                case RULE_ID:
                case RULE_BOOLEAN_LITERAL:
                case 24:
                case 50:
                    {
                    alt85=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_INTEGER)||LA85_0==RULE_BOOLEAN_LITERAL||LA85_0==RULE_REAL||LA85_0==24) ) {
                alt85=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalRPL.g:3857:3: this_PrimaryTerm_0= rulePrimaryTerm
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
                    // InternalRPL.g:3866:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    {
                    // InternalRPL.g:3866:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    // InternalRPL.g:3867:4: ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) )
                    {
                    // InternalRPL.g:3867:4: ( (lv_unOp_1_0= ruleUnMinus ) )
                    // InternalRPL.g:3868:5: (lv_unOp_1_0= ruleUnMinus )
                    {
                    // InternalRPL.g:3868:5: (lv_unOp_1_0= ruleUnMinus )
                    // InternalRPL.g:3869:6: lv_unOp_1_0= ruleUnMinus
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getUnOpUnMinusEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalRPL.g:3886:4: ( (lv_right_2_0= rulePrimaryTerm ) )
                    // InternalRPL.g:3887:5: (lv_right_2_0= rulePrimaryTerm )
                    {
                    // InternalRPL.g:3887:5: (lv_right_2_0= rulePrimaryTerm )
                    // InternalRPL.g:3888:6: lv_right_2_0= rulePrimaryTerm
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
    // InternalRPL.g:3910:1: entryRulePrimaryTerm returns [EObject current=null] : iv_rulePrimaryTerm= rulePrimaryTerm EOF ;
    public final EObject entryRulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryTerm = null;


        try {
            // InternalRPL.g:3910:52: (iv_rulePrimaryTerm= rulePrimaryTerm EOF )
            // InternalRPL.g:3911:2: iv_rulePrimaryTerm= rulePrimaryTerm EOF
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
    // InternalRPL.g:3917:1: rulePrimaryTerm returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) ;
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
            // InternalRPL.g:3923:2: ( ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) )
            // InternalRPL.g:3924:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            {
            // InternalRPL.g:3924:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            int alt86=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
            case RULE_REAL:
            case 50:
                {
                alt86=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt86=4;
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
                case 38:
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
                    alt86=2;
                    }
                    break;
                case 48:
                    {
                    alt86=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt86=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalRPL.g:3925:3: ( (lv_const_0_0= ruleConstant ) )
                    {
                    // InternalRPL.g:3925:3: ( (lv_const_0_0= ruleConstant ) )
                    // InternalRPL.g:3926:4: (lv_const_0_0= ruleConstant )
                    {
                    // InternalRPL.g:3926:4: (lv_const_0_0= ruleConstant )
                    // InternalRPL.g:3927:5: lv_const_0_0= ruleConstant
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
                    // InternalRPL.g:3945:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalRPL.g:3945:3: ( (otherlv_1= RULE_ID ) )
                    // InternalRPL.g:3946:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRPL.g:3946:4: (otherlv_1= RULE_ID )
                    // InternalRPL.g:3947:5: otherlv_1= RULE_ID
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
                    // InternalRPL.g:3959:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    {
                    // InternalRPL.g:3959:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    // InternalRPL.g:3960:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']'
                    {
                    // InternalRPL.g:3960:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPL.g:3961:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPL.g:3961:5: (otherlv_2= RULE_ID )
                    // InternalRPL.g:3962:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_50); 

                    						newLeafNode(otherlv_2, grammarAccess.getPrimaryTermAccess().getStateUpdateStateVariableCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTermAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalRPL.g:3977:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:3978:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:3978:5: (otherlv_4= RULE_ID )
                    // InternalRPL.g:3979:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_51); 

                    						newLeafNode(otherlv_4, grammarAccess.getPrimaryTermAccess().getVariableProgramVariableCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryTermAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:3996:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    {
                    // InternalRPL.g:3996:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    // InternalRPL.g:3997:4: (lv_funApp_6_0= ruleFunApplication )
                    {
                    // InternalRPL.g:3997:4: (lv_funApp_6_0= ruleFunApplication )
                    // InternalRPL.g:3998:5: lv_funApp_6_0= ruleFunApplication
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
                    // InternalRPL.g:4016:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // InternalRPL.g:4016:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // InternalRPL.g:4017:4: otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryTermAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalRPL.g:4021:4: ( (lv_nestedTerm_8_0= ruleTerm ) )
                    // InternalRPL.g:4022:5: (lv_nestedTerm_8_0= ruleTerm )
                    {
                    // InternalRPL.g:4022:5: (lv_nestedTerm_8_0= ruleTerm )
                    // InternalRPL.g:4023:6: lv_nestedTerm_8_0= ruleTerm
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
    // InternalRPL.g:4049:1: entryRuleFunApplication returns [EObject current=null] : iv_ruleFunApplication= ruleFunApplication EOF ;
    public final EObject entryRuleFunApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunApplication = null;


        try {
            // InternalRPL.g:4049:55: (iv_ruleFunApplication= ruleFunApplication EOF )
            // InternalRPL.g:4050:2: iv_ruleFunApplication= ruleFunApplication EOF
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
    // InternalRPL.g:4056:1: ruleFunApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:4062:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRPL.g:4063:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRPL.g:4063:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRPL.g:4064:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalRPL.g:4064:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:4065:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:4065:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:4066:5: otherlv_0= RULE_ID
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
            		
            // InternalRPL.g:4081:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:4082:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:4082:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:4083:5: otherlv_2= RULE_ID
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
    // InternalRPL.g:4102:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRPL.g:4102:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRPL.g:4103:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalRPL.g:4109:1: ruleConstant returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4115:2: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalRPL.g:4116:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalRPL.g:4116:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_INTEGER||LA87_0==RULE_REAL||LA87_0==50) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_BOOLEAN_LITERAL) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalRPL.g:4117:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // InternalRPL.g:4117:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // InternalRPL.g:4118:4: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // InternalRPL.g:4118:4: (lv_num_0_0= ruleNumericLiteral )
                    // InternalRPL.g:4119:5: lv_num_0_0= ruleNumericLiteral
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
                    // InternalRPL.g:4137:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:4137:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:4138:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:4138:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:4139:5: lv_bool_1_0= RULE_BOOLEAN_LITERAL
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
    // InternalRPL.g:4159:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalRPL.g:4159:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalRPL.g:4160:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalRPL.g:4166:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:4172:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalRPL.g:4173:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalRPL.g:4173:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt88=2;
            switch ( input.LA(1) ) {
            case 50:
                {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_INTEGER) ) {
                    alt88=1;
                }
                else if ( (LA88_1==RULE_REAL) ) {
                    alt88=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                alt88=1;
                }
                break;
            case RULE_REAL:
                {
                alt88=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalRPL.g:4174:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalRPL.g:4183:3: this_RealLiteral_1= ruleRealLiteral
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
    // InternalRPL.g:4195:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalRPL.g:4195:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalRPL.g:4196:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalRPL.g:4202:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4208:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalRPL.g:4209:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalRPL.g:4209:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalRPL.g:4210:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalRPL.g:4210:3: ( (lv_sig_0_0= '-' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==50) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalRPL.g:4211:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4211:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4212:5: lv_sig_0_0= '-'
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

            // InternalRPL.g:4224:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalRPL.g:4225:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalRPL.g:4225:4: (lv_value_1_0= RULE_INTEGER )
            // InternalRPL.g:4226:5: lv_value_1_0= RULE_INTEGER
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
    // InternalRPL.g:4246:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalRPL.g:4246:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalRPL.g:4247:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalRPL.g:4253:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4259:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRPL.g:4260:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRPL.g:4260:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRPL.g:4261:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRPL.g:4261:3: ( (lv_sig_0_0= '-' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==50) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalRPL.g:4262:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4262:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4263:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,50,FOLLOW_52); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getRealLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4275:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRPL.g:4276:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalRPL.g:4276:4: (lv_value_1_0= RULE_REAL )
            // InternalRPL.g:4277:5: lv_value_1_0= RULE_REAL
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
    // InternalRPL.g:4297:1: entryRulePatternFreeFormula returns [EObject current=null] : iv_rulePatternFreeFormula= rulePatternFreeFormula EOF ;
    public final EObject entryRulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormula = null;


        try {
            // InternalRPL.g:4297:59: (iv_rulePatternFreeFormula= rulePatternFreeFormula EOF )
            // InternalRPL.g:4298:2: iv_rulePatternFreeFormula= rulePatternFreeFormula EOF
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
    // InternalRPL.g:4304:1: rulePatternFreeFormula returns [EObject current=null] : (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) ;
    public final EObject rulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4310:2: ( (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4311:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4311:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            // InternalRPL.g:4312:3: this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionPatternFreeFormula_0=ruleConjunctionPatternFreeFormula();

            state._fsp--;


            			current = this_ConjunctionPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4320:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==RULE_DISJUNCTION) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalRPL.g:4321:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4321:4: ()
            	    // InternalRPL.g:4322:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPatternFreeFormulaAccess().getPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getPatternFreeFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4332:4: ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    // InternalRPL.g:4333:5: (lv_right_3_0= rulePatternFreeFormula )
            	    {
            	    // InternalRPL.g:4333:5: (lv_right_3_0= rulePatternFreeFormula )
            	    // InternalRPL.g:4334:6: lv_right_3_0= rulePatternFreeFormula
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
            	    break loop91;
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
    // InternalRPL.g:4356:1: entryRuleConjunctionPatternFreeFormula returns [EObject current=null] : iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF ;
    public final EObject entryRuleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionPatternFreeFormula = null;


        try {
            // InternalRPL.g:4356:70: (iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF )
            // InternalRPL.g:4357:2: iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF
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
    // InternalRPL.g:4363:1: ruleConjunctionPatternFreeFormula returns [EObject current=null] : (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) ;
    public final EObject ruleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4369:2: ( (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4370:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4370:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            // InternalRPL.g:4371:3: this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getPrimaryPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryPatternFreeFormula_0=rulePrimaryPatternFreeFormula();

            state._fsp--;


            			current = this_PrimaryPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4379:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_CONJUNCTION) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalRPL.g:4380:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4380:4: ()
            	    // InternalRPL.g:4381:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_28); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionPatternFreeFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4391:4: ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    // InternalRPL.g:4392:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    {
            	    // InternalRPL.g:4392:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    // InternalRPL.g:4393:6: lv_right_3_0= ruleConjunctionPatternFreeFormula
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
            	    break loop92;
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
    // InternalRPL.g:4415:1: entryRulePrimaryPatternFreeFormula returns [EObject current=null] : iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF ;
    public final EObject entryRulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPatternFreeFormula = null;


        try {
            // InternalRPL.g:4415:66: (iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF )
            // InternalRPL.g:4416:2: iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF
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
    // InternalRPL.g:4422:1: rulePrimaryPatternFreeFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4428:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:4429:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:4429:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||(LA93_0>=RULE_NEGATION && LA93_0<=RULE_BOOLEAN_LITERAL)||LA93_0==37) ) {
                alt93=1;
            }
            else if ( (LA93_0==24) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalRPL.g:4430:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:4430:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:4431:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:4431:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:4432:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:4450:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:4450:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:4451:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryPatternFreeFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:4455:4: ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:4456:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:4456:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    // InternalRPL.g:4457:6: lv_nestedFormula_2_0= rulePatternFreeFormula
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
    // InternalRPL.g:4483:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRPL.g:4483:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRPL.g:4484:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRPL.g:4490:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) ;
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
            // InternalRPL.g:4496:2: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' ) )
            // InternalRPL.g:4497:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            {
            // InternalRPL.g:4497:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';' )
            // InternalRPL.g:4498:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) ) otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalRPL.g:4502:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4503:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4503:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4504:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            // InternalRPL.g:4520:3: ( (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' ) | (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==31) ) {
                alt98=1;
            }
            else if ( (LA98_0==26) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalRPL.g:4521:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    {
                    // InternalRPL.g:4521:4: (otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')' )
                    // InternalRPL.g:4522:5: otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )? (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )? otherlv_15= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getEqualsSignKeyword_2_0_0());
                    				
                    // InternalRPL.g:4526:5: ( (otherlv_3= RULE_ID ) )
                    // InternalRPL.g:4527:6: (otherlv_3= RULE_ID )
                    {
                    // InternalRPL.g:4527:6: (otherlv_3= RULE_ID )
                    // InternalRPL.g:4528:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequirementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_2_0_1_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLeftParenthesisKeyword_2_0_2());
                    				
                    // InternalRPL.g:4543:5: (otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==25) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalRPL.g:4544:6: otherlv_5= 'const' otherlv_6= ':' ( (lv_cParams_7_0= ruleTerm ) ) (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_11); 

                            						newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getConstKeyword_2_0_3_0());
                            					
                            otherlv_6=(Token)match(input,26,FOLLOW_27); 

                            						newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getColonKeyword_2_0_3_1());
                            					
                            // InternalRPL.g:4552:6: ( (lv_cParams_7_0= ruleTerm ) )
                            // InternalRPL.g:4553:7: (lv_cParams_7_0= ruleTerm )
                            {
                            // InternalRPL.g:4553:7: (lv_cParams_7_0= ruleTerm )
                            // InternalRPL.g:4554:8: lv_cParams_7_0= ruleTerm
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

                            // InternalRPL.g:4571:6: (otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) ) )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==27) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // InternalRPL.g:4572:7: otherlv_8= ',' ( (lv_cParams_9_0= ruleTerm ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_27); 

                            	    							newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_3_3_0());
                            	    						
                            	    // InternalRPL.g:4576:7: ( (lv_cParams_9_0= ruleTerm ) )
                            	    // InternalRPL.g:4577:8: (lv_cParams_9_0= ruleTerm )
                            	    {
                            	    // InternalRPL.g:4577:8: (lv_cParams_9_0= ruleTerm )
                            	    // InternalRPL.g:4578:9: lv_cParams_9_0= ruleTerm
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
                            	    break loop94;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalRPL.g:4597:5: (otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )* )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==29) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalRPL.g:4598:6: otherlv_10= 'formulas' otherlv_11= ':' ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_11); 

                            						newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getFormulasKeyword_2_0_4_0());
                            					
                            otherlv_11=(Token)match(input,26,FOLLOW_28); 

                            						newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getColonKeyword_2_0_4_1());
                            					
                            // InternalRPL.g:4606:6: ( (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                            // InternalRPL.g:4607:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            {
                            // InternalRPL.g:4607:7: (lv_fmParams_12_0= rulePatternFreeFormulaParameterValue )
                            // InternalRPL.g:4608:8: lv_fmParams_12_0= rulePatternFreeFormulaParameterValue
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

                            // InternalRPL.g:4625:6: (otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) ) )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==27) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // InternalRPL.g:4626:7: otherlv_13= ',' ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    {
                            	    otherlv_13=(Token)match(input,27,FOLLOW_28); 

                            	    							newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getCommaKeyword_2_0_4_3_0());
                            	    						
                            	    // InternalRPL.g:4630:7: ( (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue ) )
                            	    // InternalRPL.g:4631:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    {
                            	    // InternalRPL.g:4631:8: (lv_fmParams_14_0= rulePatternFreeFormulaParameterValue )
                            	    // InternalRPL.g:4632:9: lv_fmParams_14_0= rulePatternFreeFormulaParameterValue
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
                            	    break loop96;
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
                    // InternalRPL.g:4657:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4657:4: (otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) ) )
                    // InternalRPL.g:4658:5: otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= 'with' ( (lv_extraIn_19_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getColonKeyword_2_1_0());
                    				
                    // InternalRPL.g:4662:5: ( (otherlv_17= RULE_ID ) )
                    // InternalRPL.g:4663:6: (otherlv_17= RULE_ID )
                    {
                    // InternalRPL.g:4663:6: (otherlv_17= RULE_ID )
                    // InternalRPL.g:4664:7: otherlv_17= RULE_ID
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
                    				
                    // InternalRPL.g:4679:5: ( (lv_extraIn_19_0= RULE_ID ) )
                    // InternalRPL.g:4680:6: (lv_extraIn_19_0= RULE_ID )
                    {
                    // InternalRPL.g:4680:6: (lv_extraIn_19_0= RULE_ID )
                    // InternalRPL.g:4681:7: lv_extraIn_19_0= RULE_ID
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
    // InternalRPL.g:4707:1: entryRuleExtraInvariant returns [EObject current=null] : iv_ruleExtraInvariant= ruleExtraInvariant EOF ;
    public final EObject entryRuleExtraInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraInvariant = null;


        try {
            // InternalRPL.g:4707:55: (iv_ruleExtraInvariant= ruleExtraInvariant EOF )
            // InternalRPL.g:4708:2: iv_ruleExtraInvariant= ruleExtraInvariant EOF
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
    // InternalRPL.g:4714:1: ruleExtraInvariant returns [EObject current=null] : (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) ;
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
            // InternalRPL.g:4720:2: ( (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' ) )
            // InternalRPL.g:4721:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            {
            // InternalRPL.g:4721:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';' )
            // InternalRPL.g:4722:3: otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getExtraInvariantAccess().getExtraKeyword_0());
            		
            otherlv_1=(Token)match(input,53,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraInvariantAccess().getInvariantKeyword_1());
            		
            // InternalRPL.g:4730:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:4731:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:4731:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:4732:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_55); 

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

            // InternalRPL.g:4748:3: ( (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) ) | (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==26) ) {
                alt99=1;
            }
            else if ( (LA99_0==54) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalRPL.g:4749:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4749:4: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) ) )
                    // InternalRPL.g:4750:5: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_reqName_6_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getExtraInvariantAccess().getColonKeyword_3_0_0());
                    				
                    // InternalRPL.g:4754:5: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:4755:6: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:4755:6: (otherlv_4= RULE_ID )
                    // InternalRPL.g:4756:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtraInvariantRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_56); 

                    							newLeafNode(otherlv_4, grammarAccess.getExtraInvariantAccess().getPatternDerivedExtraInvariantPatternCrossReference_3_0_1_0());
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,54,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getExtraInvariantAccess().getForKeyword_3_0_2());
                    				
                    // InternalRPL.g:4771:5: ( (lv_reqName_6_0= RULE_ID ) )
                    // InternalRPL.g:4772:6: (lv_reqName_6_0= RULE_ID )
                    {
                    // InternalRPL.g:4772:6: (lv_reqName_6_0= RULE_ID )
                    // InternalRPL.g:4773:7: lv_reqName_6_0= RULE_ID
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
                    // InternalRPL.g:4791:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalRPL.g:4791:4: (otherlv_7= 'for' ( (otherlv_8= RULE_ID ) ) )
                    // InternalRPL.g:4792:5: otherlv_7= 'for' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getExtraInvariantAccess().getForKeyword_3_1_0());
                    				
                    // InternalRPL.g:4796:5: ( (otherlv_8= RULE_ID ) )
                    // InternalRPL.g:4797:6: (otherlv_8= RULE_ID )
                    {
                    // InternalRPL.g:4797:6: (otherlv_8= RULE_ID )
                    // InternalRPL.g:4798:7: otherlv_8= RULE_ID
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
    // InternalRPL.g:4819:1: entryRulePatternFreeFormulaParameterValue returns [EObject current=null] : iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF ;
    public final EObject entryRulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormulaParameterValue = null;


        try {
            // InternalRPL.g:4819:73: (iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF )
            // InternalRPL.g:4820:2: iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF
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
    // InternalRPL.g:4826:1: rulePatternFreeFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) ;
    public final EObject rulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4832:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) )
            // InternalRPL.g:4833:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            {
            // InternalRPL.g:4833:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            // InternalRPL.g:4834:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) )
            {
            // InternalRPL.g:4834:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==35) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalRPL.g:4835:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternFreeFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:4839:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt100=0;
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==RULE_ID) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalRPL.g:4840:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:4840:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:4841:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                    	    if ( cnt100 >= 1 ) break loop100;
                                EarlyExitException eee =
                                    new EarlyExitException(100, input);
                                throw eee;
                        }
                        cnt100++;
                    } while (true);

                    otherlv_2=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternFreeFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:4863:3: ( (lv_formula_3_0= rulePatternFreeFormula ) )
            // InternalRPL.g:4864:4: (lv_formula_3_0= rulePatternFreeFormula )
            {
            // InternalRPL.g:4864:4: (lv_formula_3_0= rulePatternFreeFormula )
            // InternalRPL.g:4865:5: lv_formula_3_0= rulePatternFreeFormula
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
    // InternalRPL.g:4886:1: entryRuleFutureLemmas returns [EObject current=null] : iv_ruleFutureLemmas= ruleFutureLemmas EOF ;
    public final EObject entryRuleFutureLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureLemmas = null;


        try {
            // InternalRPL.g:4886:53: (iv_ruleFutureLemmas= ruleFutureLemmas EOF )
            // InternalRPL.g:4887:2: iv_ruleFutureLemmas= ruleFutureLemmas EOF
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
    // InternalRPL.g:4893:1: ruleFutureLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) ;
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
            // InternalRPL.g:4899:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) )
            // InternalRPL.g:4900:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            {
            // InternalRPL.g:4900:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalRPL.g:4901:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalRPL.g:4901:3: ()
            // InternalRPL.g:4902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureLemmasAccess().getFutureLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4908:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalRPL.g:4909:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_57); 

            				newLeafNode(otherlv_1, grammarAccess.getFutureLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_58); 

            				newLeafNode(otherlv_2, grammarAccess.getFutureLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4917:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4918:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4918:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4919:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4922:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4923:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4923:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            loop102:
            do {
                int alt102=4;
                int LA102_0 = input.LA(1);

                if ( LA102_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt102=1;
                }
                else if ( LA102_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt102=2;
                }
                else if ( LA102_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt102=3;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalRPL.g:4924:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4924:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4925:6: {...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4925:112: ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4926:7: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4929:10: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4929:11: {...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4929:20: (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4929:21: otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_59); 

            	    										newLeafNode(otherlv_4, grammarAccess.getFutureLemmasAccess().getLS1Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4933:10: ( (lv_L1_5_0= ruleLemma ) )
            	    // InternalRPL.g:4934:11: (lv_L1_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4934:11: (lv_L1_5_0= ruleLemma )
            	    // InternalRPL.g:4935:12: lv_L1_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL1LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_58);
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
            	    // InternalRPL.g:4958:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4958:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4959:6: {...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4959:112: ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4960:7: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4963:10: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4963:11: {...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4963:20: (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4963:21: otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,58,FOLLOW_59); 

            	    										newLeafNode(otherlv_6, grammarAccess.getFutureLemmasAccess().getLS2Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4967:10: ( (lv_L2_7_0= ruleLemma ) )
            	    // InternalRPL.g:4968:11: (lv_L2_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4968:11: (lv_L2_7_0= ruleLemma )
            	    // InternalRPL.g:4969:12: lv_L2_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL2LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_58);
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
            	    // InternalRPL.g:4992:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4992:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4993:6: {...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4993:112: ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4994:7: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4997:10: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4997:11: {...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4997:20: (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4997:21: otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,59,FOLLOW_59); 

            	    										newLeafNode(otherlv_8, grammarAccess.getFutureLemmasAccess().getLS3Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:5001:10: ( (lv_L3_9_0= ruleLemma ) )
            	    // InternalRPL.g:5002:11: (lv_L3_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5002:11: (lv_L3_9_0= ruleLemma )
            	    // InternalRPL.g:5003:12: lv_L3_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL3LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_58);
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
            	    break loop102;
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
    // InternalRPL.g:5042:1: entryRulePastLemmas returns [EObject current=null] : iv_rulePastLemmas= rulePastLemmas EOF ;
    public final EObject entryRulePastLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastLemmas = null;


        try {
            // InternalRPL.g:5042:51: (iv_rulePastLemmas= rulePastLemmas EOF )
            // InternalRPL.g:5043:2: iv_rulePastLemmas= rulePastLemmas EOF
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
    // InternalRPL.g:5049:1: rulePastLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) ;
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
            // InternalRPL.g:5055:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) )
            // InternalRPL.g:5056:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            {
            // InternalRPL.g:5056:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalRPL.g:5057:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalRPL.g:5057:3: ()
            // InternalRPL.g:5058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastLemmasAccess().getPastLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:5064:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalRPL.g:5065:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_57); 

            				newLeafNode(otherlv_1, grammarAccess.getPastLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_60); 

            				newLeafNode(otherlv_2, grammarAccess.getPastLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:5073:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:5074:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:5074:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:5075:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:5078:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:5079:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:5079:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            loop103:
            do {
                int alt103=5;
                int LA103_0 = input.LA(1);

                if ( LA103_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt103=1;
                }
                else if ( LA103_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt103=2;
                }
                else if ( LA103_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt103=3;
                }
                else if ( LA103_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt103=4;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalRPL.g:5080:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5080:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5081:6: {...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:5081:110: ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5082:7: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:5085:10: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5085:11: {...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5085:20: (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:5085:21: otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_59); 

            	    										newLeafNode(otherlv_4, grammarAccess.getPastLemmasAccess().getLS4Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:5089:10: ( (lv_L4_5_0= ruleLemma ) )
            	    // InternalRPL.g:5090:11: (lv_L4_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5090:11: (lv_L4_5_0= ruleLemma )
            	    // InternalRPL.g:5091:12: lv_L4_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL4LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_60);
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
            	    // InternalRPL.g:5114:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5114:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5115:6: {...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:5115:110: ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5116:7: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:5119:10: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5119:11: {...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5119:20: (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:5119:21: otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_59); 

            	    										newLeafNode(otherlv_6, grammarAccess.getPastLemmasAccess().getLS5Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:5123:10: ( (lv_L5_7_0= ruleLemma ) )
            	    // InternalRPL.g:5124:11: (lv_L5_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5124:11: (lv_L5_7_0= ruleLemma )
            	    // InternalRPL.g:5125:12: lv_L5_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL5LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_60);
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
            	    // InternalRPL.g:5148:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5148:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5149:6: {...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:5149:110: ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5150:7: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:5153:10: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5153:11: {...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5153:20: (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:5153:21: otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,63,FOLLOW_59); 

            	    										newLeafNode(otherlv_8, grammarAccess.getPastLemmasAccess().getLS6Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:5157:10: ( (lv_L6_9_0= ruleLemma ) )
            	    // InternalRPL.g:5158:11: (lv_L6_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5158:11: (lv_L6_9_0= ruleLemma )
            	    // InternalRPL.g:5159:12: lv_L6_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL6LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_60);
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
            	    // InternalRPL.g:5182:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5182:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5183:6: {...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // InternalRPL.g:5183:110: ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5184:7: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3);
            	    						
            	    // InternalRPL.g:5187:10: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5187:11: {...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:5187:20: (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    // InternalRPL.g:5187:21: otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) )
            	    {
            	    otherlv_10=(Token)match(input,64,FOLLOW_59); 

            	    										newLeafNode(otherlv_10, grammarAccess.getPastLemmasAccess().getLS7Keyword_1_2_3_0());
            	    									
            	    // InternalRPL.g:5191:10: ( (lv_L7_11_0= ruleLemma ) )
            	    // InternalRPL.g:5192:11: (lv_L7_11_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5192:11: (lv_L7_11_0= ruleLemma )
            	    // InternalRPL.g:5193:12: lv_L7_11_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL7LemmaParserRuleCall_1_2_3_1_0());
            	    											
            	    pushFollow(FOLLOW_60);
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
            	    break loop103;
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
    // InternalRPL.g:5232:1: entryRuleDerivedLemmas returns [EObject current=null] : iv_ruleDerivedLemmas= ruleDerivedLemmas EOF ;
    public final EObject entryRuleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedLemmas = null;


        try {
            // InternalRPL.g:5232:54: (iv_ruleDerivedLemmas= ruleDerivedLemmas EOF )
            // InternalRPL.g:5233:2: iv_ruleDerivedLemmas= ruleDerivedLemmas EOF
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
    // InternalRPL.g:5239:1: ruleDerivedLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) ;
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
            // InternalRPL.g:5245:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) )
            // InternalRPL.g:5246:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            {
            // InternalRPL.g:5246:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRPL.g:5247:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRPL.g:5247:3: ()
            // InternalRPL.g:5248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedLemmasAccess().getDerivedLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:5254:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRPL.g:5255:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_1=(Token)match(input,55,FOLLOW_57); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,56,FOLLOW_61); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:5263:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:5264:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:5264:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:5265:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:5268:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:5269:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:5269:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            loop104:
            do {
                int alt104=3;
                int LA104_0 = input.LA(1);

                if ( LA104_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt104=1;
                }
                else if ( LA104_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt104=2;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalRPL.g:5270:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5270:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5271:6: {...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:5271:113: ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5272:7: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:5275:10: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5275:11: {...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:5275:20: (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:5275:21: otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,65,FOLLOW_59); 

            	    										newLeafNode(otherlv_4, grammarAccess.getDerivedLemmasAccess().getLS8Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:5279:10: ( (lv_L8_5_0= ruleLemma ) )
            	    // InternalRPL.g:5280:11: (lv_L8_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5280:11: (lv_L8_5_0= ruleLemma )
            	    // InternalRPL.g:5281:12: lv_L8_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL8LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_61);
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
            	    // InternalRPL.g:5304:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5304:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:5305:6: {...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:5305:113: ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:5306:7: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:5309:10: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:5309:11: {...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:5309:20: (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:5309:21: otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,66,FOLLOW_59); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedLemmasAccess().getLS9Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:5313:10: ( (lv_L9_7_0= ruleLemma ) )
            	    // InternalRPL.g:5314:11: (lv_L9_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:5314:11: (lv_L9_7_0= ruleLemma )
            	    // InternalRPL.g:5315:12: lv_L9_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL9LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_61);
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
            	    break loop104;
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
    // InternalRPL.g:5354:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // InternalRPL.g:5354:46: (iv_ruleLemma= ruleLemma EOF )
            // InternalRPL.g:5355:2: iv_ruleLemma= ruleLemma EOF
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
    // InternalRPL.g:5361:1: ruleLemma returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        EObject lv_cVars_6_0 = null;

        EObject lv_cVars_8_0 = null;

        EObject lv_fnVars_11_0 = null;

        EObject lv_fnVars_13_0 = null;

        EObject lv_simpleFmVars_17_0 = null;

        EObject lv_simpleFmVars_19_0 = null;

        EObject lv_ifmVars_24_0 = null;

        EObject lv_ifmVars_26_0 = null;

        EObject lv_rfmVars_30_0 = null;

        EObject lv_rfmVars_32_0 = null;

        EObject lv_initState_36_0 = null;

        EObject lv_finalState_40_0 = null;

        EObject lv_prem_42_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5367:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) ) )
            // InternalRPL.g:5368:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRPL.g:5368:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) )
            // InternalRPL.g:5369:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalRPL.g:5369:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) )
            // InternalRPL.g:5370:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLemmaAccess().getUnorderedGroup());
            			
            // InternalRPL.g:5373:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?)
            // InternalRPL.g:5374:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?
            {
            // InternalRPL.g:5374:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+
            int cnt111=0;
            loop111:
            do {
                int alt111=9;
                alt111 = dfa111.predict(input);
                switch (alt111) {
            	case 1 :
            	    // InternalRPL.g:5375:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    {
            	    // InternalRPL.g:5375:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    // InternalRPL.g:5376:4: {...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRPL.g:5376:99: ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    // InternalRPL.g:5377:5: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRPL.g:5380:8: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    // InternalRPL.g:5380:9: {...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5380:18: (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    // InternalRPL.g:5380:19: otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,67,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLemmaAccess().getLemmaKeyword_0_0());
            	    							
            	    // InternalRPL.g:5384:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRPL.g:5385:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRPL.g:5385:9: (lv_name_2_0= RULE_ID )
            	    // InternalRPL.g:5386:10: lv_name_2_0= RULE_ID
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

            	    otherlv_3=(Token)match(input,56,FOLLOW_62); 

            	    								newLeafNode(otherlv_3, grammarAccess.getLemmaAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalRPL.g:5406:8: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==25) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // InternalRPL.g:5407:9: otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	            									newLeafNode(otherlv_4, grammarAccess.getLemmaAccess().getConstKeyword_0_3_0());
            	            								
            	            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            	            									newLeafNode(otherlv_5, grammarAccess.getLemmaAccess().getColonKeyword_0_3_1());
            	            								
            	            // InternalRPL.g:5415:9: ( (lv_cVars_6_0= ruleConstantParameter ) )
            	            // InternalRPL.g:5416:10: (lv_cVars_6_0= ruleConstantParameter )
            	            {
            	            // InternalRPL.g:5416:10: (lv_cVars_6_0= ruleConstantParameter )
            	            // InternalRPL.g:5417:11: lv_cVars_6_0= ruleConstantParameter
            	            {

            	            											newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_2_0());
            	            										
            	            pushFollow(FOLLOW_63);
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

            	            // InternalRPL.g:5434:9: (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            loop105:
            	            do {
            	                int alt105=2;
            	                int LA105_0 = input.LA(1);

            	                if ( (LA105_0==27) ) {
            	                    alt105=1;
            	                }


            	                switch (alt105) {
            	            	case 1 :
            	            	    // InternalRPL.g:5435:10: otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    {
            	            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	            	    										newLeafNode(otherlv_7, grammarAccess.getLemmaAccess().getCommaKeyword_0_3_3_0());
            	            	    									
            	            	    // InternalRPL.g:5439:10: ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    // InternalRPL.g:5440:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    {
            	            	    // InternalRPL.g:5440:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    // InternalRPL.g:5441:12: lv_cVars_8_0= ruleConstantParameter
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_3_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_63);
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
            	            	    break loop105;
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
            	    // InternalRPL.g:5466:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5466:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5467:4: {...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRPL.g:5467:99: ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    // InternalRPL.g:5468:5: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRPL.g:5471:8: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    // InternalRPL.g:5471:9: {...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5471:18: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    // InternalRPL.g:5471:19: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getLemmaAccess().getFunKeyword_1_0());
            	    							
            	    otherlv_10=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_10, grammarAccess.getLemmaAccess().getColonKeyword_1_1());
            	    							
            	    // InternalRPL.g:5479:8: ( (lv_fnVars_11_0= ruleFunctionalParameter ) )
            	    // InternalRPL.g:5480:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    {
            	    // InternalRPL.g:5480:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    // InternalRPL.g:5481:10: lv_fnVars_11_0= ruleFunctionalParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_63);
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

            	    // InternalRPL.g:5498:8: (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    loop107:
            	    do {
            	        int alt107=2;
            	        int LA107_0 = input.LA(1);

            	        if ( (LA107_0==27) ) {
            	            alt107=1;
            	        }


            	        switch (alt107) {
            	    	case 1 :
            	    	    // InternalRPL.g:5499:9: otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_12, grammarAccess.getLemmaAccess().getCommaKeyword_1_3_0());
            	    	    								
            	    	    // InternalRPL.g:5503:9: ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    // InternalRPL.g:5504:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    {
            	    	    // InternalRPL.g:5504:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    // InternalRPL.g:5505:11: lv_fnVars_13_0= ruleFunctionalParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
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
            	    	    break loop107;
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
            	    // InternalRPL.g:5529:3: ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5529:3: ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5530:4: {...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRPL.g:5530:99: ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5531:5: ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRPL.g:5534:8: ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5534:9: {...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5534:18: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5534:19: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )*
            	    {
            	    otherlv_14=(Token)match(input,28,FOLLOW_13); 

            	    								newLeafNode(otherlv_14, grammarAccess.getLemmaAccess().getSimpleKeyword_2_0());
            	    							
            	    otherlv_15=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_15, grammarAccess.getLemmaAccess().getFormulasKeyword_2_1());
            	    							
            	    otherlv_16=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_16, grammarAccess.getLemmaAccess().getColonKeyword_2_2());
            	    							
            	    // InternalRPL.g:5546:8: ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) )
            	    // InternalRPL.g:5547:9: (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter )
            	    {
            	    // InternalRPL.g:5547:9: (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter )
            	    // InternalRPL.g:5548:10: lv_simpleFmVars_17_0= ruleSimpleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_simpleFmVars_17_0=ruleSimpleFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"simpleFmVars",
            	    											lv_simpleFmVars_17_0,
            	    											"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5565:8: (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )*
            	    loop108:
            	    do {
            	        int alt108=2;
            	        int LA108_0 = input.LA(1);

            	        if ( (LA108_0==27) ) {
            	            alt108=1;
            	        }


            	        switch (alt108) {
            	    	case 1 :
            	    	    // InternalRPL.g:5566:9: otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_18, grammarAccess.getLemmaAccess().getCommaKeyword_2_4_0());
            	    	    								
            	    	    // InternalRPL.g:5570:9: ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) )
            	    	    // InternalRPL.g:5571:10: (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5571:10: (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter )
            	    	    // InternalRPL.g:5572:11: lv_simpleFmVars_19_0= ruleSimpleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_2_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_simpleFmVars_19_0=ruleSimpleFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"simpleFmVars",
            	    	    												lv_simpleFmVars_19_0,
            	    	    												"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRPL.g:5596:3: ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5596:3: ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5597:4: {...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRPL.g:5597:99: ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5598:5: ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRPL.g:5601:8: ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5601:9: {...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5601:18: (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* )
            	    // InternalRPL.g:5601:19: otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )*
            	    {
            	    otherlv_20=(Token)match(input,52,FOLLOW_54); 

            	    								newLeafNode(otherlv_20, grammarAccess.getLemmaAccess().getExtraKeyword_3_0());
            	    							
            	    otherlv_21=(Token)match(input,53,FOLLOW_13); 

            	    								newLeafNode(otherlv_21, grammarAccess.getLemmaAccess().getInvariantKeyword_3_1());
            	    							
            	    otherlv_22=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_22, grammarAccess.getLemmaAccess().getFormulasKeyword_3_2());
            	    							
            	    otherlv_23=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_23, grammarAccess.getLemmaAccess().getColonKeyword_3_3());
            	    							
            	    // InternalRPL.g:5617:8: ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) )
            	    // InternalRPL.g:5618:9: (lv_ifmVars_24_0= ruleRegularFormulaParameter )
            	    {
            	    // InternalRPL.g:5618:9: (lv_ifmVars_24_0= ruleRegularFormulaParameter )
            	    // InternalRPL.g:5619:10: lv_ifmVars_24_0= ruleRegularFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_ifmVars_24_0=ruleRegularFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"ifmVars",
            	    											lv_ifmVars_24_0,
            	    											"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5636:8: (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )*
            	    loop109:
            	    do {
            	        int alt109=2;
            	        int LA109_0 = input.LA(1);

            	        if ( (LA109_0==27) ) {
            	            alt109=1;
            	        }


            	        switch (alt109) {
            	    	case 1 :
            	    	    // InternalRPL.g:5637:9: otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_25, grammarAccess.getLemmaAccess().getCommaKeyword_3_5_0());
            	    	    								
            	    	    // InternalRPL.g:5641:9: ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) )
            	    	    // InternalRPL.g:5642:10: (lv_ifmVars_26_0= ruleRegularFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5642:10: (lv_ifmVars_26_0= ruleRegularFormulaParameter )
            	    	    // InternalRPL.g:5643:11: lv_ifmVars_26_0= ruleRegularFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_3_5_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_ifmVars_26_0=ruleRegularFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"ifmVars",
            	    	    												lv_ifmVars_26_0,
            	    	    												"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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
            	case 5 :
            	    // InternalRPL.g:5667:3: ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5667:3: ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5668:4: {...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRPL.g:5668:99: ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5669:5: ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRPL.g:5672:8: ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5672:9: {...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5672:18: (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* )
            	    // InternalRPL.g:5672:19: otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )*
            	    {
            	    otherlv_27=(Token)match(input,51,FOLLOW_13); 

            	    								newLeafNode(otherlv_27, grammarAccess.getLemmaAccess().getRequirementKeyword_4_0());
            	    							
            	    otherlv_28=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_28, grammarAccess.getLemmaAccess().getFormulasKeyword_4_1());
            	    							
            	    otherlv_29=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_29, grammarAccess.getLemmaAccess().getColonKeyword_4_2());
            	    							
            	    // InternalRPL.g:5684:8: ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) )
            	    // InternalRPL.g:5685:9: (lv_rfmVars_30_0= ruleRegularFormulaParameter )
            	    {
            	    // InternalRPL.g:5685:9: (lv_rfmVars_30_0= ruleRegularFormulaParameter )
            	    // InternalRPL.g:5686:10: lv_rfmVars_30_0= ruleRegularFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_63);
            	    lv_rfmVars_30_0=ruleRegularFormulaParameter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										add(
            	    											current,
            	    											"rfmVars",
            	    											lv_rfmVars_30_0,
            	    											"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRPL.g:5703:8: (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )*
            	    loop110:
            	    do {
            	        int alt110=2;
            	        int LA110_0 = input.LA(1);

            	        if ( (LA110_0==27) ) {
            	            alt110=1;
            	        }


            	        switch (alt110) {
            	    	case 1 :
            	    	    // InternalRPL.g:5704:9: otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_31, grammarAccess.getLemmaAccess().getCommaKeyword_4_4_0());
            	    	    								
            	    	    // InternalRPL.g:5708:9: ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) )
            	    	    // InternalRPL.g:5709:10: (lv_rfmVars_32_0= ruleRegularFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5709:10: (lv_rfmVars_32_0= ruleRegularFormulaParameter )
            	    	    // InternalRPL.g:5710:11: lv_rfmVars_32_0= ruleRegularFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_4_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_63);
            	    	    lv_rfmVars_32_0=ruleRegularFormulaParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"rfmVars",
            	    	    												lv_rfmVars_32_0,
            	    	    												"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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
            	case 6 :
            	    // InternalRPL.g:5734:3: ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5734:3: ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5735:4: {...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRPL.g:5735:99: ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5736:5: ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRPL.g:5739:8: ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5739:9: {...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5739:18: (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5739:19: otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_33=(Token)match(input,68,FOLLOW_64); 

            	    								newLeafNode(otherlv_33, grammarAccess.getLemmaAccess().getInitKeyword_5_0());
            	    							
            	    otherlv_34=(Token)match(input,69,FOLLOW_11); 

            	    								newLeafNode(otherlv_34, grammarAccess.getLemmaAccess().getStateKeyword_5_1());
            	    							
            	    otherlv_35=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_35, grammarAccess.getLemmaAccess().getColonKeyword_5_2());
            	    							
            	    // InternalRPL.g:5751:8: ( (lv_initState_36_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5752:9: (lv_initState_36_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5752:9: (lv_initState_36_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5753:10: lv_initState_36_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getInitStateUpdateStateVariableParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_65);
            	    lv_initState_36_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"initState",
            	    											lv_initState_36_0,
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
            	    // InternalRPL.g:5776:3: ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5776:3: ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5777:4: {...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRPL.g:5777:99: ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5778:5: ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRPL.g:5781:8: ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5781:9: {...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5781:18: (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5781:19: otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_37=(Token)match(input,38,FOLLOW_64); 

            	    								newLeafNode(otherlv_37, grammarAccess.getLemmaAccess().getFinalKeyword_6_0());
            	    							
            	    otherlv_38=(Token)match(input,69,FOLLOW_11); 

            	    								newLeafNode(otherlv_38, grammarAccess.getLemmaAccess().getStateKeyword_6_1());
            	    							
            	    otherlv_39=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_39, grammarAccess.getLemmaAccess().getColonKeyword_6_2());
            	    							
            	    // InternalRPL.g:5793:8: ( (lv_finalState_40_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5794:9: (lv_finalState_40_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5794:9: (lv_finalState_40_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5795:10: lv_finalState_40_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFinalStateUpdateStateVariableParserRuleCall_6_3_0());
            	    									
            	    pushFollow(FOLLOW_65);
            	    lv_finalState_40_0=ruleUpdateStateVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"finalState",
            	    											lv_finalState_40_0,
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
            	case 8 :
            	    // InternalRPL.g:5818:3: ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    {
            	    // InternalRPL.g:5818:3: ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    // InternalRPL.g:5819:4: {...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalRPL.g:5819:99: ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) )
            	    // InternalRPL.g:5820:5: ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalRPL.g:5823:8: ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) )
            	    // InternalRPL.g:5823:9: {...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5823:18: (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' )
            	    // InternalRPL.g:5823:19: otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';'
            	    {
            	    otherlv_41=(Token)match(input,70,FOLLOW_66); 

            	    								newLeafNode(otherlv_41, grammarAccess.getLemmaAccess().getPremiseKeyword_7_0());
            	    							
            	    // InternalRPL.g:5827:8: ( (lv_prem_42_0= ruleLemmaPremiseFormula ) )
            	    // InternalRPL.g:5828:9: (lv_prem_42_0= ruleLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5828:9: (lv_prem_42_0= ruleLemmaPremiseFormula )
            	    // InternalRPL.g:5829:10: lv_prem_42_0= ruleLemmaPremiseFormula
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getPremLemmaPremiseFormulaParserRuleCall_7_1_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_prem_42_0=ruleLemmaPremiseFormula();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getLemmaRule());
            	    										}
            	    										set(
            	    											current,
            	    											"prem",
            	    											lv_prem_42_0,
            	    											"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_43=(Token)match(input,60,FOLLOW_6); 

            	    								newLeafNode(otherlv_43, grammarAccess.getLemmaAccess().getRightCurlyBracketKeyword_7_2());
            	    							
            	    otherlv_44=(Token)match(input,21,FOLLOW_65); 

            	    								newLeafNode(otherlv_44, grammarAccess.getLemmaAccess().getSemicolonKeyword_7_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt111 >= 1 ) break loop111;
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
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
    // InternalRPL.g:5871:1: entryRuleLemmaPremiseFormula returns [EObject current=null] : iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF ;
    public final EObject entryRuleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5871:60: (iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF )
            // InternalRPL.g:5872:2: iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF
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
    // InternalRPL.g:5878:1: ruleLemmaPremiseFormula returns [EObject current=null] : (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) ;
    public final EObject ruleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_IMPLICATION_2=null;
        EObject this_DisjunctionLemmaPremiseFormula_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5884:2: ( (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) )
            // InternalRPL.g:5885:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            {
            // InternalRPL.g:5885:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=RULE_NEGATION && LA112_0<=RULE_BOOLEAN_LITERAL)||LA112_0==24||LA112_0==37||LA112_0==71) ) {
                alt112=1;
            }
            else if ( (LA112_0==RULE_ID) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==24) ) {
                    int LA112_3 = input.LA(3);

                    if ( (LA112_3==RULE_ID) ) {
                        int LA112_4 = input.LA(4);

                        if ( (LA112_4==27) ) {
                            alt112=1;
                        }
                        else if ( (LA112_4==30) ) {
                            int LA112_5 = input.LA(5);

                            if ( (LA112_5==EOF||(LA112_5>=RULE_DISJUNCTION && LA112_5<=RULE_CONJUNCTION)||LA112_5==30||LA112_5==60) ) {
                                alt112=1;
                            }
                            else if ( (LA112_5==RULE_IMPLICATION) ) {
                                alt112=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 112, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 112, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA112_3==25||LA112_3==29||(LA112_3>=38 && LA112_3<=39)||LA112_3==43) ) {
                        alt112=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA112_2==EOF||(LA112_2>=RULE_DISJUNCTION && LA112_2<=RULE_CONJUNCTION)||LA112_2==30||LA112_2==60) ) {
                    alt112=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalRPL.g:5886:3: this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula
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
                    // InternalRPL.g:5895:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    {
                    // InternalRPL.g:5895:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    // InternalRPL.g:5896:4: ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    {
                    // InternalRPL.g:5896:4: ( (lv_left_1_0= ruleFunApplication ) )
                    // InternalRPL.g:5897:5: (lv_left_1_0= ruleFunApplication )
                    {
                    // InternalRPL.g:5897:5: (lv_left_1_0= ruleFunApplication )
                    // InternalRPL.g:5898:6: lv_left_1_0= ruleFunApplication
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getLeftFunApplicationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_68);
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

                    this_IMPLICATION_2=(Token)match(input,RULE_IMPLICATION,FOLLOW_66); 

                    				newLeafNode(this_IMPLICATION_2, grammarAccess.getLemmaPremiseFormulaAccess().getIMPLICATIONTerminalRuleCall_1_1());
                    			
                    // InternalRPL.g:5919:4: ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5920:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5920:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5921:6: lv_right_3_0= ruleLemmaPremiseFormula
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
    // InternalRPL.g:5943:1: entryRuleDisjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5943:71: (iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5944:2: iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5950:1: ruleDisjunctionLemmaPremiseFormula returns [EObject current=null] : (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5956:2: ( (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5957:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5957:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5958:3: this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_ConjunctionLemmaPremiseFormula_0=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;


            			current = this_ConjunctionLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5966:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==RULE_DISJUNCTION) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalRPL.g:5967:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5967:4: ()
            	    // InternalRPL.g:5968:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_66); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5978:4: ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5979:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5979:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5980:6: lv_right_3_0= ruleDisjunctionLemmaPremiseFormula
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
            	    break loop113;
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
    // InternalRPL.g:6002:1: entryRuleConjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:6002:71: (iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:6003:2: iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:6009:1: ruleConjunctionLemmaPremiseFormula returns [EObject current=null] : (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:6015:2: ( (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:6016:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:6016:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:6017:3: this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getPrimaryLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryLemmaPremiseFormula_0=rulePrimaryLemmaPremiseFormula();

            state._fsp--;


            			current = this_PrimaryLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:6025:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==RULE_CONJUNCTION) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalRPL.g:6026:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:6026:4: ()
            	    // InternalRPL.g:6027:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_66); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:6037:4: ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:6038:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:6038:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:6039:6: lv_right_3_0= ruleConjunctionLemmaPremiseFormula
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
    // $ANTLR end "ruleConjunctionLemmaPremiseFormula"


    // $ANTLR start "entryRulePrimaryLemmaPremiseFormula"
    // InternalRPL.g:6061:1: entryRulePrimaryLemmaPremiseFormula returns [EObject current=null] : iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF ;
    public final EObject entryRulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:6061:67: (iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF )
            // InternalRPL.g:6062:2: iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF
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
    // InternalRPL.g:6068:1: rulePrimaryLemmaPremiseFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) ;
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
            // InternalRPL.g:6074:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:6075:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:6075:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            int alt115=4;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 37:
                {
                alt115=1;
                }
                break;
            case RULE_ID:
                {
                int LA115_2 = input.LA(2);

                if ( (LA115_2==24) ) {
                    int LA115_5 = input.LA(3);

                    if ( (LA115_5==RULE_ID) ) {
                        alt115=1;
                    }
                    else if ( (LA115_5==25||LA115_5==29||(LA115_5>=38 && LA115_5<=39)||LA115_5==43) ) {
                        alt115=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA115_2==EOF||(LA115_2>=RULE_DISJUNCTION && LA115_2<=RULE_CONJUNCTION)||LA115_2==30||LA115_2==60) ) {
                    alt115=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 2, input);

                    throw nvae;
                }
                }
                break;
            case 71:
                {
                alt115=2;
                }
                break;
            case 24:
                {
                alt115=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalRPL.g:6076:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:6076:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:6077:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:6077:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:6078:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:6096:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    {
                    // InternalRPL.g:6096:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    // InternalRPL.g:6097:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    {
                    // InternalRPL.g:6097:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    // InternalRPL.g:6098:5: lv_alwaysImp_1_0= ruleAlwaysImplication
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
                    // InternalRPL.g:6116:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    {
                    // InternalRPL.g:6116:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    // InternalRPL.g:6117:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    {
                    // InternalRPL.g:6117:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    // InternalRPL.g:6118:5: lv_inst_2_0= rulePastExtraInvariantPatternInstance
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
                    // InternalRPL.g:6136:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:6136:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    // InternalRPL.g:6137:4: otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_66); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:6141:4: ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:6142:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:6142:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:6143:6: lv_nestedFormula_4_0= ruleLemmaPremiseFormula
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
    // InternalRPL.g:6169:1: entryRuleAlwaysImplication returns [EObject current=null] : iv_ruleAlwaysImplication= ruleAlwaysImplication EOF ;
    public final EObject entryRuleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplication = null;


        try {
            // InternalRPL.g:6169:58: (iv_ruleAlwaysImplication= ruleAlwaysImplication EOF )
            // InternalRPL.g:6170:2: iv_ruleAlwaysImplication= ruleAlwaysImplication EOF
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
    // InternalRPL.g:6176:1: ruleAlwaysImplication returns [EObject current=null] : (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) ;
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
            // InternalRPL.g:6182:2: ( (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) )
            // InternalRPL.g:6183:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            {
            // InternalRPL.g:6183:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            // InternalRPL.g:6184:3: otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationAccess().getAlwaysimpKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysImplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:6192:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:6193:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:6193:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:6194:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlwaysImplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_3());
            		
            // InternalRPL.g:6209:3: ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:6210:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:6210:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:6211:5: lv_left_4_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getLeftAlwaysImplicationParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_69);
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

            otherlv_5=(Token)match(input,27,FOLLOW_70); 

            			newLeafNode(otherlv_5, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_5());
            		
            // InternalRPL.g:6232:3: ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:6233:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:6233:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:6234:5: lv_right_6_0= ruleAlwaysImplicationParameterValue
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
    // InternalRPL.g:6259:1: entryRuleAlwaysImplicationParameterValue returns [EObject current=null] : iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF ;
    public final EObject entryRuleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplicationParameterValue = null;


        try {
            // InternalRPL.g:6259:72: (iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF )
            // InternalRPL.g:6260:2: iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF
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
    // InternalRPL.g:6266:1: ruleAlwaysImplicationParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) ;
    public final EObject ruleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:6272:2: ( ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) )
            // InternalRPL.g:6273:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            {
            // InternalRPL.g:6273:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            // InternalRPL.g:6274:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) )
            {
            // InternalRPL.g:6274:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==35) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalRPL.g:6275:4: otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:6279:4: ( (lv_state_1_0= ruleUpdateStateVariable ) )
                    // InternalRPL.g:6280:5: (lv_state_1_0= ruleUpdateStateVariable )
                    {
                    // InternalRPL.g:6280:5: (lv_state_1_0= ruleUpdateStateVariable )
                    // InternalRPL.g:6281:6: lv_state_1_0= ruleUpdateStateVariable
                    {

                    						newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueAccess().getStateUpdateStateVariableParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_71);
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

                    otherlv_2=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:6303:3: ( (lv_formula_3_0= ruleNegationFormula ) )
            // InternalRPL.g:6304:4: (lv_formula_3_0= ruleNegationFormula )
            {
            // InternalRPL.g:6304:4: (lv_formula_3_0= ruleNegationFormula )
            // InternalRPL.g:6305:5: lv_formula_3_0= ruleNegationFormula
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
    // InternalRPL.g:6326:1: entryRulePastExtraInvariantPatternInstance returns [EObject current=null] : iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF ;
    public final EObject entryRulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPatternInstance = null;


        try {
            // InternalRPL.g:6326:74: (iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF )
            // InternalRPL.g:6327:2: iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF
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
    // InternalRPL.g:6333:1: rulePastExtraInvariantPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) ;
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
        Token otherlv_20=null;
        EObject lv_cParams_4_0 = null;

        EObject lv_cParams_6_0 = null;

        EObject lv_fnParams_9_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fmParams_14_0 = null;

        EObject lv_fmParams_16_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:6339:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) )
            // InternalRPL.g:6340:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            {
            // InternalRPL.g:6340:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            // InternalRPL.g:6341:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')'
            {
            // InternalRPL.g:6341:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:6342:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:6342:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:6343:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getPatternPastExtraInvariantPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:6358:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==25) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalRPL.g:6359:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:6367:4: ( (lv_cParams_4_0= ruleConstantParameter ) )
                    // InternalRPL.g:6368:5: (lv_cParams_4_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:6368:5: (lv_cParams_4_0= ruleConstantParameter )
                    // InternalRPL.g:6369:6: lv_cParams_4_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_73);
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

                    // InternalRPL.g:6386:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==27) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalRPL.g:6387:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:6391:5: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:6392:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:6392:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    // InternalRPL.g:6393:7: lv_cParams_6_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_73);
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
                    	    break loop117;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6412:3: (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==43) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalRPL.g:6413:4: otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFunKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:6421:4: ( (lv_fnParams_9_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:6422:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:6422:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    // InternalRPL.g:6423:6: lv_fnParams_9_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_74);
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

                    // InternalRPL.g:6440:4: (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==27) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalRPL.g:6441:5: otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:6445:5: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:6446:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:6446:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:6447:7: lv_fnParams_11_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop119;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6466:3: (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==29) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalRPL.g:6467:4: otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:6475:4: ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:6476:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:6476:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:6477:6: lv_fmParams_14_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_fmParams_14_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    						}
                    						add(
                    							current,
                    							"fmParams",
                    							lv_fmParams_14_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:6494:4: (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==27) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalRPL.g:6495:5: otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:6499:5: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:6500:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:6500:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:6501:7: lv_fmParams_16_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
                    	    lv_fmParams_16_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternInstanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fmParams",
                    	    								lv_fmParams_16_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6520:3: (otherlv_17= 'current' | otherlv_18= 'final' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==39) ) {
                alt123=1;
            }
            else if ( (LA123_0==38) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalRPL.g:6521:4: otherlv_17= 'current'
                    {
                    otherlv_17=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCurrentKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRPL.g:6526:4: otherlv_18= 'final'
                    {
                    otherlv_18=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFinalKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalRPL.g:6531:3: ( (otherlv_19= RULE_ID ) )
            // InternalRPL.g:6532:4: (otherlv_19= RULE_ID )
            {
            // InternalRPL.g:6532:4: (otherlv_19= RULE_ID )
            // InternalRPL.g:6533:5: otherlv_19= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getStateUpdateStateVariableCrossReference_6_0());
            				

            }


            }

            otherlv_20=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalRPL.g:6552:1: ruleEqPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) ;
    public final Enumerator ruleEqPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6558:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) ) )
            // InternalRPL.g:6559:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
            {
            // InternalRPL.g:6559:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '~=' ) )
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
                    // InternalRPL.g:6560:3: (enumLiteral_0= '==' )
                    {
                    // InternalRPL.g:6560:3: (enumLiteral_0= '==' )
                    // InternalRPL.g:6561:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6568:3: (enumLiteral_1= '~=' )
                    {
                    // InternalRPL.g:6568:3: (enumLiteral_1= '~=' )
                    // InternalRPL.g:6569:4: enumLiteral_1= '~='
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
    // InternalRPL.g:6579:1: ruleCompPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRPL.g:6585:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalRPL.g:6586:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalRPL.g:6586:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
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
                    // InternalRPL.g:6587:3: (enumLiteral_0= '<' )
                    {
                    // InternalRPL.g:6587:3: (enumLiteral_0= '<' )
                    // InternalRPL.g:6588:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6595:3: (enumLiteral_1= '>' )
                    {
                    // InternalRPL.g:6595:3: (enumLiteral_1= '>' )
                    // InternalRPL.g:6596:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6603:3: (enumLiteral_2= '<=' )
                    {
                    // InternalRPL.g:6603:3: (enumLiteral_2= '<=' )
                    // InternalRPL.g:6604:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6611:3: (enumLiteral_3= '>=' )
                    {
                    // InternalRPL.g:6611:3: (enumLiteral_3= '>=' )
                    // InternalRPL.g:6612:4: enumLiteral_3= '>='
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
    // InternalRPL.g:6622:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6628:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalRPL.g:6629:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalRPL.g:6629:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // InternalRPL.g:6630:3: (enumLiteral_0= '+' )
                    {
                    // InternalRPL.g:6630:3: (enumLiteral_0= '+' )
                    // InternalRPL.g:6631:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6638:3: (enumLiteral_1= '-' )
                    {
                    // InternalRPL.g:6638:3: (enumLiteral_1= '-' )
                    // InternalRPL.g:6639:4: enumLiteral_1= '-'
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
    // InternalRPL.g:6649:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRPL.g:6655:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) )
            // InternalRPL.g:6656:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            {
            // InternalRPL.g:6656:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
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
                    // InternalRPL.g:6657:3: (enumLiteral_0= '*' )
                    {
                    // InternalRPL.g:6657:3: (enumLiteral_0= '*' )
                    // InternalRPL.g:6658:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6665:3: (enumLiteral_1= '/' )
                    {
                    // InternalRPL.g:6665:3: (enumLiteral_1= '/' )
                    // InternalRPL.g:6666:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6673:3: (enumLiteral_2= 'mod' )
                    {
                    // InternalRPL.g:6673:3: (enumLiteral_2= 'mod' )
                    // InternalRPL.g:6674:4: enumLiteral_2= 'mod'
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
    // InternalRPL.g:6684:1: ruleUnMinus returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleUnMinus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRPL.g:6690:2: ( (enumLiteral_0= '-' ) )
            // InternalRPL.g:6691:2: (enumLiteral_0= '-' )
            {
            // InternalRPL.g:6691:2: (enumLiteral_0= '-' )
            // InternalRPL.g:6692:3: enumLiteral_0= '-'
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


    protected DFA111 dfa111 = new DFA111(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\34\11\uffff";
    static final String dfa_4s = "\1\106\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\11\uffff\1\10\4\uffff\1\3\7\uffff\1\6\1\5\4\uffff\12\1\1\2\1\7\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 5374:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_0 = input.LA(1);

                         
                        int index111_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA111_0==EOF||(LA111_0>=57 && LA111_0<=66)) ) {s = 1;}

                        else if ( LA111_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA111_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA111_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA111_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA111_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA111_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA111_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA111_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index111_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000C01000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000001001660L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002801000620L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000620L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004062000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004068000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004048000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080062000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080068000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000100200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080072000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080078000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000801000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000001001460L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0018084010000000L,0x0000000000000058L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0018084012000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0018084018000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0018084010000002L,0x0000000000000058L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000002001000620L,0x0000000000000080L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000002800000620L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x000008C022000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x000008C028000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x000000C028000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x000000C008000000L});

}
