public class pefect
{
     public static void main(int n)
     {
         int sum;
         System.out.println("Perfect Numbers are:");
         for(int i=1;i<=n;i++)
         {
             sum=0;
             for(int j=1;j<i;j++)
             {
                 if(i%j==0)
                 {sum=sum+j;}
                }
                if(sum==i)
                {System.out.println(i);}
            }
        }
    }
                 