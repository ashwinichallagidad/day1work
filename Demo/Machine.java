class ATM {
    private double balance;
    ATM(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Machine {
    public static void main(String[] args) {
        ATM atm = new ATM(1000.0);  
        atm.checkBalance();
        atm.withdraw(500.0);   
        atm.checkBalance();
        atm.withdraw(600.0);   
        atm.deposit(300.0);    
        atm.checkBalance();
    }
}
