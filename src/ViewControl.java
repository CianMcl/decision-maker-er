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
    static JEditorPane box;


    public void openFrame(){
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(800,800));
        //frame.setBounds(100,100,800,800);

        panel = defaultScreen();

        frame.add(panel);

        frame.setVisible(true);
    }


    public JPanel defaultScreen() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        heading = new JLabel("Welcome to the Decision Maker.");
        heading.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

        box = new JEditorPane();
        box.setContentType("text/plain");
        box.setText("Welcome to the decision maker.\nThis will make things " +
                "simple, as long as you stick with my logic. I promise that" +
                " it won't be unreasonable.");
        box.setBounds(new Rectangle(400, 800));
        box.setEditable(false);

        button = new JButton("Click here to start!");
        button.addActionListener(new ViewControl());

        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 1;
        panel.add(heading, c);

        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 1;
        panel.add(box, c);

        c.gridx = 0;
        c.gridy = 2;
        c.weighty = 1;
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
