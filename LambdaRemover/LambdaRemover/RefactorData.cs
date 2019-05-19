using Antlr4.Runtime.Misc;

namespace LambdaRemover
{
    public class RefactorData
    {
        public RefactorData(string argumentList, string lambdaBody, Interval lambdaInterval)
        {
            ArgumentList = argumentList;
            LambdaBody = lambdaBody;
            LambdaInterval = lambdaInterval;
        }

        public string ArgumentList { get; set; }

        public string LambdaBody { get; set; }

        public Interval LambdaInterval { get; set; }
    }
}