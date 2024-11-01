
import java.util.Scanner;
public class L4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n, sum = 0;
        
        System.out.print("Enter number: ");
        n = input.nextInt();
        
        /*
        for (int num = 1; num <= n; num++){
            for (int i = 1; i <= num; i++){
                sum += i;
            }
        }
        */
        
        for (int num = 1; num <= n; num++){
            sum += num * ((n - num) + 1);
        }
        
        System.out.println("Sum: " + sum);
        input.close();
    }
}
