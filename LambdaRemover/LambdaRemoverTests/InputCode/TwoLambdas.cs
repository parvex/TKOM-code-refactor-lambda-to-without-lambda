using System;

class ClassClass
{
    static void Main()
    {
        Action foo = () =>
        {
            Console.WriteLine(3);
        };
        Func<int, int> foo2 = (x) =>
        {
            return x;
        };

        foo();

        Console.WriteLine(foo2(3));
    }
}