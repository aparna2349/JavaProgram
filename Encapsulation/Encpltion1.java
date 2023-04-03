class Student
{
   private int age;
   private String name;

   public void SetData()
   {
    age = 18;
    name = "Rahul";
   }

   public void show()
   {
    System.out.println(name + " " + age);
   }
}

public class Encpltion1 {
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.SetData();
        obj.show();
    }
    
}
