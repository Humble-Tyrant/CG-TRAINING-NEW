package Constructors_Level1;

public class Level1_005 {

    static class Book {
        String title;
        String author;
        double price;
        boolean available;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("Book borrowed");
            } else {
                System.out.println("Book not available");
            }
        }
    }

    public static void main(String[] args) {
        Book book = new Book("DSA", "Narasimha", 399);
        book.borrowBook();
        book.borrowBook();
    }
}

