import java.util.*;
public class multi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int A[]=new int[3];
        int a=0;int b=0;int c=0;
        for(int i=0;i<3;i++)
        {
            A[i]=sc.nextInt();
        }
        if((A[2]-A[1])==(A[1]-A[0]))
            a=A[2]-A[1];
        b=A[0];
        int B[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            if(i>0)
            {b++;a++;c=a;}
            for(int j=0;j<3;j++)
            {
                if(i==0)
                    B[i][j]=A[j];
                if((i>0)&& j==0)
                    B[i][j]=b;
                if((i>0)&&(j>0))
                    B[i][j]=b+c;
                System.out.print(" "+B[i][j]+" ");
                if((i>0)&&(j>0))
                    c=c+a;
            }
            System.out.println();
        }
    }
}
