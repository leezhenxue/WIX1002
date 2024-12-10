package viva2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.next();
        System.out.print("Longest Palindromic Substring: " + findLongestPalindromicSubstring(input));
    }    
    
    public static String findLongestPalindromicSubstring(String word) {
        int wordCount = 0;
        String tempString;
        String reversedSubstring = "";
        String panlindromicSubstring = "";
        //Finding from the first index
        for(int startIndex = 0; startIndex < word.length(); startIndex++) {
            //Start from first index loop to the end to find whether there is panlindromic or not
            for(int endIndex = startIndex; endIndex <= word.length(); endIndex++) {
                tempString = word.substring(startIndex, endIndex);
                for(int index = tempString.length() - 1; index >= 0; index--) {
                    reversedSubstring = reversedSubstring + tempString.charAt(index);
                }

                if(reversedSubstring.equals(tempString) && reversedSubstring.length() > wordCount){
                    panlindromicSubstring = tempString;
                    wordCount = reversedSubstring.length();
                }
                reversedSubstring = "";
            }
        }
        
        return panlindromicSubstring;
    }
}
