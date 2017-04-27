
package OnlineShop;

public class Purchase {

    // Attributes
    private String product;
    private int amount;
    private int unitPrice;
    
    // Constructor
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }   
    
    // Accessors
    public int price() {
        // Calculates the total price for x units.
        int purchaseprice = this.unitPrice * this.amount;
        
        return purchaseprice;
    }
    
    public void increaseAmount() {
        this.amount += 1;
    }
    
    public String getName() {
        return this.product;
    }
    
    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }
}
