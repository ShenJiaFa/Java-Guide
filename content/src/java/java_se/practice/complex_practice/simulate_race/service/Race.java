package java.java_se.practice.complex_practice.simulate_race.service;

import java.java_se.practice.complex_practice.simulate_race.constant.OrderKey;
import java.java_se.practice.complex_practice.simulate_race.model.car.SUV;
import java.java_se.practice.complex_practice.simulate_race.model.car.SportCar;
import java.java_se.practice.complex_practice.simulate_race.model.car.Truck;
import java.java_se.practice.complex_practice.simulate_race.model.car.base.Car;
import java.java_se.practice.complex_practice.simulate_race.model.road.Road;

import java.util.*;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Race {
    public static void main(String[] args) {

        // Generate cars
        Map<Integer, List<? extends Car>> map = buildCarMap();

        // Generate road
        Road road = new Road(1000, 1000, 1000);

        // Start race
        race(map, road);

    }

    /**
     * Build car
     *
     * @return Car map
     */
    private static Map<Integer, List<? extends Car>> buildCarMap() {

        List<SportCar> sportCarList = new ArrayList<>();
        sportCarList.add(SportCar.getSportCar("Ferrari", "488", "Jim"));
        sportCarList.add(SportCar.getSportCar("Ferrari", "488", "Bill"));
        sportCarList.add(SportCar.getSportCar("Ferrari", "488", "Bob"));

        List<SUV> suvList = new ArrayList<>();
        suvList.add(SUV.getSUV("Land Rover", "Discovery", "John"));
        suvList.add(SUV.getSUV("Land Rover", "Discovery", "Tom"));
        suvList.add(SUV.getSUV("Land Rover", "Discovery", "George"));

        List<Truck> truckList = new ArrayList<>();
        truckList.add(Truck.getTruck("Ford", "F150", "Lily"));
        truckList.add(Truck.getTruck("Ford", "F150", "Emily"));
        truckList.add(Truck.getTruck("Ford", "F150", "David"));

        Map<Integer, List<? extends Car>> map = new HashMap<>();
        map.put(OrderKey.THE_FIRST_CAR_LIST_KEY, sportCarList);
        map.put(OrderKey.THE_SECOND_CAR_LIST_KEY, suvList);
        map.put(OrderKey.THE_THIRD_CAR_LIST_KEY, truckList);

        return map;
    }

    /**
     * Start race
     *
     * @param map  Car map
     * @param road Road
     */
    private static void race(Map<Integer, List<? extends Car>> map, Road road) {

        // Create a list to hold the total time for all drivers
        List<Car> totalCarList = new ArrayList<>();

        for (Integer key : map.keySet()) {
            List<? extends Car> carList = map.get(key);
            for (Car car : carList) {
                double flatTime = road.getFlatLen() / car.getFlatSpeed();
                double sandSTime = road.getSandLen() / car.getSandSpeed();
                double mountainTime = road.getMountainLen() / car.getMountainSpeed();
                double totalTime = flatTime + sandSTime + mountainTime;
                car.setTotalTime(totalTime);
                totalCarList.add(car);
                System.out.println(car.getDriver() + " start up!");
                System.out.println(car.getDriver() + " has already run flat road! Time Spend: " + String.format("%.2f", flatTime) + " [Speed= " + car.getFlatSpeed() + "]");
                System.out.println(car.getDriver() + " has already run sand road! Time Spend: " + String.format("%.2f", sandSTime) + " [Speed= " + car.getSandSpeed() + "]");
                System.out.println(car.getDriver() + " has already run mountain road! Time Spend: " + String.format("%.2f", mountainTime) + " [Speed= " + car.getMountainSpeed() + "]");
                System.out.println(car.getDriver() + " has finished the race! Total Time: " + String.format("%.2f", totalTime));
                System.out.println("---------------------------------------------");
            }
        }

        //Sort the total time list
        totalCarList.sort(Comparator.comparingDouble(Car::getTotalTime));
        System.out.println("The first place is " + totalCarList.get(0).getDriver() + " and the car is " + totalCarList.get(0).getBrand() + " " + totalCarList.get(0).getModel() + "; [Total time: " + String.format("%.2f", totalCarList.get(0).getTotalTime()) + "]");
        System.out.println("The second place is " + totalCarList.get(1).getDriver() + " and the car is " + totalCarList.get(1).getBrand() + " " + totalCarList.get(1).getModel() + "; [Total time: " + String.format("%.2f", totalCarList.get(1).getTotalTime()) + "]");
        System.out.println("The third place is " + totalCarList.get(2).getDriver() + " and the car is " + totalCarList.get(2).getBrand() + " " + totalCarList.get(2).getModel() + "; [Total time: " + String.format("%.2f", totalCarList.get(2).getTotalTime()) + "]");

    }
}