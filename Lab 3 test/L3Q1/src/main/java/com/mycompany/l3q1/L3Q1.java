package com.mycompany.l3q1;

import java.util.Scanner;
public class L3Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, ans = 0;
        char operand;
        
        System.out.print("Enter two integer number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.print("Enter two operand: ");
        operand = input.next().charAt(0);
        
        switch (operand) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            case '%':
                ans = num1 % num2;
                break;
        }
        
        System.out.println(num1 + " " + operand + " " + num2 + " = " + ans);
                
    }
}
