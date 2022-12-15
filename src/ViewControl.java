package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewControl implements ActionListener {

    static JFrame frame;
    static JButton button, diffButton;
    static JPanel panel;


    public void openFrame(JPanel insert){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(800,800));
        //frame.setBounds(100,100,800,800);
        frame.add(insert);

    }

    public JPanel panelCreation(){
        panel = new JPanel();

        button = new JButton("Click");
        button.addActionListener(new ViewControl());

        panel.add(button);

        return panel;

    }

    public JPanel diffPanel(){
        panel = new JPanel();

        diffButton = new JButton("This is now different");
        diffButton.addActionListener(new ViewControl());

        panel.add(diffButton);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JOptionPane.showMessageDialog(null, "Button!");
            openFrame(diffPanel());
        } else if (e.getSource() == diffButton){
            String iono = JOptionPane.showInputDialog("Please enter?");
            System.out.println(iono);
        }
    }

}
