package Q4;
public class Player {
    //initialise instance variable
    private String name;
    private int health;
    private int attackPower;
    
    //initialise default constructor

    //initialise parameter constructor
    public Player(String name){
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
    }
    
    public int attack(Enemy enemy){
        int damage = this.attackPower;
        enemy.decreaseHealth(attackPower);
        return damage;

    }
    
    public void increaseHealth(int effect){
        this.health += effect;
    }
    public void decreaseHealth(int effect){
        this.health -= effect;
    }
     
    public void increaseAttackPower(int effect){
        this.attackPower += effect;
    }
    public void decreaseAttackPower(int effect){
        this.attackPower -= effect;
    }
    
    //getter & setter
    public int getAttackPower(){
        return attackPower;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }
    
    public boolean isAlive(){
        return health > 0;
    }
    
    @Override
    public String toString(){
        return name + "(Health: " + health + ", " + "Attack Power: " + attackPower + ")";
    }  
}
