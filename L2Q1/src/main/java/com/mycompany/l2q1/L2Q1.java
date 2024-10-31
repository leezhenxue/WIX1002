/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l2q1;

import java.awt.font.TextAttribute;

/**
 *
 * @author zhenx
 */
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