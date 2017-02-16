import java.util.ArrayList;

//Class deck: 4 SUITS, 52 CARDS, EACH SUIT HAS 2-14
public class Deck {
	public ArrayList<Suit> suits = new ArrayList<Suit>();
	int numberOfCards = 52;
	int numberOfSuits = 4;
	
	public Deck(){
			suits.add(0, new Hearts());
			suits.add(1, new Clubs());
			suits.add(2, new Diamonds());
			suits.add(3, new Spades());
	}
	
	public void printAll(){
		for(int i=0; i<suits.size(); i++){
			suits.get(i).printCards();
		}
	}
}
