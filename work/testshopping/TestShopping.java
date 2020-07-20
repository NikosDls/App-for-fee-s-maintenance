package testshopping;

import java.util.Scanner;

public class TestShopping {

    public static void main(String[] args) {
      
        ShoppingCart myCart = new ShoppingCart();
        String itemName;
        double itemPrice;
        int itemQuantity;
        int e = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agora \n2. Print cart contents \n3. Print cart total cost \n4.exit"); 
            e = sc.nextInt();

            switch (e) {
                case 1:
                    System.out.println("Give the item Name");
                    itemName = sc.next();
                    System.out.println("Give the item price");
                    itemPrice = sc.nextDouble();
                    System.out.println("Give the item quantity");
                    itemQuantity = sc.nextInt();
                    myCart.addToCart(itemName, itemPrice, itemQuantity);
                    break;
                case 2:
                    System.out.println(myCart.toString());
                    break;
                case 3:
                    System.out.println("Total Cost so far from shopping: " + myCart.getCost() + " €");
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
