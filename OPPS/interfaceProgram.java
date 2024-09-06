package OPPS;

interface simple {
    final int a = 10;
    void display(); 
}
class simpleTest implements simple {
    public void display() {
        System.out.println("The Value of a: " + simple.a);
    }
}

public class interfaceProgram {
    public static void main(String[] args) {
        simpleTest s = new simpleTest();
        s.display();
        int b = s.a + 10;
        System.out.println("The Value of b: " + b);
    }

}
