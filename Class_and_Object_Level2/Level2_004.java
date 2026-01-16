package Class_and_Object_Level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
}

public class Level2_004 {
    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Inception", 12, 250.0);
        ticket.displayTicketDetails();
    }
}

