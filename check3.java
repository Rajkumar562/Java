import java.util.*;
public class check3
{
       public static void main()
       {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter String");
           String s = sc.nextLine ();
           String y =" ";
           for (int i = 0;i<s.length();i++)
           {
               char ch = s.charAt(i);
               if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch=='u')
               {    ch+=1;}
                y =y +ch;
            }
        }
    }
    