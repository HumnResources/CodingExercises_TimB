package FirstLastDigitSum;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0)
            return -1;

        int firstNum = num;
        int lastNum = num % 10;

        while (firstNum % 10 != firstNum) { // If num / 10 != num . . .
            firstNum = firstNum / 10; // Shift decimal places -
        }
        return firstNum + lastNum;
    }

}
