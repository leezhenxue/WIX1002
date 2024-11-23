public class Tester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.calc();
        rectangle.Display();
        

        Square square = new Square();
        square.input();
        square.calc();
        square.Display();

        Circle circle = new Circle();
        circle.input();
        circle.calc();
        circle.Display();
    }
}
