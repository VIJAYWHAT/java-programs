class rect{
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


public class rectagle_area {

    public static void main(String[] args){

        int area1, area2;

        rect rect1 = new rect();
        rect1.length = 15;
        rect1.width = 10;
        area1 = rect1.length * rect1.width;
        System.out.println("Area of Rectangle1: " + area1);

        rect rect2 = new rect();
        rect2.getdata(10, 25);
        area2 = rect2.area();
        System.out.println("Area of Rectangle2: " + area2);
    }
    
}
