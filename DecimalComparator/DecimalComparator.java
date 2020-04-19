package DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {

        int num1 = (int) (val1 * 1000);
        int num2 = (int) (val2 * 1000);

        if (num1 == num2)
            return true;

        return false;
    }
}
