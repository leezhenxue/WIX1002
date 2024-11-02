import java.util.Random;
public class L3Q2 {

    public static void main(String[] args) {
        Random input = new Random();
        
        int num = input.nextInt(6);
        String word = "0";
        
        switch (num) {
            case (0):
                word = "zero";
                break;
            case (1):
                word = "one";
                break;
            case (2):
                word = "two";
                break;
            case (3):
                word = "three";
                break;
            case (4):
                word = "four";
                break;
            case (5):
                word = "five";
                break;
        }
        
        System.out.println(num + " is " + word);
        
    }
}