
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList groceryList = new ArrayList();

        groceryList.add("Milk");
        groceryList.add("Rusk");
        groceryList.add("Butter");
        groceryList.add("1100");
        groceryList.add("23.44");

        System.out.println("Grocery List: " + groceryList);

        System.out.println(groceryList.get(1));

        System.out.println("Total Elements: " + groceryList.size());

        groceryList.remove(2);
        System.out.println("Grocery List: " + groceryList);

        for(int i=0; i<groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }

        for(Object obj: groceryList) {
            System.out.println(obj);
        }
    }
}
