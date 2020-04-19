package NumberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int num) {

        int reverse = 0;
        int numCopy = num;
        while (numCopy != 0) {
            int lastDigit = numCopy % 10; // Remaining of num / 10 = lastDigit
            reverse = reverse * 10; // Shift decimal place by one +
            reverse += lastDigit; // Add last digit to first space
            numCopy = numCopy / 10; // Remove number, Shift decimal place by one -
        }
        return reverse == num;
    }

}
