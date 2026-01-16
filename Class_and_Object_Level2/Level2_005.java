package Class_and_Object_Level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity += quantity;
    }

    void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }
}

public class Level2_005 {
    public static void main(String[] args) {

        CartItem cart = new CartItem();

        cart.addItem("Laptop", 55000.0, 1);
        cart.addItem("Laptop", 55000.0, 1);

        cart.removeItem(1);

        cart.displayTotalCost();
    }
}
