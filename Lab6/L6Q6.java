public class L6Q6 {
    public static void main(String[] args) {
        int[] palindromic = new int[20];
        int[] emirp = new int[20];
        for (int num = 10, i = 0, j = 0; i < 20 || j < 20; num++){
            if (prime(num) && prime(reverse(num))){
                if (num == reverse(num) && i < 20){
                    palindromic[i] = num;
                    i++;
                }
                else if (num != reverse(num) && j < 20){
                    emirp[j] = num;
                    j++;
                }
            }
        }

        System.out.println("Palindromic Prime Number: ");
        for (int i = 0; i < 20; i++){
            System.out.print(palindromic[i] + " ");
        }

        System.out.println("\nEmirp Prime Number: ");
        for (int i = 0; i < 20; i++){
            System.out.print(emirp[i] + " ");
        }


    }

    public static boolean prime(int num){
        if (num % 2 == 0 || num % 3 == 0){
            return false;
        }
        else{
            for (int i = 5; (i*i) <= num; i += 6){
                if (num % i == 0 || num % (i + 2) == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int reverse(int num){
        int reversenum = 0;
        while (num != 0){
            reversenum = reversenum*10 + (num % 10);
            num /= 10;
        }
        return reversenum;
    }
}
