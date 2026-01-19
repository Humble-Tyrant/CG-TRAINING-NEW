package Constructors_Level1;

public class Level1_004 {

    static class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        HotelBooking() {
            guestName = "Guest";
            roomType = "Standard";
            nights = 1;
        }

        HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        HotelBooking(HotelBooking hb) {
            this.guestName = hb.guestName;
            this.roomType = hb.roomType;
            this.nights = hb.nights;
        }
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println(b3.guestName + " " + b3.roomType + " " + b3.nights);
    }
}

