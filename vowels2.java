import java.util.*;
public class vowels2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        
        for (int i =0; i<s.length();i++)
        {
            char ch =s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {}
            else
            System.out.println("The constants are:"+ ch);
        System.out.println();
        }
    }
}
           