package com.mycompany.blackjackgame;

public class Hand {

    private int totalValue;
    private String name;
    private int cardsNumber;
    private int listCards;
    private Card[] cards;
    private int numCards;

    public Hand() {
        this.totalValue = 0;
        this.name = "";
        this.cardsNumber = 0;
        this.listCards = 0;
        this.cards = new Card[10];
        this.numCards = 0;
    }

    public void addCard(Card card) {
        if (numCards < cards.length) {
            cards[numCards] = card;
            numCards++;
        } else {
            System.out.println("Cannot add more cards to the hand. Hand is full.");
        }
    }

    // Constructor with parameters
    public Hand(int totalValue, String name, int cardsNumber, int listCards, Card[] cards, int numCards) {
        this.totalValue = totalValue;
        this.name = name;
        this.cardsNumber = cardsNumber;
        this.listCards = listCards;
        this.cards = cards;
        this.numCards = numCards;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public String getName() {
        return name;
    }

    public int getCardsNumber() {
        return cardsNumber;
    }

    public int getListCards() {
        return listCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardsNumber(int cardsNumber) {
        this.cardsNumber = cardsNumber;
    }

    public void setListCards(int listCards) {
        this.listCards = listCards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

}
