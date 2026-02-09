package corejava.oops.inheritences.hierarchical;

public class BankAccount {
    
    private long accountNumber;
    private String accountName;

    public BankAccount(long accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }

    public void accountDetails(){
        System.out.println("AccountName : " + accountName + " and "+"AccountNumber : " + accountNumber);
    }
}
