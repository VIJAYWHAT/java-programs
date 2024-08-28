
class animal{
    private void name(){
        System.out.println("This is a animal!");
    }
    protected void eat(){
        System.out.println("Eating...");
    }
}

class dog extends animal{
    void name() {
        System.out.println("His name is Rocky!");
    }

    @Override public void eat() {
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
