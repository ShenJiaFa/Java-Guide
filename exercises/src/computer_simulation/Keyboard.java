package computer_simulation;

/**
 * Function:The Keyboard Object
 *
 * Author: ShenJiaFa
 * Since: 2022/3/23-22:34
 */
public class Keyboard implements USB{
    /**
     * The keyboard name
     */
    private String name;

    public String getName() {
        return name;
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard() {
    }

    @Override
    public void plugIn() {
        System.out.println(name+" is plugged into computer;");
    }

    @Override
    public void unplug() {
        System.out.println(name+" is unplugged from the computer;");
    }

    /**
     * Keyboard input method
     */
    public void typeIn(){
        System.out.println(name+" is typing;");
    }
}
