package Lectures.LinkedList;

import java.util.*;

public class Demo {

    private static void printList(LinkedList<String> list) {

        Iterator<String> i = list.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting: "+i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        // Sets up iterator, does not point to first entry. Must use .next() etc
        ListIterator<String> i = list.listIterator();

        while (i.hasNext()) {
            int compare = i.next().compareTo(newCity);
            if (compare == 0) {
                // Do not add to list
                System.out.println(newCity+" - Is already added.");
                return false;
            }
            else if (compare > 0) {
                //newCity should be before this one
                //Brisbane -> Adelaide
                //Move back one space and add newCity, previous .next() call moved i forward
                i.previous(); // .previous() allows pointing back to previous entry
                i.add(newCity);
                return true;
            }
            else if (compare < 0) {
                // Move on to next city
                // No processing needed due to previous .next() call
            }
        }
        // Returning value && modifying entry value is frowned upon
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        // ListIterator doesn't allow value access with .previous() and .next(). "Floats in between"
        // Creates the need to track both forward and backward movement through list
        ListIterator<String> i = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
            return;
        }
        System.out.println("Now visiting: " + i.next());
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Vacation is over");
                    quit = true;
                }
                case 1 -> {
                    // If going backward in list, set iterator to next entry
                    if (!forward) {
                        if (i.hasNext())
                            i.next();
                        forward = true;
                    }
                    if (i.hasNext())
                        System.out.println("Now visiting: " + i.next());
                    else {
                        // If no destination next, set forward to false.
                        System.out.println("We are at the last stop.");
                        forward = false;
                    }
                }
                case 2 -> {
                    // If currently going forward in list, set iterator to previous entry
                    if (forward) {
                        if (i.hasPrevious())
                            i.previous();
                        forward = false;
                    }

                    if (i.hasPrevious())
                        System.out.println("Now visiting: " + i.previous());
                    else {
                        // If no previous destination available, set forward to true.
                        System.out.println("We are at the first stop.");
                        forward = true;
                    }
                }
                case 3 -> printMenu();
            }
        }
    }

    private static void printMenu() {
        String ls = System.lineSeparator();
        System.out.println("Available actions:"+ls+
                "0.Exit"+ls+
                "1.Go to next city."+ls+
                "2.Go to previous city"+ls+
                "3.Print menu options");
    }

    public static void partThree() {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    public static void partTwo() {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        placesToVisit.remove(4);

        printList(placesToVisit);

    }

    public static void partOne() {
        Customer customer = new Customer("Chase", 123.45);
        Customer anotherCustomer;
        anotherCustomer = customer; // Reference NOT instantiated anotherCustomer -> customer
        anotherCustomer.setBalance(444.55);
        System.out.println("Balance for customer: " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // Arraylist shifts down to facilitate new value

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }

}
