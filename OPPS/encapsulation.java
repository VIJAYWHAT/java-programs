package OPPS;
class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return name; }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() { return age; }
}

public class encapsulation {
    public static void main(String[] args) {

        person vj = new person();
        vj.setName("Vijay R");
        vj.setAge(19);

        System.out.println("Name: " + vj.getName());
        System.out.println("Age: " + vj.getAge());

    }
}
