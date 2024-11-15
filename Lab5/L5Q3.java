import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int sum, hour; 

        System.out.print("Enter the number of employees: ");
        int employee = input.nextInt();

        for (int i = 0; i < employee; i++){
            System.out.println("\nEmployee " + (i+1) + ": ");
            sum = 0;
            for (int day = 1; day <= 7; day++){
                hour = rand.nextInt(1, 9);
                sum += hour;
                System.out.println("Day " + day + " working hour: " + hour);
            }
            System.out.println("Total woking hour: " + sum);
        }
        
    }
}
