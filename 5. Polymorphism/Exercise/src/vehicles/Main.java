package vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", new Car(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2])));

        tokens = scanner.nextLine().split("\\s+");

        vehicleMap.put("Truck", new Truck(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2])));

        int commandCount = Integer.parseInt(scanner.nextLine());

        while (commandCount-- > 0) {
            String command = scanner.nextLine();

            String[] params = command.split("\\s+");
            double argument = Double.parseDouble(params[2]);

            if (command.contains("Drive")) {
                System.out.println(vehicleMap.get(params[1]).drive(argument));
            } else {
                vehicleMap.get(params[1]).refuel(argument);
            }
        }

        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
