class Books
{
   private int pgNo;

   void setPgno(int x)
   {
      if(x>0)
      {
        pgNo = x; 
      }
      else
      {
           System.out.println("Pagal h? negative value ?");
      }
    
   }

   public int getPgNo() 
   {
       return pgNo;
   }

   
}

public class Encpltion 
{
    public static void main(String[] args) 
    {
       Books b = new Books();
       //b.pgNo=-100;
      // System.out.println(b.pgNo);error

      b.setPgno(-100);

      System.out.println(b.getPgNo());
    }
}
