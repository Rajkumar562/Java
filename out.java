import java.io.*;
import java.util.*;
public class out
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileWriter fout=new FileWriter("Names.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        System.out.println("Enter the Names");
        for(int i=0;i<5;i++)
        {
            String name=sc.nextLine();
            pout.println(name);
        }
        pout.close();
        bout.close();
        fout.close();
    }
}