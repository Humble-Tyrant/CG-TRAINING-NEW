package KeyWords_Level1;

public class Level1_003 {

    static class Employee {
        static String companyName = "TechCorp";
        static int totalEmployees = 0;

        final int id;
        String name;
        String designation;

        Employee(int id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            totalEmployees++;
        }

        static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }

        void display(Object obj) {
            if (obj instanceof Employee) {
                System.out.println(name + " " + designation + " " + id);
            }
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Amit", "Developer");
        e.display(e);
        Employee.displayTotalEmployees();
    }
}

