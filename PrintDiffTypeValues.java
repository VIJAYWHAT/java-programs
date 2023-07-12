import java.util.Scanner;

public class PrintDiffTypeValues {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Details");

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter initial: ");
        char ch = s.next().charAt(0);

        System.out.print("Enter Mark: ");
        int num1 = s.nextInt();

        System.out.print("Enter Pracentage %: ");
        float num2 = s.nextFloat();

        System.out.print("Enter Result(True/False): ");
        boolean bool = s.nextBoolean();

        String Results;
        if(bool){
        Results = "Pass";
        }
        else{
        Results = "Fail";
        }

        System.out.println("======================================");

        System.out.println("Student Name: " + name + "." + ch);
        System.out.println("Mark: " + num1);
        System.out.println("Pracentage: " + num2);
        System.out.println("Results: " + Results);


    }
}
