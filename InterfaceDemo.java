import java.io.*;
import java.util.*;
interface Language 
{
    public void getName(String name);
}
class ProgrammingLanguage implements Language
{
    public void getName(String name)
    {
        System.out.println("My Favourite Programming Language is "+name);
    }
}
class InterfaceDemo
{
    public static void main(String args[])
    {
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("Java");
    }
}
