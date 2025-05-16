package OPPS;
interface one {
    String printname();
}
interface two {
    void printdept();
}
interface three extends one, two {
    void printblock();
}

class vj implements three {
    @Override public void printdept(){
        System.out.println("Computer science");
    }
    public void printblock(){
        System.out.println("Block 1");
    }
    public String printname(){
        return "Vijay";
    }
}

public class multipleinherit {
    public static void main(String... args){
        vj v = new vj();
        System.out.print("Name: " + v.printname());
    }
}
