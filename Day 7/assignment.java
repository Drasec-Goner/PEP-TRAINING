import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class assignment {
    public static void main(String[] args) {
        String filePath = "google_stock_price.csv";
        List<Double> stockPrices = new ArrayList<>();
        
        // Read data from CSV file
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            stockPrices = lines.skip(1) // Skipping header
                              .map(line -> Double.parseDouble(line.split(",")[1])) // Assuming prices are in the second column
                              .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        
        // Processing stock data
        long count = stockPrices.size();
        double max = stockPrices.stream().max(Double::compare).orElse(0.0);
        double min = stockPrices.stream().min(Double::compare).orElse(0.0);
        double sum = stockPrices.stream().mapToDouble(Double::doubleValue).sum();
        double mean = count > 0 ? sum / count : 0.0;
        double median = getMedian(stockPrices);
        
        // Categorization
        long excellent = stockPrices.stream().filter(price -> price > 500).count();
        long satisfactory = stockPrices.stream().filter(price -> price >= 220 && price <= 500).count();
        long ok = stockPrices.stream().filter(price -> price < 220).count();
        
        // Display results
        System.out.println("Count of Records: " + count);
        System.out.println("Highest Stock Value: " + max);
        System.out.println("Lowest Stock Value: " + min);
        System.out.println("Sum of All Stocks: " + sum);
        System.out.println("Mean Stock Value: " + mean);
        System.out.println("Median Stock Value: " + median);
        System.out.println("Excellent Stocks (>500): " + excellent);
        System.out.println("Satisfactory Stocks (220-500): " + satisfactory);
        System.out.println("OK Stocks (<220): " + ok);
    }
    
    private static double getMedian(List<Double> list) {
        List<Double> sorted = list.stream().sorted().collect(Collectors.toList());
        int size = sorted.size();
        if (size == 0) return 0.0;
        return size % 2 == 0 ? (sorted.get(size / 2 - 1) + sorted.get(size / 2)) / 2.0 : sorted.get(size / 2);
    }
}
