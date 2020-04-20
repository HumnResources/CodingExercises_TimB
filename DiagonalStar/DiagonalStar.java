package DiagonalStar;

public class DiagonalStar {

    public static void printSquareStar(int num) {

        if (num < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= num; row++) {

            for (int col = 1; col <= num; col++) {
                if (row == 1 || row == num || col == 1 || col == num || row == col || col == (num-row) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }


}
