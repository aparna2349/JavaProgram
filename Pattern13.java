import javax.lang.model.util.ElementScanner14;

public class Pattern13 
{
  public static void main(String[] args)
  {
    int n=11;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(i==0 || i==n-1 || i== (n-1)/2 || j==0 && i<=(n-1)/2 || j==n-1 && i>=(n-1)/2)
            {
                System.out.print("* ");
            }
            else{
                System.out.println("");
            } 
            
        }
        System.out.println();
    }
  }  
}
