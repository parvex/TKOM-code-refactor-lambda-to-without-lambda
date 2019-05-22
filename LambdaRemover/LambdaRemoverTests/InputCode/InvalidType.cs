using System;

class InvalidType
{
    static void Main()
    {
        it a;
        int b = a * 3 + a;

        Console.WriteLine(b);
    }
}