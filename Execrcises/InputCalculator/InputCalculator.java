package Execrcises.InputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        long average = 0;
        int numCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                numCount++;
                average = Math.round((double)sum / numCount);
            }
            else {
                System.out.printf("SUM = %s AVG = %s%s", sum, average, System.lineSeparator());
                return;
            }
        }
    }

}
