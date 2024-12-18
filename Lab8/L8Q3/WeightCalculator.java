package L8Q3;
import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator(int age, double height){
        double rweight = (height - 100 + age) * 0.9;
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended weight: " + rweight);
    }
}

class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int age;
        double height;

        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Height: ");
        height = input.nextDouble();
        System.out.println();
        
        WeightCalculator calculator = new WeightCalculator(age, height);
    }
}