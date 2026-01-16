package Class_and_Object_Level1;

class Employee {
    String name;
    int id;
    double salary;

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Level1_001 {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.name = "John";
        emp.id = 101;
        emp.salary = 45000.0;

        emp.displayDetails();
    }
}

