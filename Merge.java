import java.util.*;
public class Merge
{
    String p,q,r="";int a=0;
    public Merge(int m1,int m2)
    {
        p=String.valueOf(m1);
        q=Integer.toString(m2);
        r=p+q;
        merge();
    }
    public void merge()
    {
        a=Integer.parseInt(r);
        System.out.print("The Merged Number is "+a);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers to be merged");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Merge m=new Merge(x,y);
    }
}