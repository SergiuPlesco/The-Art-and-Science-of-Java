

/*
 * Implementing a new class called Card.
 */
public class Card {
	public Card(int rank, int suit){
		cardRank = rank;
		cardSuit = suit;
	}
	
	public int getRank(){
		return cardRank;
	}
	public String toRankName(){
		switch(cardRank){
		case ACE: return "Ace";
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return "5";
		case 6: return "6";
		case 7: return "7";
		case 8: return "8";
		case 9: return "9";
		case 10: return "10";
		case JACK: return "Jack";
		case QUEEN: return "Queen";
		case KING: return "King";
		default: return "??";
		}

	}
	public int getSuit(){
		return cardSuit;
	}
	public String toSuitName(){
		switch(cardSuit){
		case CLUBS: return "Clubs";
		case DIAMONDS: return "Diamonds";
		case HEARTS: return "Hearts";
		case SPADES: return "Spades";
		default: return "??";
		}
	}
	public String toString(){
		return toRankName() + " of " + toSuitName();
	}
	
	private static final int CLUBS = 1;
	private static final int DIAMONDS = 2;
	private static final int HEARTS = 3;
	private static final int SPADES = 4;
	
	/* Named constants for the four ranks */
	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;
	
	
	private int cardRank;
	private int cardSuit;
}
