/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjackgame;

/**
 *
 * @author LENOVO
 */
public interface Bank_Interface {

     void GiveInitialCards(cards_pack deck);

     void displayHand();

     void hit(cards_pack deck);

     Hand getHand();
}
