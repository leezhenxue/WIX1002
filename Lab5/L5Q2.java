import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num = new int[10];
        int j;

        for (int i = 0; i < 10; i++) {
            num[i] = rand.nextInt(0, 20);
            j = 0;
            while (j < i){
                if (num[j] == num[i]){
                    i--;
                    break;
                }
                else {
                    j++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + (i+1) + ": " + num[i]);
        }
    }
}

