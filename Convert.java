import java.util.*;
public class Convert
{
    String a="",s="";
    int ch1=0;char ch,ch2=0;
    public static void main()
    {
        Convert co=new Convert();
        co.read();
        co.check();
        co.disp();
    }

    void read()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Sentence");
        s=sc.nextLine();
    }

    void check()
    {
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                Upper();
            else if(Character.isLowerCase(ch))
                Lower();
            else if(ch==' ')
                a=a+ch;
        }
    }

    void Upper()
    {
        ch=Character.toLowerCase(ch);
        if(ch=='z')
            ch2='a';
        else
        {   ch1=(int)ch+1;
            ch2=(char)ch1;}
        a=a+ch2;
    }

    void Lower()
    {
        ch=Character.toUpperCase(ch);
        if(ch=='Z')
            ch2='A';
        else
        {   ch1=(int)ch+1;
            ch2=(char)ch1;}
        a=a+ch2;
    }

    void disp()
    {
        System.out.println("Conversion the Sentence is:");
        System.out.println(a);}
}