import java.util.Scanner;
public class viva1Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num = 0;
        System.out.print("Please input a positive integer: ");

        while (true) {
            if (!input.hasNextInt()) { // Check if input is an integer
                System.out.println("Invalid input. Please enter a positive integer.");
                input.next(); // Clear invalid input
            } 
            else {
                num = input.nextInt();
                if (num > 0) { // Check if the integer is positive
                    break; // Exit the loop if input is valid
                } 
                else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }
        }



        System.out.println("you've inputed a valid integer!");

        System.out.println(num % 2 == 0 ? "The integer is even!" : "The integer is odd!");

        input.close();
    }
}
