package Lectures.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Branch currentBranch = new Branch();
    private static Customer currentCustomer;
    private static ArrayList<Branch> branches = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    private static String ls = System.lineSeparator();


    public void menu() {
        boolean running = true;

        while (running) {
            System.out.println("What would you like to do?"+ls+
                    "1.New Customer"+ls+
                    "2.Existing Customer"+ls+
                    "3.Branch Information"+ls+
                    "4.Exit");
            int choice  = (int) getInput(1,5);
            switch (choice) {
                case 1 -> {
                    System.out.println("Please enter your name: ");
                    String name = getInput();
                    System.out.println("Please enter an initial deposit: ");
                    double deposit = getInput(0,Double.MAX_EXPONENT);
                    newCustomer(name, deposit);
                    System.out.println(currentCustomer.toString());
                }
                case 2 -> {
                    System.out.println("Please enter your name: ");
                    String name = getInput();
                    currentCustomer = currentBranch.getCustomer(name);
                    if (currentCustomer.noAccount())
                        System.out.println("Sorry, no account with the name: "+name);
                    else {
                        System.out.println("Hello " + name);
                        System.out.println("What would you like to do?"+ls+
                                "1.Deposit"+ls+
                                "2.Withdraw"+ls+
                                "3.Transaction History"+ls+
                                "4.Exit");
                        choice = (int) getInput(1, 4);
                        switch (choice) {
                            case 1 -> {
                                System.out.println("Input deposit amount: ");
                                double deposit = getInput(0, Double.MAX_EXPONENT);
                                currentCustomer.newBalance(deposit);
                                System.out.println(currentCustomer.toString());
                            }
                            case 2 -> {
                                System.out.println("Input withdraw amount: ");
                                double withdraw = getInput(0, Double.MAX_EXPONENT);
                                if (currentCustomer.getBalance() - withdraw == 0)
                                    System.out.println("Sorry, insufficient funds.");
                                else {
                                    currentCustomer.newBalance(-withdraw);
                                    System.out.println(currentCustomer.toString());
                                }
                            }
                            case 3 -> System.out.println(currentCustomer.toString());
                            case 4 -> running = false;
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Please input branch ID: ");
                    int ID = (int) getInput(0,Integer.MAX_VALUE);
                    if (getBranchByID(ID) != null)
                        System.out.println(getBranchByID(ID).toString());
                    else
                        System.out.println("Sorry, no branch with ID: "+ID);
                }
                case 4 -> running = false;
            }
        }
    }

    public void newCustomer(String name, double deposit) {
        Customer newCustomer = new Customer(name, deposit);
        if (checkForCustomer(newCustomer.getName()))
            return;
        if (currentBranch.maxCustomers()) {
            currentBranch = new Branch();
            addBranch(currentBranch);
        }
        addCustomer(currentBranch, newCustomer);
        currentCustomer = newCustomer;
    }

    private Branch getBranchByID(int ID) {
        for (Branch b:branches) {
            if (b.getBranchID() == ID)
                return b;
        }
        return null;
    }

    private void addCustomer(Branch b, Customer c) {
        if (!b.addCustomer(c))
            System.out.println("Customer already has an account.");
    }

    private void addBranch(Branch b) { branches.add(b); }

    private boolean checkForCustomer(String name) {
        for (Branch b:branches)
           return b.checkForCustomer(name);
        return false;
    }

    private static boolean validChoice(double choice, int rangeFrom, int rangeTo) {
        if (choice >= rangeFrom && choice <= rangeTo)
            return true;
        System.out.println("Sorry, that's an invalid entry.");
        return false;
    }
    private static double getInput(int rangeFrom, int rangeTo) {
        double choice;
        while (true) {
            if (scanner.hasNextDouble()) {
                choice = scanner.nextDouble();
                if (validChoice(choice, rangeFrom, rangeTo)) {
                    return choice;
                }
            }
            else
                scanner.next();
        }
    }
    private static String getInput() {
        String input;
        do {
            input = scanner.nextLine();
        } while (input.isBlank() || input.isEmpty());
        return input;
    }
}
