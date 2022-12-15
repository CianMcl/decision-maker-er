package src;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startup implements ActionListener {

    static JFrame frame;
    static JButton button;
    static JPanel panel;

    public void kill(){
        System.exit(0);
    }

    public static void main(String[] args){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,800,800);

        panel = new JPanel();

        button = new JButton("Click");
        button.addActionListener(new Startup());

        panel.add(button);

        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JOptionPane.showMessageDialog(null, "Button!");

            kill();
        }
    }
}