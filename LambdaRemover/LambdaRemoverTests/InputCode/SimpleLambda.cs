using System;

 class SimpleLambda
{
    void funWithLambda()
    {
        Action foo = () =>
        {
            Console.WriteLine(3);
        };
    }
}
