using System;

class LambdaAsProperty
{
    public static int refactoredLambda0(int x)
    {
        return x;
    }

    private Func<int, int> act = refactoredLambda0;
}
