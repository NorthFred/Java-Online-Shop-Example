
package OnlineShop;


public class TestShoppingBasket {

    public static void main(String[] args) {
        
//        ShoppingBasket basket = new ShoppingBasket();
//        basket.add("milk", 3);
//        basket.add("buttermilk", 2);
//        basket.add("cheese", 5);
//        System.out.println("basket price: " + basket.price());
//        basket.add("computer", 899);
//        System.out.println("basket price: " + basket.price());
//        
//        basket.print();

        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
        
        
    }
}
