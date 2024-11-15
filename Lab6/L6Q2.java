import java.util.Scanner;

public class L6Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        System.out.print("Character: ");
        char c = input.next().charAt(0);
        System.out.println();

        //triangle
        for (int i = n-1; i > 0; i--){
            System.out.printf("%-" + i + "s",  " ");
            multiPrint(((n-i)*2 - 1), c);
        }
        multiPrint(n*2, c);

        System.out.println();

        //diamond
        for (int i = n-1; i > 0; i--){
            System.out.printf("%-" + i + "s",  " ");
            multiPrint(((n-i)*2 - 1), c);

        }
        multiPrint(n*2 - 1, c);

        for (int i = 1; i < n; i++){
            System.out.printf("%-" + i + "s",  " ");
            multiPrint(((n-i)*2 - 1), c);
        }

        input.close();
    }

    public static void multiPrint(int n, char c){
        for (int i = 0; i < n; i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
