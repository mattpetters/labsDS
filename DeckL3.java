import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>(52);
	
	public Deck(){
		for(int rank = 1; rank <= 13; rank++){
			 addCard(new Card(rank,"Spades"));
		}
		for(int rank = 1; rank <= 13; rank++){
			 addCard(new Card(rank,"Hearts"));
		}
		for(int rank = 1; rank <= 13; rank++){
			 addCard(new Card(rank,"Clubs"));
		}
		for(int rank = 1; rank <= 13; rank++){
			 addCard(new Card(rank,"Diamonds"));
		}
	}
	
	public void addCard(Card card){
		cards.add(card);
	}
	
	public void removeCard(Card card){
		cards.remove(card);
	}
	
	public void shuffle(){
		long randomSeed = System.nanoTime();
		Collections.shuffle(cards, new Random(randomSeed));
	}
	
	public ArrayList<Card> drawCards(int numberToDraw){
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		for(int i = 0; i<numberToDraw; i++){
			drawnCards.add(cards.remove(i));
		}
		return drawnCards;
	}
}
