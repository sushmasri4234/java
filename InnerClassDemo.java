import java.io.*;
class OuterClass 
{
    static int outer_x = 10;
    int outer_y = 20;
    private int outer_z = 30;
    class InnerClass
    {
        void display()
        {
            System.out.println("Outer_x value is "+outer_x);
            System.out.println("Outer_y value is "+outer_y);
            System.out.println("Outer_z value is "+outer_z);
        }
    }
}
class InnerClassDemo
{
    public static void main(String args[])
    {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.display();
    }
}
