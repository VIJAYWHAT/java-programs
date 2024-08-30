class parent {
    String name;
    String relation;

    void getParent(String name, String relation){
        this.name = name;
        this.relation = relation;
    }

}

class child extends parent {

    String childName;
    int age;
    void getChild(String name, int age){
        this.childName = name;
        this.age = age;
    }

    void print(){
        name = "Vijay";
        System.out.println(name);
    }
    
}

class vj extends child {

    String Name = "vj";
    void callVj() {
        System.out.print("Hello, I am ");
        print();
        relation = "owner";
        System.out.println("I am the " + relation + " of Vj Tech");
    }

}
class gopi extends vj {
    gopi(){
        name = "Gopi";
        relation = "brother";
        System.out.println("I am "+ name +
                             ", I am " + relation + " of " + Name);
        callVj();
    }
}
public class multilevelinherit {
    public static void main(String... args){
        new gopi();
    }
}
