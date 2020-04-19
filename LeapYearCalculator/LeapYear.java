package LeapYearCalculator;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (!(year >= 1 && year <= 9999))
            return false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Must be both divisible by 100 && 400 and/or divisible by 4 **
            }
            return true;
        }
        return false;
    }
}
