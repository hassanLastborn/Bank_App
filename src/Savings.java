//4th Step

public class Savings extends Account {

    private static String accountType = "Savings";

    Savings(double initialDeposit) {
        this.setBalance(initialDeposit);
        this.checkInterest(0);                   //Set interest rate to 5% or 2% 
        this.setTransactionFee(5);

    }

    @Override
    public String toString() {
        return "Account Type " + accountType + "Account\n"
                + "Account Number: " + this.getAccountNumber() + "\n"
                + "Balance " + this.getBalance() + "\n"
                + "Interest Rate: " + (this.getInterest() * 100) + "%\n";
    }

    @Override
    public String getAccountType() {
        return accountType;
    }

}
