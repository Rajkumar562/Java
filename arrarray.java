import java.util.*;
public class arrarray
{
    Scanner sc=new Scanner(System.in);
    int m,n=0;
    int a[][],b[];
    public void size()
    {
        System.out.println("Enter the size of the array");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m>1 && n>1)
        {
            if(m<20 && n<20)
                input();
        }
        else
            err();
    }

    public void input()
    {
        int x=0;
        int a[][]=new int[m][n];
        int b[]=new int[m*n];
        System.out.println("Enter the Numbers");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                b[x]=(int)(Math.random()*11+0);
                System.out.println(b[x]);
                x++;
            }
        }
        print();
        con();
    }

    public void con()
    {
        int y=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[y]=a[i][j];
                y++;
            }
        }
        find();
    }

    void print()
    {
        for(int i=0;i<m*n;i++)
        {
            System.out.println(b[i]);
        }
    }
    void find()
    {
        int temp=0;
        for(int i=0;i<(m*n);i++)
        {
            for(int j=i+1;j<(m*n);j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        checklar();
        checksm();
    }

    void checklar()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[0]==a[i][j])
                {
                    System.out.println("LARGEST NUMBER :"+b[0]);
                    System.out.println();
                    System.out.println("ROW = "+i);
                    System.out.println("COLUMN = "+j);
                }
            }
        }
    }

    void checksm()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[m*n-1]==a[i][j])
                {
                    System.out.println("SMALLEST NUMBER :"+b[m*n-1]);
                    System.out.println();
                    System.out.println("ROW = "+i);
                    System.out.println("COLUMN = "+j);
                }
            }
        }
    }

    void err()
    {
        System.out.println("Out of Range");
    }
}  