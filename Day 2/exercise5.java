class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
    }
    public void calculateMonthlyInterest()
    {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }
    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
    public void showBalance()
    {
        System.out.println("Balance: " + savingsBalance);
    }
}
public class exercise5 {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.showBalance();
        saver2.showBalance();

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.showBalance();
        saver2.showBalance();
    }
}