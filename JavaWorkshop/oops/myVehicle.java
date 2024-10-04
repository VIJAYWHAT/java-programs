package oops;

public class myVehicle {
    public static void main(String[] args) {
        Car bmw = new Car("White", "BMW");
        Car maruthi = new Car("Black", "Maruthi");

        bmw.start();
        bmw.applyAcc(100);
        bmw.stop();

        maruthi.start();
        maruthi.stop();
    }
}
