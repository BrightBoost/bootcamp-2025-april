package week7.interfaces.portfolio;

public class Creditcard implements Valuable{
    private String name;
    private String accountNr;
    private double balance;

    public Creditcard(String name, String accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }



    @Override
    public double getValue() {
        return balance;
    }
}
