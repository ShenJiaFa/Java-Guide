package simulate_race.model.car;

import simulate_race.model.car.base.Car;

import static simulate_race.constant.SpeedKey.*;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Truck extends Car {
    @Override
    public void function() {
        super.setSandSpeed(super.getSandSpeed() * 1.5);
    }

    public Truck(){
        super();
    }

    public Truck(String brand, String model, double flatSpeed, double sandSpeed, double mountainSpeed){
        super(brand, model, flatSpeed, sandSpeed,mountainSpeed);
        function();
    }

    public static Truck getTruck(String brand, String model){
        return new Truck(brand,model,TRUCK_FLAT_SPEED,TRUCK_SAND_SPEED,TRUCK_MOUNTAIN_SPEED);
    }

}
