package Constructors_Level2;

public class Level2_004 {

    static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }
    }

    static class PostgraduateStudent extends Student {
        PostgraduateStudent(int r, String n, double c) {
            super(r, n, c);
        }

        void display() {
            System.out.println(rollNumber + " " + name);
        }
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent(1, "Amit", 8.5);
        p.display();
        System.out.println(p.getCGPA());
    }
}

