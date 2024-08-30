// Base or Parent Class
class Bicycle {

    public int gear;
    public int speed;

    // Bicycle constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public String toString(){
        return " No of Gears = " + gear + "\n Speed of the bicycle = " + speed;
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newValue){ seatHeight = newValue; }

    @Override public String toString(){
        return super.toString() + "\n Seat Height = " + seatHeight;
    }
} 
public class singleinherit {
    public static void main(String... args){
        MountainBike mb = new MountainBike(4, 100, 25);
        System.out.println(mb.toString());
    }
}
