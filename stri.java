import java.util.*;
public class stri
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter");
        String a=sc.next();
        String b=a.toUpperCase();
        int x=a.length();
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(b.charAt(j));
            }
            System.out.println();
        }
        int n=x-1;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b.charAt(j));
            }
            System.out.println();
            n--;
        }
    }
}