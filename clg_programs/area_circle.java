package clg_programs;
import java.util.*;

public class area_circle {

    public static void main(String... args){
        try (Scanner scan = new Scanner(System.in)) {
            circle c = new circle();

            System.out.print("Enter the Radius of the Circle: ");
            double radius = scan.nextDouble();
            c.getdata(radius);
            System.out.println("The area of the Circle: " + c.area());
        }
        
    }
    
}
