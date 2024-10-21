package clg_programs;
    
class rectangle {
        int length,width;
        void getdata (int x,int y) {
            length = x;
            width = y;
    }
    int rectarea() {
        int area=length*width;
        return(area);
    }
}
class rectangle_area {
    public static void main(String ab[]) {
        
        int a1,a2;
        rectangle rect1=new rectangle();
        rectangle rect2=new rectangle();
        
        rect1.length=5;
        rect1.width=10;
        a1=rect1.length*rect1.width;
        
        rect2.getdata(10,10);
        a2=rect2.rectarea();
        
        System.out.println("area1 = " + a1);
        System.out.println("area2 = " + a2);
    }
}