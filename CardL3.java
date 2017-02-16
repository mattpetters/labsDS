/* Class Card uses 2 variables. Rank should be type int and Suit should be type String (private). 
 * Use two constructors, one to default and one to parameter the String and int. Should 
 * include getters and setters. If you pass 11 and Hearts, output should be Jack of Hearts.
 * A "standard" deck of playing cards consists of 52 Cards in each of the 4 suits of Spades, Hearts, Diamonds, and Clubs. Each suit contains 13 cards: Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King.
*/
public class Card{
	
	private int Rank;
	private String Suit;
	private String RankName;
	
	 public Card(){
	    
	 }
  
	 public Card(int rank, String suit){
	    setRank(rank);
	    setRankNameBasedOnRank(rank);
	    setSuit(suit);
	 }
	 
	private void setRankNameBasedOnRank(int rank){
		switch(rank){
			case 1:
				setRankName("Ace");
			case 2:
				setRankName("2");
			case 3:
				setRankName("3");
			case 4:
				setRankName("4");
			case 5:
				setRankName("5");
			case 6:
				setRankName("6");
			case 7:
				setRankName("7");
			case 8:
				setRankName("8");
			case 9:
				setRankName("9");
			case 10:
				setRankName("10");
			case 11:
				setRankName("Jack");
			case 12:
				setRankName("Queen");
			case 13:
				setRankName("King");
			default:
				setRankName("None");
				
		}
			
				
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
	
	public void setRankName(String rankName){
		RankName = rankName;
	}
	
	public void printCard(){
		System.out.println(RankName + " of " + Suit);
	}

}