package simulate_race.model.car.base;

/**
 * Function: Car model
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
     * The driver of car
     */
    private String driver;

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

    /**
     * The total time of race
     */
    private double totalTime;

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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Car(String brand, String model, String driver, double flatSpeed, double sandSpeed, double mountainSpeed) {
        this.brand = brand;
        this.model = model;
        this.driver = driver;
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
                ", driver='" + driver + '\'' +
                ", flatSpeed=" + flatSpeed +
                ", sandSpeed=" + sandSpeed +
                ", mountainSpeed=" + mountainSpeed +
                ", totalTime=" + totalTime +
                '}';
    }
}
