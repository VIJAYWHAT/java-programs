
class animal{
    animal(){
        System.out.println("This is a animal!");
    }
    void eat(){
        System.out.println("Eating...");
    }
}

class dog extends animal{
    public void name() {
        System.out.println("His name is Rocky!");
    }

    @Override void eat() {
        System.out.println("Eating dog food");
    }
}
public class overriding1 {
    public static void main(String... args){
        
        animal ani = new animal();
        ani.eat();
        
        dog rocky = new dog();
        rocky.name();
        rocky.eat();
    }
}
