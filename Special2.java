public class Special2
{
    public static void main(int n)
    {
        int r,sum=0,pr=1,s=0,num=n;
        for(int i=1;i<=2;i++)
        {
            r=n%10;
            sum=sum+r;
            pr=pr*r;
            n=n/10;
        }
        s=sum+pr;
        if(s==num)
        System.out.println("Special 2-digit number");
        else
        System.out.println("Not a Special 2-digit number");
    }
}