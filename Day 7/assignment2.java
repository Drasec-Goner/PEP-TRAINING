import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class assignment2 {
    public static void main(String[] args) {
        String filePath = "Day 7/pokemon.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Count of RECORDS
        long recordCount = records.size();
        System.out.println("Count of RECORDS: " + recordCount);

        // Count of Unique Pokémon Type
        Set<String> uniqueTypes = records.stream()
                .map(record -> record[1]) // Assuming the type is in the second column
                .collect(Collectors.toSet());
        System.out.println("Count of Unique Pokémon Type: " + uniqueTypes.size());

        // Print all Distinct Pokémon Type
        System.out.println("Distinct Pokémon Types: " + uniqueTypes);

        // Print Pokémon's from Ghost Type Only
        List<String[]> ghostPokemons = records.stream()
                .filter(record -> "Ghost".equals(record[1])) // Assuming the type is in the second column
                .collect(Collectors.toList());
        System.out.println("Pokémon's from Ghost Type:");
        ghostPokemons.forEach(record -> System.out.println(Arrays.toString(record)));

        // Find the Count of Pokémon in Each Pokémon Type Category
        Map<String, Long> typeCounts = records.stream()
                .collect(Collectors.groupingBy(record -> record[1], Collectors.counting()));
        System.out.println("Count of Pokémon in Each Pokémon Type Category:");
        typeCounts.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}
