package Q6;

public class Product {
    private String name;
    private double price;
    private int stock;
    
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        String display = "Name: " + name + "\nPrice: " + price;
        return display;
    }
    
    public void reduceStock() {
        stock--;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getStock() {
        return stock;
    }
}
