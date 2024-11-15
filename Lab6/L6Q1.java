public class L6Q1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Triangular number " + i + ": " + trinum(i)); 
        }
    }

    public static int trinum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

            return sum;

    }
}
