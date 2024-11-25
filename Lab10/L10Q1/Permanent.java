public class Permanent extends Employee {
    char category = ' ';

    @Override
    public void employee(String name, double salary){
        this.type = "Permanent";
        this.name = name;
        this.salary = salary;
    }
    
    public String Category(){
        return switch (salary) {
            case 4000.0 -> "A";
            case 3000.0 -> "B";
            case 2000.0 -> "C";
            default -> "Invalid Salary";
        };
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Category: " + Category() + "\n");
    }
}

