public class Encapsulation {
    public static void main(String[] args) {
        Customer timCook = new Customer();

        timCook.sbi.setInterestRate(18);
        double loanAmount = timCook.ApplyLoan(1000);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

class Customer{
    Bank sbi = new Bank();

    double ApplyLoan(double Amount){
        double grossAmount = Amount + (Amount * (sbi.getInterestRate()/100));
        return grossAmount;
    }
}

class Bank{
    private double interestRate;

    public void setInterestRate(double newInterest) {
        if(newInterest<9.8) {
            return;
        }
        this.interestRate = newInterest;
    }
    public double getInterestRate() {
        return interestRate;
    }
}
