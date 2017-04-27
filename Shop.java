package OnlineShop;

import java.util.Scanner;

public class Shop {

    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // the method to deal with a customer in the shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            // Add product to the shopping basket, 
            // get the unit price from the Store object.
            // Remove the product from the store.
            if (store.stock(product) > 0) {
                basket.add(product, store.price(product));
                store.take(product);
            }
            else
                System.out.println("You cannot buy more of this product. Stock = 0.");
        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
        
        System.out.println();
        System.out.println("Status of the storehouse:");
        System.out.println(store);
    }
}
