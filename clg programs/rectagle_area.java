import java.util.*;

public class rectagle_area {

    public static void main(String[] args) {
        
        rect Calcrect = new rect();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        Calcrect.length = s.nextInt();

        System.out.print("Enter the Width of the Rectangle: ");
        Calcrect.width = s.nextInt();

        Calcrect.getdata(Calcrect.length, Calcrect.width);
        int area = Calcrect.area();

        System.out.println("The area of the rectangle is: " + area);
    
    }
    
}
