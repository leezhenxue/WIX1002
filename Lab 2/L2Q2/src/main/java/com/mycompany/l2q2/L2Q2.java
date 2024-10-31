/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l2q2;

/**
 *
 * @author zhenx
 */
import java.util.Scanner;
public class L2Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int P, D, Y;
        double M, R;
        
        P = input.nextInt();
        D = input.nextInt();
        R = input.nextDouble();
        Y = input.nextInt();
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        
        System.out.format("%.2f", M);

        
        
    }
}