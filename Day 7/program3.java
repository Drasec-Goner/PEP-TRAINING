import java.io.BufferedReader;
import java.io.FileReader;

public class program3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Day 7/file.txt");
            
            // create the object of Buffered Reader
            BufferedReader br = new BufferedReader(fr);

            //creat a loop that reads the file line by line

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println("File Content: "+line);
            }   

            //close the file connection
            br.close();
            fr.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}