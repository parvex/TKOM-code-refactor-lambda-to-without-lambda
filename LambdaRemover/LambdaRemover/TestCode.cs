using System;

class FunctionImplementations
{
    public static void fooImpl()
    {
        Console.WriteLine(3);
    }
}

class Program
{
    static void Main()
    {
        Action foo = FunctionImplementations.fooImpl;
        Func<int, int> foo2 = (x) => { return x; };

        foo();

        Console.WriteLine(foo2(3));
    }
}
