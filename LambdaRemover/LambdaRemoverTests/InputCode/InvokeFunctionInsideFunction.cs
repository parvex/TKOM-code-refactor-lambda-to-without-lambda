using System;

class InvokeFunctionInsideFunction
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