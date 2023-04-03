public class Exceptionsec {
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 2;
        int result   = 0;
        int values[] = {4,7,2,9};
        String name = null;

        try
        {
         result = num1 / name.length();
         System.out.println(values[5]);
        }
        catch(ArithmeticException obj)
        {

            System.out.println("cannot divide by zero" + obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(values[values.length - 1]);
            System.out.println("stay in your limits");
        }
        catch(Exception obj)
        {
            System.out.println("something went wrong..");
        }
        System.out.println( result);
        System.out.println("Bye");
    }
}


//two types of statement
//1. normal statement
//2. critical statement


