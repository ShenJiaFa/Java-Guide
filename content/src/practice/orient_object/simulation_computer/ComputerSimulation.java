package practice.orient_object.simulation_computer;

/**
 * Function: Computer Simulation
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class ComputerSimulation {

    public static void main(String[] args) {

        //create a computer
        Computer computer = new Computer("IBM ThinkPad T14");
        computer.startUp();

        //create a keyboard
        Keyboard keyboard = new Keyboard("CHERRY MX 8.0");
        computer.installUSB(keyboard);

        //create a mouse
        Mouse mouse = new Mouse("Logitech M185");
        computer.installUSB(mouse);

    }
}
