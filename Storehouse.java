package OnlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Storehouse {

    // Attributes   
    private Map<String, Integer> priceList;
    private Map<String, Integer> stockList;
    private final int INVALIDPRICE = -99;
    private final int EMPTYSTOCK = 0;
    private Set<String> products;

    // Constructor
    public Storehouse() {
        this.priceList = new HashMap<String, Integer>();
        this.stockList = new HashMap<String, Integer>();
    }

    
    // Accessors
    
    public Set<String> products() {
        
        if (this.priceList != null) {
            this.products = this.priceList.keySet();
        }
        return this.products;
    }
    
    public void addProduct(String product, int price, int stock) {
        this.priceList.put(product, price);
        this.stockList.put(product, stock);
    }
    
    // Get the price of a product.
    public int price(String product) {
        
        if (this.priceList.get(product) != null) {
            return this.priceList.get(product);
        }
        else
            return INVALIDPRICE;
    }
    
    // Get the stock number of a product.
    public int stock(String product) {
        
        if (this.stockList.get(product) != null) {
            return this.stockList.get(product);
        }
        else
            return 0; 
    }
    
    // Take a product from the stock.
    public boolean take(String product) {
        
        try {
            int amount = this.stockList.get(product);
        
                if (amount > 0) {

                this.stockList.put(product, amount-1);
                return true;
            }
            else
                return false;
        }
        catch(Exception e) {
            System.out.println("Product not on the list!");
            return false;
        }
    }
    
    @Override
    public String toString() {
        // returning the status of the storehouse object
        String overview = "";
        for (String item: this.products)
            overview += (item + " - left: " + stock(item) + "\n");
        return overview;
    }
}
