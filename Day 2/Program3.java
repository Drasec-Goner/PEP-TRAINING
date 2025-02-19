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
        program3 p1 = new program3();
        program3 p2 = new program3();
        p1.increment();

        p2.display();
    }
}
