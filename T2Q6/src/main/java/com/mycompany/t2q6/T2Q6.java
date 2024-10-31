/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2q6;

/**
 *
 * @author zhenx
 */
import java.util.Scanner;

public class T2Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();
        double circumference;
        
        circumference = Math.PI * diameter;
        
        System.out.printf("The circumference of the circle is : %.3f\n", circumference);
        
    }
}
