package button_listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Function: Bind a listener event to the button
 *
 * Author: ShenJiaFa
 * Since: 2022/3/25-22:18
 */
public class ButtonListener {

    public static void main(String[] args) {

        JFrame win = new JFrame("Bind Button Listener");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton button = new JButton("Button");
        panel.add(button);

        //Bind listener event
        button.addActionListener(e -> JOptionPane.showMessageDialog(win, "Bind Success!"));

        win.setSize(320, 240);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
