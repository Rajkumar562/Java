import java.util.*;
public class RAIL_RESERVATION
{
   public static void main()
   {
   System.out.println("*****WELCOME TO THE INDIAN RAILWAYS*****");
   System.out.println();
   System.out.println("###Enter your choice###");
   System.out.println();
   System.out.println("1.===About Indian Railways===");
   System.out.println("2.===Book a ticket===");
   System.out.println("3.===Cancel a ticket===");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
     switch(a)
     {
      case 1:
      System.out.println("/***********************************************************/");
      System.out.println("/ Indian Railways is an Indian state-owned enterprise,owned /");
      System.out.println("/ and operated by the Government of India through the       /");
      System.out.println("/ Ministry of Railways.It is one of the world's largest     /");
      System.out.println("/ railway networks comprising 115,000km of track over a     /");
      System.out.println("/ route of 67,312 km and 7,112 stations.In 2015-2016,Indian /");
      System.out.println("/ Railways carried 8.101 billion passengers annually or     /");
      System.out.println("/ more than 22 million passengers a day and 1.107 billion   /");
      System.out.println("/ tons of freight in the year.In 2014-2015 Indian Railways  /");
      System.out.println("/ had revenues of 1.709 trillion which consists of 1.118    /");
      System.out.println("/ trillion from freight and 451.26 billion from passengers  /");
      System.out.println("/ tickets.                                                  /");
      System.out.println("/                                                           /");
      System.out.println("/ Indian Railways is the world's seventh largest commercial /");
      System.out.println("/ or utility employer,by number of employees,with over      /");
      System.out.println("/ 1.376 million employees as of last published figures in   /");
      System.out.println("/ 2013.Indian Railways's rolling stock comprises over       /");
      System.out.println("/ 245,267 Freight Wagons, 66,392 Passenger Coaches and      /");
      System.out.println("/ 10,499 Locomotives.The trains have a 5 digit numbering    /");
      System.out.println("/ system and runs 12,617 passenger trains and 7,421 freight /");
      System.out.println("/ trains daily.                                             /");
      System.out.println("/***********************************************************/");
      break;
      case 2:
      String train = " ";
      String berth = " ";
      double fare;
      System.out.println("**************************************************************");
      System.out.println("***To book a ticket,follow the given instructions***");
      System.out.println();
      System.out.println("===Enter your Name===");
      String name = sc.next();
      System.out.println("===Enter your Age===");
      int age = sc.nextInt();
      System.out.println("===Enter your Gender===");
      String gen=sc.next();
      System.out.println("===Enter your Date of Birth===");
      String dob=sc.next();
      System.out.println("===Enter your Phone number===");
      long no=sc.nextLong();
      System.out.println("===Enter your City===");
      String city = sc.next();
      System.out.println("===Enter the distance in kilometres===");
      int km = sc.nextInt();
      System.out.println("===Select one of the following categories of train===");
      System.out.println();
      System.out.println("===1.Superfast trains===");
      System.out.println("===2.Express trains===");
      int b = sc.nextInt();
      System.out.println("**************************************************************");
      switch(b)
      {
          case 1:
          System.out.println("**************************************************************");
          System.out.println("###Select one of the following Superfast trains###");
          System.out.println();
          System.out.println("===1.Rajdhani Express===");
          System.out.println("===2.Shatabdi Express===");
          System.out.println("===3.Vikramsila Express===");
          System.out.println("===4.Purushottam Express===");
          System.out.println("===5.Golden Temple Mail===");
          int c = sc.nextInt();
          System.out.println("**************************************************************");
          switch(c)
          {
        case 1:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Rajdhani Express###");
        System.out.println();
        System.out.println("===1.First Class A/C===");
        System.out.println("===2.A/C 2 tier===");
        System.out.println("===3.A/C 3 tier===");
        int d = sc.nextInt();
        System.out.println("**************************************************************");
        switch(d)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Rajdhani Express";
            berth = "First Class A/C";
            fare = km * 4.5;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Rajdhani Express";
            berth = "A/C 2 tier";
            fare = km * 3;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Rajdhani Express";
            berth = "A/C 3 tier";
            fare = km * 2;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("*************************************************************");
        }
        break;
        case 2:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Shatabdi Express###");
        System.out.println();
        System.out.println("===1.Executive Class===");
        System.out.println("===2.A/C Chair Car===");
        int e=sc.nextInt();
        System.out.println("**************************************************************");
        switch(e)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Shatabdi Express";
            berth = "Executive Class";
            fare = km * 3.5;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train ="Shatabdi Express";
            berth ="A/C Chair Car";
            fare = km * 2.25;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 3:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Vikramsila Express###");
        System.out.println();
        System.out.println("===1.A/C 2 tier===");
        System.out.println("===2.A/C 3 tier===");
        System.out.println("===3.Sleeper Class===");
        int f = sc.nextInt();
        System.out.println("**************************************************************");
        switch(f)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Vikramsila Express";
            berth = "A/C 2 tier";
            fare = km * 1.5;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Vikramsila Express";
            berth = "A/C 3 tier";
            fare = km * 1;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Vikramsila Express";
            berth = "Sleeper Class";
            fare = km * 0.75;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 4:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Purushottam Express###");
        System.out.println();
        System.out.println("===1.A/C 2 tier===");
        System.out.println("===2.A/C 3 tier===");
        System.out.println("===3.Sleeper Class===");
        int g = sc.nextInt();
        System.out.println("**************************************************************");
        switch(g)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Purushottam Express";
            berth = "A/C 2 tier";
            fare = km * 1.5;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Purushottam Express";
            berth = "A/C 3 tier";
            fare = km * 1;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Purushottam Express";
            berth = "Sleeper Class";
            fare = km * 0.75;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 5:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Golden Temple Mail###");
        System.out.println();
        System.out.println("===1.A/C 2 tier===");
        System.out.println("===2.A/C 3 tier===");
        System.out.println("===3.Sleeper Class===");
        int h = sc.nextInt();
        System.out.println("**************************************************************");
        switch(h)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Golden Temple Mail";
            berth = "A/C 2 tier";
            fare = km * 1.5;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Golden Temple Mail";
            berth = "A/C 3 tier";
            fare = km * 1;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Golden Temple Mail";
            berth = "Sleeper Class";
            fare = km * 0.75;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        default:System.out.println("Sorry!!!Wrong Choice");
        System.out.println("**************************************************************");
    }
    break;
    case 2:
    System.out.println("**************************************************************");
    System.out.println("###Select one of the following Express trains###");
    System.out.println();
    System.out.println("===1.Neelanchal Express===");
    System.out.println("===2.Hirakud Express===");
    System.out.println("===3.Doon Express===");
    System.out.println("===4.Maurya Express===");
    System.out.println("===5.Gokul Express===");
    int i = sc.nextInt();
    System.out.println("**************************************************************");
    switch(i)
    {
        case 1:
        System.out.println("**************************************************************");
        System.out.println("###Select the type of berth you want in Neelanchal Express###");
        System.out.println();
        System.out.println("===1.A/C 2 tier===");
        System.out.println("===2.A/C 3 tier===");
        System.out.println("===3.Sleeper Class===");
        int j = sc.nextInt();
        System.out.println("**************************************************************");
        switch(j)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Neelanchal Express";
            berth = "A/C 2 tier";
            fare = km * 1.25;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Neelanchal Express";
            berth = "A/C 3 tier";
            fare = km * 0.9;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Neelanchal Express";
            berth = "Sleeper Class";
            fare = km * 0.7;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 2:
        System.out.println("**************************************************************");
        System.out.println("Select the type of berth you want in Hirakud Express");
        System.out.println();
        System.out.println("1.A/C 2 tier");
        System.out.println("2.A/C 3 tier");
        System.out.println("3.Sleeper Class");
        int k = sc.nextInt();
        System.out.println("**************************************************************");
        switch(k)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Hirakud Express";
            berth = "A/C 2 tier";
            fare = km * 1.25;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Hirakud Express";
            berth = "A/C 3 tier";
            fare = km * 0.9;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Hirakud Express";
            berth = "Sleeper Class";
            fare = km * 0.7;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 3:
        System.out.println("**************************************************************");
        System.out.println("Select the type of berth you want in Doon Express");
        System.out.println();
        System.out.println("1.A/C 2 tier");
        System.out.println("2.A/C 3 tier");
        System.out.println("3.Sleeper Class");
        int l = sc.nextInt();
        System.out.println("**************************************************************");
        switch(l)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Doon Express";
            berth = "A/C 2 tier";
            fare = km * 1.2;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Doon Express";
            berth = "A/C 3 tier";
            fare = km * 0.85;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Doon Express";
            berth = "Sleeper Class";
            fare = km * 0.65;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 4:
        System.out.println("**************************************************************");
        System.out.println("Select the type of berth you want in Maurya Express");
        System.out.println();
        System.out.println("1.A/C 2 tier");
        System.out.println("2.A/C 3 tier");
        System.out.println("3.Sleeper Class");
        int m = sc.nextInt();
        System.out.println("**************************************************************");
        switch(m)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Maurya Express";
            berth = "A/C 2 tier";
            fare = km * 1.25;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Maurya Express";
            berth = "A/C 3 tier";
            fare = km * 0.9;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Maurya Express";
            berth = "Sleeper Class";
            fare = km * 0.7;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;

            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        case 5:
        System.out.println("**************************************************************");
        System.out.println("Select the type of berth you want in Gokul Express");
        System.out.println();
        System.out.println("1.A/C 2 tier");
        System.out.println("2.A/C 3 tier");
        System.out.println("3.Sleeper Class");
        int n = sc.nextInt();
        System.out.println("**************************************************************");
        switch(n)
        {
            case 1:
            System.out.println("**************************************************************");
            train = "Gokul Express";
            berth = "A/C 2 tier";
            fare = km * 1.25;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 2:
            System.out.println("**************************************************************");
            train = "Gokul Express";
            berth = "A/C 3 tier";
            fare = km * 0.9;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            case 3:
            System.out.println("**************************************************************");
            train = "Gokul Express";
            berth = "Sleeper Class";
            fare = km * 0.7;
            System.out.println("Your fare is "+fare);
            System.out.println();
            System.out.println("Your ticket has been booked Successfully");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Gender:"+gen);
            System.out.println("Date of Birth:"+dob);
            System.out.println("Phone number:"+no);
            System.out.println("City:"+city);
            System.out.println("Train:"+train);
            System.out.println("Berth:"+berth);
            System.out.println("**************************************************************");
            break;
            default:System.out.println("Sorry!!!Wrong Choice");
            System.out.println("**************************************************************");
        }
        break;
        default:System.out.println("Sorry!!!Wrong Choice");
        System.out.println("**************************************************************");
    }
    break;
    default:System.out.println("Sorry!!!Wrong Choice");
    System.out.println("**************************************************************");
}
break;
   case 3:
   System.out.println("**************************************************************");
   System.out.println("To cancel a ticket,follow the given instructions");
   System.out.println();
   System.out.println("Enter your PNR number(9 digits)");
   long pno = sc.nextLong();
   System.out.println("Please wait a second");
   if(pno<=99999999 || pno >=1000000000)
   {
    System.out.println("No such ticket has been booked");
   }
   else
   { long t;
    for(t=10000000;t<=1000000000;t++)
    {
     if(t!=pno)
     continue;
     if(t==pno)
     {
      System.out.println("Your ticket has been cancelled");
      break;
     }
    }
    }
    System.out.println("**************************************************************");
    break;
    default:System.out.println("Sorry!!!Wrong Choice");
    System.out.println("**************************************************************");
    }
System.out.println("Do you wish to continue? (Y/N)");
String dc =sc.next();
dc.trim();
if (dc.equalsIgnoreCase("Y"))
main();
if (dc.equalsIgnoreCase("N"))
System.out.println("Thank You for Visiting");
   }
}