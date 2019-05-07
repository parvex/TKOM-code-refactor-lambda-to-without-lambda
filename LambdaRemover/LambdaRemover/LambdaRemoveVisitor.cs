namespace LambdaRemover
{
    public class LambdaRemoveVisitor : CsharpSubsetBaseVisitor<object>
    {
        //something should go there...
        public override object VisitLambdaExpression(CsharpSubsetParser.LambdaExpressionContext context)
        {
            return base.VisitLambdaExpression(context);
        }
    }
}