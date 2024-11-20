import java.util.Scanner;
public class L6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.print("The number of array: ");
        n = input.nextInt();
        int[] num = new int[n];
        System.out.print("Enter " + n + " integer: ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();   
        }
        num = reverse(num);

        for (int nume : num){
            System.out.print(nume + " ");
        }

        input.close();
    }

    public static int[] reverse(int[] num){
        int[] rnum = new int[num.length];
        for (int i = 0; i < num.length; i++){
            while (num[i] != 0){
                rnum[i] = (rnum[i] * 10) + num[i] % 10;
                num[i] /= 10;
            }
        }
        return rnum;
    }
}

