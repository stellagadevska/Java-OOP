import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Top half
        printTop(n);

        // Bottom half
        printBottom(n - 1 );

    }

    public static void printTop(int rowsCount) {
        for (int i = 1; i <= rowsCount; i++) {
            printStringNTimes(rowsCount - i, " ");
            printStringNTimes(i, "* ");
            System.out.println();
        }
    }

    private static void printBottom(int count) {
        for (int i = 1; i <= count; i++) {
            printStringNTimes(i, " ");
            printStringNTimes(count - (i -1), "* ");
            System.out.println();
        }
    }


    private static void printStringNTimes(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }
}
