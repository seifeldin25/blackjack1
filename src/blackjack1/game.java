package BlackJack;
import java.util.Scanner;
import java.util.Random;

public class Game{

    public int[] highScores  = new int[4];
    public Player[] players = new Player[4];
    Card deck[] = new Card[52];
    public void makeDeck(){
        int count=0;
        for(int i=0; i < 4; i++){
           for(int k=0; k < 13; k++){
             int value = (k >=10) ? 10 : k+1;
             Card C=new Card( i , k , value);
             deck[count]=C;
           count++;
           }
        }
    }

    public Card drawCard(){
        Random random = new Random();
        Card C = null;
        do{
           int randCard = random.nextInt(51);
        C=deck[randCard];
        deck[randCard]=null;
        }while(C==null);
        return C;
    }
    public void Playerinfo(){
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<players.length-1;i++)  
        {   System.out.print("Enter name of the player"+(i+1)+" : ");
         players[i]=new Player () ;
        players [i].plname=scanner.next();
        players [i].addcard(this.drawCard());
        players[i].addcard(this.drawCard());        
        }
    players[3]=new Player () ;
        players [3].plname="delar";
        players [3].addcard(this.drawCard());
        players[3].addcard(this.drawCard()); 
        }

public void updatescore (){

for(int k=0;k<highScores.length;k++){
highScores[k]=players[k].plscore;

}
}
}