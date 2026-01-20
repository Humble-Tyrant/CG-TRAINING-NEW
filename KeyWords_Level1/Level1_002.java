package KeyWords_Level1;

public class Level1_002 {

    static class Book {
        static String libraryName = "Central Library";

        final String isbn;
        String title;
        String author;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        static void displayLibraryName() {
            System.out.println(libraryName);
        }

        void display(Object obj) {
            if (obj instanceof Book) {
                System.out.println(title + " " + author + " " + isbn);
            }
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", "ISBN123");
        Book.displayLibraryName();
        b.display(b);
    }
}

