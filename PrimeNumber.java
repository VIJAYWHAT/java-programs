import java.util.*;
public class PrimeNumber{

public static void main(String... args)
{

    
    boolean isPrime = true;
    try (Scanner s = new Scanner(System.in)) {
        System.out.print("Enter a Number: ");

        int n = s.nextInt();

            for(int i = 2; i < n/2; i++)
            {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) 
                System.out.println("Input number " + n + " is a Prime Number");
            else 
                System.out.println("Input number " + n + " is a Not Prime Number");
    }
        
    }
}

