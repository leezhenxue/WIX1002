package L8Q1;

public class Tester {
    public static void main(String[] args) {
        Number a = new Number(); // generate 10 random integers within 0 to 100. 
        a.Even();
        a.Prime();
        a.Max();
        a.Min();
        a.Average();
        a.Square();
        
        Number b = new Number(5); // generate 5 random integers within 0 to 100. 
        b.Even();
        b.Prime();
        b.Max();
        b.Min();
        b.Average();
        b.Square();

        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.
        c.Even();
        c.Prime();
        c.Max();
        c.Min();
        c.Average();
        c.Square();
    }
}

