package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] trafficLights = scan.nextLine().split("\\s+");
        int num = Integer.parseInt(scan.nextLine());

        List<TrafficLights> trafficLightsList = new ArrayList<>();

        for (String trafficLight : trafficLights) {
            TrafficLights traffic = new TrafficLights(Light.valueOf(trafficLight));
            trafficLightsList.add(traffic);
        }

        for (int i = 0; i < num; i++) {
            for (TrafficLights lights : trafficLightsList) {
                lights.update();
                System.out.print(lights.getLight() + " ");
            }
            System.out.println();
        }
    }
}
