package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class BlackJackApp extends JPanel {

    private JButton reset, drawCard;
    private JLabel userPlayed, housePlayed;
    private Player user, house;
    private int numOfDraws;
    private Deck deck;

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
        userPlayed = new JLabel("User played:");
        add(userPlayed);
        housePlayed = new JLabel("House played:");
        add(housePlayed);

        Player user = new Player("user");
        Player house = new Player("house");
        deck = new Deck();

        reset = new JButton("New Game");
        reset.addActionListener(
                new startNewGame());
        add(reset);

        drawCard = new JButton("Draw a drawCard");
        drawCard.addActionListener(
                new drawACard());
        add(drawCard);
    }

    private class startNewGame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            deck = new Deck();
            user.played = new ArrayList<>();
            house.played = new ArrayList<>();
        }
    }

    private class drawACard implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(numOfDraws < 52) {
                user.drawCard(deck, numOfDraws);
                house.drawCard(deck, numOfDraws);
                numOfDraws++;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJackApp();
            }
        });
    }
}