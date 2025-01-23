import java.util.*;
public class SortedSetDemo {
    TreeSet<String> itemSet = new TreeSet<String>();

    void sortedSetDemo()
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
        new SortedSetDemo().sortedSetDemo();
    }
}
