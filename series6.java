public class series6
{
    public static void main()
    {
        int n=6;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                n=n+1;
                System.out.print(" "+n);
            }
            System.out.println();
            for(int k=1;k<=i+2;k++)
            {
                n=n+1;
                System.out.print(" "+n);
            }
            System.out.println();
        }
    }
}
                