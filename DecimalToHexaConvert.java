import java.util.*;

public class DecimalToHexaConvert {

    public static void main(String args[]) {

        DecimalConversionMain Convert = new DecimalConversionMain();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = s.nextInt();

        String hexadecimal = Convert.ToHexa(number);
        System.out.println("Hexadecimal of " + number + " is " + hexadecimal);
    }
}