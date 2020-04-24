package Lectures.Arrays;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);









    public static int findMin(int[] arrIn) {
        int[] sortedArr = new int[arrIn.length];
        for (int i = 0; i < arrIn.length; i++) {
            sortedArr[i] = arrIn[i];
        }




        int num = -1;
        boolean sorting = true;
        while (sorting) {
            sorting = false;
            for (int i = 0; i < arrIn.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    num = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = num;
                    sorting = true;
                }
                System.out.printf("%s", sortedArr[i]);
            }
        }

        return sortedArr[sortedArr.length-1];
    }

    public static int[] getIntRange(int numOfInts, int rangeFrom, int rangeTo) {
        System.out.format("Input %s numbers between %s to %s \n", numOfInts, rangeFrom, rangeTo);
        int[] arrOut = new int[numOfInts];
        for (int i = 0; i < numOfInts; i++) {
            arrOut[i] = getInput(rangeFrom, rangeTo);
        }
        return arrOut;
    }

    public static int getInput(int rangeFrom, int rangeTo) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= rangeFrom && choice <= rangeTo)
                    return choice;

            }
            else
                scanner.next();
        }
    }

}
