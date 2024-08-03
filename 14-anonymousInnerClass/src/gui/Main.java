package gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOL");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        JButton b1 = new JButton("Press me 1");
        b1.addActionListener((ActionEvent e) -> System.out.println("Button 1 pressed"));
        frame.add(b1);

        JButton b2 = new JButton("Press me 2");
        b2.addActionListener(e -> System.out.println("Button 2 pressed"));
        frame.add(b2);

        JButton b3 = new JButton("Press me 3");
        b3.addActionListener(e -> System.out.println("Button 3 pressed"));
        frame.add(b3);
    }
}
