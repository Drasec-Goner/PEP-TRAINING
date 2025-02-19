import java.util.*;
import java.util.stream.*;

public class program {
    public static void main(String[] args) {
        
        // Let us Create a Simple Array
        List<String> names = Arrays.asList("John", "Sam", "Tom", "Harry", "Jerry");

        // use stream() function to create a Stream
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        //Creating a Stream from an Array
        
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};
        Stream<String> arrayStream = Arrays.stream(fruits);
        arrayStream.forEach(System.out::println);
    }
}
