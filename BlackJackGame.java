package com.mycompany.blackjackgame;

import java.util.Scanner;

public class BlackJackGame {

    public static void main(String[] args) {

        Card card = new Card(Card.Card_type.CLOVERS, Card.CardValue.JACK);

        card.TurnCard();
        System.out.println(card);

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        System.out.println("Please enter your Name:");
        Player.player_name = scanner.nextLine();
        System.out.println("Welcome back " + Player.player_name + "!");

        System.out.println("Press enter to start the game.\n");
        scanner.nextLine();

        do {
            System.out.println("---------------------------------------------------\n");
            System.out.println("Main Menu\n");

            System.out.println("1. Start the game");
            System.out.println("2. Check my token balance ");
            System.out.println("3. Exit ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + Player.player_balance);
                startGame();

            } else if (choice == 2) {
                System.out.println("Your balance is: " + Player.player_balance);

            } else if (choice == 3) {
                System.out.println("Exiting The Game.\n");
            } else {
                System.out.println("Invalid choice, Please type a number from the list above.\n");
            }
        } while (choice != 3);
    }

    public static void startGame() {
        Hand hand = new Hand(0, "", 0, 0, new Card[21], 0);
        Player player = new Player(hand);
        Bank dealer = new Bank(new Hand());
        cards_pack deck = new cards_pack();
        boolean gameEnd = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameEnd) {

            System.out.println("Your current balance: " + player.getPlayer_balance());
            System.out.println("Place your bet: ");
            int betAmount = scanner.nextInt();
            player.placeBet(betAmount);

            player.GivePlayerTwoCards(deck);
           // dealer.GiveInitialCards(deck);

            System.out.println("Player's hand:");
            player.displayHand();
            System.out.println("Dealer's hand:");
            dealer.displayHand();

            boolean playerTurn = true;
            while (playerTurn) {

                System.out.println("Choose your action: ");
                System.out.println("1. Hit");
                System.out.println("2. Stand");
                int action = scanner.nextInt();

                if (action == 1) {
                    player.hit(deck);
                    player.displayHand();

                    if (player.getHand().getTotalValue() > 21) {
                        System.out.println("You busted! Dealer wins.");
                        playerTurn = false;
                        break;
                    }
                } else if (action == 2) {
                    player.stand();
                    playerTurn = false;
                }
            }

            while (dealer.getHand().getTotalValue() < 17) {
                dealer.hit(deck);
                System.out.println("Dealer hits.");
            }
            dealer.displayHand();

            int playerTotal = player.getHand().getTotalValue();
            int dealerTotal = dealer.getHand().getTotalValue();

            if (playerTotal > 21 || (dealerTotal <= 21 && dealerTotal > playerTotal)) {
                System.out.println("Dealer wins!");
                player.collectBet(false);
            } else if (playerTotal == dealerTotal) {
                System.out.println("It's a push!");
                player.collectBet(true);
            } else {
                System.out.println("Player wins!");
                player.collectBet(true);
            }

            System.out.println("Do you want to play another game? (yes/no)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                gameEnd = true;
            }
        }
        scanner.close();
    }

}
