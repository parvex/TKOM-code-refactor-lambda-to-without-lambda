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

            return RefactorCode(codeString);
        }

        private string RefactorCode(string codeString)
        {
            LambdaRemoveVisitor visitor = new LambdaRemoveVisitor(InputStream);
            visitor.Visit(Tree);

            int i = 0;
            string refactoredString = codeString;
            while (visitor.RefactorDataList.Any())
            {
                refactoredString = RefactorSingleLambda(codeString, visitor.RefactorDataList.First(), i);

                ParseCode(refactoredString);
                visitor.InputStream = InputStream;
                visitor.Visit(Tree);
                ++i;
            }

            return refactoredString;
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


        private string RefactorSingleLambda(string codeString, RefactorData data, int index)
        {
            StringBuilder refactorBuilder = new StringBuilder(codeString);

            string methodName = "refactoredLambda" + index;
            string method = "public static" + (data.ArgumentList == "" ? "void" : "int") + methodName
                            + "(" + data.ArgumentList + ")" + "\n{" + data.LambdaBody + "\n}";


            refactorBuilder.Remove(data.LambdaInterval.a, data.LambdaInterval.b);
            refactorBuilder.Insert(data.LambdaInterval.a, methodName);

            // it will work wrong
            refactorBuilder.Insert(data.MethodDefIndex, method);

            Console.WriteLine(refactorBuilder.ToString());
            return refactorBuilder.ToString();
        }
    }
}