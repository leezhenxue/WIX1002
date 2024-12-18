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

class Tester {
    public static void main(String[] args) {
        Burger stall1 = new Burger(78745);
        Burger stall2 = new Burger(798465);
        Burger stall3 = new Burger(785623);

        stall1.Sold(1000);
        stall2.Sold(2000);
        stall3.Sold(7800);

        stall1.Display();
        stall2.Display();
        stall3.Display();
        stall1.DisplayTotal();
        

    }
}

