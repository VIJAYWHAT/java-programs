public class DecimalConversionMain
{
    
    public static String ToBinary(int number)
    {
        StringBuilder binary = new StringBuilder();
        int rem=0;
        while(number > 0)
        {
            rem=number%2;
            binary.insert(0,rem);
            number=number/2;
        }
        return binary.toString();
    }

    public static String ToOctal(int number)
    {

    StringBuilder octal=new StringBuilder();
        int rem=0;
        while(number > 0)
        {
            rem=number % 8;
            octal.insert(0,rem);
            number=number/8;
        }
        return octal.toString();
    }

    public static String ToHexa(int number) {
        int rem;
        int temp = number;
        StringBuilder hexaDec = new StringBuilder();

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (temp > 0) {
            rem = temp % 16;
            hexaDec.insert(0, hex[rem]);
            temp = temp / 16;
        }
        return hexaDec.toString();
    }
}
