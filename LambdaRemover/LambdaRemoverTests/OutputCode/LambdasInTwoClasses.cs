using System;

class ClassOneOne
{
    public static void refactoredLambda0()
    {
        ;
    }

    static void Main()
    {
        Action foo = refactoredLambda0;

        foo();
    }
}

class ClassTwoTwo
{
    public static int refactoredLambda1(int x)
    {
        return x;
    }


    void someMethod()
    {
        Func<int, int> foo2 = refactoredLambda1;
        Console.WriteLine(foo2(3));
    }
}