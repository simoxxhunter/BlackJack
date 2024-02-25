/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjackgame;

/**
 *
 * @author LENOVO
 */
public interface Card_Interface {

     Card.Card_type getCard_type();

     Card.CardValue getCardValue();

     void TurnCard();

     boolean isShown();

    @Override
     String toString();

}
