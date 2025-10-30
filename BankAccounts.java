abstract class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.05; 

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("💰 Savings Account Interest: ₹" + interest);
    }
}

class CurrentAccount extends Account {
    double serviceCharge = 500; 

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("⚠️ Current Account has no interest.");
        System.out.println("Service charge applied: ₹" + serviceCharge);
        balance -= serviceCharge;
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Prerana", 50000);
        Account acc2 = new CurrentAccount("Ravi", 80000);

        System.out.println("---- Savings Account ----");
        acc1.displayBalance();
        acc1.calculateInterest();  

        System.out.println("\n---- Current Account ----");
        acc2.displayBalance();
        acc2.calculateInterest();  
        acc2.displayBalance();
    }
}


