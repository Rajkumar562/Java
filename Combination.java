import java.util.*;
public class Combination
{
    static int n,k,a,b,c;double ans;
    Scanner sc=new Scanner(System.in);
    public Combination()
    {
        n=0;
        k=0;
    }
    void read()
    {
        System.out.println("Enter the Value of n");
        int n1=sc.nextInt();
        System.out.println("Enter the Value of k");
        int k1=sc.nextInt();
        n=n1;k=k1;
    }
    static int fact(int m)
    {
        if(m==1)
        return m;
        else
        return(m*fact(m-1));
    }
    void compute()
    {
        ans=a/(b*c);
    }
    void display()
    {
        System.out.println("The result using Combination is:"+ans);
    }
    public static void main()
    {
        Combination co=new Combination();
        co.read();
        a=fact(n);
        b=fact(k);
        c=fact(n-k);
        co.compute();
        co.display();
    }
}