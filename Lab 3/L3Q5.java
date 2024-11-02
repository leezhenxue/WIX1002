import java.util.Scanner;
public class L3Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double a, b, c, d, e, f, x, y;
        
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("b: ");
        b = input.nextDouble();
        System.out.print("c: ");
        c = input.nextDouble();
        System.out.print("d: ");
        d = input.nextDouble();
        System.out.print("e: ");
        e = input.nextDouble();
        System.out.print("f: ");
        f = input.nextDouble();
        
        if (a*d - b*c == 0){
            System.out.println("The eqution has no solution");
            System.exit(0);
        }
                    
        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
    }
}