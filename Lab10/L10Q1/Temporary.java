public class Temporary extends Employee {
    private double hour;

    @Override
    public void employee(String name, double hour){
        this.type = "Temporary";
        this.name = name;
        this.hour = hour;
        salary = hour * 15;
    }

    @Override
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Salary: " + salary + "\n");
    }



}
