import java.util.Scanner;
public class Casino {
    public Card cards;
    public Player Nemo;
    public Player Dealer;
    public Card[] deck;
    public static void main(String[] args) {
        Casino x = new Casino();


    }
public Casino(){
        System.out.println("Welcome to Nemo's Casino.");

        deck = new Card[52];

int door = 0;
for(int j = 0; j<4; j++) {
    for (int i = 0; i < 13; i++) {
        cards = new Card(i, j);

        deck[door]=cards;
        door ++;
    }
}
shuffle();
printDeck();


Nemo = new Player(false, 0, false);


Dealer = new Player(true, 0, false);

    deal();
    Nemo.print();
    Dealer.print();
    if(Dealer.cardsSum == 21){
        System.out.println("The dealer got Black Jack! You lose");
    }
    if(Nemo.cardsSum == 21){
        System.out.println("You got Black Jack! You win");
    }
//https://www.w3schools.com/java/java_user_input.asp MY SOURCE
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Would you like to hit or stand? Please Respond 'hit' or 'stand'");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("You chose to: " + userName);  // Output user input
    if(userName.equals( "hit")){
        System.out.println("the hit code");
        Nemo.hand[].length++;
        Nemo.hand[2] = deck[4];
        Nemo.cardsSum = Nemo.cardsSum + Nemo.hand[2].value;
        System.out.println(Nemo.cardsSum);
    }



    }

    public void deal(){
        //give the player the first and second cards in the deck
        Nemo.hand[0] = deck[0];
        Nemo.hand[1] = deck[1];
        Nemo.cardsSum = Nemo.hand[0].value + Nemo.hand[1].value;

        Dealer.hand[0] = deck[2];
        Dealer.hand[1] = deck[3];
        Dealer.cardsSum = Dealer.hand[0].value + Dealer.hand[1].value;
    }





    public void printDeck(){
        for(int i =0; i<deck.length; i++){
            //System.out.println(deck[i]);
            deck[i].print();
        }
    }
    public void shuffle(){
        //need a loop to go through all cards
        //put cards in random index

       for(int i = 0; i<52; i++) {
           int esme = (int) (Math.random() * 52);

           Card temp = deck[i];
           deck[i] = deck[esme];
           deck[esme] = temp;

       }
    }
}

