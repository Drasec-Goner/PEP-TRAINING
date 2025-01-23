
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        //LinkedList is a subset of List interface
        //This time we will expereince Generic collection

        ArrayList<Integer> myList = new ArrayList<Integer>();
        LinkedList<Integer> priceList = new LinkedList<Integer>();

        priceList.add(101);
        priceList.add(102);
        priceList.add(103);
        priceList.add(104);
        priceList.add(105);

        // pricelist.add("hello"); //This will give error as we have defined the type of collection as Integer

        System.out.println("Total Elements: " + priceList.size());

        // get element
        System.out.println(priceList.get(1));

        priceList.remove(2);

        System.out.println("After removal-----------");

        //Iterate through elements

        for(Integer i: priceList) {
            System.out.println(i);
        }

        System.out.println("Using Iterator-----------");
        //using Iterator to Iterate through elements
        Iterator<Integer> itr = priceList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //List is an Interface and ArrayList is a class that implements List Interface

    }
}
