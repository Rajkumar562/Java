import java.util.*;
public class array2 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values first time and 5 values second time.");
        int A[] = new int [5];
        int B[] = new int [5];
        int C[] = new int [5];
        for(int i=0;i<=4;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int j=0;j<=4;j++)
        {
            B[j]=sc.nextInt();
        }
        for(int k=0;k<=4;k++)
        {
            C[k]=A[k]+B[k];
        }
        for(int l=0;l<=4;l++)
        {
            System.out.println(C[l]);
        }
    }
}
