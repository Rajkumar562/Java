import java.util.*;
public class Vowel
{
    String Txt,Cxt;int len;int a=0;
    Vowel()
    {
        Txt="";
        Cxt="";
        len=0;
    }
    void readword()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word");
        Txt=sc.nextLine();
        Txt=Txt.toUpperCase();
        len=Txt.length();
    }
    void convert()
    {
        for(int i=0;i<len;i++)
        {
            char ch=Txt.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                if(i==0)
                {Cxt=Txt+"Y";break;}
                else
                {Cxt=Txt.substring(i)+Txt.substring(0,i)+"C";}
                break;
            }
            else
            {a++;}
        }
        if(a==len)
        {Cxt=Txt+"N";}
    }
    void display()
    {
        System.out.println("The Original Word is: "+Txt);
        System.out.println("The New Word is: "+Cxt);
    }
    static void main()
    {
        Vowel v=new Vowel();
        v.readword();
        v.convert();
        v.display();
    }
}