import java.util.Random;
public class L2Q5 {

    public static void main(String[] args) {
        Random input = new Random();
        int sum = 0;
        int randnum = input.nextInt(10001);
        
        System.out.println("Number: " + randnum);
        
        while (randnum > 0) {
            sum += randnum % 10;
            randnum /= 10;
        }
       
        System.out.println("Sum: " + sum);
    }
}
