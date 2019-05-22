using System;

class MissingBracket
{
    void funWithLambda()
    {
        Action foo = () =>
        {
            Console.WriteLine(3);
        };
    
}