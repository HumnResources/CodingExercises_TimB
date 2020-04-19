package SharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
            return false;

        int numOne_1 = num1 / 10;
        int numOne_2 = num1 % 10;

        int numTwo_1 = num2 / 10;
        int numTwo_2 = num2 % 10;

        return numOne_1 == numTwo_1 || numOne_1 == numTwo_2 || numTwo_1 == numOne_2 || numTwo_2 == numOne_2;
    }



}
