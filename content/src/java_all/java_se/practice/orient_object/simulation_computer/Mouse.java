package java_all.java_se.practice.orient_object.simulation_computer;

/**
 * Function: Keyboard model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Mouse implements USB{

    /**
     * The keyboard name
     */
    private String name;

    @Override
    public void plugIn() {
        System.out.println(name+" is plugged into computer;");
    }

    @Override
    public void unplug() {
        System.out.println(name+" is unplugged from the computer;");
    }

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mouse can be clicked
     */
    public void click(){
        System.out.println(name+" is clicking;");
    }
}
