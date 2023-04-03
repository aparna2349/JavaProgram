class Human1   //Super class //Base class //Parent class
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("Human class Constructor");
    }
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1  extends Human1   //Child class //Sub class // Derived class
{   //public Student1()
   // {
        //phli line me constructor ke super(); method call hota h
    //}
   void disp()
    {
        System.out.println("The age is : " + age);
        //System.out.println("The Name is : " + name);
    }
   
}

class inheritance2 
{
    public static void main(String[] args)
    {

        Student1 st1 = new Student1();
        st1.sleep();
    }
}

