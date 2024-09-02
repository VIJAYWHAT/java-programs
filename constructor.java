class Employee {
    String name;
    int age;
    String dept;

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // Return the current Employee object
    public Employee getEmployee() {
        return this;
    }

    // Override toString() to provide a string representation of the Employee
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Dept: " + this.dept;
    }

}
class constructor {
    
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John", 30, "IT");

        // Get the Employee object using getEmployee() method
        Employee returnedEmployee = emp.getEmployee();

        // Print the Employee object directly (which calls toString())
        System.out.println(returnedEmployee);

        // Alternatively, you can explicitly call toString()
        System.out.println(returnedEmployee.toString());
    }
}
