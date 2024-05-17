public class Card {
    //suit
    public String suit;

    // value 1-11
    public int value;

    //how much each card is worth
    public int points;

    //Name like ace,2 ,3 etc
    public String name;

    public static void main(String[] args) {
        Card x = new Card();
    }

    public Card(){
        //suit = I don't know what to write here
        //value = math.random()*10 maybe
        //if(value = 2){points = 2} maybe
        System.out.print("the" + value+ " of" + suit+ "is worth" + points+ "points");
    }


}
