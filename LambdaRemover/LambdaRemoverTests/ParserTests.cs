﻿using System.Collections.Generic;
using System.Collections.ObjectModel;
using Antlr4.Runtime;
using LambdaRemover;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace LambdaRemoverTests
{
    [TestClass]
    public class ParserTests
    {
        [TestMethod]
        public void ParsesTrivialExample()
        {
            string example = 
                "class Program\r\n{\r\n   static void Main()\r\n    {\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(0, errors.Count);
        }

        [TestMethod]
        public void NotParsesExampleWithArithmeticStatementsAndWrongType()
        {
            string example =
                "using System;\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        it a;\r\n        int b = a*3+a;\r\n\r\n        Console.WriteLine(b);\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(1, errors.Count);
        }

        [TestMethod]
        public void ParsesExampleWithMultipleClassesAndMethods()
        {
            string example =
                "using System;\r\n\r\nclass MyClass\r\n{\r\n    int a;\r\n    int b = 3;\r\n\r\n    public int fun(int param)\r\n    {\r\n        return param;\r\n    }\r\n}\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        MyClass myClass = new MyClass();\r\n\r\n        Console.WriteLine(myClass.fun(10));\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(0, errors.Count);
        }

        [TestMethod]
        public void ParsesExampleWithLambdasAndDelegates()
        {
            string example =
                "using System;\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        Action foo = () =>\r\n        {\r\n            Console.WriteLine(3);\r\n        };\r\n        Func<int, int> foo2 = (x) =>\r\n        {\r\n            return x;\r\n        };\r\n\r\n        foo();\r\n\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(0, errors.Count);
        }

        [TestMethod]
        public void ParsesExampleWithDelegatesAndMethodsRefactored()
        {
            string example =
                "using System;\r\n\r\nclass Program\r\n{\r\n    public static void fooImpl()\r\n    {\r\n        Console.WriteLine(3);\r\n    }\r\n\r\n    public static int foo2Impl(int x)\r\n    {\r\n        return x;\r\n    }\r\n\r\n\r\n    static void Main()\r\n    {\r\n        Action foo = fooImpl;\r\n        Func<int, int> foo2 = foo2Impl;\r\n\r\n        foo();\r\n\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(0, errors.Count);
        }

        [TestMethod]
        public void FindsMissingParenthesis()
        {
            string example =
                "using System;\r\n\r\nclass Program\r\n{\r\n    public static void fooImpl()\r\n    {\r\n        Console.WriteLine(3;\r\n    }\r\n\r\n    public static int foo2Impl(int x)\r\n    {\r\n        return x;\r\n    }\r\n\r\n\r\n    static void Main()\r\n    {\r\n        Action foo = fooImpl;\r\n        Func<int, int> foo2 = foo2Impl;\r\n\r\n        foo();\r\n\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(1, errors.Count);
        }

        [TestMethod]
        public void FindsWrongClassStatement()
        {
            string example =
                "using System;\r\n\r\nclassz Program\r\n{\r\n    static void Main()\r\n    {\r\n        Action foo = () =>\r\n        {\r\n            Console.WriteLine(3);\r\n        };\r\n        Func<int, int> foo2 = (x) =>\r\n        {\r\n            return x;\r\n        };\r\n\r\n        foo();\r\n\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            var errors = ParseAndReturnErrors(example);
            Assert.AreEqual(1, errors.Count);
        }

        //MAIN TESTS (FROM DOCUMENTATION)

        [TestMethod]
        public void RefactorExample1()
        {
            string example = "class Program\r\n{\r\n    static void Main()\r\n    {\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Refactor completed!"));
        }

        [TestMethod]
        public void RefactorExample2()
        {
            string example = "using System;\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        it a;\r\n        int b = a*3+a;\r\n\r\n        Console.WriteLine(b);\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Couldn't refactor, one or more syntax errors occurred:"));
        }

        [TestMethod]
        public void RefactorExample3()
        {
            string example = "using System;\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        Action foo = () =>\r\n        {\r\n            Console.WriteLine(3);\r\n        };\r\n        Func<int, int> foo2 = (x) =>\r\n        {\r\n            return x;\r\n        };\r\n\r\n        foo();\r\n\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Refactor completed!"));
        }

        [TestMethod]
        public void RefactorExample4()
        {
            string example =
                "using System;\r\n\r\nclass Program\r\n{\r\n    public static void fooImpl()\r\n    {\r\n        Console.WriteLine(3);\r\n    }\r\n\r\n\r\n    static void Main()\r\n    {\r\n        Action foo = fooImpl;\r\n        Func<int, int> foo2 = (x) => { return x; };\r\n\r\n        foo();\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Refactor completed!"));
        }

        [TestMethod]
        public void RefactorExample5()
        {
            string example =
                "using System;\r\n\r\n\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        Action foo = () => { ;};\r\n\r\n        foo();\r\n    }\r\n}\r\n\r\nclass SomeClass\r\n{\r\n\r\n    void someMethod()\r\n    {\r\n        Func<int, int> foo2 = (x) => { return x; };\r\n        Console.WriteLine(foo2(3));\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Refactor completed!"));
        }

        [TestMethod]
        public void RefactorExample6()
        {
            string example =
                "using System;\r\nclass Program\r\n{\r\n    static void Main()\r\n    {\r\n        Action foo = () => {; };\r\n        Func<int, int> foo2 = x =>\r\n        {\r\n            return x + 2;\r\n        };\r\n\r\n        foo();\r\n    }\r\n}\r\n\r\nclass SomeClass\r\n{\r\n\r\n    void someMethod()\r\n    {\r\n\r\n        Action z = () =>\r\n        {\r\n            Action b = () =>\r\n            {\r\n                Console.WriteLine(2);\r\n            };\r\n            b();\r\n        };\r\n\r\n        Func<int, int> foo3 = (x) => { return x; };\r\n        Console.WriteLine(foo3(3));\r\n    }\r\n}\r\n";
            ObservableCollection<string> logOutput = new ObservableCollection<string>();
            var engine = new RefactorEngine(logOutput);
            engine.RemoveLambdas(example);

            Assert.IsTrue(logOutput.Contains("Refactor completed!"));
        }

        private List<SyntaxError> ParseAndReturnErrors(string input)
        {
            AntlrInputStream inputStream = new AntlrInputStream(input);
            CsharpSubsetLexer lexer = new CsharpSubsetLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            CsharpSubsetParser parser = new CsharpSubsetParser(commonTokenStream);
            SyntaxErrorListener listener = new SyntaxErrorListener();
            parser.AddErrorListener(listener);
            CsharpSubsetParser.ProgramContext programContext = parser.program();
            return listener.SyntaxErrors;
        }
    }
}
