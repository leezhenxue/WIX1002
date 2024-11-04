import java.util.Random;
public class L4Q8 {
    public static void main (String[] args){
        Random input = new Random();
        int n = input.nextInt(101);
        System.out.printf("Print first %d prime number\n", n);
        int primenum = 2;
        int primecount = 1; 
        while(primecount <= n){
            if (primenum == 2){
                System.out.printf("Prime number %d is %d\n", primecount, primenum);
                primecount++;
                primenum++;
            }
            else if (primenum == 3){
                System.out.printf("Prime number %d is %d\n", primecount, primenum);
                primecount++;
                primenum++;
            }
            else if (primenum % 2 == 0){
                primenum++;
            }
            else if (primenum % 3 == 0){
                primenum++;
            }
            else {
                int i = 5;
                while (primenum >= (i*i)){
                    if (primenum % i == 0 || primenum % (i + 2) == 0){
                        primenum++;
                        break;
                    }
                    else {
                        i += 6;
                    }
                }

                if (primenum < (i*i)){
                    System.out.printf("Prime number %d is %d\n", primecount, primenum);
                    primecount++;
                    primenum++;
                }
            }
            
        }  
    }
}
