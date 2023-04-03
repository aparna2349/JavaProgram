   interface A
{
     int num = 6;//interface ke andr jo v varible hota h wo by default public static ya final hota h
     void show();

}
public class DemoInterf
{
    public static void main(String[] args)
    {
       System.out.println(A.num);
       A obj = new A();
    }
}
