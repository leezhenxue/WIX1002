public abstract class Employee {
    String name;
    String type;
    double salary;

    abstract void employee(String name, double salary);

    void Display(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Salary: " + salary);
    }
}
