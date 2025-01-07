package Q4;
public class Item {
   private String name;
   private int effect;
   
   public Item(String name, int effect){
       this.name = name;
       this.effect = effect;
   }
   
   public Item(String name){
       this.name = name;
   }
   
   public int use(Player player){
       if(name.equalsIgnoreCase("Health potion")){
           player.increaseHealth(effect);
       } else if(name.equalsIgnoreCase("Sword")){
           player.increaseAttackPower(effect);
       }
       return effect;
   }
   
   @Override
   public String toString(){
       return name + " Used by Hero!";
   }
   
   
}
