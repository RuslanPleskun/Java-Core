package src.hw10;

public class Shopper {
    private Store store;
    private Product[] cart;
    private double cash;

    public Shopper(Store store, int cartCapacity, double cash) {
        this.store = store;
        this.cart = new Product[cartCapacity];
        this.cash = cash;
    }

    public boolean addToCart(Product product) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                if (product.getQuantity() > 0 && cash >= product.getPrice()) {
                    cart[i] = product;
                    product.setQuantity(product.getQuantity() - 1);
                    cash -= product.getPrice();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeFromCart(Product product) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == product) {
                cart[i] = null;
                product.setQuantity(product.getQuantity() + 1);
                cash += product.getPrice();
                return true;
            }
        }
        return false;
    }

    public double checkout() {
        double totalCost = 0;
        for (Product product : cart) {
            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        if (totalCost <= cash) {
            store.receivePayment(totalCost);
            for (Product product : cart) {
                if (product != null) {
                    removeFromCart(product);
                }
            }
            return totalCost;
        }
        return 0;
    }

    public void printCart() {
        System.out.println("Shopper's Cart:");
        for (Product product : cart) {
            if (product != null) {
                System.out.println("Product: " + product.getName() + " - Price: $" + product.getPrice());
            }
        }
    }

    public double getCash() {
        return cash;
    }
}
