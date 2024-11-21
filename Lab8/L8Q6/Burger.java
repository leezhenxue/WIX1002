package L8Q6;

public class Burger {
    private int id;
    private int sold = 0;
    private static int totalsold = 0;

    public Burger(int id){
        this.id = id;
    }

    public void Sold(int sold){
        this.sold += sold;
        totalsold += sold;
    }

    public void Display(){
        System.out.println("Total Burger (id)" + this.id + " Sold: " + this.sold);
    }

    public void DisplayTotal(){
        System.out.println("Total Burger Sold: " + totalsold);
    }
}
