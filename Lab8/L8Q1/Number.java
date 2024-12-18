package L8Q1;
import java.util.Random;

public class Number {
    private int[] numbers;

    public Number(){
        this(10,100);
    }

    public Number(int n){
        this(n, 100);
    }

    public Number(int n, int range){
        numbers = new int[n];
        Random rand = new Random();
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(range + 1);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void Even(){
        System.out.print("Even Numbers: ");
        for (int num : numbers){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void Prime(){
        System.out.print("Prime Numbers: ");
        for (int num : numbers){
            if (num % 2 == 0 || num % 3 == 0|| num % 5 == 0|| num % 7 == 0){
                num++;
            }
            else {
                System.out.print(num + " ");
                num++;
            }
        }
    }

    public void Max(){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("\nMaximum Number: " + max);
    }

    public void Min(){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Minimum Number: " + min);
    }

    public void Average(){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println("Average: " +  ((double)sum/10));
    }

    public void Square(){
        System.out.print("Square Numbers: ");
        for (int num : numbers){
            if ((num >= 1) && (num == (int) Math.sqrt(num) * (int) Math.sqrt(num))){
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }
}

class Tester {
    public static void main(String[] args) {
        Number a = new Number(); // generate 10 random integers within 0 to 100. 
        a.Even();
        a.Prime();
        a.Max();
        a.Min();
        a.Average();
        a.Square();
        
        Number b = new Number(5); // generate 5 random integers within 0 to 100. 
        b.Even();
        b.Prime();
        b.Max();
        b.Min();
        b.Average();
        b.Square();

        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.
        c.Even();
        c.Prime();
        c.Max();
        c.Min();
        c.Average();
        c.Square();
    }
}
