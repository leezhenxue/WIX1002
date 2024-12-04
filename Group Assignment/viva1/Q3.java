package viva;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter three angles of a triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (!(a+b+c == 180 && a>0 && b>0 && c>0 )) 
            System.out.println("The triangle is not valid.");
        else {
            System.out.println("The triangle is valid.");
        if (a == b && b == c) 
             System.out.println("It is an equilateral triangle.");    
        else if (a == b || a == c || b == c)
             System.out.println("It is an isosceles triangle.");
            

        if (a != b && a != c && b != c)
             System.out.println("It is a scalene triangle.");
          
        if (a == 90 || b == 90 || c == 90)
             System.out.println("It is a right-angled triangle."); 
        }
    }
}
