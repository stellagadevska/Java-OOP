package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // “<pricePerDay> <numberOfDays> <season> <discountType>”,
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        Discount discountType = Discount.valueOf(input[3].toUpperCase());

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        System.out.printf("%.2f",priceCalculator.calculatePrice());


    }
}
