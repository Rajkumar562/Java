import java.util.*;
public class vowels3
{
   public static void main()
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter String");
       String x = sc .nextLine();
       int p=0;int q=0;int r=0;int s=0;int t=0;
       for(int j = 0;j<x.length();j++)
       {
           
           char ch = x.charAt(j);
           
           if (ch == 'a')
           {
               p = p+1;
            }
            else if(ch =='e')
            {
                q = q+1;
            }
            else if (ch == 'i')
            { 
                r = r+1;
            }
            else if (ch == 'o')
            {
                s = s+1;
            }
            else if (ch == 'u')
            {
                t = t+1;
            }
        }
        System.out.println("No of a =" + p);
        System.out.println("No of e =" + q);
        System.out.println("No of i =" + r);
        System.out.println("No of o =" + s);
        System.out.println("No of u =" + t);
    }
}