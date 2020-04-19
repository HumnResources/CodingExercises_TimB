package SpeedConverter;

public class SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0)
            return -1;
        else if (kilometersPerHour > 0)
            return (Math.round(kilometersPerHour / 1.609));

        return 0;
    }


    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long conversion = toMilesPerHour(kilometersPerHour);

        System.out.printf("%s km/h = %s mi/h", kilometersPerHour, conversion);

    }

}
