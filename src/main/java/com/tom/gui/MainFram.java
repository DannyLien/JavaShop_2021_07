package com.tom.gui;

import javax.swing.*;
import java.awt.*;

public class MainFram extends JFrame {
    JPanel panel = new JPanel();
    JButton ok = new JButton("OKlalalalalala");
    JButton cancel = new JButton("Cancel");

    public MainFram() {
        setSize(600,400);
        setLocation(200,200);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFram mainFram = new MainFram();
//        mainFram.setVisible(true);
    }
}
