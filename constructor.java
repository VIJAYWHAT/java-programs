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
        return this.name;
    } 
    public int getAge() {
        return this.age;
    }
    public String dept() {
        return this.dept();
    }

    public String toString(){
        return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }
}

public class constructor {
    public static void main(String... args) {
        Employee emp = new Employee("VJ", 20, "Backend");

        System.out.println(emp.toString());
    }
}
