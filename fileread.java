import java.io.*;
import java.util.*;
public class fileread
{
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileReader fin=new FileReader("Names.txt");
        BufferedReader bin=new BufferedReader(fin);
        System.out.println("The Names Entered Are:");
        for(int i=0;i<5;i++)
        {
            String name=bin.readLine();
            System.out.println(name);
        }
        bin.close();
        fin.close();
    }
}