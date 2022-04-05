package practice.complex.simulate_race.model.car;

import practice.complex.simulate_race.model.car.base.Car;
import practice.complex.simulate_race.util.SpeedUtil;

import static practice.complex.simulate_race.constant.SpeedKey.*;

/**
 * Function: Sport car model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SportCar extends Car {

    /**
     * The function of sport car
     */
    @Override
    public void function() {
        super.setFlatSpeed(super.getFlatSpeed() * 1.5);
    }

    public SportCar() {
        super();
    }

    public SportCar(String brand, String model, String driver, double flatSpeed, double sandSpeed, double mountainSpeed) {
        super(brand, model, driver, flatSpeed, sandSpeed, mountainSpeed);
        function();
    }

    /**
     * Get car sport car instance
     * @param brand Brand
     * @param model Model
     * @param driver Driver
     * @return SportCar instance
     */
    public static SportCar getSportCar(String brand, String model, String driver) {
        double[] speeds = SpeedUtil.generateSpeed(SPORT_CAR_FLAT_SPEED, SPORT_CAR_SAND_SPEED, SPORT_CAR_MOUNTAIN_SPEED);
        return new SportCar(brand, model, driver, speeds[0], speeds[1], speeds[2]);
    }

}
