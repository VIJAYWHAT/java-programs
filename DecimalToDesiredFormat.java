import java.util.Scanner;
class DecimalToDesiredFormat
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("==================================================");
       System.out.println("\tBINARY,OCTAL,HEXADECIMAL Representation");
       System.out.println("==================================================");
       String binary,octal,hexadecimal;
       while(true)
       {
         System.out.print("Enter a Decimal Number:");
         
         int number=sc.nextInt();
         System.out.println("==================================================");
         System.out.println("1.Binary Format");
         System.out.println("2.octal Format");
         System.out.println("3.HexaDecimal Format");
         System.out.println("4.All the Above..");
         System.out.print("Please Select above One Option:");
         int option=sc.nextInt();
         System.out.println("==================================================");
         switch(option)
         {
            case 1 : 
                     binary=convertToBinary(number);
                    System.out.println("Binary Format of "+number+" is :"+binary);
                    System.out.println("==================================================");
                    break;
            case 2:
                     octal=convertToOctal(number);
                    System.out.println("Octal Format of "+number+" is :"+octal);
                    System.out.println("==================================================");
                    break;
            case 3:
                     hexadecimal=convertToHexaDecimal(number);
                    System.out.println("HexaDecimal Format of "+number+" is :"+hexadecimal);
                    System.out.println("==================================================");
                    break;
            case 4:
                    binary=convertToBinary(number);
                    System.out.println("Binary Format of "+number+" is :"+binary);
                     octal=convertToOctal(number);
                    System.out.println("Octal Format of "+number+" is :"+octal);
                    hexadecimal=convertToHexaDecimal(number);
                    System.out.println("HexaDecimal Format of "+number+" is :"+hexadecimal);
                    System.out.println("==================================================");
                    break;
            default :
                    System.out.println("please enter valid Input....");

         }
         System.out.print("Do you want to check once Again(Y/N): ");
         char check=sc.next().charAt(0);
         System.out.println("==================================================");
         if(check=='y' || check=='Y')
         {
            continue;
         }
         else{
            break;
         }
         
       }
       
       

       /* String binary=convertToBinary(number);
        System.out.println("Binary Format of "+number+" is :"+binary);

        String octal=convertToOctal(number);
        System.out.println(" Octal Format of "+number+" is :"+octal);

        String hexadecimal=convertToHexaDecimal(number);
        System.out.println(" HexaDecimal Format of "+number+" is :"+hexadecimal);*/

    }
    public static String convertToBinary(int number)
    {
        StringBuilder binary=new StringBuilder();
        int rem=0;
        while(number > 0)
        {
           rem=number%2;
           binary.insert(0,rem);
           number=number/2;
        }
        return binary.toString();
    }
    public static String convertToOctal(int number)
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

    public static String convertToHexaDecimal(int number)
    {
       StringBuilder hexadecimal=new StringBuilder(); 
       int rem=0;

        char hexachars[]={'0','1','2','3',
                          '4','5','6','7',
                          '8','9','A','B',
                          'C','D','E','F'};

        while(number>0)
        {
            rem=number%16;
            hexadecimal.insert(0,hexachars[rem]);
            number=number/16;
        }
        return hexadecimal.toString();
    }
}