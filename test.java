import clg_programs.rect_area;

public class test {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
