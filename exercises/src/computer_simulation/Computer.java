package computer_simulation;

/**
 * Function:Computer Object
 *
 * Author: ShenJiaFa
 * Since: 2022/3/23-23:05
 */
public class Computer {

    /**
     * Computer name
     */
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Computer startup method
     */
    public void startUp(){
        System.out.println("Computer is starting...");
    }

    /**
     * Computer install USB method
     *
     * @param usbDevice
     */
    public void installUSB(USB usbDevice) {
        usbDevice.plugIn();
        if (usbDevice instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usbDevice;
            keyboard.typeIn();
        } else if (usbDevice instanceof Mouse) {
            Mouse mouse = (Mouse) usbDevice;
            mouse.click();
        }
        usbDevice.unplug();
    }
}
