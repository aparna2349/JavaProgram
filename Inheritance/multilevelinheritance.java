
class Demo1  //parent class
{
    void disp()
    {
        System.out.println("Display written in demo1 class");
    }
}
class Demo2  extends Demo1 //child class
{

}

class Demo3 extends Demo2
{

}

public class multilevelinheritance
{
    public static void main(String[] args)
    {
       Demo3 d = new Demo3();
       d.disp();
        
    }
}
