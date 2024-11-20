package L8Q3;

import java.util.Scanner;

public class Tester {
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
