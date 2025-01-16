import java.util.*;

public class Activity5 {
    public static void main(String[] args) {
        String marks = "English 50 Science 76 Maths 90";
        StringTokenizer st = new StringTokenizer(marks, " ");
        int sum = 0;
        int count = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
                int mark = Integer.parseInt(token);
                sum += mark;
        }

        double avg = (double)sum/st.countTokens();
        System.out.println("Sum of all marks: " + sum);
        System.out.println("Average: " + avg);
    }
}
