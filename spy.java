public class spy
{
     public static void main(int n)
     {
         int r,sum=0,pr=1;
         while(n>0)
         {
             r=n%10;
             sum= sum+r;
             pr=pr*r;
             n=n/10;
            }
            if(sum == pr)
            System.out.println("The no is a spy number.");
            else
            System.out.println("The no is not a spy number.");
        }
    }