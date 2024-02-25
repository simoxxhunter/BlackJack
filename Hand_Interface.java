/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjackgame;

/**
 *
 * @author LENOVO
 */
public interface Hand_Interface {

     void addCard(Card card);

     int getTotalValue();

     String getName();

     int getCardsNumber();

     int getListCards();

     Card[] getCards();

     int getNumCards();

     void setTotalValue(int totalValue);

     void setName(String name);

     void setCardsNumber(int cardsNumber);

     void setListCards(int listCards);

     void setCards(Card[] cards);

     void setNumCards(int numCards);

}
