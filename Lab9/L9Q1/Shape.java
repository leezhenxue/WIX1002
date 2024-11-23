public class Shape {
    double perimeter;
    double area;
    String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public double getArea(){
        return area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }
    
    public void setArea(double area){
        this.area = area;
    }

    public void Display(){
        System.out.println("The shape is " + name);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }
}
