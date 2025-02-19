import java.io.FileWriter;
public class program2 {
    public static void main(String[] args) {
        String data = "This is the Data that we wish to write into the file";
        try {
            FileWriter file = new FileWriter("Day 7/output.txt");
            file.write(data);
            file.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace(); 
        }
    }
}
