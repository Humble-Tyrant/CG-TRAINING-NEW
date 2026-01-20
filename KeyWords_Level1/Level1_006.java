package KeyWords_Level1;

public class Level1_006 {

    static class Vehicle {
        static double registrationFee = 5000;

        final String registrationNumber;
        String ownerName;
        String vehicleType;

        Vehicle(String registrationNumber, String ownerName, String vehicleType) {
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        static void updateRegistrationFee(double fee) {
            registrationFee = fee;
        }

        void display(Object obj) {
            if (obj instanceof Vehicle) {
                System.out.println(ownerName + " " + vehicleType + " " + registrationNumber);
            }
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("KA01AB1234", "Rohit", "Car");
        Vehicle.updateRegistrationFee(6000);
        v.display(v);
    }
}

