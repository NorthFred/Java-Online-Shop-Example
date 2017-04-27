package OnlineShop;

import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket {

    // ShoppingBasket stores object as Purchase objects.
    
    // Attributes
    List<Purchase> purchaseList;
    
    public ShoppingBasket() {
        
        this.purchaseList = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
 
        // Create a helper boolean to track if the purchase is already in the basket.
        boolean alreadyAdded = false;

        // If the basket already contains the product which we add,
        // we don't create a new purchase object, but update the 
        // amount of the purchase object by 1 (increaseAmount() method)
        for (Purchase p : this.purchaseList) {
            if (p.getName().equals(product)) {
                p.increaseAmount();
                alreadyAdded = true;
                System.out.println("This product was already on your list, increased the amount.");
            }
        }
        if (alreadyAdded == false) {
            System.out.println("This product is not yet in your purchase list.");
            // Create purchase object from product and price
            Purchase aPurchase = new Purchase(product, 1, price);
            // Add the purchase object to the purchase list.
            this.purchaseList.add(aPurchase);
        }
    }
    
    public int price() {
        
        int basketprice = 0;
        
        // returns the shopping basket total price
        for (Purchase p : this.purchaseList) {
            basketprice += p.price();
        }
        return basketprice;
    }
    
    public void print() {
        for (Purchase p : this.purchaseList) {
            System.out.println(p);
        }
    }
}
