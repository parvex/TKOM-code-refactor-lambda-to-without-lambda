using System;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

namespace LambdaRemover
{
    public class LambdaRemoveVisitor : CsharpSubsetBaseVisitor<object>
    {
        public LambdaRemoveVisitor(AntlrInputStream inputStream)
        {
            _inputStream = inputStream;
        }

        public List<(int methodDefIndex, Interval lambdaInterval, string argList, string body)> DataToRefactorList
            { get; set; } = new List<(int methodDefIndex, Interval lambdaInterval, string argList, string body)>();

        AntlrInputStream _inputStream;

        public override object VisitLambdaBody(CsharpSubsetParser.LambdaBodyContext context)
        {
            string body = GetContextSource(context);

            CsharpSubsetParser.LambdaExpressionContext lambdaExpressionContext = context.Parent as CsharpSubsetParser.LambdaExpressionContext;
            if (lambdaExpressionContext == null)
                throw new NullReferenceException();

            var lambdaExpressionInterval = new Interval(lambdaExpressionContext.Start.StartIndex, lambdaExpressionContext.Stop.StopIndex);
            var argList = GetArgList(lambdaExpressionContext);

            var methodDefContext = FindMethodDefinitionContext(context);

            int methodDefIndex = methodDefContext.Start.StartIndex;
            DataToRefactorList.Add((methodDefIndex, lambdaExpressionInterval, argList, body));

            return base.VisitLambdaBody(context);
        }

        private string GetArgList(CsharpSubsetParser.LambdaExpressionContext lambdaExpressionContext)
        {
            string argList;
            if (lambdaExpressionContext.argList() != null)
            {
                var arguments = GetContextSource(lambdaExpressionContext.argList()).Split(',');

                for (int i = 0; i < arguments.Length; i++)
                {
                    arguments[i] = "int " + arguments[i];
                }

                argList = string.Join(", ", arguments);
            }
            else if (lambdaExpressionContext.typedArgList() != null)
            {
                argList = GetContextSource(lambdaExpressionContext.typedArgList());
            }
            else
            {
                argList = "";
            }

            return argList;
        }

        private string GetContextSource(ParserRuleContext context)
        {
            return _inputStream.GetText(new Interval(context.Start.StartIndex, context.Stop.StopIndex));
        }

        private CsharpSubsetParser.MethodDefinitionContext FindMethodDefinitionContext(RuleContext context)
        {
            while (!(context is CsharpSubsetParser.MethodDefinitionContext) && !(context is CsharpSubsetParser.ProgramContext))
            {
                context = context.Parent;
            }

            if (context is CsharpSubsetParser.MethodDefinitionContext definitionContext)
                return definitionContext;
            else
                throw new IndexOutOfRangeException();
        }
    }
}