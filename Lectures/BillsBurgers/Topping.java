package Lectures.BillsBurgers;

public class Topping {

    private String[] items;
    private int numOfItems;

    public Topping(int numOfItems, boolean isDeluxe, boolean isHealthy) {
        this.numOfItems = numOfItems;
    }


    public void selectToppings(int[] selection) {

        for (int i = 0; i < numOfItems; i++) {

            switch (selection[i]) {
                case 0 -> this.items[i] = "Lettuce";
                case 1 -> this.items[i] = "Tomatoe";
                case 2 -> this.items[i] = "Pickels";
                case 3 -> this.items[i] = "Cheese";

            }
        }

    }


}
