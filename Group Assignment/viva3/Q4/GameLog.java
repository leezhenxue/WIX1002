package V3Q4;
import java.util.Scanner;
public class GameLog {
    public static void main(String[] args){
        //create object
        Scanner sc = new Scanner(System.in);
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");
        Item healthPotion = new Item("Health Potion", 20);
        Item sword = new Item("Sword", 15);
        BlackMagic poison = new BlackMagic("Poison", 10);
        BlackMagic MagicOrb = new BlackMagic ("Magic Orb", 2);
                System.out.println(player);
                System.out.println(enemy);
        while (player.isAlive() && enemy.isAlive()){
        //player turn
        System.out.println("Hero turn:");
        //player use item(optional)
        System.out.println("(optional)Use Item:Health Potion/Sword");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("Health Potion")){
            healthPotion.use(player);
            System.out.println(healthPotion);
            System.out.println(player);
        }
        if(input.equalsIgnoreCase("Sword")){
            sword.use(player);
            System.out.println(sword);
            System.out.println(player);
        }
        //player attack
        int damage = player.getAttackPower();
        player.attack(enemy);
        System.out.println("Hero dealt "+damage+" damage.");
        System.out.println(enemy);
        System.out.println(player);

        if (!enemy.isAlive()) {
                System.out.println("Goblin is defeated! Hero win!");
                break;
            }
        System.out.println();
        System.out.println();

        
        //enemy turn
        System.out.println("Goblin turn:");
        //Enemy use BlackMagic(optional)
        System.out.println("(optional)Use BlackMagic:Poison/Magic Orb");
        input = sc.nextLine();
        if(input.equalsIgnoreCase("Poison")){
            poison.use(player, enemy);
            System.out.println(poison);
            System.out.println(player);
        }
        if(input.equalsIgnoreCase("Magic Orb")){
            MagicOrb.use(player,enemy);
            System.out.println(MagicOrb);
            System.out.println(enemy);
        }
        //enemy attack
        damage = enemy.getAttackPower();
        enemy.attack(player);
        System.out.println("Goblin dealt "+damage+" damage.");
        System.out.println(player);
        System.out.println(enemy);

        if (!player.isAlive()) {
                System.out.println("You are defeated! Goblin win!");
                break;
            }
        System.out.println();
        System.out.println();
    }
        sc.close();
    }
}


/*package VIVA3Q4EXTRA;
public class GameLog {
    public static void main(String[] args) {
        // Create Player and Enemy
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");

        // Create Items
        Item healthPotion = new Item("Health Potion", 20);
        Item sword = new Item("Sword", 15);

        // Create Black Magic
        BlackMagic poison = new BlackMagic("Poison", 10);
        BlackMagic magicOrb = new BlackMagic("Magic Orb", 0);

        // Simulate combat
        while (player.isAlive() && enemy.isAlive()) {
            // Player's turn
            System.out.println(player);
            System.out.println(enemy);
            System.out.println("Player attacks!");
            int damage = player.attack(enemy);
            System.out.println("Player dealt " + damage + " damage.");
            System.out.println(enemy);

            // Check if enemy is alive
            if (!enemy.isAlive()) {
                System.out.println("Enemy is defeated! You win!");
                break;
            }

            // Enemy's turn
            System.out.println("Enemy attacks!");
            enemy.attack(player);
            System.out.println("Player received damage.");
            System.out.println(player);

            // Check if player is alive
            if (!player.isAlive()) {
                System.out.println("Player is defeated! Game over!");
                break;
            }

            // Player can use items during their turn (example use)
            System.out.println("Use item? Type \"1\" to use Health Potion, \"2\" to use Sword, \"No\" to skip ");
            healthPotion.use(player);
            
            System.out.println("Used " + (healthPotion)  );
        }
    }
}public class BlackMagic {
    private String name;
    private int effect;

    // Constructor
    public BlackMagic(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    // Use black magic
    public int use(Player player, Enemy enemy) {
        if (name.equals("Poison")) {
            player.reduceHealth(effect);  // Damages the player
             enemy.setAttackPower((int)(enemy.getAttackPower() * 0.9));  // Reduces enemy attack power
        } else if (name.equals("Magic Orb")) {
             enemy.setAttackPower((int) (enemy.getAttackPower() * 3));  // Increases enemy attack power
        }
        return effect;
    }

    // toString method for combat log
    @Override
    public String toString() {
        return name + " (Effect: " + effect + ")";
    }
private String name;
    private int health;
    private int attackPower;
    
    //default constructor
    public Player (){
        this.health = 100;
        this.attackPower = 10;
    }
    //parameter constructor
    public Player (String name){
        this.name = name;
    }

    //method for attack
    public int attack ( Enemy enemy){
        int damage = this.attackPower;
        enemy.reduceHealth(attackPower);
        return damage;
    }
    
    //getter and setter
    public int getattackPower(){
        return attackPower;
    }
    
    public void setattackPower (int attackPower){
        this.attackPower = attackPower;
    }
    
    //method
    public void increaseattackPower ( int effect ) {
        this.attackPower += effect;
    }
    public void reduceattackPower ( int effect ){
        this.attackPower -= effect;
    }
    public void increaseHealth ( int effect ){
        this.health += effect;
    }
    public void reduceHealth (int damage){
        this.health -= damage;
    }
    public boolean isAlive(){
        return health > 0;
    }
    // jared (Health: 77 , Attack Power: 33 )
    @Override
    public String toString(){
        return name + " (Health: " + health + ", Attack Power: " + attackPower + " )";
    }

}*/