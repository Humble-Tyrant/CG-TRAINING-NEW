package Constructors_Level2;

public class Level2_007 {

    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        Employee(int id, String dept, double sal) {
            employeeID = id;
            department = dept;
            salary = sal;
        }

        public void setSalary(double s) {
            salary = s;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Manager extends Employee {
        Manager(int id, String d, double s) {
            super(id, d, s);
        }

        void display() {
            System.out.println(employeeID + " " + department);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 80000);
        m.display();
        System.out.println(m.getSalary());
    }
}

