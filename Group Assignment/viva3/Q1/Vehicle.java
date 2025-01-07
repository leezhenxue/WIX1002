package Q1;

public class Vehicle{
    private String vehicleID;
    private String type;
    private String brand;
    private double rentalRate; 
    private double fuelLevel;
    private int rentalDays;
    
    //constructor 
    public Vehicle(){
        this.vehicleID = "0000";
        this.type = "Car";
        this.brand = "Myvi";
        this.rentalRate = 100.0;
        this.fuelLevel = 100;
        this.rentalDays = 2;
    }
    
    //constructor with parameters
    public Vehicle(String vehicleID, String type, String brand, double rentalRate, double fuelLevel){
        this.vehicleID = vehicleID;
        this.type = type;
        this.brand = brand;
        this.rentalRate = rentalRate;
        this.fuelLevel = fuelLevel;
    }
    
    //getter & setter 
    public String getVehicleID(){
        return vehicleID;
    }
    public void setVehicleID(){
        this.vehicleID = vehicleID;
    }
    
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }
    
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(){
        this.rentalRate = rentalRate;
    }
    
    public double getFuelLevel(){
        return fuelLevel; 
    }
    public void setFuelLevel(){
        this.fuelLevel = fuelLevel;
    }
    
    public int getRentalDays(){
        return rentalDays;
    }
    public void setRentalDays(int input){
        this.rentalDays = input;
    }
    
    public double calculateRentalRate(){
        if(type.equalsIgnoreCase("Van")){
            return rentalRate * 1.2;
        } else if(type.equalsIgnoreCase("Motorcycle")){
            return rentalRate  * 0.75;
        } else{
            return rentalRate;
        }
    }
    
    public double calculateRentalCost(int input){
        double adjustedRate = calculateRentalRate();
        double totalCost = adjustedRate * rentalDays;
        
        if(rentalDays >= 7 && rentalDays <= 14){
             totalCost *= 0.95; //5% discount
        } else if(rentalDays > 14){
             totalCost *= 0.90; //10% discount
        } 
        return totalCost;
    }
    
    public double calculateFuelCharge(){  
        if(fuelLevel < 50){    
            return 100 - fuelLevel + 50;
        }
        return 100 - fuelLevel;
    }
    
    @Override
    public String toString(){
        double rentalCost = calculateRentalCost(rentalDays);
        double fuelCharge = calculateFuelCharge();
        double finalcost = rentalCost + fuelCharge;
        
        return "Vehicle ID: " + vehicleID +
                "\nType: " + type +
                "\nBrand: " + brand +
                "\nRental Rate: " + "$" + rentalRate +
                "\nFuel Level: " + fuelLevel + "%" +
                "\nRental Days: " + rentalDays +
                "\nTotal Cost: " + finalcost;
                
    }
}

