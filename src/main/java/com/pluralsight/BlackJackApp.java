package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {

    public static void main(String[] args) {

        // scanner to gather players name //
        Scanner winnersName = new Scanner(System.in);
            // Player 1 //
        System.out.println("Enter Player 1's name: ");
        String player1 = winnersName.nextLine();
            // Player 2 //
        System.out.println("Enter Player 2's name: ");
        String player2 = winnersName.nextLine();

        
        // creates a new deck of cards
        Deck deck = new Deck();
        // randomizes the order of the cards
        deck.shuffle();

        // created two hands
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        // dealing two cards for each player
        // deck.deal takes one card from the deck AND hand1.deal adds that card to player 1s hand
        hand1.deal(deck.deal());
        hand1.deal(deck.deal());

        hand2.deal(deck.deal());
        hand2.deal(deck.deal());

        // displaying the scores
        System.out.println(player1 + "'s hand: " + hand1.getValue());
        System.out.println(player2 + "'s hand: " + hand2.getValue());
    }
}
