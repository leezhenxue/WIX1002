import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int[] num = new int[20];

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < 19; i++){
            num[i] = rand.nextInt(0, 101);
            System.out.print(num[i] + ", ");
        }
        num[20] = rand.nextInt(0, 101);
    }
}
