package com.mycompany.blackjackgame;

public class Bank extends person {

    public int totalValueLimit;
    private Hand hand;

    public Bank(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void GiveInitialCards(cards_pack deck) {
        if (deck.getSize() < 2) {
            System.out.println("Insufficient cards in the deck to deal initial cards.");
            return;
        }

        Card visibleCard = deck.getListCards()[0];
        hand.addCard(visibleCard);

        Card hiddenCard = deck.getListCards()[1];
        hiddenCard.TurnCard();
        hand.addCard(hiddenCard);

        deck.removeCard(0);
        deck.removeCard(0);

        System.out.println("Dealer deals initial cards.");
        System.out.println("Visible card: " + visibleCard);
        System.out.println("Hidden card: " + hiddenCard);
    }

    public void displayHand() {
        System.out.println("Dealer's hand:");
        for (Card card : hand.getCards()) {
            System.out.println(card);
        }
        System.out.println("Total value of dealer's hand: " + hand.getTotalValue());
    }

    public void hit(cards_pack deck) {
        if (deck.getSize() < 1) {
            System.out.println("Insufficient cards in the deck to draw a new card.");
            return;
        }

        Card newCard = deck.getListCards()[0];
        hand.addCard(newCard);
        deck.removeCard(0);
        System.out.println("Dealer draws a new card.");
    }
}