package testshopping;

import java.text.NumberFormat;

public class ShoppingCart {

    private Item[] cart;
    private int itemCount; // total number of items in the cart 
    private double totalPrice; // total price of items in the cart 
    private int capacity; // current cart capacity 
// ------------------------------------------------------- 
// Creates an empty shopping cart with a capacity of 5 
// items. 
// ------------------------------------------------------- 

    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[5];
    }
// ------------------------------------------------------- 
// Adds an item to the shopping cart. 
// -------------------------------------------------------  

    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += quantity * price;
        itemCount++;
    }

    public double getCost() {
        return totalPrice;
    }
// ------------------------------------------------------- 
// Returns the contents of the cart together with 
// summary information. 
// ------------------------------------------------------- 

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
// ------------------------------------------------------- 
// Increases the capacity of the shopping cart by 3 
// ------------------------------------------------------- 

    private void increaseSize() {
        Item[] temp = new Item[cart.length + 3];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
}
