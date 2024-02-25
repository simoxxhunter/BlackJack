/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.blackjackgame;

/**
 *
 * @author LENOVO
 */
public interface CardsPack_Interface {

     Card[] getListCards();

     int getSize();

     void setListCards(Card[] listCards);

     void setSize(int size);

     void ShuffleCards();

     void removeCard(int index);

}
