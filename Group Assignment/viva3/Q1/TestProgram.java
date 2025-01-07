package Q1;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Renting days: ");
        int input = sc.nextInt();
        Vehicle vehicle = new Vehicle("0011", "Van", "Toyota", 100.0, 50.0);
        vehicle.setRentalDays(input);
        System.out.print(vehicle);
    }
}
