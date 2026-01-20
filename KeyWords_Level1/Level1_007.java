package KeyWords_Level1;

public class Level1_007 {

    static class Patient {
        static String hospitalName = "City Hospital";
        static int totalPatients = 0;

        final int patientID;
        String name;
        int age;
        String ailment;

        Patient(int patientID, String name, int age, String ailment) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            totalPatients++;
        }

        static void getTotalPatients() {
            System.out.println("Total Patients: " + totalPatients);
        }

        void display(Object obj) {
            if (obj instanceof Patient) {
                System.out.println(name + " " + age + " " + ailment + " " + patientID);
            }
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient(1, "Anil", 45, "Fever");
        p.display(p);
        Patient.getTotalPatients();
    }
}

