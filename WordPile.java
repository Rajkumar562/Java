import java.util.*;
public class WordPile
{
    char ch[];int cap,top;
    Scanner sc=new Scanner(System.in);
    WordPile(int c)
    {
        cap=c;
        top=-1;
        ch=new char[cap];
    }

    void pushchar()
    {
        System.out.println("Insert the character");
        char v=sc.next().charAt(0);
        if(top==cap-1)
            System.out.println("WordPile is Full");
        else
        {
            top++;
            ch[top]=v;
        }
        array();
        choice();
    }

    void popchar()
    {
        if(top==-1)
            System.out.println("WordPile is Empty");
        else
        {
            char f=ch[top];
            top--;
            System.out.println("The Character deleted is:"+f);
        }
        if(top!=-1)
        array();
        choice();
    }
    
    void array()
    {
        System.out.println("The WordPile is:");
        for(int i=top;i>=0;i--)
        System.out.println(ch[i]);
    }
    
    void choice()
    {
        System.out.println("Enter 1 for Inserting");
        System.out.println("Enter 2 for Deleting");
        int x=sc.nextInt();
        if(x==1)
        pushchar();
        else if(x==2)
        popchar();
        else
        System.out.println("--------------------Program Ends-------------------");
    }
    static void main()
    {
        WordPile wp=new WordPile(20);
        wp.choice();
    }
}