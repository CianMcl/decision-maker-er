package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    static JFrame frame;
    static JButton button;
    static JPanel panel;
    static JLabel heading;



    public void openFrame(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(800,800));
        //frame.setBounds(100,100,800,800);

        panel = defaultScreen();
        frame.add(panel);

    }


    public JPanel defaultScreen() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        heading = new JLabel("Welcome to the decision maker.");

        button = new JButton("Click");
        button.addActionListener(new ViewControl());

        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        panel.add(heading, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(button, c);

        return panel;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Button!");

        }
    }
}
