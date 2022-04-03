package simulate_race.model.car;

import simulate_race.model.car.base.Car;

import static simulate_race.constant.SpeedKey.*;

/**
 * Function: Sport car model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SportCar extends Car {

    @Override
    public void function() {
        super.setFlatSpeed(super.getFlatSpeed() * 1.5);
    }

    public SportCar(){
        super();
    }

    public SportCar(String brand, String model, double flatSpeed, double sandSpeed, double mountainSpeed){
        super(brand, model, flatSpeed, sandSpeed,mountainSpeed);
        function();
    }

    public static SportCar getSportCar(String brand, String model){
        return new SportCar(brand,model,SPORT_CAR_FLAT_SPEED,SPORT_CAR_SAND_SPEED,SPORT_CAR_MOUNTAIN_SPEED);
    }

}
