public class binary
{
    public static void main(int n)
    {
        String a="";
        while(n>0)
        {
            a=(n%2)+a;
            n=n/2;
        }
        System.out.println(a);
    }
}
    