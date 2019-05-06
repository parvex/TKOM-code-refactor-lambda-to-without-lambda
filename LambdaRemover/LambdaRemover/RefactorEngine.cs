using System;
using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class RefactorEngine
    {
        private AntlrInputStream inputStream;
        private CsharpSubsetLexer lexer;
        private CsharpSubsetParser parser;
        private CsharpSubsetParser.ProgramContext programContext;
        private CommonTokenStream commonTokenStream;

        public RefactorEngine(string codeString, TextBlock logOutput)
        {
            var errorStrategy = new ErrorStrategy(logOutput);
            var lexerErrorListener = new LexerErrorListener(logOutput);
            var parserErrorListener = new ParserErrorListener(logOutput);
            inputStream = new AntlrInputStream(codeString);
            lexer = new CsharpSubsetLexer(inputStream);
            //lexer.RemoveErrorListeners();
            //lexer.AddErrorListener(lexerErrorListener);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CsharpSubsetParser(commonTokenStream);
            //parser.RemoveErrorListeners();
            //parser.AddErrorListener(parserErrorListener);
            parser.ErrorHandler = errorStrategy;
            programContext = parser.program();
        }

        private void InitLanguageAnalyzers(string codeString, TextBlock errorOutput)
        {
 
        }

    }
}