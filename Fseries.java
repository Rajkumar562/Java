public class Fseries
{
    public static void main()
    {
        int n=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                n=n+1;
                System.out.print(" "+n);
            }
            System.out.println();
        }
    }
}