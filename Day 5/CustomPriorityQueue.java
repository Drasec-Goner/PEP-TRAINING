import java.util.*;

public class CustomPriorityQueue {

    PriorityQueue<String> queue = new PriorityQueue<String>();

    void queueDemo()
    {
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        queue.add("Task 4");
        queue.add("Task 5");

        System.out.println("Head: "+queue.element());
        System.out.println("Head: "+queue.peek());
        System.out.println("Head: "+queue.poll());


        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // iterating 
    }

    public static void main(String[] args) {
        new CustomPriorityQueue().queueDemo();
    }

}
