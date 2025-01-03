package su.nsk.iae.rpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRPLLexer extends Lexer {
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

    public InternalRPLLexer() {;} 
    public InternalRPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRPL.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:11:7: ( 'import' )
            // InternalRPL.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:12:7: ( ';' )
            // InternalRPL.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:13:7: ( 'derivedreq' )
            // InternalRPL.g:13:9: 'derivedreq'
            {
            match("derivedreq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:14:7: ( 'pattern' )
            // InternalRPL.g:14:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:15:7: ( '(' )
            // InternalRPL.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:16:7: ( 'const' )
            // InternalRPL.g:16:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:17:7: ( ':' )
            // InternalRPL.g:17:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:18:7: ( ',' )
            // InternalRPL.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:19:7: ( 'formulas' )
            // InternalRPL.g:19:9: 'formulas'
            {
            match("formulas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:20:7: ( ')' )
            // InternalRPL.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:21:7: ( '=' )
            // InternalRPL.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:22:7: ( 'from' )
            // InternalRPL.g:22:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:23:7: ( 'with' )
            // InternalRPL.g:23:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:24:7: ( 'var' )
            // InternalRPL.g:24:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:25:7: ( 'lambda' )
            // InternalRPL.g:25:9: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:26:7: ( '.' )
            // InternalRPL.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:27:7: ( 'frm' )
            // InternalRPL.g:27:9: 'frm'
            {
            match("frm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:28:7: ( 'final' )
            // InternalRPL.g:28:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:29:7: ( 'current' )
            // InternalRPL.g:29:9: 'current'
            {
            match("current"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:30:7: ( 'futurereq' )
            // InternalRPL.g:30:9: 'futurereq'
            {
            match("futurereq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:31:7: ( 'pastreq' )
            // InternalRPL.g:31:9: 'pastreq'
            {
            match("pastreq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:32:7: ( 'futureeinv' )
            // InternalRPL.g:32:9: 'futureeinv'
            {
            match("futureeinv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:33:7: ( 'fun' )
            // InternalRPL.g:33:9: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:34:7: ( 'pasteinv' )
            // InternalRPL.g:34:9: 'pasteinv'
            {
            match("pasteinv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:35:7: ( 'derivedeinv' )
            // InternalRPL.g:35:9: 'derivedeinv'
            {
            match("derivedeinv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:36:7: ( '/' )
            // InternalRPL.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:37:7: ( '..' )
            // InternalRPL.g:37:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:38:7: ( '[' )
            // InternalRPL.g:38:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:39:7: ( ']' )
            // InternalRPL.g:39:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:40:7: ( '-' )
            // InternalRPL.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:41:7: ( 'requirement' )
            // InternalRPL.g:41:9: 'requirement'
            {
            match("requirement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:42:7: ( 'extra' )
            // InternalRPL.g:42:9: 'extra'
            {
            match("extra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:43:7: ( 'invariant' )
            // InternalRPL.g:43:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:44:7: ( 'for' )
            // InternalRPL.g:44:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:45:7: ( 'lemmas' )
            // InternalRPL.g:45:9: 'lemmas'
            {
            match("lemmas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:46:7: ( '{' )
            // InternalRPL.g:46:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:47:7: ( 'LS1' )
            // InternalRPL.g:47:9: 'LS1'
            {
            match("LS1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:48:7: ( 'LS2' )
            // InternalRPL.g:48:9: 'LS2'
            {
            match("LS2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:49:7: ( 'LS3' )
            // InternalRPL.g:49:9: 'LS3'
            {
            match("LS3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:50:7: ( '}' )
            // InternalRPL.g:50:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:51:7: ( 'LS4' )
            // InternalRPL.g:51:9: 'LS4'
            {
            match("LS4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:52:7: ( 'LS5' )
            // InternalRPL.g:52:9: 'LS5'
            {
            match("LS5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:53:7: ( 'LS6' )
            // InternalRPL.g:53:9: 'LS6'
            {
            match("LS6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:54:7: ( 'LS7' )
            // InternalRPL.g:54:9: 'LS7'
            {
            match("LS7"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:55:7: ( 'LS8' )
            // InternalRPL.g:55:9: 'LS8'
            {
            match("LS8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:56:7: ( 'LS9' )
            // InternalRPL.g:56:9: 'LS9'
            {
            match("LS9"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:57:7: ( 'lemma' )
            // InternalRPL.g:57:9: 'lemma'
            {
            match("lemma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:58:7: ( 'init' )
            // InternalRPL.g:58:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:59:7: ( 'state' )
            // InternalRPL.g:59:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:60:7: ( 'premise' )
            // InternalRPL.g:60:9: 'premise'
            {
            match("premise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:61:7: ( 'alwaysimp' )
            // InternalRPL.g:61:9: 'alwaysimp'
            {
            match("alwaysimp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:62:7: ( '==' )
            // InternalRPL.g:62:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:63:7: ( '~=' )
            // InternalRPL.g:63:9: '~='
            {
            match("~="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:64:7: ( '<' )
            // InternalRPL.g:64:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:65:7: ( '>' )
            // InternalRPL.g:65:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:66:7: ( '<=' )
            // InternalRPL.g:66:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:67:7: ( '>=' )
            // InternalRPL.g:67:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:68:7: ( '+' )
            // InternalRPL.g:68:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:69:7: ( '*' )
            // InternalRPL.g:69:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:70:7: ( 'mod' )
            // InternalRPL.g:70:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_DISJUNCTION"
    public final void mRULE_DISJUNCTION() throws RecognitionException {
        try {
            int _type = RULE_DISJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6142:18: ( ( 'OR' | '||' | '\\\\/' ) )
            // InternalRPL.g:6142:20: ( 'OR' | '||' | '\\\\/' )
            {
            // InternalRPL.g:6142:20: ( 'OR' | '||' | '\\\\/' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt1=1;
                }
                break;
            case '|':
                {
                alt1=2;
                }
                break;
            case '\\':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRPL.g:6142:21: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6142:26: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 3 :
                    // InternalRPL.g:6142:31: '\\\\/'
                    {
                    match("\\/"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISJUNCTION"

    // $ANTLR start "RULE_CONJUNCTION"
    public final void mRULE_CONJUNCTION() throws RecognitionException {
        try {
            int _type = RULE_CONJUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6144:18: ( ( 'AND' | '&' | '&&' | '/\\\\' ) )
            // InternalRPL.g:6144:20: ( 'AND' | '&' | '&&' | '/\\\\' )
            {
            // InternalRPL.g:6144:20: ( 'AND' | '&' | '&&' | '/\\\\' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'A':
                {
                alt2=1;
                }
                break;
            case '&':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='&') ) {
                    alt2=3;
                }
                else {
                    alt2=2;}
                }
                break;
            case '/':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRPL.g:6144:21: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6144:27: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 3 :
                    // InternalRPL.g:6144:31: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 4 :
                    // InternalRPL.g:6144:36: '/\\\\'
                    {
                    match("/\\"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONJUNCTION"

    // $ANTLR start "RULE_NEGATION"
    public final void mRULE_NEGATION() throws RecognitionException {
        try {
            int _type = RULE_NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6146:15: ( ( 'NOT' | '~' ) )
            // InternalRPL.g:6146:17: ( 'NOT' | '~' )
            {
            // InternalRPL.g:6146:17: ( 'NOT' | '~' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='N') ) {
                alt3=1;
            }
            else if ( (LA3_0=='~') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRPL.g:6146:18: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6146:24: '~'
                    {
                    match('~'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEGATION"

    // $ANTLR start "RULE_POWER_OPERATOR"
    public final void mRULE_POWER_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_POWER_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6148:21: ( '**' )
            // InternalRPL.g:6148:23: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POWER_OPERATOR"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6150:22: ( ( 'True' | 'False' ) )
            // InternalRPL.g:6150:24: ( 'True' | 'False' )
            {
            // InternalRPL.g:6150:24: ( 'True' | 'False' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='T') ) {
                alt4=1;
            }
            else if ( (LA4_0=='F') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRPL.g:6150:25: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 2 :
                    // InternalRPL.g:6150:32: 'False'
                    {
                    match("False"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_LITERAL"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6152:14: ( ( RULE_DIGIT )+ )
            // InternalRPL.g:6152:16: ( RULE_DIGIT )+
            {
            // InternalRPL.g:6152:16: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRPL.g:6152:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRPL.g:6154:21: ( '0' .. '9' )
            // InternalRPL.g:6154:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6156:11: ( RULE_INTEGER '.' RULE_INTEGER )
            // InternalRPL.g:6156:13: RULE_INTEGER '.' RULE_INTEGER
            {
            mRULE_INTEGER(); 
            match('.'); 
            mRULE_INTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_IMPLICATION"
    public final void mRULE_IMPLICATION() throws RecognitionException {
        try {
            int _type = RULE_IMPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6158:18: ( '-->' )
            // InternalRPL.g:6158:20: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPLICATION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6160:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRPL.g:6160:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRPL.g:6160:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRPL.g:6160:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRPL.g:6160:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6162:10: ( ( '0' .. '9' )+ )
            // InternalRPL.g:6162:12: ( '0' .. '9' )+
            {
            // InternalRPL.g:6162:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRPL.g:6162:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6164:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRPL.g:6164:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRPL.g:6164:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRPL.g:6164:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRPL.g:6164:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRPL.g:6164:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRPL.g:6164:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRPL.g:6164:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRPL.g:6164:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRPL.g:6164:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRPL.g:6164:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6166:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRPL.g:6166:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRPL.g:6166:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRPL.g:6166:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6168:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRPL.g:6168:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRPL.g:6168:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRPL.g:6168:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalRPL.g:6168:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRPL.g:6168:41: ( '\\r' )? '\\n'
                    {
                    // InternalRPL.g:6168:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRPL.g:6168:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6170:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRPL.g:6170:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRPL.g:6170:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRPL.g:6172:16: ( . )
            // InternalRPL.g:6172:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRPL.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_DISJUNCTION | RULE_CONJUNCTION | RULE_NEGATION | RULE_POWER_OPERATOR | RULE_BOOLEAN_LITERAL | RULE_INTEGER | RULE_REAL | RULE_IMPLICATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=75;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalRPL.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // InternalRPL.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // InternalRPL.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // InternalRPL.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // InternalRPL.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // InternalRPL.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // InternalRPL.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // InternalRPL.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // InternalRPL.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // InternalRPL.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // InternalRPL.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // InternalRPL.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // InternalRPL.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // InternalRPL.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // InternalRPL.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // InternalRPL.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // InternalRPL.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // InternalRPL.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // InternalRPL.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // InternalRPL.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // InternalRPL.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // InternalRPL.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // InternalRPL.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // InternalRPL.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // InternalRPL.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // InternalRPL.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // InternalRPL.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // InternalRPL.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // InternalRPL.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // InternalRPL.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // InternalRPL.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // InternalRPL.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // InternalRPL.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // InternalRPL.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // InternalRPL.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // InternalRPL.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // InternalRPL.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // InternalRPL.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // InternalRPL.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // InternalRPL.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // InternalRPL.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // InternalRPL.g:1:256: T__61
                {
                mT__61(); 

                }
                break;
            case 43 :
                // InternalRPL.g:1:262: T__62
                {
                mT__62(); 

                }
                break;
            case 44 :
                // InternalRPL.g:1:268: T__63
                {
                mT__63(); 

                }
                break;
            case 45 :
                // InternalRPL.g:1:274: T__64
                {
                mT__64(); 

                }
                break;
            case 46 :
                // InternalRPL.g:1:280: T__65
                {
                mT__65(); 

                }
                break;
            case 47 :
                // InternalRPL.g:1:286: T__66
                {
                mT__66(); 

                }
                break;
            case 48 :
                // InternalRPL.g:1:292: T__67
                {
                mT__67(); 

                }
                break;
            case 49 :
                // InternalRPL.g:1:298: T__68
                {
                mT__68(); 

                }
                break;
            case 50 :
                // InternalRPL.g:1:304: T__69
                {
                mT__69(); 

                }
                break;
            case 51 :
                // InternalRPL.g:1:310: T__70
                {
                mT__70(); 

                }
                break;
            case 52 :
                // InternalRPL.g:1:316: T__71
                {
                mT__71(); 

                }
                break;
            case 53 :
                // InternalRPL.g:1:322: T__72
                {
                mT__72(); 

                }
                break;
            case 54 :
                // InternalRPL.g:1:328: T__73
                {
                mT__73(); 

                }
                break;
            case 55 :
                // InternalRPL.g:1:334: T__74
                {
                mT__74(); 

                }
                break;
            case 56 :
                // InternalRPL.g:1:340: T__75
                {
                mT__75(); 

                }
                break;
            case 57 :
                // InternalRPL.g:1:346: T__76
                {
                mT__76(); 

                }
                break;
            case 58 :
                // InternalRPL.g:1:352: T__77
                {
                mT__77(); 

                }
                break;
            case 59 :
                // InternalRPL.g:1:358: T__78
                {
                mT__78(); 

                }
                break;
            case 60 :
                // InternalRPL.g:1:364: T__79
                {
                mT__79(); 

                }
                break;
            case 61 :
                // InternalRPL.g:1:370: RULE_DISJUNCTION
                {
                mRULE_DISJUNCTION(); 

                }
                break;
            case 62 :
                // InternalRPL.g:1:387: RULE_CONJUNCTION
                {
                mRULE_CONJUNCTION(); 

                }
                break;
            case 63 :
                // InternalRPL.g:1:404: RULE_NEGATION
                {
                mRULE_NEGATION(); 

                }
                break;
            case 64 :
                // InternalRPL.g:1:418: RULE_POWER_OPERATOR
                {
                mRULE_POWER_OPERATOR(); 

                }
                break;
            case 65 :
                // InternalRPL.g:1:438: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 66 :
                // InternalRPL.g:1:459: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 67 :
                // InternalRPL.g:1:472: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 68 :
                // InternalRPL.g:1:482: RULE_IMPLICATION
                {
                mRULE_IMPLICATION(); 

                }
                break;
            case 69 :
                // InternalRPL.g:1:499: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalRPL.g:1:507: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // InternalRPL.g:1:516: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalRPL.g:1:528: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalRPL.g:1:544: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalRPL.g:1:560: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalRPL.g:1:568: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\62\1\uffff\2\62\1\uffff\1\62\2\uffff\1\62\1\uffff\1\102\3\62\1\110\1\114\2\uffff\1\120\2\62\1\uffff\1\62\1\uffff\2\62\1\131\1\133\1\135\1\uffff\1\140\2\62\2\57\1\62\1\uffff\3\62\1\150\1\57\1\uffff\2\57\2\uffff\2\62\2\uffff\3\62\1\uffff\2\62\2\uffff\4\62\3\uffff\4\62\12\uffff\2\62\1\uffff\1\62\1\uffff\2\62\11\uffff\1\62\1\143\1\uffff\4\62\1\uffff\1\150\3\uffff\11\62\1\u009c\1\62\1\u009e\2\62\1\u00a1\1\62\1\u00a3\4\62\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\2\62\1\u00b3\1\111\1\131\4\62\1\u00b8\7\62\1\uffff\1\u00c1\1\uffff\2\62\1\uffff\1\u00c4\1\uffff\4\62\11\uffff\2\62\1\uffff\1\u00cb\3\62\1\uffff\5\62\1\u00d4\2\62\1\uffff\1\u00d7\1\62\1\uffff\1\62\1\u00db\1\62\1\u00dd\1\u00de\1\62\1\uffff\1\u00cb\1\u00e0\6\62\1\uffff\2\62\1\uffff\1\62\1\u00eb\1\u00ec\1\uffff\1\62\2\uffff\1\62\1\uffff\2\62\1\u00f2\1\u00f3\1\62\1\u00f5\1\u00f6\3\62\2\uffff\5\62\2\uffff\1\u00ff\2\uffff\1\u0100\4\62\1\u0105\2\62\2\uffff\1\u0108\2\62\1\u010b\1\uffff\1\u010c\1\62\1\uffff\1\u010e\1\62\2\uffff\1\u0110\1\uffff\1\u0111\2\uffff";
    static final String DFA17_eofS =
        "\u0112\uffff";
    static final String DFA17_minS =
        "\1\0\1\155\1\uffff\1\145\1\141\1\uffff\1\157\2\uffff\1\151\1\uffff\1\75\1\151\2\141\1\56\1\52\2\uffff\1\55\1\145\1\170\1\uffff\1\123\1\uffff\1\164\1\154\3\75\1\uffff\1\52\1\157\1\122\1\174\1\57\1\116\1\uffff\1\117\1\162\1\141\1\56\1\101\1\uffff\2\0\2\uffff\1\160\1\151\2\uffff\1\162\1\163\1\145\1\uffff\1\156\1\162\2\uffff\1\162\1\155\2\156\3\uffff\1\164\1\162\2\155\12\uffff\1\161\1\164\1\uffff\1\61\1\uffff\1\141\1\167\11\uffff\1\144\1\60\1\uffff\1\104\1\124\1\165\1\154\1\uffff\1\56\3\uffff\1\157\1\141\1\164\1\151\2\164\1\155\1\163\1\162\1\60\1\155\1\60\1\141\1\165\1\60\1\150\1\60\1\142\1\155\1\165\1\162\11\60\1\164\1\141\3\60\1\145\1\163\2\162\1\60\1\166\2\145\1\151\1\164\1\145\1\165\1\uffff\1\60\1\uffff\1\154\1\162\1\uffff\1\60\1\uffff\1\144\1\141\1\151\1\141\11\uffff\1\145\1\171\1\uffff\1\60\1\145\1\164\1\151\1\uffff\1\145\1\162\1\145\1\151\1\163\1\60\1\156\1\154\1\uffff\1\60\1\145\1\uffff\1\141\1\60\1\162\2\60\1\163\1\uffff\2\60\1\141\1\144\1\156\1\161\1\156\1\145\1\uffff\1\164\1\141\1\uffff\1\145\2\60\1\uffff\1\145\2\uffff\1\151\1\uffff\1\156\1\145\2\60\1\166\2\60\1\163\1\145\1\151\2\uffff\2\155\1\164\1\145\1\151\2\uffff\1\60\2\uffff\1\60\1\161\1\156\1\145\1\160\1\60\1\161\1\156\2\uffff\1\60\1\166\1\156\1\60\1\uffff\1\60\1\166\1\uffff\1\60\1\164\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\156\1\uffff\1\145\1\162\1\uffff\1\165\2\uffff\1\165\1\uffff\1\75\1\151\1\141\1\145\1\56\1\134\2\uffff\1\55\1\145\1\170\1\uffff\1\123\1\uffff\1\164\1\154\3\75\1\uffff\1\52\1\157\1\122\1\174\1\57\1\116\1\uffff\1\117\1\162\1\141\1\71\1\172\1\uffff\2\uffff\2\uffff\1\160\1\166\2\uffff\1\162\1\164\1\145\1\uffff\1\156\1\162\2\uffff\1\162\1\157\1\156\1\164\3\uffff\1\164\1\162\2\155\12\uffff\1\161\1\164\1\uffff\1\71\1\uffff\1\141\1\167\11\uffff\1\144\1\172\1\uffff\1\104\1\124\1\165\1\154\1\uffff\1\71\3\uffff\1\157\1\141\1\164\1\151\2\164\1\155\1\163\1\162\1\172\1\155\1\172\1\141\1\165\1\172\1\150\1\172\1\142\1\155\1\165\1\162\11\172\1\164\1\141\3\172\1\145\1\163\2\162\1\172\1\166\1\145\1\162\1\151\1\164\1\145\1\165\1\uffff\1\172\1\uffff\1\154\1\162\1\uffff\1\172\1\uffff\1\144\1\141\1\151\1\141\11\uffff\1\145\1\171\1\uffff\1\172\1\145\1\164\1\151\1\uffff\1\145\1\162\1\145\1\151\1\163\1\172\1\156\1\154\1\uffff\1\172\1\145\1\uffff\1\141\1\172\1\162\2\172\1\163\1\uffff\2\172\1\141\1\144\1\156\1\161\1\156\1\145\1\uffff\1\164\1\141\1\uffff\1\162\2\172\1\uffff\1\145\2\uffff\1\151\1\uffff\1\156\1\162\2\172\1\166\2\172\1\163\1\145\1\151\2\uffff\2\155\1\164\1\145\1\151\2\uffff\1\172\2\uffff\1\172\1\161\1\156\1\145\1\160\1\172\1\161\1\156\2\uffff\1\172\1\166\1\156\1\172\1\uffff\1\172\1\166\1\uffff\1\172\1\164\2\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\uffff\1\7\1\10\1\uffff\1\12\6\uffff\1\34\1\35\3\uffff\1\44\1\uffff\1\50\5\uffff\1\72\6\uffff\1\76\5\uffff\1\105\2\uffff\1\112\1\113\2\uffff\1\105\1\2\3\uffff\1\5\2\uffff\1\7\1\10\4\uffff\1\12\1\64\1\13\4\uffff\1\33\1\20\1\76\1\110\1\111\1\32\1\34\1\35\1\104\1\36\2\uffff\1\44\1\uffff\1\50\2\uffff\1\65\1\77\1\70\1\66\1\71\1\67\1\72\1\100\1\73\2\uffff\1\75\4\uffff\1\102\1\uffff\1\103\1\107\1\112\57\uffff\1\42\1\uffff\1\21\2\uffff\1\27\1\uffff\1\16\4\uffff\1\45\1\46\1\47\1\51\1\52\1\53\1\54\1\55\1\56\2\uffff\1\74\4\uffff\1\60\10\uffff\1\14\2\uffff\1\15\6\uffff\1\101\10\uffff\1\6\2\uffff\1\22\3\uffff\1\57\1\uffff\1\40\1\61\1\uffff\1\1\12\uffff\1\17\1\43\5\uffff\1\4\1\25\1\uffff\1\62\1\23\10\uffff\1\30\1\11\4\uffff\1\41\2\uffff\1\24\2\uffff\1\63\1\3\1\uffff\1\26\1\uffff\1\31\1\37";
    static final String DFA17_specialS =
        "\1\0\53\uffff\1\2\1\1\u00e4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\57\1\54\3\57\1\45\1\55\1\5\1\12\1\37\1\36\1\10\1\23\1\17\1\20\12\51\1\7\1\2\1\34\1\13\1\35\2\57\1\44\4\53\1\50\5\53\1\27\1\53\1\46\1\41\4\53\1\47\6\53\1\21\1\43\1\22\1\52\1\53\1\57\1\32\1\53\1\6\1\3\1\25\1\11\2\53\1\1\2\53\1\16\1\40\2\53\1\4\1\53\1\24\1\31\2\53\1\15\1\14\3\53\1\26\1\42\1\30\1\33\uff81\57",
            "\1\60\1\61",
            "",
            "\1\64",
            "\1\65\20\uffff\1\66",
            "",
            "\1\70\5\uffff\1\71",
            "",
            "",
            "\1\76\5\uffff\1\74\2\uffff\1\75\2\uffff\1\77",
            "",
            "\1\101",
            "\1\103",
            "\1\104",
            "\1\105\3\uffff\1\106",
            "\1\107",
            "\1\112\4\uffff\1\113\54\uffff\1\111",
            "",
            "",
            "\1\117",
            "\1\121",
            "\1\122",
            "",
            "\1\124",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132",
            "\1\134",
            "",
            "\1\137",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\152\1\uffff\12\151",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\0\153",
            "\0\153",
            "",
            "",
            "\1\155",
            "\1\157\14\uffff\1\156",
            "",
            "",
            "\1\160",
            "\1\162\1\161",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\166",
            "\1\170\1\uffff\1\167",
            "\1\171",
            "\1\173\5\uffff\1\172",
            "",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\152\1\uffff\12\151",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u009b\15\62",
            "\1\u009d",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u009f",
            "\1\u00a0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b1",
            "\1\u00b2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bc\14\uffff\1\u00bb",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00da\7\62",
            "\1\u00dc",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00df",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00ea\14\uffff\1\u00e9",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f1\14\uffff\1\u00f0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00f4",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0106",
            "\1\u0107",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0109",
            "\1\u010a",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u010d",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u010f",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_DISJUNCTION | RULE_CONJUNCTION | RULE_NEGATION | RULE_POWER_OPERATOR | RULE_BOOLEAN_LITERAL | RULE_INTEGER | RULE_REAL | RULE_IMPLICATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='i') ) {s = 1;}

                        else if ( (LA17_0==';') ) {s = 2;}

                        else if ( (LA17_0=='d') ) {s = 3;}

                        else if ( (LA17_0=='p') ) {s = 4;}

                        else if ( (LA17_0=='(') ) {s = 5;}

                        else if ( (LA17_0=='c') ) {s = 6;}

                        else if ( (LA17_0==':') ) {s = 7;}

                        else if ( (LA17_0==',') ) {s = 8;}

                        else if ( (LA17_0=='f') ) {s = 9;}

                        else if ( (LA17_0==')') ) {s = 10;}

                        else if ( (LA17_0=='=') ) {s = 11;}

                        else if ( (LA17_0=='w') ) {s = 12;}

                        else if ( (LA17_0=='v') ) {s = 13;}

                        else if ( (LA17_0=='l') ) {s = 14;}

                        else if ( (LA17_0=='.') ) {s = 15;}

                        else if ( (LA17_0=='/') ) {s = 16;}

                        else if ( (LA17_0=='[') ) {s = 17;}

                        else if ( (LA17_0==']') ) {s = 18;}

                        else if ( (LA17_0=='-') ) {s = 19;}

                        else if ( (LA17_0=='r') ) {s = 20;}

                        else if ( (LA17_0=='e') ) {s = 21;}

                        else if ( (LA17_0=='{') ) {s = 22;}

                        else if ( (LA17_0=='L') ) {s = 23;}

                        else if ( (LA17_0=='}') ) {s = 24;}

                        else if ( (LA17_0=='s') ) {s = 25;}

                        else if ( (LA17_0=='a') ) {s = 26;}

                        else if ( (LA17_0=='~') ) {s = 27;}

                        else if ( (LA17_0=='<') ) {s = 28;}

                        else if ( (LA17_0=='>') ) {s = 29;}

                        else if ( (LA17_0=='+') ) {s = 30;}

                        else if ( (LA17_0=='*') ) {s = 31;}

                        else if ( (LA17_0=='m') ) {s = 32;}

                        else if ( (LA17_0=='O') ) {s = 33;}

                        else if ( (LA17_0=='|') ) {s = 34;}

                        else if ( (LA17_0=='\\') ) {s = 35;}

                        else if ( (LA17_0=='A') ) {s = 36;}

                        else if ( (LA17_0=='&') ) {s = 37;}

                        else if ( (LA17_0=='N') ) {s = 38;}

                        else if ( (LA17_0=='T') ) {s = 39;}

                        else if ( (LA17_0=='F') ) {s = 40;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 41;}

                        else if ( (LA17_0=='^') ) {s = 42;}

                        else if ( ((LA17_0>='B' && LA17_0<='E')||(LA17_0>='G' && LA17_0<='K')||LA17_0=='M'||(LA17_0>='P' && LA17_0<='S')||(LA17_0>='U' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='k')||(LA17_0>='n' && LA17_0<='o')||LA17_0=='q'||(LA17_0>='t' && LA17_0<='u')||(LA17_0>='x' && LA17_0<='z')) ) {s = 43;}

                        else if ( (LA17_0=='\"') ) {s = 44;}

                        else if ( (LA17_0=='\'') ) {s = 45;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 46;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='%')||(LA17_0>='?' && LA17_0<='@')||LA17_0=='`'||(LA17_0>='\u007F' && LA17_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( ((LA17_45>='\u0000' && LA17_45<='\uFFFF')) ) {s = 107;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_44 = input.LA(1);

                        s = -1;
                        if ( ((LA17_44>='\u0000' && LA17_44<='\uFFFF')) ) {s = 107;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}