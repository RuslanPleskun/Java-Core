package src.hw10;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store(10);

        Product meat = new Product("Meat", 10.0, 20);
        Product cheese = new Product("Cheese", 5.0, 30);
        Product fish = new Product("Fish", 8.0, 15);
        Product beer = new Product("Beer", 2.5, 50);
        Product book = new Product("Book", 15.0, 10);
        Product chair = new Product("Chair", 50.0, 5);

        store.addProduct(meat);
        store.addProduct(cheese);
        store.addProduct(fish);
        store.addProduct(beer);
        store.addProduct(book);
        store.addProduct(chair);

        Shopper shopper1 = new Shopper(store, 5, 50);
        shopper1.addToCart(meat);
        shopper1.addToCart(beer);

        Shopper shopper2 = new Shopper(store, 3, 30);
        shopper2.addToCart(cheese);
        shopper2.addToCart(book);

        System.out.println("Store's Stock Before Shopping:");
        store.printStock();

        shopper1.checkout();
        shopper2.checkout();

        System.out.println("Store's Stock After Shopping:");
        store.printStock();

        System.out.println("Store's Money: $" + store.getMoney());
        System.out.println("Shopper 1's Cash: $" + shopper1.getCash());
        System.out.println("Shopper 2's Cash: $" + shopper2.getCash());
    }
}
