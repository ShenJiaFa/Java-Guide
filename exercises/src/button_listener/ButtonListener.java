package button_listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Function: Bind button listener events
 *
 * Author: ShenJiaFa
 * Since: 2022/3/25-22:18
 */
public class ButtonListener {

    public static void main(String[] args) {

        JFrame win = new JFrame("Login Interface");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton button = new JButton("Log In");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Success!");
            }
        });

        win.setSize(320, 240);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
