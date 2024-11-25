public class Contract extends Employee {
    private double sales;

    @Override
    public void employee(String name, double sales){
        this.type = "Contract";
        this.name = name;
        this.sales = sales;
        salary = 500 + sales * 0.5;
    }

    @Override
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Salary: " + salary + "\n");
    }

}
