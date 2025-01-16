import java.util.*;

public class practice2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username: ");
        String userName = sc.nextLine();

        // OPTIMAL WAY //

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        if(userName.matches(regex))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Invalid");
        }

        // BRUTEFORCE WAY //


        // int len = userName.length();
        // int flag=0;
        // if(len>=8 && len<=30)
        // {
        //     char fName = userName.charAt(0);
        //     if(!Character.isLetter(fName))
        //     {
        //         System.out.println("First character is not an alphabet");
        //     }
        //     else
        //     {
        //         for(int i=0;i<len;i++)
        //         {
        //             char ch = userName.charAt(i);
        //             if(Character.isDigit(ch) || Character.isLetter(ch) || ch=='_')
        //             {
        //                 continue;
        //             }
        //             else
        //             {
        //                 System.out.println("Invalid character present");
        //                 flag=1;
        //                 break;
        //             }

        //         }
        //         if(flag==0)
        //             System.out.println("Your username is good to go");
        //     }
        // }
        // else
        // {
        //     System.out.println("Invalid Length");
        // }
        
    }
}