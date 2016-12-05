package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class BlackJackApp extends JFrame{

    private JButton newGame, drawCard;
    private JLabel userPlayed, housePlayed;

    public BlackJackApp() {
        setTitle("Counter App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 100);
        createGUI();
    }

    private void createGUI() {
        JPanel panel = new JPanel();
        add(panel);

        userPlayed = new JLabel("User played:");
        panel.add(userPlayed);
        housePlayed = new JLabel("House played:");
        panel.add(housePlayed);

        newGame = new JButton("New Game");
        newGame.addActionListener(
                new startNewGame());
        panel.add(newGame);

        drawCard = new JButton("Draw a drawCard");
//        drawCard.addActionListener(
//                new drawACard());
        panel.add(drawCard);
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