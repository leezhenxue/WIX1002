import java.util.Scanner;

public class Square extends Shape{
    Scanner input = new Scanner (System.in);
    double length;

    public Square(){
        super("Square");
    }

    public void input(){
        System.out.print("Length: ");
        length = input.nextDouble();
    }

    public void calc(){
        setPerimeter(length* 4);
        setArea(length * length);
    }
}
