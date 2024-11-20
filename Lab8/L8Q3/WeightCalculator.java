package L8Q3;

public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator(int age, double height){
        double rweight = (height - 100 + age) * 0.9;
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended weight: " + rweight);
    }

}
