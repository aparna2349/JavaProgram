import javax.lang.model.util.ElementScanner14;

public class Ternary1 
{
    public static void main(String[] args){

        int a =30;
        int b = 20;
        int c = 40;
        int res = (a<b)? a:b;
        System.out.println(res);
        String result = (a<b)? "a is less": "b is less";
        System.out.println(result);

        int num = (a<b)?(a<c? a:b):(b<c? b: c);
        System.out.println(num);

        if(a<c);
        {
          if(a<b)
          {
            System.out.println(a);
          }
          else 
          {
            System.out.println(c);
          }
        }
    
        {
            if(b<c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
