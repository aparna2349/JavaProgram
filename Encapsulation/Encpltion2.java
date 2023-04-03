class Student
{
  
    private int age;
    private String name;

    Student(String name,int age)
    {
       this.name = name;
       this.age = age;
    }

    

 //  public void show()
  // {
  //  System.out.println(name + " " + age);
 //  }
//public int getAge() 
{
    return age;
}
//public void setAge(int age) 
//{}
 //   this.age = age;
//}
public String getName() 
{
    return name;
}
public int getAge() {
    return age;
}
}

public class Encpltion2 {
    public static void main(String[] args)
    {
        Student st = new Student("Rahul", age 10);
        st.disp();

        //st.setName("Rahul");
        //st.setAge(10);

        String name = st.getName();
        System.out.println(name);
        //System.out.println(st.getName());
        int age = st.getAge();
        System.out.println(age);

        
    }
    
}
