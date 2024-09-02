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

public class ConstructorExample {
    public static void main(String... args) {
        Employee emp = new Employee("VJ", 20, "Backend");

        String empString = emp.toString();
        System.out.println("Employee String: " + empString);

        // Extracting the name from the empString
        String name = empString.substring(empString.indexOf("name=") + 5, empString.indexOf(", age="));
        System.out.println("Extracted Name: " + name);
    }
}

