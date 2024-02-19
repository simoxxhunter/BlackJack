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
                System.out.println("how much do you want to bet for this game?");

            } else if (choice == 2) {
                System.out.println("Your balance is: " + Player.player_balance);
                
            } else if (choice == 3) {
                System.out.println("Exiting The Game.\n");
            } else {
                System.out.println("Invalid choice, Please type a number from the list above.\n");
            }
        } while (choice != 3);
    }
}
