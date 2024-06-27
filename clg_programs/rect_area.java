package clg_programs;

public class rect_area{
    int length,width;
    void getdata(int x,int y){
        length=x;
        width=y;
    }
    int area(){
        int Area = length * width;
        return Area; 
    }
}

class circle{
    double radius;

    void getdata(double x){
        radius = x;
    }

    double area(){
        double Area = 3.14 * radius * radius;
        return Area;
    }

}


