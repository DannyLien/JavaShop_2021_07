package com.tom.gui;

import javax.swing.*;

public class GUITester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("OK");
        frame.setTitle("WFT");
        frame.setSize(600, 400);
        frame.setLocation(200, 200);
        JPanel panel = new JPanel();
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
