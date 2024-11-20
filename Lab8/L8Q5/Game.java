package L8Q5;

import java.util.Random;

public class Game {
    private String name;

    public void player(String name){
        this.name = name;
    }

    public int dice(){
        Random rand = new Random();
        int num = rand.nextInt(1, 7);
        return num;
    }
}
