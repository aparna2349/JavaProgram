class Demo
{
    static void disp1()
    {
        System.out.println("Static displ");
    }
    void disp2()
    {
        System.out.println("Non static disp 2");
    }
}

public class Staticv3 
{
  public static void main(String[] args) 
  {
     Demo.disp1();
    // Demo.disp2();disp2 is non static

     Demo d = new Demo();
     d.disp1();
     d.disp2();


  } 
}
