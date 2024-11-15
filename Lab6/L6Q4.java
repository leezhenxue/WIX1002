public class L6Q4 {
    public static void main(String[] args) {
        System.out.println("The GCD of (24, 8) is " + gcd(24, 8));
        System.out.println("The GCD of (200, 625) is " + gcd(200, 625));
    }

    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
