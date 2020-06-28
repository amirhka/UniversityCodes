package ir.amirkakavand;

import java.awt.*;
import javax.swing.border.Border;
import javax.swing.*;

public class ColorTable {
    public static void main(String[] args) {
        JFrame f = new JFrame("Soal 1");
        JTextField t1, t2, t3, t4;
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
        Border border = BorderFactory.createLineBorder(Color.black, 1);


        l1 = new JLabel("First Label.");
        l1.setBounds(0, 0, 300, 100);
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setBorder(border);

        l2 = new JLabel("Second Label.");
        l2.setBounds(300, 0, 300, 30);
        l2.setOpaque(true);
        l2.setBackground(Color.blue);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setBorder(border);

        l3 = new JLabel("3th Label.");
        l3.setBounds(450, 30, 150, 70);
        l3.setOpaque(true);
        l3.setBackground(Color.green);
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setBorder(border);

        l4 = new JLabel("4th Label.");
        l4.setBounds(300, 30, 150, 35);
        l4.setOpaque(true);
        l4.setBackground(Color.blue);
        l4.setHorizontalAlignment(SwingConstants.CENTER);
        l4.setBorder(border);

        l5 = new JLabel("5th Label.");
        l5.setBounds(300, 65, 75, 35);
        l5.setOpaque(true);
        l5.setBackground(Color.blue);
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        l5.setBorder(border);

        l6 = new JLabel("6th Label.");
        l6.setBounds(375, 65, 75, 35);
        l6.setOpaque(true);
        l6.setBackground(Color.blue);
        l6.setHorizontalAlignment(SwingConstants.CENTER);
        l6.setBorder(border);

        l7 = new JLabel("7th Label.");
        l7.setBounds(450, 100, 150, 100);
        l7.setOpaque(true);
        l7.setBackground(Color.green);
        l7.setHorizontalAlignment(SwingConstants.CENTER);
        l7.setBorder(border);

        l8 = new JLabel("8th Label.");
        l8.setBounds(450, 200, 150, 100);
        l8.setOpaque(true);
        l8.setBackground(Color.green);
        l8.setHorizontalAlignment(SwingConstants.CENTER);
        l8.setBorder(border);

        l9 = new JLabel("9th Label.");
        l9.setBounds(450, 300, 150, 100);
        l9.setOpaque(true);
        l9.setBackground(Color.green);
        l9.setHorizontalAlignment(SwingConstants.CENTER);
        l9.setBorder(border);

        l10 = new JLabel("10th Label.");
        l10.setBounds(0, 300, 450, 100);
        l10.setOpaque(true);
        l10.setBackground(Color.green);
        l10.setHorizontalAlignment(SwingConstants.CENTER);
        l10.setBorder(border);

        l11 = new JLabel("11th Label.");
        l11.setBounds(0, 100, 150, 200);
        l11.setOpaque(true);
        l11.setBackground(Color.green);
        l11.setHorizontalAlignment(SwingConstants.CENTER);
        l11.setBorder(border);

        l12 = new JLabel("12th Label.");
        l12.setBounds(150, 200, 150, 100);
        l12.setOpaque(true);
        l12.setBackground(Color.red);
        l12.setHorizontalAlignment(SwingConstants.CENTER);
        l12.setBorder(border);

        l13 = new JLabel("13th Label.");
        l13.setBounds(150, 100, 150, 100);
        l13.setOpaque(true);
        l13.setBackground(Color.red);
        l13.setHorizontalAlignment(SwingConstants.CENTER);
        l13.setBorder(border);


        t1 = new JTextField("35");
        t1.setBounds(300, 100, 75, 100);
        t1.setBackground(Color.yellow);
        t1.setEditable(false);
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t1.setBorder(border);

        t2 = new JTextField("1");
        t2.setBounds(375, 100, 75, 100);
        t2.setBackground(Color.yellow);
        t2.setEditable(false);
        t2.setHorizontalAlignment(SwingConstants.CENTER);
        t1.setBorder(border);

        t3 = new JTextField("7");
        t3.setBounds(300, 200, 75, 100);
        t3.setBackground(Color.yellow);
        t3.setEditable(false);
        t3.setHorizontalAlignment(SwingConstants.CENTER);
        t3.setBorder(border);

        t4 = new JTextField("29");
        t4.setBounds(375, 200, 75, 100);
        t4.setBackground(Color.yellow);
        t4.setEditable(false);
        t4.setHorizontalAlignment(SwingConstants.CENTER);
        t4.setBorder(border);


        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);


        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.setSize(610, 430);
        f.setLayout(null);
        f.setVisible(true);
    }
}
