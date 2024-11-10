package viva;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isInvalid = false;
        System.out.print("Please input a positive integer: ");
        String input = sc.next();

        do {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) < '0' || input.charAt(i) > '9') {
                    isInvalid = true;
                    break;
                }
                else {
                    isInvalid = false;
                }
            }
            if(isInvalid){
                System.out.print("Invalid Input. Please re-input a valid +ve integer: ");
                input = sc.next();
            }
            else {
                break;
            }
        }while(isInvalid);

        System.out.println("You've inputed a valid integer!");
        int number = Integer.parseInt(input);

        if(number % 2 == 0) {
            System.out.print("The integer is even!");
        }
        else {
            System.out.print("The integer is odd!");
        }
    }
}
