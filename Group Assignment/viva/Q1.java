package viva;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRunes = 0;     
        
        System.out.print("Enter username: ");
        String username = sc.next().toLowerCase();
        sc.close();

        if (username.length() <= 100){
            for(int i = 0; i < username.length(); i++) {
                char rune = username.charAt(i); 
                username = username.replace(rune, ' ');
                if(rune != ' ') numOfRunes++;
            }
            
            if(numOfRunes % 2 == 0) {
                System.out.print("ALLY DETECTED!");
            }else{
                System.out.print("ENEMY ALERT!");
            }
        }
        else {
            System.out.print("Username entered too long!");
        }
        
    }
}

