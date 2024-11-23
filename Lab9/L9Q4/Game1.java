import java.util.Scanner;

public class Game1{
    private final Dice dice1 = new Dice();
    private final Dice dice2 = new Dice();
    private int totalScore = 0;
    
    public Game1(){
        Scanner input = new Scanner (System.in);
        System.out.print("Welcome to Game 1.");
        do { 
            input.nextLine();
            mark();
            System.out.print("Total Score:" + totalScore);
        } while (!win());
        System.out.println("\nPlayer win\n");
    }

    private void mark(){
        int roll1, roll2;
        if ((roll1 = dice1.rollDice()) == (roll2 = dice2.rollDice())){
            totalScore += (roll1 + roll2);
            totalScore += (dice1.rollDice() + dice2.rollDice());
        }
        else {
            totalScore += (roll1 + roll2);
        }
    }

    private boolean win(){
        return totalScore >= 100;
    }
    
}
