import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        int[][] matrix = parseMatrix();
        System.out.println("The original matrix:");
        displayMatrix(matrix);
        System.out.println("The matrix after rotating:");
        int[][] rotatedMatrix = rotateMatrix(matrix);
        displayMatrix(rotatedMatrix);
    }

    public static int[][] parseMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();
        int matrix [][] = new int [n][n];
        for (int i = 0; i<n; i++) {
            System.out.print("Enter row number " + (i+1) + ": ");
            for (int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        sc.close();
        return matrix;
    }

    public static void displayMatrix(int [][]matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] rotateMatrix (int [][]matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

}
