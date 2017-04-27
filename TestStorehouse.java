
package OnlineShop;


public class TestStorehouse {

    public static void main(String[] args) {
        
//        Storehouse store = new Storehouse();
//        store.addProduct("milk", 3, 10);
//        store.addProduct("coffee", 5, 7);
//
//        System.out.println("PRICES:");
//        System.out.println("milk:  " + store.price("milk"));
//        System.out.println("coffee:  " + store.price("coffee"));
//        System.out.println("sugar: " + store.price("sugar"));
//        
//        System.out.println();
//        
//        //Storehouse store = new Storehouse();
//        store.addProduct("coffee", 5, 1);
//
//        System.out.println("STOCKS:");
//        System.out.println("coffee:  " + store.stock("coffee"));
//        System.out.println("sugar: " + store.stock("sugar"));
//
//        System.out.println("we take a coffee: " + store.take("coffee"));
//        System.out.println("we take a coffee: " + store.take("coffee"));
//        System.out.println("we take sugar: " + store.take("sugar"));
//
//        System.out.println("STOCKS:");
//        System.out.println("coffee:  " + store.stock("coffee"));
//        System.out.println("sugar: " + store.stock("sugar"));
//   
//        System.out.println();

        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("PRODUCTS:");
        for (String product : store.products()) {
            System.out.println(product);
        }        
    }
}
