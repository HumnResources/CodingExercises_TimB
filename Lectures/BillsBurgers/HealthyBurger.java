package Lectures.BillsBurgers;

public class HealthyBurger extends Burger {

    public HealthyBurger(int[] additionChoices) {
        super(2, 2, additionChoices.length);
        setAdditionChoices(additionChoices);
        setAdditionsAvailable(new String[]{"Lettuce", "Tomato", "Avocado", "Cucumber", "Spinach", "Onions"});
        setAdditions();
    }


}
