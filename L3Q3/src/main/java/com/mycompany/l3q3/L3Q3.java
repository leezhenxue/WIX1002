/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l3q3;

/**
 *
 * @author zhenx
 */

import java.util.Scanner;
public class L3Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sales;
        double commission;
        
        System.out.println("Sales: ");
        sales = input.nextInt();
        
        if (sales <= 100)
            commission = sales * 0.05;
        else if (sales > 100 && sales <= 500)
            commission = sales * 0.075;
        else if (sales > 500 && sales <= 1000)
            commission = sales * 0.1;
        else
            commission = sales * 0.125;
        
        System.out.printf("Commission: %.2f\n", commission);
    }
}