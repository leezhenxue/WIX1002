import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int[] randnum = new int[20];
        int temp = 0, num, loop = 0, left, right, middle = 0;

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < 20; i++){
            randnum[i] = rand.nextInt(0, 101);
            if (i != 19){
                System.out.print(randnum[i] + ", ");
            }
            else {
                System.out.println(randnum[i]);
            }
            
        }

        System.out.println("Array in descending order");
        for (int i = 19; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (randnum[j] < randnum[j+1]){
                    temp = randnum[j+1];
                    randnum[j+1] = randnum[j];
                    randnum[j] = temp;
                }
            }
        }
        for (int i = 0; i < 20; i++){
            if (i != 19){
                System.out.print(randnum[i] + ", ");
            }
            else {
                System.out.println(randnum[i]);
            }
        }

        System.out.print("Enter a number to search: ");
        num = input.nextInt();

        //Linear search
        for (int i = 0; i < 20; i++) {
            if (randnum[i] != num){
                loop ++;
            }
            else {
                System.out.println(num + " found");
                System.out.println("Linear Search - " + loop + " loop(s)");
                break;
            }
        }

        //Binary Search
        loop = 0;
        left = 0;
        right = randnum.length - 1;
        while (right >= left){
            middle = (left + right) / 2;
            if (randnum[middle] > num){
                left = middle + 1;
                loop ++;
            }
            else if (randnum[middle] < num){
                right = middle - 1;
                loop ++;
            }
            else {
                loop++;
                break;
            }
        }
        System.out.println(num + " found");
        System.out.println("Binary Search - " + loop + " loop(s)");
    }
}
