using System;
using System.Collections.ObjectModel;
using System.Data;
using System.Linq;
using System.Text;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class RefactorEngine
    {
        private ObservableCollection<string> _logOutput;
        CsharpSubsetLexer Lexer;
        CommonTokenStream CommonTokenStream;
        CsharpSubsetParser Parser;
        CsharpSubsetParser.ProgramContext Tree;
        AntlrInputStream InputStream;

        public RefactorEngine(ObservableCollection<string> logOutput)
        {
            _logOutput = logOutput;
        }

        public string RemoveLambdas(string codeString)
        {
            ParseCode(codeString);
            if (Tree == null)
                return "Correct syntax errors";

            string returnCode = RefactorCode(codeString);
            _logOutput.Add("Refactor completed!");
            return returnCode;
        }

        private string RefactorCode(string codeString)
        {
            LambdaRemoveVisitor visitor = new LambdaRemoveVisitor(InputStream);
            visitor.Visit(Tree);

            int i = 0;
            StringBuilder refactorBuilder = new StringBuilder(codeString);
            while (visitor.RefactorDataList.Any())
            {
                RefactorSingleLambda(refactorBuilder, visitor.RefactorDataList.First(), i);

                ParseCode(refactorBuilder.ToString());
                visitor.InputStream = InputStream;
                visitor.Visit(Tree);
                ++i;
            }

            return refactorBuilder.ToString();
        }

        private void ParseCode(string codeString)
        {
            InputStream = new AntlrInputStream(codeString);
            Lexer = new CsharpSubsetLexer(InputStream);
            CommonTokenStream = new CommonTokenStream(Lexer);
            Parser = new CsharpSubsetParser(CommonTokenStream);
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            Parser.AddErrorListener(errorListener);
            Tree = Parser.program();
            if (errorListener.SyntaxErrors.Any())
            {
                _logOutput.Add("Couldn't refactor, one or more syntax errors occurred:");
                foreach (var error in errorListener.SyntaxErrors)
                {
                    _logOutput.Add(error.AsString());
                }

                Tree = null;
            }
        }


        private string RefactorSingleLambda(StringBuilder refactorBuilder, RefactorData data, int index)
        {

            string methodName = "refactoredLambda" + index;

            string method = "\n    public static " + (data.IsTyped ? "int " : "void ") + methodName
                            + "(" + data.ArgumentList + ")" + "\n    {\n        " 
                            + data.LambdaBody.Replace("\n", "\n        ") + "\n    }\n";

            refactorBuilder.Remove(data.LambdaInterval.a, data.LambdaInterval.b - data.LambdaInterval.a + 1);
            refactorBuilder.Insert(data.LambdaInterval.a, methodName);

            var methodPrintPos = refactorBuilder.ToString().IndexOf('{', data.ClassStartIndex) + 1;
            refactorBuilder.Insert(methodPrintPos, method);

            Console.WriteLine(refactorBuilder.ToString());

            return refactorBuilder.ToString();
        }
    }
}