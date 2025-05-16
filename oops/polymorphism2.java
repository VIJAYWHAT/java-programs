package OPPS;
class Parent {
    void print() {
        System.out.println("Parent Class");
    }
}
class child1 extends Parent {
    void print() {
        System.out.println("Child Class1");
    }
}

class child2 extends Parent {
    void print() {
        System.out.println("Child class2");
    }
}
public class polymorphism2 {

    public static void main(String[] args) {
        Parent p;

        p = new child1();
        p.print();

        p = new child2();
        p.print();
    }
    
}
