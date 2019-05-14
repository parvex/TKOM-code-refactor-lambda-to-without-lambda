using System;
using System.Windows.Controls;
using Antlr4.Runtime;

namespace LambdaRemover
{
    public class RefactorEngine
    {

        public RefactorEngine(string codeString, TextBlock logOutput)
        {
            codeString =
                "using System;\r\n\r\nclass MyClass\r\n{\r\n    int a;\r\n    int b = 3;\r\n\r\n    public int fun(int param)\r\n    {\r\n        return param;\r\n    }\r\n}\r\n\r\nclass Program\r\n{\r\n    static void Main)\r\n    {\r\n        MyClass myClass = new MyClass();\r\n\r\n        Console.WriteLine(myClass.fun(10));\r\n    }\r\n}\r\n";
            AntlrInputStream inputStream = new AntlrInputStream(codeString);
            CsharpSubsetLexer lexer = new CsharpSubsetLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CsharpSubsetParser parser = new CsharpSubsetParser(commonTokenStream);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.AddErrorListener(listener);
            CsharpSubsetParser.ProgramContext programContext = parser.program();
            //LambdaRemoveVisitor visitor = new LambdaRemoveVisitor();
            Console.WriteLine(listener.ToString());
        }

    }
}