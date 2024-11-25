public class Tester {
    public static void main(String[] args) {
        Permanent worker1 = new Permanent();
        Contract worker2 = new Contract();
        Temporary worker3 = new Temporary();

        worker1.employee("Lee", 10000);
        worker2.employee("Ali", 20000);
        worker3.employee("Abu", 15426);

        worker1.Display();
        worker2.Display();
        worker3.Display();


    }
}
