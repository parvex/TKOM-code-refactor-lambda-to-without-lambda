using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class RefactorEngine
    {
        public static string RemoveLambdas(string codeString, ObservableCollection<string> logOutput)
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
                logOutput.Add("Couldn't refactor, one or more syntax errors occurred:");
                foreach (var error in errorListener.SyntaxErrors)
                {
                    logOutput.Add(error.AsString());
                }

                return "Correct syntax errors!";
            }

            LambdaRemoveVisitor visitor = new LambdaRemoveVisitor(inputStream);
            visitor.Visit(tree);

            return RefactorCode(codeString, visitor);
        }

        private static string RefactorCode(string codeString, LambdaRemoveVisitor visitor)
        {
            //var lol = visitor.DataToRefactorList.GroupBy(x => x.methodDefIndex);
            //lol.

            return codeString;
        }
    }
}