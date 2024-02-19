package com.mycompany.blackjackgame;

public class bank extends person {

    public int totalValueLimit;
    private hand hand;

    public void GiveInitialCards(cards_pack cardPack) {

        Card visibleCard = GiveOneCard(cardPack);
        hand.addCard(visibleCard);

        Card hiddenCard = GiveOneCard(cardPack);
        hiddenCard.TurnCard();
        hand.addCard(hiddenCard);

        System.out.println("Dealer deals initial cards.");
        System.out.println("Visible card: " + visibleCard);
        System.out.println("Hidden card: " + hiddenCard);
    }

    private Card GiveOneCard(cards_pack cardPack) {
        Card[] cards = cardPack.getListCards();
        Card card = cards[0];

        int i = 0;
        while (i < cards.length - 1) {
            cards[i] = cards[i + 1];
            i++;
        }
        cards[cards.length - 1] = null;
        cardPack.setListCards(cards);

        return card;
    }

}
