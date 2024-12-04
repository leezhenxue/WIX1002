package viva;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        
        //Checking validity of input
        boolean isInvalid = false;
        do{
            System.out.print("Enter a positive integer: ");
            num = sc.next();
            for(int i = 0; i < num.length(); i++) {
                if(num.charAt(i) < '0' || num.charAt(i) > '9') {
                    isInvalid = true;
                    System.out.println("Invalid input!");
                    break;
                }else{
                    isInvalid = false;
                }
            }   
        }while(isInvalid);
        
        //Initialize array with value
        int[] numArray = new int[num.length()];
        for(int i = 0; i < num.length(); i++) {
            numArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        int totalNumberOfGroup = 1;
        int sumOfLength = 0;
        int longestGroup = numArray[0];
        int numOfLongest = -1;
        int lengthOfGroup = 0;
        int k = numArray[0];

        for(int i = 0; i < numArray.length; i++) {
            //If not same meaning the digit has changed
            if(numArray[i] != k) {
                k = numArray[i];
                totalNumberOfGroup++;
                lengthOfGroup = 0;
            }
            
            lengthOfGroup++;
            //check if the group is the longest or not
            if(lengthOfGroup > numOfLongest) {
                numOfLongest = lengthOfGroup;
                longestGroup = numArray[i];
            }

            sumOfLength++;
        }
        System.out.println(totalNumberOfGroup);
        System.out.println(longestGroup + " " + numOfLongest);
        System.out.println(sumOfLength);
    }
}
