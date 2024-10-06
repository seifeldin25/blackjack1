package blackjack;

import java.util.Scanner;


public class Blackjack {
    
  static game Game = new game();
    public static void main(String[] args) {
       GUI gui = new GUI();
       Game.makeDeck();
       Game.Playerinfo();
       
       gui.runGUI( Game.deck,
               Game.players[0].gethand(),
               Game.players[1].gethand(),
               Game.players[2].gethand(),
               Game.players[3].gethand());
       
        Turn(gui);
        Game.updatescore();
        DelTurn(gui);
        Game.updatescore();
        
        check();

    }
 
    
 public static void Turn(GUI gui){
         Scanner scaner = new Scanner(System.in);
    
         
         for (int i = 0; i < Game.players.length -1; i++) {
            String input ="";
            while(input.toLowerCase().equals("stand")){
                System.out.println("player number "+(i+1)+ "hit // stand");
                input=scaner.next();
                if( input.toLowerCase().equals("hit")){
                 addd(i,gui);
                } 
            }  
        }       
    }     
 public static void addd(int ind,GUI gui){
        Card card =Game.drawCard();
        Game.players[ind].addcard(card);
        gui.updatePlayerHand(card, ind);
         
 } 
 public static void DelTurn(GUI gui){
     boolean win =true ;
     int highscore=0;
     for (int i = 0; i < Game.players.length -1 ; i++) {
       if(Game.highScores[i]>= Game.players[3].plscore){
          win=false;
      } 
       if(Game.highScores[i]>highscore ){
           highscore = Game.highScores[i];
       }
     }
     if(!win){
         addToDel(gui,highscore);
     } 
     else{
         return;
     }
     
 }
 public static void addToDel(GUI gui,int highscore){
     while(Game.players[3].plscore < highscore){
        Card card =Game.drawCard();
        Game.players[3].addcard(card);
        gui.updateDealerHand(card, Game.deck);
         
     }
        
}
 public static void check(){
     int high =0;
     int win =-1;
     for (int i = 0; i < Game.players.length ; i++) {
      if (Game.highScores[i] > high){
          high=Game.highScores[i];
          win=i;
      }        
     }
    if (win >=0){
        System.out.println("wineeeeeer"+ Game.players[win].plname);   
    }}}
