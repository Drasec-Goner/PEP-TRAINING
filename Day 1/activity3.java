import java.util.*;
public class activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Burp length: ");
        int n = sc.nextInt();
        String letter="Bu";
        for(int i=0;i<n;i++)
        {
            letter+="r";
        }
        letter+="p";
        System.out.println(letter);
    }
}
