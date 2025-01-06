package q6;

public class Invoice {
    private Order order;
    private Customer customer;
    
    public Invoice(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        String title = "Invoice for John Doe";
        String shippingAddress = "Shipping Address: " + customer.getShippingAddress();
        String productLabel = "Products: ";
        String productList = "";
        for(Product p : order.getProducts()) {
            productList += "- " + p.getName() + ": " + "RM" + p.getPrice() + "\n";        
        }
        String total = "Total: " + "RM" + order.calculateTotal();
        return title + "\n" + shippingAddress + "\n" + productLabel + "\n" + productList + total;
    }
}
