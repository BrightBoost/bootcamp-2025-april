package week7.interfaces.portfolio;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "234", 1500);
         // try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount)account2).deposit(100);

    Portfolio portfolio = new Portfolio("Zia", "Financial plan");
        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(new Jewelry("Maaike's earring", 100));
        portfolio.add(new Gold("Random gold", 1000));
        portfolio.add(new House("My house", 200000));

        System.out.println(portfolio.getLeastValuable().getValue());
        System.out.println(portfolio.getMostValuable().getValue());
    }
}
