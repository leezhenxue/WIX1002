import java.util.Scanner;
public class PY2024Q2b { //class name should be InvalidAgeException
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Age: ");
        int age = input.nextInt();

        try {
            // Check if the age is valid (for example, we expect age >= 0)
            if (checkAge(age)) {
                System.out.println("Valid age.");
            } else {
                System.out.println("Invalid age.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Will catch any InvalidAgeException thrown
        }
    }

    public static boolean checkAge(int age) throws Exception{
            return age >= 18; 
    }
}
