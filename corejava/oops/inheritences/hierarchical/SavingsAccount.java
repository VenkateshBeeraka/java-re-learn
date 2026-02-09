package corejava.oops.inheritences.hierarchical;

public class SavingsAccount extends BankAccount {

    private double balance;
    
    public SavingsAccount(long accountNumber, String accountName, double balance){
        super(accountNumber, accountName);
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void accountDetailsWithBalance(){
        accountDetails();
        System.out.println("Savings Account Balance : " + balance);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123, "Venkatesh", 500);
        savingsAccount.accountDetailsWithBalance();
    }
}
