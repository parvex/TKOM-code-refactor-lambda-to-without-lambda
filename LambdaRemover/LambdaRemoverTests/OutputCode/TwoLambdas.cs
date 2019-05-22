using System;

class ClassClass
{
    public static int refactoredLambda1(int x)
    {
        return x;
    }

    public static void refactoredLambda0()
    {
        Console.WriteLine(3);
    }

    static void Main()
    {
        Action foo = refactoredLambda0;
        Func<int, int> foo2 = refactoredLambda1;

        foo();

        Console.WriteLine(foo2(3));
    }
}