public class Game2{
    private final Dice dice = new Dice();
    private int totalScore = 0;
    

    public Game2(){
        do {
            mark();
        } while (!win());
        System.out.println("Player win");
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
