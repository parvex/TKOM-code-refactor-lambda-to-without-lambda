using System;
class SimpleClass
{
    public static int refactoredLambda1(int x)
    {
        return x + 2;
    }

    public static void refactoredLambda0()
    {
        ;
    }

    static void Main()
    {
        Action foo = refactoredLambda0;
        Func<int, int> foo2 = refactoredLambda1;

        foo();
    }
}

class SomeClassWithNestedLambda
{
    public static int refactoredLambda4(int x)
    {
        return x;
    }

    public static void refactoredLambda3()
    {
        Console.WriteLine(2);
    }

    public static void refactoredLambda2()
    {
        Action b = refactoredLambda3;
                    b();
    }

    void someMethod()
    {

        Action z = refactoredLambda2;

        Func<int, int> foo3 = refactoredLambda4;
        Console.WriteLine(foo3(3));
    }
}