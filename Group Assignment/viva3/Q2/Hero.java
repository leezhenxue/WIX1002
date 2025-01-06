package viva3;

public class Hero {
    private String name;
    private String element;
    private double power;
    
    public Hero(String name, String element, double power) {
        this.name = name;
        this.element = element;
        this.power = power;
    }
    
    public double getPower() {
        return power;
    }
    
    public String getName() {
        return name;
    }
    
    public String getElement() {
        return element;
    }
}
