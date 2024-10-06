/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlackJack;
public class Card{
    
    private final int suit;
    private final int rank;
    private final int value;

    Card(int suit, int rank, int value){
        this.suit  = suit;
        this.rank  = rank;
        this.value = value;
    }

    Card(Card C){
        this.suit  = C.suit; 
        this.rank  = C.rank; 
        this.value = C.value; 
    }

    int getSuit(){
        return suit;
    }

    int getRank(){
        return rank;
    }

    int getValue(){
        return value;
    }

}