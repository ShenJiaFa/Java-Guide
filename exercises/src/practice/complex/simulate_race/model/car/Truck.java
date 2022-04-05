package practice.complex.simulate_race.model.car;

import practice.complex.simulate_race.model.car.base.Car;
import practice.complex.simulate_race.util.SpeedUtil;

import static practice.complex.simulate_race.constant.SpeedKey.*;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Truck extends Car {

    /**
     * The function of truck
     */
    @Override
    public void function() {
        super.setSandSpeed(super.getSandSpeed() * 1.5);
    }

    public Truck() {
        super();
    }

    public Truck(String brand, String model, String driver, double flatSpeed, double sandSpeed, double mountainSpeed) {
        super(brand, model, driver, flatSpeed, sandSpeed, mountainSpeed);
        function();
    }

    /**
     * Get truck instance
     * @param brand Brand
     * @param model Model
     * @param driver Driver
     * @return Truck instance
     */
    public static Truck getTruck(String brand, String model, String driver) {
        double[] speeds = SpeedUtil.generateSpeed(TRUCK_FLAT_SPEED, TRUCK_SAND_SPEED, TRUCK_MOUNTAIN_SPEED);
        return new Truck(brand, model, driver, speeds[0], speeds[1], speeds[2]);
    }

}