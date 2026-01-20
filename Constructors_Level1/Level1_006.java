package Constructors_Level1;

public class Level1_006 {

    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double costPerDay = 1000;

        CarRental() {
            customerName = "Customer";
            carModel = "Hatchback";
            rentalDays = 1;
        }

        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double calculateTotalCost() {
            return rentalDays * costPerDay;
        }
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Rahul", "Sedan", 5);
        System.out.println(rental.calculateTotalCost());
    }
}

