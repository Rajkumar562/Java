import java.io.*;
public class RAIL_RESERVATION1
{
    public static void main()throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n =0;
        String s = b.readLine();
        n = Integer.parseInt(s);
        System.out.println("**********WELCOME TO THE INDIAN RAILWAYS**********");
        System.out.println();
        System.out.println("*****MENU*****");
        System.out.println("Enter your choice");
        System.out.println();
        System.out.println("1.History of Indian Railways");
        System.out.println("2.Book a ticket");
        System.out.println("3.Exit");
        switch(n)
        {
            case 1: history();
            break;
            case 2: booking();
            break;
            case 3: exit();
            break;
            default:System.out.println("Invalid Choice");
            main();
        }
    }

    public static void history()throws IOException
    {

    }

    public static void booking()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("To book a ticket,follow the given instructions");
        System.out.println("TRAINS");
        System.out.println();
        System.out.println("     TRAIN NAME                 TRAIN NO.            FROM                   TO                 DISTANCE        PRICE");
        System.out.println("1.AMRITSAR EXPRESS               12459               NEW DELHI             AMRITSAR              514            335 ");
        System.out.println("2.BANDRA EXPRESS                 19019A              DELHI                 NIMACH                684            345 ");
        System.out.println("3.BAREILLY EXPRESS               14556               DELHI                 BAREILLY              256            210 ");
        System.out.println("4.BHATINDA EXPRESS               14731               DELHI                 BHATINDA              336            200 ");
        System.out.println("5.CHETAK EXPRESS                 12981               DELHI SARAI ROHILLA   UDAIPUR CITY          674            390 ");
        System.out.println("6.DHAULADHAR EXPRESS             14035               DELHI                 PATHANKOT             496            285 ");
        System.out.println("7.HIMACHAL EXPRESS               14553               DELHI                 UNA                   372            235 ");
        System.out.println("8.HOWRAH EXPRESS                 12323               NEW DELHI             HOWRAH                1531           630 ");
        System.out.println("9.JABALPUR EXPRESS               12191               NEW DELHI             JABALPUR              1039           505 ");
        System.out.println("10.JAISALMER EXPRESS             14059               DELHI                 JAISALMER             779            425 ");
        System.out.println("11.JALANDHAR EXPRESS             14681               NEW DELHI             JALANDHAR             381            235 ");
        System.out.println("12.JAN SHATABDI EXPRESS          12057               NEW DELHI             NANGAL DAM            356            225 ");
        System.out.println("13.MANDORE EXPRESS               12461               DELHI                 JODHPUR               618            370 ");
        System.out.println("14.MUSSOORIE LINK EXPRESS        14041A              DELHI SARAI ROHILLA   KOTDWARA              214            160 ");
        System.out.println("15.PORBANDAR EXPRESS             19264               DELHI SARAI ROHILLA   PORBANDAR             1393           565 ");
        System.out.println("16.PURI EPRESS                   12816               NEW DELHI             PURI                  1864           715 ");
        System.out.println("17.PURUSHOTTAM EXPRESS           12802               NEW DELHI             BHUBANESHWAR          1802           695 ");
        System.out.println("18.RAI BARELI EXPRESS            14208               DELHI                 RAI BARELI            590            360 ");
        System.out.println("19.RAJDHANI EXPRESS              12425               NEW DELHI             JAMMU TAWI            577            425 ");
        System.out.println("20.RANIKHET EXPRESS              15014               DELHI                 JAIPUR                308            205 ");
        System.out.println("21.REWA EXPRESS                  12428               NEW DELHI             REWA                  849            445 ");
        System.out.println("22.SHATABDI EXPRESS              12005               NEW DELHI             KALKA                 269            141 ");
        System.out.println("23.SRIGANGA NAGAR EXPRESS        12481               DELHI                 SRIGANGA NAGAR        425            255 ");                                           
        System.out.println("24.THIRUVANANTHAPURAM EXPRESS    12644               NIZAMUDDIN            THIRUVANANTHAPURAM    3011           915 ");
        System.out.println("25.VIKRAMSILA EXPRESS            12368               ANAND VIHAR           BHAGALPUR             1208           550 ");
        System.out.println("Enter the serial no of the train you want");
        int sno=0 ;
        String s1=br.readLine();
        sno = Integer.parseInt(s1);
        System.out.println();
        System.out.println("Enter the name of the person");
        String name =null;
        name = br.readLine();
        System.out.println();
        System.out.println("Enter the age of the person");
        int age = 0;
        String s2 = br.readLine();
        age =Integer.parseInt(s2);
        System.out.println();
        System.out.println("Enter the gender of the person.M or F");
        String gen =null;
        gen = br.readLine();
        System.out.println();
        System.out.println("Enter the date of birth of the person.For eg-13/06/2001");
        int dob =0;
        dob = System.in.read();
        System.out.println();
        System.out.println("Customer details");
        System.out.println("Train:"+sno);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gen);
        System.out.println("Date of birth"+dob);
    }

    public static void exit()
    {
    }
}