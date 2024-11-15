import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int a, b, c, score = 0;
        do { 
            System.out.println("Enter negative number to quit."); 
            a = rand.nextInt(0, 13);
            b = rand.nextInt(0, 13);
            System.out.printf("%d x %d = ", a, b);
            c = input.nextInt();

            if (c < 0){
                break;
            }
            else{
                if(ans(a, b, c) == true){
                    score++;
                }
            }
        } while (true);
        System.out.println("Your Score is " + score);

        input.close();
    }

    public static boolean ans(int a, int b, int c){
        return ((a * b) == c);
    }
}
