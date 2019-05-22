using System;

class LambdaAsProperty
{
    private Func<int, int> act = (x) => { return x; };
}
