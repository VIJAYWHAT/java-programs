import java.util.Scanner;

public class OddOrEven{

    public static void main(String... agrs){

    Scanner s = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num = s.nextInt();

	if(num % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
}
