public class automorphic 
{
    public static void main(int n)
    {
        int m=n*n;
        String a=String.valueOf(n);
        int x =a.length();
        int y=1;
        for(int i=1;i<=x;i++)
        {
            y=y*10;
        }
        if(m%y==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        System.out.println("Not Automorphic Number");
    }
}