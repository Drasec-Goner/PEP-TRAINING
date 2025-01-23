import java.util.*;

class Doctor
{
    void Treat() {System.out.println("I Treat Patients");}
}
class Physician extends Doctor
{
    void Treat() {System.out.println("I Treat with Medicine");}
}
class Surgeon extends Doctor
{
    void Treat() {System.out.println("I Treat with Surgery");}
}
class Dentist extends Doctor
{
    void Treat() {System.out.println("I Treat Dental Patients");}
}

public class functionOverriding {
    public static void main(String[] args) {
        Doctor doc;
        System.out.println("1. Physician\n2. Surgeon\n3. Dentist");
        int choice = new java.util.Scanner(System.in).nextInt();
        switch(choice) {
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            case 3:
                doc = new Dentist();
                break;
            default:
                doc = new Doctor();
        }
        doc.Treat();
    }
}
