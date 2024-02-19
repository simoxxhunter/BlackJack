package com.mycompany.blackjackgame;

public class Player extends person {

    public static String player_name;
    public static int player_balance = 100;
    private hand hand;

    public Player(com.mycompany.blackjackgame.hand hand) {
        this.hand = hand;
    }

    public void GivePlayerTwoCards(cards_pack cardPack) {
        int i = 0;
        while (i < 2) {
            int j = 0;

            Card card = cardPack.getListCards()[0];
            hand.addCard(card);
            Card[] updatedCardsPack = new Card[cardPack.getSize() - 1];

            while (j < cardPack.getSize() - 1) {
                updatedCardsPack[j] = cardPack.getListCards()[j + 1];
            }
            cardPack.setListCards(updatedCardsPack);

            i++;
        }
    }

    public void displayHand() {
        System.out.println("Player's hand:");
        int index = 0;
        int totalValue = 0; 
        while (index < hand.getNumCards()) {
            Card card = hand.getCards()[index];
            System.out.println(card); 
            totalValue += card.getCardValue().getValue(); 
            index++;
        }
        System.out.println("Total value of hand: " + totalValue);
    }

    public void hit(cards_pack cardPack) {

        int index = 0;
        Card[] updatedCardsPack = new Card[cardPack.getSize() - 1];
        while (index < cardPack.getSize() - 1) {
            updatedCardsPack[index] = cardPack.getListCards()[index + 1];
            index++;
        }
        cardPack.setListCards(updatedCardsPack);
    }

    public void AddCardToPlayerHand(cards_pack cardPack) {
        int index = 0;
        Card newCard = cardPack.getListCards()[0];

        Card[] updatedHandCards = new Card[hand.getNumCards() + 1];
        while (index < hand.getNumCards()) {
            updatedHandCards[index] = hand.getCards()[index];
            index++;
        }
        updatedHandCards[hand.getNumCards()] = newCard;
        hand.setCards(updatedHandCards);
        hand.setNumCards(hand.getNumCards() + 1);

        System.out.println("Player draws a new card: " + newCard); 
    }
    public void stand() {
    System.out.println("You choose to stand.");
   
}


}
