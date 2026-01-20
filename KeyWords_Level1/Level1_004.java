package KeyWords_Level1;

public class Level1_004 {

    static class Product {
        static double discount = 10;

        final int productID;
        String productName;
        double price;
        int quantity;

        Product(int productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        static void updateDiscount(double d) {
            discount = d;
        }

        void display(Object obj) {
            if (obj instanceof Product) {
                System.out.println(productName + " " + price + " " + quantity + " " + discount);
            }
        }
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 50000, 1);
        Product.updateDiscount(15);
        p.display(p);
    }
}

