package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class BlackJackApp extends JPanel{

    private JButton reset, drawCard;
    private JLabel user, house;

    public BlackJackApp() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500, 100);
        frame.add(this);
        createGUI();
    }

    private void createGUI() {
        user = new JLabel("User played:");
        add(user);
        house = new JLabel("House played:");
        add(house);

        reset = new JButton("New Game");
        reset.addActionListener(
                new startNewGame());
        add(reset);

        drawCard = new JButton("Draw a drawCard");
//        drawCard.addActionListener(
//                new drawACard());
        add(drawCard);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJackApp();
            }
        });
    }

    private class startNewGame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Deck deck = new Deck();
        }
    }
}