/* Class Card uses 2 variables. Rank should be type int and Suit should be type String (private). 
 * Use two constructors, one to default and one to parameter the String and int. Should 
 * include getters and setters. If you pass 11 and Hearts, output should be Jack of Hearts.
*/
public class Card{
	
	private int Rank;
	private String Suit;
	
	 public Card(){
	    
	 }
  
	 public Card(int rank, String suit){
	    setRank(rank);
	    setSuit(suit);
	 }

	public String getSuit() {
		return Suit;
	}
	
	public void setSuit(String suit) {
		Suit = suit;
	}
	
	public int getRank() {
		return Rank;
	}
	
	public void setRank(int rank) {
		Rank = rank;
	}

}