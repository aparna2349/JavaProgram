class Calculator
{
    int add(int x,int y)
    {
       // int res = x+y;
       //return res;
       return x+y;
    }
    //void add(int x,int y)
    //{

    //}
    float add(int x, float y)
    {
        return x+y;
    }
    int add(int x,int y,int z)
    {
        return x+y+z;
    }
    double add(int x,double y,double z)
    {
        return  x+y+z;
    }
    double add(double x, double y, double z)
    {
        return x+y+z;
    }
}
public class methdovload
{
    public static void main(String[]args) 
    {
       Calculator calc = new Calculator();
       calc.add(10,20,30);
       calc.add(10,20);
       calc.add(10.4,20.5,30.5);

    }
}