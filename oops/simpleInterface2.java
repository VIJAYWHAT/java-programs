package OPPS;

interface API {
    default void show() {
        System.out.println("Default API");
    }
    
}

interface interface1 extends API {
    void display();
}

interface interface2 extends API {
    void print();
}

public class simpleInterface2 implements interface1,interface2 {
    
    public void display() {
        System.out.println("Display from interface1");
    }
    public void print() {
        System.out.println("Print from interface2");
    }

    public static void main(String[] args) {
        simpleInterface2 obj = new simpleInterface2();
        obj.display();
        obj.print();
        obj.show();
    }
    
}