
public class Polymorphism {
    
    public void add(int n1, int n2) {System.out.println(n1+n2);}
    public void add(int n1, float n2) {System.out.println(n1+n2);}
    public void add(float n1, int n2) {System.out.println(n1+n2);}
    public void add(int n1, int n2, int n3) {System.out.println(n1+n2+n3);}

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.add(1, 2);
        poly.add(1, 2.0f);
        poly.add(1.0f, 2);
        poly.add(1, 2, 3);
    }
}
