package q6;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;
    
    public Order() {
        products = new ArrayList<>();
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }
    
    public double calculateTotal() {
        double totalPrice = 0;
        for(Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
