import java.util.*;
public class Alpha 
{
    String Str;
    Alpha()
    {
        Str="";
    }
    void readword()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        Str=sc.next();
    }
    void arrange()
    {
        char temp=0;
        char a[]=Str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            char ch=Str.charAt(i);
            if(Character.isUpperCase(ch))
                i=1;
            int ch1=(int)a[i];
            for(int j=i;j<a.length;j++)
            {
                int ch2=(int)a[j];
                if(ch2<ch1)
                {ch1=(int)a[j];
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        Str=String.valueOf(a);
    }
    void disp()
    {
        System.out.println("The letters in acsending order:");
        System.out.println(Str);
    }
    public static void main()
    {
        Alpha al=new Alpha();
        al.readword();
        al.arrange();
        al.disp();
    }
}