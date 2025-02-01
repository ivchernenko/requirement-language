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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INTEGER", "RULE_DISJUNCTION", "RULE_CONJUNCTION", "RULE_NEGATION", "RULE_BOOLEAN_LITERAL", "RULE_POWER_OPERATOR", "RULE_REAL", "RULE_IMPLICATION", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'derivedreq'", "'pattern'", "'('", "'const'", "':'", "','", "'simple'", "'formulas'", "')'", "'='", "'with'", "'var'", "'lambda'", "'.'", "'frm'", "'final'", "'current'", "'futurereq'", "'pastreq'", "'futureeinv'", "'fun'", "'pasteinv'", "'derivedeinv'", "'..'", "'['", "']'", "'-'", "'requirement'", "'extra'", "'invariant'", "'lemmas'", "'{'", "'LS1'", "'LS2'", "'LS3'", "'}'", "'LS4'", "'LS5'", "'LS6'", "'LS7'", "'LS8'", "'LS9'", "'lemma'", "'init'", "'state'", "'premise'", "'alwaysimp'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'/'", "'mod'"
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

                if ( (LA2_0==22||LA2_0==33||(LA2_0>=39 && LA2_0<=41)||(LA2_0>=43 && LA2_0<=44)||(LA2_0>=49 && LA2_0<=50)) ) {
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
            case 49:
                {
                alt3=8;
                }
                break;
            case 50:
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
    // InternalRPL.g:273:1: ruleDerivedRequirementPattern returns [EObject current=null] : (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' ) ;
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
            // InternalRPL.g:279:2: ( (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' ) )
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' )
            {
            // InternalRPL.g:280:2: (otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';' )
            // InternalRPL.g:281:3: otherlv_0= 'derivedreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_15= 'formulas' otherlv_16= ':' ( (lv_fmParams_17_0= ruleRegularFormulaParameter ) ) (otherlv_18= ',' ( (lv_fmParams_19_0= ruleRegularFormulaParameter ) ) )* )? otherlv_20= ')' ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) ) ( (lv_lemmas_25_0= ruleDerivedLemmas ) )? otherlv_26= ';'
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

            // InternalRPL.g:365:3: (otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRPL.g:366:4: otherlv_9= 'simple' otherlv_10= 'formulas' otherlv_11= ':' ( (lv_simpleFmParams_12_0= ruleSimpleFormulaParameter ) ) (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )*
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

                    // InternalRPL.g:397:4: (otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRPL.g:398:5: otherlv_13= ',' ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDerivedRequirementPatternAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalRPL.g:402:5: ( (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:403:6: (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:403:6: (lv_simpleFmParams_14_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:404:7: lv_simpleFmParams_14_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_5_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
            		
            // InternalRPL.g:481:3: ( (otherlv_21= '=' ( (lv_definition_22_0= ruleFormula ) ) ) | (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) ) )
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
                    // InternalRPL.g:508:4: (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) )
                    {
                    // InternalRPL.g:508:4: (otherlv_23= 'with' ( (otherlv_24= RULE_ID ) ) )
                    // InternalRPL.g:509:5: otherlv_23= 'with' ( (otherlv_24= RULE_ID ) )
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_8); 

                    					newLeafNode(otherlv_23, grammarAccess.getDerivedRequirementPatternAccess().getWithKeyword_8_1_0());
                    				
                    // InternalRPL.g:513:5: ( (otherlv_24= RULE_ID ) )
                    // InternalRPL.g:514:6: (otherlv_24= RULE_ID )
                    {
                    // InternalRPL.g:514:6: (otherlv_24= RULE_ID )
                    // InternalRPL.g:515:7: otherlv_24= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDerivedRequirementPatternRule());
                    							}
                    						
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_24, grammarAccess.getDerivedRequirementPatternAccess().getExtraInvPatternDerivedExtraInvariantPatternCrossReference_8_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRPL.g:528:3: ( (lv_lemmas_25_0= ruleDerivedLemmas ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPL.g:529:4: (lv_lemmas_25_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:529:4: (lv_lemmas_25_0= ruleDerivedLemmas )
                    // InternalRPL.g:530:5: lv_lemmas_25_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedRequirementPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_26=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:555:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalRPL.g:555:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalRPL.g:556:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalRPL.g:562:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:568:2: ( (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' ) )
            // InternalRPL.g:569:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            {
            // InternalRPL.g:569:2: (otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';' )
            // InternalRPL.g:570:3: otherlv_0= 'var' ( (lv_vars_1_0= ruleProgramVariable ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getVarKeyword_0());
            		
            // InternalRPL.g:574:3: ( (lv_vars_1_0= ruleProgramVariable ) )
            // InternalRPL.g:575:4: (lv_vars_1_0= ruleProgramVariable )
            {
            // InternalRPL.g:575:4: (lv_vars_1_0= ruleProgramVariable )
            // InternalRPL.g:576:5: lv_vars_1_0= ruleProgramVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalRPL.g:593:3: (otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPL.g:594:4: otherlv_2= ',' ( (lv_vars_3_0= ruleProgramVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarDeclarationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRPL.g:598:4: ( (lv_vars_3_0= ruleProgramVariable ) )
            	    // InternalRPL.g:599:5: (lv_vars_3_0= ruleProgramVariable )
            	    {
            	    // InternalRPL.g:599:5: (lv_vars_3_0= ruleProgramVariable )
            	    // InternalRPL.g:600:6: lv_vars_3_0= ruleProgramVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsProgramVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalRPL.g:626:1: entryRuleProgramVariable returns [EObject current=null] : iv_ruleProgramVariable= ruleProgramVariable EOF ;
    public final EObject entryRuleProgramVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramVariable = null;


        try {
            // InternalRPL.g:626:56: (iv_ruleProgramVariable= ruleProgramVariable EOF )
            // InternalRPL.g:627:2: iv_ruleProgramVariable= ruleProgramVariable EOF
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
    // InternalRPL.g:633:1: ruleProgramVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProgramVariable() throws RecognitionException {
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
    // InternalRPL.g:661:1: entryRuleUpdateStateVariable returns [EObject current=null] : iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF ;
    public final EObject entryRuleUpdateStateVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStateVariable = null;


        try {
            // InternalRPL.g:661:60: (iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF )
            // InternalRPL.g:662:2: iv_ruleUpdateStateVariable= ruleUpdateStateVariable EOF
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
    // InternalRPL.g:668:1: ruleUpdateStateVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUpdateStateVariable() throws RecognitionException {
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
    // InternalRPL.g:696:1: entryRuleConstantParameter returns [EObject current=null] : iv_ruleConstantParameter= ruleConstantParameter EOF ;
    public final EObject entryRuleConstantParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantParameter = null;


        try {
            // InternalRPL.g:696:58: (iv_ruleConstantParameter= ruleConstantParameter EOF )
            // InternalRPL.g:697:2: iv_ruleConstantParameter= ruleConstantParameter EOF
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
    // InternalRPL.g:703:1: ruleConstantParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstantParameter() throws RecognitionException {
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
    // InternalRPL.g:731:1: entryRuleSimpleFormulaParameter returns [EObject current=null] : iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF ;
    public final EObject entryRuleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFormulaParameter = null;


        try {
            // InternalRPL.g:731:63: (iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF )
            // InternalRPL.g:732:2: iv_ruleSimpleFormulaParameter= ruleSimpleFormulaParameter EOF
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
    // InternalRPL.g:738:1: ruleSimpleFormulaParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleSimpleFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arity_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:744:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? ) )
            // InternalRPL.g:745:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            {
            // InternalRPL.g:745:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )? )
            // InternalRPL.g:746:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            {
            // InternalRPL.g:746:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:747:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:747:4: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:748:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalRPL.g:764:3: (otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRPL.g:765:4: otherlv_1= '(' ( (lv_arity_2_0= RULE_INTEGER ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getSimpleFormulaParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:769:4: ( (lv_arity_2_0= RULE_INTEGER ) )
                    // InternalRPL.g:770:5: (lv_arity_2_0= RULE_INTEGER )
                    {
                    // InternalRPL.g:770:5: (lv_arity_2_0= RULE_INTEGER )
                    // InternalRPL.g:771:6: lv_arity_2_0= RULE_INTEGER
                    {
                    lv_arity_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_22); 

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
    // InternalRPL.g:796:1: entryRuleRegularFormulaParameter returns [EObject current=null] : iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF ;
    public final EObject entryRuleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularFormulaParameter = null;


        try {
            // InternalRPL.g:796:64: (iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF )
            // InternalRPL.g:797:2: iv_ruleRegularFormulaParameter= ruleRegularFormulaParameter EOF
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
    // InternalRPL.g:803:1: ruleRegularFormulaParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRegularFormulaParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:809:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:810:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:810:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:811:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:811:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:812:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:831:1: entryRuleFunctionalParameter returns [EObject current=null] : iv_ruleFunctionalParameter= ruleFunctionalParameter EOF ;
    public final EObject entryRuleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalParameter = null;


        try {
            // InternalRPL.g:831:60: (iv_ruleFunctionalParameter= ruleFunctionalParameter EOF )
            // InternalRPL.g:832:2: iv_ruleFunctionalParameter= ruleFunctionalParameter EOF
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
    // InternalRPL.g:838:1: ruleFunctionalParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFunctionalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRPL.g:844:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRPL.g:845:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRPL.g:845:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRPL.g:846:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRPL.g:846:3: (lv_name_0_0= RULE_ID )
            // InternalRPL.g:847:4: lv_name_0_0= RULE_ID
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
    // InternalRPL.g:866:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalRPL.g:866:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalRPL.g:867:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalRPL.g:873:1: ruleFormula returns [EObject current=null] : (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:879:2: ( (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* ) )
            // InternalRPL.g:880:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            {
            // InternalRPL.g:880:2: (this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )* )
            // InternalRPL.g:881:3: this_ConjunctionFormula_0= ruleConjunctionFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getFormulaAccess().getConjunctionFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ConjunctionFormula_0=ruleConjunctionFormula();

            state._fsp--;


            			current = this_ConjunctionFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:889:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DISJUNCTION) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRPL.g:890:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleFormula ) )
            	    {
            	    // InternalRPL.g:890:4: ()
            	    // InternalRPL.g:891:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_17); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:901:4: ( (lv_right_3_0= ruleFormula ) )
            	    // InternalRPL.g:902:5: (lv_right_3_0= ruleFormula )
            	    {
            	    // InternalRPL.g:902:5: (lv_right_3_0= ruleFormula )
            	    // InternalRPL.g:903:6: lv_right_3_0= ruleFormula
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getRightFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // InternalRPL.g:925:1: entryRuleConjunctionFormula returns [EObject current=null] : iv_ruleConjunctionFormula= ruleConjunctionFormula EOF ;
    public final EObject entryRuleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFormula = null;


        try {
            // InternalRPL.g:925:59: (iv_ruleConjunctionFormula= ruleConjunctionFormula EOF )
            // InternalRPL.g:926:2: iv_ruleConjunctionFormula= ruleConjunctionFormula EOF
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
    // InternalRPL.g:932:1: ruleConjunctionFormula returns [EObject current=null] : (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) ;
    public final EObject ruleConjunctionFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:938:2: ( (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* ) )
            // InternalRPL.g:939:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            {
            // InternalRPL.g:939:2: (this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )* )
            // InternalRPL.g:940:3: this_PrimaryFormula_0= rulePrimaryFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getPrimaryFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PrimaryFormula_0=rulePrimaryFormula();

            state._fsp--;


            			current = this_PrimaryFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:948:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_CONJUNCTION) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRPL.g:949:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    {
            	    // InternalRPL.g:949:4: ()
            	    // InternalRPL.g:950:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionFormulaAccess().getConjunctionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_17); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:960:4: ( (lv_right_3_0= ruleConjunctionFormula ) )
            	    // InternalRPL.g:961:5: (lv_right_3_0= ruleConjunctionFormula )
            	    {
            	    // InternalRPL.g:961:5: (lv_right_3_0= ruleConjunctionFormula )
            	    // InternalRPL.g:962:6: lv_right_3_0= ruleConjunctionFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionFormulaAccess().getRightConjunctionFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // InternalRPL.g:984:1: entryRulePrimaryFormula returns [EObject current=null] : iv_rulePrimaryFormula= rulePrimaryFormula EOF ;
    public final EObject entryRulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryFormula = null;


        try {
            // InternalRPL.g:984:55: (iv_rulePrimaryFormula= rulePrimaryFormula EOF )
            // InternalRPL.g:985:2: iv_rulePrimaryFormula= rulePrimaryFormula EOF
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
    // InternalRPL.g:991:1: rulePrimaryFormula returns [EObject current=null] : ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_patternInst_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:997:2: ( ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:998:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:998:2: ( ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' ) )
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
                    // InternalRPL.g:999:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:999:3: ( (lv_patternInst_0_0= ruleOuterRequirementPatternInstance ) )
                    // InternalRPL.g:1000:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    {
                    // InternalRPL.g:1000:4: (lv_patternInst_0_0= ruleOuterRequirementPatternInstance )
                    // InternalRPL.g:1001:5: lv_patternInst_0_0= ruleOuterRequirementPatternInstance
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
                    // InternalRPL.g:1019:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:1019:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:1020:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= ruleFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:1024:4: ( (lv_nestedFormula_2_0= ruleFormula ) )
                    // InternalRPL.g:1025:5: (lv_nestedFormula_2_0= ruleFormula )
                    {
                    // InternalRPL.g:1025:5: (lv_nestedFormula_2_0= ruleFormula )
                    // InternalRPL.g:1026:6: lv_nestedFormula_2_0= ruleFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryFormulaAccess().getNestedFormulaFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalRPL.g:1052:1: entryRuleOuterRequirementPatternInstance returns [EObject current=null] : iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF ;
    public final EObject entryRuleOuterRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOuterRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1052:72: (iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF )
            // InternalRPL.g:1053:2: iv_ruleOuterRequirementPatternInstance= ruleOuterRequirementPatternInstance EOF
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
    // InternalRPL.g:1059:1: ruleOuterRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) ;
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
            // InternalRPL.g:1065:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' ) )
            // InternalRPL.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            {
            // InternalRPL.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')' )
            // InternalRPL.g:1067:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )? (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )? otherlv_18= ')'
            {
            // InternalRPL.g:1067:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1068:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1068:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1069:5: otherlv_0= RULE_ID
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
            		
            // InternalRPL.g:1084:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRPL.g:1085:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getOuterRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1093:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1094:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1094:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1095:6: lv_cParams_4_0= ruleTerm
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

                    // InternalRPL.g:1112:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRPL.g:1113:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_25); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1117:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1118:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1118:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1119:7: lv_cParams_6_0= ruleTerm
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

            // InternalRPL.g:1138:3: (otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRPL.g:1139:4: otherlv_7= 'simple' otherlv_8= 'formulas' otherlv_9= ':' ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) ) (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getOuterRequirementPatternInstanceAccess().getSimpleKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_3_1());
                    			
                    otherlv_9=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_3_2());
                    			
                    // InternalRPL.g:1151:4: ( (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue ) )
                    // InternalRPL.g:1152:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    {
                    // InternalRPL.g:1152:5: (lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue )
                    // InternalRPL.g:1153:6: lv_simpleFmParams_10_0= rulePatternFreeFormulaParameterValue
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

                    // InternalRPL.g:1170:4: (otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRPL.g:1171:5: otherlv_11= ',' ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_26); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalRPL.g:1175:5: ( (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue ) )
                    	    // InternalRPL.g:1176:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1176:6: (lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue )
                    	    // InternalRPL.g:1177:7: lv_simpleFmParams_12_0= rulePatternFreeFormulaParameterValue
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

            // InternalRPL.g:1196:3: (otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRPL.g:1197:4: otherlv_13= 'formulas' otherlv_14= ':' ( (lv_fmParams_15_0= ruleFormulaParameterValue ) ) (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getOuterRequirementPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_14=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getOuterRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1205:4: ( (lv_fmParams_15_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1206:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1206:5: (lv_fmParams_15_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1207:6: lv_fmParams_15_0= ruleFormulaParameterValue
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

                    // InternalRPL.g:1224:4: (otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==27) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRPL.g:1225:5: otherlv_16= ',' ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,27,FOLLOW_26); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getOuterRequirementPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1229:5: ( (lv_fmParams_17_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1230:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1230:6: (lv_fmParams_17_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1231:7: lv_fmParams_17_0= ruleFormulaParameterValue
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
    // InternalRPL.g:1258:1: entryRuleFormulaParameterValue returns [EObject current=null] : iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF ;
    public final EObject entryRuleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaParameterValue = null;


        try {
            // InternalRPL.g:1258:62: (iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF )
            // InternalRPL.g:1259:2: iv_ruleFormulaParameterValue= ruleFormulaParameterValue EOF
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
    // InternalRPL.g:1265:1: ruleFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) ;
    public final EObject ruleFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1271:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) ) )
            // InternalRPL.g:1272:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            {
            // InternalRPL.g:1272:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) ) )
            // InternalRPL.g:1273:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= ruleInnerFormula ) )
            {
            // InternalRPL.g:1273:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRPL.g:1274:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:1278:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
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
                    	    // InternalRPL.g:1279:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:1279:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:1280:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
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

                    otherlv_2=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:1302:3: ( (lv_formula_3_0= ruleInnerFormula ) )
            // InternalRPL.g:1303:4: (lv_formula_3_0= ruleInnerFormula )
            {
            // InternalRPL.g:1303:4: (lv_formula_3_0= ruleInnerFormula )
            // InternalRPL.g:1304:5: lv_formula_3_0= ruleInnerFormula
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
    // InternalRPL.g:1325:1: entryRuleInnerFormula returns [EObject current=null] : iv_ruleInnerFormula= ruleInnerFormula EOF ;
    public final EObject entryRuleInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerFormula = null;


        try {
            // InternalRPL.g:1325:53: (iv_ruleInnerFormula= ruleInnerFormula EOF )
            // InternalRPL.g:1326:2: iv_ruleInnerFormula= ruleInnerFormula EOF
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
    // InternalRPL.g:1332:1: ruleInnerFormula returns [EObject current=null] : (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) ;
    public final EObject ruleInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1338:2: ( (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* ) )
            // InternalRPL.g:1339:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            {
            // InternalRPL.g:1339:2: (this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )* )
            // InternalRPL.g:1340:3: this_ConjunctionInnerFormula_0= ruleConjunctionInnerFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getInnerFormulaAccess().getConjunctionInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ConjunctionInnerFormula_0=ruleConjunctionInnerFormula();

            state._fsp--;


            			current = this_ConjunctionInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1348:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DISJUNCTION) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRPL.g:1349:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleInnerFormula ) )
            	    {
            	    // InternalRPL.g:1349:4: ()
            	    // InternalRPL.g:1350:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getInnerFormulaAccess().getInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getInnerFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1360:4: ( (lv_right_3_0= ruleInnerFormula ) )
            	    // InternalRPL.g:1361:5: (lv_right_3_0= ruleInnerFormula )
            	    {
            	    // InternalRPL.g:1361:5: (lv_right_3_0= ruleInnerFormula )
            	    // InternalRPL.g:1362:6: lv_right_3_0= ruleInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getInnerFormulaAccess().getRightInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // InternalRPL.g:1384:1: entryRuleConjunctionInnerFormula returns [EObject current=null] : iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF ;
    public final EObject entryRuleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionInnerFormula = null;


        try {
            // InternalRPL.g:1384:64: (iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF )
            // InternalRPL.g:1385:2: iv_ruleConjunctionInnerFormula= ruleConjunctionInnerFormula EOF
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
    // InternalRPL.g:1391:1: ruleConjunctionInnerFormula returns [EObject current=null] : (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) ;
    public final EObject ruleConjunctionInnerFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryInnerFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1397:2: ( (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* ) )
            // InternalRPL.g:1398:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            {
            // InternalRPL.g:1398:2: (this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )* )
            // InternalRPL.g:1399:3: this_PrimaryInnerFormula_0= rulePrimaryInnerFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getPrimaryInnerFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PrimaryInnerFormula_0=rulePrimaryInnerFormula();

            state._fsp--;


            			current = this_PrimaryInnerFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:1407:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_CONJUNCTION) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRPL.g:1408:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    {
            	    // InternalRPL.g:1408:4: ()
            	    // InternalRPL.g:1409:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionInnerFormulaAccess().getConjunctionInnerFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionInnerFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:1419:4: ( (lv_right_3_0= ruleConjunctionInnerFormula ) )
            	    // InternalRPL.g:1420:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    {
            	    // InternalRPL.g:1420:5: (lv_right_3_0= ruleConjunctionInnerFormula )
            	    // InternalRPL.g:1421:6: lv_right_3_0= ruleConjunctionInnerFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionInnerFormulaAccess().getRightConjunctionInnerFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // InternalRPL.g:1443:1: entryRulePrimaryInnerFormula returns [EObject current=null] : iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF ;
    public final EObject entryRulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInnerFormula = null;


        try {
            // InternalRPL.g:1443:60: (iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF )
            // InternalRPL.g:1444:2: iv_rulePrimaryInnerFormula= rulePrimaryInnerFormula EOF
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
    // InternalRPL.g:1450:1: rulePrimaryInnerFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryInnerFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_patternInst_1_0 = null;

        EObject lv_nestedFormula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1456:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) ) )
            // InternalRPL.g:1457:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            {
            // InternalRPL.g:1457:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) ) | (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 36:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==24) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==25||(LA27_4>=29 && LA27_4<=30)||LA27_4==37) ) {
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
                else if ( (LA27_2==EOF||(LA27_2>=RULE_DISJUNCTION && LA27_2<=RULE_CONJUNCTION)||LA27_2==27||LA27_2==30||LA27_2==37) ) {
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
                    // InternalRPL.g:1458:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:1458:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:1459:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:1459:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:1460:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:1478:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    {
                    // InternalRPL.g:1478:3: ( (lv_patternInst_1_0= ruleBasicRequirementPatternInstance ) )
                    // InternalRPL.g:1479:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    {
                    // InternalRPL.g:1479:4: (lv_patternInst_1_0= ruleBasicRequirementPatternInstance )
                    // InternalRPL.g:1480:5: lv_patternInst_1_0= ruleBasicRequirementPatternInstance
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
                    // InternalRPL.g:1498:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1498:3: (otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')' )
                    // InternalRPL.g:1499:4: otherlv_2= '(' ( (lv_nestedFormula_3_0= ruleInnerFormula ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryInnerFormulaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalRPL.g:1503:4: ( (lv_nestedFormula_3_0= ruleInnerFormula ) )
                    // InternalRPL.g:1504:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    {
                    // InternalRPL.g:1504:5: (lv_nestedFormula_3_0= ruleInnerFormula )
                    // InternalRPL.g:1505:6: lv_nestedFormula_3_0= ruleInnerFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryInnerFormulaAccess().getNestedFormulaInnerFormulaParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalRPL.g:1531:1: entryRuleNegationFormula returns [EObject current=null] : iv_ruleNegationFormula= ruleNegationFormula EOF ;
    public final EObject entryRuleNegationFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationFormula = null;


        try {
            // InternalRPL.g:1531:56: (iv_ruleNegationFormula= ruleNegationFormula EOF )
            // InternalRPL.g:1532:2: iv_ruleNegationFormula= ruleNegationFormula EOF
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
    // InternalRPL.g:1538:1: ruleNegationFormula returns [EObject current=null] : ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) ;
    public final EObject ruleNegationFormula() throws RecognitionException {
        EObject current = null;

        Token lv_neg_0_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:1544:2: ( ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) ) )
            // InternalRPL.g:1545:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            {
            // InternalRPL.g:1545:2: ( ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) ) )
            // InternalRPL.g:1546:3: ( (lv_neg_0_0= RULE_NEGATION ) )? ( (lv_right_1_0= ruleAtomicFormula ) )
            {
            // InternalRPL.g:1546:3: ( (lv_neg_0_0= RULE_NEGATION ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_NEGATION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRPL.g:1547:4: (lv_neg_0_0= RULE_NEGATION )
                    {
                    // InternalRPL.g:1547:4: (lv_neg_0_0= RULE_NEGATION )
                    // InternalRPL.g:1548:5: lv_neg_0_0= RULE_NEGATION
                    {
                    lv_neg_0_0=(Token)match(input,RULE_NEGATION,FOLLOW_28); 

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

            // InternalRPL.g:1564:3: ( (lv_right_1_0= ruleAtomicFormula ) )
            // InternalRPL.g:1565:4: (lv_right_1_0= ruleAtomicFormula )
            {
            // InternalRPL.g:1565:4: (lv_right_1_0= ruleAtomicFormula )
            // InternalRPL.g:1566:5: lv_right_1_0= ruleAtomicFormula
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
    // InternalRPL.g:1587:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // InternalRPL.g:1587:54: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // InternalRPL.g:1588:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
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
    // InternalRPL.g:1594:1: ruleAtomicFormula returns [EObject current=null] : ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) ;
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
            // InternalRPL.g:1600:2: ( ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) ) )
            // InternalRPL.g:1601:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            {
            // InternalRPL.g:1601:2: ( ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) ) | (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' ) | ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_LITERAL:
                {
                alt31=1;
                }
                break;
            case 36:
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
                    // InternalRPL.g:1602:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:1602:3: ( (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:1603:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:1603:4: (lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:1604:5: lv_boolLiteral_0_0= RULE_BOOLEAN_LITERAL
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
                    // InternalRPL.g:1621:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    {
                    // InternalRPL.g:1621:3: (otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')' )
                    // InternalRPL.g:1622:4: otherlv_1= 'frm' otherlv_2= '(' ( (lv_boolTerm_3_0= ruleTerm ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getAtomicFormulaAccess().getFrmKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalRPL.g:1630:4: ( (lv_boolTerm_3_0= ruleTerm ) )
                    // InternalRPL.g:1631:5: (lv_boolTerm_3_0= ruleTerm )
                    {
                    // InternalRPL.g:1631:5: (lv_boolTerm_3_0= ruleTerm )
                    // InternalRPL.g:1632:6: lv_boolTerm_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getAtomicFormulaAccess().getBoolTermTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_22);
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
                    // InternalRPL.g:1655:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    {
                    // InternalRPL.g:1655:3: ( ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? )
                    // InternalRPL.g:1656:4: ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    {
                    // InternalRPL.g:1656:4: ( (otherlv_5= RULE_ID ) )
                    // InternalRPL.g:1657:5: (otherlv_5= RULE_ID )
                    {
                    // InternalRPL.g:1657:5: (otherlv_5= RULE_ID )
                    // InternalRPL.g:1658:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicFormulaRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_5, grammarAccess.getAtomicFormulaAccess().getFmParamFormulaParameterCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalRPL.g:1669:4: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==24) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalRPL.g:1670:5: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_8); 

                            					newLeafNode(otherlv_6, grammarAccess.getAtomicFormulaAccess().getLeftParenthesisKeyword_2_1_0());
                            				
                            // InternalRPL.g:1674:5: ( (otherlv_7= RULE_ID ) )
                            // InternalRPL.g:1675:6: (otherlv_7= RULE_ID )
                            {
                            // InternalRPL.g:1675:6: (otherlv_7= RULE_ID )
                            // InternalRPL.g:1676:7: otherlv_7= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicFormulaRule());
                            							}
                            						
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); 

                            							newLeafNode(otherlv_7, grammarAccess.getAtomicFormulaAccess().getStatesUpdateStateVariableCrossReference_2_1_1_0());
                            						

                            }


                            }

                            // InternalRPL.g:1687:5: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==27) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // InternalRPL.g:1688:6: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                            	    {
                            	    otherlv_8=(Token)match(input,27,FOLLOW_8); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getAtomicFormulaAccess().getCommaKeyword_2_1_2_0());
                            	    					
                            	    // InternalRPL.g:1692:6: ( (otherlv_9= RULE_ID ) )
                            	    // InternalRPL.g:1693:7: (otherlv_9= RULE_ID )
                            	    {
                            	    // InternalRPL.g:1693:7: (otherlv_9= RULE_ID )
                            	    // InternalRPL.g:1694:8: otherlv_9= RULE_ID
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
    // InternalRPL.g:1716:1: entryRuleBasicRequirementPatternInstance returns [EObject current=null] : iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF ;
    public final EObject entryRuleBasicRequirementPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicRequirementPatternInstance = null;


        try {
            // InternalRPL.g:1716:72: (iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF )
            // InternalRPL.g:1717:2: iv_ruleBasicRequirementPatternInstance= ruleBasicRequirementPatternInstance EOF
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
    // InternalRPL.g:1723:1: ruleBasicRequirementPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) ;
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
            // InternalRPL.g:1729:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' ) )
            // InternalRPL.g:1730:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            {
            // InternalRPL.g:1730:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')' )
            // InternalRPL.g:1731:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )? (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )? (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )? otherlv_18= ')'
            {
            // InternalRPL.g:1731:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:1732:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:1732:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:1733:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getBasicRequirementPatternInstanceAccess().getPatternBasicRequirementPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicRequirementPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:1748:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRPL.g:1749:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleTerm ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicRequirementPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:1757:4: ( (lv_cParams_4_0= ruleTerm ) )
                    // InternalRPL.g:1758:5: (lv_cParams_4_0= ruleTerm )
                    {
                    // InternalRPL.g:1758:5: (lv_cParams_4_0= ruleTerm )
                    // InternalRPL.g:1759:6: lv_cParams_4_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalRPL.g:1776:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRPL.g:1777:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleTerm ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_25); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:1781:5: ( (lv_cParams_6_0= ruleTerm ) )
                    	    // InternalRPL.g:1782:6: (lv_cParams_6_0= ruleTerm )
                    	    {
                    	    // InternalRPL.g:1782:6: (lv_cParams_6_0= ruleTerm )
                    	    // InternalRPL.g:1783:7: lv_cParams_6_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getCParamsTermParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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

            // InternalRPL.g:1802:3: (otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRPL.g:1803:4: otherlv_7= 'formulas' otherlv_8= ':' ( (lv_fmParams_9_0= ruleFormulaParameterValue ) ) (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicRequirementPatternInstanceAccess().getFormulasKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:1811:4: ( (lv_fmParams_9_0= ruleFormulaParameterValue ) )
                    // InternalRPL.g:1812:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    {
                    // InternalRPL.g:1812:5: (lv_fmParams_9_0= ruleFormulaParameterValue )
                    // InternalRPL.g:1813:6: lv_fmParams_9_0= ruleFormulaParameterValue
                    {

                    						newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalRPL.g:1830:4: (otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRPL.g:1831:5: otherlv_10= ',' ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_26); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getBasicRequirementPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:1835:5: ( (lv_fmParams_11_0= ruleFormulaParameterValue ) )
                    	    // InternalRPL.g:1836:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    {
                    	    // InternalRPL.g:1836:6: (lv_fmParams_11_0= ruleFormulaParameterValue )
                    	    // InternalRPL.g:1837:7: lv_fmParams_11_0= ruleFormulaParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBasicRequirementPatternInstanceAccess().getFmParamsFormulaParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

            // InternalRPL.g:1856:3: (otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRPL.g:1857:4: otherlv_12= 'final' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinalKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1865:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRPL.g:1866:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRPL.g:1866:5: (otherlv_14= RULE_ID )
                    // InternalRPL.g:1867:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(otherlv_14, grammarAccess.getBasicRequirementPatternInstanceAccess().getFinStateUpdateStateVariableCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalRPL.g:1878:4: (otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==38) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalRPL.g:1879:5: otherlv_15= 'current' otherlv_16= ':' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_15=(Token)match(input,38,FOLLOW_11); 

                            					newLeafNode(otherlv_15, grammarAccess.getBasicRequirementPatternInstanceAccess().getCurrentKeyword_4_3_0());
                            				
                            otherlv_16=(Token)match(input,26,FOLLOW_8); 

                            					newLeafNode(otherlv_16, grammarAccess.getBasicRequirementPatternInstanceAccess().getColonKeyword_4_3_1());
                            				
                            // InternalRPL.g:1887:5: ( (otherlv_17= RULE_ID ) )
                            // InternalRPL.g:1888:6: (otherlv_17= RULE_ID )
                            {
                            // InternalRPL.g:1888:6: (otherlv_17= RULE_ID )
                            // InternalRPL.g:1889:7: otherlv_17= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicRequirementPatternInstanceRule());
                            							}
                            						
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_22); 

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
    // InternalRPL.g:1910:1: entryRuleFutureRequirementPattern returns [EObject current=null] : iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF ;
    public final EObject entryRuleFutureRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureRequirementPattern = null;


        try {
            // InternalRPL.g:1910:65: (iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF )
            // InternalRPL.g:1911:2: iv_ruleFutureRequirementPattern= ruleFutureRequirementPattern EOF
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
    // InternalRPL.g:1917:1: ruleFutureRequirementPattern returns [EObject current=null] : (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' ) ;
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
            // InternalRPL.g:1923:2: ( (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' ) )
            // InternalRPL.g:1924:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' )
            {
            // InternalRPL.g:1924:2: (otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';' )
            // InternalRPL.g:1925:3: otherlv_0= 'futurereq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lessas_17_0= ruleFutureLemmas ) )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureRequirementPatternAccess().getFuturereqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:1933:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:1934:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:1934:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:1935:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:1955:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRPL.g:1956:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:1964:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:1965:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:1965:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:1966:6: lv_cParams_6_0= ruleConstantParameter
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

                    // InternalRPL.g:1983:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==27) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRPL.g:1984:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:1988:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:1989:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:1989:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:1990:7: lv_cParams_8_0= ruleConstantParameter
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

            // InternalRPL.g:2009:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRPL.g:2010:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2018:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2019:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2019:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2020:6: lv_fmParams_11_0= ruleRegularFormulaParameter
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

                    // InternalRPL.g:2037:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRPL.g:2038:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2042:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2043:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2043:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2044:7: lv_fmParams_13_0= ruleRegularFormulaParameter
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

            otherlv_14=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getFutureRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getFutureRequirementPatternAccess().getWithKeyword_7());
            		
            // InternalRPL.g:2071:3: ( (otherlv_16= RULE_ID ) )
            // InternalRPL.g:2072:4: (otherlv_16= RULE_ID )
            {
            // InternalRPL.g:2072:4: (otherlv_16= RULE_ID )
            // InternalRPL.g:2073:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFutureRequirementPatternRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_16, grammarAccess.getFutureRequirementPatternAccess().getExtraInvPatternFutureExtraInvariantPatternCrossReference_8_0());
            				

            }


            }

            // InternalRPL.g:2084:3: ( (lv_lessas_17_0= ruleFutureLemmas ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRPL.g:2085:4: (lv_lessas_17_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2085:4: (lv_lessas_17_0= ruleFutureLemmas )
                    // InternalRPL.g:2086:5: lv_lessas_17_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureRequirementPatternAccess().getLessasFutureLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:2111:1: entryRulePastRequirementPattern returns [EObject current=null] : iv_rulePastRequirementPattern= rulePastRequirementPattern EOF ;
    public final EObject entryRulePastRequirementPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastRequirementPattern = null;


        try {
            // InternalRPL.g:2111:63: (iv_rulePastRequirementPattern= rulePastRequirementPattern EOF )
            // InternalRPL.g:2112:2: iv_rulePastRequirementPattern= rulePastRequirementPattern EOF
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
    // InternalRPL.g:2118:1: rulePastRequirementPattern returns [EObject current=null] : (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' ) ;
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
            // InternalRPL.g:2124:2: ( (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' ) )
            // InternalRPL.g:2125:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' )
            {
            // InternalRPL.g:2125:2: (otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';' )
            // InternalRPL.g:2126:3: otherlv_0= 'pastreq' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )? otherlv_14= ')' otherlv_15= 'with' ( (otherlv_16= RULE_ID ) ) ( (lv_lemmas_17_0= rulePastLemmas ) )? otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastRequirementPatternAccess().getPastreqKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastRequirementPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2134:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2135:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2135:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2136:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getPastRequirementPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2156:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRPL.g:2157:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastRequirementPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2165:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2166:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2166:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2167:6: lv_cParams_6_0= ruleConstantParameter
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

                    // InternalRPL.g:2184:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==27) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalRPL.g:2185:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2189:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2190:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2190:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2191:7: lv_cParams_8_0= ruleConstantParameter
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

            // InternalRPL.g:2210:3: (otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRPL.g:2211:4: otherlv_9= 'formulas' otherlv_10= ':' ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) ) (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastRequirementPatternAccess().getFormulasKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastRequirementPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2219:4: ( (lv_fmParams_11_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2220:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2220:5: (lv_fmParams_11_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2221:6: lv_fmParams_11_0= ruleRegularFormulaParameter
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

                    // InternalRPL.g:2238:4: (otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRPL.g:2239:5: otherlv_12= ',' ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastRequirementPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2243:5: ( (lv_fmParams_13_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2244:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2244:6: (lv_fmParams_13_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2245:7: lv_fmParams_13_0= ruleRegularFormulaParameter
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

            otherlv_14=(Token)match(input,30,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getPastRequirementPatternAccess().getRightParenthesisKeyword_6());
            		
            otherlv_15=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getPastRequirementPatternAccess().getWithKeyword_7());
            		
            // InternalRPL.g:2272:3: ( (otherlv_16= RULE_ID ) )
            // InternalRPL.g:2273:4: (otherlv_16= RULE_ID )
            {
            // InternalRPL.g:2273:4: (otherlv_16= RULE_ID )
            // InternalRPL.g:2274:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastRequirementPatternRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_16, grammarAccess.getPastRequirementPatternAccess().getExtraInvPatternPastExtraInvariantPatternCrossReference_8_0());
            				

            }


            }

            // InternalRPL.g:2285:3: ( (lv_lemmas_17_0= rulePastLemmas ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRPL.g:2286:4: (lv_lemmas_17_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2286:4: (lv_lemmas_17_0= rulePastLemmas )
                    // InternalRPL.g:2287:5: lv_lemmas_17_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastRequirementPatternAccess().getLemmasPastLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_18=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:2312:1: entryRuleFutureExtraInvariantPattern returns [EObject current=null] : iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF ;
    public final EObject entryRuleFutureExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2312:68: (iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF )
            // InternalRPL.g:2313:2: iv_ruleFutureExtraInvariantPattern= ruleFutureExtraInvariantPattern EOF
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
    // InternalRPL.g:2319:1: ruleFutureExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' ) ;
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
            // InternalRPL.g:2325:2: ( (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' ) )
            // InternalRPL.g:2326:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' )
            {
            // InternalRPL.g:2326:2: (otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';' )
            // InternalRPL.g:2327:3: otherlv_0= 'futureeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= ruleFutureLemmas ) )? otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFutureExtraInvariantPatternAccess().getFutureeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFutureExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2335:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2336:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2336:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2337:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getFutureExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2357:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRPL.g:2358:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getFutureExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2366:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2367:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2367:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2368:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
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

                    // InternalRPL.g:2385:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==27) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalRPL.g:2386:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2390:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2391:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2391:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2392:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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

            // InternalRPL.g:2411:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRPL.g:2412:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getFutureExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2420:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2421:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2421:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2422:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:2439:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==27) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRPL.g:2440:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2444:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2445:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2445:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2446:7: lv_fnParams_13_0= ruleFunctionalParameter
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

            // InternalRPL.g:2465:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRPL.g:2466:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getFutureExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getFutureExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2474:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2475:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2475:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2476:6: lv_fmParams_16_0= ruleRegularFormulaParameter
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

                    // InternalRPL.g:2493:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==27) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalRPL.g:2494:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getFutureExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2498:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2499:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2499:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2500:7: lv_fmParams_18_0= ruleRegularFormulaParameter
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

            otherlv_19=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getFutureExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2523:3: ( (lv_lemmas_20_0= ruleFutureLemmas ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==52) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRPL.g:2524:4: (lv_lemmas_20_0= ruleFutureLemmas )
                    {
                    // InternalRPL.g:2524:4: (lv_lemmas_20_0= ruleFutureLemmas )
                    // InternalRPL.g:2525:5: lv_lemmas_20_0= ruleFutureLemmas
                    {

                    					newCompositeNode(grammarAccess.getFutureExtraInvariantPatternAccess().getLemmasFutureLemmasParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:2550:1: entryRulePastExtraInvariantPattern returns [EObject current=null] : iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF ;
    public final EObject entryRulePastExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2550:66: (iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF )
            // InternalRPL.g:2551:2: iv_rulePastExtraInvariantPattern= rulePastExtraInvariantPattern EOF
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
    // InternalRPL.g:2557:1: rulePastExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' ) ;
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
            // InternalRPL.g:2563:2: ( (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' ) )
            // InternalRPL.g:2564:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' )
            {
            // InternalRPL.g:2564:2: (otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';' )
            // InternalRPL.g:2565:3: otherlv_0= 'pasteinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )? otherlv_19= ')' ( (lv_lemmas_20_0= rulePastLemmas ) )? otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternAccess().getPasteinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2573:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2574:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2574:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2575:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2595:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRPL.g:2596:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getPastExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2604:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2605:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2605:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2606:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
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

                    // InternalRPL.g:2623:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==27) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalRPL.g:2624:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2628:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2629:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2629:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2630:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2649:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==42) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRPL.g:2650:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPastExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2658:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2659:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2659:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2660:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:2677:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==27) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalRPL.g:2678:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2682:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2683:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2683:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2684:7: lv_fnParams_13_0= ruleFunctionalParameter
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2703:3: (otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==29) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRPL.g:2704:4: otherlv_14= 'formulas' otherlv_15= ':' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getPastExtraInvariantPatternAccess().getFormulasKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternAccess().getColonKeyword_6_1());
                    			
                    // InternalRPL.g:2712:4: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:2713:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:2713:5: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:2714:6: lv_fmParams_16_0= ruleRegularFormulaParameter
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

                    // InternalRPL.g:2731:4: (otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==27) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalRPL.g:2732:5: otherlv_17= ',' ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRPL.g:2736:5: ( (lv_fmParams_18_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:2737:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2737:6: (lv_fmParams_18_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:2738:7: lv_fmParams_18_0= ruleRegularFormulaParameter
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getPastExtraInvariantPatternAccess().getRightParenthesisKeyword_7());
            		
            // InternalRPL.g:2761:3: ( (lv_lemmas_20_0= rulePastLemmas ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRPL.g:2762:4: (lv_lemmas_20_0= rulePastLemmas )
                    {
                    // InternalRPL.g:2762:4: (lv_lemmas_20_0= rulePastLemmas )
                    // InternalRPL.g:2763:5: lv_lemmas_20_0= rulePastLemmas
                    {

                    					newCompositeNode(grammarAccess.getPastExtraInvariantPatternAccess().getLemmasPastLemmasParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:2788:1: entryRuleDerivedExtraInvariantPattern returns [EObject current=null] : iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF ;
    public final EObject entryRuleDerivedExtraInvariantPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedExtraInvariantPattern = null;


        try {
            // InternalRPL.g:2788:69: (iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF )
            // InternalRPL.g:2789:2: iv_ruleDerivedExtraInvariantPattern= ruleDerivedExtraInvariantPattern EOF
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
    // InternalRPL.g:2795:1: ruleDerivedExtraInvariantPattern returns [EObject current=null] : (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' ) ;
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
            // InternalRPL.g:2801:2: ( (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' ) )
            // InternalRPL.g:2802:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' )
            {
            // InternalRPL.g:2802:2: (otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';' )
            // InternalRPL.g:2803:3: otherlv_0= 'derivedeinv' otherlv_1= 'pattern' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )? (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )? (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )? (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )? otherlv_25= ')' ( (lv_lemmas_26_0= ruleDerivedLemmas ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivedExtraInvariantPatternAccess().getDerivedeinvKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDerivedExtraInvariantPatternAccess().getPatternKeyword_1());
            		
            // InternalRPL.g:2811:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:2812:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:2812:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:2813:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,24,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivedExtraInvariantPatternAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRPL.g:2833:3: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==25) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRPL.g:2834:4: otherlv_4= 'const' otherlv_5= ':' ( (lv_cParams_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDerivedExtraInvariantPatternAccess().getConstKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:2842:4: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    // InternalRPL.g:2843:5: (lv_cParams_6_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:2843:5: (lv_cParams_6_0= ruleConstantParameter )
                    // InternalRPL.g:2844:6: lv_cParams_6_0= ruleConstantParameter
                    {

                    						newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalRPL.g:2861:4: (otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==27) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalRPL.g:2862:5: otherlv_7= ',' ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:2866:5: ( (lv_cParams_8_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:2867:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:2867:6: (lv_cParams_8_0= ruleConstantParameter )
                    	    // InternalRPL.g:2868:7: lv_cParams_8_0= ruleConstantParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getCParamsConstantParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2887:3: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==42) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRPL.g:2888:4: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getDerivedExtraInvariantPatternAccess().getFunKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_5_1());
                    			
                    // InternalRPL.g:2896:4: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:2897:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:2897:5: (lv_fnParams_11_0= ruleFunctionalParameter )
                    // InternalRPL.g:2898:6: lv_fnParams_11_0= ruleFunctionalParameter
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

                    // InternalRPL.g:2915:4: (otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==27) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalRPL.g:2916:5: otherlv_12= ',' ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRPL.g:2920:5: ( (lv_fnParams_13_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:2921:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:2921:6: (lv_fnParams_13_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:2922:7: lv_fnParams_13_0= ruleFunctionalParameter
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2941:3: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==28) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRPL.g:2942:4: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_6_1());
                    			
                    otherlv_16=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_6_2());
                    			
                    // InternalRPL.g:2954:4: ( (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter ) )
                    // InternalRPL.g:2955:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    {
                    // InternalRPL.g:2955:5: (lv_simpleFmParams_17_0= ruleSimpleFormulaParameter )
                    // InternalRPL.g:2956:6: lv_simpleFmParams_17_0= ruleSimpleFormulaParameter
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

                    // InternalRPL.g:2973:4: (otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==27) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalRPL.g:2974:5: otherlv_18= ',' ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) )
                    	    {
                    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_6_4_0());
                    	    				
                    	    // InternalRPL.g:2978:5: ( (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter ) )
                    	    // InternalRPL.g:2979:6: (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter )
                    	    {
                    	    // InternalRPL.g:2979:6: (lv_simpleFmParams_19_0= ruleSimpleFormulaParameter )
                    	    // InternalRPL.g:2980:7: lv_simpleFmParams_19_0= ruleSimpleFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getSimpleFmParamsSimpleFormulaParameterParserRuleCall_6_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:2999:3: (otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==29) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRPL.g:3000:4: otherlv_20= 'formulas' otherlv_21= ':' ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) ) (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getDerivedExtraInvariantPatternAccess().getFormulasKeyword_7_0());
                    			
                    otherlv_21=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getDerivedExtraInvariantPatternAccess().getColonKeyword_7_1());
                    			
                    // InternalRPL.g:3008:4: ( (lv_fmParams_22_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:3009:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:3009:5: (lv_fmParams_22_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:3010:6: lv_fmParams_22_0= ruleRegularFormulaParameter
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

                    // InternalRPL.g:3027:4: (otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==27) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalRPL.g:3028:5: otherlv_23= ',' ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_23=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getDerivedExtraInvariantPatternAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRPL.g:3032:5: ( (lv_fmParams_24_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:3033:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:3033:6: (lv_fmParams_24_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:3034:7: lv_fmParams_24_0= ruleRegularFormulaParameter
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_25, grammarAccess.getDerivedExtraInvariantPatternAccess().getRightParenthesisKeyword_8());
            		
            // InternalRPL.g:3057:3: ( (lv_lemmas_26_0= ruleDerivedLemmas ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==52) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRPL.g:3058:4: (lv_lemmas_26_0= ruleDerivedLemmas )
                    {
                    // InternalRPL.g:3058:4: (lv_lemmas_26_0= ruleDerivedLemmas )
                    // InternalRPL.g:3059:5: lv_lemmas_26_0= ruleDerivedLemmas
                    {

                    					newCompositeNode(grammarAccess.getDerivedExtraInvariantPatternAccess().getLemmasDerivedLemmasParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_6);
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

            otherlv_27=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:3084:1: entryRuleDir returns [String current=null] : iv_ruleDir= ruleDir EOF ;
    public final String entryRuleDir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDir = null;


        try {
            // InternalRPL.g:3084:43: (iv_ruleDir= ruleDir EOF )
            // InternalRPL.g:3085:2: iv_ruleDir= ruleDir EOF
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
    // InternalRPL.g:3091:1: ruleDir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleDir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRPL.g:3097:2: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' ) )
            // InternalRPL.g:3098:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            {
            // InternalRPL.g:3098:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt71=1;
                }
                break;
            case 35:
                {
                alt71=2;
                }
                break;
            case 45:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalRPL.g:3099:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getDirAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRPL.g:3107:3: kw= '.'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirAccess().getFullStopKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRPL.g:3113:3: kw= '..'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalRPL.g:3122:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalRPL.g:3122:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalRPL.g:3123:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalRPL.g:3129:1: ruleTerm returns [EObject current=null] : (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3135:2: ( (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* ) )
            // InternalRPL.g:3136:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            {
            // InternalRPL.g:3136:2: (this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )* )
            // InternalRPL.g:3137:3: this_ConjunctionTerm_0= ruleConjunctionTerm ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getConjunctionTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ConjunctionTerm_0=ruleConjunctionTerm();

            state._fsp--;


            			current = this_ConjunctionTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3145:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_DISJUNCTION) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalRPL.g:3146:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalRPL.g:3146:4: ()
            	    // InternalRPL.g:3147:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_25); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getTermAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3157:4: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalRPL.g:3158:5: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalRPL.g:3158:5: (lv_right_3_0= ruleTerm )
            	    // InternalRPL.g:3159:6: lv_right_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleConjunctionTerm"
    // InternalRPL.g:3181:1: entryRuleConjunctionTerm returns [EObject current=null] : iv_ruleConjunctionTerm= ruleConjunctionTerm EOF ;
    public final EObject entryRuleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionTerm = null;


        try {
            // InternalRPL.g:3181:56: (iv_ruleConjunctionTerm= ruleConjunctionTerm EOF )
            // InternalRPL.g:3182:2: iv_ruleConjunctionTerm= ruleConjunctionTerm EOF
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
    // InternalRPL.g:3188:1: ruleConjunctionTerm returns [EObject current=null] : (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) ;
    public final EObject ruleConjunctionTerm() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_NegationTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3194:2: ( (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* ) )
            // InternalRPL.g:3195:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            {
            // InternalRPL.g:3195:2: (this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )* )
            // InternalRPL.g:3196:3: this_NegationTerm_0= ruleNegationTerm ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionTermAccess().getNegationTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_NegationTerm_0=ruleNegationTerm();

            state._fsp--;


            			current = this_NegationTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3204:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_CONJUNCTION) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalRPL.g:3205:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    {
            	    // InternalRPL.g:3205:4: ()
            	    // InternalRPL.g:3206:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionTermAccess().getConjunctionTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_25); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionTermAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3216:4: ( (lv_right_3_0= ruleConjunctionTerm ) )
            	    // InternalRPL.g:3217:5: (lv_right_3_0= ruleConjunctionTerm )
            	    {
            	    // InternalRPL.g:3217:5: (lv_right_3_0= ruleConjunctionTerm )
            	    // InternalRPL.g:3218:6: lv_right_3_0= ruleConjunctionTerm
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionTermAccess().getRightConjunctionTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleConjunctionTerm"


    // $ANTLR start "entryRuleNegationTerm"
    // InternalRPL.g:3240:1: entryRuleNegationTerm returns [EObject current=null] : iv_ruleNegationTerm= ruleNegationTerm EOF ;
    public final EObject entryRuleNegationTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegationTerm = null;


        try {
            // InternalRPL.g:3240:53: (iv_ruleNegationTerm= ruleNegationTerm EOF )
            // InternalRPL.g:3241:2: iv_ruleNegationTerm= ruleNegationTerm EOF
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
    // InternalRPL.g:3247:1: ruleNegationTerm returns [EObject current=null] : (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) ;
    public final EObject ruleNegationTerm() throws RecognitionException {
        EObject current = null;

        Token this_NEGATION_1=null;
        EObject this_EqTerm_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3253:2: ( (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) ) )
            // InternalRPL.g:3254:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            {
            // InternalRPL.g:3254:2: (this_EqTerm_0= ruleEqTerm | (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_INTEGER)||LA74_0==RULE_BOOLEAN_LITERAL||LA74_0==RULE_REAL||LA74_0==24||LA74_0==48) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_NEGATION) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalRPL.g:3255:3: this_EqTerm_0= ruleEqTerm
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
                    // InternalRPL.g:3264:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    {
                    // InternalRPL.g:3264:3: (this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) ) )
                    // InternalRPL.g:3265:4: this_NEGATION_1= RULE_NEGATION ( (lv_right_2_0= ruleEqTerm ) )
                    {
                    this_NEGATION_1=(Token)match(input,RULE_NEGATION,FOLLOW_39); 

                    				newLeafNode(this_NEGATION_1, grammarAccess.getNegationTermAccess().getNEGATIONTerminalRuleCall_1_0());
                    			
                    // InternalRPL.g:3269:4: ( (lv_right_2_0= ruleEqTerm ) )
                    // InternalRPL.g:3270:5: (lv_right_2_0= ruleEqTerm )
                    {
                    // InternalRPL.g:3270:5: (lv_right_2_0= ruleEqTerm )
                    // InternalRPL.g:3271:6: lv_right_2_0= ruleEqTerm
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
    // InternalRPL.g:3293:1: entryRuleEqTerm returns [EObject current=null] : iv_ruleEqTerm= ruleEqTerm EOF ;
    public final EObject entryRuleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqTerm = null;


        try {
            // InternalRPL.g:3293:47: (iv_ruleEqTerm= ruleEqTerm EOF )
            // InternalRPL.g:3294:2: iv_ruleEqTerm= ruleEqTerm EOF
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
    // InternalRPL.g:3300:1: ruleEqTerm returns [EObject current=null] : (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) ;
    public final EObject ruleEqTerm() throws RecognitionException {
        EObject current = null;

        EObject this_CompareTerm_0 = null;

        Enumerator lv_eqPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3306:2: ( (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* ) )
            // InternalRPL.g:3307:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            {
            // InternalRPL.g:3307:2: (this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )* )
            // InternalRPL.g:3308:3: this_CompareTerm_0= ruleCompareTerm ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqTermAccess().getCompareTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_CompareTerm_0=ruleCompareTerm();

            state._fsp--;


            			current = this_CompareTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3316:3: ( () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==31) ) {
                    alt75=1;
                }
                else if ( (LA75_0==69) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalRPL.g:3317:4: () ( (lv_eqPred_2_0= ruleEqPredicate ) ) ( (lv_right_3_0= ruleEqTerm ) )
            	    {
            	    // InternalRPL.g:3317:4: ()
            	    // InternalRPL.g:3318:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqTermAccess().getEqTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3324:4: ( (lv_eqPred_2_0= ruleEqPredicate ) )
            	    // InternalRPL.g:3325:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    {
            	    // InternalRPL.g:3325:5: (lv_eqPred_2_0= ruleEqPredicate )
            	    // InternalRPL.g:3326:6: lv_eqPred_2_0= ruleEqPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getEqPredEqPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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

            	    // InternalRPL.g:3343:4: ( (lv_right_3_0= ruleEqTerm ) )
            	    // InternalRPL.g:3344:5: (lv_right_3_0= ruleEqTerm )
            	    {
            	    // InternalRPL.g:3344:5: (lv_right_3_0= ruleEqTerm )
            	    // InternalRPL.g:3345:6: lv_right_3_0= ruleEqTerm
            	    {

            	    						newCompositeNode(grammarAccess.getEqTermAccess().getRightEqTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
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
            	    break loop75;
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
    // InternalRPL.g:3367:1: entryRuleCompareTerm returns [EObject current=null] : iv_ruleCompareTerm= ruleCompareTerm EOF ;
    public final EObject entryRuleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareTerm = null;


        try {
            // InternalRPL.g:3367:52: (iv_ruleCompareTerm= ruleCompareTerm EOF )
            // InternalRPL.g:3368:2: iv_ruleCompareTerm= ruleCompareTerm EOF
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
    // InternalRPL.g:3374:1: ruleCompareTerm returns [EObject current=null] : (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) ;
    public final EObject ruleCompareTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AddTerm_0 = null;

        Enumerator lv_compPred_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3380:2: ( (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* ) )
            // InternalRPL.g:3381:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            {
            // InternalRPL.g:3381:2: (this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )* )
            // InternalRPL.g:3382:3: this_AddTerm_0= ruleAddTerm ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareTermAccess().getAddTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_AddTerm_0=ruleAddTerm();

            state._fsp--;


            			current = this_AddTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3390:3: ( () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) ) )*
            loop76:
            do {
                int alt76=2;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    alt76=1;
                    }
                    break;
                case 71:
                    {
                    alt76=1;
                    }
                    break;
                case 72:
                    {
                    alt76=1;
                    }
                    break;
                case 73:
                    {
                    alt76=1;
                    }
                    break;

                }

                switch (alt76) {
            	case 1 :
            	    // InternalRPL.g:3391:4: () ( (lv_compPred_2_0= ruleCompPredicate ) ) ( (lv_right_3_0= ruleCompareTerm ) )
            	    {
            	    // InternalRPL.g:3391:4: ()
            	    // InternalRPL.g:3392:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareTermAccess().getCompareTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3398:4: ( (lv_compPred_2_0= ruleCompPredicate ) )
            	    // InternalRPL.g:3399:5: (lv_compPred_2_0= ruleCompPredicate )
            	    {
            	    // InternalRPL.g:3399:5: (lv_compPred_2_0= ruleCompPredicate )
            	    // InternalRPL.g:3400:6: lv_compPred_2_0= ruleCompPredicate
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getCompPredCompPredicateEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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

            	    // InternalRPL.g:3417:4: ( (lv_right_3_0= ruleCompareTerm ) )
            	    // InternalRPL.g:3418:5: (lv_right_3_0= ruleCompareTerm )
            	    {
            	    // InternalRPL.g:3418:5: (lv_right_3_0= ruleCompareTerm )
            	    // InternalRPL.g:3419:6: lv_right_3_0= ruleCompareTerm
            	    {

            	    						newCompositeNode(grammarAccess.getCompareTermAccess().getRightCompareTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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
    // $ANTLR end "ruleCompareTerm"


    // $ANTLR start "entryRuleAddTerm"
    // InternalRPL.g:3441:1: entryRuleAddTerm returns [EObject current=null] : iv_ruleAddTerm= ruleAddTerm EOF ;
    public final EObject entryRuleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTerm = null;


        try {
            // InternalRPL.g:3441:48: (iv_ruleAddTerm= ruleAddTerm EOF )
            // InternalRPL.g:3442:2: iv_ruleAddTerm= ruleAddTerm EOF
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
    // InternalRPL.g:3448:1: ruleAddTerm returns [EObject current=null] : (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) ;
    public final EObject ruleAddTerm() throws RecognitionException {
        EObject current = null;

        EObject this_MulTerm_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3454:2: ( (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* ) )
            // InternalRPL.g:3455:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            {
            // InternalRPL.g:3455:2: (this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )* )
            // InternalRPL.g:3456:3: this_MulTerm_0= ruleMulTerm ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddTermAccess().getMulTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_MulTerm_0=ruleMulTerm();

            state._fsp--;


            			current = this_MulTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3464:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==74) ) {
                    alt77=1;
                }
                else if ( (LA77_0==48) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalRPL.g:3465:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleAddTerm ) )
            	    {
            	    // InternalRPL.g:3465:4: ()
            	    // InternalRPL.g:3466:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddTermAccess().getAddTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3472:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalRPL.g:3473:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalRPL.g:3473:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalRPL.g:3474:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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

            	    // InternalRPL.g:3491:4: ( (lv_right_3_0= ruleAddTerm ) )
            	    // InternalRPL.g:3492:5: (lv_right_3_0= ruleAddTerm )
            	    {
            	    // InternalRPL.g:3492:5: (lv_right_3_0= ruleAddTerm )
            	    // InternalRPL.g:3493:6: lv_right_3_0= ruleAddTerm
            	    {

            	    						newCompositeNode(grammarAccess.getAddTermAccess().getRightAddTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
    // $ANTLR end "ruleAddTerm"


    // $ANTLR start "entryRuleMulTerm"
    // InternalRPL.g:3515:1: entryRuleMulTerm returns [EObject current=null] : iv_ruleMulTerm= ruleMulTerm EOF ;
    public final EObject entryRuleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulTerm = null;


        try {
            // InternalRPL.g:3515:48: (iv_ruleMulTerm= ruleMulTerm EOF )
            // InternalRPL.g:3516:2: iv_ruleMulTerm= ruleMulTerm EOF
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
    // InternalRPL.g:3522:1: ruleMulTerm returns [EObject current=null] : (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) ;
    public final EObject ruleMulTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PowerTerm_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3528:2: ( (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* ) )
            // InternalRPL.g:3529:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            {
            // InternalRPL.g:3529:2: (this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )* )
            // InternalRPL.g:3530:3: this_PowerTerm_0= rulePowerTerm ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulTermAccess().getPowerTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_PowerTerm_0=rulePowerTerm();

            state._fsp--;


            			current = this_PowerTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3538:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) ) )*
            loop78:
            do {
                int alt78=2;
                switch ( input.LA(1) ) {
                case 75:
                    {
                    alt78=1;
                    }
                    break;
                case 76:
                    {
                    alt78=1;
                    }
                    break;
                case 77:
                    {
                    alt78=1;
                    }
                    break;

                }

                switch (alt78) {
            	case 1 :
            	    // InternalRPL.g:3539:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= ruleMulTerm ) )
            	    {
            	    // InternalRPL.g:3539:4: ()
            	    // InternalRPL.g:3540:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulTermAccess().getMulTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalRPL.g:3546:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalRPL.g:3547:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalRPL.g:3547:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalRPL.g:3548:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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

            	    // InternalRPL.g:3565:4: ( (lv_right_3_0= ruleMulTerm ) )
            	    // InternalRPL.g:3566:5: (lv_right_3_0= ruleMulTerm )
            	    {
            	    // InternalRPL.g:3566:5: (lv_right_3_0= ruleMulTerm )
            	    // InternalRPL.g:3567:6: lv_right_3_0= ruleMulTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMulTermAccess().getRightMulTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleMulTerm"


    // $ANTLR start "entryRulePowerTerm"
    // InternalRPL.g:3589:1: entryRulePowerTerm returns [EObject current=null] : iv_rulePowerTerm= rulePowerTerm EOF ;
    public final EObject entryRulePowerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerTerm = null;


        try {
            // InternalRPL.g:3589:50: (iv_rulePowerTerm= rulePowerTerm EOF )
            // InternalRPL.g:3590:2: iv_rulePowerTerm= rulePowerTerm EOF
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
    // InternalRPL.g:3596:1: rulePowerTerm returns [EObject current=null] : (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) ;
    public final EObject rulePowerTerm() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryTerm_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3602:2: ( (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* ) )
            // InternalRPL.g:3603:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            {
            // InternalRPL.g:3603:2: (this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )* )
            // InternalRPL.g:3604:3: this_UnaryTerm_0= ruleUnaryTerm ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerTermAccess().getUnaryTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_UnaryTerm_0=ruleUnaryTerm();

            state._fsp--;


            			current = this_UnaryTerm_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:3612:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_POWER_OPERATOR) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalRPL.g:3613:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= rulePowerTerm ) )
            	    {
            	    // InternalRPL.g:3613:4: ()
            	    // InternalRPL.g:3614:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerTermAccess().getPowerTermLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_39); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerTermAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:3624:4: ( (lv_right_3_0= rulePowerTerm ) )
            	    // InternalRPL.g:3625:5: (lv_right_3_0= rulePowerTerm )
            	    {
            	    // InternalRPL.g:3625:5: (lv_right_3_0= rulePowerTerm )
            	    // InternalRPL.g:3626:6: lv_right_3_0= rulePowerTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPowerTermAccess().getRightPowerTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
    // $ANTLR end "rulePowerTerm"


    // $ANTLR start "entryRuleUnaryTerm"
    // InternalRPL.g:3648:1: entryRuleUnaryTerm returns [EObject current=null] : iv_ruleUnaryTerm= ruleUnaryTerm EOF ;
    public final EObject entryRuleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTerm = null;


        try {
            // InternalRPL.g:3648:50: (iv_ruleUnaryTerm= ruleUnaryTerm EOF )
            // InternalRPL.g:3649:2: iv_ruleUnaryTerm= ruleUnaryTerm EOF
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
    // InternalRPL.g:3655:1: ruleUnaryTerm returns [EObject current=null] : (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) ;
    public final EObject ruleUnaryTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryTerm_0 = null;

        Enumerator lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3661:2: ( (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) ) )
            // InternalRPL.g:3662:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            {
            // InternalRPL.g:3662:2: (this_PrimaryTerm_0= rulePrimaryTerm | ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==48) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case RULE_BOOLEAN_LITERAL:
                case 24:
                case 48:
                    {
                    alt80=2;
                    }
                    break;
                case RULE_INTEGER:
                    {
                    alt80=1;
                    }
                    break;
                case RULE_REAL:
                    {
                    alt80=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA80_0>=RULE_ID && LA80_0<=RULE_INTEGER)||LA80_0==RULE_BOOLEAN_LITERAL||LA80_0==RULE_REAL||LA80_0==24) ) {
                alt80=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalRPL.g:3663:3: this_PrimaryTerm_0= rulePrimaryTerm
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
                    // InternalRPL.g:3672:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    {
                    // InternalRPL.g:3672:3: ( ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) ) )
                    // InternalRPL.g:3673:4: ( (lv_unOp_1_0= ruleUnMinus ) ) ( (lv_right_2_0= rulePrimaryTerm ) )
                    {
                    // InternalRPL.g:3673:4: ( (lv_unOp_1_0= ruleUnMinus ) )
                    // InternalRPL.g:3674:5: (lv_unOp_1_0= ruleUnMinus )
                    {
                    // InternalRPL.g:3674:5: (lv_unOp_1_0= ruleUnMinus )
                    // InternalRPL.g:3675:6: lv_unOp_1_0= ruleUnMinus
                    {

                    						newCompositeNode(grammarAccess.getUnaryTermAccess().getUnOpUnMinusEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    // InternalRPL.g:3692:4: ( (lv_right_2_0= rulePrimaryTerm ) )
                    // InternalRPL.g:3693:5: (lv_right_2_0= rulePrimaryTerm )
                    {
                    // InternalRPL.g:3693:5: (lv_right_2_0= rulePrimaryTerm )
                    // InternalRPL.g:3694:6: lv_right_2_0= rulePrimaryTerm
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
    // InternalRPL.g:3716:1: entryRulePrimaryTerm returns [EObject current=null] : iv_rulePrimaryTerm= rulePrimaryTerm EOF ;
    public final EObject entryRulePrimaryTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryTerm = null;


        try {
            // InternalRPL.g:3716:52: (iv_rulePrimaryTerm= rulePrimaryTerm EOF )
            // InternalRPL.g:3717:2: iv_rulePrimaryTerm= rulePrimaryTerm EOF
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
    // InternalRPL.g:3723:1: rulePrimaryTerm returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) ;
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
            // InternalRPL.g:3729:2: ( ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) ) )
            // InternalRPL.g:3730:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            {
            // InternalRPL.g:3730:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' ) | ( (lv_funApp_6_0= ruleFunApplication ) ) | (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
            case RULE_REAL:
            case 48:
                {
                alt81=1;
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
                case 30:
                case 31:
                case 37:
                case 48:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                    {
                    alt81=2;
                    }
                    break;
                case 46:
                    {
                    alt81=3;
                    }
                    break;
                case 24:
                    {
                    alt81=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }

                }
                break;
            case 24:
                {
                alt81=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalRPL.g:3731:3: ( (lv_const_0_0= ruleConstant ) )
                    {
                    // InternalRPL.g:3731:3: ( (lv_const_0_0= ruleConstant ) )
                    // InternalRPL.g:3732:4: (lv_const_0_0= ruleConstant )
                    {
                    // InternalRPL.g:3732:4: (lv_const_0_0= ruleConstant )
                    // InternalRPL.g:3733:5: lv_const_0_0= ruleConstant
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
                    // InternalRPL.g:3751:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalRPL.g:3751:3: ( (otherlv_1= RULE_ID ) )
                    // InternalRPL.g:3752:4: (otherlv_1= RULE_ID )
                    {
                    // InternalRPL.g:3752:4: (otherlv_1= RULE_ID )
                    // InternalRPL.g:3753:5: otherlv_1= RULE_ID
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
                    // InternalRPL.g:3765:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    {
                    // InternalRPL.g:3765:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']' )
                    // InternalRPL.g:3766:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '[' ( (otherlv_4= RULE_ID ) ) otherlv_5= ']'
                    {
                    // InternalRPL.g:3766:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRPL.g:3767:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRPL.g:3767:5: (otherlv_2= RULE_ID )
                    // InternalRPL.g:3768:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_2, grammarAccess.getPrimaryTermAccess().getStateUpdateStateVariableCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,46,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTermAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalRPL.g:3783:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRPL.g:3784:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRPL.g:3784:5: (otherlv_4= RULE_ID )
                    // InternalRPL.g:3785:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryTermRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_4, grammarAccess.getPrimaryTermAccess().getVariableProgramVariableCrossReference_2_2_0());
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryTermAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:3802:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    {
                    // InternalRPL.g:3802:3: ( (lv_funApp_6_0= ruleFunApplication ) )
                    // InternalRPL.g:3803:4: (lv_funApp_6_0= ruleFunApplication )
                    {
                    // InternalRPL.g:3803:4: (lv_funApp_6_0= ruleFunApplication )
                    // InternalRPL.g:3804:5: lv_funApp_6_0= ruleFunApplication
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
                    // InternalRPL.g:3822:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    {
                    // InternalRPL.g:3822:3: (otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')' )
                    // InternalRPL.g:3823:4: otherlv_7= '(' ( (lv_nestedTerm_8_0= ruleTerm ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryTermAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalRPL.g:3827:4: ( (lv_nestedTerm_8_0= ruleTerm ) )
                    // InternalRPL.g:3828:5: (lv_nestedTerm_8_0= ruleTerm )
                    {
                    // InternalRPL.g:3828:5: (lv_nestedTerm_8_0= ruleTerm )
                    // InternalRPL.g:3829:6: lv_nestedTerm_8_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getPrimaryTermAccess().getNestedTermTermParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalRPL.g:3855:1: entryRuleFunApplication returns [EObject current=null] : iv_ruleFunApplication= ruleFunApplication EOF ;
    public final EObject entryRuleFunApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunApplication = null;


        try {
            // InternalRPL.g:3855:55: (iv_ruleFunApplication= ruleFunApplication EOF )
            // InternalRPL.g:3856:2: iv_ruleFunApplication= ruleFunApplication EOF
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
    // InternalRPL.g:3862:1: ruleFunApplication returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleFunApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRPL.g:3868:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalRPL.g:3869:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalRPL.g:3869:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalRPL.g:3870:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            // InternalRPL.g:3870:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:3871:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:3871:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:3872:5: otherlv_0= RULE_ID
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
            		
            // InternalRPL.g:3887:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:3888:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:3888:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:3889:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunApplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

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
    // InternalRPL.g:3908:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalRPL.g:3908:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalRPL.g:3909:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalRPL.g:3915:1: ruleConstant returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_bool_1_0=null;
        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:3921:2: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalRPL.g:3922:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalRPL.g:3922:2: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_INTEGER||LA82_0==RULE_REAL||LA82_0==48) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_BOOLEAN_LITERAL) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalRPL.g:3923:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // InternalRPL.g:3923:3: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // InternalRPL.g:3924:4: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // InternalRPL.g:3924:4: (lv_num_0_0= ruleNumericLiteral )
                    // InternalRPL.g:3925:5: lv_num_0_0= ruleNumericLiteral
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
                    // InternalRPL.g:3943:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    {
                    // InternalRPL.g:3943:3: ( (lv_bool_1_0= RULE_BOOLEAN_LITERAL ) )
                    // InternalRPL.g:3944:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalRPL.g:3944:4: (lv_bool_1_0= RULE_BOOLEAN_LITERAL )
                    // InternalRPL.g:3945:5: lv_bool_1_0= RULE_BOOLEAN_LITERAL
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
    // InternalRPL.g:3965:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalRPL.g:3965:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalRPL.g:3966:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalRPL.g:3972:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalRPL.g:3978:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalRPL.g:3979:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalRPL.g:3979:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt83=2;
            switch ( input.LA(1) ) {
            case 48:
                {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==RULE_REAL) ) {
                    alt83=2;
                }
                else if ( (LA83_1==RULE_INTEGER) ) {
                    alt83=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                alt83=1;
                }
                break;
            case RULE_REAL:
                {
                alt83=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalRPL.g:3980:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalRPL.g:3989:3: this_RealLiteral_1= ruleRealLiteral
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
    // InternalRPL.g:4001:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalRPL.g:4001:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalRPL.g:4002:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalRPL.g:4008:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4014:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalRPL.g:4015:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalRPL.g:4015:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalRPL.g:4016:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalRPL.g:4016:3: ( (lv_sig_0_0= '-' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==48) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalRPL.g:4017:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4017:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4018:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,48,FOLLOW_21); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getIntegerLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4030:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalRPL.g:4031:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalRPL.g:4031:4: (lv_value_1_0= RULE_INTEGER )
            // InternalRPL.g:4032:5: lv_value_1_0= RULE_INTEGER
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
    // InternalRPL.g:4052:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalRPL.g:4052:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalRPL.g:4053:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalRPL.g:4059:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalRPL.g:4065:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) ) )
            // InternalRPL.g:4066:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            {
            // InternalRPL.g:4066:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) ) )
            // InternalRPL.g:4067:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_REAL ) )
            {
            // InternalRPL.g:4067:3: ( (lv_sig_0_0= '-' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==48) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRPL.g:4068:4: (lv_sig_0_0= '-' )
                    {
                    // InternalRPL.g:4068:4: (lv_sig_0_0= '-' )
                    // InternalRPL.g:4069:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,48,FOLLOW_47); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getRealLiteralAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "sig", lv_sig_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalRPL.g:4081:3: ( (lv_value_1_0= RULE_REAL ) )
            // InternalRPL.g:4082:4: (lv_value_1_0= RULE_REAL )
            {
            // InternalRPL.g:4082:4: (lv_value_1_0= RULE_REAL )
            // InternalRPL.g:4083:5: lv_value_1_0= RULE_REAL
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
    // InternalRPL.g:4103:1: entryRulePatternFreeFormula returns [EObject current=null] : iv_rulePatternFreeFormula= rulePatternFreeFormula EOF ;
    public final EObject entryRulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormula = null;


        try {
            // InternalRPL.g:4103:59: (iv_rulePatternFreeFormula= rulePatternFreeFormula EOF )
            // InternalRPL.g:4104:2: iv_rulePatternFreeFormula= rulePatternFreeFormula EOF
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
    // InternalRPL.g:4110:1: rulePatternFreeFormula returns [EObject current=null] : (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) ;
    public final EObject rulePatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4116:2: ( (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4117:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4117:2: (this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )* )
            // InternalRPL.g:4118:3: this_ConjunctionPatternFreeFormula_0= ruleConjunctionPatternFreeFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ConjunctionPatternFreeFormula_0=ruleConjunctionPatternFreeFormula();

            state._fsp--;


            			current = this_ConjunctionPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4126:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_DISJUNCTION) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalRPL.g:4127:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4127:4: ()
            	    // InternalRPL.g:4128:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPatternFreeFormulaAccess().getPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getPatternFreeFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4138:4: ( (lv_right_3_0= rulePatternFreeFormula ) )
            	    // InternalRPL.g:4139:5: (lv_right_3_0= rulePatternFreeFormula )
            	    {
            	    // InternalRPL.g:4139:5: (lv_right_3_0= rulePatternFreeFormula )
            	    // InternalRPL.g:4140:6: lv_right_3_0= rulePatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getPatternFreeFormulaAccess().getRightPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "rulePatternFreeFormula"


    // $ANTLR start "entryRuleConjunctionPatternFreeFormula"
    // InternalRPL.g:4162:1: entryRuleConjunctionPatternFreeFormula returns [EObject current=null] : iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF ;
    public final EObject entryRuleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionPatternFreeFormula = null;


        try {
            // InternalRPL.g:4162:70: (iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF )
            // InternalRPL.g:4163:2: iv_ruleConjunctionPatternFreeFormula= ruleConjunctionPatternFreeFormula EOF
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
    // InternalRPL.g:4169:1: ruleConjunctionPatternFreeFormula returns [EObject current=null] : (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) ;
    public final EObject ruleConjunctionPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryPatternFreeFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4175:2: ( (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* ) )
            // InternalRPL.g:4176:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            {
            // InternalRPL.g:4176:2: (this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )* )
            // InternalRPL.g:4177:3: this_PrimaryPatternFreeFormula_0= rulePrimaryPatternFreeFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getPrimaryPatternFreeFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PrimaryPatternFreeFormula_0=rulePrimaryPatternFreeFormula();

            state._fsp--;


            			current = this_PrimaryPatternFreeFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:4185:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==RULE_CONJUNCTION) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalRPL.g:4186:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    {
            	    // InternalRPL.g:4186:4: ()
            	    // InternalRPL.g:4187:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionPatternFreeFormulaAccess().getConjunctionPatternFreeFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_26); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionPatternFreeFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:4197:4: ( (lv_right_3_0= ruleConjunctionPatternFreeFormula ) )
            	    // InternalRPL.g:4198:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    {
            	    // InternalRPL.g:4198:5: (lv_right_3_0= ruleConjunctionPatternFreeFormula )
            	    // InternalRPL.g:4199:6: lv_right_3_0= ruleConjunctionPatternFreeFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionPatternFreeFormulaAccess().getRightConjunctionPatternFreeFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleConjunctionPatternFreeFormula"


    // $ANTLR start "entryRulePrimaryPatternFreeFormula"
    // InternalRPL.g:4221:1: entryRulePrimaryPatternFreeFormula returns [EObject current=null] : iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF ;
    public final EObject entryRulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryPatternFreeFormula = null;


        try {
            // InternalRPL.g:4221:66: (iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF )
            // InternalRPL.g:4222:2: iv_rulePrimaryPatternFreeFormula= rulePrimaryPatternFreeFormula EOF
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
    // InternalRPL.g:4228:1: rulePrimaryPatternFreeFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryPatternFreeFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atomic_0_0 = null;

        EObject lv_nestedFormula_2_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4234:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) ) )
            // InternalRPL.g:4235:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            {
            // InternalRPL.g:4235:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID||(LA88_0>=RULE_NEGATION && LA88_0<=RULE_BOOLEAN_LITERAL)||LA88_0==36) ) {
                alt88=1;
            }
            else if ( (LA88_0==24) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalRPL.g:4236:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:4236:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:4237:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:4237:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:4238:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:4256:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    {
                    // InternalRPL.g:4256:3: (otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')' )
                    // InternalRPL.g:4257:4: otherlv_1= '(' ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryPatternFreeFormulaAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRPL.g:4261:4: ( (lv_nestedFormula_2_0= rulePatternFreeFormula ) )
                    // InternalRPL.g:4262:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    {
                    // InternalRPL.g:4262:5: (lv_nestedFormula_2_0= rulePatternFreeFormula )
                    // InternalRPL.g:4263:6: lv_nestedFormula_2_0= rulePatternFreeFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryPatternFreeFormulaAccess().getNestedFormulaPatternFreeFormulaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalRPL.g:4289:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRPL.g:4289:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRPL.g:4290:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRPL.g:4296:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (lv_extraInv_5_0= ruleExtraInvariant ) ) otherlv_6= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_extraInv_5_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4302:2: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (lv_extraInv_5_0= ruleExtraInvariant ) ) otherlv_6= ';' ) )
            // InternalRPL.g:4303:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (lv_extraInv_5_0= ruleExtraInvariant ) ) otherlv_6= ';' )
            {
            // InternalRPL.g:4303:2: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (lv_extraInv_5_0= ruleExtraInvariant ) ) otherlv_6= ';' )
            // InternalRPL.g:4304:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'with' ( (lv_extraInv_5_0= ruleExtraInvariant ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalRPL.g:4308:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRPL.g:4309:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRPL.g:4309:4: (lv_name_1_0= RULE_ID )
            // InternalRPL.g:4310:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getColonKeyword_2());
            		
            // InternalRPL.g:4330:3: ( (otherlv_3= RULE_ID ) )
            // InternalRPL.g:4331:4: (otherlv_3= RULE_ID )
            {
            // InternalRPL.g:4331:4: (otherlv_3= RULE_ID )
            // InternalRPL.g:4332:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getPatternDerivedRequirementPatternCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getWithKeyword_4());
            		
            // InternalRPL.g:4347:3: ( (lv_extraInv_5_0= ruleExtraInvariant ) )
            // InternalRPL.g:4348:4: (lv_extraInv_5_0= ruleExtraInvariant )
            {
            // InternalRPL.g:4348:4: (lv_extraInv_5_0= ruleExtraInvariant )
            // InternalRPL.g:4349:5: lv_extraInv_5_0= ruleExtraInvariant
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getExtraInvExtraInvariantParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_extraInv_5_0=ruleExtraInvariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"extraInv",
            						lv_extraInv_5_0,
            						"su.nsk.iae.rpl.RPL.ExtraInvariant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:4374:1: entryRuleExtraInvariant returns [EObject current=null] : iv_ruleExtraInvariant= ruleExtraInvariant EOF ;
    public final EObject entryRuleExtraInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraInvariant = null;


        try {
            // InternalRPL.g:4374:55: (iv_ruleExtraInvariant= ruleExtraInvariant EOF )
            // InternalRPL.g:4375:2: iv_ruleExtraInvariant= ruleExtraInvariant EOF
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
    // InternalRPL.g:4381:1: ruleExtraInvariant returns [EObject current=null] : (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalRPL.g:4387:2: ( (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalRPL.g:4388:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalRPL.g:4388:2: (otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalRPL.g:4389:3: otherlv_0= 'extra' otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getExtraInvariantAccess().getExtraKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExtraInvariantAccess().getInvariantKeyword_1());
            		
            // InternalRPL.g:4397:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRPL.g:4398:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRPL.g:4398:4: (lv_name_2_0= RULE_ID )
            // InternalRPL.g:4399:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExtraInvariantAccess().getColonKeyword_3());
            		
            // InternalRPL.g:4419:3: ( (otherlv_4= RULE_ID ) )
            // InternalRPL.g:4420:4: (otherlv_4= RULE_ID )
            {
            // InternalRPL.g:4420:4: (otherlv_4= RULE_ID )
            // InternalRPL.g:4421:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtraInvariantRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getExtraInvariantAccess().getPatternDerivedExtraInvariantPatternCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRPL.g:4440:1: entryRulePatternFreeFormulaParameterValue returns [EObject current=null] : iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF ;
    public final EObject entryRulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternFreeFormulaParameterValue = null;


        try {
            // InternalRPL.g:4440:73: (iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF )
            // InternalRPL.g:4441:2: iv_rulePatternFreeFormulaParameterValue= rulePatternFreeFormulaParameterValue EOF
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
    // InternalRPL.g:4447:1: rulePatternFreeFormulaParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) ;
    public final EObject rulePatternFreeFormulaParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_states_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:4453:2: ( ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) ) )
            // InternalRPL.g:4454:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            {
            // InternalRPL.g:4454:2: ( (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) ) )
            // InternalRPL.g:4455:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )? ( (lv_formula_3_0= rulePatternFreeFormula ) )
            {
            // InternalRPL.g:4455:3: (otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==34) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalRPL.g:4456:4: otherlv_0= 'lambda' ( (lv_states_1_0= ruleUpdateStateVariable ) )+ otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPatternFreeFormulaParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:4460:4: ( (lv_states_1_0= ruleUpdateStateVariable ) )+
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
                    	    // InternalRPL.g:4461:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    {
                    	    // InternalRPL.g:4461:5: (lv_states_1_0= ruleUpdateStateVariable )
                    	    // InternalRPL.g:4462:6: lv_states_1_0= ruleUpdateStateVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getPatternFreeFormulaParameterValueAccess().getStatesUpdateStateVariableParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
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

                    otherlv_2=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getPatternFreeFormulaParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:4484:3: ( (lv_formula_3_0= rulePatternFreeFormula ) )
            // InternalRPL.g:4485:4: (lv_formula_3_0= rulePatternFreeFormula )
            {
            // InternalRPL.g:4485:4: (lv_formula_3_0= rulePatternFreeFormula )
            // InternalRPL.g:4486:5: lv_formula_3_0= rulePatternFreeFormula
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
    // InternalRPL.g:4507:1: entryRuleFutureLemmas returns [EObject current=null] : iv_ruleFutureLemmas= ruleFutureLemmas EOF ;
    public final EObject entryRuleFutureLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFutureLemmas = null;


        try {
            // InternalRPL.g:4507:53: (iv_ruleFutureLemmas= ruleFutureLemmas EOF )
            // InternalRPL.g:4508:2: iv_ruleFutureLemmas= ruleFutureLemmas EOF
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
    // InternalRPL.g:4514:1: ruleFutureLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) ;
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
            // InternalRPL.g:4520:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) ) )
            // InternalRPL.g:4521:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            {
            // InternalRPL.g:4521:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalRPL.g:4522:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalRPL.g:4522:3: ()
            // InternalRPL.g:4523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFutureLemmasAccess().getFutureLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4529:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalRPL.g:4530:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_1=(Token)match(input,52,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getFutureLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,53,FOLLOW_51); 

            				newLeafNode(otherlv_2, grammarAccess.getFutureLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4538:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4539:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4539:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4540:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4543:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4544:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4544:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) ) )*
            loop91:
            do {
                int alt91=4;
                int LA91_0 = input.LA(1);

                if ( LA91_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt91=1;
                }
                else if ( LA91_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt91=2;
                }
                else if ( LA91_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt91=3;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalRPL.g:4545:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4545:5: ({...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4546:6: {...}? => ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4546:112: ( ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4547:7: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4550:10: ({...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4550:11: {...}? => (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4550:20: (otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4550:21: otherlv_4= 'LS1' ( (lv_L1_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,54,FOLLOW_52); 

            	    										newLeafNode(otherlv_4, grammarAccess.getFutureLemmasAccess().getLS1Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4554:10: ( (lv_L1_5_0= ruleLemma ) )
            	    // InternalRPL.g:4555:11: (lv_L1_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4555:11: (lv_L1_5_0= ruleLemma )
            	    // InternalRPL.g:4556:12: lv_L1_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL1LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    // InternalRPL.g:4579:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4579:5: ({...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4580:6: {...}? => ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4580:112: ( ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4581:7: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4584:10: ({...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4584:11: {...}? => (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4584:20: (otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4584:21: otherlv_6= 'LS2' ( (lv_L2_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,55,FOLLOW_52); 

            	    										newLeafNode(otherlv_6, grammarAccess.getFutureLemmasAccess().getLS2Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4588:10: ( (lv_L2_7_0= ruleLemma ) )
            	    // InternalRPL.g:4589:11: (lv_L2_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4589:11: (lv_L2_7_0= ruleLemma )
            	    // InternalRPL.g:4590:12: lv_L2_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL2LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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
            	    // InternalRPL.g:4613:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4613:5: ({...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4614:6: {...}? => ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4614:112: ( ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4615:7: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getFutureLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4618:10: ({...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4618:11: {...}? => (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFutureLemmas", "true");
            	    }
            	    // InternalRPL.g:4618:20: (otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4618:21: otherlv_8= 'LS3' ( (lv_L3_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,56,FOLLOW_52); 

            	    										newLeafNode(otherlv_8, grammarAccess.getFutureLemmasAccess().getLS3Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4622:10: ( (lv_L3_9_0= ruleLemma ) )
            	    // InternalRPL.g:4623:11: (lv_L3_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4623:11: (lv_L3_9_0= ruleLemma )
            	    // InternalRPL.g:4624:12: lv_L3_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getFutureLemmasAccess().getL3LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_51);
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

            otherlv_10=(Token)match(input,57,FOLLOW_2); 

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
    // InternalRPL.g:4663:1: entryRulePastLemmas returns [EObject current=null] : iv_rulePastLemmas= rulePastLemmas EOF ;
    public final EObject entryRulePastLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastLemmas = null;


        try {
            // InternalRPL.g:4663:51: (iv_rulePastLemmas= rulePastLemmas EOF )
            // InternalRPL.g:4664:2: iv_rulePastLemmas= rulePastLemmas EOF
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
    // InternalRPL.g:4670:1: rulePastLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) ;
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
            // InternalRPL.g:4676:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ) )
            // InternalRPL.g:4677:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            {
            // InternalRPL.g:4677:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalRPL.g:4678:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalRPL.g:4678:3: ()
            // InternalRPL.g:4679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPastLemmasAccess().getPastLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4685:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalRPL.g:4686:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_1=(Token)match(input,52,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getPastLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,53,FOLLOW_53); 

            				newLeafNode(otherlv_2, grammarAccess.getPastLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4694:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4695:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4695:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4696:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4699:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4700:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4700:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) ) )*
            loop92:
            do {
                int alt92=5;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
                    alt92=3;
                }
                else if ( LA92_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
                    alt92=4;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalRPL.g:4701:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4701:5: ({...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4702:6: {...}? => ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4702:110: ( ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4703:7: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4706:10: ({...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4706:11: {...}? => (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4706:20: (otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4706:21: otherlv_4= 'LS4' ( (lv_L4_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,58,FOLLOW_52); 

            	    										newLeafNode(otherlv_4, grammarAccess.getPastLemmasAccess().getLS4Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4710:10: ( (lv_L4_5_0= ruleLemma ) )
            	    // InternalRPL.g:4711:11: (lv_L4_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4711:11: (lv_L4_5_0= ruleLemma )
            	    // InternalRPL.g:4712:12: lv_L4_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL4LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
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
            	    // InternalRPL.g:4735:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4735:5: ({...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4736:6: {...}? => ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4736:110: ( ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4737:7: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4740:10: ({...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4740:11: {...}? => (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4740:20: (otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4740:21: otherlv_6= 'LS5' ( (lv_L5_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,59,FOLLOW_52); 

            	    										newLeafNode(otherlv_6, grammarAccess.getPastLemmasAccess().getLS5Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4744:10: ( (lv_L5_7_0= ruleLemma ) )
            	    // InternalRPL.g:4745:11: (lv_L5_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4745:11: (lv_L5_7_0= ruleLemma )
            	    // InternalRPL.g:4746:12: lv_L5_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL5LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
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
            	    // InternalRPL.g:4769:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4769:5: ({...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4770:6: {...}? => ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2)");
            	    }
            	    // InternalRPL.g:4770:110: ( ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4771:7: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 2);
            	    						
            	    // InternalRPL.g:4774:10: ({...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4774:11: {...}? => (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4774:20: (otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) ) )
            	    // InternalRPL.g:4774:21: otherlv_8= 'LS6' ( (lv_L6_9_0= ruleLemma ) )
            	    {
            	    otherlv_8=(Token)match(input,60,FOLLOW_52); 

            	    										newLeafNode(otherlv_8, grammarAccess.getPastLemmasAccess().getLS6Keyword_1_2_2_0());
            	    									
            	    // InternalRPL.g:4778:10: ( (lv_L6_9_0= ruleLemma ) )
            	    // InternalRPL.g:4779:11: (lv_L6_9_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4779:11: (lv_L6_9_0= ruleLemma )
            	    // InternalRPL.g:4780:12: lv_L6_9_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL6LemmaParserRuleCall_1_2_2_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
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
            	    // InternalRPL.g:4803:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4803:5: ({...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4804:6: {...}? => ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3)");
            	    }
            	    // InternalRPL.g:4804:110: ( ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4805:7: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getPastLemmasAccess().getUnorderedGroup_1_2(), 3);
            	    						
            	    // InternalRPL.g:4808:10: ({...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4808:11: {...}? => (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePastLemmas", "true");
            	    }
            	    // InternalRPL.g:4808:20: (otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) ) )
            	    // InternalRPL.g:4808:21: otherlv_10= 'LS7' ( (lv_L7_11_0= ruleLemma ) )
            	    {
            	    otherlv_10=(Token)match(input,61,FOLLOW_52); 

            	    										newLeafNode(otherlv_10, grammarAccess.getPastLemmasAccess().getLS7Keyword_1_2_3_0());
            	    									
            	    // InternalRPL.g:4812:10: ( (lv_L7_11_0= ruleLemma ) )
            	    // InternalRPL.g:4813:11: (lv_L7_11_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4813:11: (lv_L7_11_0= ruleLemma )
            	    // InternalRPL.g:4814:12: lv_L7_11_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getPastLemmasAccess().getL7LemmaParserRuleCall_1_2_3_1_0());
            	    											
            	    pushFollow(FOLLOW_53);
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

            otherlv_12=(Token)match(input,57,FOLLOW_2); 

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
    // InternalRPL.g:4853:1: entryRuleDerivedLemmas returns [EObject current=null] : iv_ruleDerivedLemmas= ruleDerivedLemmas EOF ;
    public final EObject entryRuleDerivedLemmas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedLemmas = null;


        try {
            // InternalRPL.g:4853:54: (iv_ruleDerivedLemmas= ruleDerivedLemmas EOF )
            // InternalRPL.g:4854:2: iv_ruleDerivedLemmas= ruleDerivedLemmas EOF
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
    // InternalRPL.g:4860:1: ruleDerivedLemmas returns [EObject current=null] : ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) ;
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
            // InternalRPL.g:4866:2: ( ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ) )
            // InternalRPL.g:4867:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            {
            // InternalRPL.g:4867:2: ( () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalRPL.g:4868:3: () (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalRPL.g:4868:3: ()
            // InternalRPL.g:4869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedLemmasAccess().getDerivedLemmasAction_0(),
            					current);
            			

            }

            // InternalRPL.g:4875:3: (otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalRPL.g:4876:4: otherlv_1= 'lemmas' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            otherlv_1=(Token)match(input,52,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedLemmasAccess().getLemmasKeyword_1_0());
            			
            otherlv_2=(Token)match(input,53,FOLLOW_54); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedLemmasAccess().getLeftCurlyBracketKeyword_1_1());
            			
            // InternalRPL.g:4884:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) ) )
            // InternalRPL.g:4885:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            {
            // InternalRPL.g:4885:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* ) )
            // InternalRPL.g:4886:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2());
            					
            // InternalRPL.g:4889:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )* )
            // InternalRPL.g:4890:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            {
            // InternalRPL.g:4890:7: ( ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) ) )*
            loop93:
            do {
                int alt93=3;
                int LA93_0 = input.LA(1);

                if ( LA93_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
                    alt93=1;
                }
                else if ( LA93_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
                    alt93=2;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalRPL.g:4891:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4891:5: ({...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4892:6: {...}? => ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0)");
            	    }
            	    // InternalRPL.g:4892:113: ( ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4893:7: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 0);
            	    						
            	    // InternalRPL.g:4896:10: ({...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4896:11: {...}? => (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4896:20: (otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) ) )
            	    // InternalRPL.g:4896:21: otherlv_4= 'LS8' ( (lv_L8_5_0= ruleLemma ) )
            	    {
            	    otherlv_4=(Token)match(input,62,FOLLOW_52); 

            	    										newLeafNode(otherlv_4, grammarAccess.getDerivedLemmasAccess().getLS8Keyword_1_2_0_0());
            	    									
            	    // InternalRPL.g:4900:10: ( (lv_L8_5_0= ruleLemma ) )
            	    // InternalRPL.g:4901:11: (lv_L8_5_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4901:11: (lv_L8_5_0= ruleLemma )
            	    // InternalRPL.g:4902:12: lv_L8_5_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL8LemmaParserRuleCall_1_2_0_1_0());
            	    											
            	    pushFollow(FOLLOW_54);
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
            	    // InternalRPL.g:4925:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:4925:5: ({...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) ) )
            	    // InternalRPL.g:4926:6: {...}? => ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1)");
            	    }
            	    // InternalRPL.g:4926:113: ( ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) ) )
            	    // InternalRPL.g:4927:7: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedLemmasAccess().getUnorderedGroup_1_2(), 1);
            	    						
            	    // InternalRPL.g:4930:10: ({...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) ) )
            	    // InternalRPL.g:4930:11: {...}? => (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedLemmas", "true");
            	    }
            	    // InternalRPL.g:4930:20: (otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) ) )
            	    // InternalRPL.g:4930:21: otherlv_6= 'LS9' ( (lv_L9_7_0= ruleLemma ) )
            	    {
            	    otherlv_6=(Token)match(input,63,FOLLOW_52); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedLemmasAccess().getLS9Keyword_1_2_1_0());
            	    									
            	    // InternalRPL.g:4934:10: ( (lv_L9_7_0= ruleLemma ) )
            	    // InternalRPL.g:4935:11: (lv_L9_7_0= ruleLemma )
            	    {
            	    // InternalRPL.g:4935:11: (lv_L9_7_0= ruleLemma )
            	    // InternalRPL.g:4936:12: lv_L9_7_0= ruleLemma
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedLemmasAccess().getL9LemmaParserRuleCall_1_2_1_1_0());
            	    											
            	    pushFollow(FOLLOW_54);
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

            otherlv_8=(Token)match(input,57,FOLLOW_2); 

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
    // InternalRPL.g:4975:1: entryRuleLemma returns [EObject current=null] : iv_ruleLemma= ruleLemma EOF ;
    public final EObject entryRuleLemma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemma = null;


        try {
            // InternalRPL.g:4975:46: (iv_ruleLemma= ruleLemma EOF )
            // InternalRPL.g:4976:2: iv_ruleLemma= ruleLemma EOF
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
    // InternalRPL.g:4982:1: ruleLemma returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRPL.g:4988:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) ) )
            // InternalRPL.g:4989:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRPL.g:4989:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) ) )
            // InternalRPL.g:4990:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalRPL.g:4990:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?) )
            // InternalRPL.g:4991:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLemmaAccess().getUnorderedGroup());
            			
            // InternalRPL.g:4994:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?)
            // InternalRPL.g:4995:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+ {...}?
            {
            // InternalRPL.g:4995:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=9;
                alt100 = dfa100.predict(input);
                switch (alt100) {
            	case 1 :
            	    // InternalRPL.g:4996:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    {
            	    // InternalRPL.g:4996:3: ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) )
            	    // InternalRPL.g:4997:4: {...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRPL.g:4997:99: ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) )
            	    // InternalRPL.g:4998:5: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRPL.g:5001:8: ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) )
            	    // InternalRPL.g:5001:9: {...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5001:18: (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? )
            	    // InternalRPL.g:5001:19: otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    {
            	    otherlv_1=(Token)match(input,64,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLemmaAccess().getLemmaKeyword_0_0());
            	    							
            	    // InternalRPL.g:5005:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRPL.g:5006:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRPL.g:5006:9: (lv_name_2_0= RULE_ID )
            	    // InternalRPL.g:5007:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_50); 

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

            	    otherlv_3=(Token)match(input,53,FOLLOW_55); 

            	    								newLeafNode(otherlv_3, grammarAccess.getLemmaAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalRPL.g:5027:8: (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==25) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalRPL.g:5028:9: otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            {
            	            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	            									newLeafNode(otherlv_4, grammarAccess.getLemmaAccess().getConstKeyword_0_3_0());
            	            								
            	            otherlv_5=(Token)match(input,26,FOLLOW_8); 

            	            									newLeafNode(otherlv_5, grammarAccess.getLemmaAccess().getColonKeyword_0_3_1());
            	            								
            	            // InternalRPL.g:5036:9: ( (lv_cVars_6_0= ruleConstantParameter ) )
            	            // InternalRPL.g:5037:10: (lv_cVars_6_0= ruleConstantParameter )
            	            {
            	            // InternalRPL.g:5037:10: (lv_cVars_6_0= ruleConstantParameter )
            	            // InternalRPL.g:5038:11: lv_cVars_6_0= ruleConstantParameter
            	            {

            	            											newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_2_0());
            	            										
            	            pushFollow(FOLLOW_56);
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

            	            // InternalRPL.g:5055:9: (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )*
            	            loop94:
            	            do {
            	                int alt94=2;
            	                int LA94_0 = input.LA(1);

            	                if ( (LA94_0==27) ) {
            	                    alt94=1;
            	                }


            	                switch (alt94) {
            	            	case 1 :
            	            	    // InternalRPL.g:5056:10: otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    {
            	            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	            	    										newLeafNode(otherlv_7, grammarAccess.getLemmaAccess().getCommaKeyword_0_3_3_0());
            	            	    									
            	            	    // InternalRPL.g:5060:10: ( (lv_cVars_8_0= ruleConstantParameter ) )
            	            	    // InternalRPL.g:5061:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    {
            	            	    // InternalRPL.g:5061:11: (lv_cVars_8_0= ruleConstantParameter )
            	            	    // InternalRPL.g:5062:12: lv_cVars_8_0= ruleConstantParameter
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getLemmaAccess().getCVarsConstantParameterParserRuleCall_0_3_3_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_56);
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
            	    // InternalRPL.g:5087:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5087:3: ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5088:4: {...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRPL.g:5088:99: ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) )
            	    // InternalRPL.g:5089:5: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRPL.g:5092:8: ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) )
            	    // InternalRPL.g:5092:9: {...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5092:18: (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* )
            	    // InternalRPL.g:5092:19: otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,42,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getLemmaAccess().getFunKeyword_1_0());
            	    							
            	    otherlv_10=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_10, grammarAccess.getLemmaAccess().getColonKeyword_1_1());
            	    							
            	    // InternalRPL.g:5100:8: ( (lv_fnVars_11_0= ruleFunctionalParameter ) )
            	    // InternalRPL.g:5101:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    {
            	    // InternalRPL.g:5101:9: (lv_fnVars_11_0= ruleFunctionalParameter )
            	    // InternalRPL.g:5102:10: lv_fnVars_11_0= ruleFunctionalParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_56);
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

            	    // InternalRPL.g:5119:8: (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )*
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==27) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // InternalRPL.g:5120:9: otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_12, grammarAccess.getLemmaAccess().getCommaKeyword_1_3_0());
            	    	    								
            	    	    // InternalRPL.g:5124:9: ( (lv_fnVars_13_0= ruleFunctionalParameter ) )
            	    	    // InternalRPL.g:5125:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    {
            	    	    // InternalRPL.g:5125:10: (lv_fnVars_13_0= ruleFunctionalParameter )
            	    	    // InternalRPL.g:5126:11: lv_fnVars_13_0= ruleFunctionalParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getFnVarsFunctionalParameterParserRuleCall_1_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_56);
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
            	    // InternalRPL.g:5150:3: ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5150:3: ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5151:4: {...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRPL.g:5151:99: ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5152:5: ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRPL.g:5155:8: ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5155:9: {...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5155:18: (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* )
            	    // InternalRPL.g:5155:19: otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )*
            	    {
            	    otherlv_14=(Token)match(input,28,FOLLOW_13); 

            	    								newLeafNode(otherlv_14, grammarAccess.getLemmaAccess().getSimpleKeyword_2_0());
            	    							
            	    otherlv_15=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_15, grammarAccess.getLemmaAccess().getFormulasKeyword_2_1());
            	    							
            	    otherlv_16=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_16, grammarAccess.getLemmaAccess().getColonKeyword_2_2());
            	    							
            	    // InternalRPL.g:5167:8: ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) )
            	    // InternalRPL.g:5168:9: (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter )
            	    {
            	    // InternalRPL.g:5168:9: (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter )
            	    // InternalRPL.g:5169:10: lv_simpleFmVars_17_0= ruleSimpleFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_56);
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

            	    // InternalRPL.g:5186:8: (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )*
            	    loop97:
            	    do {
            	        int alt97=2;
            	        int LA97_0 = input.LA(1);

            	        if ( (LA97_0==27) ) {
            	            alt97=1;
            	        }


            	        switch (alt97) {
            	    	case 1 :
            	    	    // InternalRPL.g:5187:9: otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_18, grammarAccess.getLemmaAccess().getCommaKeyword_2_4_0());
            	    	    								
            	    	    // InternalRPL.g:5191:9: ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) )
            	    	    // InternalRPL.g:5192:10: (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5192:10: (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter )
            	    	    // InternalRPL.g:5193:11: lv_simpleFmVars_19_0= ruleSimpleFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getSimpleFmVarsSimpleFormulaParameterParserRuleCall_2_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_56);
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
            	    // InternalRPL.g:5217:3: ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5217:3: ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5218:4: {...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRPL.g:5218:99: ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5219:5: ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRPL.g:5222:8: ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5222:9: {...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5222:18: (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* )
            	    // InternalRPL.g:5222:19: otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )*
            	    {
            	    otherlv_20=(Token)match(input,50,FOLLOW_49); 

            	    								newLeafNode(otherlv_20, grammarAccess.getLemmaAccess().getExtraKeyword_3_0());
            	    							
            	    otherlv_21=(Token)match(input,51,FOLLOW_13); 

            	    								newLeafNode(otherlv_21, grammarAccess.getLemmaAccess().getInvariantKeyword_3_1());
            	    							
            	    otherlv_22=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_22, grammarAccess.getLemmaAccess().getFormulasKeyword_3_2());
            	    							
            	    otherlv_23=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_23, grammarAccess.getLemmaAccess().getColonKeyword_3_3());
            	    							
            	    // InternalRPL.g:5238:8: ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) )
            	    // InternalRPL.g:5239:9: (lv_ifmVars_24_0= ruleRegularFormulaParameter )
            	    {
            	    // InternalRPL.g:5239:9: (lv_ifmVars_24_0= ruleRegularFormulaParameter )
            	    // InternalRPL.g:5240:10: lv_ifmVars_24_0= ruleRegularFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_56);
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

            	    // InternalRPL.g:5257:8: (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==27) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // InternalRPL.g:5258:9: otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_25, grammarAccess.getLemmaAccess().getCommaKeyword_3_5_0());
            	    	    								
            	    	    // InternalRPL.g:5262:9: ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) )
            	    	    // InternalRPL.g:5263:10: (lv_ifmVars_26_0= ruleRegularFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5263:10: (lv_ifmVars_26_0= ruleRegularFormulaParameter )
            	    	    // InternalRPL.g:5264:11: lv_ifmVars_26_0= ruleRegularFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getIfmVarsRegularFormulaParameterParserRuleCall_3_5_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_56);
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
            	    // InternalRPL.g:5288:3: ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    {
            	    // InternalRPL.g:5288:3: ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) )
            	    // InternalRPL.g:5289:4: {...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRPL.g:5289:99: ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) )
            	    // InternalRPL.g:5290:5: ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRPL.g:5293:8: ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) )
            	    // InternalRPL.g:5293:9: {...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5293:18: (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* )
            	    // InternalRPL.g:5293:19: otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )*
            	    {
            	    otherlv_27=(Token)match(input,49,FOLLOW_13); 

            	    								newLeafNode(otherlv_27, grammarAccess.getLemmaAccess().getRequirementKeyword_4_0());
            	    							
            	    otherlv_28=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_28, grammarAccess.getLemmaAccess().getFormulasKeyword_4_1());
            	    							
            	    otherlv_29=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_29, grammarAccess.getLemmaAccess().getColonKeyword_4_2());
            	    							
            	    // InternalRPL.g:5305:8: ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) )
            	    // InternalRPL.g:5306:9: (lv_rfmVars_30_0= ruleRegularFormulaParameter )
            	    {
            	    // InternalRPL.g:5306:9: (lv_rfmVars_30_0= ruleRegularFormulaParameter )
            	    // InternalRPL.g:5307:10: lv_rfmVars_30_0= ruleRegularFormulaParameter
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_56);
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

            	    // InternalRPL.g:5324:8: (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )*
            	    loop99:
            	    do {
            	        int alt99=2;
            	        int LA99_0 = input.LA(1);

            	        if ( (LA99_0==27) ) {
            	            alt99=1;
            	        }


            	        switch (alt99) {
            	    	case 1 :
            	    	    // InternalRPL.g:5325:9: otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,27,FOLLOW_8); 

            	    	    									newLeafNode(otherlv_31, grammarAccess.getLemmaAccess().getCommaKeyword_4_4_0());
            	    	    								
            	    	    // InternalRPL.g:5329:9: ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) )
            	    	    // InternalRPL.g:5330:10: (lv_rfmVars_32_0= ruleRegularFormulaParameter )
            	    	    {
            	    	    // InternalRPL.g:5330:10: (lv_rfmVars_32_0= ruleRegularFormulaParameter )
            	    	    // InternalRPL.g:5331:11: lv_rfmVars_32_0= ruleRegularFormulaParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getLemmaAccess().getRfmVarsRegularFormulaParameterParserRuleCall_4_4_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_56);
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
            	    	    break loop99;
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
            	    // InternalRPL.g:5355:3: ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5355:3: ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5356:4: {...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRPL.g:5356:99: ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5357:5: ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRPL.g:5360:8: ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5360:9: {...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5360:18: (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5360:19: otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_33=(Token)match(input,65,FOLLOW_57); 

            	    								newLeafNode(otherlv_33, grammarAccess.getLemmaAccess().getInitKeyword_5_0());
            	    							
            	    otherlv_34=(Token)match(input,66,FOLLOW_11); 

            	    								newLeafNode(otherlv_34, grammarAccess.getLemmaAccess().getStateKeyword_5_1());
            	    							
            	    otherlv_35=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_35, grammarAccess.getLemmaAccess().getColonKeyword_5_2());
            	    							
            	    // InternalRPL.g:5372:8: ( (lv_initState_36_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5373:9: (lv_initState_36_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5373:9: (lv_initState_36_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5374:10: lv_initState_36_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getInitStateUpdateStateVariableParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_58);
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
            	    // InternalRPL.g:5397:3: ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    {
            	    // InternalRPL.g:5397:3: ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) )
            	    // InternalRPL.g:5398:4: {...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRPL.g:5398:99: ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) )
            	    // InternalRPL.g:5399:5: ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRPL.g:5402:8: ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) )
            	    // InternalRPL.g:5402:9: {...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5402:18: (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) )
            	    // InternalRPL.g:5402:19: otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) )
            	    {
            	    otherlv_37=(Token)match(input,37,FOLLOW_57); 

            	    								newLeafNode(otherlv_37, grammarAccess.getLemmaAccess().getFinalKeyword_6_0());
            	    							
            	    otherlv_38=(Token)match(input,66,FOLLOW_11); 

            	    								newLeafNode(otherlv_38, grammarAccess.getLemmaAccess().getStateKeyword_6_1());
            	    							
            	    otherlv_39=(Token)match(input,26,FOLLOW_8); 

            	    								newLeafNode(otherlv_39, grammarAccess.getLemmaAccess().getColonKeyword_6_2());
            	    							
            	    // InternalRPL.g:5414:8: ( (lv_finalState_40_0= ruleUpdateStateVariable ) )
            	    // InternalRPL.g:5415:9: (lv_finalState_40_0= ruleUpdateStateVariable )
            	    {
            	    // InternalRPL.g:5415:9: (lv_finalState_40_0= ruleUpdateStateVariable )
            	    // InternalRPL.g:5416:10: lv_finalState_40_0= ruleUpdateStateVariable
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getFinalStateUpdateStateVariableParserRuleCall_6_3_0());
            	    									
            	    pushFollow(FOLLOW_58);
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
            	    // InternalRPL.g:5439:3: ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    {
            	    // InternalRPL.g:5439:3: ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) )
            	    // InternalRPL.g:5440:4: {...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalRPL.g:5440:99: ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) )
            	    // InternalRPL.g:5441:5: ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalRPL.g:5444:8: ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) )
            	    // InternalRPL.g:5444:9: {...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLemma", "true");
            	    }
            	    // InternalRPL.g:5444:18: (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' )
            	    // InternalRPL.g:5444:19: otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';'
            	    {
            	    otherlv_41=(Token)match(input,67,FOLLOW_59); 

            	    								newLeafNode(otherlv_41, grammarAccess.getLemmaAccess().getPremiseKeyword_7_0());
            	    							
            	    // InternalRPL.g:5448:8: ( (lv_prem_42_0= ruleLemmaPremiseFormula ) )
            	    // InternalRPL.g:5449:9: (lv_prem_42_0= ruleLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5449:9: (lv_prem_42_0= ruleLemmaPremiseFormula )
            	    // InternalRPL.g:5450:10: lv_prem_42_0= ruleLemmaPremiseFormula
            	    {

            	    										newCompositeNode(grammarAccess.getLemmaAccess().getPremLemmaPremiseFormulaParserRuleCall_7_1_0());
            	    									
            	    pushFollow(FOLLOW_60);
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

            	    otherlv_43=(Token)match(input,57,FOLLOW_6); 

            	    								newLeafNode(otherlv_43, grammarAccess.getLemmaAccess().getRightCurlyBracketKeyword_7_2());
            	    							
            	    otherlv_44=(Token)match(input,21,FOLLOW_58); 

            	    								newLeafNode(otherlv_44, grammarAccess.getLemmaAccess().getSemicolonKeyword_7_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLemmaAccess().getUnorderedGroup());
            	    				

            	    }


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
    // InternalRPL.g:5492:1: entryRuleLemmaPremiseFormula returns [EObject current=null] : iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF ;
    public final EObject entryRuleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5492:60: (iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF )
            // InternalRPL.g:5493:2: iv_ruleLemmaPremiseFormula= ruleLemmaPremiseFormula EOF
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
    // InternalRPL.g:5499:1: ruleLemmaPremiseFormula returns [EObject current=null] : (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) ;
    public final EObject ruleLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_IMPLICATION_2=null;
        EObject this_DisjunctionLemmaPremiseFormula_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5505:2: ( (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) ) )
            // InternalRPL.g:5506:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            {
            // InternalRPL.g:5506:2: (this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula | ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=RULE_NEGATION && LA101_0<=RULE_BOOLEAN_LITERAL)||LA101_0==24||LA101_0==36||LA101_0==68) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_ID) ) {
                int LA101_2 = input.LA(2);

                if ( (LA101_2==24) ) {
                    int LA101_3 = input.LA(3);

                    if ( (LA101_3==RULE_ID) ) {
                        int LA101_4 = input.LA(4);

                        if ( (LA101_4==27) ) {
                            alt101=1;
                        }
                        else if ( (LA101_4==30) ) {
                            int LA101_5 = input.LA(5);

                            if ( (LA101_5==EOF||(LA101_5>=RULE_DISJUNCTION && LA101_5<=RULE_CONJUNCTION)||LA101_5==30||LA101_5==57) ) {
                                alt101=1;
                            }
                            else if ( (LA101_5==RULE_IMPLICATION) ) {
                                alt101=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 101, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 101, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA101_3==25||LA101_3==29||(LA101_3>=37 && LA101_3<=38)||LA101_3==42) ) {
                        alt101=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA101_2==EOF||(LA101_2>=RULE_DISJUNCTION && LA101_2<=RULE_CONJUNCTION)||LA101_2==30||LA101_2==57) ) {
                    alt101=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalRPL.g:5507:3: this_DisjunctionLemmaPremiseFormula_0= ruleDisjunctionLemmaPremiseFormula
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
                    // InternalRPL.g:5516:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    {
                    // InternalRPL.g:5516:3: ( ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) ) )
                    // InternalRPL.g:5517:4: ( (lv_left_1_0= ruleFunApplication ) ) this_IMPLICATION_2= RULE_IMPLICATION ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    {
                    // InternalRPL.g:5517:4: ( (lv_left_1_0= ruleFunApplication ) )
                    // InternalRPL.g:5518:5: (lv_left_1_0= ruleFunApplication )
                    {
                    // InternalRPL.g:5518:5: (lv_left_1_0= ruleFunApplication )
                    // InternalRPL.g:5519:6: lv_left_1_0= ruleFunApplication
                    {

                    						newCompositeNode(grammarAccess.getLemmaPremiseFormulaAccess().getLeftFunApplicationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_61);
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

                    this_IMPLICATION_2=(Token)match(input,RULE_IMPLICATION,FOLLOW_59); 

                    				newLeafNode(this_IMPLICATION_2, grammarAccess.getLemmaPremiseFormulaAccess().getIMPLICATIONTerminalRuleCall_1_1());
                    			
                    // InternalRPL.g:5540:4: ( (lv_right_3_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5541:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5541:5: (lv_right_3_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5542:6: lv_right_3_0= ruleLemmaPremiseFormula
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
    // InternalRPL.g:5564:1: entryRuleDisjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5564:71: (iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5565:2: iv_ruleDisjunctionLemmaPremiseFormula= ruleDisjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5571:1: ruleDisjunctionLemmaPremiseFormula returns [EObject current=null] : (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleDisjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5577:2: ( (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5578:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5578:2: (this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5579:3: this_ConjunctionLemmaPremiseFormula_0= ruleConjunctionLemmaPremiseFormula ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ConjunctionLemmaPremiseFormula_0=ruleConjunctionLemmaPremiseFormula();

            state._fsp--;


            			current = this_ConjunctionLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5587:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==RULE_DISJUNCTION) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalRPL.g:5588:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5588:4: ()
            	    // InternalRPL.g:5589:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDisjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FOLLOW_59); 

            	    				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5599:4: ( (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5600:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5600:5: (lv_right_3_0= ruleDisjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5601:6: lv_right_3_0= ruleDisjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getDisjunctionLemmaPremiseFormulaAccess().getRightDisjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleDisjunctionLemmaPremiseFormula"


    // $ANTLR start "entryRuleConjunctionLemmaPremiseFormula"
    // InternalRPL.g:5623:1: entryRuleConjunctionLemmaPremiseFormula returns [EObject current=null] : iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF ;
    public final EObject entryRuleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5623:71: (iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF )
            // InternalRPL.g:5624:2: iv_ruleConjunctionLemmaPremiseFormula= ruleConjunctionLemmaPremiseFormula EOF
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
    // InternalRPL.g:5630:1: ruleConjunctionLemmaPremiseFormula returns [EObject current=null] : (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) ;
    public final EObject ruleConjunctionLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        EObject this_PrimaryLemmaPremiseFormula_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5636:2: ( (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* ) )
            // InternalRPL.g:5637:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            {
            // InternalRPL.g:5637:2: (this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )* )
            // InternalRPL.g:5638:3: this_PrimaryLemmaPremiseFormula_0= rulePrimaryLemmaPremiseFormula ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getPrimaryLemmaPremiseFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PrimaryLemmaPremiseFormula_0=rulePrimaryLemmaPremiseFormula();

            state._fsp--;


            			current = this_PrimaryLemmaPremiseFormula_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRPL.g:5646:3: ( () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_CONJUNCTION) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalRPL.g:5647:4: () this_CONJUNCTION_2= RULE_CONJUNCTION ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    {
            	    // InternalRPL.g:5647:4: ()
            	    // InternalRPL.g:5648:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getConjunctionLemmaPremiseFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FOLLOW_59); 

            	    				newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getCONJUNCTIONTerminalRuleCall_1_1());
            	    			
            	    // InternalRPL.g:5658:4: ( (lv_right_3_0= ruleConjunctionLemmaPremiseFormula ) )
            	    // InternalRPL.g:5659:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    {
            	    // InternalRPL.g:5659:5: (lv_right_3_0= ruleConjunctionLemmaPremiseFormula )
            	    // InternalRPL.g:5660:6: lv_right_3_0= ruleConjunctionLemmaPremiseFormula
            	    {

            	    						newCompositeNode(grammarAccess.getConjunctionLemmaPremiseFormulaAccess().getRightConjunctionLemmaPremiseFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop103;
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
    // InternalRPL.g:5682:1: entryRulePrimaryLemmaPremiseFormula returns [EObject current=null] : iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF ;
    public final EObject entryRulePrimaryLemmaPremiseFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryLemmaPremiseFormula = null;


        try {
            // InternalRPL.g:5682:67: (iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF )
            // InternalRPL.g:5683:2: iv_rulePrimaryLemmaPremiseFormula= rulePrimaryLemmaPremiseFormula EOF
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
    // InternalRPL.g:5689:1: rulePrimaryLemmaPremiseFormula returns [EObject current=null] : ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) ;
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
            // InternalRPL.g:5695:2: ( ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) ) )
            // InternalRPL.g:5696:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            {
            // InternalRPL.g:5696:2: ( ( (lv_atomic_0_0= ruleNegationFormula ) ) | ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) ) | ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) ) | (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' ) )
            int alt104=4;
            switch ( input.LA(1) ) {
            case RULE_NEGATION:
            case RULE_BOOLEAN_LITERAL:
            case 36:
                {
                alt104=1;
                }
                break;
            case RULE_ID:
                {
                int LA104_2 = input.LA(2);

                if ( (LA104_2==24) ) {
                    int LA104_5 = input.LA(3);

                    if ( (LA104_5==RULE_ID) ) {
                        alt104=1;
                    }
                    else if ( (LA104_5==25||LA104_5==29||(LA104_5>=37 && LA104_5<=38)||LA104_5==42) ) {
                        alt104=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA104_2==EOF||(LA104_2>=RULE_DISJUNCTION && LA104_2<=RULE_CONJUNCTION)||LA104_2==30||LA104_2==57) ) {
                    alt104=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                alt104=2;
                }
                break;
            case 24:
                {
                alt104=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalRPL.g:5697:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    {
                    // InternalRPL.g:5697:3: ( (lv_atomic_0_0= ruleNegationFormula ) )
                    // InternalRPL.g:5698:4: (lv_atomic_0_0= ruleNegationFormula )
                    {
                    // InternalRPL.g:5698:4: (lv_atomic_0_0= ruleNegationFormula )
                    // InternalRPL.g:5699:5: lv_atomic_0_0= ruleNegationFormula
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
                    // InternalRPL.g:5717:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    {
                    // InternalRPL.g:5717:3: ( (lv_alwaysImp_1_0= ruleAlwaysImplication ) )
                    // InternalRPL.g:5718:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    {
                    // InternalRPL.g:5718:4: (lv_alwaysImp_1_0= ruleAlwaysImplication )
                    // InternalRPL.g:5719:5: lv_alwaysImp_1_0= ruleAlwaysImplication
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
                    // InternalRPL.g:5737:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    {
                    // InternalRPL.g:5737:3: ( (lv_inst_2_0= rulePastExtraInvariantPatternInstance ) )
                    // InternalRPL.g:5738:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    {
                    // InternalRPL.g:5738:4: (lv_inst_2_0= rulePastExtraInvariantPatternInstance )
                    // InternalRPL.g:5739:5: lv_inst_2_0= rulePastExtraInvariantPatternInstance
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
                    // InternalRPL.g:5757:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    {
                    // InternalRPL.g:5757:3: (otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')' )
                    // InternalRPL.g:5758:4: otherlv_3= '(' ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_59); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalRPL.g:5762:4: ( (lv_nestedFormula_4_0= ruleLemmaPremiseFormula ) )
                    // InternalRPL.g:5763:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    {
                    // InternalRPL.g:5763:5: (lv_nestedFormula_4_0= ruleLemmaPremiseFormula )
                    // InternalRPL.g:5764:6: lv_nestedFormula_4_0= ruleLemmaPremiseFormula
                    {

                    						newCompositeNode(grammarAccess.getPrimaryLemmaPremiseFormulaAccess().getNestedFormulaLemmaPremiseFormulaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalRPL.g:5790:1: entryRuleAlwaysImplication returns [EObject current=null] : iv_ruleAlwaysImplication= ruleAlwaysImplication EOF ;
    public final EObject entryRuleAlwaysImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplication = null;


        try {
            // InternalRPL.g:5790:58: (iv_ruleAlwaysImplication= ruleAlwaysImplication EOF )
            // InternalRPL.g:5791:2: iv_ruleAlwaysImplication= ruleAlwaysImplication EOF
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
    // InternalRPL.g:5797:1: ruleAlwaysImplication returns [EObject current=null] : (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) ;
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
            // InternalRPL.g:5803:2: ( (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' ) )
            // InternalRPL.g:5804:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            {
            // InternalRPL.g:5804:2: (otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')' )
            // InternalRPL.g:5805:3: otherlv_0= 'alwaysimp' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) ) otherlv_5= ',' ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationAccess().getAlwaysimpKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlwaysImplicationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5813:3: ( (otherlv_2= RULE_ID ) )
            // InternalRPL.g:5814:4: (otherlv_2= RULE_ID )
            {
            // InternalRPL.g:5814:4: (otherlv_2= RULE_ID )
            // InternalRPL.g:5815:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlwaysImplicationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationAccess().getStateUpdateStateVariableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_3());
            		
            // InternalRPL.g:5830:3: ( (lv_left_4_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:5831:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:5831:4: (lv_left_4_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:5832:5: lv_left_4_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getLeftAlwaysImplicationParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_62);
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

            otherlv_5=(Token)match(input,27,FOLLOW_63); 

            			newLeafNode(otherlv_5, grammarAccess.getAlwaysImplicationAccess().getCommaKeyword_5());
            		
            // InternalRPL.g:5853:3: ( (lv_right_6_0= ruleAlwaysImplicationParameterValue ) )
            // InternalRPL.g:5854:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            {
            // InternalRPL.g:5854:4: (lv_right_6_0= ruleAlwaysImplicationParameterValue )
            // InternalRPL.g:5855:5: lv_right_6_0= ruleAlwaysImplicationParameterValue
            {

            					newCompositeNode(grammarAccess.getAlwaysImplicationAccess().getRightAlwaysImplicationParameterValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalRPL.g:5880:1: entryRuleAlwaysImplicationParameterValue returns [EObject current=null] : iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF ;
    public final EObject entryRuleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlwaysImplicationParameterValue = null;


        try {
            // InternalRPL.g:5880:72: (iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF )
            // InternalRPL.g:5881:2: iv_ruleAlwaysImplicationParameterValue= ruleAlwaysImplicationParameterValue EOF
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
    // InternalRPL.g:5887:1: ruleAlwaysImplicationParameterValue returns [EObject current=null] : ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) ;
    public final EObject ruleAlwaysImplicationParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_state_1_0 = null;

        EObject lv_formula_3_0 = null;



        	enterRule();

        try {
            // InternalRPL.g:5893:2: ( ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) ) )
            // InternalRPL.g:5894:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            {
            // InternalRPL.g:5894:2: ( (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) ) )
            // InternalRPL.g:5895:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )? ( (lv_formula_3_0= ruleNegationFormula ) )
            {
            // InternalRPL.g:5895:3: (otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==34) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalRPL.g:5896:4: otherlv_0= 'lambda' ( (lv_state_1_0= ruleUpdateStateVariable ) ) otherlv_2= '.'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlwaysImplicationParameterValueAccess().getLambdaKeyword_0_0());
                    			
                    // InternalRPL.g:5900:4: ( (lv_state_1_0= ruleUpdateStateVariable ) )
                    // InternalRPL.g:5901:5: (lv_state_1_0= ruleUpdateStateVariable )
                    {
                    // InternalRPL.g:5901:5: (lv_state_1_0= ruleUpdateStateVariable )
                    // InternalRPL.g:5902:6: lv_state_1_0= ruleUpdateStateVariable
                    {

                    						newCompositeNode(grammarAccess.getAlwaysImplicationParameterValueAccess().getStateUpdateStateVariableParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

                    otherlv_2=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlwaysImplicationParameterValueAccess().getFullStopKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRPL.g:5924:3: ( (lv_formula_3_0= ruleNegationFormula ) )
            // InternalRPL.g:5925:4: (lv_formula_3_0= ruleNegationFormula )
            {
            // InternalRPL.g:5925:4: (lv_formula_3_0= ruleNegationFormula )
            // InternalRPL.g:5926:5: lv_formula_3_0= ruleNegationFormula
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
    // InternalRPL.g:5947:1: entryRulePastExtraInvariantPatternInstance returns [EObject current=null] : iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF ;
    public final EObject entryRulePastExtraInvariantPatternInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePastExtraInvariantPatternInstance = null;


        try {
            // InternalRPL.g:5947:74: (iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF )
            // InternalRPL.g:5948:2: iv_rulePastExtraInvariantPatternInstance= rulePastExtraInvariantPatternInstance EOF
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
    // InternalRPL.g:5954:1: rulePastExtraInvariantPatternInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) ;
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
            // InternalRPL.g:5960:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' ) )
            // InternalRPL.g:5961:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            {
            // InternalRPL.g:5961:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')' )
            // InternalRPL.g:5962:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )? (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )? (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )? (otherlv_17= 'current' | otherlv_18= 'final' ) ( (otherlv_19= RULE_ID ) ) otherlv_20= ')'
            {
            // InternalRPL.g:5962:3: ( (otherlv_0= RULE_ID ) )
            // InternalRPL.g:5963:4: (otherlv_0= RULE_ID )
            {
            // InternalRPL.g:5963:4: (otherlv_0= RULE_ID )
            // InternalRPL.g:5964:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getPatternPastExtraInvariantPatternCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRPL.g:5979:3: (otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==25) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalRPL.g:5980:4: otherlv_2= 'const' otherlv_3= ':' ( (lv_cParams_4_0= ruleConstantParameter ) ) (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getConstKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_2_1());
                    			
                    // InternalRPL.g:5988:4: ( (lv_cParams_4_0= ruleConstantParameter ) )
                    // InternalRPL.g:5989:5: (lv_cParams_4_0= ruleConstantParameter )
                    {
                    // InternalRPL.g:5989:5: (lv_cParams_4_0= ruleConstantParameter )
                    // InternalRPL.g:5990:6: lv_cParams_4_0= ruleConstantParameter
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

                    // InternalRPL.g:6007:4: (otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==27) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalRPL.g:6008:5: otherlv_5= ',' ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalRPL.g:6012:5: ( (lv_cParams_6_0= ruleConstantParameter ) )
                    	    // InternalRPL.g:6013:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    {
                    	    // InternalRPL.g:6013:6: (lv_cParams_6_0= ruleConstantParameter )
                    	    // InternalRPL.g:6014:7: lv_cParams_6_0= ruleConstantParameter
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
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6033:3: (otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==42) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalRPL.g:6034:4: otherlv_7= 'fun' otherlv_8= ':' ( (lv_fnParams_9_0= ruleFunctionalParameter ) ) (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFunKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_3_1());
                    			
                    // InternalRPL.g:6042:4: ( (lv_fnParams_9_0= ruleFunctionalParameter ) )
                    // InternalRPL.g:6043:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    {
                    // InternalRPL.g:6043:5: (lv_fnParams_9_0= ruleFunctionalParameter )
                    // InternalRPL.g:6044:6: lv_fnParams_9_0= ruleFunctionalParameter
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

                    // InternalRPL.g:6061:4: (otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==27) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalRPL.g:6062:5: otherlv_10= ',' ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRPL.g:6066:5: ( (lv_fnParams_11_0= ruleFunctionalParameter ) )
                    	    // InternalRPL.g:6067:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    {
                    	    // InternalRPL.g:6067:6: (lv_fnParams_11_0= ruleFunctionalParameter )
                    	    // InternalRPL.g:6068:7: lv_fnParams_11_0= ruleFunctionalParameter
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
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6087:3: (otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )* )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==29) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalRPL.g:6088:4: otherlv_12= 'formulas' otherlv_13= ':' ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) ) (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFormulasKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getColonKeyword_4_1());
                    			
                    // InternalRPL.g:6096:4: ( (lv_fmParams_14_0= ruleRegularFormulaParameter ) )
                    // InternalRPL.g:6097:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    {
                    // InternalRPL.g:6097:5: (lv_fmParams_14_0= ruleRegularFormulaParameter )
                    // InternalRPL.g:6098:6: lv_fmParams_14_0= ruleRegularFormulaParameter
                    {

                    						newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_68);
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

                    // InternalRPL.g:6115:4: (otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==27) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalRPL.g:6116:5: otherlv_15= ',' ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRPL.g:6120:5: ( (lv_fmParams_16_0= ruleRegularFormulaParameter ) )
                    	    // InternalRPL.g:6121:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    {
                    	    // InternalRPL.g:6121:6: (lv_fmParams_16_0= ruleRegularFormulaParameter )
                    	    // InternalRPL.g:6122:7: lv_fmParams_16_0= ruleRegularFormulaParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFmParamsRegularFormulaParameterParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_68);
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
                    	    break loop110;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRPL.g:6141:3: (otherlv_17= 'current' | otherlv_18= 'final' )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==38) ) {
                alt112=1;
            }
            else if ( (LA112_0==37) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalRPL.g:6142:4: otherlv_17= 'current'
                    {
                    otherlv_17=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getCurrentKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRPL.g:6147:4: otherlv_18= 'final'
                    {
                    otherlv_18=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_18, grammarAccess.getPastExtraInvariantPatternInstanceAccess().getFinalKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalRPL.g:6152:3: ( (otherlv_19= RULE_ID ) )
            // InternalRPL.g:6153:4: (otherlv_19= RULE_ID )
            {
            // InternalRPL.g:6153:4: (otherlv_19= RULE_ID )
            // InternalRPL.g:6154:5: otherlv_19= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPastExtraInvariantPatternInstanceRule());
            					}
            				
            otherlv_19=(Token)match(input,RULE_ID,FOLLOW_22); 

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
    // InternalRPL.g:6173:1: ruleEqPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEqPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6179:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalRPL.g:6180:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalRPL.g:6180:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==31) ) {
                alt113=1;
            }
            else if ( (LA113_0==69) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalRPL.g:6181:3: (enumLiteral_0= '=' )
                    {
                    // InternalRPL.g:6181:3: (enumLiteral_0= '=' )
                    // InternalRPL.g:6182:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEqPredicateAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6189:3: (enumLiteral_1= '<>' )
                    {
                    // InternalRPL.g:6189:3: (enumLiteral_1= '<>' )
                    // InternalRPL.g:6190:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

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
    // InternalRPL.g:6200:1: ruleCompPredicate returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompPredicate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRPL.g:6206:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalRPL.g:6207:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalRPL.g:6207:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt114=1;
                }
                break;
            case 71:
                {
                alt114=2;
                }
                break;
            case 72:
                {
                alt114=3;
                }
                break;
            case 73:
                {
                alt114=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalRPL.g:6208:3: (enumLiteral_0= '<' )
                    {
                    // InternalRPL.g:6208:3: (enumLiteral_0= '<' )
                    // InternalRPL.g:6209:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompPredicateAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6216:3: (enumLiteral_1= '>' )
                    {
                    // InternalRPL.g:6216:3: (enumLiteral_1= '>' )
                    // InternalRPL.g:6217:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompPredicateAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6224:3: (enumLiteral_2= '<=' )
                    {
                    // InternalRPL.g:6224:3: (enumLiteral_2= '<=' )
                    // InternalRPL.g:6225:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompPredicateAccess().getLESS_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6232:3: (enumLiteral_3= '>=' )
                    {
                    // InternalRPL.g:6232:3: (enumLiteral_3= '>=' )
                    // InternalRPL.g:6233:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

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
    // InternalRPL.g:6243:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRPL.g:6249:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalRPL.g:6250:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalRPL.g:6250:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==74) ) {
                alt115=1;
            }
            else if ( (LA115_0==48) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalRPL.g:6251:3: (enumLiteral_0= '+' )
                    {
                    // InternalRPL.g:6251:3: (enumLiteral_0= '+' )
                    // InternalRPL.g:6252:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6259:3: (enumLiteral_1= '-' )
                    {
                    // InternalRPL.g:6259:3: (enumLiteral_1= '-' )
                    // InternalRPL.g:6260:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalRPL.g:6270:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRPL.g:6276:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) ) )
            // InternalRPL.g:6277:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            {
            // InternalRPL.g:6277:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'mod' ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt116=1;
                }
                break;
            case 76:
                {
                alt116=2;
                }
                break;
            case 77:
                {
                alt116=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalRPL.g:6278:3: (enumLiteral_0= '*' )
                    {
                    // InternalRPL.g:6278:3: (enumLiteral_0= '*' )
                    // InternalRPL.g:6279:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6286:3: (enumLiteral_1= '/' )
                    {
                    // InternalRPL.g:6286:3: (enumLiteral_1= '/' )
                    // InternalRPL.g:6287:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6294:3: (enumLiteral_2= 'mod' )
                    {
                    // InternalRPL.g:6294:3: (enumLiteral_2= 'mod' )
                    // InternalRPL.g:6295:4: enumLiteral_2= 'mod'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

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
    // InternalRPL.g:6305:1: ruleUnMinus returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleUnMinus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRPL.g:6311:2: ( (enumLiteral_0= '-' ) )
            // InternalRPL.g:6312:2: (enumLiteral_0= '-' )
            {
            // InternalRPL.g:6312:2: (enumLiteral_0= '-' )
            // InternalRPL.g:6313:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

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


    protected DFA100 dfa100 = new DFA100(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\34\11\uffff";
    static final String dfa_4s = "\1\103\11\uffff";
    static final String dfa_5s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\10\uffff\1\10\4\uffff\1\3\6\uffff\1\6\1\5\3\uffff\12\1\1\2\1\7\1\uffff\1\11",
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

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 4995:5: ( ({...}? => ( ({...}? => (otherlv_1= 'lemma' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'const' otherlv_5= ':' ( (lv_cVars_6_0= ruleConstantParameter ) ) (otherlv_7= ',' ( (lv_cVars_8_0= ruleConstantParameter ) ) )* )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fun' otherlv_10= ':' ( (lv_fnVars_11_0= ruleFunctionalParameter ) ) (otherlv_12= ',' ( (lv_fnVars_13_0= ruleFunctionalParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'simple' otherlv_15= 'formulas' otherlv_16= ':' ( (lv_simpleFmVars_17_0= ruleSimpleFormulaParameter ) ) (otherlv_18= ',' ( (lv_simpleFmVars_19_0= ruleSimpleFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'extra' otherlv_21= 'invariant' otherlv_22= 'formulas' otherlv_23= ':' ( (lv_ifmVars_24_0= ruleRegularFormulaParameter ) ) (otherlv_25= ',' ( (lv_ifmVars_26_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'requirement' otherlv_28= 'formulas' otherlv_29= ':' ( (lv_rfmVars_30_0= ruleRegularFormulaParameter ) ) (otherlv_31= ',' ( (lv_rfmVars_32_0= ruleRegularFormulaParameter ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'init' otherlv_34= 'state' otherlv_35= ':' ( (lv_initState_36_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'final' otherlv_38= 'state' otherlv_39= ':' ( (lv_finalState_40_0= ruleUpdateStateVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'premise' ( (lv_prem_42_0= ruleLemmaPremiseFormula ) ) otherlv_43= '}' otherlv_44= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_0 = input.LA(1);

                         
                        int index100_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA100_0==EOF||(LA100_0>=54 && LA100_0<=63)) ) {s = 1;}

                        else if ( LA100_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA100_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA100_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA100_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA100_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA100_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA100_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA100_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getLemmaAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index100_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00061B8200500002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00061B8200400002L});
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000001001660L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001401000620L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000620L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002062000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002068000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002048000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040062000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040068000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040072000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040078000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000001001460L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x00000000000003C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00061B8200400000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0006042010000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x3E00000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xC200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0006042012000002L,0x000000000000000BL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0006042018000002L,0x000000000000000BL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0006042010000002L,0x000000000000000BL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000001001000620L,0x0000000000000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000001400000620L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000046022000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000046028000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000006028000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000006008000000L});

}
