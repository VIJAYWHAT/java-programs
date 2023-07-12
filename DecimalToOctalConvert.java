import java.util.*;

public class DecimalToOctalConvert {

    public static void main(String... args)
    {
    
    DecimalConversionMain Convert = new DecimalConversionMain();
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Number: ");
    int number = s.nextInt();

    String OctalNum = Convert.ToOctal(number);

    System.out.println("Binary of " + number + " is "  + OctalNum);
    }

    
}
