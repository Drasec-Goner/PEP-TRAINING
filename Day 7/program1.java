import java.io.*;


public class program1 {
    public static void main(String[] args) {
        
        File myfile = new File("Day 7/testfile.txt");
        try{
            boolean value = myfile.createNewFile();

            if(value) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        }
        catch(Exception e) {
            System.out.println("Exception Detected: " + e.getMessage());
        }
    }
}
