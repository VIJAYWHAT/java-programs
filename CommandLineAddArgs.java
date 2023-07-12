public class CommandLineAddArgs {
    

    public static void main(String... args){

        System.out.println("Command Line Args");

        String n1 = args[0];
        String n2 = args[1];

        System.out.println("n1 : " + n1 + ", n2 : " + n2);

        String Con = n1 + n2;//Concatenation of string

        System.out.println("Concatenation: " + Con);

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        int sum = num1 + num2;

        System.out.println( "Sum : " + sum);
    }

}
