public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        }else{
            System.out.println("Invalid deposit amount! ");
        }
    }

    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Invalid withdrawal amount!");
        }else if ( amount <= balance){
           balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
        }else{
            System.out.println("Transaction declined : Insufficient funds to withdraw");
        }
    }
    public void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
}

