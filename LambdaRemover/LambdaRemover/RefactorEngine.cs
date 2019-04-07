using System;
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

        public RefactorEngine()
        {
        }

        private void initLanguageAnalyzers(string codeString)
        {
            inputStream = new AntlrInputStream(codeString);
            lexer = new CsharpSubsetLexer(inputStream);
            commonTokenStream = new CommonTokenStream(lexer);
            parser = new CsharpSubsetParser(commonTokenStream);
            programContext = parser.program();
        }

        public string removeLambdasFromCode(string codeString)
        {
            initLanguageAnalyzers(codeString);

            return codeString;
        }

    }
}