import java.util.*;

class NumberGame
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Guess Number Game...");
        System.out.println("You will be asked to guess a Number to win the game..." );
        System.out.println("You have maximum 5 attempt limit...");

        Random rno=new Random();
        int k=rno.nextInt(100);
        int cnt=0;

        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter a guess number between 1 to 100=");

            int num=sc.nextInt();
            if(num==k)
            {
                System.out.println("Oohhoo!,Your number is correct you win the game in "+i+"th attempt...");
                cnt=1;
                break;
            } 
            else if(num<k)
            {
                System.out.println("your guess number is Smaller...");
            }
            else
            {
                System.out.println("your guess number is Greater...");
            }
        }
        if(cnt!=1)
        {
            System.out.println("sorry...! you loss the game");
        }
    }
}