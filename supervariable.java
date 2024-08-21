class car{ String color = "white"; }

class chevrolet extends car{
    String color = "black";

    void printColor(){
        System.out.println("Default Car Color: " + super.color);
        System.out.println("Chevrolet Color: " + color);
    }

}

class supervariable{

    public static void main(String[] args){
        chevrolet c = new chevrolet();
        c.printColor();
    }
}