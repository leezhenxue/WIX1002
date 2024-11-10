package viva;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1,angle2,angle3;
        System.out.print("Enter angle 1 : ");
        angle1 = sc.nextInt();
        System.out.print("Enter angle 2 : ");
        angle2 = sc.nextInt();
        System.out.print("Enter angle 3 : ");
        angle3 = sc.nextInt();
        
        if(angle1 + angle2 + angle3 != 180) {
            System.out.print("The triangle is not valid.");
        }else {
            if(angle1 == angle2 && angle2 == angle3) {
                System.out.println("It is an equilateral triangle.");
            }else{
                if(angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    System.out.println("It is a right-angled triangle.");
                }
                if(angle1 == angle2 || angle2 == angle3) {
                    System.out.println("It is an equilateral triangle.");
                }else{
                    System.out.println("It is a scalene triangle.");
                }
            }
        }
    }
}
