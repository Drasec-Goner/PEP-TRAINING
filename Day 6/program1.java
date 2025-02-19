import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class program1 {
     public static void main(String[] args) {
        
        //Create a 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream().map(element -> element * element).collect(Collectors.toList());

        // .stream() is converting array into Stream
        // .map() is an intermediate operation that processes each element in the stream calculating the square of each element
        // .collect() is a terminal operation that collects the results into a collection and coverting into List

        System.out.println(squares);

        // Here is an Example of Filter Intermidiate Operation

        List<Integer> newnumbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = newnumbers.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());

        System.out.println(evenNumbers);
     }
}
