package ir.amirkakavand;

import java.awt.*;
import javax.swing.*;

public class Form extends JPanel {
    GridBagConstraints constraints = new GridBagConstraints( );

    public Form( ) {

        setLayout(new GridBagLayout( ));

        int x, y;
        addGB(new JLabel("column delimeter "),  x = 0, y = 0);
        addGB(new JTextField(3),x=2,y=0);
        addGB(new JLabel("input curves "),   x = 0, y = 1);
        addGB(new JRadioButton("x"),x=2,y=1);
        addGB(new JRadioButton("y"),x=3,y=1);
        addGB(new JRadioButton("x+y"),x=4,y=1);
        addGB(new JRadioButton("none"),x=5,y=1);
        addGB(new JLabel("allignment curves"), x = 0, y = 2);
        addGB(new JRadioButton("x"),x=2,y=2);
        addGB(new JRadioButton("y"),x=3,y=2);
        addGB(new JRadioButton("x+y"),x=4,y=2);
        addGB(new JRadioButton("none"),x=5,y=2);
        addGB(new JLabel("allignment consensuse"),   x = 0, y = 3);
        addGB(new JRadioButton("x"),x=2,y=3);
        addGB(new JRadioButton("y"),x=3,y=3);
        addGB(new JRadioButton("x+y"),x=4,y=3);
        addGB(new JRadioButton("none"),x=5,y=3);
        addGB(new JButton("cancel"),x=4,y=4);
        addGB(new JButton("export"),x=2,y=4);
    }

    void addGB(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        add(component, constraints);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Csv export setup");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(500, 300);
        //frame.setLocation(200, 200);
        frame.setContentPane(new Form());
        frame.setVisible(true);
    }
}