// Generated from /Users/i587961/Documents/Compilerbau25Antlr/language.g4 by ANTLR 4.13.2
package com.compiler.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, IDENT=2, LPAREN=3, RPAREN=4, UNARYOP=5, SUMOP=6, CMPOP=7, DC=8, 
		QM=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "IDENT", "LPAREN", "RPAREN", "UNARYOP", "SUMOP", "CMPOP", "DC", 
			"QM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", null, null, null, "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "IDENT", "LPAREN", "RPAREN", "UNARYOP", "SUMOP", "CMPOP", 
			"DC", "QM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\n7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0017"+
		"\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0001\u0004\u0001\u001c\b\u0001"+
		"\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006+\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0004\t2\b\t\u000b\t\f\t3\u0001\t\u0001\t\u0000\u0000\n\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0001\u0000\u0006\u0001\u000009\u0001\u0000a"+
		"z\u0002\u0000!!--\u0002\u0000++--\u0002\u0000<<>>\u0003\u0000\t\n\r\r"+
		"  :\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001"+
		"\u0016\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005"+
		"\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001"+
		"\u0000\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r*\u0001\u0000\u0000"+
		"\u0000\u000f,\u0001\u0000\u0000\u0000\u0011.\u0001\u0000\u0000\u0000\u0013"+
		"1\u0001\u0000\u0000\u0000\u0015\u0017\u0007\u0000\u0000\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0002"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0004"+
		"\u0001\u0000\u0000\u0000\u001f \u0005(\u0000\u0000 \u0006\u0001\u0000"+
		"\u0000\u0000!\"\u0005)\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0007"+
		"\u0002\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0007\u0003\u0000\u0000"+
		"&\f\u0001\u0000\u0000\u0000\'(\u0005=\u0000\u0000(+\u0005=\u0000\u0000"+
		")+\u0007\u0004\u0000\u0000*\'\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+\u000e\u0001\u0000\u0000\u0000,-\u0005:\u0000\u0000-\u0010\u0001"+
		"\u0000\u0000\u0000./\u0005?\u0000\u0000/\u0012\u0001\u0000\u0000\u0000"+
		"02\u0007\u0005\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000056\u0006\t\u0000\u00006\u0014\u0001\u0000\u0000\u0000\u0005"+
		"\u0000\u0018\u001d*3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}