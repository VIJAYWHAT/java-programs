package generics;

public class GenericMethod {

    public static <T> void print(T elements) {
        System.out.println(elements + " is " + elements.getClass().getName());

    }

    public static void main(String[] args) {
        print(1);
        print("Hello world");
        print(10.5);
    }
}
