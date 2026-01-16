package Class_and_Object_Level1;

class Book {
    String title;
    String author;
    double price;

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Level1_003 {
    public static void main(String[] args) {

        Book book = new Book();

        book.title = "Java Programming";
        book.author = "James Gosling";
        book.price = 499.50;

        book.displayDetails();
    }
}

