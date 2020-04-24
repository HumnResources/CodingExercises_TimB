package Lectures.ArrayLists;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String model;
    private ArrayList<Contact> contacts = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);
    private String newLine = System.lineSeparator();
    public MobilePhone(String model) {
        this.model = model;
    }


    public void powerOn() {
        boolean running = true;

        while (running) {
            System.out.printf("%sMenu%s1.Add New Contact%s2.Modify Existing Contact%s3.Delete Contact%s4.Show All Contacts%s5.Search Contacts%s6.Exit%sWhat would you like to do? : ",
                    newLine,newLine,newLine,newLine,newLine,newLine,newLine,newLine);
            int choice = getInput(1,6);
                switch (choice) {
                    case 1 -> {
                        System.out.format("%sPlease enter name: ", newLine);
                        String name = getInput();
                        System.out.format("%sPlease enter number: ", newLine);
                        String number = getInput();
                        addContact(name, number);
                        showContact(name);
                    }
                    case 2 -> {
                        System.out.format("%sPlease enter existing contact name: ", newLine);
                        String name = getInput();
                        System.out.format("%s1.Change Name and Number%s2.Change Number%s",newLine, newLine, newLine);
                        choice = getInput(1,2);
                        switch (choice) {
                            case 1 -> {
                                System.out.format("%sPlease enter new name: ", newLine);
                                String newName = getInput();
                                System.out.printf("%sPlease enter new number: ", newLine);
                                String newNumber = getInput();
                                modifyContact(name, newName, newNumber);
                                showContact(name);
                            }
                            case 2 -> {
                                System.out.format("%sPlease enter new number: ", newLine);
                                String newNumber = getInput();
                                modifyContact(name, newNumber);
                                showContact(name);
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("Please enter the contact to delete: ");
                        String name = getInput();
                        removeContact(name);
                    }
                    case 4 -> {
                        printContactList();
                    }
                    case 5 -> {
                        System.out.print("Please enter contact name: ");
                        String name = getInput();
                        showContact(name);
                    }
                    case 6 -> running = false;
                }
        }
    }


    public void printContactList() {
        System.out.println(newLine+"Contacts: ");
        for (Contact c:contacts) {
            System.out.println(c);
        }
    }

    public void showContact(String name) {
        String contactInfo = "Contact \""+name+"\" doesn't exist.";
        if (contactExists(name))
            contactInfo = contactInfo(name);
        System.out.println(contactInfo);
    }

    public void addContact(String name, String number) {
        createContact(name, number);
    }

    public void removeContact(String name) {
        if (contactExists(name))
            deleteContact(name);
        else
            System.out.println("No contact of name: " + name);
    }

    public void modifyContact(String name, String nameTo, String numberTo) {
        if (contactExists(name)) {
            Contact newContact = new Contact(nameTo, numberTo);
            updateContact(name, newContact);
        }
    }

    public void modifyContact(String name, String numberTo) {
        modifyContact(name, "", numberTo);
    }


    private String contactInfo(String name) {
        return contacts.get(index(name)).toString();
    }

    private void updateContact(String name, Contact newContact) {
        if (!newContact.getNumber().isEmpty())
            contacts.get(index(name)).setNumber(newContact.getNumber());
        if (!newContact.getName().isEmpty())
            contacts.get(index(name)).setName(newContact.getName());
    }

    private void createContact(String name, String number) {
        contacts.add(new Contact(name, number));
    }

    private void deleteContact(String name) {
        contacts.remove(index(name));
    }

    private boolean contactExists(String name) {
        return index(name) >= 0;
    }

    private int index(String name) {
        for (Contact c:contacts) {
            if (c.getName().equalsIgnoreCase(name))
                return contacts.indexOf(c);
        }
        return -1;
    }



    private static boolean validChoice(int choice, int rangeFrom, int rangeTo) {
        if (choice >= rangeFrom && choice <= rangeTo)
            return true;
        System.out.println("Sorry, that's an invalid entry.");
        return false;
    }
    private static int getInput(int rangeFrom, int rangeTo) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
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
