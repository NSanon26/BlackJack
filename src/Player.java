public class Player {
    //is the player the dealer or not
    public boolean isDealer;

    //sum of cards
    public int cardsSum;

    //is bust
    public boolean isBust;

    //the players cards
    public Card[] hand;

    public Player(boolean pIsDealer, int pCardsSum, boolean pIsBust){
        isDealer = pIsDealer;
        cardsSum = pCardsSum;
        isBust = pIsBust;
        hand = new Card[2];

    }
    public void print(){
        if(isDealer == false) {
            System.out.println("The player has " + cardsSum + " points");
        }else{
            System.out.println("The dealer has "+cardsSum+" points");
        }

        for(int i = 0; i<hand.length; i++){
            hand[i].print();
        }


    }
}
