package encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.createAccounts();
        bankAccountService.displayAccountDetails();
    }
}
