package corejava.oops.inheritences.hierarchical;

public class CurrentAccount extends BankAccount {

    private double balance;
    
    public CurrentAccount(long accountNumber, String accountName, double balance){
        super(accountNumber, accountName);
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void accountDetailsWithBalance(){
        accountDetails();
        System.out.println("Current Account Balance : " + balance);
    }

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(123, "Venkatesh", 55);
        currentAccount.accountDetailsWithBalance();
    }
}
