package java_all.java_se.practice.orient_object.employee_analysis;

/**
 * Function: TopPerformer model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/6
 */
public class TopPerformer {

    /**
     * TopPerformer serial number
     */
    private Integer serialNumber;

    /**
     * Employee field
     */
    private Employee employee;

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TopPerformer(Integer serialNumber, Employee employee) {
        this.serialNumber = serialNumber;
        this.employee = employee;
    }

    public TopPerformer() {
    }

    @Override
    public String toString() {
        return "TopPerformer{" +
                "serialNumber=" + serialNumber +
                ", employee=" + employee +
                '}';
    }

}
