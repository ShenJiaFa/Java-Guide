package practice.medium.simulation_computer;

/**
 * Function:The Keyboard Object
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
