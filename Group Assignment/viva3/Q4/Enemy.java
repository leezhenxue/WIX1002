package V3Q4;
public class Enemy {
    //initialise instance variable
    private String type;
    private int health;
    private int attackPower;
    
    //initialise default constructor

    //initialise parameter constructor
    public Enemy(String type){
        this.type = type;
        this.health = 50;
        this.attackPower = 5;

    }
    
    //method for attack
    public void attack(Player player){
        player.decreaseHealth(attackPower);
    }
    
    public void increaseAttackPower(int effect){
        attackPower += effect;
    }
    public void increaseHealth(int effect){
        this.health += effect;
    }
    public void decreaseHealth(int effect){
        this.health -= effect;
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
        return type + "(Health: " + health + ", " + "Attack Power: " + attackPower + ")";
    }
  
    
    
    
}
