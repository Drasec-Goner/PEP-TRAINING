public class Program3 {
    int counter=0;
    // static int counter=0; // This will be shared among all objects

    void increment()
    {
        counter++;
    }

    void display()
    {
        System.out.println("Counter: "+counter);
    }

    public static void main(String[] args) {
        Program3 p1 = new Program3();
        Program3 p2 = new Program3();
        p1.increment();

        p2.display();
    }
}
