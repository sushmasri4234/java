import java.io.*;
class Rectangle 
{
    int a;
    Rectangle(int l,int b)
    {
        a=l*b;
    }
}
class ParameterisedConstructorDemo
 {
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(5,5);
        System.out.println("Area of rectangle1 is "+r.a);
    }
}
