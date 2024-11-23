import java.util.Scanner;

public class Rectangle extends Shape{
    Scanner input = new Scanner (System.in);
    double length;
    double height;


    public Rectangle(){
        super("Rectangle");
    }

    public void input(){
        System.out.print("Length: ");
        length = input.nextDouble();
        System.out.print("Height: ");
        height = input.nextDouble();
    }

    public void calc(){
        setPerimeter((length + height) * 2);
        setArea(length * height);
    }
}
