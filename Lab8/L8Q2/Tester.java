package L8Q2;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name; 
        int id;
        double amount;
        int action;

        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("IC or Passport Number: ");
        id = input.nextInt();
        System.out.print("Deposit Amount: ");
        amount = input.nextDouble();

        BankAccount user = new BankAccount(name, id, amount);

        user.currentBalance();

        while (true){
            System.out.println("1 Deposit\n" +
                               "2 Withdraw\n" +
                               "3 Quit");
            action = input.nextInt();
            if (action == 1){
                System.out.print("Amount: ");
                amount = input.nextDouble();
                user.deposit(amount);
                user.currentBalance();
            }
            else if (action == 2){
                System.out.print("Amount: ");
                amount = input.nextDouble();
                user.withdraws(amount);
                user.currentBalance();
            }
            else if (action == 3){
                user.currentBalance();
                break;
            }
        }
        input.close();
    }
}
