package Execrcises.LargestPrime;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1)
            return -1;

        int largestPrime = 0;
        int factorCounter = 0;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {

                for (int j = 2; j <= i; j++) { // Cycle through factorials of both groups **

                    if (i % j == 0) {
                        factorCounter++; // Add to counter
                    }
                }

                if (factorCounter == 1) { // If counter < 2 (Max prime factorials), set prime number
                    if (largestPrime < i)
                        largestPrime = i;
                }

                factorCounter = 0; // Reset factorial counter
            }
        }

        return largestPrime;

    }

}
