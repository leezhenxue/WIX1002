import java.util.Scanner;
public class L4Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            int year, day, daytomay;

            System.out.println("Enter the year: ");
            year = input.nextInt();
            System.out.println("Enter the first day of the year: ");
            day = input.nextInt();

            if (year % 4 == 0){
                daytomay = 2;
            }
            else {
                daytomay = 1;
            }

            day += daytomay;

            if(day > 6){
                day -= 7;
            }
            
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            System.out.print("  ");
            for (int i = 0; i < day; i++){
                System.out.print("    ");
            }

            for (int i = 0; i < (7 - day); i++){
                System.out.print((i+1) + "   ");
            }
            for (int i)




    }
}
