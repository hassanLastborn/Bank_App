
import java.io.Serializable;

//5th Step

public class Customer implements Serializable {


    private final String firstName;
    private final String lastName;
    private final String IcNum;
    private final Account account;

    Customer(String firstName, String lastName, String IcNum, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IcNum = IcNum;
        this.account = account; 
    }

    @Override
    public String toString() {
        return "\nCustomer Information\n"
                + "First Name: " + getFirstName() + "\n"
                + "Last Name: " + getLastName() + "\n"
                + "ICNumber: " + getIcNum() + "\n"
                + account;                        //this calls the toString method in account class
    }

    //Prints out short account details on one line
    public String basciInfo() {

        //the account.getAcctNUm() calls the toString method in account class
        return " Account NUmber:" + account.getAccountNumber() + " - Name: " + getFirstName() + " " + getLastName();
    }

    Account getAccount() {
        return account;

    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the IcNum
     */
    public String getIcNum() {
        return IcNum;
    }

}
