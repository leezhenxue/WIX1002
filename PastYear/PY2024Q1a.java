import java.util.Scanner;

public class PY2024Q1a {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String num;
        int num0 = 0, positivenum = 0; int negativenum = 0;
        while (true) { 
            System.out.print("Enter number (Enter X to quit): ");
            num = input.next().toLowerCase();
            if (num.equals("x")){
                break;
            }

            try {
                int intnum = Integer.parseInt(num);  // Try to parse the string to an integer

                // Count positive, negative, or zero
                if (intnum > 0) {
                    positivenum++;
                } 
                else if (intnum < 0) {
                    negativenum++;
                } 
                else {
                    num0++;
                }
            } catch (NumberFormatException e) {
                // If the input is not a valid integer, inform the user
                System.out.println("The input should be an integer.");
            }
        } 
        input.close();

        System.out.println("Positive integer: " + positivenum);
        System.out.println("Negative integer: " + negativenum);
        System.out.println("Number 0: " + num0);
    }
}
