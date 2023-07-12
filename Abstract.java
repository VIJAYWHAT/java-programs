abstract class Animal{
    public String name;

    public Animal(String name){
        this.name = name; 
    }

    public void LineSpacing(){
        System.out.println("=====================");
    }

    public abstract void MakeSound();
    public void Protect(){
        System.out.println(name + " is Protecting.");
    }

    public void Eat(){
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void MakeSound(){
        System.out.print("Dog Sounds:");
        System.out.println("Wow Woww...!!!");
    } 
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void MakeSound(){
        System.out.print("Cat Sounds:");
        System.out.println("Meow...");
    }
}

public class Abstract
{

    public static void main(String... args){

        Dog animal = new Dog("Rocky");
        animal.MakeSound();
        animal.Eat();
        animal.Protect();

        animal.LineSpacing();

        Cat cat = new Cat("Whity");
        cat.MakeSound();
        cat.Eat();

    }

}