import java.util.Scanner;
public class PY2024Q1b {
    public static void main(String[] args) {
        Scanner input = new  Scanner (System.in);
        double sum = 0;
        System.out.print("n: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            sum += (1.0/i);
        }
        System.out.println("Sum: " + sum);
    }

}
