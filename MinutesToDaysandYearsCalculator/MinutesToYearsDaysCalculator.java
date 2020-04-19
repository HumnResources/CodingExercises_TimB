package MinutesToDaysandYearsCalculator;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = (minutes / 60) / 24;
        long remainingDays = days % 365;
        long years = days / 365;

        System.out.format("%s min = %s y and %s d", minutes, years, remainingDays);
    }

}