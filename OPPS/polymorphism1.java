package OPPS;

class calculate {
    
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}
public class polymorphism1 {
    public static void main(String[] args) {
        
        System.out.println(calculate.Multiply(2,3));
        System.out.println(calculate.Multiply(2.5, 3.5));
    }
}
