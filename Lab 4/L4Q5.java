import java.util.Random;
public class L4Q5 {

    public static void main(String[] args) {
        Random input = new Random();
        int num1 = 0, num2 = 0, randnum;
        while (num1 <= 100 && num2 <= 100){
            randnum = input.nextInt(1, 7);
            if (randnum == 6){
                randnum += input.nextInt(1,7);
            }
            num1 += randnum;
            if (num1 > 100){
                System.out.println("Player 1 score: " + num1);
                System.out.println("Player 2 score: " + num2);
                System.out.println("Player 1 wins!");
            }
            randnum = input.nextInt(1, 7);
            if (randnum == 6){
                randnum += input.nextInt(1,7);
            }
            num2 += randnum;
            if (num2 > 100){
                System.out.println("Player 1 score: " + num1);
                System.out.println("Player 2 score: " + num2);
                System.out.println("Player 2 wins!");
            }
        }        
    }
}
