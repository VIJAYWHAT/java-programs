import java.util.*;

class SumOfTwoNumbers{

	public static void main(String... args){
	
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		int a = s.nextInt();

		System.out.print("Enter Number 2: ");
		int b = s.nextInt();

		int sum = a + b;

		System.out.println("SumofTwoNumbers : " +  sum );
	}
}
