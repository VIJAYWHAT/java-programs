class animal{
    animal(){
        System.out.println("Animal is created");
    }
}

class dog extends animal{
    dog(){
        super();
        System.out.println("Dog is created");
    }
}
public class superclass {
    public static void main(String[] args) {
        dog d = new dog();
    }
}
