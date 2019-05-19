using System;
using System.Collections.ObjectModel;
using System.Linq;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace LambdaRemover
{
    public class RefactorEngine
    {
        public RefactorEngine(string codeString, ObservableCollection<string> logOutput)
        {
            AntlrInputStream inputStream = new AntlrInputStream(codeString);
            CsharpSubsetLexer lexer = new CsharpSubsetLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CsharpSubsetParser parser = new CsharpSubsetParser(commonTokenStream);
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.AddErrorListener(errorListener);
            var tree = parser.program();
            if (errorListener.SyntaxErrors.Any())
            {
                logOutput.Add("Couldn't refactor, one or more syntax errors occurred");
                foreach (var error in errorListener.SyntaxErrors)
                {
                    logOutput.Add(error.AsString());
                }

                return;
            }

            LambdaRemoveVisitor visitor = new LambdaRemoveVisitor(inputStream);
            visitor.Visit(tree);
        }

    }
}