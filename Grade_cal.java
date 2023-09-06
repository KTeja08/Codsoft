import java.util.Scanner;

public class Grade_cal {
    public static void main(String []args)
    {
        int mrks[]=new int[6];
        float total=0,avg;
        
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<6;i++)
        {
            System.out.println("Enter marks of subject="+(i+1)+":");
            mrks[i]=sc.nextInt();total=total+mrks[i];
        }
       // Scanner.close();
        //calculating average here...
        avg=total/6;
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks:"+avg);
        System.out.println("student grade is...");

        if(avg>=90)
        {
           System.out.println("Distinction");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.println("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.println("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
}

