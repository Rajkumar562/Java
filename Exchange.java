import java.util.*;
public class Exchange
{
    String sent,rev;
    int size;
    Exchange()
    {
        sent="";
        rev="";
        size=0;
    }
    void readsentence()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Sentence");
        sent=sc.nextLine();
        size=sent.length();
    }
    void exfirstlast()
    {
        String a,b="";
        int p=0;char ch1,ch2=0;
        for(int i=0;i<size;i++)
        {
            char ch=sent.charAt(i);
            if(ch==' ' || ch=='.')
            {
                a=sent.substring(p,i);
                if(a.length()>1)
                {b=sent.substring(p+1,i-1);
                ch1=sent.charAt(p);
                ch2=sent.charAt(i-1);
                p=i+1;
                rev=rev+ch2+b+ch1+" ";}
                else
                {rev=rev+sent.charAt(i-1)+" ";p=i+1;}
            }
        }
    }
    void display()
    {
        System.out.println("Exchanging the first and last letters:"); 
        System.out.println(rev);
    }
    public static void main()
    {
        Exchange ex=new Exchange();
        ex.readsentence();
        ex.exfirstlast();
        ex.display();
    }
}