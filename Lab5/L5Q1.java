import java.util.Random;
import java.util.Scanner;
public class L5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int student, highest = 0, lowest = 100, sum = 0;

        System.out.print("Enter the number of student: ");
        student = input.nextInt();
        int[] mark = new int[student];

        for (int i = 0; i < student; i++){
            mark[i] = rand.nextInt(0, 101);
            System.out.println("Student " + (i+1) + " mark: " + mark[i]);
            if (mark[i] < lowest){
                lowest = mark[i];
            }
            if (mark[i] > highest){
                highest = mark[i];
            }
            sum += mark[i];
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + ((double)sum / student));

        input.close();
    }
}

