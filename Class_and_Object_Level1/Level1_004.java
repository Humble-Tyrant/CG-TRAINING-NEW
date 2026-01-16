package Class_and_Object_Level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Level1_004 {
    public static void main(String[] args) {

        Item item = new Item();

        item.itemCode = 1001;
        item.itemName = "Notebook";
        item.price = 50.0;

        int quantity = 6;

        item.displayItemDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}

