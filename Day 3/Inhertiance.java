class Father {
    public  Father(){
        System.out.println("Constructor of Base");
    }

    public Father(String msg) {
        System.out.println(msg);
    }

    void FoodHabit() {
        System.out.println("I Like Salty!!");
    }
}

class Son extends Father {
    public Son() {
        super("Calling Parameterised Base Constructor");
        System.out.println("Constructor of Derived");
    }
}

public class Inhertiance {
    
    public static void main(String[] args) {
        Son dheeraj = new Son();
        dheeraj.FoodHabit();
    }
}
