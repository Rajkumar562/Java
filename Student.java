public class Student
{
int Rollno,marks1,marks2,marks3;String name;
   public void Readinfo(int r,int m1,int m2,int m3,String n)
   {
       Rollno =r;
       marks1=m1;
       marks2=m2;
       marks3=m3;
       name  =n;
    }
    public double Average ()
    {return((marks1+marks2+marks3)/3);
    } 
    public void display()
    {
        System.out.println(Rollno);
        System.out.println(marks1);
        System.out.println(marks2);
        System.out.println(marks3);
        System.out.println(name);
    }
    public static void main() 
    {
        Student S1=new Student();
        
        S1.Readinfo(29,96,98,100,"Rajkumar");
        S1.display();
        double x =S1.Average();
        System.out.println(x);
    }
}