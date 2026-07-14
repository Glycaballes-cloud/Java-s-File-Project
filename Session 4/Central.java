import java.util.Scanner;

public class Central {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------Welcome to the Bank Registration----------");

        System.out.print("Enter Account Number: ");
        String accNum = scan.nextLine();

        System.out.print("Enter Account Holder: ");
        String accHolder = scan.nextLine();

        // Creating the bank account object
        BankAccount account = new BankAccount(accNum, accHolder);
        System.out.println("\nAccount successfully created for " + account.getAccountHolder() + "!");
        System.out.println(); 

        int choice;
        
        // Loop keeps running until the user selects 4 (Exit)
        do {
            System.out.println("----------Banking Operations----------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. Current balance: $" + account.getBalance());
                    System.out.println(); 
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Current balance: $" + account.getBalance());
                    System.out.println();
                    break;
                case 3:
                    account.displayBalance();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking services!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        } while (choice != 4);

        scan.close(); 
    }
}