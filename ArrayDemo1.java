import java.io.*;
public class ArrayDemo1
{
    public static void main(String args[]) 
    {
        int a[];
        a = new int[5];
        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        a[3] = 14;
        a[4] = 15;
        System.out.println("The array elements are ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
