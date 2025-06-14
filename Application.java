import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance) {
        Account account = new Account(accountNumber, customerName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }

		#feature2 code by ethan for Banking project in oct 2024
		public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding a few accounts
        bank.addAccount("101", "John Doe", 1000.0);
        bank.addAccount("102", "Jane Smith", 1500.0);

        // Performing transactions
        bank.performTransaction("101", 500.0);
        bank.performTransaction("103", 200.0); // This account doesn't exist

        // Displaying account information
        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
}
#end of feature2 code

		#feature1 changes  by Vivek Developer for the Banking Project in oct2024
		public static void main(String[] args) {
      
    int base = 3, powerRaised = 4;
    int result = power(base, powerRaised);

    System.out.println(base + "^" + powerRaised + "=" + result);
  }

  public static int power(int base, int powerRaised) {
    if (powerRaised != 0) {

      // recursive call to power()
      return (base * power(base, powerRaised - 1));
    }
    else {
      return 1;
    }
  }
  #end of feature1 code

    }