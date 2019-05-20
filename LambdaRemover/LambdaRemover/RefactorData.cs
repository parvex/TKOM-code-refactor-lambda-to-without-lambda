using Antlr4.Runtime.Misc;

namespace LambdaRemover
{
    public class RefactorData
    {
        public RefactorData(string argumentList, string lambdaBody, Interval lambdaInterval, int classStartIndex, bool isTyped)
        {
            ArgumentList = argumentList;
            LambdaBody = lambdaBody;
            LambdaInterval = lambdaInterval;
            ClassStartIndex = classStartIndex;
            IsTyped = isTyped;
        }

        public string ArgumentList { get; set; }

        public string LambdaBody { get; set; }

        public Interval LambdaInterval { get; set; }

        public int ClassStartIndex { get; set; }

        public bool IsTyped { get; set; }
    }
}