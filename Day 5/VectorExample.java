import java.util.*;

public class VectorExample {
    Vector<String> vecOBJ = new Vector<String>();

    void vectorDemo()
    {
        vecOBJ.add("Python");
        vecOBJ.add("Java");
        vecOBJ.add("CSharp");
        vecOBJ.add("Kotlin");
        vecOBJ.add("Ruby");

        Iterator<String> itr = vecOBJ.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        new VectorExample().vectorDemo();
    }
}
