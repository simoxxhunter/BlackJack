package com.mycompany.blackjackgame;

import com.mycompany.blackjackgame.Card;
import java.util.Random;

public class cards_pack {

    private Card[] listCards;
    private int size;

    public cards_pack(Card[] listCards, int size) {
        this.listCards = listCards;
        this.size = size;
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

    public cards_pack(Card.Card_type[] types, Card.CardValue[] values) {
        int index = 0;
        int typeIndex = 0;
        this.size = types.length * values.length;
        this.listCards = new Card[size];

        while (typeIndex < types.length) {
            int valueIndex = 0;
            while (valueIndex < values.length) {
                listCards[index++] = new Card(types[typeIndex], values[valueIndex]);
                valueIndex++;
            }
            typeIndex++;
        }
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
}
