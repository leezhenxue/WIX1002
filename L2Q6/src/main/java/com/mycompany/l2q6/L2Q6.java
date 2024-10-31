/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l2q6;

/**
 *
 * @author zhenx
 */

import java.util.Scanner;
public class L2Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int water;
        double initialtemp, finaltemp, initialtempc, finaltempc, energy;
        
        System.out.print("Enter the smount of water in gram: ");
        water = input.nextInt();
        System.out.print("Enter the initial temmperature in Farenheit: ");
        initialtemp = input.nextDouble();
        initialtempc = (initialtemp-32) * 5 / 9;
        System.out.print("Enter the final temmperature in Farenheit: ");
        finaltemp = input.nextDouble();
        finaltempc = (finaltemp-32) * 5 / 9;
        
        energy = (water/1000) * (finaltempc - initialtempc) * 4184;
        
        System.out.println("The energy needed is " + energy);
        
    }
}
