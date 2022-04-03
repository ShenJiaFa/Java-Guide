package simulate_race.model.car.base;

/**
 * Function:
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public abstract class Car implements IFunction {

    /**
     * The brand of car
     */
    private String brand;

    /**
     * The model of car
     */
    private String model;

    /**
     * The flat speed of car
     */
    private double flatSpeed;

    /**
     * The sand speed of car
     */
    private double sandSpeed;

    /**
     * The mountain speed of car
     */
    private double mountainSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFlatSpeed() {
        return flatSpeed;
    }

    public void setFlatSpeed(double flatSpeed) {
        this.flatSpeed = flatSpeed;
    }

    public double getSandSpeed() {
        return sandSpeed;
    }

    public void setSandSpeed(double sandSpeed) {
        this.sandSpeed = sandSpeed;
    }

    public double getMountainSpeed() {
        return mountainSpeed;
    }

    public void setMountainSpeed(double mountainSpeed) {
        this.mountainSpeed = mountainSpeed;
    }

    public Car(String brand, String model, double flatSpeed, double sandSpeed, double mountainSpeed) {
        this.brand = brand;
        this.model = model;
        this.flatSpeed = flatSpeed;
        this.sandSpeed = sandSpeed;
        this.mountainSpeed = mountainSpeed;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", flatSpeed=" + flatSpeed +
                ", sandSpeed=" + sandSpeed +
                ", mountainSpeed=" + mountainSpeed +
                '}';
    }
}
