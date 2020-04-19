package GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = -1;

        if (first < 10 || second < 10)
            return divisor;
        for (int i = Math.min(first, second); i > 1; i--) {
            if (first % i == 0) {
                if (second % i == 0) {
                    divisor = Math.max(divisor, i);
                }
            }
        }
        return divisor;
    }
}
