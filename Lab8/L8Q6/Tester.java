package L8Q6;

public class Tester {
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
