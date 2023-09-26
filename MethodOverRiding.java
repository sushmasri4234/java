import java.io.*;
class Bank 
{
    int getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}
class HDFC extends Bank
{
    int getRateOfInterest()
    {
        return 9;
    }
}
class UnionBank extends Bank
{
    int getRateOfInterest()
    {
        return 10;
    }
}
class MethodOverRidingDemo
{
    public static void main(String args[])
    {
        SBI s = new SBI();
        HDFC h= new HDFC();
        UnionBank u = new UnionBank();
        System.out.println("SBI Rate Of Interest is "+s.getRateOfInterest());
        System.out.println("HDFC Rate of Interest is "+h.getRateOfInterest());
        System.out.println("UnionBank Rate of Interest is "+u.getRateOfInterest());
    }
}
