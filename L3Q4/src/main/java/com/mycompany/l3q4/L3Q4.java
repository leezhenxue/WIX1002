/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l3q4;

/**
 *
 * @author zhenx
 */

import java.util.Random;
public class L3Q4 {

    public static void main(String[] args) {
        Random rand = new Random();
        int player1 = 0, player2 = 0;
        int dice;
        
        for (int i = 0; i < 2; i++){
            dice = rand.nextInt(1, 7);
            player1 += dice;
        }
        
        for (int i = 0; i < 2; i++){
            dice = rand.nextInt(1, 7);
            player2 += dice;
        }
        
        System.out.println("Player 1 score: " + player1);
        System.out.println("Player 2 score: " + player2);
        
        if (player1 > player2)
            System.out.println("Player 1 wins!");
        else if (player1 < player2)
            System.out.println("Player 2 wins!");
        else
            System.out.println("Draw!");
    }
}
