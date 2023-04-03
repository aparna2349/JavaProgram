

import java.util.Scanner;

public class Sub 
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
       // System.out.println("Please enter the number of classes");
        //int classes = sc.nextInt();
        //System.out.println("Please enter the number of Students in each class");
        //int stuCount = sc.nextInt();
        
        int[] [] ar = new int[3] [];

        ar[0] = new int[3];
        ar[1] = new int[2];
        ar[2] = new int[4];

        
        for(int i = 0; i<ar.length; i++)
        {
            for(int j =0 ;j<ar[i].length;j++)
            {
                System.out.println("Please  enter the marks of class" + i + "students" + j);
                ar[i][j] = sc.nextInt(); 
            }
            
        }
        System.out.println("The Marks of students are as below");
        
        for(int i = 0; i<ar.length; i++)
        {
            for(int j =0 ;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j] + " ");
                
            }
            System.out.println();
            
        }



       
        
    }
}
