import java.util.*;

public class StudentDetailsUsingObj{

public static void main(String... args){

        Scanner s = new Scanner(System.in);

        Students s1 = new Students();

        System.out.print("Enter Name: ");

        s1.Name = s.nextLine();

        System.out.print("Enter Age: ");
        s1.Age = s.nextInt();

        System.out.println("Name: " + s1.Name);
        System.out.println("Age: " + s1.Age);
}

}
