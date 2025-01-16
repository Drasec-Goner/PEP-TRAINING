import java.util.*;
public class activity2 {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your Basic Pay: ");
        double basic = sc.nextDouble();
        double HRA=0.0, DA=0.0;
        if(basic>=5000)
        {
            HRA = 0.12*basic;
            DA = 0.14*basic;
        }
        else
        {
            HRA = 0.16*basic;
            DA = 0.18*basic;
        }
        double gross = basic+DA+HRA;
        System.out.println("The gross amount is: "+gross);
    }
}
