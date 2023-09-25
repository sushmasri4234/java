import java.io.*;
class Animal
{
    public void AnimalSound()
    {
        System.out.println("An animal can make sounds ");
    }
}
class Cow extends Animal
{
    public void AnimalSound()
    {
        System.out.println("A Cow sound-Mao");
    }
}
class Cat extends Animal
{
    public void AnimalSound()
    {
        System.out.println("A Cat sounds-Meow");
    }
}
class PolymorphismDemo
{
    public static void main(String args[])
    {
        Animal an = new Animal();
        Animal mycow = new Cow();
        Animal mycat = new Cat();
        an.AnimalSound();
        mycow.AnimalSound();
        mycat.AnimalSound();
    }
}
