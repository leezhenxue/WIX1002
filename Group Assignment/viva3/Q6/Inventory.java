package q6;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productStock;
    
    public Inventory() {
        productStock = new ArrayList<>();
    }
    
    public void addProduct(Product product, int qty) {
        productStock.add(product);
    }
    
    public boolean isAvailable(Product product, int qty) {
        int numberOfProduct = 0;
        for(Product p : productStock){
            if(p.equals(product)) {
                numberOfProduct = product.getStock();
            }
        }
        return numberOfProduct >= qty;
    }
        
    public void updateStock(Product product, int qty) {
        for(Product p : productStock){
            if(p.equals(product)) {
                for(int i = 0; i < qty; i++){
                    product.reduceStock();
                }
            }
        }
    }
}

