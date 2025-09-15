package encapsulation;

public class BankAccountService {
    private BankAccount accountOne;
    private BankAccount accountTwo;

    public void createAccounts() {
        accountOne = new BankAccount(101, "Alice", 1000.0);
        accountTwo = new BankAccount(102, "Bob", 2000.0);
    }

    public void displayAccountDetails() {
        System.out.println(accountOne);
        System.out.println(accountTwo);
    }
}
