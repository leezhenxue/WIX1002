package com.mycompany.l4q3;

import java.util.Scanner;
public class L4Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int score, sum = 0, sum2 = 0, n = 0, min = 0, max = 0;
        double s2 = 0;
        
        System.out.print("Enter a score [negative score to quit]:");
        score = input.nextInt();
        min = max = score;
        
        while (score >= 0){
            sum += score;
            sum2 += Math.pow(score, 2);
            n += 1;
            if (score < min)
                min = score;
            else if (score > max)
                max = score;
            System.out.print("Enter a score [negative score to quit]:");
            score = input.nextInt();
        }
        
        s2 = (sum2 - (Math.pow(sum, 2) / n)) / (n - 1);
        System.out.printf("%.1f\n", (double) s2);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", (sum / (double) n));
        System.out.printf("Standard Deviation: %.2f\n", Math.sqrt(s2));
    }
}
