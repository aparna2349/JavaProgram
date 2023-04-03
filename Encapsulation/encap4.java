class Student5 
{
    private String name;
    private int age;

    public void setName(String name)
    {
       this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    void setAge(int age)
    {
       this.age = age;
    }
    int getAge()
    {
        return age;
    }


}

public class encap4 
{
   public static void main(String[] args)  
   {
       Student5 st = new Student5();
       st.setAge(18);
       st.setName("Rahul");
       System.out.println(st.getAge());
       System.out.println(st.getName());  
       
       Student5 st1 = new Student5();
       st1.setAge(19);
       st1.setName("Rohit");
       System.out.println(st1.getAge());
       System.out.println(st1.getName());


   }
}
