import java.util.Scanner;

public class Lab2{
  public static void main(String[] args){
	  Deck deck = new Deck();
	  Scanner scan = new Scanner(System.in);
	  System.out.println("What value would you like to see?");
	  int value = scan.nextInt();
	  System.out.println("What suit would you like to see?");
	  String suit = scan.nextLine();
	  
	  for(int i=0; i<deck.suits.size(); i++){
		  for(int j=0; j<deck.suits.get(i).cards.size(); j++){
			 if(deck.suits.get(i).cards.get(j).getRank() == value && deck.suits.get(i).cards.get(j).getSuit() == suit){
				 deck.suits.get(i).cards.get(j);
			 } else {
				 System.out.println("");
			 }
		  }
	  }
	  
  }
}