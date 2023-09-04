package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CityBusAppl {
    public static void main(String[] args) {
        ArrayList<Bus> cityBuses = new ArrayList<>();
        cityBuses.add(new Bus("BrandNew", "30", 50));
        cityBuses.add(new Bus("Mercedes", "Düsseldorf - Köln", 30));
        cityBuses.add(new Bus("Man", "40", 55));
        cityBuses.add(new Bus("Man", "10", 45));

        System.out.println(cityBuses.size());
        System.out.println(cityBuses.indexOf(new Bus("Man", "40", 55)));
        for (Bus bus : cityBuses){
            System.out.println(bus);
        }

        System.out.println("================");
        System.out.println();
        Collections.sort(cityBuses);
        for (Bus bus : cityBuses){
            System.out.println(bus);
        }
        int totalCapacity = 0;
        for (Bus bus : cityBuses){
            totalCapacity += bus.capacity;
        }
        System.out.println("Res = " + totalCapacity);
    }
}
