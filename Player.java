package com.mycompany.blackjackgame;

public class Player extends person {

    public static String player_name;
    public static int player_balance = 100;
    private Hand hand;
    private int betAmount;

    public Player(com.mycompany.blackjackgame.Hand hand) {
        this.hand = hand;
    }

    public static String getPlayer_name() {
        return player_name;
    }

    public static int getPlayer_balance() {
        return player_balance;
    }

    public Hand getHand() {
        return hand;
    }

    public void GivePlayerTwoCards(cards_pack cardPack) {
        int i = 0;
        Card[] updatedCardsPack = new Card[cardPack.getSize() - 1];

        while (i < 2) {
            int j = 0;

            Card card = cardPack.getListCards()[0];
            hand.addCard(card);
            while (j < cardPack.getSize() - 1) {
                updatedCardsPack[j] = cardPack.getListCards()[j + 1];
            }
            cardPack.setListCards(updatedCardsPack);

            i++;
            break;
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

        int i = 0;
        Card[] updatedCardsPack = new Card[cardPack.getSize() - 1];
        while (i < cardPack.getSize() - 1) {
            updatedCardsPack[i] = cardPack.getListCards()[i + 1];
            i++;
        }
        cardPack.setListCards(updatedCardsPack);
    }

    public void AddCardToPlayerHand(cards_pack cardPack) {
        int i = 0;
        Card newCard = cardPack.getListCards()[0];

        Card[] updatedHandCards = new Card[hand.getNumCards() + 1];
        while (i < hand.getNumCards()) {
            updatedHandCards[i] = hand.getCards()[i];
            i++;
        }
        updatedHandCards[hand.getNumCards()] = newCard;
        hand.setCards(updatedHandCards);
        hand.setNumCards(hand.getNumCards() + 1);

        System.out.println("Player draws a new card: " + newCard);
    }

    public static void stand() {
        System.out.println("You choose to stand.");

    }

    public int placeBet(int betAmount) {
        this.betAmount = betAmount;
        if (betAmount > 0 && betAmount <= player_balance) {
            player_balance = player_balance - betAmount;
            System.out.println("Your bet of " + betAmount + " tokens has been placed.");
            return (0);
        } else {
            System.out.println("Invalid bet amount. Please enter an amount lower than your balance.");
        }
        return 0;
    }

    public void collectBet(boolean playerWins) {
        if (playerWins) {
            player_balance = player_balance + this.betAmount;
            System.out.println("You win!");
        } else {

            System.out.println("You lose!");
        }
    }

}
