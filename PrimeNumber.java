public class PrimeNumber{

public static void main(String... args)
{

    int n = 17;
    boolean isPrime = true;

        for(int i=2; i<n/2; i++)
        {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Input number " + n + " is a Prime Number");
        } else {
            System.out.println("Input number " + n + " is a NOT Prime Number");
        }
    }
}

