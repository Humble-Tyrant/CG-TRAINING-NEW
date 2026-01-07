package Level1;public class Level1_006 {
    public static void main(String[] args) {

        int fee = 125000;
        int discountPercent = 10;

        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        System.out.print(
                "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee
        );
    }
}
