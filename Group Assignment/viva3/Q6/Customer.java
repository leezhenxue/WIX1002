public class Customer {
    private String name;
    private String email;
    private String shippingAddress;
    
    public Customer(String name, String email, String shippingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
    
    @Override
    public String toString() {
        String display = "Name: " + name + "\nEmail: " + email + "\nShipping Address: " + shippingAddress;
        return display;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }   
    
    public String getShippingAddress() {
        return shippingAddress;
    }
}
