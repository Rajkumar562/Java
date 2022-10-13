import java.util.*;
public class Rearrange
{
    Scanner sc=new Scanner(System.in);
    int a[],b[],n,pos1,pos2,item;
    void enter()
    {
        System.out.println("Enter the array size");
        n=sc.nextInt();
        a=new int [n];
        b=new int [n+1];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    void insert()
    {
        System.out.println("Enter the position and item to be inserted");
        pos1=sc.nextInt();
        item=sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i>=pos1-1)
            {
                if(i==pos1-1)
                    b[i]=item;
                else if(i>pos1-1)
                    b[i]=a[i-1];
            }
            else
                b[i]=a[i];
        }
    }

    void disp1()
    {
        System.out.println("The elements after inserting are:");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    void remov()
    {
        System.out.println("Enter the position of the element to be deleted");
        int pos2=sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i>=pos2-1)
            {
                if(i==pos2-1)
                    a[i]=b[i+1];
                else if(i<n)
                    a[i]=b[i+1];
            }
            else
                a[i]=b[i];
        }
    }

    void disp2()
    {
        System.out.println("The elements after deleting are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main()
    {
        Rearrange re=new Rearrange();
        re.enter();
        re.insert();
        re.disp1();
        re.remov();
        re.disp2();
    }
}