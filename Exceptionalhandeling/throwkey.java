//Custom exception and throw keyword
public class throwkey 
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = -2;
            try
            {
            if (num2 < 0)
            {
                System.out.println("Enter a valid number");
            }
            else
            {
            int result =  num1 / num2;
            System.out.println(result);
            }
            catch(Exception e)
            {
            System.out.println("Enter a valid number");
            }
            }
    

    }
}