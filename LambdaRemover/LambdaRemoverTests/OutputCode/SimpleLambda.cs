using System;

 class SimpleLambda
{
    public static void refactoredLambda0()
    {
        Console.WriteLine(3);
    }

    void funWithLambda()
    {
        Action foo = refactoredLambda0;
    }
}
