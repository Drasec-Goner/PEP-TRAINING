import java.util.Scanner;

public class practice1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int k=n;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}