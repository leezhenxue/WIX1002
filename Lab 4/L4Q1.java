import java.util.Scanner;
public class L4Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        int factor = 1;
        
        System.out.print("Enter an Integer: ");
        num = input.nextInt();
        
        System.out.print("The factors are: ");
        
        while (factor < num){
            if (num % factor == 0)
                System.out.print(factor + ", ");
            factor = factor + 1;
        }
        System.out.print(factor);
        
    }
}