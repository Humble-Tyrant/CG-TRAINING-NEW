package Class_and_Object_Level1;

class Circle {
    double radius;

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }
}

public class Level1_002 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.radius = 7;

        c.displayDetails();
    }
}

