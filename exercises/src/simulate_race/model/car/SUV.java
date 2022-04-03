package simulate_race.model.car;

import simulate_race.model.car.base.Car;
import simulate_race.util.SpeedUtil;

import static simulate_race.constant.SpeedKey.*;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SUV extends Car {

    /**
     * The function of SUV
     */
    @Override
    public void function() {
        super.setMountainSpeed(super.getMountainSpeed() * 1.5);
    }

    public SUV() {
        super();
    }

    public SUV(String brand, String model, String driver, double flatSpeed, double sandSpeed, double mountainSpeed) {
        super(brand, model, driver, flatSpeed, sandSpeed, mountainSpeed);
        function();
    }

    /**
     * Get SUV instance
     * @param brand Brand
     * @param model Model
     * @param driver Driver
     * @return SUV instance
     */
    public static SUV getSUV(String brand, String model, String driver) {
        double[] speeds = SpeedUtil.generateSpeed(SUV_FLAT_SPEED, SUV_SAND_SPEED, SUV_MOUNTAIN_SPEED);
        return new SUV(brand, model, driver, speeds[0], speeds[1], speeds[2]);
    }

}
