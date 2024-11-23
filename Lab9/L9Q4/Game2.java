import java.util.Scanner;

public class Game2{
    private final Dice dice = new Dice();
    private int totalScore = 0;
    
    public Game2(){
        Scanner input = new Scanner (System.in);
        System.out.print("Welcome to Game 2.");
        do {
            input.nextLine();
            mark();
            System.out.print("Total Score:" + totalScore);

        } while (!win());
        System.out.println("\nPlayer win\n");
    }

    private void mark(){
        int roll1 = dice.rollDice();
        if (roll1 == 6){
            int roll2 = dice.rollDice();
            if (roll2 != 6 && (totalScore + roll1 + roll2) <= 100){
                totalScore += (roll1 + roll2);
            }
        }
        else {
            if (totalScore + roll1 <= 100){
                totalScore += (roll1);
            }
        }
    }

    private boolean win(){
        return totalScore == 100;
    }
}
