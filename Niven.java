public class Niven
{
    public static void main(int num)
    {
        int la,sum=0,n=num;
        while(num>0)
        {
            la=num%10;
            sum=sum+la;
            num=num/10;
        }
        if(n%sum==0)
        System.out.println("Niven Number");
        else
        System.out.println("Not a Niven Number");
    }
}