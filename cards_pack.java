package com.mycompany.blackjackgame;

import java.util.Random;

public class cards_pack {

    private Card[] listCards;
    private int size;

    public cards_pack() {
        this.listCards = new Card[52];
        this.size = 52;
        int index = 0;
        for (Card.Card_type type : Card.Card_type.values()) {
            for (Card.CardValue value : Card.CardValue.values()) {
                listCards[index++] = new Card(type, value);
            }
        }
    }

    public Card[] getListCards() {
        return listCards;
    }

    public int getSize() {
        return size;
    }

    public void setListCards(Card[] listCards) {
        this.listCards = listCards;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void ShuffleCards() {
        Random rand = new Random();
        Card temp;
        int i = listCards.length - 1;

        while (i > 0) {
            int j = rand.nextInt(i + 1);
            temp = listCards[i];
            listCards[i] = listCards[j];
            listCards[j] = temp;
            i--;
        }
    }
    public void removeCard(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index to remove card from the deck.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            listCards[i] = listCards[i + 1];
        }

        listCards[size - 1] = null;
        size--;
    }
}
