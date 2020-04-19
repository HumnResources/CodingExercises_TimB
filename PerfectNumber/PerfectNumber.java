package PerfectNumber;

public class PerfectNumber {
    /*
        Perfect number: positive integer equal to the sum of its proper positive divisors
        Proper positive divisor: positive integers that fully divide the perfect number w/out remainder
        AND EXCLUDE the perfect number itself. Ie; 6 (P#) -> 1 + 2 + 3 (Divisors) = 6
     */

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == number)
                return false;
            if (number % i == 0)
                sumOfDivisors += i;
        }
        return sumOfDivisors == number;
    }
}
