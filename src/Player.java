public class Player {
    //is the player the dealer or not
    public boolean isDealer;

    //sum of cards
    public int cardsSum;

    //is bust
    public boolean isBust;

    //the players cards
    public Card[] hand;

    public Player(){
        //make is Dealer random
        if(cardsSum > 21){
            isBust = true;
        }
        if(cardsSum < 21){
            isBust = false;
        }

    }
    public void print(){
        System.out.println("It is "+isDealer+" that you are the dealer. Your cards add up to "+cardsSum+" which means it is"+isBust+" that you busted");

    }
}
