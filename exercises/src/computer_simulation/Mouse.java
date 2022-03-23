package computer_simulation;

/**
 * Function:
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/3/23-22:33
 */
public class Mouse implements USB{

    /**
     * The keyboard name
     */
    private String name;

    @Override
    public void plugIn() {
        System.out.println(name+" can be plugged into a computer via USB;");
    }

    @Override
    public void unplug() {
        System.out.println(name+" can be unplugged from the computer via USB;");
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
        System.out.println(name+" can be clicked;");
    }
}
