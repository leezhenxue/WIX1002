package L8Q2;

public class BankAccount {
    private double balance;
    private String name;
    private int id;
        
    public BankAccount(String name, int id, double amount){
        this.name = name;
        this.id = id;
        this.balance = amount; 
    }

    public void deposit(double damount){
        balance += damount;
    }

    public void withdraws(double wamount){
        if (balance >= wamount){
            balance -= wamount;
        }
        else {
            System.out.println("The balance is insufficient");
        }
    }

    public void currentBalance(){
        System.out.println("Current Balance: " + balance + "\n");
    }
}
