import java.util.ArrayList;

public class Suit {
	public ArrayList<Card> cards = new ArrayList<Card>();
	
	public Suit(){
		cards.add(0,new Card(2,"Two"));
		cards.add(1,new Card(3,"Three"));
		cards.add(2,new Card(4,"Four"));
		cards.add(3,new Card(5,"Five"));
		cards.add(4,new Card(6,"Six"));
		cards.add(5,new Card(7,"Seven"));
		cards.add(6,new Card(8,"Eight"));
		cards.add(7,new Card(9,"Nine"));
		cards.add(8,new Card(10,"Ten"));
		cards.add(9,new Card(11,"Jack"));
		cards.add(10,new Card(12,"Queen"));
		cards.add(11,new Card(13,"King"));
		cards.add(12,new Card(14,"Ace"));
	}
	
	public void printCards(){
		for(int i=0; i<cards.size(); i++){
			System.out.println(cards.get(i).getRankName() + "of" + cards.get(i).getSuit());
		}
	}
}

//deck of cards 4 suits, deck, cards, driver
//if you finish
//classname is fraction class
//accepts numerator and denominator
//perform addition subtraction multiplication division
//