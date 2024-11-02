import java.util.Scanner;
public class L2Q1 {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double fahrenheit, celsius;
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) / 18.0;
        System.out.println(celsius);
        
    }
}