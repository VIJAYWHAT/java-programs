package oops;

public class Vehicle {
    String color;
    int speed;

    public Vehicle(String color) {
        this.color = color;
    }

    public void start() {
        System.out.println("Started...");
    }
    
    public void stop() {
        System.out.println("Stopped...");
        this.speed = 0;
    }
}
