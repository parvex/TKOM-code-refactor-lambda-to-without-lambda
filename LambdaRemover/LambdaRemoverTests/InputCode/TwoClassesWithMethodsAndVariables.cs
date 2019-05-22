using System;

class MyClass
{
    int a;
    int b = 3;

    public int fun(int param)
    {
        return param;
    }
}

class SomeMain
{
    static void Main()
    {
        MyClass myClass = new MyClass();

        Console.WriteLine(myClass.fun(10));
    }
}