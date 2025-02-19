import java.util.*;

public class StackExample
{
    Stack<String> stackOBJ = new Stack<String>();

    void stackDemo()
    {
        stackOBJ.push("Test String 1");
        stackOBJ.push("Test String 2");
        stackOBJ.push("Test String 3");
        stackOBJ.push("Test String 4");
        stackOBJ.push("Test String 5");

        Iterator<String> itr = stackOBJ.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Using pop to extract elements from stack: ");
        while(stackOBJ.size() > 0) {
            System.out.println(stackOBJ.pop() + " Current size "+ stackOBJ.size());
        }
    }

    public static void main(String[] args) {
        new StackExample().stackDemo();
    }
}