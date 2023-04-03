import javax.lang.model.util.ElementScanner14;

class Conditional 
{
    public static void main(String[]args)
    {
      //  int age = 17;

      //  if(age >= 18)
       // {
       //     System.out.println("Legal adult");
      //  }
      //  else
      //  {
      //      System.out.println("You are a kid");
      //  }

     // int age=16;
      //if(age >= 18 && age < 60)
     // {
       // System.out.println("You  are  an adult");
     // }
    //  else if(age >= 60)
     // {
     //   System.out.println("you are old man now");
     // }
     // else 
    //  {
      //  System.out.println("you are still a kid");
     // }
     int age = 18;
     if(age >= 18 && age <=60)
     {
      if(age > 20 && age < 30)
      {
        System.out.println("You are in 20's");
      }
    else if(age >= 30 && age <= 40)
    {
        System.out.println("you  in 30's");
    }
    else 
    {
        System.out.println("you are still teen");
    }
 }
    else if (age>60)
    {
      System.out.println("you are an old man");
    }
    else if(age >= 16 && age < 18)
    {
        System.out.println("you are teenager");
    }
    else
    {
        System.out.println("You are still a kid");
    }

    }

}
