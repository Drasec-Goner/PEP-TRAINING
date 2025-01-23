import java.util.*;
public class LinkedHashSetDemo {
    LinkedHashSet<String> itemSet = new LinkedHashSet<String>();

    void linkedHashSetDemo()
    {
        itemSet.add("orange");
        itemSet.add("orange");
        itemSet.add("apple");
        itemSet.add("orange");
        itemSet.add("apple");
        itemSet.add("apple");
        itemSet.add("orange");
        itemSet.add("kiwi");

        Iterator<String> itr = itemSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        new LinkedHashSetDemo().linkedHashSetDemo();
    }
}
