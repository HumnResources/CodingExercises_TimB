package Execrcises.FlourPackProblem;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount = 5Kg smallCount = 1Kg
        // bigCount + smallCount >= goal
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int sum = (bigCount * 5) + (smallCount);

        if (sum < goal)
            return false;

        return goal % 5 == 0 || goal % 5 <= smallCount;

        /*

            Get sum of #s
            Check if less than goal
            Any divisible by 5 succeeds, check if goal is less than or equal to smallBags ie 0 or equal.

         */

    }


}
