import java.util.*;

public class fizzbuzz{
	public static void main(String... args){

	int n[] = new int[50];
	
	Scanner s = new Scanner(System.in);

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
