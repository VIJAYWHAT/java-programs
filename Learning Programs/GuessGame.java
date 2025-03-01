import java.util.Random;
import java.util.Scanner;
class GuessGame
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        System.out.println("==================================================");
        System.out.println("\tRandomNumber Guess Game");
        System.out.println("==================================================");
        Random random = new Random();
        int max_value = 20;
        int random_number = random.nextInt(1,max_value);
       // System.out.println("Random Value:"+random_number);
        
        System.out.print("please Guess the number between 1 to " + max_value + " :");
        Scanner sc = new Scanner(System.in);
        int guess_number = sc.nextInt();
        while(true)
        {
            if(guess_number > random_number)
            {
                System.out.println("Number is high....");
                System.out.print("Guess the number less than ( < ) " + guess_number + " :");
            }
            else if(guess_number < random_number)
            {
                System.out.println("Number is low....");
                System.out.print("Guess the number greater than ( > ) " + guess_number + " :");
            }
            else
            {
                System.out.println("You won the Game....");
                System.out.println("==================================================");
                break;
            }
            guess_number=sc.nextInt();
            System.out.println("==================================================");

        }
    }
}