import java.util.Random;
public class L4Q6 {

    public static void main(String[] args) {
        Random input = new Random();
        int digit = 0;

        int num = input.nextInt(Integer.MAX_VALUE);
        System.out.println("The random number: " + num);
        
        while (num > 0){
            num /= 10;
            digit ++;
        }
        
        System.out.println("The number of digits of the integer: " + digit);

    }
}
