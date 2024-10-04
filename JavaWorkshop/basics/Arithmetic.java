package basics;

public class Arithmetic {
    public static int add(int a, int b) { //create a method named add with argument a and b
        return a + b; // return the value of a + b
    }
    public static int findSum(int n) {
        return n*(n+1)/2; // sum of the first n formula
    }
    public static int getSum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }
    public static boolean isEven(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {

//        System.out.println(findSum(5));
        int sum = add(2,4); // call the method and store that return value in sum variable
        System.out.println(sum); // call the sum variable
        System.out.println(isEven(6)); // directly call the method in print statement
    }

}
