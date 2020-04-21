package Execrcises.NumberToWords;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        int reverseNum = reverse(number);

        int i = 0;
        while (i < getDigitCount(number)) {
            int lastDigit = reverseNum % 10;

            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print ("Nine ");
                    break;
            }
            reverseNum = reverseNum / 10;
            i++;
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        int numCopy = number;
        while (numCopy != 0) {
            int lastDigit = numCopy % 10; // Remaining of num / 10 = lastDigit
            reverse = reverse * 10; // Shift decimal place by one +
            reverse += lastDigit; // Add last digit to first space
            numCopy = numCopy / 10; // Remove number, Shift decimal place by one -
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0)
            return -1;

        int count = 0;
        do {
            count++;
            number = number / 10;
        } while (number > 0);
            return count;
    }

}
