class Student {
    public String sname;
    private String sphone;
    public String getsphone()
    {
        return sphone;
    }
    public void getsphone(String ph)
    {
        this.sphone = ph;
    }
}
class EncapsulationDemo
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.sname="K.Sushma sri";
        s.getsphone("93******01");
        System.out.println("Student name is "+s.sname);
        System.out.println("Student phone number is "+s.getsphone());
    }
}
