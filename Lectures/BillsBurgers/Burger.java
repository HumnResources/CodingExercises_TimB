package Lectures.BillsBurgers;

public class Burger {
    private String bun;
    private String patty;
    private String[] additionsAvailable = {"Lettuce", "Tomato", "Cheese", "Bacon"};
    private String[] additions;
    private int[] additionChoices;
    private double cost = 5.99;

    public Burger(int bun, int patty, int numOfAdditions) {
        this.additions = new String[numOfAdditions];
        this.cost += 0.99 * numOfAdditions; // Cost of topping: $0.99/ea
        switch (bun) {
            case 1 -> this.bun = "Whole Wheat";
            case 2 -> this.bun = "Brown Rye";
            default -> this.bun = "White";
        }
        switch (patty) {
            case 1 -> this.patty = "Chicken";
            case 2 -> this.patty = "Fish";
            default -> this.patty = "Beef";
        }
    }

    public void setAdditions() {
        for (int i = 0; i < this.additionChoices.length; i++) {

            if (checkAvailableToppings(additionChoices[i]))
                this.additions[i] = this.additionsAvailable[additionChoices[i]];


        }
    }

    private boolean checkAvailableToppings(int index) {
        return (this.additionsAvailable[index] != null);
    }
    public void setAdditionsAvailable(String[] additionsAvailable) {
        this.additionsAvailable = additionsAvailable;
    }

    public void setAdditionChoices(int[] additionChoices) {
        this.additionChoices = additionChoices;
    }

    public void updateCost(double update) {
        cost += update;
    }

    @Override
    public String toString() {
        String string = String.format("\n%s - $%s\nBun - %s\nPatty - %s\n", this.getClass().getSimpleName(), cost, bun, patty);

        for (String s : additions) {
            string = string.concat(String.format("%s - $0.99\n", s));
        }


        return string;
    }

}
