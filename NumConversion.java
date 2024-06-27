import java.util.Scanner;
class NumConversion
{
    public void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       try {
        System.out.println("Decimal to Binary,Octal And HexaDecimal Conversion\n");
           String binary,octal,hexadecimal;
           
            System.out.print("Enter a Decimal Number:");
             
            int number = s.nextInt();

            DecimalConversionMain Convert = new DecimalConversionMain();

                binary = Convert.ToBinary(number);
                System.out.println("Binary of " + number + " is : " + binary);
 
                octal = Convert.ToOctal(number);
                System.out.println("Octal of " + number + " is : " + octal);
            
                hexadecimal = DecimalConversionMain.ToHexa(number);
                System.out.println("HexaDecimal of " + number + " is : " + hexadecimal);
       } finally {
        s.close();
    }
    }
}























       
       


























       /* String binary=convertToBinary(number);
        System.out.println("Binary Format of "+number+" is :"+binary);

        String octal=convertToOctal(number);
        System.out.println(" Octal Format of "+number+" is :"+octal);

        String hexadecimal=convertToHexaDecimal(number);
        System.out.println(" HexaDecimal Format of "+number+" is :"+hexadecimal);*/