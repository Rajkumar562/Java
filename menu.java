import java.util.*;
public class menu
{
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("*****MENU*****");
            System.out.println("%%%1.Enter your name%%%%%%%%%%%");
            System.out.println("%%%2.Enter your address%%%%%%%%");
            System.out.println("%%%3.Enter your phone number%%%");
            System.out.println();
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
        
            switch(ch)
            {
            case 1:System.out.println("Rajkumar");
             break;
            case 2:System.out.println("L-76B,Lajpat Nagar");
             break;
            case 3:System.out.println("8826369503");
             break;
            default:System.out.println("Invalid choice");
            System.out.println("Do you wish to continue?(Y/N)");
            String a = null;
             a =sc.next();
            if(a.equalsIgnoreCase("n")) 
            System.out.println("You quit the loop");
            else if(a.equalsIgnoreCase("y"))
            main();
            }
        }
    }