package button_listener;

import javax.swing.*;

/**
 * Function: Bind a listener event to the button
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
