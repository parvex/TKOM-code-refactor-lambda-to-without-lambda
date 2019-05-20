using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace LambdaRemover
{
    public class LambdaRemoveVisitor : CsharpSubsetBaseVisitor<object>
    {
        public LambdaRemoveVisitor(AntlrInputStream inputStream)
        {
            InputStream = inputStream;
        }

        public List<RefactorData> RefactorDataList { get; set; } = new List<RefactorData>();

        public AntlrInputStream InputStream { get; set; }

        public override object Visit(IParseTree tree)
        {
            RefactorDataList.Clear();
            return base.Visit(tree);
        }

        public override object VisitLambdaExpression(CsharpSubsetParser.LambdaExpressionContext context)
        {
            string body = null;
            bool isTyped = false;
            if (context.lambdaBody() != null)
            {
                body = GetContextSource(context.lambdaBody());
                isTyped = context.lambdaBody().returnStmnt() != null;
            }
            else
            {
                body = "\nreturn " + GetContextSource(context.mathExpression()) + ";\n";
                isTyped = true;
            }


            var lambdaExpressionInterval = new Interval(context.Start.StartIndex, context.Stop.StopIndex);
            var argList = GetArgList(context);
            var classDefinitionContext = FindClassDefinitionContext(context);
            var clasStartIndex = classDefinitionContext.Start.StartIndex;
            RefactorData data = new RefactorData(argList, body, lambdaExpressionInterval, clasStartIndex, isTyped);

            RefactorDataList.Add(data);


            return base.VisitLambdaExpression(context);
        }

        private string GetArgList(CsharpSubsetParser.LambdaExpressionContext context)
        {
            string argList;
            
            StringBuilder args = new StringBuilder(GetContextSource(context.lambdaArgs()));
            if (args[0] == '(')
            {
                 args.Replace("(", "");
                 args.Replace(")", "");
            }
            Console.WriteLine(context.lambdaArgs());
            if (context.lambdaArgs().type().Length == 0 && context.lambdaArgs().NAME().Length != 0)
            {
                var arguments = args.ToString().Split(',');

                for (int i = 0; i < arguments.Length; i++)
                {
                    arguments[i] = "int " + arguments[i];
                }

                argList = string.Join(", ", arguments);
            }
            else
            {
                argList = args.ToString();
            }

            return argList;
        }

        private string GetContextSource(ParserRuleContext context)
        {
            return InputStream.GetText(new Interval(context.Start.StartIndex, context.Stop.StopIndex));
        }

        private CsharpSubsetParser.ClassDefinitionContext FindClassDefinitionContext(RuleContext context)
        {
            while (!(context is CsharpSubsetParser.ClassDefinitionContext) && !(context is CsharpSubsetParser.ProgramContext))
            {
                context = context.Parent;
            }

            if (context is CsharpSubsetParser.ClassDefinitionContext classDefinitionContext)
                return classDefinitionContext;
            else
                throw new IndexOutOfRangeException();
        }
    }
}