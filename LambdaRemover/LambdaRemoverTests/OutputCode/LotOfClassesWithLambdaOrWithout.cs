using System;

class LotOfClassesWithLambdaOrWithout
{
    
}

class SomeClassWithLambda
{
    public static int refactoredLambda0(int x)
    {
        return x;
    }

    Func<int, int> act = refactoredLambda0;
}

class Nolaosdasdasld
{
    public static int refactoredLambda1(int x)
    {
        return x;
    }

    private Func<int, int> act = refactoredLambda1;
}

class ASDASDASDASD
{
    public static int refactoredLambda2(int x)
    {
        return x;
    }

    public Func<int, int> act = refactoredLambda2;
}


class QWEQWASKDJASLKJD
{
    public static int refactoredLambda3(int x)
    {
        return x;
    }

    void someMethod()
    {
        Func<int, int> foo2 = refactoredLambda3;
        Console.WriteLine(foo2(3));
    }
}

class QWEQWOEIOPlkaslsss
{
    void fuun()
    {
        ;
    }
}

class yutyutyutyutyuty
{
    void fuun()
    {
        ;
    }
}
