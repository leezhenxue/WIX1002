import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        parseMatrix();
    }

    public static void parseMatrix() {
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

        displayMatrix(matrix);
    }

    public static void displayMatrix(int [][]matrix) {
        System.out.println("The original matrix:");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        rotateMatrix(matrix);

        System.out.println("The matrix after rotating:");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotateMatrix (int [][]matrix) {
        int n = matrix.length;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][(n-1)-j];
                matrix[i][(n-1)-j] = temp;

            }
        }
    }

}
