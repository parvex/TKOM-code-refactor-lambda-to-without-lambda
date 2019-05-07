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
		REFERENCE=32;
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
		null, null, "WS", "SIMPLETYPE", "NAME", "TEXT", "COMMENT", "NUMBER", "REFERENCE"
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
			setState(58);
			match(T__0);
			setState(59);
			match(NAME);
			setState(60);
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
			setState(62);
			reference();
			setState(63);
			match(NAME);
			setState(64);
			match(T__2);
			setState(65);
			match(T__3);
			setState(66);
			match(NAME);
			setState(67);
			match(T__4);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(68);
				argList();
				}
			}

			setState(71);
			match(T__5);
			setState(72);
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
			setState(74);
			match(T__6);
			setState(75);
			match(NAME);
			setState(76);
			match(T__7);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(77);
					propertyDefinition();
					}
					break;
				case 2:
					{
					setState(78);
					methodDefinition();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(86);
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

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(89);
				match(T__11);
				}
			}

			setState(92);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(94);
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

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(97);
				match(T__11);
				}
			}

			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case SIMPLETYPE:
				{
				setState(100);
				type();
				}
				break;
			case T__12:
				{
				setState(101);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			match(NAME);
			setState(105);
			match(T__4);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE))) != 0)) {
				{
				setState(106);
				parameterList();
				}
			}

			setState(109);
			match(T__5);
			setState(110);
			match(T__7);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE) | (1L << NAME) | (1L << REFERENCE))) != 0)) {
				{
				{
				setState(111);
				stmnt();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(117);
				returnStmnt();
				}
			}

			setState(120);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				assignStmnt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(124);
				methodCallStmnt();
				setState(125);
				match(T__1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				methodDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				classInitialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
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
			setState(132);
			type();
			setState(133);
			match(NAME);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(134);
				match(T__2);
				setState(135);
				expression();
				}
			}

			setState(138);
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
			setState(140);
			reference();
			setState(141);
			match(T__2);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(142);
				mathExpression(0);
				}
				break;
			case 2:
				{
				setState(143);
				methodCallStmnt();
				}
				break;
			}
			setState(146);
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
			setState(148);
			match(T__13);
			setState(149);
			expression();
			setState(150);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				mathExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				lambdaExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(158);
				match(NUMBER);
				}
				break;
			case NAME:
			case REFERENCE:
				{
				setState(159);
				reference();
				}
				break;
			case T__4:
				{
				setState(160);
				match(T__4);
				setState(161);
				mathExpression(0);
				setState(162);
				match(T__5);
				}
				break;
			case T__15:
			case T__16:
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				mathExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(168);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(169);
						match(T__14);
						setState(170);
						mathExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						mathExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new MathExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(174);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						mathExpression(2);
						}
						break;
					}
					} 
				}
				setState(181);
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
			setState(182);
			reference();
			setState(183);
			match(T__4);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(184);
				argList();
				}
			}

			setState(187);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__22) | (1L << SIMPLETYPE) | (1L << NAME) | (1L << NUMBER) | (1L << REFERENCE))) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(189);
					stmnt();
					}
					break;
				case 2:
					{
					setState(190);
					mathExpression(0);
					}
					break;
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(196);
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
			setState(199);
			match(T__4);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case NUMBER:
			case REFERENCE:
				{
				setState(200);
				argList();
				}
				break;
			case T__21:
			case T__22:
			case SIMPLETYPE:
				{
				setState(201);
				typedArgList();
				}
				break;
			case T__5:
				break;
			default:
				break;
			}
			setState(204);
			match(T__5);
			setState(205);
			match(T__19);
			setState(206);
			match(T__7);
			setState(207);
			lambdaBody();
			setState(208);
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
			setState(210);
			type();
			setState(211);
			reference();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(212);
				match(T__20);
				setState(213);
				type();
				setState(214);
				reference();
				}
				}
				setState(220);
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
			setState(221);
			type();
			setState(222);
			reference();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(223);
				match(T__20);
				setState(224);
				type();
				setState(225);
				reference();
				}
				}
				setState(231);
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
			setState(232);
			parameter();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(233);
				match(T__20);
				setState(234);
				parameter();
				}
				}
				setState(239);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(SIMPLETYPE);
				}
				break;
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
			setState(249);
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
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(252);
				match(T__23);
				setState(253);
				match(SIMPLETYPE);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(254);
					match(T__20);
					setState(255);
					match(SIMPLETYPE);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
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
			setState(264);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5"+
		"R\n\5\f\5\16\5U\13\5\3\5\3\5\3\6\5\6Z\n\6\3\6\5\6]\n\6\3\6\3\6\3\7\5\7"+
		"b\n\7\3\7\5\7e\n\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7\7"+
		"\7s\n\7\f\7\16\7v\13\7\3\7\5\7y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0093\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u009e\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\16\3\16\3\16\5"+
		"\16\u00bc\n\16\3\16\3\16\3\17\3\17\7\17\u00c2\n\17\f\17\16\17\u00c5\13"+
		"\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\5\20\u00cd\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00db\n\21\f\21\16"+
		"\21\u00de\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e6\n\22\f\22\16"+
		"\22\u00e9\13\22\3\23\3\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1\13\23"+
		"\3\24\3\24\3\24\5\24\u00f6\n\24\3\25\3\25\5\25\u00fa\n\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u0103\n\27\f\27\16\27\u0106\13\27\3\27\5"+
		"\27\u0109\n\27\3\30\3\30\3\30\2\3\30\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\7\3\2\f\r\3\2\22\23\3\2\24\25\4\2\36\36\"\"\3\2\30"+
		"\31\2\u011f\2\63\3\2\2\2\4<\3\2\2\2\6@\3\2\2\2\bL\3\2\2\2\nY\3\2\2\2\f"+
		"a\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u008e\3\2\2\2\24\u0096"+
		"\3\2\2\2\26\u009d\3\2\2\2\30\u00a8\3\2\2\2\32\u00b8\3\2\2\2\34\u00c3\3"+
		"\2\2\2\36\u00c9\3\2\2\2 \u00d4\3\2\2\2\"\u00df\3\2\2\2$\u00ea\3\2\2\2"+
		"&\u00f5\3\2\2\2(\u00f9\3\2\2\2*\u00fb\3\2\2\2,\u00fd\3\2\2\2.\u010a\3"+
		"\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29"+
		"\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<=\7\3\2\2=>\7\36\2\2>?\7\4"+
		"\2\2?\5\3\2\2\2@A\5*\26\2AB\7\36\2\2BC\7\5\2\2CD\7\6\2\2DE\7\36\2\2EG"+
		"\7\7\2\2FH\5$\23\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\b\2\2JK\7\4\2\2K"+
		"\7\3\2\2\2LM\7\t\2\2MN\7\36\2\2NS\7\n\2\2OR\5\n\6\2PR\5\f\7\2QO\3\2\2"+
		"\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\13"+
		"\2\2W\t\3\2\2\2XZ\t\2\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\7\16\2\2\\"+
		"[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\5\20\t\2_\13\3\2\2\2`b\t\2\2\2a`\3\2"+
		"\2\2ab\3\2\2\2bd\3\2\2\2ce\7\16\2\2dc\3\2\2\2de\3\2\2\2eh\3\2\2\2fi\5"+
		"(\25\2gi\7\17\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7\36\2\2km\7\7\2\2l"+
		"n\5 \21\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\b\2\2pt\7\n\2\2qs\5\16\b\2"+
		"rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\24\13"+
		"\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\13\2\2{\r\3\2\2\2|\u0085\5\20\t\2"+
		"}\u0085\5\22\n\2~\177\5\32\16\2\177\u0080\7\4\2\2\u0080\u0085\3\2\2\2"+
		"\u0081\u0085\5\f\7\2\u0082\u0085\5\6\4\2\u0083\u0085\5\36\20\2\u0084|"+
		"\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\5(\25\2\u0087"+
		"\u008a\7\36\2\2\u0088\u0089\7\5\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\4\2\2\u008d"+
		"\21\3\2\2\2\u008e\u008f\5*\26\2\u008f\u0092\7\5\2\2\u0090\u0093\5\30\r"+
		"\2\u0091\u0093\5\32\16\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\4\2\2\u0095\23\3\2\2\2\u0096\u0097\7\20\2"+
		"\2\u0097\u0098\5\26\f\2\u0098\u0099\7\4\2\2\u0099\25\3\2\2\2\u009a\u009e"+
		"\5\30\r\2\u009b\u009e\5\36\20\2\u009c\u009e\5*\26\2\u009d\u009a\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0"+
		"\b\r\1\2\u00a0\u00a9\7!\2\2\u00a1\u00a9\5*\26\2\u00a2\u00a3\7\7\2\2\u00a3"+
		"\u00a4\5\30\r\2\u00a4\u00a5\7\b\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a7\t"+
		"\3\2\2\u00a7\u00a9\5\30\r\5\u00a8\u009f\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab\f\6"+
		"\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00b4\5\30\r\6\u00ad\u00ae\f\4\2\2\u00ae"+
		"\u00af\t\4\2\2\u00af\u00b4\5\30\r\5\u00b0\u00b1\f\3\2\2\u00b1\u00b2\t"+
		"\3\2\2\u00b2\u00b4\5\30\r\4\u00b3\u00aa\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\31\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5*\26\2\u00b9\u00bb"+
		"\7\7\2\2\u00ba\u00bc\5$\23\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\33\3\2\2\2\u00bf\u00c2\5\16\b"+
		"\2\u00c0\u00c2\5\30\r\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5\24\13\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00cc\7\7\2\2\u00ca\u00cd\5$\23"+
		"\2\u00cb\u00cd\5\"\22\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\7\26"+
		"\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\37\3\2\2\2\u00d4\u00d5\5(\25\2\u00d5\u00dc\5*\26\2\u00d6\u00d7\7\27\2"+
		"\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\5*\26\2\u00d9\u00db\3\2\2\2\u00da\u00d6"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"!\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5(\25\2\u00e0\u00e7\5*\26\2"+
		"\u00e1\u00e2\7\27\2\2\u00e2\u00e3\5(\25\2\u00e3\u00e4\5*\26\2\u00e4\u00e6"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ef\5&\24\2"+
		"\u00eb\u00ec\7\27\2\2\u00ec\u00ee\5&\24\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0%\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f6\5*\26\2\u00f3\u00f6\7!\2\2\u00f4\u00f6\5\32"+
		"\16\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\'\3\2\2\2\u00f7\u00fa\7\35\2\2\u00f8\u00fa\5,\27\2\u00f9\u00f7\3\2\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa)\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc+\3\2\2"+
		"\2\u00fd\u0108\t\6\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0104\7\35\2\2\u0100"+
		"\u0101\7\27\2\2\u0101\u0103\7\35\2\2\u0102\u0100\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0109\7\33\2\2\u0108\u00fe\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109-\3\2\2\2\u010a\u010b\7\2\2\3\u010b/\3\2\2\2\"\639GQSY\\a"+
		"dhmtx\u0084\u008a\u0092\u009d\u00a8\u00b3\u00b5\u00bb\u00c1\u00c3\u00c7"+
		"\u00cc\u00dc\u00e7\u00ef\u00f5\u00f9\u0104\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}