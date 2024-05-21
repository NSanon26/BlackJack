public class Card {
    //suit
    public String suit;

    // value 1-11
    public int value;



    //Name like ace,2 ,3 etc
    public String name;



    public Card(int pName, int pSuit){
      // name = pName;
        //suit = pSuit;
        if(pName == 0){
            value = 11;
            name = "Ace";
        }
        if(pName == 1){
            value = 2;
            name = "Two";
        }
        if(pName == 2){
            value = 3;
            name = "Three";
        }
        if(pName == 3){
            value = 4;
            name = "Four";
        }
        if(pName == 4){
            value = 5;
            name = "Five";
        }
        if(pName == 5){
            value = 6;
            name = "Six";
        }
        if(pName == 6){
            value = 7;
            name = "Seven";
        }
        if(pName == 7){
            value = 8;
            name = "Eight";
        }
        if(pName == 8){
            value = 9;
            name = "Nine";
        }
        if(pName == 9){
            value = 10;
            name = "Ten";
        }
        if(pName == 10){
            value = 10;
            name = "Jack";
        }
        if(pName == 11){
            value = 10;
            name = "Queen";
        }
        if(pName == 12){
            value = 10;
            name = "King";
        }
        if(pSuit ==0){
            suit = "Spades";
        }
        if(pSuit ==1){
            suit = "Clubs";
        }
        if(pSuit ==2){
            suit = "Hearts";
        }
        if(pSuit ==3){
            suit = "Diamonds";
        }



}
public void print(){
    System.out.println("The " + name+ " of " + suit+ " is worth " + value+ " points");
}
}
