import java.util.*;
public class Cprime
{
    int a,b,c,d,p=0;
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Prime numbers are:");
        Cprime cp=new Cprime();
        cp.nodig(n);
        cp.prime();
    }

    public void nodig(int n1)
    {
        a=n1;
        while(n1%10>0)
        {
            b++;n1=n1/10;
        }
        c=(int)Math.pow(10,(b-1));
    }

    public void prime()
    {
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                p++;
        }
        if(p==2)
            cprime();
        else
            exit();
    }

    public void cprime()
    {
        if(b>d)
        {System.out.println(a);
        a=((a%c)*10)+(a/c);
        p=0;d++;prime();}
        else
        exit();
    }

    public void exit()
    {System.out.println("Exit");}
}