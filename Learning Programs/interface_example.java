import java.util.ArrayList;

public class interface_example {
    public static void main(String args[]) {

        Animal dog = new Dog();
        Animal cat = new cat();

        cat.MakeSound();
        dog.MakeSound();
    }
}

interface Animal {
    void MakeSound();

}

interface Logger {
    default void calculate(int a, int b) {

        int c = a + b;
    }
}

class Dog implements Animal {
    public void MakeSound() {
        System.out.println("Woof");
    }
}

class cat implements Animal {
    public void MakeSound() {
        System.out.println("Meow");
    }
}