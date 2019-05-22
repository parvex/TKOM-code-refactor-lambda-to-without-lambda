using System;
class SimpleClass
{
    static void Main()
    {
        Action foo = () => {; };
        Func<int, int> foo2 = x =>
        {
            return x + 2;
        };

        foo();
    }
}

class SomeClassWithNestedLambda
{
    void someMethod()
    {

        Action z = () =>
        {
            Action b = () =>
            {
                Console.WriteLine(2);
            };
            b();
        };

        Func<int, int> foo3 = (x) => { return x; };
        Console.WriteLine(foo3(3));
    }
}