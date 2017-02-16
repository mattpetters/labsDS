
public class Diamonds extends Suit {
	
	public Diamonds(){
		for(int i=0; i<cards.size(); i++){
			cards.get(i).setSuit("Diamonds");
		}
	}

}
