class BankAccount {
    int balance;
    public BankAccount(int intiialBalance) {
        balance = intiialBalance;
    }

    public void increaseBalance(int amount) {
        balance += amount;
    }

    public void setBalance(int amount) {
        balance = amount;
    }

    public static void modifyBalance(BankAccount account) {
        account.increaseBalance(500);
    }
    
    public static void changeBalance(int balance) 
    {
        balance=200;
    }
}

public class Program4 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);

        System.out.println("Original Balance: " + myAccount.balance);
        BankAccount.modifyBalance(myAccount);
        System.out.println("Balance after modification: " + myAccount.balance);

        System.out.println("Original Balance: " + myAccount.balance);
        BankAccount.changeBalance(myAccount.balance);
        System.out.println("Balance after modification: " + myAccount.balance);
    }
}