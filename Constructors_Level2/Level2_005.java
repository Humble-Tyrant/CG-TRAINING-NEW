package Constructors_Level2;

public class Level2_005 {

    static class Book {
        public String ISBN;
        protected String title;
        private String author;

        Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    static class EBook extends Book {
        EBook(String i, String t, String a) {
            super(i, t, a);
        }

        void display() {
            System.out.println(ISBN + " " + title);
        }
    }

    public static void main(String[] args) {
        EBook eb = new EBook("123", "Java", "James");
        eb.display();
    }
}

