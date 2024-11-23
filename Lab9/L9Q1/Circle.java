import java.util.Scanner;

public class Circle extends Shape{
    Scanner input = new Scanner (System.in);
    double diameter;

    public Circle(){
        super("Circle");
    }

    public void input(){
        System.out.print("Diameter: ");
        diameter = input.nextDouble();
    }

    public void calc(){
        setPerimeter(Math.PI * diameter);
        setArea(Math.PI * (diameter / 2) * (diameter / 2));
    }
}
