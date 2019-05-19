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

        /// <summary>
        /// This dictionary holds list of lists of data required to refactor one class, key is the index of class definition
        /// </summary>
        public Dictionary<int, List<RefactorData>> DataToRefactorDictionary
            { get; set; } = new Dictionary<int, List<RefactorData>>();

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
            RefactorData data = new RefactorData(argList, body, lambdaExpressionInterval);

            if (!DataToRefactorDictionary.ContainsKey(methodDefIndex))
            {
                DataToRefactorDictionary[methodDefIndex] = new List<RefactorData>();
            }
            DataToRefactorDictionary[methodDefIndex].Add(data);


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