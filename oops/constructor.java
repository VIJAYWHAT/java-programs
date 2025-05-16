package OPPS;
class Employee {

    String name;
    int age;
    String dept;

    public Employee (String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
     
    public String getName() {
        return name;
    } 
    public int getAge() {
        return age;
    }
    public String Dept() {
        return dept;
    }

    public Employee getEmployee() {
        return new Employee(name, age, dept);
    }

    @Override
    public String toString(){
        return "Employee [name=" + this.name + ", age=" + this.age + ", dept=" + this.dept + "]";
    }
}

public class constructor {
    public static void main(String... args) {
        Employee emp = new Employee("VJ", 20, "Backend");

        Employee details = emp.getEmployee();

        System.out.println(details);

        System.out.println("\nEmployee Name: " + details.name
                    + "\nEmployee Age: " + details.age
                    + "\nEmployee Department: " + details.dept);
    }
}
