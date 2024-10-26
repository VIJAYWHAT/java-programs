import java.util.Scanner;

public class FizzBuzz{
	public static void main(String... args){
	
	try (Scanner s = new Scanner(System.in)) {
		System.out.print("Enter The Length: ");
		int Length = s.nextInt();
		
		for(int i = 1; i <= Length; i++){

		if(i%3 == 0 && i%5 == 0){
			System.out.println("FizzBuzz");
		}
		else if(i%3 == 0){
			System.out.println("Fizz");
		}
		else if(i%5 == 0){
			System.out.println("Buzz");
		}
		else{
			System.out.println(i);
		}
		
			}
	}
	
	}
}
