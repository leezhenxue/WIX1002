/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l3q6;

/**
 *
 * @author zhenx
 */
import java.lang.Math;
import java.util.Scanner;
public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double radius, x, y, distance;
        
        System.out.print("Radius: ");
        radius = input.nextDouble();
        System.out.print("x: ");
        x  = input.nextDouble();
        System.out.print("y: ");
        y = input.nextDouble();
        
        distance = Math.sqrt(x*x + y*y);
        
        
        System.out.println(distance <= radius ? "The point is inside the circle" : "The point is outside the circle");
    }
}