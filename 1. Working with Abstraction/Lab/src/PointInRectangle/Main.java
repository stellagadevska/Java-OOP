package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // x, y -> 2D coordinate system
        // each point is described by X and Y coordinates

        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Rectangle rectangle = new Rectangle(
                new Point(coordinates[0], coordinates[1]),
                new Point(coordinates[2], coordinates[3])
        );

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            coordinates = Arrays.stream(scanner.nextLine()
                    .split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point point = new Point(coordinates[0], coordinates[1]);

            boolean contains = rectangle.contains(point);

            System.out.println(contains);
        }
    }
}
