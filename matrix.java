import java.util.*;
public class matrix
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter");
        int A[][]=new int [2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter");
        int B[][]=new int [2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        int C[][]=new int [2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                C[i][j]=(A[i][0]*B[0][j])+(A[i][1]*B[1][j]);
            }
            System.out.println();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(" "+C[i][j]+" ");
            }
            System.out.println();
        }
    }
}