using System;
class SimpleClasssadasdads
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

class SomeClassWithNestedLambasdasdasda
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


class ClasssadasdasOneOne
{
    static void Main()
    {
        Action foo = () => {; };

        foo();
    }
}
public class SingleClassss
{

}

class ClassOneOddfdfdne
{
    static void Main()
    {
        Action foo = () => {; };

        foo();
    }
}

public class SissssmpleLambda
{
    void funWithLambda()
    {
        Action foo = () =>
        {
            Console.WriteLine(3);
        };
    }
}


class ClassTdfdfdfdfwoTwo
{

    void someMethod()
    {
        Func<int, int> foo2 = (x) => { return x; };
        Console.WriteLine(foo2(3));
    }
}

class ClasqwqeqwesTwoTwo
{

    void someMethod()
    {
        Func<int, int> foo2 = (x) => { return x; };
        Console.WriteLine(foo2(3));
    }
}

public class LambdazzzzqweAsProperty
{
    private Func<int, int> act = (x) => { return x; };
}

public class InvokesssFunctionInsideFunction
{
    int fun()
    {
        return 3;
    }

    void invokingFunction()
    {
        Console.WriteLine(fun());
    }
}