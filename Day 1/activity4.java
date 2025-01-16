import java.util.*;
import java.math.*;
public class activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerChoice = (int)Math.random(1,20);
        int userChoice, i=1;
        System.out.print("Enter a number between 1 and 20: ");
        while(true)
        {
            userChoice = sc.nextInt();

            if(userChoice > computerChoice)
            {
                System.out.println("\nYour guess is too high");
            }
            else if(userChoice < computerChoice)
            {
                System.out.println("\nYour guess is too low");
            }
            else
            {
                System.out.println("\nGotcha! You guessed it right!!");
                break;
            }
            i++;
            if(i>6)
            {
                System.out.println("Ouch! You exhausted all your attempts!");
                break;
            }
            else
            {
                System.out.print("Try again! Input a number between 1 and 20: ");
            }
    }
    }
}
