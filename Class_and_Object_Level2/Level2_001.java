package Class_and_Object_Level2;

class Student {
    String name;
    int rollNumber;
    int marks;

    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Level2_001 {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Rahul";
        student.rollNumber = 21;
        student.marks = 82;

        student.displayDetails();
    }
}

