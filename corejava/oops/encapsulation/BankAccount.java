package corejava.oops.encapsulation;

// "Encapsulation is a fundamental OOP principle where we hide the internal state of an object and 
// require all interaction to be performed through public methods. 
// We achieve this by making fields private and providing controlled access via public getter/setter methods or custom business methods. 
// This ensures data integrity, maintainability, and loose coupling."
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    //This was added to demonstrate encapsulation, but in real scenarios, you might not want to allow direct setting of balance.
    // public double setBalance(double amount) {
    //     return this.balance = amount;
    // }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    //Note:we can also use @Data but its not recommended as it will generate getter and setter for all the fields, which can lead to security issues if we have sensitive data in our class. 
    //so to achieve encapsulation, we should only provide getter and setter for the fields that we want to expose to the outside world, and keep the rest of the fields private.
    //example: @Getter (Only getter for accountNumber)
            // private String accountNumber;

            // @Getter @Setter(AccessLevel.PRIVATE)  (Public getter, private setter)
            // private String accountHolder;

    // we can achive the immutables using the value object pattern, where we create a class that has only final fields and no setter methods, and we can use the builder pattern to create instances of the class.
}
