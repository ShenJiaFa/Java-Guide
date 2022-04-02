package simulate_clip_and_queue;

import java.util.LinkedList;

/**
 * Function: Simulate people queue
 *
 * Author: ShenJiaFa
 * Since: 2022/4/2-20:43
 */
public class SimulatePeopleQueue {
    public static void main(String[] args) {

        // Create a queue structure
        LinkedList queue = new LinkedList();

        // people queue
        queue.addLast("Tom");
        queue.addLast("Jim");
        queue.addLast("Bill");
        queue.addLast("John");
        queue.addLast("Tim");
        queue.addLast("Jack");
        queue.addLast("Bob");

        // Show people order
        System.out.println("The order of people is " + queue);

        // Leave the queue
        System.out.println(queue.removeFirst() + "leave the queue first;");
        System.out.println(queue.removeFirst() + "leave the queue second;");
        System.out.println(queue.removeFirst() + "leave the queue third;");
        System.out.println(queue.removeFirst() + "leave the queue fourth;");
        System.out.println(queue.removeFirst() + "leave the queue fifth;");
        System.out.println(queue.removeFirst() + "leave the queue sixth;");
        System.out.println(queue.removeFirst() + "leave the queue seventh;");

        // Show queue condition
        System.out.println("The condition of clip is " + queue);

    }
}
