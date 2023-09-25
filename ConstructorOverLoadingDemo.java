import java.io.*;
class Square {
    int s;
    Square()
    {
        s=5;
    }
    Square(int x)
    {
        s=x;
    }
    void area ()
    {
        System.out.println("Area of the square is "+s*s);
    }
}
class ConstructorOverLoadingDemo
{
    public static void main(String args[])
    {
        Square s1 = new Square();
        Square s2 = new Square (8);
        s1.area();
        s2.area();
    }
}
