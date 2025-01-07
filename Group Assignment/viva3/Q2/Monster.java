package Q2;

public class Monster {
    private String name;
    private int pyroResistance;
    private int hydroResistance;
    private int electroResistance; 
    private int cryoResistance;
    private double healthPoint;
    
    public Monster(String name, int pyroResistance, int hydroResistance, int electroResistance, int cryoResistance, double healthPoint) {
        this.name = name;
        this.pyroResistance = pyroResistance;
        this.hydroResistance = hydroResistance;
        this.electroResistance = electroResistance;
        this.cryoResistance = cryoResistance;
        this.healthPoint = healthPoint;
    }
            
    public int getPyroResistance() {
        return pyroResistance;
    }
    
    public int getHydroResistance() {
        return hydroResistance;
    }
    
    public int getElectroResistance() {
        return electroResistance;
    }
    
    public int getCryoResistance() {
        return cryoResistance;
    }
    
    public double getHealthPoint() {
        return healthPoint;
    }
    
    public String getName() {
        return name;
    }
}
