using System;
using System.Collections.ObjectModel;
using System.Linq;
using System.Windows.Controls;
using Antlr4.Runtime;

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
            CsharpSubsetParser.ProgramContext programContext = parser.program();
            //LambdaRemoveVisitor visitor = new LambdaRemoveVisitor();
            if (errorListener.SyntaxErrors.Any())
            {
                logOutput.Add("Couldn't refactor tree one or more errors occurred");
                foreach (var error in errorListener.SyntaxErrors)
                {
                    logOutput.Add(error.AsString());
                }
            }

        }

    }
}