//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from CsharpSubset.g4 by ANTLR 4.7.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.2")]
[System.CLSCompliant(false)]
public partial class CsharpSubsetLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, WS=26, SIMPLETYPE=27, NAME=28, TEXT=29, COMMENT=30, NUMBER=31, 
		REFERENCE=32;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"WS", "LETTER", "DIGIT", "SIMPLETYPE", "NAME", "TEXT", "COMMENT", "NUMBER", 
		"REFERENCE"
	};


	public CsharpSubsetLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public CsharpSubsetLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'using'", "';'", "'='", "'new'", "'('", "')'", "'class'", "'{'", 
		"'}'", "'public'", "'private'", "'static'", "'void'", "'return'", "'^'", 
		"'+'", "'-'", "'/'", "'*'", "'=>'", "','", "'Action'", "'Func'", "'<'", 
		"'>'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "SIMPLETYPE", "NAME", "TEXT", "COMMENT", "NUMBER", "REFERENCE"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "CsharpSubset.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static CsharpSubsetLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\"', '\xE5', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', 
		'\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', 
		'\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\f', 
		'\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', 
		'\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', 
		'\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', 
		'\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', 
		'\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', 
		'\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', 
		'\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', 
		'\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', 
		'\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', 
		'\x1A', '\x3', '\x1B', '\x6', '\x1B', '\xA6', '\n', '\x1B', '\r', '\x1B', 
		'\xE', '\x1B', '\xA7', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', 
		'\x1C', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', 
		'\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', 
		'\x1E', '\x3', '\x1E', '\x5', '\x1E', '\xB9', '\n', '\x1E', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', '\x1F', '\a', '\x1F', '\xBE', '\n', '\x1F', '\f', 
		'\x1F', '\xE', '\x1F', '\xC1', '\v', '\x1F', '\x3', ' ', '\x3', ' ', '\a', 
		' ', '\xC5', '\n', ' ', '\f', ' ', '\xE', ' ', '\xC8', '\v', ' ', '\x3', 
		' ', '\x3', ' ', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', '!', '\a', 
		'!', '\xD0', '\n', '!', '\f', '!', '\xE', '!', '\xD3', '\v', '!', '\x3', 
		'!', '\x3', '!', '\x3', '\"', '\x5', '\"', '\xD8', '\n', '\"', '\x3', 
		'\"', '\x6', '\"', '\xDB', '\n', '\"', '\r', '\"', '\xE', '\"', '\xDC', 
		'\x3', '#', '\x3', '#', '\x3', '#', '\x6', '#', '\xE2', '\n', '#', '\r', 
		'#', '\xE', '#', '\xE3', '\x4', '\xC6', '\xD1', '\x2', '$', '\x3', '\x3', 
		'\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', 
		'\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x2', 
		'\x39', '\x2', ';', '\x1D', '=', '\x1E', '?', '\x1F', '\x41', ' ', '\x43', 
		'!', '\x45', '\"', '\x3', '\x2', '\x5', '\x5', '\x2', '\v', '\f', '\xF', 
		'\xF', '\"', '\"', '\x4', '\x2', '\x43', '\\', '\x63', '|', '\x3', '\x2', 
		'\x32', ';', '\x2', '\xEB', '\x2', '\x3', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\t', '\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x13', '\x3', '\x2', '\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x17', '\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', 
		'\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x33', '\x3', '\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', 
		'\x2', '\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x45', '\x3', '\x2', '\x2', '\x2', '\x3', 'G', '\x3', '\x2', '\x2', 
		'\x2', '\x5', 'M', '\x3', '\x2', '\x2', '\x2', '\a', 'O', '\x3', '\x2', 
		'\x2', '\x2', '\t', 'Q', '\x3', '\x2', '\x2', '\x2', '\v', 'U', '\x3', 
		'\x2', '\x2', '\x2', '\r', 'W', '\x3', '\x2', '\x2', '\x2', '\xF', 'Y', 
		'\x3', '\x2', '\x2', '\x2', '\x11', '_', '\x3', '\x2', '\x2', '\x2', '\x13', 
		'\x61', '\x3', '\x2', '\x2', '\x2', '\x15', '\x63', '\x3', '\x2', '\x2', 
		'\x2', '\x17', 'j', '\x3', '\x2', '\x2', '\x2', '\x19', 'r', '\x3', '\x2', 
		'\x2', '\x2', '\x1B', 'y', '\x3', '\x2', '\x2', '\x2', '\x1D', '~', '\x3', 
		'\x2', '\x2', '\x2', '\x1F', '\x85', '\x3', '\x2', '\x2', '\x2', '!', 
		'\x87', '\x3', '\x2', '\x2', '\x2', '#', '\x89', '\x3', '\x2', '\x2', 
		'\x2', '%', '\x8B', '\x3', '\x2', '\x2', '\x2', '\'', '\x8D', '\x3', '\x2', 
		'\x2', '\x2', ')', '\x8F', '\x3', '\x2', '\x2', '\x2', '+', '\x92', '\x3', 
		'\x2', '\x2', '\x2', '-', '\x94', '\x3', '\x2', '\x2', '\x2', '/', '\x9B', 
		'\x3', '\x2', '\x2', '\x2', '\x31', '\xA0', '\x3', '\x2', '\x2', '\x2', 
		'\x33', '\xA2', '\x3', '\x2', '\x2', '\x2', '\x35', '\xA5', '\x3', '\x2', 
		'\x2', '\x2', '\x37', '\xAB', '\x3', '\x2', '\x2', '\x2', '\x39', '\xAD', 
		'\x3', '\x2', '\x2', '\x2', ';', '\xB8', '\x3', '\x2', '\x2', '\x2', '=', 
		'\xBA', '\x3', '\x2', '\x2', '\x2', '?', '\xC2', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\xCB', '\x3', '\x2', '\x2', '\x2', '\x43', '\xD7', '\x3', 
		'\x2', '\x2', '\x2', '\x45', '\xDE', '\x3', '\x2', '\x2', '\x2', 'G', 
		'H', '\a', 'w', '\x2', '\x2', 'H', 'I', '\a', 'u', '\x2', '\x2', 'I', 
		'J', '\a', 'k', '\x2', '\x2', 'J', 'K', '\a', 'p', '\x2', '\x2', 'K', 
		'L', '\a', 'i', '\x2', '\x2', 'L', '\x4', '\x3', '\x2', '\x2', '\x2', 
		'M', 'N', '\a', '=', '\x2', '\x2', 'N', '\x6', '\x3', '\x2', '\x2', '\x2', 
		'O', 'P', '\a', '?', '\x2', '\x2', 'P', '\b', '\x3', '\x2', '\x2', '\x2', 
		'Q', 'R', '\a', 'p', '\x2', '\x2', 'R', 'S', '\a', 'g', '\x2', '\x2', 
		'S', 'T', '\a', 'y', '\x2', '\x2', 'T', '\n', '\x3', '\x2', '\x2', '\x2', 
		'U', 'V', '\a', '*', '\x2', '\x2', 'V', '\f', '\x3', '\x2', '\x2', '\x2', 
		'W', 'X', '\a', '+', '\x2', '\x2', 'X', '\xE', '\x3', '\x2', '\x2', '\x2', 
		'Y', 'Z', '\a', '\x65', '\x2', '\x2', 'Z', '[', '\a', 'n', '\x2', '\x2', 
		'[', '\\', '\a', '\x63', '\x2', '\x2', '\\', ']', '\a', 'u', '\x2', '\x2', 
		']', '^', '\a', 'u', '\x2', '\x2', '^', '\x10', '\x3', '\x2', '\x2', '\x2', 
		'_', '`', '\a', '}', '\x2', '\x2', '`', '\x12', '\x3', '\x2', '\x2', '\x2', 
		'\x61', '\x62', '\a', '\x7F', '\x2', '\x2', '\x62', '\x14', '\x3', '\x2', 
		'\x2', '\x2', '\x63', '\x64', '\a', 'r', '\x2', '\x2', '\x64', '\x65', 
		'\a', 'w', '\x2', '\x2', '\x65', '\x66', '\a', '\x64', '\x2', '\x2', '\x66', 
		'g', '\a', 'n', '\x2', '\x2', 'g', 'h', '\a', 'k', '\x2', '\x2', 'h', 
		'i', '\a', '\x65', '\x2', '\x2', 'i', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'j', 'k', '\a', 'r', '\x2', '\x2', 'k', 'l', '\a', 't', '\x2', '\x2', 
		'l', 'm', '\a', 'k', '\x2', '\x2', 'm', 'n', '\a', 'x', '\x2', '\x2', 
		'n', 'o', '\a', '\x63', '\x2', '\x2', 'o', 'p', '\a', 'v', '\x2', '\x2', 
		'p', 'q', '\a', 'g', '\x2', '\x2', 'q', '\x18', '\x3', '\x2', '\x2', '\x2', 
		'r', 's', '\a', 'u', '\x2', '\x2', 's', 't', '\a', 'v', '\x2', '\x2', 
		't', 'u', '\a', '\x63', '\x2', '\x2', 'u', 'v', '\a', 'v', '\x2', '\x2', 
		'v', 'w', '\a', 'k', '\x2', '\x2', 'w', 'x', '\a', '\x65', '\x2', '\x2', 
		'x', '\x1A', '\x3', '\x2', '\x2', '\x2', 'y', 'z', '\a', 'x', '\x2', '\x2', 
		'z', '{', '\a', 'q', '\x2', '\x2', '{', '|', '\a', 'k', '\x2', '\x2', 
		'|', '}', '\a', '\x66', '\x2', '\x2', '}', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', '~', '\x7F', '\a', 't', '\x2', '\x2', '\x7F', '\x80', '\a', 'g', 
		'\x2', '\x2', '\x80', '\x81', '\a', 'v', '\x2', '\x2', '\x81', '\x82', 
		'\a', 'w', '\x2', '\x2', '\x82', '\x83', '\a', 't', '\x2', '\x2', '\x83', 
		'\x84', '\a', 'p', '\x2', '\x2', '\x84', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '\x85', '\x86', '\a', '`', '\x2', '\x2', '\x86', ' ', '\x3', '\x2', 
		'\x2', '\x2', '\x87', '\x88', '\a', '-', '\x2', '\x2', '\x88', '\"', '\x3', 
		'\x2', '\x2', '\x2', '\x89', '\x8A', '\a', '/', '\x2', '\x2', '\x8A', 
		'$', '\x3', '\x2', '\x2', '\x2', '\x8B', '\x8C', '\a', '\x31', '\x2', 
		'\x2', '\x8C', '&', '\x3', '\x2', '\x2', '\x2', '\x8D', '\x8E', '\a', 
		',', '\x2', '\x2', '\x8E', '(', '\x3', '\x2', '\x2', '\x2', '\x8F', '\x90', 
		'\a', '?', '\x2', '\x2', '\x90', '\x91', '\a', '@', '\x2', '\x2', '\x91', 
		'*', '\x3', '\x2', '\x2', '\x2', '\x92', '\x93', '\a', '.', '\x2', '\x2', 
		'\x93', ',', '\x3', '\x2', '\x2', '\x2', '\x94', '\x95', '\a', '\x43', 
		'\x2', '\x2', '\x95', '\x96', '\a', '\x65', '\x2', '\x2', '\x96', '\x97', 
		'\a', 'v', '\x2', '\x2', '\x97', '\x98', '\a', 'k', '\x2', '\x2', '\x98', 
		'\x99', '\a', 'q', '\x2', '\x2', '\x99', '\x9A', '\a', 'p', '\x2', '\x2', 
		'\x9A', '.', '\x3', '\x2', '\x2', '\x2', '\x9B', '\x9C', '\a', 'H', '\x2', 
		'\x2', '\x9C', '\x9D', '\a', 'w', '\x2', '\x2', '\x9D', '\x9E', '\a', 
		'p', '\x2', '\x2', '\x9E', '\x9F', '\a', '\x65', '\x2', '\x2', '\x9F', 
		'\x30', '\x3', '\x2', '\x2', '\x2', '\xA0', '\xA1', '\a', '>', '\x2', 
		'\x2', '\xA1', '\x32', '\x3', '\x2', '\x2', '\x2', '\xA2', '\xA3', '\a', 
		'@', '\x2', '\x2', '\xA3', '\x34', '\x3', '\x2', '\x2', '\x2', '\xA4', 
		'\xA6', '\t', '\x2', '\x2', '\x2', '\xA5', '\xA4', '\x3', '\x2', '\x2', 
		'\x2', '\xA6', '\xA7', '\x3', '\x2', '\x2', '\x2', '\xA7', '\xA5', '\x3', 
		'\x2', '\x2', '\x2', '\xA7', '\xA8', '\x3', '\x2', '\x2', '\x2', '\xA8', 
		'\xA9', '\x3', '\x2', '\x2', '\x2', '\xA9', '\xAA', '\b', '\x1B', '\x2', 
		'\x2', '\xAA', '\x36', '\x3', '\x2', '\x2', '\x2', '\xAB', '\xAC', '\t', 
		'\x3', '\x2', '\x2', '\xAC', '\x38', '\x3', '\x2', '\x2', '\x2', '\xAD', 
		'\xAE', '\t', '\x4', '\x2', '\x2', '\xAE', ':', '\x3', '\x2', '\x2', '\x2', 
		'\xAF', '\xB0', '\a', 'k', '\x2', '\x2', '\xB0', '\xB1', '\a', 'p', '\x2', 
		'\x2', '\xB1', '\xB9', '\a', 'v', '\x2', '\x2', '\xB2', '\xB3', '\a', 
		'\x66', '\x2', '\x2', '\xB3', '\xB4', '\a', 'q', '\x2', '\x2', '\xB4', 
		'\xB5', '\a', 'w', '\x2', '\x2', '\xB5', '\xB6', '\a', '\x64', '\x2', 
		'\x2', '\xB6', '\xB7', '\a', 'n', '\x2', '\x2', '\xB7', '\xB9', '\a', 
		'g', '\x2', '\x2', '\xB8', '\xAF', '\x3', '\x2', '\x2', '\x2', '\xB8', 
		'\xB2', '\x3', '\x2', '\x2', '\x2', '\xB9', '<', '\x3', '\x2', '\x2', 
		'\x2', '\xBA', '\xBF', '\x5', '\x37', '\x1C', '\x2', '\xBB', '\xBE', '\x5', 
		'\x37', '\x1C', '\x2', '\xBC', '\xBE', '\x5', '\x39', '\x1D', '\x2', '\xBD', 
		'\xBB', '\x3', '\x2', '\x2', '\x2', '\xBD', '\xBC', '\x3', '\x2', '\x2', 
		'\x2', '\xBE', '\xC1', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xBD', '\x3', 
		'\x2', '\x2', '\x2', '\xBF', '\xC0', '\x3', '\x2', '\x2', '\x2', '\xC0', 
		'>', '\x3', '\x2', '\x2', '\x2', '\xC1', '\xBF', '\x3', '\x2', '\x2', 
		'\x2', '\xC2', '\xC6', '\a', '$', '\x2', '\x2', '\xC3', '\xC5', '\v', 
		'\x2', '\x2', '\x2', '\xC4', '\xC3', '\x3', '\x2', '\x2', '\x2', '\xC5', 
		'\xC8', '\x3', '\x2', '\x2', '\x2', '\xC6', '\xC7', '\x3', '\x2', '\x2', 
		'\x2', '\xC6', '\xC4', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC9', '\x3', 
		'\x2', '\x2', '\x2', '\xC8', '\xC6', '\x3', '\x2', '\x2', '\x2', '\xC9', 
		'\xCA', '\a', '$', '\x2', '\x2', '\xCA', '@', '\x3', '\x2', '\x2', '\x2', 
		'\xCB', '\xCC', '\a', '\x31', '\x2', '\x2', '\xCC', '\xCD', '\a', '\x31', 
		'\x2', '\x2', '\xCD', '\xD1', '\x3', '\x2', '\x2', '\x2', '\xCE', '\xD0', 
		'\v', '\x2', '\x2', '\x2', '\xCF', '\xCE', '\x3', '\x2', '\x2', '\x2', 
		'\xD0', '\xD3', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xD2', '\x3', '\x2', 
		'\x2', '\x2', '\xD1', '\xCF', '\x3', '\x2', '\x2', '\x2', '\xD2', '\xD4', 
		'\x3', '\x2', '\x2', '\x2', '\xD3', '\xD1', '\x3', '\x2', '\x2', '\x2', 
		'\xD4', '\xD5', '\a', '\f', '\x2', '\x2', '\xD5', '\x42', '\x3', '\x2', 
		'\x2', '\x2', '\xD6', '\xD8', '\a', '/', '\x2', '\x2', '\xD7', '\xD6', 
		'\x3', '\x2', '\x2', '\x2', '\xD7', '\xD8', '\x3', '\x2', '\x2', '\x2', 
		'\xD8', '\xDA', '\x3', '\x2', '\x2', '\x2', '\xD9', '\xDB', '\x5', '\x39', 
		'\x1D', '\x2', '\xDA', '\xD9', '\x3', '\x2', '\x2', '\x2', '\xDB', '\xDC', 
		'\x3', '\x2', '\x2', '\x2', '\xDC', '\xDA', '\x3', '\x2', '\x2', '\x2', 
		'\xDC', '\xDD', '\x3', '\x2', '\x2', '\x2', '\xDD', '\x44', '\x3', '\x2', 
		'\x2', '\x2', '\xDE', '\xE1', '\x5', '=', '\x1F', '\x2', '\xDF', '\xE0', 
		'\a', '\x30', '\x2', '\x2', '\xE0', '\xE2', '\x5', '=', '\x1F', '\x2', 
		'\xE1', '\xDF', '\x3', '\x2', '\x2', '\x2', '\xE2', '\xE3', '\x3', '\x2', 
		'\x2', '\x2', '\xE3', '\xE1', '\x3', '\x2', '\x2', '\x2', '\xE3', '\xE4', 
		'\x3', '\x2', '\x2', '\x2', '\xE4', '\x46', '\x3', '\x2', '\x2', '\x2', 
		'\f', '\x2', '\xA7', '\xB8', '\xBD', '\xBF', '\xC6', '\xD1', '\xD7', '\xDC', 
		'\xE3', '\x3', '\x2', '\x3', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}