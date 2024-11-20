package L8Q4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    private int gcd;

    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;

    }

    public void input(){
        Scanner input = new Scanner (System.in);
        System.out.print("Numerator: ");
        this.numerator = input.nextInt();
        System.out.print("Denominator: ");
        this.denominator = input.nextInt();
    }

    public void mutator(int numerator, int denominator){
        this.numerator = numerator;
        if (denominator != 0){
            this.denominator = denominator;
        }
        else {
            System.out.println("The denominator cannot be 0");
        }
    }

    public int getNumerator(int numerator){
        return this.numerator;
    }

    public int getDenominator(int denominator){
        return this.denominator;
    }

    public void lowestTerm(){
        if (this.numerator > this.denominator){
            gcd = this.denominator;
        }
        else {
            gcd = this.numerator;
        }
    
        for (int i = numerator; i > 0; i--){
            if (this.numerator % gcd == 0 && this.denominator % gcd == 0){
                break;
            }
        }
    
        this.numerator /= gcd;
        this.denominator /= gcd;

        System.out.println("Lowest Terms: " + this.numerator + " / " + this.denominator);
    }

    
}
