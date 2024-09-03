package OPPS;
abstract class base {
    abstract void func(); // Abstract method called

    void hello() {
        System.out.println("Hello...!!!");
    }

}

class derived extends base {
    
    void func() {
        System.out.println("The func method implemented!");
    }

}

public class simpleAbstract {
    public static void main(String... args){
        derived dr = new derived();
        dr.hello();
        dr.func();
    }

}
