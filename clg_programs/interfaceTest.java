package clg_programs;

interface area {
    final static float pi = 3.14f;
    float compute(float x, float y);
}

class rectangle implements area {
    public float compute(float x, float y) { 
        return (x * y);
    }
}

class circle implements area {

    public float compute(float x, float y) { 
        return (pi * x * x);
    }
}

public class interfaceTest {
    public static void main(String ab[]) {
        rectangle r1 = new rectangle();
        circle c1 = new circle();
        area a1;
        
        a1 = r1;
        System.out.println("Area of rectangle = " + a1.compute(10, 10));
        
        a1 = c1;
        System.out.println("Area of circle = " + a1.compute(10, 0)); 
    }
}
