import java.util.*;
public class activity6 {
    public static void main(String[] args) {
        String scientists = "Issac Newton, Neils Bohr & Rutherford, Robert Brown, George Simon Ohm";

        StringTokenizer st = new StringTokenizer(scientists, ",");

        while(st.hasMoreTokens())
        {
            String token = st.nextToken().trim();
            StringTokenizer tk = new StringTokenizer(token, " ");
            String firstInitial = "."+ tk.nextToken().charAt(0);
            String lastName="";
            while(tk.hasMoreTokens())
            {
                lastName = tk.nextToken();
            }
            System.out.println("Dear Mr. "+lastName+firstInitial);
        }

    }
}
