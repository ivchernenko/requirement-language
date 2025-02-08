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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_DISJUNCTION", "RULE_CONJUNCTION", "RULE_NEGATION", "RULE_BOOLEAN_LITERAL", "RULE_POWER_OPERATOR", "RULE_REAL", "RULE_IMPLICATION", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'from'", "';'", "'derivedreq'", "'pattern'", "'('", "'const'", "':'", "','", "'simple'", "'formulas'", "')'", "'='", "'with'", "'var'", "'lambda'", "'.'", "'frm'", "'final'", "'current'", "'futurereq'", "'pastreq'", "'futureeinv'", "'fun'", "'pasteinv'", "'derivedeinv'", "'..'", "'-'", "'requirement'", "'extra'", "'invariant'", "'lemmas'", "'{'", "'LS1'", "'LS2'", "'LS3'", "'}'", "'LS4'", "'LS5'", "'LS6'", "'LS7'", "'LS8'", "'LS9'", "'lemma'", "'init'", "'state'", "'premise'", "'alwaysimp'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'/'", "'mod'"
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
    public static final int T__34=34;
    public static final int T__35=35;
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

                if ( (LA2_0==23||LA2_0==34||(LA2_0>=40 && LA2_0<=42)||(LA2_0>=44 && LA2_0<=45)||(LA2_0>=48 && LA2_0<=49)) ) {
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
    // InternalRPL.g:129:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_session_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRPL.g:135:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // InternalRPL.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // InternalRPL.g:136:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // InternalRPL.g:137:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )? otherlv_4= ';'
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

            // InternalRPL.g:159:3: (otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRPL.g:160:4: otherlv_2= 'from' ( (lv_session_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_2_0());
                    			
                    // InternalRPL.g:164:4: ( (lv_session_3_0= RULE_STRING ) )
                    // InternalRPL.g:165:5: (lv_session_3_0= RULE_STRING )
                    {
                    // InternalRPL.g:165:5: (lv_session_3_0= RULE_STRING )
                    // InternalRPL.g:166:6: lv_session_3_0= RULE_STRING
                    {
                    lv_session_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_session_3_0, grammarAccess.getImportAccess().getSessionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"session",
                    							lv_session_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImportAccess().getSemicolonKeyword_3());
            		

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
    // InternalRPL.g:191:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalRPL.g:191:48: (iv_ruleElement= ruleElement EOF )
            // InternalRPL.g:192:2: iv_ruleElement= ruleElement EOF
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
    // InternalRPL.g:198:1: ruleElement returns [EObject current=null] : (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant ) ;
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
            // InternalRPL.g:204:2: ( (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant ) )
            // InternalRPL.g:205:2: (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant )
            {
            // InternalRPL.g:205:2: (this_VarDeclaration_0= ruleVarDeclaration | this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern | this_FutureRequirementPattern_2= ruleFutureRequirementPattern | this_PastRequirementPattern_3= rulePastRequirementPattern | this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern | this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern | this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern | this_Requirement_7= ruleRequirement | this_ExtraInvariant_8= ruleExtraInvariant )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 41:
                {
                alt4=4;
                }
                break;
            case 45:
                {
                alt4=5;
                }
                break;
            case 42:
                {
                alt4=6;
                }
                break;
            case 44:
                {
                alt4=7;
                }
                break;
            case 48:
                {
                alt4=8;
                }
                break;
            case 49:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRPL.g:206:3: this_VarDeclaration_0= ruleVarDeclaration
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
                    // InternalRPL.g:215:3: this_DerivedRequirementPattern_1= ruleDerivedRequirementPattern
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
                    // InternalRPL.g:224:3: this_FutureRequirementPattern_2= ruleFutureRequirementPattern
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
                    // InternalRPL.g:233:3: this_PastRequirementPattern_3= rulePastRequirementPattern
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
                    // InternalRPL.g:242:3: this_DerivedExtraInvariantPattern_4= ruleDerivedExtraInvariantPattern
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
                    // InternalRPL.g:251:3: this_FutureExtraInvariantPattern_5= ruleFutureExtraInvariantPattern
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
                    // InternalRPL.g:260:3: this_PastExtraInvariantPattern_6= rulePastExtraInvariantPattern
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
                    // InternalRPL.g:269:3: this_Requirement_7= ruleRequirement
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
                    // InternalRPL.g:278:3: this_ExtraInvariant_8= ruleExtraInvariant
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
    // InternalRPL.g:290:1: entryRuleDerivedRequirementPattern returns [EObject current=null] : iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF ;
    public final EObject entryRuleDerivedRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedRequirementPattern = null;


        try {
            // InternalRPL.g:290:66: (iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF )
            // InternalRPL.g:291:2: iv_ruleDerivedRequirementPattern= ruleDerivedRequirementPattern EOF
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
    // InternalRPL.g:297:1: ruleDerivedRequirementPattern returns [EObject current=null] : (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' ) ;
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
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_simpleFmParams_12_0 = null;

        EObject lv_simpleFmParams_14_0 = null;

        EObject lv_fmParams_17_0 = null;

        EObject lv_fmParams_19_0 = null;

        EObject lv_definition_22_0 = null;

        EObject lv_lemmas_25_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:303:2: ( (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' ) )
            // InternalRPL.g:304:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' )
            {
            // InternalRPL.g:304:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' )
            // InternalRPL.g:305:3: otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedRequirementPatternAccess().getDerivedreqKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:313:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:314:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:314:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:315:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDerivedRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:335:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRPL.g:336:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:344:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:345:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:345:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:346:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalRPL.g:363:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRPL.g:364:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:368:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:369:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:369:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:370:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:389:3: (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRPL.g:390:4: otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedRequirementPatternAccess().getSimpleKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_5_1());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_5_2());
                    			
                    // InternalRPL.g:402:4: ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:403:5: (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:403:5: (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:404:6: lv_simpleFmParams_12_0= ruleSimpleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:421:4: (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRPL.g:422:5: otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalRPL.g:426:5: ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:427:6: (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:427:6: (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:428:7: lv_simpleFmParams_14_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_simpleFmParams_14_0=ruleSimpleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParams",
                    	    								lv_simpleFmParams_14_0,
                    	    								"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:447:3: (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRPL.g:448:4: otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedRequirementPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedRequirementPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:456:4: ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:457:5: (lv_fmParams_17_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:457:5: (lv_fmParams_17_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:458:6: lv_fmParams_17_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:475:4: (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRPL.g:476:5: otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:480:5: ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:481:6: (lv_fmParams_19_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:481:6: (lv_fmParams_19_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:482:7: lv_fmParams_19_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_20, grammarAccess.getDerivedRequirementPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:505:3: ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPL.g:506:4: (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) )
                    {
                    // InternalRPL.g:506:4: (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) )
                    // InternalRPL.g:507:5: otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) )
                    {
                    otherlv_21=(Token)match(input,32,FOLLOW_18); 

                    					newLeafNode(otherlv_21, grammarAccess.getDerivedRequirementPatternAccess().getEqualsSignKeyword_8_0_0());
                    				
                    // InternalRPL.g:511:5: ( (lv_definition_22_0= ruleFormula ) )
                    // InternalRPL.g:512:6: (lv_definition_22_0= ruleFormula )
                    {
                    // InternalRPL.g:512:6: (lv_definition_22_0= ruleFormula )
                    // InternalRPL.g:513:7: lv_definition_22_0= ruleFormula
                    {

                    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getDefinitionFormulaParserRuleCall_8_0_1_0());
                    						
                    pushFollow(FOLLOW_19);
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
                    // InternalRPL.g:532:4: (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) )
                    {
                    // InternalRPL.g:532:4: (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) )
                    // InternalRPL.g:533:5: otherlv_23= 'with' ( (otherlv_24= RULE_ID ) )
                    {
                    otherlv_23=(Token)match(input,33,FOLLOW_9); 

                    					newLeafNode(otherlv_23, grammarAccess.getDerivedRequirementPatternAccess().getWithKeyword_8_1_0());
                    				
                    // InternalRPL.g:537:5: ( (otherlv_24= RULE_ID ) )
                    // InternalRPL.g:538:6: (otherlv_24= RULE_ID )
                    {
                    // InternalRPL.g:538:6: (otherlv_24= RULE_ID )
                    // InternalRPL.g:539:7: otherlv_24= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    						
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(otherlv_24, grammarAccess.getDerivedRequirementPatternAccess().getExtraInvPatternDerivedExtraInvariantPatternCrossReference_8_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:552:3: ( (lv_lemmas_25_0= ruleDerivedLemmas ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRPL.g:553:4: (lv_lemmas_25_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:553:4: (lv_lemmas_25_0= ruleDerivedLemmas )
                    // InternalRPL.g:554:5: lv_lemmas_25_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lemmas_25_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_25_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getDerivedRequirementPatternAccess().getSemicolonKeyword_10());
            		

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
    // InternalRPL.g:579:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalRPL.g:579:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalRPL.g:580:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalRPL.g:586:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:592:2: ( (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) )
            // InternalRPL.g:593:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            {
            // InternalRPL.g:593:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            // InternalRPL.g:594:3: otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalRPL.g:598:3: ( (lv_vars_1_0= ruleProgramVariable ) )
            // InternalRPL.g:599:4: (lv_vars_1_0= ruleProgramVariable )
            {
            // InternalRPL.g:599:4: (lv_vars_1_0= ruleProgramVariable )
            // InternalRPL.g:600:5: lv_vars_1_0= ruleProgramVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalRPL.g:617:3: (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRPL.g:618:4: otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRPL.g:622:4: ( (lv_vars_3_0= ruleProgramVariable ) )
            	    // InternalRPL.g:623:5: (lv_vars_3_0= ruleProgramVariable )
            	    {
            	    // InternalRPL.g:623:5: (lv_vars_3_0= ruleProgramVariable )
            	    // InternalRPL.g:624:6: lv_vars_3_0= ruleProgramVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalRPL.g:650:1: entryRuleProgramVariable returns [EObject current=null] : iv_ruleProgramVariable= ruleProgramVariable EOF ;
    public final EObject entryRuleProgramVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramVariable = null;


        try {
            // InternalRPL.g:650:56: (iv_ruleProgramVariable= ruleProgramVariable EOF )
            // InternalRPL.g:651:2: iv_ruleProgramVariable= ruleProgramVariable EOF
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
    // InternalRPL.g:657:1: ruleProgramVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProgramVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:663:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:664:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:664:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:665:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:665:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:666:4: lv_name_0_0= RULE_ID
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
            					"su.nsk.iae.rpl.RPL.ID");
            			

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
    // InternalRPL.g:685:1: entryRuleUpdateStateVariable returns [EObject current=null] : iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF ;
    public final EObject entryRuleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStateVariable = null;


        try {
            // InternalRPL.g:685:60: (iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF )
            // InternalRPL.g:686:2: iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF
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
    // InternalRPL.g:692:1: ruleUpdateStateVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:698:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:699:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:699:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:700:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:700:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:701:4: lv_name_0_0= RULE_ID
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
            					"su.nsk.iae.rpl.RPL.ID");
            			

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
    // InternalRPL.g:720:1: entryRuleConstantParameter returns [EObject current=null] : iv_ruleConstantParameter= ruleConstantParameter EOF ;
    public final EObject entryRuleConstantParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParameter = null;


        try {
            // InternalRPL.g:720:58: (iv_ruleConstantParameter= ruleConstantParameter EOF )
            // InternalRPL.g:721:2: iv_ruleConstantParameter= ruleConstantParameter EOF
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
    // InternalRPL.g:727:1: ruleConstantParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstantParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:733:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:734:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:734:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:735:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:735:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:736:4: lv_name_0_0= RULE_ID
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
            					"su.nsk.iae.rpl.RPL.ID");
            			

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
    // InternalRPL.g:755:1: entryRuleSimpleFormulaParameter returns [EObject current=null] : iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF ;
    public final EObject entryRuleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFormulaParameter = null;


        try {
            // InternalRPL.g:755:63: (iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF )
            // InternalRPL.g:756:2: iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF
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
    // InternalRPL.g:762:1: ruleSimpleFormulaParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:768:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) )
            // InternalRPL.g:769:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            {
            // InternalRPL.g:769:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            // InternalRPL.g:770:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            {
            // InternalRPL.g:770:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:771:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:771:4: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:772:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSimpleFormulaParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleFormulaParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            // InternalRPL.g:788:3: (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRPL.g:789:4: otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleFormulaParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:793:4: ( (lv_arity_2_0= RULE_INTEGER ) )
                    // InternalRPL.g:794:5: (lv_arity_2_0= RULE_INTEGER )
                    {
                    // InternalRPL.g:794:5: (lv_arity_2_0= RULE_INTEGER )
                    // InternalRPL.g:795:6: lv_arity_2_0= RULE_INTEGER
                    {
                    lv_arity_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_23); 

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

                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:820:1: entryRuleRegularFormulaParameter returns [EObject current=null] : iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF ;
    public final EObject entryRuleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularFormulaParameter = null;


        try {
            // InternalRPL.g:820:64: (iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF )
            // InternalRPL.g:821:2: iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF
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
    // InternalRPL.g:827:1: ruleRegularFormulaParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:833:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:834:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:834:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:835:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:835:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:836:4: lv_name_0_0= RULE_ID
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
            					"su.nsk.iae.rpl.RPL.ID");
            			

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
    // InternalRPL.g:855:1: entryRuleFunctionalParameter returns [EObject current=null] : iv_ruleFunctionalParameter= ruleFunctionalParameter EOF ;
    public final EObject entryRuleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalParameter = null;


        try {
            // InternalRPL.g:855:60: (iv_ruleFunctionalParameter= ruleFunctionalParameter EOF )
            // InternalRPL.g:856:2: iv_ruleFunctionalParameter= ruleFunctionalParameter EOF
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
    // InternalRPL.g:862:1: ruleFunctionalParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:868:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:869:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:869:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:870:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:870:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:871:4: lv_name_0_0= RULE_ID
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
            					"su.nsk.iae.rpl.RPL.ID");
            			

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
    // InternalRPL.g:890:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalRPL.g:890:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalRPL.g:891:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalRPL.g:897:1: ruleFormula returns [EObject current=null] : (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:903:2: ( (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) )
            // InternalRPL.g:904:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            {
            // InternalRPL.g:904:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            // InternalRPL.g:905:3: this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getFormulaAccess().getConjunctionFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjunctionFormula_0=ruleConjunctionFormula();

            state._fsp--;


            			current = this_ConjunctionFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:913:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_DISJUNCTION) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPL.g:914:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) )
            	    {
            	    // InternalRPL.g:914:4: ()
            	    // InternalRPL.g:915:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_18); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:925:4: ( (lv_right_3_0= ruleFormula ) )
            	    // InternalRPL.g:926:5: (lv_right_3_0= ruleFormula )
            	    {
            	    // InternalRPL.g:926:5: (lv_right_3_0= ruleFormula )
            	    // InternalRPL.g:927:6: lv_right_3_0= ruleFormula
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getRightFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleConjunctionFormula"
    // InternalRPL.g:949:1: entryRuleConjunctionFormula returns [EObject current=null] : iv_ruleConjunctionFormula= ruleConjunctionFormula EOF ;
    public final EObject entryRuleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFormula = null;


        try {
            // InternalRPL.g:949:59: (iv_ruleConjunctionFormula= ruleConjunctionFormula EOF )
            // InternalRPL.g:950:2: iv_ruleConjunctionFormula= ruleConjunctionFormula EOF
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
    // InternalRPL.g:956:1: ruleConjunctionFormula returns [EObject current=null] : (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) ;
    public final EObject ruleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:962:2: ( (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) )
            // InternalRPL.g:963:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            {
            // InternalRPL.g:963:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            // InternalRPL.g:964:3: this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getPrimaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PrimaryFormula_0=rulePrimaryFormula();

            state._fsp--;


            			current = this_PrimaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:972:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_CONJUNCTION) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPL.g:973:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    {
            	    // InternalRPL.g:973:4: ()
            	    // InternalRPL.g:974:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionFormulaAccess().getConjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_18); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:984:4: ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    // InternalRPL.g:985:5: (lv_right_3_0= ruleConjunctionFormula )
            	    {
            	    // InternalRPL.g:985:5: (lv_right_3_0= ruleConjunctionFormula )
            	    // InternalRPL.g:986:6: lv_right_3_0= ruleConjunctionFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getRightConjunctionFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
    // $ANTLR end "ruleConjunctionFormula"


    // $ANTLR start "entryRulePrimaryFormula"
    // InternalRPL.g:1008:1: entryRulePrimaryFormula returns [EObject current=null] : iv_rulePrimaryFormula= rulePrimaryFormula EOF ;
    public final EObject entryRulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryFormula = null;


        try {
            // InternalRPL.g:1008:55: (iv_rulePrimaryFormula= rulePrimaryFormula EOF )
            // InternalRPL.g:1009:2: iv_rulePrimaryFormula= rulePrimaryFormula EOF
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
    // InternalRPL.g:1015:1: rulePrimaryFormula returns [EObject current=null] : ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_patternInst_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1021:2: ( ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:1022:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:1022:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRPL.g:1023:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1023:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    // InternalRPL.g:1024:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    {
                    // InternalRPL.g:1024:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    // InternalRPL.g:1025:5: lv_patternInst_0_0= ruleOuterRequirementPatternInstance
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
                    // InternalRPL.g:1043:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:1043:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:1044:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:1048:4: ( (lv_nestedFormula_2_0= ruleFormula ) )
                    // InternalRPL.g:1049:5: (lv_nestedFormula_2_0= ruleFormula )
                    {
                    // InternalRPL.g:1049:5: (lv_nestedFormula_2_0= ruleFormula )
                    // InternalRPL.g:1050:6: lv_nestedFormula_2_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getNestedFormulaFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:1076:1: entryRuleOuterRequirementPatternInstance returns [EObject current=null] : iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF ;
    public final EObject entryRuleOuterRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1076:72: (iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF )
            // InternalRPL.g:1077:2: iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF
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
    // InternalRPL.g:1083:1: ruleOuterRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) ;
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
            // InternalRPL.g:1089:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) )
            // InternalRPL.g:1090:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            {
            // InternalRPL.g:1090:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            // InternalRPL.g:1091:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')'
            {
            // InternalRPL.g:1091:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1092:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1092:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1093:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOuterRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getOuterRequirementPatternInstanceAccess().getPatternOuterRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getOuterRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1108:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRPL.g:1109:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getOuterRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1117:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1118:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1118:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1119:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalRPL.g:1136:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRPL.g:1137:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_26); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1141:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1142:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1142:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1143:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1162:3: (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRPL.g:1163:4: otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_3_2());
                    			
                    // InternalRPL.g:1175:4: ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) )
                    // InternalRPL.g:1176:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    {
                    // InternalRPL.g:1176:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    // InternalRPL.g:1177:6: lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParameterValueParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:1194:4: (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRPL.g:1195:5: otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_27); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalRPL.g:1199:5: ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    // InternalRPL.g:1200:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1200:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    // InternalRPL.g:1201:7: lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleFmParamsPatternFreeFormulaParameterValueParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1220:3: (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRPL.g:1221:4: otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1229:4: ( (lv_fmParams_15_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1230:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1230:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1231:6: lv_fmParams_15_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:1248:4: (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRPL.g:1249:5: otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,28,FOLLOW_27); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1253:5: ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1254:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1254:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1255:7: lv_fmParams_17_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getOuterRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:1282:1: entryRuleFormulaParameterValue returns [EObject current=null] : iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF ;
    public final EObject entryRuleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameterValue = null;


        try {
            // InternalRPL.g:1282:62: (iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF )
            // InternalRPL.g:1283:2: iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF
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
    // InternalRPL.g:1289:1: ruleFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) ;
    public final EObject ruleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1295:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) )
            // InternalRPL.g:1296:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            {
            // InternalRPL.g:1296:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            // InternalRPL.g:1297:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) )
            {
            // InternalRPL.g:1297:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRPL.g:1298:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:1302:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRPL.g:1303:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:1303:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:1304:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_2=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:1326:3: ( (lv_formula_3_0= ruleInnerFormula ) )
            // InternalRPL.g:1327:4: (lv_formula_3_0= ruleInnerFormula )
            {
            // InternalRPL.g:1327:4: (lv_formula_3_0= ruleInnerFormula )
            // InternalRPL.g:1328:5: lv_formula_3_0= ruleInnerFormula
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
    // InternalRPL.g:1349:1: entryRuleInnerFormula returns [EObject current=null] : iv_ruleInnerFormula= ruleInnerFormula EOF ;
    public final EObject entryRuleInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFormula = null;


        try {
            // InternalRPL.g:1349:53: (iv_ruleInnerFormula= ruleInnerFormula EOF )
            // InternalRPL.g:1350:2: iv_ruleInnerFormula= ruleInnerFormula EOF
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
    // InternalRPL.g:1356:1: ruleInnerFormula returns [EObject current=null] : (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) ;
    public final EObject ruleInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1362:2: ( (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) )
            // InternalRPL.g:1363:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            {
            // InternalRPL.g:1363:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            // InternalRPL.g:1364:3: this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getInnerFormulaAccess().getConjunctionInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjunctionInnerFormula_0=ruleConjunctionInnerFormula();

            state._fsp--;


            			current = this_ConjunctionInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1372:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DISJUNCTION) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPL.g:1373:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) )
            	    {
            	    // InternalRPL.g:1373:4: ()
            	    // InternalRPL.g:1374:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInnerFormulaAccess().getInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getInnerFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1384:4: ( (lv_right_3_0= ruleInnerFormula ) )
            	    // InternalRPL.g:1385:5: (lv_right_3_0= ruleInnerFormula )
            	    {
            	    // InternalRPL.g:1385:5: (lv_right_3_0= ruleInnerFormula )
            	    // InternalRPL.g:1386:6: lv_right_3_0= ruleInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getInnerFormulaAccess().getRightInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleInnerFormula"


    // $ANTLR start "entryRuleConjunctionInnerFormula"
    // InternalRPL.g:1408:1: entryRuleConjunctionInnerFormula returns [EObject current=null] : iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF ;
    public final EObject entryRuleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionInnerFormula = null;


        try {
            // InternalRPL.g:1408:64: (iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF )
            // InternalRPL.g:1409:2: iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF
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
    // InternalRPL.g:1415:1: ruleConjunctionInnerFormula returns [EObject current=null] : (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) ;
    public final EObject ruleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1421:2: ( (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) )
            // InternalRPL.g:1422:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            {
            // InternalRPL.g:1422:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            // InternalRPL.g:1423:3: this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getPrimaryInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PrimaryInnerFormula_0=rulePrimaryInnerFormula();

            state._fsp--;


            			current = this_PrimaryInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1431:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_CONJUNCTION) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRPL.g:1432:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    {
            	    // InternalRPL.g:1432:4: ()
            	    // InternalRPL.g:1433:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionInnerFormulaAccess().getConjunctionInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionInnerFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1443:4: ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    // InternalRPL.g:1444:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    {
            	    // InternalRPL.g:1444:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    // InternalRPL.g:1445:6: lv_right_3_0= ruleConjunctionInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getRightConjunctionInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop27;
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
    // InternalRPL.g:1467:1: entryRulePrimaryInnerFormula returns [EObject current=null] : iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF ;
    public final EObject entryRulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInnerFormula = null;


        try {
            // InternalRPL.g:1467:60: (iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF )
            // InternalRPL.g:1468:2: iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF
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
    // InternalRPL.g:1474:1: rulePrimaryInnerFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_patternInst_1_0 = null;

        EObject lv_nestedFormula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1480:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) )
            // InternalRPL.g:1481:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            {
            // InternalRPL.g:1481:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 37:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==25) ) {
                    int LA28_4 = input.LA(3);

                    if ( (LA28_4==RULE_ID) ) {
                        alt28=1;
                    }
                    else if ( (LA28_4==26||(LA28_4>=30 && LA28_4<=31)||LA28_4==38) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_2==EOF||(LA28_2>=RULE_DISJUNCTION && LA28_2<=RULE_CONJUNCTION)||LA28_2==28||LA28_2==31||LA28_2==38) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRPL.g:1482:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:1482:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:1483:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:1483:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:1484:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:1502:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1502:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    // InternalRPL.g:1503:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    {
                    // InternalRPL.g:1503:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    // InternalRPL.g:1504:5: lv_patternInst_1_0= ruleBasicRequirementPatternInstance
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
                    // InternalRPL.g:1522:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1522:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    // InternalRPL.g:1523:4: otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryInnerFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRPL.g:1527:4: ( (lv_nestedFormula_3_0= ruleInnerFormula ) )
                    // InternalRPL.g:1528:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    {
                    // InternalRPL.g:1528:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    // InternalRPL.g:1529:6: lv_nestedFormula_3_0= ruleInnerFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getNestedFormulaInnerFormulaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:1555:1: entryRuleNegationFormula returns [EObject current=null] : iv_ruleNegationFormula= ruleNegationFormula EOF ;
    public final EObject entryRuleNegationFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationFormula = null;


        try {
            // InternalRPL.g:1555:56: (iv_ruleNegationFormula= ruleNegationFormula EOF )
            // InternalRPL.g:1556:2: iv_ruleNegationFormula= ruleNegationFormula EOF
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
    // InternalRPL.g:1562:1: ruleNegationFormula returns [EObject current=null] : ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) ;
    public final EObject ruleNegationFormula() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1568:2: ( ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) )
            // InternalRPL.g:1569:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            {
            // InternalRPL.g:1569:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            // InternalRPL.g:1570:3: ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) )
            {
            // InternalRPL.g:1570:3: ( (lv_neg_0_0= RULE_NEGATION ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NEGATION) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRPL.g:1571:4: (lv_neg_0_0= RULE_NEGATION )
                    {
                    // InternalRPL.g:1571:4: (lv_neg_0_0= RULE_NEGATION )
                    // InternalRPL.g:1572:5: lv_neg_0_0= RULE_NEGATION
                    {
                    lv_neg_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_29); 

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

            // InternalRPL.g:1588:3: ( (lv_right_1_0= ruleAtomicFormula ) )
            // InternalRPL.g:1589:4: (lv_right_1_0= ruleAtomicFormula )
            {
            // InternalRPL.g:1589:4: (lv_right_1_0= ruleAtomicFormula )
            // InternalRPL.g:1590:5: lv_right_1_0= ruleAtomicFormula
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
    // InternalRPL.g:1611:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // InternalRPL.g:1611:54: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // InternalRPL.g:1612:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
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
    // InternalRPL.g:1618:1: ruleAtomicFormula returns [EObject current=null] : ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) ;
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
            // InternalRPL.g:1624:2: ( ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) )
            // InternalRPL.g:1625:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            {
            // InternalRPL.g:1625:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRPL.g:1626:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:1626:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:1627:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:1627:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:1628:5: lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL
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
                    // InternalRPL.g:1645:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1645:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalRPL.g:1646:4: otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicFormulaAccess().getFrmKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalRPL.g:1654:4: ( (lv_boolTerm_3_0= ruleTerm ) )
                    // InternalRPL.g:1655:5: (lv_boolTerm_3_0= ruleTerm )
                    {
                    // InternalRPL.g:1655:5: (lv_boolTerm_3_0= ruleTerm )
                    // InternalRPL.g:1656:6: lv_boolTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getAtomicFormulaAccess().getBoolTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:1679:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    {
                    // InternalRPL.g:1679:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    // InternalRPL.g:1680:4: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    {
                    // InternalRPL.g:1680:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRPL.g:1681:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRPL.g:1681:5: (otherlv_5= RULE_ID )
                    // InternalRPL.g:1682:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicFormulaAccess().getFmParamFormulaParameterCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalRPL.g:1693:4: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==25) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalRPL.g:1694:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,25,FOLLOW_9); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalRPL.g:1698:5: ( (otherlv_7= RULE_ID ) )
                            // InternalRPL.g:1699:6: (otherlv_7= RULE_ID )
                            {
                            // InternalRPL.g:1699:6: (otherlv_7= RULE_ID )
                            // InternalRPL.g:1700:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); 

                            							newLeafNode(otherlv_7, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_1_0());
                            						

                            }


                            }

                            // InternalRPL.g:1711:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==28) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalRPL.g:1712:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,28,FOLLOW_9); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getAtomicFormulaAccess().getCommaKeyword_2_1_2_0());
                            	    					
                            	    // InternalRPL.g:1716:6: ( (otherlv_9= RULE_ID ) )
                            	    // InternalRPL.g:1717:7: (otherlv_9= RULE_ID )
                            	    {
                            	    // InternalRPL.g:1717:7: (otherlv_9= RULE_ID )
                            	    // InternalRPL.g:1718:8: otherlv_9= RULE_ID
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            	    								}
                            	    							
                            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_16); 

                            	    								newLeafNode(otherlv_9, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_2_1_0());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:1740:1: entryRuleBasicRequirementPatternInstance returns [EObject current=null] : iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF ;
    public final EObject entryRuleBasicRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1740:72: (iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF )
            // InternalRPL.g:1741:2: iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF
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
    // InternalRPL.g:1747:1: ruleBasicRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) ;
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
            // InternalRPL.g:1753:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) )
            // InternalRPL.g:1754:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            {
            // InternalRPL.g:1754:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            // InternalRPL.g:1755:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')'
            {
            // InternalRPL.g:1755:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1756:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1756:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1757:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getBasicRequirementPatternInstanceAccess().getPatternBasicRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1772:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRPL.g:1773:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1781:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1782:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1782:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1783:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalRPL.g:1800:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==28) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRPL.g:1801:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_26); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1805:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1806:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1806:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1807:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1826:3: (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRPL.g:1827:4: otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicRequirementPatternInstanceAccess().getFormulasKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:1835:4: ( (lv_fmParams_9_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1836:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1836:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1837:6: lv_fmParams_9_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalRPL.g:1854:4: (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRPL.g:1855:5: otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,28,FOLLOW_27); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:1859:5: ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1860:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1860:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1861:7: lv_fmParams_11_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:1880:3: (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRPL.g:1881:4: otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinalKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1889:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRPL.g:1890:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRPL.g:1890:5: (otherlv_14= RULE_ID )
                    // InternalRPL.g:1891:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_14, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1902:4: (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==39) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalRPL.g:1903:5: otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,39,FOLLOW_12); 

                            					newLeafNode(otherlv_15, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurrentKeyword_4_3_0());
                            				
                            otherlv_16=(Token)match(input,27,FOLLOW_9); 

                            					newLeafNode(otherlv_16, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_3_1());
                            				
                            // InternalRPL.g:1911:5: ( (otherlv_17= RULE_ID ) )
                            // InternalRPL.g:1912:6: (otherlv_17= RULE_ID )
                            {
                            // InternalRPL.g:1912:6: (otherlv_17= RULE_ID )
                            // InternalRPL.g:1913:7: otherlv_17= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_23); 

                            							newLeafNode(otherlv_17, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurStateUpdateStateVariableCrossReference_4_3_2_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:1934:1: entryRuleFutureRequirementPattern returns [EObject current=null] : iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF ;
    public final EObject entryRuleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureRequirementPattern = null;


        try {
            // InternalRPL.g:1934:65: (iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF )
            // InternalRPL.g:1935:2: iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF
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
    // InternalRPL.g:1941:1: ruleFutureRequirementPattern returns [EObject current=null] : (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fmParams_11_0 = null;

        EObject lv_fmParams_13_0 = null;

        EObject lv_lessas_17_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1947:2: ( (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' ) )
            // InternalRPL.g:1948:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' )
            {
            // InternalRPL.g:1948:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' )
            // InternalRPL.g:1949:3: otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureRequirementPatternAccess().getFuturereqKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:1957:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:1958:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:1958:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:1959:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFutureRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:1979:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRPL.g:1980:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1988:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:1989:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:1989:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:1990:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2007:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==28) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalRPL.g:2008:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2012:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2013:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2013:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2014:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2033:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRPL.g:2034:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2042:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2043:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2043:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2044:6: lv_fmParams_11_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:2061:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==28) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRPL.g:2062:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2066:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2067:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2067:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2068:7: lv_fmParams_13_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getFutureRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getFutureRequirementPatternAccess().getWithKeyword_7());
            		
            // InternalRPL.g:2095:3: ( (otherlv_16= RULE_ID ) )
            // InternalRPL.g:2096:4: (otherlv_16= RULE_ID )
            {
            // InternalRPL.g:2096:4: (otherlv_16= RULE_ID )
            // InternalRPL.g:2097:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_16, grammarAccess.getFutureRequirementPatternAccess().getExtraInvPatternFutureExtraInvariantPatternCrossReference_8_0());
            				

            }


            }

            // InternalRPL.g:2108:3: ( (lv_lessas_17_0= ruleFutureLemmas ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRPL.g:2109:4: (lv_lessas_17_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2109:4: (lv_lessas_17_0= ruleFutureLemmas )
                    // InternalRPL.g:2110:5: lv_lessas_17_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getLessasFutureLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lessas_17_0=ruleFutureLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFutureRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lessas",
                    						lv_lessas_17_0,
                    						"su.nsk.iae.rpl.RPL.FutureLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getFutureRequirementPatternAccess().getSemicolonKeyword_10());
            		

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
    // InternalRPL.g:2135:1: entryRulePastRequirementPattern returns [EObject current=null] : iv_rulePastRequirementPattern= rulePastRequirementPattern EOF ;
    public final EObject entryRulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastRequirementPattern = null;


        try {
            // InternalRPL.g:2135:63: (iv_rulePastRequirementPattern= rulePastRequirementPattern EOF )
            // InternalRPL.g:2136:2: iv_rulePastRequirementPattern= rulePastRequirementPattern EOF
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
    // InternalRPL.g:2142:1: rulePastRequirementPattern returns [EObject current=null] : (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fmParams_11_0 = null;

        EObject lv_fmParams_13_0 = null;

        EObject lv_lemmas_17_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2148:2: ( (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' ) )
            // InternalRPL.g:2149:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' )
            {
            // InternalRPL.g:2149:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' )
            // InternalRPL.g:2150:3: otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPastRequirementPatternAccess().getPastreqKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPastRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2158:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2159:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2159:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2160:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPastRequirementPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getPastRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2180:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRPL.g:2181:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2189:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2190:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2190:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2191:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2208:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==28) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRPL.g:2209:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2213:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2214:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2214:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2215:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2234:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRPL.g:2235:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2243:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2244:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2244:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2245:6: lv_fmParams_11_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:2262:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==28) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalRPL.g:2263:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2267:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2268:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2268:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2269:7: lv_fmParams_13_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getPastRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_15, grammarAccess.getPastRequirementPatternAccess().getWithKeyword_7());
            		
            // InternalRPL.g:2296:3: ( (otherlv_16= RULE_ID ) )
            // InternalRPL.g:2297:4: (otherlv_16= RULE_ID )
            {
            // InternalRPL.g:2297:4: (otherlv_16= RULE_ID )
            // InternalRPL.g:2298:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_16, grammarAccess.getPastRequirementPatternAccess().getExtraInvPatternPastExtraInvariantPatternCrossReference_8_0());
            				

            }


            }

            // InternalRPL.g:2309:3: ( (lv_lemmas_17_0= rulePastLemmas ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRPL.g:2310:4: (lv_lemmas_17_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2310:4: (lv_lemmas_17_0= rulePastLemmas )
                    // InternalRPL.g:2311:5: lv_lemmas_17_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getLemmasPastLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lemmas_17_0=rulePastLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPastRequirementPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_17_0,
                    						"su.nsk.iae.rpl.RPL.PastLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPastRequirementPatternAccess().getSemicolonKeyword_10());
            		

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
    // InternalRPL.g:2336:1: entryRuleFutureExtraInvariantPattern returns [EObject current=null] : iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF ;
    public final EObject entryRuleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2336:68: (iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF )
            // InternalRPL.g:2337:2: iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF
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
    // InternalRPL.g:2343:1: ruleFutureExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' ) ;
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
        Token otherlv_21=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_fmParams_16_0 = null;

        EObject lv_fmParams_18_0 = null;

        EObject lv_lemmas_20_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2349:2: ( (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' ) )
            // InternalRPL.g:2350:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' )
            {
            // InternalRPL.g:2350:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' )
            // InternalRPL.g:2351:3: otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureExtraInvariantPatternAccess().getFutureeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2359:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2360:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2360:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2361:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFutureExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2381:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==26) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRPL.g:2382:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2390:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2391:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2391:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2392:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalRPL.g:2409:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==28) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalRPL.g:2410:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2414:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2415:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2415:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2416:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2435:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRPL.g:2436:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2444:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2445:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2445:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2446:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2463:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==28) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRPL.g:2464:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2468:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2469:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2469:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2470:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2489:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRPL.g:2490:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getFutureExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2498:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2499:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2499:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2500:6: lv_fmParams_16_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:2517:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==28) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalRPL.g:2518:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2522:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2523:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2523:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2524:7: lv_fmParams_18_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getFutureExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2547:3: ( (lv_lemmas_20_0= ruleFutureLemmas ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRPL.g:2548:4: (lv_lemmas_20_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2548:4: (lv_lemmas_20_0= ruleFutureLemmas )
                    // InternalRPL.g:2549:5: lv_lemmas_20_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getLemmasFutureLemmasParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lemmas_20_0=ruleFutureLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFutureExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_20_0,
                    						"su.nsk.iae.rpl.RPL.FutureLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getFutureExtraInvariantPatternAccess().getSemicolonKeyword_9());
            		

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
    // InternalRPL.g:2574:1: entryRulePastExtraInvariantPattern returns [EObject current=null] : iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF ;
    public final EObject entryRulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2574:66: (iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF )
            // InternalRPL.g:2575:2: iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF
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
    // InternalRPL.g:2581:1: rulePastExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' ) ;
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
        Token otherlv_21=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_fmParams_16_0 = null;

        EObject lv_fmParams_18_0 = null;

        EObject lv_lemmas_20_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2587:2: ( (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' ) )
            // InternalRPL.g:2588:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' )
            {
            // InternalRPL.g:2588:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' )
            // InternalRPL.g:2589:3: otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternAccess().getPasteinvKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2597:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2598:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2598:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2599:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPastExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2619:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==26) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRPL.g:2620:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2628:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2629:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2629:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2630:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalRPL.g:2647:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==28) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRPL.g:2648:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2652:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2653:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2653:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2654:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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

            // InternalRPL.g:2673:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRPL.g:2674:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2682:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2683:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2683:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2684:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2701:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==28) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRPL.g:2702:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2706:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2707:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2707:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2708:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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

            // InternalRPL.g:2727:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==30) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRPL.g:2728:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getPastExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2736:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2737:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2737:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2738:6: lv_fmParams_16_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:2755:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==28) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRPL.g:2756:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2760:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2761:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2761:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2762:7: lv_fmParams_18_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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

            otherlv_19=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2785:3: ( (lv_lemmas_20_0= rulePastLemmas ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==51) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRPL.g:2786:4: (lv_lemmas_20_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2786:4: (lv_lemmas_20_0= rulePastLemmas )
                    // InternalRPL.g:2787:5: lv_lemmas_20_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getLemmasPastLemmasParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lemmas_20_0=rulePastLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPastExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_20_0,
                    						"su.nsk.iae.rpl.RPL.PastLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPastExtraInvariantPatternAccess().getSemicolonKeyword_9());
            		

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
    // InternalRPL.g:2812:1: entryRuleDerivedExtraInvariantPattern returns [EObject current=null] : iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF ;
    public final EObject entryRuleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2812:69: (iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF )
            // InternalRPL.g:2813:2: iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF
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
    // InternalRPL.g:2819:1: ruleDerivedExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' ) ;
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
        Token otherlv_27=null;
        EObject lv_cParams_6_0 = null;

        EObject lv_cParams_8_0 = null;

        EObject lv_fnParams_11_0 = null;

        EObject lv_fnParams_13_0 = null;

        EObject lv_simpleFmParams_17_0 = null;

        EObject lv_simpleFmParams_19_0 = null;

        EObject lv_fmParams_22_0 = null;

        EObject lv_fmParams_24_0 = null;

        EObject lv_lemmas_26_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:2825:2: ( (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' ) )
            // InternalRPL.g:2826:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' )
            {
            // InternalRPL.g:2826:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' )
            // InternalRPL.g:2827:3: otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getDerivedeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2835:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2836:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2836:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2837:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDerivedExtraInvariantPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2857:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==26) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRPL.g:2858:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2866:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2867:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2867:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2868:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalRPL.g:2885:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==28) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalRPL.g:2886:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2890:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2891:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2891:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2892:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2911:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRPL.g:2912:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2920:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2921:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2921:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2922:6: lv_fnParams_11_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalRPL.g:2939:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==28) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalRPL.g:2940:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2944:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2945:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2945:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2946:7: lv_fnParams_13_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFnParamsFunctionalParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2965:3: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==29) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRPL.g:2966:4: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_6_1());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_6_2());
                    			
                    // InternalRPL.g:2978:4: ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:2979:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:2979:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:2980:6: lv_simpleFmParams_17_0= ruleSimpleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRPL.g:2997:4: (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==28) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalRPL.g:2998:5: otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalRPL.g:3002:5: ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:3003:6: (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3003:6: (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:3004:7: lv_simpleFmParams_19_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_simpleFmParams_19_0=ruleSimpleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmParams",
                    	    								lv_simpleFmParams_19_0,
                    	    								"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
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
                    break;

            }

            // InternalRPL.g:3023:3: (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==30) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRPL.g:3024:4: otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_20=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_7_0());
                    			
                    otherlv_21=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_21, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_7_1());
                    			
                    // InternalRPL.g:3032:4: ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:3033:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:3033:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:3034:6: lv_fmParams_22_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRPL.g:3051:4: (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==28) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalRPL.g:3052:5: otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_23=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRPL.g:3056:5: ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:3057:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3057:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:3058:7: lv_fmParams_24_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getFmParamsRegularFormulaParameterParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_25, grammarAccess.getDerivedExtraInvariantPatternAccess().getRightParenthesisKeyword_8());
            		
            // InternalRPL.g:3081:3: ( (lv_lemmas_26_0= ruleDerivedLemmas ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRPL.g:3082:4: (lv_lemmas_26_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:3082:4: (lv_lemmas_26_0= ruleDerivedLemmas )
                    // InternalRPL.g:3083:5: lv_lemmas_26_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_lemmas_26_0=ruleDerivedLemmas();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivedExtraInvariantPatternRule());
                    					}
                    					set(
                    						current,
                    						"lemmas",
                    						lv_lemmas_26_0,
                    						"su.nsk.iae.rpl.RPL.DerivedLemmas");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getDerivedExtraInvariantPatternAccess().getSemicolonKeyword_10());
            		

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


    // $ANTLR start "entryRuleDir"
    // InternalRPL.g:3108:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // InternalRPL.g:3108:43: (iv_ruleDir= ruleDir EOF )
            // InternalRPL.g:3109:2: iv_ruleDir= ruleDir EOF
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
    // InternalRPL.g:3115:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRPL.g:3121:2: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) )
            // InternalRPL.g:3122:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            {
            // InternalRPL.g:3122:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt72=1;
                }
                break;
            case 36:
                {
                alt72=2;
                }
                break;
            case 46:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalRPL.g:3123:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3131:3: kw= '.'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:3137:3: kw= '..'
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
    // InternalRPL.g:3146:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalRPL.g:3146:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalRPL.g:3147:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalRPL.g:3153:1: ruleTerm returns [EObject current=null] : (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3159:2: ( (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalRPL.g:3160:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalRPL.g:3160:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalRPL.g:3161:3: this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getConjunctionTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjunctionTerm_0=ruleConjunctionTerm();

            state._fsp--;


            			current = this_ConjunctionTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3169:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_DISJUNCTION) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalRPL.g:3170:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalRPL.g:3170:4: ()
            	    // InternalRPL.g:3171:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getTermAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3181:4: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalRPL.g:3182:5: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalRPL.g:3182:5: (lv_right_3_0= ruleTerm )
            	    // InternalRPL.g:3183:6: lv_right_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleConjunctionTerm"
    // InternalRPL.g:3205:1: entryRuleConjunctionTerm returns [EObject current=null] : iv_ruleConjunctionTerm= ruleConjunctionTerm EOF ;
    public final EObject entryRuleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionTerm = null;


        try {
            // InternalRPL.g:3205:56: (iv_ruleConjunctionTerm= ruleConjunctionTerm EOF )
            // InternalRPL.g:3206:2: iv_ruleConjunctionTerm= ruleConjunctionTerm EOF
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
    // InternalRPL.g:3212:1: ruleConjunctionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) ;
    public final EObject ruleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3218:2: ( (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) )
            // InternalRPL.g:3219:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            {
            // InternalRPL.g:3219:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            // InternalRPL.g:3220:3: this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3228:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_CONJUNCTION) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalRPL.g:3229:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    {
            	    // InternalRPL.g:3229:4: ()
            	    // InternalRPL.g:3230:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionTermAccess().getConjunctionTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionTermAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3240:4: ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    // InternalRPL.g:3241:5: (lv_right_3_0= ruleConjunctionTerm )
            	    {
            	    // InternalRPL.g:3241:5: (lv_right_3_0= ruleConjunctionTerm )
            	    // InternalRPL.g:3242:6: lv_right_3_0= ruleConjunctionTerm
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionTermAccess().getRightConjunctionTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop74;
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
    // InternalRPL.g:3264:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalRPL.g:3264:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalRPL.g:3265:2: iv_ruleNegationTerm= ruleNegationTerm EOF
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
    // InternalRPL.g:3271:1: ruleNegationTerm returns [EObject current=null] : (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token this_NEGATION_1=null;
        EObject this_EqTerm_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3277:2: ( (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) )
            // InternalRPL.g:3278:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            {
            // InternalRPL.g:3278:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INTEGER)||LA75_0==RULE_BOOLEAN_LITERAL||LA75_0==RULE_REAL||LA75_0==25||LA75_0==47) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_NEGATION) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalRPL.g:3279:3: this_EqTerm_0= ruleEqTerm
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
                    // InternalRPL.g:3288:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    {
                    // InternalRPL.g:3288:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    // InternalRPL.g:3289:4: this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) )
                    {
                    this_NEGATION_1=(Token)match(input,RULE_NEGATION,FOLLOW_40); 

                    				newLeafNode(this_NEGATION_1, grammarAccess.getNegationTermAccess().getNEGATIONTerminalRuleCall_1_0());
                    			
                    // InternalRPL.g:3293:4: ( (lv_right_2_0= ruleEqTerm ) )
                    // InternalRPL.g:3294:5: (lv_right_2_0= ruleEqTerm )
                    {
                    // InternalRPL.g:3294:5: (lv_right_2_0= ruleEqTerm )
                    // InternalRPL.g:3295:6: lv_right_2_0= ruleEqTerm
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
    // InternalRPL.g:3317:1: entryRuleEqTerm returns [EObject current=null] : iv_ruleEqTerm= ruleEqTerm EOF ;
    public final EObject entryRuleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqTerm = null;


        try {
            // InternalRPL.g:3317:47: (iv_ruleEqTerm= ruleEqTerm EOF )
            // InternalRPL.g:3318:2: iv_ruleEqTerm= ruleEqTerm EOF
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
    // InternalRPL.g:3324:1: ruleEqTerm returns [EObject current=null] : (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) ;
    public final EObject ruleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompareTerm_0 = null;

        Enumerator lv_eqPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3330:2: ( (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) )
            // InternalRPL.g:3331:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            {
            // InternalRPL.g:3331:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            // InternalRPL.g:3332:3: this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqTermAccess().getCompareTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_CompareTerm_0=ruleCompareTerm();

            state._fsp--;


            			current = this_CompareTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3340:3: ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==32) ) {
                    alt76=1;
                }
                else if ( (LA76_0==68) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalRPL.g:3341:4: () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) )
            	    {
            	    // InternalRPL.g:3341:4: ()
            	    // InternalRPL.g:3342:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqTermAccess().getEqTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3348:4: ( (lv_eqPred_2_0= ruleEqPredicate ) )
            	    // InternalRPL.g:3349:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    {
            	    // InternalRPL.g:3349:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    // InternalRPL.g:3350:6: lv_eqPred_2_0= ruleEqPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getEqPredEqPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
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

            	    // InternalRPL.g:3367:4: ( (lv_right_3_0= ruleEqTerm ) )
            	    // InternalRPL.g:3368:5: (lv_right_3_0= ruleEqTerm )
            	    {
            	    // InternalRPL.g:3368:5: (lv_right_3_0= ruleEqTerm )
            	    // InternalRPL.g:3369:6: lv_right_3_0= ruleEqTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getRightEqTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
            	    break loop76;
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
    // InternalRPL.g:3391:1: entryRuleCompareTerm returns [EObject current=null] : iv_ruleCompareTerm= ruleCompareTerm EOF ;
    public final EObject entryRuleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareTerm = null;


        try {
            // InternalRPL.g:3391:52: (iv_ruleCompareTerm= ruleCompareTerm EOF )
            // InternalRPL.g:3392:2: iv_ruleCompareTerm= ruleCompareTerm EOF
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
    // InternalRPL.g:3398:1: ruleCompareTerm returns [EObject current=null] : (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) ;
    public final EObject ruleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AddTerm_0 = null;

        Enumerator lv_compPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3404:2: ( (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) )
            // InternalRPL.g:3405:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            {
            // InternalRPL.g:3405:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            // InternalRPL.g:3406:3: this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareTermAccess().getAddTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_AddTerm_0=ruleAddTerm();

            state._fsp--;


            			current = this_AddTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3414:3: ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            loop77:
            do {
                int alt77=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    alt77=1;
                    }
                    break;
                case 70:
                    {
                    alt77=1;
                    }
                    break;
                case 71:
                    {
                    alt77=1;
                    }
                    break;
                case 72:
                    {
                    alt77=1;
                    }
                    break;

                }

                switch (alt77) {
            	case 1 :
            	    // InternalRPL.g:3415:4: () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) )
            	    {
            	    // InternalRPL.g:3415:4: ()
            	    // InternalRPL.g:3416:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareTermAccess().getCompareTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3422:4: ( (lv_compPred_2_0= ruleCompPredicate ) )
            	    // InternalRPL.g:3423:5: (lv_compPred_2_0= ruleCompPredicate )
            	    {
            	    // InternalRPL.g:3423:5: (lv_compPred_2_0= ruleCompPredicate )
            	    // InternalRPL.g:3424:6: lv_compPred_2_0= ruleCompPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getCompPredCompPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
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

            	    // InternalRPL.g:3441:4: ( (lv_right_3_0= ruleCompareTerm ) )
            	    // InternalRPL.g:3442:5: (lv_right_3_0= ruleCompareTerm )
            	    {
            	    // InternalRPL.g:3442:5: (lv_right_3_0= ruleCompareTerm )
            	    // InternalRPL.g:3443:6: lv_right_3_0= ruleCompareTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getRightCompareTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleCompareTerm"


    // $ANTLR start "entryRuleAddTerm"
    // InternalRPL.g:3465:1: entryRuleAddTerm returns [EObject current=null] : iv_ruleAddTerm= ruleAddTerm EOF ;
    public final EObject entryRuleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTerm = null;


        try {
            // InternalRPL.g:3465:48: (iv_ruleAddTerm= ruleAddTerm EOF )
            // InternalRPL.g:3466:2: iv_ruleAddTerm= ruleAddTerm EOF
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
    // InternalRPL.g:3472:1: ruleAddTerm returns [EObject current=null] : (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) ;
    public final EObject ruleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject this_MulTerm_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3478:2: ( (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) )
            // InternalRPL.g:3479:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            {
            // InternalRPL.g:3479:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            // InternalRPL.g:3480:3: this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddTermAccess().getMulTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_MulTerm_0=ruleMulTerm();

            state._fsp--;


            			current = this_MulTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3488:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==73) ) {
                    alt78=1;
                }
                else if ( (LA78_0==47) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalRPL.g:3489:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) )
            	    {
            	    // InternalRPL.g:3489:4: ()
            	    // InternalRPL.g:3490:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddTermAccess().getAddTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3496:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalRPL.g:3497:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalRPL.g:3497:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalRPL.g:3498:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
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

            	    // InternalRPL.g:3515:4: ( (lv_right_3_0= ruleAddTerm ) )
            	    // InternalRPL.g:3516:5: (lv_right_3_0= ruleAddTerm )
            	    {
            	    // InternalRPL.g:3516:5: (lv_right_3_0= ruleAddTerm )
            	    // InternalRPL.g:3517:6: lv_right_3_0= ruleAddTerm
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getRightAddTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleAddTerm"


    // $ANTLR start "entryRuleMulTerm"
    // InternalRPL.g:3539:1: entryRuleMulTerm returns [EObject current=null] : iv_ruleMulTerm= ruleMulTerm EOF ;
    public final EObject entryRuleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulTerm = null;


        try {
            // InternalRPL.g:3539:48: (iv_ruleMulTerm= ruleMulTerm EOF )
            // InternalRPL.g:3540:2: iv_ruleMulTerm= ruleMulTerm EOF
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
    // InternalRPL.g:3546:1: ruleMulTerm returns [EObject current=null] : (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) ;
    public final EObject ruleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PowerTerm_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3552:2: ( (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) )
            // InternalRPL.g:3553:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            {
            // InternalRPL.g:3553:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            // InternalRPL.g:3554:3: this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulTermAccess().getPowerTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_PowerTerm_0=rulePowerTerm();

            state._fsp--;


            			current = this_PowerTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3562:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case 74:
                    {
                    alt79=1;
                    }
                    break;
                case 75:
                    {
                    alt79=1;
                    }
                    break;
                case 76:
                    {
                    alt79=1;
                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // InternalRPL.g:3563:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) )
            	    {
            	    // InternalRPL.g:3563:4: ()
            	    // InternalRPL.g:3564:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulTermAccess().getMulTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3570:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalRPL.g:3571:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalRPL.g:3571:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalRPL.g:3572:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
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

            	    // InternalRPL.g:3589:4: ( (lv_right_3_0= ruleMulTerm ) )
            	    // InternalRPL.g:3590:5: (lv_right_3_0= ruleMulTerm )
            	    {
            	    // InternalRPL.g:3590:5: (lv_right_3_0= ruleMulTerm )
            	    // InternalRPL.g:3591:6: lv_right_3_0= ruleMulTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getRightMulTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "ruleMulTerm"


    // $ANTLR start "entryRulePowerTerm"
    // InternalRPL.g:3613:1: entryRulePowerTerm returns [EObject current=null] : iv_rulePowerTerm= rulePowerTerm EOF ;
    public final EObject entryRulePowerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerTerm = null;


        try {
            // InternalRPL.g:3613:50: (iv_rulePowerTerm= rulePowerTerm EOF )
            // InternalRPL.g:3614:2: iv_rulePowerTerm= rulePowerTerm EOF
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
    // InternalRPL.g:3620:1: rulePowerTerm returns [EObject current=null] : (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) ;
    public final EObject rulePowerTerm() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3626:2: ( (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) )
            // InternalRPL.g:3627:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            {
            // InternalRPL.g:3627:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            // InternalRPL.g:3628:3: this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerTermAccess().getUnaryTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_UnaryTerm_0=ruleUnaryTerm();

            state._fsp--;


            			current = this_UnaryTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3636:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_POWER_OPERATOR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalRPL.g:3637:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) )
            	    {
            	    // InternalRPL.g:3637:4: ()
            	    // InternalRPL.g:3638:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerTermAccess().getPowerTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_40); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerTermAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3648:4: ( (lv_right_3_0= rulePowerTerm ) )
            	    // InternalRPL.g:3649:5: (lv_right_3_0= rulePowerTerm )
            	    {
            	    // InternalRPL.g:3649:5: (lv_right_3_0= rulePowerTerm )
            	    // InternalRPL.g:3650:6: lv_right_3_0= rulePowerTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPowerTermAccess().getRightPowerTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
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
    // $ANTLR end "rulePowerTerm"


    // $ANTLR start "entryRuleUnaryTerm"
    // InternalRPL.g:3672:1: entryRuleUnaryTerm returns [EObject current=null] : iv_ruleUnaryTerm= ruleUnaryTerm EOF ;
    public final EObject entryRuleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTerm = null;


        try {
            // InternalRPL.g:3672:50: (iv_ruleUnaryTerm= ruleUnaryTerm EOF )
            // InternalRPL.g:3673:2: iv_ruleUnaryTerm= ruleUnaryTerm EOF
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
    // InternalRPL.g:3679:1: ruleUnaryTerm returns [EObject current=null] : (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) ;
    public final EObject ruleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryTerm_0 = null;

        Enumerator lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3685:2: ( (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) )
            // InternalRPL.g:3686:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            {
            // InternalRPL.g:3686:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==47) ) {
                switch ( input.LA(2) ) {
                case RULE_INTEGER:
                    {
                    alt81=1;
                    }
                    break;
                case RULE_REAL:
                    {
                    alt81=1;
                    }
                    break;
                case RULE_ID:
                case RULE_BOOLEAN_LITERAL:
                case 25:
                case 47:
                    {
                    alt81=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_INTEGER)||LA81_0==RULE_BOOLEAN_LITERAL||LA81_0==RULE_REAL||LA81_0==25) ) {
                alt81=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalRPL.g:3687:3: this_PrimaryTerm_0= rulePrimaryTerm
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
                    // InternalRPL.g:3696:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    {
                    // InternalRPL.g:3696:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    // InternalRPL.g:3697:4: ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) )
                    {
                    // InternalRPL.g:3697:4: ( (lv_unOp_1_0= ruleUnMinus ) )
                    // InternalRPL.g:3698:5: (lv_unOp_1_0= ruleUnMinus )
                    {
                    // InternalRPL.g:3698:5: (lv_unOp_1_0= ruleUnMinus )
                    // InternalRPL.g:3699:6: lv_unOp_1_0= ruleUnMinus
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getUnOpUnMinusEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalRPL.g:3716:4: ( (lv_right_2_0= rulePrimaryTerm ) )
                    // InternalRPL.g:3717:5: (lv_right_2_0= rulePrimaryTerm )
                    {
                    // InternalRPL.g:3717:5: (lv_right_2_0= rulePrimaryTerm )
                    // InternalRPL.g:3718:6: lv_right_2_0= rulePrimaryTerm
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
    // InternalRPL.g:3740:1: entryRulePrimaryTerm returns [EObject current=null] : iv_rulePrimaryTerm= rulePrimaryTerm EOF ;
    public final EObject entryRulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryTerm = null;


        try {
            // InternalRPL.g:3740:52: (iv_rulePrimaryTerm= rulePrimaryTerm EOF )
            // InternalRPL.g:3741:2: iv_rulePrimaryTerm= rulePrimaryTerm EOF
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
    // InternalRPL.g:3747:1: rulePrimaryTerm returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_funApp_2_0= ruleFunApplication ) ) | (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_const_0_0 = null;

        EObject lv_funApp_2_0 = null;

        EObject lv_nestedTerm_4_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3753:2: ( ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_funApp_2_0= ruleFunApplication ) ) | (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:3754:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_funApp_2_0= ruleFunApplication ) ) | (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:3754:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_funApp_2_0= ruleFunApplication ) ) | (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
            case RULE_REAL:
            case 47:
                {
                alt82=1;
                }
                break;
            case RULE_ID:
                {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==25) ) {
                    alt82=3;
                }
                else if ( (LA82_2==EOF||(LA82_2>=RULE_DISJUNCTION && LA82_2<=RULE_CONJUNCTION)||LA82_2==RULE_POWER_OPERATOR||(LA82_2>=28 && LA82_2<=32)||LA82_2==38||LA82_2==47||(LA82_2>=68 && LA82_2<=76)) ) {
                    alt82=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalRPL.g:3755:3: ( (lv_const_0_0= ruleConstant ) )
                    {
                    // InternalRPL.g:3755:3: ( (lv_const_0_0= ruleConstant ) )
                    // InternalRPL.g:3756:4: (lv_const_0_0= ruleConstant )
                    {
                    // InternalRPL.g:3756:4: (lv_const_0_0= ruleConstant )
                    // InternalRPL.g:3757:5: lv_const_0_0= ruleConstant
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
                    // InternalRPL.g:3775:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalRPL.g:3775:3: ( (otherlv_1= RULE_ID ) )
                    // InternalRPL.g:3776:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRPL.g:3776:4: (otherlv_1= RULE_ID )
                    // InternalRPL.g:3777:5: otherlv_1= RULE_ID
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
                    // InternalRPL.g:3789:3: ( (lv_funApp_2_0= ruleFunApplication ) )
                    {
                    // InternalRPL.g:3789:3: ( (lv_funApp_2_0= ruleFunApplication ) )
                    // InternalRPL.g:3790:4: (lv_funApp_2_0= ruleFunApplication )
                    {
                    // InternalRPL.g:3790:4: (lv_funApp_2_0= ruleFunApplication )
                    // InternalRPL.g:3791:5: lv_funApp_2_0= ruleFunApplication
                    {

                    					newCompositeNode(grammarAccess.getPrimaryTermAccess().getFunAppFunApplicationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_funApp_2_0=ruleFunApplication();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryTermRule());
                    					}
                    					set(
                    						current,
                    						"funApp",
                    						lv_funApp_2_0,
                    						"su.nsk.iae.rpl.RPL.FunApplication");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:3809:3: (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:3809:3: (otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')' )
                    // InternalRPL.g:3810:4: otherlv_3= '(' ( (lv_nestedTerm_4_0= ruleTerm ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTermAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:3814:4: ( (lv_nestedTerm_4_0= ruleTerm ) )
                    // InternalRPL.g:3815:5: (lv_nestedTerm_4_0= ruleTerm )
                    {
                    // InternalRPL.g:3815:5: (lv_nestedTerm_4_0= ruleTerm )
                    // InternalRPL.g:3816:6: lv_nestedTerm_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getPrimaryTermAccess().getNestedTermTermParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_nestedTerm_4_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryTermRule());
                    						}
                    						set(
                    							current,
                    							"nestedTerm",
                    							lv_nestedTerm_4_0,
                    							"su.nsk.iae.rpl.RPL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryTermAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // InternalRPL.g:3842:1: entryRuleFunApplication returns [EObject current=null] : iv_ruleFunApplication= ruleFunApplication EOF ;
    public final EObject entryRuleFunApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunApplication = null;


        try {
            // InternalRPL.g:3842:55: (iv_ruleFunApplication= ruleFunApplication EOF )
            // InternalRPL.g:3843:2: iv_ruleFunApplication= ruleFunApplication EOF
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
    // InternalRPL.g:3849:1: ruleFunApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:3855:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRPL.g:3856:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRPL.g:3856:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRPL.g:3857:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalRPL.g:3857:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:3858:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:3858:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:3859:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getFunApplicationAccess().getFnParamFunctionalParameterCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFunApplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:3874:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:3875:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:3875:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:3876:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getFunApplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:3895:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRPL.g:3895:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRPL.g:3896:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalRPL.g:3902:1: ruleConstant returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3908:2: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalRPL.g:3909:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalRPL.g:3909:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INTEGER||LA83_0==RULE_REAL||LA83_0==47) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_BOOLEAN_LITERAL) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalRPL.g:3910:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // InternalRPL.g:3910:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // InternalRPL.g:3911:4: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // InternalRPL.g:3911:4: (lv_num_0_0= ruleNumericLiteral )
                    // InternalRPL.g:3912:5: lv_num_0_0= ruleNumericLiteral
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
                    // InternalRPL.g:3930:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:3930:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:3931:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:3931:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:3932:5: lv_bool_1_0= RULE_BOOLEAN_LITERAL
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
    // InternalRPL.g:3952:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalRPL.g:3952:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalRPL.g:3953:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalRPL.g:3959:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:3965:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalRPL.g:3966:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalRPL.g:3966:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt84=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==RULE_INTEGER) ) {
                    alt84=1;
                }
                else if ( (LA84_1==RULE_REAL) ) {
                    alt84=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                alt84=1;
                }
                break;
            case RULE_REAL:
                {
                alt84=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalRPL.g:3967:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalRPL.g:3976:3: this_RealLiteral_1= ruleRealLiteral
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
    // InternalRPL.g:3988:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalRPL.g:3988:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalRPL.g:3989:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalRPL.g:3995:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4001:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalRPL.g:4002:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalRPL.g:4002:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalRPL.g:4003:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalRPL.g:4003:3: ( (lv_sig_0_0= '-' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==47) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRPL.g:4004:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4004:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4005:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,47,FOLLOW_22); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getIntegerLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4017:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalRPL.g:4018:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalRPL.g:4018:4: (lv_value_1_0= RULE_INTEGER )
            // InternalRPL.g:4019:5: lv_value_1_0= RULE_INTEGER
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
    // InternalRPL.g:4039:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalRPL.g:4039:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalRPL.g:4040:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalRPL.g:4046:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4052:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRPL.g:4053:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRPL.g:4053:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRPL.g:4054:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRPL.g:4054:3: ( (lv_sig_0_0= '-' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==47) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalRPL.g:4055:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4055:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4056:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,47,FOLLOW_46); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getRealLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4068:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRPL.g:4069:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalRPL.g:4069:4: (lv_value_1_0= RULE_REAL )
            // InternalRPL.g:4070:5: lv_value_1_0= RULE_REAL
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
    // InternalRPL.g:4090:1: entryRulePatternFreeFormula returns [EObject current=null] : iv_rulePatternFreeFormula= rulePatternFreeFormula EOF ;
    public final EObject entryRulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormula = null;


        try {
            // InternalRPL.g:4090:59: (iv_rulePatternFreeFormula= rulePatternFreeFormula EOF )
            // InternalRPL.g:4091:2: iv_rulePatternFreeFormula= rulePatternFreeFormula EOF
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
    // InternalRPL.g:4097:1: rulePatternFreeFormula returns [EObject current=null] : (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) ;
    public final EObject rulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4103:2: ( (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4104:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4104:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            // InternalRPL.g:4105:3: this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjunctionPatternFreeFormula_0=ruleConjunctionPatternFreeFormula();

            state._fsp--;


            			current = this_ConjunctionPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4113:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_DISJUNCTION) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalRPL.g:4114:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4114:4: ()
            	    // InternalRPL.g:4115:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPatternFreeFormulaAccess().getPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getPatternFreeFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4125:4: ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    // InternalRPL.g:4126:5: (lv_right_3_0= rulePatternFreeFormula )
            	    {
            	    // InternalRPL.g:4126:5: (lv_right_3_0= rulePatternFreeFormula )
            	    // InternalRPL.g:4127:6: lv_right_3_0= rulePatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getRightPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop87;
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
    // InternalRPL.g:4149:1: entryRuleConjunctionPatternFreeFormula returns [EObject current=null] : iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF ;
    public final EObject entryRuleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionPatternFreeFormula = null;


        try {
            // InternalRPL.g:4149:70: (iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF )
            // InternalRPL.g:4150:2: iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF
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
    // InternalRPL.g:4156:1: ruleConjunctionPatternFreeFormula returns [EObject current=null] : (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) ;
    public final EObject ruleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4162:2: ( (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4163:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4163:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            // InternalRPL.g:4164:3: this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getPrimaryPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PrimaryPatternFreeFormula_0=rulePrimaryPatternFreeFormula();

            state._fsp--;


            			current = this_PrimaryPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4172:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==RULE_CONJUNCTION) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalRPL.g:4173:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4173:4: ()
            	    // InternalRPL.g:4174:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_27); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionPatternFreeFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4184:4: ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    // InternalRPL.g:4185:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    {
            	    // InternalRPL.g:4185:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    // InternalRPL.g:4186:6: lv_right_3_0= ruleConjunctionPatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getRightConjunctionPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop88;
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
    // InternalRPL.g:4208:1: entryRulePrimaryPatternFreeFormula returns [EObject current=null] : iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF ;
    public final EObject entryRulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPatternFreeFormula = null;


        try {
            // InternalRPL.g:4208:66: (iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF )
            // InternalRPL.g:4209:2: iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF
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
    // InternalRPL.g:4215:1: rulePrimaryPatternFreeFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4221:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:4222:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:4222:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||(LA89_0>=RULE_NEGATION && LA89_0<=RULE_BOOLEAN_LITERAL)||LA89_0==37) ) {
                alt89=1;
            }
            else if ( (LA89_0==25) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalRPL.g:4223:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:4223:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:4224:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:4224:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:4225:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:4243:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:4243:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:4244:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryPatternFreeFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:4248:4: ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:4249:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:4249:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    // InternalRPL.g:4250:6: lv_nestedFormula_2_0= rulePatternFreeFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaAccess().getNestedFormulaPatternFreeFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:4276:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRPL.g:4276:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRPL.g:4277:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRPL.g:4283:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRPL.g:4289:2: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalRPL.g:4290:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalRPL.g:4290:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // InternalRPL.g:4291:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalRPL.g:4295:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4296:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4296:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4297:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getColonKeyword_2());
            		
            // InternalRPL.g:4317:3: ( (otherlv_3= RULE_ID ) )
            // InternalRPL.g:4318:4: (otherlv_3= RULE_ID )
            {
            // InternalRPL.g:4318:4: (otherlv_3= RULE_ID )
            // InternalRPL.g:4319:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getWithKeyword_4());
            		
            // InternalRPL.g:4334:3: ( (otherlv_5= RULE_ID ) )
            // InternalRPL.g:4335:4: (otherlv_5= RULE_ID )
            {
            // InternalRPL.g:4335:4: (otherlv_5= RULE_ID )
            // InternalRPL.g:4336:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getExtraInvExtraInvariantCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getSemicolonKeyword_6());
            		

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
    // InternalRPL.g:4355:1: entryRuleExtraInvariant returns [EObject current=null] : iv_ruleExtraInvariant= ruleExtraInvariant EOF ;
    public final EObject entryRuleExtraInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraInvariant = null;


        try {
            // InternalRPL.g:4355:55: (iv_ruleExtraInvariant= ruleExtraInvariant EOF )
            // InternalRPL.g:4356:2: iv_ruleExtraInvariant= ruleExtraInvariant EOF
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
    // InternalRPL.g:4362:1: ruleExtraInvariant returns [EObject current=null] : (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleExtraInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRPL.g:4368:2: ( (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRPL.g:4369:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRPL.g:4369:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRPL.g:4370:3: otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getExtraInvariantAccess().getExtraKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraInvariantAccess().getInvariantKeyword_1());
            		
            // InternalRPL.g:4378:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:4379:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:4379:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:4380:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtraInvariantAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtraInvariantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExtraInvariantAccess().getColonKeyword_3());
            		
            // InternalRPL.g:4400:3: ( (otherlv_4= RULE_ID ) )
            // InternalRPL.g:4401:4: (otherlv_4= RULE_ID )
            {
            // InternalRPL.g:4401:4: (otherlv_4= RULE_ID )
            // InternalRPL.g:4402:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtraInvariantRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_4, grammarAccess.getExtraInvariantAccess().getPatternDerivedExtraInvariantPatternCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExtraInvariantAccess().getSemicolonKeyword_5());
            		

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
    // InternalRPL.g:4421:1: entryRulePatternFreeFormulaParameterValue returns [EObject current=null] : iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF ;
    public final EObject entryRulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormulaParameterValue = null;


        try {
            // InternalRPL.g:4421:73: (iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF )
            // InternalRPL.g:4422:2: iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF
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
    // InternalRPL.g:4428:1: rulePatternFreeFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) ;
    public final EObject rulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4434:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) )
            // InternalRPL.g:4435:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            {
            // InternalRPL.g:4435:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            // InternalRPL.g:4436:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) )
            {
            // InternalRPL.g:4436:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==35) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalRPL.g:4437:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternFreeFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:4441:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
                    int cnt90=0;
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==RULE_ID) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalRPL.g:4442:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:4442:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:4443:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    	    if ( cnt90 >= 1 ) break loop90;
                                EarlyExitException eee =
                                    new EarlyExitException(90, input);
                                throw eee;
                        }
                        cnt90++;
                    } while (true);

                    otherlv_2=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternFreeFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:4465:3: ( (lv_formula_3_0= rulePatternFreeFormula ) )
            // InternalRPL.g:4466:4: (lv_formula_3_0= rulePatternFreeFormula )
            {
            // InternalRPL.g:4466:4: (lv_formula_3_0= rulePatternFreeFormula )
            // InternalRPL.g:4467:5: lv_formula_3_0= rulePatternFreeFormula
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
    // InternalRPL.g:4488:1: entryRuleFutureLemmas returns [EObject current=null] : iv_ruleFutureLemmas= ruleFutureLemmas EOF ;
    public final EObject entryRuleFutureLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureLemmas = null;


        try {
            // InternalRPL.g:4488:53: (iv_ruleFutureLemmas= ruleFutureLemmas EOF )
            // InternalRPL.g:4489:2: iv_ruleFutureLemmas= ruleFutureLemmas EOF
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
    // InternalRPL.g:4495:1: ruleFutureLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) ;
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
            // InternalRPL.g:4501:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) )
            // InternalRPL.g:4502:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            {
            // InternalRPL.g:4502:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalRPL.g:4503:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalRPL.g:4503:3: ()
            // InternalRPL.g:4504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureLemmasAccess().getFutureLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4510:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalRPL.g:4511:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_1=(Token)match(input,51,FOLLOW_48); 

            				newLeafNode(otherlv_1, grammarAccess.getFutureLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,52,FOLLOW_49); 

            				newLeafNode(otherlv_2, grammarAccess.getFutureLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4519:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4520:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4520:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4521:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4524:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4525:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4525:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            loop92:
            do {
                int alt92=4;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt92=3;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalRPL.g:4526:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4526:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4527:6: {...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4527:112: ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4528:7: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4531:10: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4531:11: {...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4531:20: (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4531:21: otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,53,FOLLOW_50); 

            	    										newLeafNode(otherlv_4, grammarAccess.getFutureLemmasAccess().getLS1Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4535:10: ( (lv_L1_5_0= ruleLemma ) )
            	    // InternalRPL.g:4536:11: (lv_L1_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4536:11: (lv_L1_5_0= ruleLemma )
            	    // InternalRPL.g:4537:12: lv_L1_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL1LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_49);
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
            	    // InternalRPL.g:4560:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4560:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4561:6: {...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4561:112: ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4562:7: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4565:10: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4565:11: {...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4565:20: (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4565:21: otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,54,FOLLOW_50); 

            	    										newLeafNode(otherlv_6, grammarAccess.getFutureLemmasAccess().getLS2Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4569:10: ( (lv_L2_7_0= ruleLemma ) )
            	    // InternalRPL.g:4570:11: (lv_L2_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4570:11: (lv_L2_7_0= ruleLemma )
            	    // InternalRPL.g:4571:12: lv_L2_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL2LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_49);
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
            	    // InternalRPL.g:4594:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4594:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4595:6: {...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4595:112: ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4596:7: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4599:10: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4599:11: {...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4599:20: (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4599:21: otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,55,FOLLOW_50); 

            	    										newLeafNode(otherlv_8, grammarAccess.getFutureLemmasAccess().getLS3Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4603:10: ( (lv_L3_9_0= ruleLemma ) )
            	    // InternalRPL.g:4604:11: (lv_L3_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4604:11: (lv_L3_9_0= ruleLemma )
            	    // InternalRPL.g:4605:12: lv_L3_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL3LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_49);
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
            	    break loop92;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_10=(Token)match(input,56,FOLLOW_2); 

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
    // InternalRPL.g:4644:1: entryRulePastLemmas returns [EObject current=null] : iv_rulePastLemmas= rulePastLemmas EOF ;
    public final EObject entryRulePastLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastLemmas = null;


        try {
            // InternalRPL.g:4644:51: (iv_rulePastLemmas= rulePastLemmas EOF )
            // InternalRPL.g:4645:2: iv_rulePastLemmas= rulePastLemmas EOF
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
    // InternalRPL.g:4651:1: rulePastLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) ;
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
            // InternalRPL.g:4657:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) )
            // InternalRPL.g:4658:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            {
            // InternalRPL.g:4658:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalRPL.g:4659:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalRPL.g:4659:3: ()
            // InternalRPL.g:4660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastLemmasAccess().getPastLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4666:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalRPL.g:4667:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_1=(Token)match(input,51,FOLLOW_48); 

            				newLeafNode(otherlv_1, grammarAccess.getPastLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,52,FOLLOW_51); 

            				newLeafNode(otherlv_2, grammarAccess.getPastLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4675:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4676:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4676:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4677:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4680:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4681:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4681:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            loop93:
            do {
                int alt93=5;
                int LA93_0 = input.LA(1);

                if ( LA93_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt93=1;
                }
                else if ( LA93_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt93=2;
                }
                else if ( LA93_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt93=3;
                }
                else if ( LA93_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt93=4;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalRPL.g:4682:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4682:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4683:6: {...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4683:110: ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4684:7: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4687:10: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4687:11: {...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4687:20: (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4687:21: otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,57,FOLLOW_50); 

            	    										newLeafNode(otherlv_4, grammarAccess.getPastLemmasAccess().getLS4Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4691:10: ( (lv_L4_5_0= ruleLemma ) )
            	    // InternalRPL.g:4692:11: (lv_L4_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4692:11: (lv_L4_5_0= ruleLemma )
            	    // InternalRPL.g:4693:12: lv_L4_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL4LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    // InternalRPL.g:4716:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4716:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4717:6: {...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4717:110: ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4718:7: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4721:10: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4721:11: {...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4721:20: (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4721:21: otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,58,FOLLOW_50); 

            	    										newLeafNode(otherlv_6, grammarAccess.getPastLemmasAccess().getLS5Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4725:10: ( (lv_L5_7_0= ruleLemma ) )
            	    // InternalRPL.g:4726:11: (lv_L5_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4726:11: (lv_L5_7_0= ruleLemma )
            	    // InternalRPL.g:4727:12: lv_L5_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL5LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    // InternalRPL.g:4750:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4750:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4751:6: {...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4751:110: ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4752:7: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4755:10: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4755:11: {...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4755:20: (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4755:21: otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,59,FOLLOW_50); 

            	    										newLeafNode(otherlv_8, grammarAccess.getPastLemmasAccess().getLS6Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4759:10: ( (lv_L6_9_0= ruleLemma ) )
            	    // InternalRPL.g:4760:11: (lv_L6_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4760:11: (lv_L6_9_0= ruleLemma )
            	    // InternalRPL.g:4761:12: lv_L6_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL6LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    // InternalRPL.g:4784:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4784:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4785:6: {...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // InternalRPL.g:4785:110: ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4786:7: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3);
            	    						
            	    // InternalRPL.g:4789:10: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4789:11: {...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4789:20: (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    // InternalRPL.g:4789:21: otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) )
            	    {
            	    otherlv_10=(Token)match(input,60,FOLLOW_50); 

            	    										newLeafNode(otherlv_10, grammarAccess.getPastLemmasAccess().getLS7Keyword_1_2_3_0());
            	    									
            	    // InternalRPL.g:4793:10: ( (lv_L7_11_0= ruleLemma ) )
            	    // InternalRPL.g:4794:11: (lv_L7_11_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4794:11: (lv_L7_11_0= ruleLemma )
            	    // InternalRPL.g:4795:12: lv_L7_11_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL7LemmaParserRuleCall_1_2_3_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    break loop93;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_12=(Token)match(input,56,FOLLOW_2); 

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
    // InternalRPL.g:4834:1: entryRuleDerivedLemmas returns [EObject current=null] : iv_ruleDerivedLemmas= ruleDerivedLemmas EOF ;
    public final EObject entryRuleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedLemmas = null;


        try {
            // InternalRPL.g:4834:54: (iv_ruleDerivedLemmas= ruleDerivedLemmas EOF )
            // InternalRPL.g:4835:2: iv_ruleDerivedLemmas= ruleDerivedLemmas EOF
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
    // InternalRPL.g:4841:1: ruleDerivedLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) ;
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
            // InternalRPL.g:4847:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) )
            // InternalRPL.g:4848:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            {
            // InternalRPL.g:4848:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRPL.g:4849:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRPL.g:4849:3: ()
            // InternalRPL.g:4850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedLemmasAccess().getDerivedLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4856:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRPL.g:4857:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_1=(Token)match(input,51,FOLLOW_48); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,52,FOLLOW_52); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4865:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4866:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4866:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4867:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4870:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4871:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4871:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            loop94:
            do {
                int alt94=3;
                int LA94_0 = input.LA(1);

                if ( LA94_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt94=1;
                }
                else if ( LA94_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt94=2;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalRPL.g:4872:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4872:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4873:6: {...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4873:113: ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4874:7: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4877:10: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4877:11: {...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4877:20: (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4877:21: otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_50); 

            	    										newLeafNode(otherlv_4, grammarAccess.getDerivedLemmasAccess().getLS8Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4881:10: ( (lv_L8_5_0= ruleLemma ) )
            	    // InternalRPL.g:4882:11: (lv_L8_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4882:11: (lv_L8_5_0= ruleLemma )
            	    // InternalRPL.g:4883:12: lv_L8_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL8LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_52);
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
            	    // InternalRPL.g:4906:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4906:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4907:6: {...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4907:113: ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4908:7: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4911:10: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4911:11: {...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4911:20: (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4911:21: otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,62,FOLLOW_50); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedLemmasAccess().getLS9Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4915:10: ( (lv_L9_7_0= ruleLemma ) )
            	    // InternalRPL.g:4916:11: (lv_L9_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4916:11: (lv_L9_7_0= ruleLemma )
            	    // InternalRPL.g:4917:12: lv_L9_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL9LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_52);
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
            	    break loop94;
                }
            } while (true);


            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					

            }

            otherlv_8=(Token)match(input,56,FOLLOW_2); 

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
    // InternalRPL.g:4956:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // InternalRPL.g:4956:46: (iv_ruleLemma= ruleLemma EOF )
            // InternalRPL.g:4957:2: iv_ruleLemma= ruleLemma EOF
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
    // InternalRPL.g:4963:1: ruleLemma returns [EObject current=null] : (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )? (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )? otherlv_36= 'final' otherlv_37= 'state' otherlv_38= ':' ( (lv_finalState_39_0= ruleUpdateStateVariable ) ) otherlv_40= 'premise' ( (lv_prem_41_0= ruleLemmaPremiseFormula ) ) otherlv_42= '}' otherlv_43= ';' ) ;
    public final EObject ruleLemma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        EObject lv_cVars_5_0 = null;

        EObject lv_cVars_7_0 = null;

        EObject lv_fnVars_10_0 = null;

        EObject lv_fnVars_12_0 = null;

        EObject lv_simpleFmVars_16_0 = null;

        EObject lv_simpleFmVars_18_0 = null;

        EObject lv_ifmVars_23_0 = null;

        EObject lv_ifmVars_25_0 = null;

        EObject lv_rfmVars_29_0 = null;

        EObject lv_rfmVars_31_0 = null;

        EObject lv_initState_35_0 = null;

        EObject lv_finalState_39_0 = null;

        EObject lv_prem_41_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4969:2: ( (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )? (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )? otherlv_36= 'final' otherlv_37= 'state' otherlv_38= ':' ( (lv_finalState_39_0= ruleUpdateStateVariable ) ) otherlv_40= 'premise' ( (lv_prem_41_0= ruleLemmaPremiseFormula ) ) otherlv_42= '}' otherlv_43= ';' ) )
            // InternalRPL.g:4970:2: (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )? (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )? otherlv_36= 'final' otherlv_37= 'state' otherlv_38= ':' ( (lv_finalState_39_0= ruleUpdateStateVariable ) ) otherlv_40= 'premise' ( (lv_prem_41_0= ruleLemmaPremiseFormula ) ) otherlv_42= '}' otherlv_43= ';' )
            {
            // InternalRPL.g:4970:2: (otherlv_0= 'lemma' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )? (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )? otherlv_36= 'final' otherlv_37= 'state' otherlv_38= ':' ( (lv_finalState_39_0= ruleUpdateStateVariable ) ) otherlv_40= 'premise' ( (lv_prem_41_0= ruleLemmaPremiseFormula ) ) otherlv_42= '}' otherlv_43= ';' )
            // InternalRPL.g:4971:3: otherlv_0= 'lemma' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )? (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )? (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )? otherlv_36= 'final' otherlv_37= 'state' otherlv_38= ':' ( (lv_finalState_39_0= ruleUpdateStateVariable ) ) otherlv_40= 'premise' ( (lv_prem_41_0= ruleLemmaPremiseFormula ) ) otherlv_42= '}' otherlv_43= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLemmaAccess().getLemmaKeyword_0());
            		
            // InternalRPL.g:4975:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4976:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4976:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4977:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLemmaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLemmaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.rpl.RPL.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getLemmaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRPL.g:4997:3: (otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==26) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalRPL.g:4998:4: otherlv_3= 'const' otherlv_4= ':' ( (lv_cVars_5_0= ruleConstantParameter ) ) (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getLemmaAccess().getConstKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getLemmaAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:5006:4: ( (lv_cVars_5_0= ruleConstantParameter ) )
                    // InternalRPL.g:5007:5: (lv_cVars_5_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:5007:5: (lv_cVars_5_0= ruleConstantParameter )
                    // InternalRPL.g:5008:6: lv_cVars_5_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_54);
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

                    // InternalRPL.g:5025:4: (otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==28) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalRPL.g:5026:5: otherlv_6= ',' ( (lv_cVars_7_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLemmaAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:5030:5: ( (lv_cVars_7_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:5031:6: (lv_cVars_7_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:5031:6: (lv_cVars_7_0= ruleConstantParameter )
                    	    // InternalRPL.g:5032:7: lv_cVars_7_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5051:3: (otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==43) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalRPL.g:5052:4: otherlv_8= 'fun' otherlv_9= ':' ( (lv_fnVars_10_0= ruleFunctionalParameter ) ) (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getLemmaAccess().getFunKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getLemmaAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:5060:4: ( (lv_fnVars_10_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:5061:5: (lv_fnVars_10_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:5061:5: (lv_fnVars_10_0= ruleFunctionalParameter )
                    // InternalRPL.g:5062:6: lv_fnVars_10_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_55);
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

                    // InternalRPL.g:5079:4: (otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==28) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalRPL.g:5080:5: otherlv_11= ',' ( (lv_fnVars_12_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getLemmaAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:5084:5: ( (lv_fnVars_12_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:5085:6: (lv_fnVars_12_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:5085:6: (lv_fnVars_12_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:5086:7: lv_fnVars_12_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
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
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5105:3: (otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==29) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalRPL.g:5106:4: otherlv_13= 'simple' otherlv_14= 'formulas' otherlv_15= ':' ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) ) (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getLemmaAccess().getSimpleKeyword_5_0());
                    			
                    otherlv_14=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getLemmaAccess().getFormulasKeyword_5_1());
                    			
                    otherlv_15=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getLemmaAccess().getColonKeyword_5_2());
                    			
                    // InternalRPL.g:5118:4: ( (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:5119:5: (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:5119:5: (lv_simpleFmVars_16_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:5120:6: lv_simpleFmVars_16_0= ruleSimpleFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_simpleFmVars_16_0=ruleSimpleFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaRule());
                    						}
                    						add(
                    							current,
                    							"simpleFmVars",
                    							lv_simpleFmVars_16_0,
                    							"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5137:4: (otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==28) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalRPL.g:5138:5: otherlv_17= ',' ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getLemmaAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalRPL.g:5142:5: ( (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:5143:6: (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:5143:6: (lv_simpleFmVars_18_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:5144:7: lv_simpleFmVars_18_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_56);
                    	    lv_simpleFmVars_18_0=ruleSimpleFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLemmaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"simpleFmVars",
                    	    								lv_simpleFmVars_18_0,
                    	    								"su.nsk.iae.rpl.RPL.SimpleFormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5163:3: (otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==49) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalRPL.g:5164:4: otherlv_19= 'extra' otherlv_20= 'invariant' otherlv_21= 'formulas' otherlv_22= ':' ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) ) (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_19=(Token)match(input,49,FOLLOW_47); 

                    				newLeafNode(otherlv_19, grammarAccess.getLemmaAccess().getExtraKeyword_6_0());
                    			
                    otherlv_20=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getLemmaAccess().getInvariantKeyword_6_1());
                    			
                    otherlv_21=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getLemmaAccess().getFormulasKeyword_6_2());
                    			
                    otherlv_22=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getLemmaAccess().getColonKeyword_6_3());
                    			
                    // InternalRPL.g:5180:4: ( (lv_ifmVars_23_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:5181:5: (lv_ifmVars_23_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:5181:5: (lv_ifmVars_23_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:5182:6: lv_ifmVars_23_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_ifmVars_23_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaRule());
                    						}
                    						add(
                    							current,
                    							"ifmVars",
                    							lv_ifmVars_23_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5199:4: (otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==28) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalRPL.g:5200:5: otherlv_24= ',' ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_24=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getLemmaAccess().getCommaKeyword_6_5_0());
                    	    				
                    	    // InternalRPL.g:5204:5: ( (lv_ifmVars_25_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:5205:6: (lv_ifmVars_25_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:5205:6: (lv_ifmVars_25_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:5206:7: lv_ifmVars_25_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_6_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
                    	    lv_ifmVars_25_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLemmaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ifmVars",
                    	    								lv_ifmVars_25_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
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
                    break;

            }

            // InternalRPL.g:5225:3: (otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==48) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalRPL.g:5226:4: otherlv_26= 'requirement' otherlv_27= 'formulas' otherlv_28= ':' ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) ) (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_26=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getLemmaAccess().getRequirementKeyword_7_0());
                    			
                    otherlv_27=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getLemmaAccess().getFormulasKeyword_7_1());
                    			
                    otherlv_28=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_28, grammarAccess.getLemmaAccess().getColonKeyword_7_2());
                    			
                    // InternalRPL.g:5238:4: ( (lv_rfmVars_29_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:5239:5: (lv_rfmVars_29_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:5239:5: (lv_rfmVars_29_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:5240:6: lv_rfmVars_29_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_rfmVars_29_0=ruleRegularFormulaParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaRule());
                    						}
                    						add(
                    							current,
                    							"rfmVars",
                    							lv_rfmVars_29_0,
                    							"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRPL.g:5257:4: (otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==28) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalRPL.g:5258:5: otherlv_30= ',' ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_30=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getLemmaAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalRPL.g:5262:5: ( (lv_rfmVars_31_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:5263:6: (lv_rfmVars_31_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:5263:6: (lv_rfmVars_31_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:5264:7: lv_rfmVars_31_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_7_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_58);
                    	    lv_rfmVars_31_0=ruleRegularFormulaParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLemmaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rfmVars",
                    	    								lv_rfmVars_31_0,
                    	    								"su.nsk.iae.rpl.RPL.RegularFormulaParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5283:3: (otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==64) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalRPL.g:5284:4: otherlv_32= 'init' otherlv_33= 'state' otherlv_34= ':' ( (lv_initState_35_0= ruleUpdateStateVariable ) )
                    {
                    otherlv_32=(Token)match(input,64,FOLLOW_59); 

                    				newLeafNode(otherlv_32, grammarAccess.getLemmaAccess().getInitKeyword_8_0());
                    			
                    otherlv_33=(Token)match(input,65,FOLLOW_12); 

                    				newLeafNode(otherlv_33, grammarAccess.getLemmaAccess().getStateKeyword_8_1());
                    			
                    otherlv_34=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getLemmaAccess().getColonKeyword_8_2());
                    			
                    // InternalRPL.g:5296:4: ( (lv_initState_35_0= ruleUpdateStateVariable ) )
                    // InternalRPL.g:5297:5: (lv_initState_35_0= ruleUpdateStateVariable )
                    {
                    // InternalRPL.g:5297:5: (lv_initState_35_0= ruleUpdateStateVariable )
                    // InternalRPL.g:5298:6: lv_initState_35_0= ruleUpdateStateVariable
                    {

                    						newCompositeNode(grammarAccess.getLemmaAccess().getInitStateUpdateStateVariableParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_initState_35_0=ruleUpdateStateVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLemmaRule());
                    						}
                    						set(
                    							current,
                    							"initState",
                    							lv_initState_35_0,
                    							"su.nsk.iae.rpl.RPL.UpdateStateVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_36=(Token)match(input,38,FOLLOW_59); 

            			newLeafNode(otherlv_36, grammarAccess.getLemmaAccess().getFinalKeyword_9());
            		
            otherlv_37=(Token)match(input,65,FOLLOW_12); 

            			newLeafNode(otherlv_37, grammarAccess.getLemmaAccess().getStateKeyword_10());
            		
            otherlv_38=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_38, grammarAccess.getLemmaAccess().getColonKeyword_11());
            		
            // InternalRPL.g:5328:3: ( (lv_finalState_39_0= ruleUpdateStateVariable ) )
            // InternalRPL.g:5329:4: (lv_finalState_39_0= ruleUpdateStateVariable )
            {
            // InternalRPL.g:5329:4: (lv_finalState_39_0= ruleUpdateStateVariable )
            // InternalRPL.g:5330:5: lv_finalState_39_0= ruleUpdateStateVariable
            {

            					newCompositeNode(grammarAccess.getLemmaAccess().getFinalStateUpdateStateVariableParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_61);
            lv_finalState_39_0=ruleUpdateStateVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLemmaRule());
            					}
            					set(
            						current,
            						"finalState",
            						lv_finalState_39_0,
            						"su.nsk.iae.rpl.RPL.UpdateStateVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_40=(Token)match(input,66,FOLLOW_62); 

            			newLeafNode(otherlv_40, grammarAccess.getLemmaAccess().getPremiseKeyword_13());
            		
            // InternalRPL.g:5351:3: ( (lv_prem_41_0= ruleLemmaPremiseFormula ) )
            // InternalRPL.g:5352:4: (lv_prem_41_0= ruleLemmaPremiseFormula )
            {
            // InternalRPL.g:5352:4: (lv_prem_41_0= ruleLemmaPremiseFormula )
            // InternalRPL.g:5353:5: lv_prem_41_0= ruleLemmaPremiseFormula
            {

            					newCompositeNode(grammarAccess.getLemmaAccess().getPremLemmaPremiseFormulaParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_63);
            lv_prem_41_0=ruleLemmaPremiseFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLemmaRule());
            					}
            					set(
            						current,
            						"prem",
            						lv_prem_41_0,
            						"su.nsk.iae.rpl.RPL.LemmaPremiseFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_42=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_42, grammarAccess.getLemmaAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_43=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_43, grammarAccess.getLemmaAccess().getSemicolonKeyword_16());
            		

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
    // InternalRPL.g:5382:1: entryRuleLemmaPremiseFormula returns [EObject current=null] : iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF ;
    public final EObject entryRuleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5382:60: (iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF )
            // InternalRPL.g:5383:2: iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF
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
    // InternalRPL.g:5389:1: ruleLemmaPremiseFormula returns [EObject current=null] : (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) ;
    public final EObject ruleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_IMPLICATION_2=null;
        EObject this_DisjunctionLemmaPremiseFormula_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5395:2: ( (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) )
            // InternalRPL.g:5396:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            {
            // InternalRPL.g:5396:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_NEGATION && LA106_0<=RULE_BOOLEAN_LITERAL)||LA106_0==25||LA106_0==37||LA106_0==67) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_ID) ) {
                int LA106_2 = input.LA(2);

                if ( (LA106_2==25) ) {
                    int LA106_3 = input.LA(3);

                    if ( (LA106_3==RULE_ID) ) {
                        int LA106_4 = input.LA(4);

                        if ( (LA106_4==31) ) {
                            int LA106_5 = input.LA(5);

                            if ( (LA106_5==RULE_IMPLICATION) ) {
                                alt106=2;
                            }
                            else if ( (LA106_5==EOF||(LA106_5>=RULE_DISJUNCTION && LA106_5<=RULE_CONJUNCTION)||LA106_5==31||LA106_5==56) ) {
                                alt106=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 106, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA106_4==28) ) {
                            alt106=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA106_3==26||LA106_3==30||(LA106_3>=38 && LA106_3<=39)||LA106_3==43) ) {
                        alt106=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA106_2==EOF||(LA106_2>=RULE_DISJUNCTION && LA106_2<=RULE_CONJUNCTION)||LA106_2==31||LA106_2==56) ) {
                    alt106=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalRPL.g:5397:3: this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula
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
                    // InternalRPL.g:5406:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    {
                    // InternalRPL.g:5406:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    // InternalRPL.g:5407:4: ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    {
                    // InternalRPL.g:5407:4: ( (lv_left_1_0= ruleFunApplication ) )
                    // InternalRPL.g:5408:5: (lv_left_1_0= ruleFunApplication )
                    {
                    // InternalRPL.g:5408:5: (lv_left_1_0= ruleFunApplication )
                    // InternalRPL.g:5409:6: lv_left_1_0= ruleFunApplication
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getLeftFunApplicationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_64);
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
                    			
                    // InternalRPL.g:5430:4: ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5431:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5431:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5432:6: lv_right_3_0= ruleLemmaPremiseFormula
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
    // InternalRPL.g:5454:1: entryRuleDisjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5454:71: (iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5455:2: iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5461:1: ruleDisjunctionLemmaPremiseFormula returns [EObject current=null] : (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5467:2: ( (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5468:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5468:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5469:3: this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjunctionLemmaPremiseFormula_0=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;


            			current = this_ConjunctionLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5477:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==RULE_DISJUNCTION) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalRPL.g:5478:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5478:4: ()
            	    // InternalRPL.g:5479:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_62); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5489:4: ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5490:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5490:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5491:6: lv_right_3_0= ruleDisjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getRightDisjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop107;
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
    // InternalRPL.g:5513:1: entryRuleConjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5513:71: (iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5514:2: iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5520:1: ruleConjunctionLemmaPremiseFormula returns [EObject current=null] : (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5526:2: ( (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5527:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5527:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5528:3: this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getPrimaryLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_PrimaryLemmaPremiseFormula_0=rulePrimaryLemmaPremiseFormula();

            state._fsp--;


            			current = this_PrimaryLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5536:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==RULE_CONJUNCTION) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalRPL.g:5537:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5537:4: ()
            	    // InternalRPL.g:5538:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_62); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5548:4: ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5549:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5549:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5550:6: lv_right_3_0= ruleConjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getRightConjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop108;
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
    // InternalRPL.g:5572:1: entryRulePrimaryLemmaPremiseFormula returns [EObject current=null] : iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF ;
    public final EObject entryRulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5572:67: (iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF )
            // InternalRPL.g:5573:2: iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF
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
    // InternalRPL.g:5579:1: rulePrimaryLemmaPremiseFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) ;
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
            // InternalRPL.g:5585:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:5586:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:5586:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            int alt109=4;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 37:
                {
                alt109=1;
                }
                break;
            case RULE_ID:
                {
                int LA109_2 = input.LA(2);

                if ( (LA109_2==25) ) {
                    int LA109_5 = input.LA(3);

                    if ( (LA109_5==RULE_ID) ) {
                        alt109=1;
                    }
                    else if ( (LA109_5==26||LA109_5==30||(LA109_5>=38 && LA109_5<=39)||LA109_5==43) ) {
                        alt109=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA109_2==EOF||(LA109_2>=RULE_DISJUNCTION && LA109_2<=RULE_CONJUNCTION)||LA109_2==31||LA109_2==56) ) {
                    alt109=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 2, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt109=2;
                }
                break;
            case 25:
                {
                alt109=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalRPL.g:5587:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:5587:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:5588:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:5588:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:5589:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:5607:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    {
                    // InternalRPL.g:5607:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    // InternalRPL.g:5608:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    {
                    // InternalRPL.g:5608:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    // InternalRPL.g:5609:5: lv_alwaysImp_1_0= ruleAlwaysImplication
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
                    // InternalRPL.g:5627:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    {
                    // InternalRPL.g:5627:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    // InternalRPL.g:5628:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    {
                    // InternalRPL.g:5628:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    // InternalRPL.g:5629:5: lv_inst_2_0= rulePastExtraInvariantPatternInstance
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
                    // InternalRPL.g:5647:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:5647:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    // InternalRPL.g:5648:4: otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:5652:4: ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5653:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5653:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5654:6: lv_nestedFormula_4_0= ruleLemmaPremiseFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getNestedFormulaLemmaPremiseFormulaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:5680:1: entryRuleAlwaysImplication returns [EObject current=null] : iv_ruleAlwaysImplication= ruleAlwaysImplication EOF ;
    public final EObject entryRuleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplication = null;


        try {
            // InternalRPL.g:5680:58: (iv_ruleAlwaysImplication= ruleAlwaysImplication EOF )
            // InternalRPL.g:5681:2: iv_ruleAlwaysImplication= ruleAlwaysImplication EOF
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
    // InternalRPL.g:5687:1: ruleAlwaysImplication returns [EObject current=null] : (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) ;
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
            // InternalRPL.g:5693:2: ( (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) )
            // InternalRPL.g:5694:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            {
            // InternalRPL.g:5694:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            // InternalRPL.g:5695:3: otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationAccess().getAlwaysimpKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysImplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5703:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:5704:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:5704:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:5705:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlwaysImplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_66); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_3());
            		
            // InternalRPL.g:5720:3: ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:5721:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:5721:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:5722:5: lv_left_4_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getLeftAlwaysImplicationParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_65);
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

            otherlv_5=(Token)match(input,28,FOLLOW_66); 

            			newLeafNode(otherlv_5, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_5());
            		
            // InternalRPL.g:5743:3: ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:5744:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:5744:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:5745:5: lv_right_6_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getRightAlwaysImplicationParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:5770:1: entryRuleAlwaysImplicationParameterValue returns [EObject current=null] : iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF ;
    public final EObject entryRuleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplicationParameterValue = null;


        try {
            // InternalRPL.g:5770:72: (iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF )
            // InternalRPL.g:5771:2: iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF
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
    // InternalRPL.g:5777:1: ruleAlwaysImplicationParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) ;
    public final EObject ruleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5783:2: ( ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) )
            // InternalRPL.g:5784:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            {
            // InternalRPL.g:5784:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            // InternalRPL.g:5785:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) )
            {
            // InternalRPL.g:5785:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==35) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalRPL.g:5786:4: otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:5790:4: ( (lv_state_1_0= ruleUpdateStateVariable ) )
                    // InternalRPL.g:5791:5: (lv_state_1_0= ruleUpdateStateVariable )
                    {
                    // InternalRPL.g:5791:5: (lv_state_1_0= ruleUpdateStateVariable )
                    // InternalRPL.g:5792:6: lv_state_1_0= ruleUpdateStateVariable
                    {

                    						newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueAccess().getStateUpdateStateVariableParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

                    otherlv_2=(Token)match(input,36,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:5814:3: ( (lv_formula_3_0= ruleNegationFormula ) )
            // InternalRPL.g:5815:4: (lv_formula_3_0= ruleNegationFormula )
            {
            // InternalRPL.g:5815:4: (lv_formula_3_0= ruleNegationFormula )
            // InternalRPL.g:5816:5: lv_formula_3_0= ruleNegationFormula
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
    // InternalRPL.g:5837:1: entryRulePastExtraInvariantPatternInstance returns [EObject current=null] : iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF ;
    public final EObject entryRulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPatternInstance = null;


        try {
            // InternalRPL.g:5837:74: (iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF )
            // InternalRPL.g:5838:2: iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF
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
    // InternalRPL.g:5844:1: rulePastExtraInvariantPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) ;
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
            // InternalRPL.g:5850:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) )
            // InternalRPL.g:5851:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            {
            // InternalRPL.g:5851:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            // InternalRPL.g:5852:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')'
            {
            // InternalRPL.g:5852:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:5853:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:5853:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:5854:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getPatternPastExtraInvariantPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5869:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==26) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalRPL.g:5870:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:5878:4: ( (lv_cParams_4_0= ruleConstantParameter ) )
                    // InternalRPL.g:5879:5: (lv_cParams_4_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:5879:5: (lv_cParams_4_0= ruleConstantParameter )
                    // InternalRPL.g:5880:6: lv_cParams_4_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_69);
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

                    // InternalRPL.g:5897:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==28) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalRPL.g:5898:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:5902:5: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:5903:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:5903:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    // InternalRPL.g:5904:7: lv_cParams_6_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCParamsConstantParameterParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_69);
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
                    	    break loop111;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5923:3: (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==43) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalRPL.g:5924:4: otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFunKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:5932:4: ( (lv_fnParams_9_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:5933:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:5933:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    // InternalRPL.g:5934:6: lv_fnParams_9_0= ruleFunctionalParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_70);
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

                    // InternalRPL.g:5951:4: (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==28) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalRPL.g:5952:5: otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:5956:5: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:5957:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:5957:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:5958:7: lv_fnParams_11_0= ruleFunctionalParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFnParamsFunctionalParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_70);
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
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:5977:3: (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==30) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalRPL.g:5978:4: otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:5986:4: ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:5987:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:5987:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:5988:6: lv_fmParams_14_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_71);
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

                    // InternalRPL.g:6005:4: (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==28) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalRPL.g:6006:5: otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:6010:5: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:6011:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:6011:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:6012:7: lv_fmParams_16_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_71);
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
                    	    break loop115;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6031:3: (otherlv_17= 'current' | otherlv_18= 'final' )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==39) ) {
                alt117=1;
            }
            else if ( (LA117_0==38) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalRPL.g:6032:4: otherlv_17= 'current'
                    {
                    otherlv_17=(Token)match(input,39,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCurrentKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRPL.g:6037:4: otherlv_18= 'final'
                    {
                    otherlv_18=(Token)match(input,38,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFinalKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalRPL.g:6042:3: ( (otherlv_19= RULE_ID ) )
            // InternalRPL.g:6043:4: (otherlv_19= RULE_ID )
            {
            // InternalRPL.g:6043:4: (otherlv_19= RULE_ID )
            // InternalRPL.g:6044:5: otherlv_19= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getStateUpdateStateVariableCrossReference_6_0());
            				

            }


            }

            otherlv_20=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRPL.g:6063:1: ruleEqPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6069:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalRPL.g:6070:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalRPL.g:6070:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==32) ) {
                alt118=1;
            }
            else if ( (LA118_0==68) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalRPL.g:6071:3: (enumLiteral_0= '=' )
                    {
                    // InternalRPL.g:6071:3: (enumLiteral_0= '=' )
                    // InternalRPL.g:6072:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6079:3: (enumLiteral_1= '<>' )
                    {
                    // InternalRPL.g:6079:3: (enumLiteral_1= '<>' )
                    // InternalRPL.g:6080:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

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
    // InternalRPL.g:6090:1: ruleCompPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRPL.g:6096:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalRPL.g:6097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalRPL.g:6097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt119=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt119=1;
                }
                break;
            case 70:
                {
                alt119=2;
                }
                break;
            case 71:
                {
                alt119=3;
                }
                break;
            case 72:
                {
                alt119=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalRPL.g:6098:3: (enumLiteral_0= '<' )
                    {
                    // InternalRPL.g:6098:3: (enumLiteral_0= '<' )
                    // InternalRPL.g:6099:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6106:3: (enumLiteral_1= '>' )
                    {
                    // InternalRPL.g:6106:3: (enumLiteral_1= '>' )
                    // InternalRPL.g:6107:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6114:3: (enumLiteral_2= '<=' )
                    {
                    // InternalRPL.g:6114:3: (enumLiteral_2= '<=' )
                    // InternalRPL.g:6115:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6122:3: (enumLiteral_3= '>=' )
                    {
                    // InternalRPL.g:6122:3: (enumLiteral_3= '>=' )
                    // InternalRPL.g:6123:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

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
    // InternalRPL.g:6133:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6139:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalRPL.g:6140:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalRPL.g:6140:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==73) ) {
                alt120=1;
            }
            else if ( (LA120_0==47) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalRPL.g:6141:3: (enumLiteral_0= '+' )
                    {
                    // InternalRPL.g:6141:3: (enumLiteral_0= '+' )
                    // InternalRPL.g:6142:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6149:3: (enumLiteral_1= '-' )
                    {
                    // InternalRPL.g:6149:3: (enumLiteral_1= '-' )
                    // InternalRPL.g:6150:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalRPL.g:6160:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRPL.g:6166:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) )
            // InternalRPL.g:6167:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            {
            // InternalRPL.g:6167:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            int alt121=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt121=1;
                }
                break;
            case 75:
                {
                alt121=2;
                }
                break;
            case 76:
                {
                alt121=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalRPL.g:6168:3: (enumLiteral_0= '*' )
                    {
                    // InternalRPL.g:6168:3: (enumLiteral_0= '*' )
                    // InternalRPL.g:6169:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6176:3: (enumLiteral_1= '/' )
                    {
                    // InternalRPL.g:6176:3: (enumLiteral_1= '/' )
                    // InternalRPL.g:6177:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6184:3: (enumLiteral_2= 'mod' )
                    {
                    // InternalRPL.g:6184:3: (enumLiteral_2= 'mod' )
                    // InternalRPL.g:6185:4: enumLiteral_2= 'mod'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

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
    // InternalRPL.g:6195:1: ruleUnMinus returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleUnMinus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRPL.g:6201:2: ( (enumLiteral_0= '-' ) )
            // InternalRPL.g:6202:2: (enumLiteral_0= '-' )
            {
            // InternalRPL.g:6202:2: (enumLiteral_0= '-' )
            // InternalRPL.g:6203:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003370400900002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0003370400800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800002001660L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002802000620L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000620L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000040C4000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000040D0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004090000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000C4000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000800C4000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000800D0000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000800E4000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000800F0000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800002001460L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x6100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0003084024000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0003084030000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0003004030000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0003004010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001004010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000004010000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002002000620L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000002800000620L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x000008C044000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000008C050000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x000000C050000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x000000C010000000L});

}
