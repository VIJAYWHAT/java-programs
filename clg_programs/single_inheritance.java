package clg_programs;

class room{
    int length, breadth;
    room(int x, int y){
        length = x;
        breadth = y;
    }

    int area(){
        return(length * breadth);
    }
}

class hall extends room{
    
    int height;
    hall(int x, int y, int z){
        super(x, y);
        height = z;
    }
    int volume(){
        return (length * breadth * height);
    }

}
public class single_inheritance {
   public static void main(String[] args) {
    hall h1 = new hall(10, 10, 10);

    int a1 = h1.area();
    System.out.println("Area of the room: " + a1);
    int v1 = h1.volume();
    System.out.println("Area of the hall: " + v1);
   }
}
