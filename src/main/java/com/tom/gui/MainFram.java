package com.tom.gui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFram extends JFrame {
    JPanel panel = new JPanel();
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public MainFram() {
        setSize(600, 400);
        setLocation(200, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
//        ActionListener listener = new MyListener();
//        ok.addActionListener(listener);
//        ActionListener byeListener = new ByeListener();
//        cancel.addActionListener(byeListener);

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello main");
            }
        });

        cancel.addActionListener((actionEvent) -> {
            System.out.println("Bye main Lamda");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        MainFram mainFram = new MainFram();
//        mainFram.setVisible(true);
    }
}
