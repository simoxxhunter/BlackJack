
package com.mycompany.blackjackgame;


public class hand {
    public int totalValue;
    public String name;
    public int cardsNumber; 
    public int listCards;
    private Card[] cards;
    private int numCards;

    public hand(int totalValue, String name, int cardsNumber, int listCards, Card[] cards, int numCards) {
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

    public void addCard(Card card) {
        cards[numCards] = card;
        numCards++;
    }
    
     
}
