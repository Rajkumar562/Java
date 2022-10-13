import java.util.*;
public class PrintJob
{
    int job[],cap,newjob,front,rear;
    Scanner sc=new Scanner(System.in);
    PrintJob()
    {
        cap=2;
        front=-1;
        rear=-1;
        createjob();
    }

    void createjob()
    {
        job=new int[cap];
    }

    void addjob()
    {
        System.out.println("Enter the job id");
        newjob=sc.nextInt();
        if(front==-1)
            front++;
        if(rear==cap-1)
            System.out.println("PrintJob is Full");
        else
            {job[++rear]=newjob;
            System.out.println("Job added successfully");}
    }

    void removejob()
    {
        if(front==-1)
            System.out.println("PrintJob is Empty");
        else if(front>rear)
            System.out.println("All jobs removed");
        else
        {
            System.out.println("The job id removed is:"+job[front]);
            front++;
        }
    }
}