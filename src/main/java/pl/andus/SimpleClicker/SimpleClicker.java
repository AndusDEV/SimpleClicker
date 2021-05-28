package pl.andus.SimpleClicker;

import javax.swing.*;
import java.awt.*;

public class SimpleClicker {

    static int points = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Clicker");
        frame.setLayout(null);

        JButton clickBtn = new JButton("Click me!");
        clickBtn.setBounds(75, 50, 100, 100);

        JLabel label = new JLabel("Click button to gain points!");
        label.setBounds(30, 10, 200, 20);
        label.setFont(new Font("ArialBlack", Font.PLAIN, 15));

        JLabel pointsL = new JLabel("Points: " + points);
        pointsL.setBounds(0,190,180,20);
        pointsL.setFont(new Font("Courier", Font.BOLD, 20));

        frame.add(clickBtn);
        frame.add(label);
        frame.add(pointsL);

        frame.setResizable(false);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        clickBtn.addActionListener(actionEvent -> pointsL.setText("Points: " + ++points));
    }
}
