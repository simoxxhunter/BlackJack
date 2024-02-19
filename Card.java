package com.mycompany.blackjackgame;

public class Card {

    public enum Card_type {
        HEART("Hearts ♥"),
        CLOVERS("Clovers ♣"),
        PIKES("Pikes ♠"),
        TILES("Tiles ♦"),;

        private final String name;

        private Card_type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    //-------------------------------------------------------
    public enum CardValue {
        one("A", 1),
        two("two", 2),
        three("three", 3),
        four("four", 4),
        five("five", 5),
        six("six", 6),
        seven("seven", 7),
        eight("eight", 8),
        nine("nine", 9),
        TEN("ten", 10),
        JACK("eleven", 10),
        QUEEN("Queen", 10),
        KING("King", 10);

        private final String name;
        private final int value;

        private CardValue(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }
    //-------------------------------------------------------

    private Card_type Card_type;
    private CardValue CardValue;
    private boolean shown;

    public Card(Card_type Card_type, CardValue CardValue) {
        this.Card_type = Card_type;
        this.CardValue = CardValue;
    }

    public Card_type getCard_type() {
        return Card_type;
    }

    public CardValue getCardValue() {
        return CardValue;
    }

    public boolean isShown() {
        return shown;
    }

    public void TurnCard() {
        shown = !shown;
    }

   @Override
    public String toString() {
        String show;
        if (shown) {
            show = CardValue.getName() + " of " + Card_type.getName();
        } else {
            show = "the card is hidden";
        }
        return show;
    }

}
