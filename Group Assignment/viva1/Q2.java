package viva;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value : ");
        int startingValue = sc.nextInt();
        System.out.print("Enter the ending value : ");
        int endingValue = sc.nextInt();
        
        System.out.println("The output is : ");
        for(int i = startingValue; i <= endingValue; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("LuluLala");
            } else if(i % 3 == 0){
                System.out.println("Lulu");
            } else if((i % 5 == 0)){
                System.out.println("Lala");
            } else{
                System.out.println(i);
            }

        }
    }
}
