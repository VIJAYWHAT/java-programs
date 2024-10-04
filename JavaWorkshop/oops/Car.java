package oops;

public class Car extends Vehicle { // created Car class 
    
    String brand;
    
    public Car(String aColor, String aBrand) { // create constructor for Car
        super(aColor); // give the value to parent class constructor
        this.brand = aBrand; // set the brand (this - reference variable that refers to the current object)  
        this.speed = 0; // set the initial speed as 0
    }

    public void applyAcc(int speed) {
        this.speed += speed; // increase the value for speed
        System.out.println("Speed: " + this.speed); // display the current speed
    }

}
