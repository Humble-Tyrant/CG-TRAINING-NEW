package KeyWords_Level1;

public class Level1_005 {

    static class Student {
        static String universityName = "Global University";
        static int totalStudents = 0;

        final int rollNumber;
        String name;
        char grade;

        Student(int rollNumber, String name, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
            totalStudents++;
        }

        static void displayTotalStudents() {
            System.out.println("Total Students: " + totalStudents);
        }

        void display(Object obj) {
            if (obj instanceof Student) {
                System.out.println(name + " " + rollNumber + " " + grade);
            }
        }
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Neha", 'A');
        s.display(s);
        Student.displayTotalStudents();
    }
}

