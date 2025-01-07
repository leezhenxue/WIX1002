package Q4;
public class BlackMagic {
   private String name;
   private int effect;
   
   public BlackMagic(String name, int effect){
       this.name = name;
       this.effect = effect;
   }
   
   public BlackMagic(String name){
       this.name = name;
   }
   public int use(Player player, Enemy enemy ){
       if(name.equalsIgnoreCase("Poison")){
           player.decreaseHealth(effect);
           player.decreaseAttackPower((int)(player.getAttackPower()*0.1));
       } else if(name.equalsIgnoreCase("Magic Orb")){
           enemy.increaseAttackPower(enemy.getAttackPower()*effect);
       }
       return effect;
   }
   
   @Override
   public String toString(){
       return name + " used by Goblin!";
   }
   
   
}
