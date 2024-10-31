package com.mycompany.l2q3;

/**
 *
 * @author zhenx
 */

import java.util.Random;
public class L2Q3{
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randnum1 = rand.nextInt(10, 51);
        int randnum2 = rand.nextInt(10, 51);
        int randnum3 = rand.nextInt(10, 51);
        
        int sum = randnum1 + randnum2 + randnum3;
        double average = (randnum1 + randnum2 + randnum3)/3;
        
        System.out.println("Number 1: " + randnum1);
        System.out.println("Number 2: " + randnum2);
        System.out.println("Number 3: " + randnum3);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
