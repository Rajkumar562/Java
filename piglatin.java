import java.util.*;
public class piglatin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String s =sc.nextLine();
        String s1=s.toUpperCase();
        String y="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if( ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                y=s1.substring(i)+s1.substring(0,i)+"AY";
                System.out.println(y);
                break;
            }
        }
    }
}
        