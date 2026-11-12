package com.pluralsight;

public class CardApp {

    public static void main(String[] args) {

        //create the deck
        Deck deck = new Deck();

        // shuffle the deck
        deck.shuffle();

        // how many cards
        System.out.println("Deck size: " + deck.getSize());

        // take a card off the deck
        Card someCard = deck.deal();

        // flip the card over so we can see it
        someCard.flip();

        // printed out info about that card
        System.out.println("Card Value: " + someCard.getValue());
        System.out.println("Card Suit: " + someCard.getSuit());

        // flip the card back over so we cant see it anymore
        someCard.flip();

        //create the hand
        Hand hand1 = new Hand();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }

}

