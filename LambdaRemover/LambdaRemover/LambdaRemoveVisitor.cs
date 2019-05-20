﻿using System;
using System.Collections.Generic;
using System.Linq;
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

        public override object VisitLambdaBody(CsharpSubsetParser.LambdaBodyContext context)
        {
            string body = GetContextSource(context);

            CsharpSubsetParser.LambdaExpressionContext lambdaExpressionContext = context.Parent as CsharpSubsetParser.LambdaExpressionContext;
            if (lambdaExpressionContext == null)
                throw new NullReferenceException();

            var lambdaExpressionInterval = new Interval(lambdaExpressionContext.Start.StartIndex, lambdaExpressionContext.Stop.StopIndex);
            var argList = GetArgList(lambdaExpressionContext);
            var classDefinitionContext = FindClassDefinitionContext(context);
            var clasStartIndex = classDefinitionContext.Start.StartIndex;
            RefactorData data = new RefactorData(argList, body, lambdaExpressionInterval, clasStartIndex);

            RefactorDataList.Add(data);

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