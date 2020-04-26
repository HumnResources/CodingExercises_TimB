package Lectures.ArrayLists;

import java.util.ArrayList;

public class Branch {

    private int branchID = 0;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch() {
        this.branchID += 1;
    }

    public int getBranchID() {
        return branchID;
    }

    public boolean maxCustomers() {
        return customers.size() == 10;
    }

    public boolean addCustomer(Customer c) {
        if (hasAccount(c.getName()))
            return false;
        add(c);
        return true;
    }

    public Customer getCustomer(String name) {
        if (customers.isEmpty())
            return new Customer("", 0);

            for (Customer c : customers) {
                if (c.getName().equalsIgnoreCase(name))
                    return c;
            }
        return new Customer("", 0);
    }

    public boolean checkForCustomer(String name) { return hasAccount(name); }

    private void add(Customer c) { customers.add(c); }

    private boolean hasAccount(String name) {
        for (Customer customer:customers) {
            if (customer.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }


    @Override
    public String toString() {
        String branchInfo = Integer.toString(branchID) + System.lineSeparator();
        for (Customer c:customers) {
            branchInfo = branchInfo.concat(c.getName()).concat(System.lineSeparator());
        }
        return branchInfo;
    }
}
