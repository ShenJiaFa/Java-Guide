package simulate_race.model.car;

import simulate_race.model.car.base.Car;

import static simulate_race.constant.SpeedKey.*;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SUV extends Car {
    @Override
    public void function() {
        super.setMountainSpeed(super.getMountainSpeed() * 1.5);
    }

    public SUV(){
        super();
    }

    public SUV(String brand, String model, double flatSpeed, double sandSpeed, double mountainSpeed){
        super(brand, model, flatSpeed, sandSpeed,mountainSpeed);
        function();
    }

    public static SUV getSUV(String brand, String model){
        return new SUV(brand,model,SUV_FLAT_SPEED,SUV_SAND_SPEED,SUV_MOUNTAIN_SPEED);
    }

}
