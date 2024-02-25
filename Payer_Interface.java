/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjackgame;

/**
 *
 * @author LENOVO
 */
public interface Payer_Interface {

     String getPlayer_name();

     int getPlayer_balance();

     Hand getHand();

     void GivePlayerTwoCards(cards_pack cardPack);

     void displayHand();

     void hit(cards_pack cardPack);

     void AddCardToPlayerHand(cards_pack cardPack);

     int placeBet(int betAmount);

     void stand();

     void collectBet(boolean playerWins);
}
