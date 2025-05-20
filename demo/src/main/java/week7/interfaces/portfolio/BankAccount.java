package week7.interfaces.portfolio;

public class BankAccount implements Valuable {
    private String name;
    private String accountNr;
    private double balance;

    public BankAccount(String name, String accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }



    @Override
    public double getValue() {
        return balance;
    }
}
