package simulate_clip_and_queue;

import java.util.LinkedList;

/**
 * Function: Simulate clip
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SimulateClipLoad {
    public static void main(String[] args) {

        // Create a stack structure
        LinkedList stack = new LinkedList();

        // Clip load
        stack.push("Bullet1");
        stack.push("Bullet2");
        stack.push("Bullet3");
        stack.push("Bullet4");
        stack.push("Bullet5");
        stack.push("Bullet6");
        stack.push("Bullet7");

        // Show bullets order
        System.out.println("The order of bullets is " + stack);

        // Bullet shot
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");
        System.out.println("Shot " + stack.pop() + "!");

        // Show bullets order
        System.out.println("The condition of clip is " + stack);

    }
}
