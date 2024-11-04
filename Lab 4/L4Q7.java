import java.util.Scanner;
public class L4Q7 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int P, N;
        double M = 0, i, C = 0, L = 0, R = 0, Ltotal = 0;

        System.out.print("Enter principal amount: ");
        P = input.nextInt();
        R = P;
        System.out.print("Enter interest in %: ");
        i = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = input.nextInt();

        System.out.printf("%-10s%20s%20s%20s%20s%20s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        M = (P * (i / 1200)) / (1 - Math.pow((1 + (i / 1200)), -N));

        for (int month = 1; month <= N; month++){
            C = M * Math.pow((1 + (i / 1200)), (-1 -N + month));
            L = M - C;
            R -= C;
            Ltotal += L;
            System.out.printf("%-10d%20.2f%20.2f%20.2f%20.2f%20.2f\n", month, M, C, L, R, Ltotal);
        }





    }
}
