package Lectures.BillsBurgers;

public class DeluxeBurger extends Burger {

    public DeluxeBurger(int bun, int patty) {
        super(bun, patty, 4);
        setAdditions();
    }

    @Override
    public void setAdditions() {
        this.updateCost(3.00);
        setAdditionChoices(new int[]{0,1,2,3});
        super.setAdditions();
    }

    @Override
    public String toString() {
        String string = super.toString();
        string = string.concat("Fries - $1.50\nDrink - $1.50");
        return string;
    }
}
