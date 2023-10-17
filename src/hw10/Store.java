package src.hw10;

public class Store {
    private double money;
    private Product[] products;

    public Store(int capacity) {
        this.money = 0;
        this.products = new Product[capacity];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }

    public double getMoney() {
        return money;
    }

    public Product[] getProducts() {
        return products;
    }

    public void printStock() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("Product: " + product.getName() + " - Price: $" + product.getPrice() + " - Quantity: " + product.getQuantity());
            }
        }
    }

    public void receivePayment(double payment) {
        money += payment;
    }
}
