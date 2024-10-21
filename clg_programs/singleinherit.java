package clg_programs;

class room {
    int length, breadth;
    room (int x, int y) {
        length = x;
        breadth = y;
    }
    int area() {
        return (length * breadth);
    }
}

class hall extends room {
    int height;
    hall(int x, int y, int z)
    {
        super(x, y);
        height = z;
    }
    int volume() {
        return(length * breadth * height);
    }
}
class singleinherit {
    public static void main(String arg[]) {
        hall h1 = new hall(10,10,10);
        int a1 = h1.area();
        int v1 = h1.volume();
        System.out.println("area of room = " + a1);
        System.out.println("volume of room= " + v1);
    }
}