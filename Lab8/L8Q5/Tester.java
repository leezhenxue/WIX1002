package L8Q5;

public class Tester {
    public static void main(String[] args) {
        Game player1 = new Game();
        Game player2 = new Game();

        player1.player("Lee");
        player2.player("Tan");

        int sum1 = 0, sum2 = 0, i = 1;
        while(sum1 < 100 && sum2 < 100){
            System.out.println("Roll " + i);
            sum1 += player1.dice();
            System.out.print(sum1 + " ");
            if (sum1 >= 100){
                sum2 += player2.dice();
                System.out.println(sum2);
                if(sum1 == sum2){
                    System.out.println("Draw!");
                }
                else{
                    System.out.println("Player 1 wins!");
                }
                break;
            }

            sum2 += player2.dice();
            System.out.println(sum2);
            if (sum2 >= 100){
                System.out.println("Player 2 wins!");
                break;
            }
            i++;
        }

    }
}
