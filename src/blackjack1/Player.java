package BlackJack;
public class Player{

    public String plname;
    public int plscore=0;
    private Card[] hand =new Card[11];
    private int cardcount=0;
    Card playerCards[] = new Card[11];

    public void addcard(Card C){
        if(cardcount<11){
            hand[cardcount]=C;
            cardcount++;
            plscore+=C.getValue();
    }
    }
    String getName() {
        return plname;
    }

    int getScore(){
        return plscore;
    }
public Card[] gethand(){
 return this.hand;   
    
}
}