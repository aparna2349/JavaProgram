@FunctionalInterface
interface Car
{
   void drive(int avg);
}

public class lamdaex{

    public static void main(String[] args)
    {
        Car obj = avg -> System.out.println("Driving..." + avg);

        obj.drive(16);

            
        
    } 
}

