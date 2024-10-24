package clg_programs;

class except {
@SuppressWarnings("unused")
public static void main(String ab[]) {
    int a=10,b=6,c=6,x,y;
    try {
        x = a/(b-c);
    }
    catch(ArithmeticException e) {
        System.out.println("division by zero" + e);
    }
        y=a/(b+c);
        System.out.println("the value of y = " + y);
    }
}

