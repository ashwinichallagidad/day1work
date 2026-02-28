class Account
{
    String accountholder;
    double balance;

    Account(String name,double bal)
    {
        accountholder=name;
        balance=bal;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited:"+amount);
    }
    void withdraw(double amount)
    {
        if (amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Withdrawn:"+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void display()
    {
        System.out.println("Account Holder:"+accountholder);
        System.out.println("Current Balance:"+balance);
    }

}
public class BankAccount{
public static void main(String[]args)
{
    Account obj=new Account("Ashwini",5000);
    obj.display();
    obj.deposit(2000);
    obj.withdraw(3000);
    obj.display();
}
}
