using System;

class ClassOneOne
{
    static void Main()
    {
        Action foo = () => {; };

        foo();
    }
}

class ClassTwoTwo
{

    void someMethod()
    {
        Func<int, int> foo2 = (x) => { return x; };
        Console.WriteLine(foo2(3));
    }
}