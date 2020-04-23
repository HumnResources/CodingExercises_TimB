package Lectures.BillsBurgers;

import java.util.Scanner;

public class OrderConsole {

    private static Burger currentOrder;
    //    private int choice;
    private static final Scanner scanner = new Scanner(System.in);


    public static void getOrder() {

        int patty = 0;
        int burgerChoice = 0;
        int bun = 0;
        int[] numOfAdditions;

        System.out.println("\nGood evening, welcome to Bill's Burgers!" +
                "\nTo start, what kind of bun would you like?" +
                "\n1.White" +
                "\n2.Whole Wheat" +
                "\n3.Brown Rye");
        bun = getInput(1,3) - 1;

        System.out.println("Alright we have a selection of patty choices for you as well." +
                "\n1.Beef" +
                "\n2.Chicken" +
                "\n3.Fish");
        patty = getInput(1,3) - 1;

        System.out.println("Okay, and what type of burger would you like ?" +
                "\n1. Regular with up to 4 additions. (Lettuce,Tomato,Cheese,Bacon)" +
                "\n2. Deluxe incl. 6 additions *(Lettuce,Tomato,Cheese,Bacon,Fries,Drink)" +
                "\n3. Healthy with up to 6 additions (Lettuce,Tomato,Avocado,Cucumber,Spinach,Onions)");

        burgerChoice = getInput(1,3);

        System.out.println("\nSounds good!");

        if (burgerChoice == 2) {
            currentOrder = new DeluxeBurger(bun, patty);
        }
        else {
            switch (burgerChoice) {
                case 1 -> {
                    System.out.println("How many additions would you like?");
                    numOfAdditions = new int[getInput(0,4)];
                    System.out.println("What would you like on it?");
                    System.out.println("\n1.Lettuce\n2.Tomato\n3.Cheese\n4.Bacon");
                    for (int i = 0; i < numOfAdditions.length; i++) {
                        numOfAdditions[i] = getInput(0,4) - 1;
                    }
                    currentOrder = new Burger(bun, patty, numOfAdditions.length);
                    currentOrder.setAdditionChoices(numOfAdditions);
                    currentOrder.setAdditions();
                }
                case 3 -> {
                    System.out.println("How many additions would you like?");
                    numOfAdditions = new int[getInput(0,6)];
                    System.out.println("What would you like on it?");
                    System.out.println("\n1.Lettuce\n2.Tomato\n3.Avocado\n4.Cucumber\n5.Spinach\n6.Onions");
                    for (int i = 0; i < numOfAdditions.length; i++) {
                        numOfAdditions[i] = getInput(1,6) - 1;
                    }
                    currentOrder = new HealthyBurger(numOfAdditions);
                    currentOrder.setAdditions();
                }
            }
        }
        System.out.println("Okay ! \n Here's your receipt. Have a great day! \n");
        System.out.println(currentOrder.toString());
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


    public void getCost() {
    }


}
