
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

//6th step
public class Bank implements Serializable {

    //TO add array of customers
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    void addCustomer(Customer customer) {
        //if account exists for a number
        if (accountExists(customer.getAccount().getAccountNumber())) {
            customer.getAccount().setAccountNumber(findvalidAccountNumer());
        } 
        customers.add(customer);
    }

    private int findvalidAccountNumer() {
        int accountNumber = 0;

        do {
            accountNumber = Account.getNextAccountNumber();
        } while (accountExists(accountNumber));

        return accountNumber;

    }

    private boolean accountExists(int accountNUmber) {       //check if acct exists
        for (Customer c : customers) {
            if (c.getAccount().getAccountNumber() == accountNUmber) {
                return true;
            }

        }
        return false;

    }

    //return a customer 
    Customer getCustomer(int account) {
        return customers.get(account);
    }

    //making the array list to be returnable
    ArrayList<Customer> getCustomers() {
        return customers;

    }

    Customer getCustomerByAccountNumber(int accountNumber) {
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getAccount().getAccountNumber() == accountNumber) {
                customer = c;
                break;
            }

        }
        return customer;
    }

    void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.FLOOR);
        return bd.doubleValue();
    }

}
