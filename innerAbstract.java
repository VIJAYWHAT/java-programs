abstract class A {
    abstract class B {

        abstract void myMethod();
    }
} 

class C extends A {
    class D extends B {
        
        void myMethod() {
            System.out.println("My method was implemented in the inner Class D...");
        }
    }
}

public class innerAbstract {
    
    public static void main(String... args) {
        
        C outer = new C();
        C.D inner = outer.new D();

        inner.myMethod();

    }
}
