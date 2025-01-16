//Write a Java program that accepts weight of user in pounds and print the kilograms
import java.util.*;
public class Activity1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds:");
        double pound = sc.nextDouble();

        double kilo = pound * 0.456;
        
        System.out.println("\nWeight in Kilograms: "+kilo);
    }
}