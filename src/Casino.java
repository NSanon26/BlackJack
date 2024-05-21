public class Casino {
    public Card cards;
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
        cards.print();
        deck[door]=cards;
        door ++;
    }
}
printDeck();
    }
    public void printDeck(){
        for(int i =0; i<deck.length; i++){
            //System.out.println(deck[i]);
            deck[i].print();
        }
    }
}

