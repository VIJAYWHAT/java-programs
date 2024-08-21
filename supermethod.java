class animal{

    void eat(){ System.out.println("Eating..."); }
} 

class cat extends animal{

    void eat(){ System.out.println("Eating Fish..."); }
    void sleep(){ System.out.println("Sleeping..."); }

    void work(){
        super.eat();
        sleep();
    }
}

public class supermethod {
    public static void main(String... args){

        cat c = new cat();
        c.work();
        
    }
}
