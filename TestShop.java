
package OnlineShop;

import java.util.Scanner;

public class TestShop {

    public static void main(String[] args) {
        
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);
        store.addProduct("computer", 450, 2);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Customer ID 121331");
    
    }
}
