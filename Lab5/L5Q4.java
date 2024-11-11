import java.util.Scanner;

public class L5Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("3 by 3 Matrix");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("After rotates 90 degrees clockwise");

        for (int j = 0; j < 3; j++){
            for (int i = 2; i >= 0; i--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
