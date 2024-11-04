import java.util.Scanner;
public class L4Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            int year, day, num = 0;

            System.out.print("Enter the year: ");
            year = input.nextInt();
            System.out.print("Enter the first day of the year: ");
            day = input.nextInt();

            if (year % 4 == 0){
                day += 2;
            }
            else {
                day += 1;
            }

            if(day > 6){
                day -= 7;
            }
            

            //May
            System.out.println("\n Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < day; i++){
                System.out.print("    ");
            }

            for (num = 1; num <= 31; num++){
                System.out.printf("%4d", num);
                if ((num + day) % 7 == 0){
                    System.out.println();
                }
            }

            //June
            day += 3;
            if (day > 6){
                day -= 7;
            }
        
            System.out.println("\n Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < day; i++){
                System.out.print("    ");
            }

            for (num = 1; num <= 30; num++){
                System.out.printf("%4d", num);
                if ((num + day) % 7 == 0){
                    System.out.println();
                }
            }
            /*System.out.println();

            while(num <= 23){
                for (int i = 0; i < 7; i++){
                    num ++;
                    System.out.printf("%4d", num);
                }
                System.out.println();
            }

            day = 31 - num;

            for (int i = num; i < 31; i++){
                num ++;
                System.out.printf("%4d", num);
            }

            System.out.println();

            //June
            System.out.println("\n Sun Mon Tue Wed Thu Fri Sat");
            for (int i = 0; i < day; i++){
                System.out.print("    ");
            }
            
            num = 0;

            for (int i = 0; i < (7 - day); i++){
                num += 1;
                System.out.printf("%4d", num);
            }
            System.out.println();

            while(num <= 22){
                for (int i = 0; i < 7; i++){
                    num ++;
                    System.out.printf("%4d", num);
                }
                System.out.println();
            }

            for (int i = num; i < 30; i++){
                num ++;
                System.out.printf("%4d", num);
            }*/



    }
}
