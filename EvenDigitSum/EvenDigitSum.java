package EvenDigitSum;

public class EvenDigitSum {

    public static int getEvenDigitSum(int num) {
        if (num < 0)
            return -1;

        int sum = 0;

        while (num > 0) {
            int currentNum = num % 10;
            if (currentNum % 2 == 0)
                sum += currentNum;
            num = num / 10;
        }
        return sum;
    }

}
