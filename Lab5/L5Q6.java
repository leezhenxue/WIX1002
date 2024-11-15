import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int row;
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        row = input.nextInt();
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        int[] num = new int[row];
        for (int j = 0; j < row; j++){
            if (j == 0){
                for (int i = 0; i < row; i++) {
                    if (i == 0){
                        num[i] = 1;
                    }
                    else {
                        num[i] = 0;
                    }
                    System.out.print(num[i] + " ");
                }
                System.out.println();
            }
            
            else {
                for (int i = row-1; i > 0; i--){
                        num[i] = num[i] + num[i-1];
                }
                for (int i = 0; i < row; i++){
                    System.out.print(num[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
