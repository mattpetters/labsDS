import java.util.*;
public class Driver {

	
	public static void main(String[] args){
		
		Deck theDeck = new Deck();
		System.out.println("This is my card program");
		System.out.println("Shuffling the deck...");
		theDeck.shuffle();
		ArrayList<Card> playerOneCards = theDeck.drawCards(5);
		ArrayList<Card> playerTwoCards = theDeck.drawCards(5);
			
		System.out.println("Player one's hand is:");
		for(int i=0; i<playerOneCards.size(); i++){
			playerOneCards.get(i).printCard();
		}
		
		System.out.println("Player two's hand is:");
		for(int i=0; i<playerTwoCards.size(); i++){
			playerTwoCards.get(i).printCard();
		}
	}
}
