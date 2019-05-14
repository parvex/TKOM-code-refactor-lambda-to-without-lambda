// Generated from c:\Repo\TKOM\LambdaRemover\LambdaRemover\antlr\CsharpSubset.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsharpSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, WS=26, SIMPLETYPE=27, NAME=28, TEXT=29, COMMENT=30, NUMBER=31, 
		REFERENCE=32, ErrorChar=33;
	public static final int
		RULE_program = 0, RULE_usingStmnt = 1, RULE_classInitialization = 2, RULE_classDefinition = 3, 
		RULE_propertyDefinition = 4, RULE_methodDefinition = 5, RULE_stmnt = 6, 
		RULE_varDeclaration = 7, RULE_assignStmnt = 8, RULE_returnStmnt = 9, RULE_expression = 10, 
		RULE_mathExpression = 11, RULE_methodCallStmnt = 12, RULE_lambdaBody = 13, 
		RULE_lambdaExpression = 14, RULE_parameterList = 15, RULE_typedArgList = 16, 
		RULE_argList = 17, RULE_parameter = 18, RULE_type = 19, RULE_reference = 20, 
		RULE_delegateType = 21, RULE_compileUnit = 22;
	public static final String[] ruleNames = {
		"program", "usingStmnt", "classInitialization", "classDefinition", "propertyDefinition", 
		"methodDefinition", "stmnt", "varDeclaration", "assignStmnt", "returnStmnt", 
		"expression", "mathExpression", "methodCallStmnt", "lambdaBody", "lambdaExpression", 
		"parameterList", "typedArgList", "argList", "parameter", "type", "reference", 
		"delegateType", "compileUnit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'using'", "';'", "'='", "'new'", "'('", "')'", "'class'", "'{'", 
		"'}'", "'public'", "'private'", "'static'", "'void'", "'return'", "'^'", 
		"'+'", "'-'", "'/'", "'*'", "'=>'", "','", "'Action'", "'Func'", "'<'", 
		"'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "SIMPLETYPE", "NAME", "TEXT", "COMMENT", "NUMBER", "REFERENCE", 
		"ErrorChar"
	};
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

	@Override
	public String getGrammarFileName() { return "CsharpSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsharpSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CsharpSubsetParser.EOF, 0); }
		public List<UsingStmntContext> usingStmnt() {
			return getRuleContexts(UsingStmntContext.class);
		}
		public UsingStmntContext usingStmnt(int i) {
			return getRuleContext(UsingStmntContext.class,i);
		}
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(46);
				usingStmnt();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(52);
				classDefinition();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(EOF);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingStmntContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CsharpSubsetParser.NAME, 0); }
		public UsingStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingStmnt; }
	}

	public final UsingStmntContext usingStmnt() throws RecognitionException {
		UsingStmntContext _localctx = new UsingStmntContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_usingStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			match(NAME);
			setState(62);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInitializationContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(CsharpSubsetParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CsharpSubsetParser.NAME, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ClassInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInitialization; }
	}

	public final ClassInitializationContext classInitialization() throws RecognitionException {
		ClassInitializationContext _localctx = new ClassInitializationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classInitialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			reference();
			setState(65);
			match(NAME);
			setState(66);
			match(T__2);
			setState(67);
			match(T__3);
			setState(68);
			match(NAME);
			setState(69);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(70);
				argList();
				}
			}

			setState(73);
			match(T__5);
			setState(74);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CsharpSubsetParser.NAME, 0); }
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__6);
			setState(77);
			match(NAME);
			setState(78);
			match(T__7);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(79);
					propertyDefinition();
					}
					break;
				case 2:
					{
					setState(80);
					methodDefinition();
					}
					break;
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(91);
				match(T__11);
				}
			}

			setState(94);
			varDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CsharpSubsetParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public ReturnStmntContext returnStmnt() {
			return getRuleContext(ReturnStmntContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(99);
				match(T__11);
				}
			}

			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case SIMPLETYPE:
				{
				setState(102);
				type();
				}
				break;
			case T__12:
				{
				setState(103);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(NAME);
			setState(107);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE))) != 0)) {
				{
				setState(108);
				parameterList();
				}
			}

			setState(111);
			match(T__5);
			setState(112);
			match(T__7);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE) | (1L << NAME) | (1L << REFERENCE))) != 0)) {
				{
				{
				setState(113);
				stmnt();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(119);
				returnStmnt();
				}
			}

			setState(122);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmntContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignStmntContext assignStmnt() {
			return getRuleContext(AssignStmntContext.class,0);
		}
		public MethodCallStmntContext methodCallStmnt() {
			return getRuleContext(MethodCallStmntContext.class,0);
		}
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassInitializationContext classInitialization() {
			return getRuleContext(ClassInitializationContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmnt);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				assignStmnt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(126);
				methodCallStmnt();
				setState(127);
				match(T__1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				methodDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				classInitialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CsharpSubsetParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(NAME);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(136);
				match(T__2);
				setState(137);
				expression();
				}
			}

			setState(140);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmntContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MethodCallStmntContext methodCallStmnt() {
			return getRuleContext(MethodCallStmntContext.class,0);
		}
		public AssignStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmnt; }
	}

	public final AssignStmntContext assignStmnt() throws RecognitionException {
		AssignStmntContext _localctx = new AssignStmntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			reference();
			setState(143);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(144);
				mathExpression(0);
				}
				break;
			case 2:
				{
				setState(145);
				methodCallStmnt();
				}
				break;
			}
			setState(148);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmntContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmnt; }
	}

	public final ReturnStmntContext returnStmnt() throws RecognitionException {
		ReturnStmntContext _localctx = new ReturnStmntContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__13);
			setState(151);
			expression();
			setState(152);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				mathExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				lambdaExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CsharpSubsetParser.NUMBER, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mathExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(160);
				match(NUMBER);
				}
				break;
			case NAME:
			case REFERENCE:
				{
				setState(161);
				reference();
				}
				break;
			case T__4:
				{
				setState(162);
				match(T__4);
				setState(163);
				mathExpression(0);
				setState(164);
				match(T__5);
				}
				break;
			case T__15:
			case T__16:
				{
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				mathExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
						match(T__14);
						setState(172);
						mathExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						mathExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						mathExpression(2);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodCallStmntContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallStmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStmnt; }
	}

	public final MethodCallStmntContext methodCallStmnt() throws RecognitionException {
		MethodCallStmntContext _localctx = new MethodCallStmntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCallStmnt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			reference();
			setState(185);
			match(T__4);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(186);
				argList();
				}
			}

			setState(189);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public ReturnStmntContext returnStmnt() {
			return getRuleContext(ReturnStmntContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lambdaBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE) | (1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(191);
					stmnt();
					}
					break;
				case 2:
					{
					setState(192);
					mathExpression(0);
					}
					break;
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(198);
				returnStmnt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TypedArgListContext typedArgList() {
			return getRuleContext(TypedArgListContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__4);
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case NUMBER:
			case REFERENCE:
				{
				setState(202);
				argList();
				}
				break;
			case T__21:
			case T__22:
			case SIMPLETYPE:
				{
				setState(203);
				typedArgList();
				}
				break;
			case T__5:
				break;
			default:
				break;
			}
			setState(206);
			match(T__5);
			setState(207);
			match(T__19);
			setState(208);
			match(T__7);
			setState(209);
			lambdaBody();
			setState(210);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(213);
			reference();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(214);
				match(T__20);
				setState(215);
				type();
				setState(216);
				reference();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedArgListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public TypedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgList; }
	}

	public final TypedArgListContext typedArgList() throws RecognitionException {
		TypedArgListContext _localctx = new TypedArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			type();
			setState(224);
			reference();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(225);
				match(T__20);
				setState(226);
				type();
				setState(227);
				reference();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			parameter();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(235);
				match(T__20);
				setState(236);
				parameter();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CsharpSubsetParser.NUMBER, 0); }
		public MethodCallStmntContext methodCallStmnt() {
			return getRuleContext(MethodCallStmntContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				methodCallStmnt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SIMPLETYPE() { return getToken(CsharpSubsetParser.SIMPLETYPE, 0); }
		public DelegateTypeContext delegateType() {
			return getRuleContext(DelegateTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(SIMPLETYPE);
				}
				break;
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				delegateType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode REFERENCE() { return getToken(CsharpSubsetParser.REFERENCE, 0); }
		public TerminalNode NAME() { return getToken(CsharpSubsetParser.NAME, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==REFERENCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelegateTypeContext extends ParserRuleContext {
		public List<TerminalNode> SIMPLETYPE() { return getTokens(CsharpSubsetParser.SIMPLETYPE); }
		public TerminalNode SIMPLETYPE(int i) {
			return getToken(CsharpSubsetParser.SIMPLETYPE, i);
		}
		public DelegateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegateType; }
	}

	public final DelegateTypeContext delegateType() throws RecognitionException {
		DelegateTypeContext _localctx = new DelegateTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_delegateType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(254);
				match(T__23);
				setState(255);
				match(SIMPLETYPE);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(256);
					match(T__20);
					setState(257);
					match(SIMPLETYPE);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(T__24);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompileUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CsharpSubsetParser.EOF, 0); }
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\6\5\6\\\n\6\3\6\5\6_\n\6\3\6\3"+
		"\6\3\7\5\7d\n\7\3\7\5\7g\n\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\5\7p\n\7\3\7"+
		"\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\5\7{\n\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5"+
		"\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\16\3"+
		"\16\3\16\5\16\u00be\n\16\3\16\3\16\3\17\3\17\7\17\u00c4\n\17\f\17\16\17"+
		"\u00c7\13\17\3\17\5\17\u00ca\n\17\3\20\3\20\3\20\5\20\u00cf\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00dd\n\21"+
		"\f\21\16\21\u00e0\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e8\n\22"+
		"\f\22\16\22\u00eb\13\22\3\23\3\23\3\23\7\23\u00f0\n\23\f\23\16\23\u00f3"+
		"\13\23\3\24\3\24\3\24\5\24\u00f8\n\24\3\25\3\25\5\25\u00fc\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\7\27\u0105\n\27\f\27\16\27\u0108\13\27\3"+
		"\27\5\27\u010b\n\27\3\30\3\30\3\30\2\3\30\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\7\3\2\f\r\3\2\22\23\3\2\24\25\4\2\36\36\"\"\3"+
		"\2\30\31\2\u0121\2\63\3\2\2\2\4>\3\2\2\2\6B\3\2\2\2\bN\3\2\2\2\n[\3\2"+
		"\2\2\fc\3\2\2\2\16\u0086\3\2\2\2\20\u0088\3\2\2\2\22\u0090\3\2\2\2\24"+
		"\u0098\3\2\2\2\26\u009f\3\2\2\2\30\u00aa\3\2\2\2\32\u00ba\3\2\2\2\34\u00c5"+
		"\3\2\2\2\36\u00cb\3\2\2\2 \u00d6\3\2\2\2\"\u00e1\3\2\2\2$\u00ec\3\2\2"+
		"\2&\u00f7\3\2\2\2(\u00fb\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2.\u010c"+
		"\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\2\2\3=\3\3\2\2\2>?\7\3"+
		"\2\2?@\7\36\2\2@A\7\4\2\2A\5\3\2\2\2BC\5*\26\2CD\7\36\2\2DE\7\5\2\2EF"+
		"\7\6\2\2FG\7\36\2\2GI\7\7\2\2HJ\5$\23\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2"+
		"KL\7\b\2\2LM\7\4\2\2M\7\3\2\2\2NO\7\t\2\2OP\7\36\2\2PU\7\n\2\2QT\5\n\6"+
		"\2RT\5\f\7\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2XY\7\13\2\2Y\t\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2[\\\3\2\2\2\\^"+
		"\3\2\2\2]_\7\16\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\5\20\t\2a\13\3\2\2"+
		"\2bd\t\2\2\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\7\16\2\2fe\3\2\2\2fg\3\2"+
		"\2\2gj\3\2\2\2hk\5(\25\2ik\7\17\2\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lm\7"+
		"\36\2\2mo\7\7\2\2np\5 \21\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\b\2\2rv"+
		"\7\n\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2"+
		"xv\3\2\2\2y{\5\24\13\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\13\2\2}\r\3\2"+
		"\2\2~\u0087\5\20\t\2\177\u0087\5\22\n\2\u0080\u0081\5\32\16\2\u0081\u0082"+
		"\7\4\2\2\u0082\u0087\3\2\2\2\u0083\u0087\5\f\7\2\u0084\u0087\5\6\4\2\u0085"+
		"\u0087\5\36\20\2\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2"+
		"\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17"+
		"\3\2\2\2\u0088\u0089\5(\25\2\u0089\u008c\7\36\2\2\u008a\u008b\7\5\2\2"+
		"\u008b\u008d\5\26\f\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7\4\2\2\u008f\21\3\2\2\2\u0090\u0091\5*\26\2\u0091"+
		"\u0094\7\5\2\2\u0092\u0095\5\30\r\2\u0093\u0095\5\32\16\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\4\2\2\u0097"+
		"\23\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\4"+
		"\2\2\u009b\25\3\2\2\2\u009c\u00a0\5\30\r\2\u009d\u00a0\5\36\20\2\u009e"+
		"\u00a0\5*\26\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\b\r\1\2\u00a2\u00ab\7!\2\2\u00a3\u00ab"+
		"\5*\26\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7\b\2\2"+
		"\u00a7\u00ab\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00ab\5\30\r\5\u00aa\u00a1"+
		"\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00b7\3\2\2\2\u00ac\u00ad\f\6\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00b6\5"+
		"\30\r\6\u00af\u00b0\f\4\2\2\u00b0\u00b1\t\4\2\2\u00b1\u00b6\5\30\r\5\u00b2"+
		"\u00b3\f\3\2\2\u00b3\u00b4\t\3\2\2\u00b4\u00b6\5\30\r\4\u00b5\u00ac\3"+
		"\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bb\5*\26\2\u00bb\u00bd\7\7\2\2\u00bc\u00be\5$\23\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0"+
		"\33\3\2\2\2\u00c1\u00c4\5\16\b\2\u00c2\u00c4\5\30\r\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\24"+
		"\13\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\35\3\2\2\2\u00cb\u00ce"+
		"\7\7\2\2\u00cc\u00cf\5$\23\2\u00cd\u00cf\5\"\22\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7\b\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\5\34\17"+
		"\2\u00d4\u00d5\7\13\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\5(\25\2\u00d7\u00de"+
		"\5*\26\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\5(\25\2\u00da\u00db\5*\26\2"+
		"\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\5(\25\2\u00e2\u00e9\5*\26\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\5"+
		"(\25\2\u00e5\u00e6\5*\26\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea#\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00ec\u00f1\5&\24\2\u00ed\u00ee\7\27\2\2\u00ee\u00f0"+
		"\5&\24\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\5*\26\2"+
		"\u00f5\u00f8\7!\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fc\7\35\2\2\u00fa"+
		"\u00fc\5,\27\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc)\3\2\2\2"+
		"\u00fd\u00fe\t\5\2\2\u00fe+\3\2\2\2\u00ff\u010a\t\6\2\2\u0100\u0101\7"+
		"\32\2\2\u0101\u0106\7\35\2\2\u0102\u0103\7\27\2\2\u0103\u0105\7\35\2\2"+
		"\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\7\33\2\2"+
		"\u010a\u0100\3\2\2\2\u010a\u010b\3\2\2\2\u010b-\3\2\2\2\u010c\u010d\7"+
		"\2\2\3\u010d/\3\2\2\2\"\639ISU[^cfjovz\u0086\u008c\u0094\u009f\u00aa\u00b5"+
		"\u00b7\u00bd\u00c3\u00c5\u00c9\u00ce\u00de\u00e9\u00f1\u00f7\u00fb\u0106"+
		"\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}