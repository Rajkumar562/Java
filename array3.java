import java.util.*;
public class array3
{
     int A[]= new int[10];
     int i,j,t;
     public void display ()
     {
         Scanner sc = new Scanner(System.in);
         for(i = 0;i<10;i++)
         {
             System.out.println("Enter Weight");
             A[i]=sc.nextInt();
            }
            for(i=0;i<10;i++)
            {
                for(j=i+1;j<10;j++)
                {
                    if(A[i]<A[j])
                    {
                        t=A[i];
                        A[i]=A[j];
                        A[j]=t;
                    }
                }
            }
            for(i=0;i<10;i++)
            {
                System.out.println(A[i]);
            }
        }
    }
