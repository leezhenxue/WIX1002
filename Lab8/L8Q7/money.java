package L8Q7;

import java.text.DecimalFormat;

public class money {
    private double amount;

    public money(double amount){
        amount = Math.round(amount * 100) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        this.amount = Double.parseDouble(df.format(amount));
        System.out.println("Amount before rounded: " + amount);
        int lastDigit = (int) ((amount * 100) % 10);
        if (lastDigit < 3) {
            amount -= lastDigit / 100.0;
        } else if (lastDigit <= 7) {
            amount -= (lastDigit - 5) / 100.0;
        } else {
            amount += (10 - lastDigit) / 100.0;
        }
        this.amount = Double.parseDouble(df.format(amount));
        System.out.println("Amount: " + this.amount);
    }

    public void number(){
        int rm100 = 0, rm10 = 0, rm1 = 0, cent20 = 0;
        while (this.amount >= 100) {
            rm100++;
            this.amount -= 100;
        }
        System.out.println(rm100 + " x RM100");
        if (this.amount >= 50) {
            this.amount -= 50;
            System.out.println("1 x RM50");
        }
        else {
            System.out.println("0 x RM50");
        }
        while (this.amount >= 10) {
            rm10++;
            this.amount -= 10;
        }
        System.out.println(rm10 + " x RM10");
        if (this.amount >= 5) {
            this.amount -= 5;
            System.out.println("1 x RM5");
        }
        else {
            System.out.println("0 x RM5");
        }
        while (this.amount >= 1) {
            rm1++;
            this.amount -= 1;
        }
        System.out.println(rm1 + " x RM1");
        if (this.amount >= 0.5) {
            this.amount -= 0.5;
            System.out.println("1 x 50cent");
        } 
        else {
            System.out.println("0 x 50cent");
        }
        while (this.amount >= 0.2) {
            cent20++;
            this.amount -= 1;
        }
        System.out.println(cent20 + " x 20cent");
        if (this.amount >= 0.1) {
            this.amount -= 0.1;
            System.out.println("1 x 10cent");
        } 
        else {
            System.out.println("0 x 10cent");
        }
        if (this.amount >= 0.05) {
            this.amount -= 0.05;
            System.out.println("1 x 5cent");
        } 
        else {
            System.out.println("0 x 5cent");
        }
    } 
}

class Tester {
    public static void main(String[] args) {
        money money1 = new money(9846.478654);

        money1.number();
    }
}
