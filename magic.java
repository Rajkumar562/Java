import java.util.*;
public class magic
{ 
    int s=0;
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        int n=sc.nextInt();
        magic m=new magic();
        m.magic(n);
    }
    void magic(int x)
    {
        s=0;
        while(x>0)
        {
            s+=x%10;
            x=x/10;
        }
        nodig();
    }
    void nodig()
    {
        int a=0;int b=s;
        while(b>0)
        {
            a++;b=b/10;
        }
        if(a==1)
        {
            if(s==1)
            System.out.println("The Number is a Magic Number");
            else
            System.out.println("The Number is not a Magic Number");
        }
        else
        magic(s);
    }
}
        