import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise1 {

    public static double Average(int[] grades, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[20];
        int count = 0;
        System.out.println("Enter the grades: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nGrade " + (i + 1) + ": ");
            int grade = sc.nextInt();
            if (grade == -1) {
                break;
            } else {
                grades[i] = grade;
                count++;
            }
        }

        double average = Average(grades, count);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Average: " + df.format(average));
    }
}
