/*
 * Random Card
 */
import acm.program.*;
import acm.util.*;
public class RandomCard extends ConsoleProgram {
	public void run(){
		println("This program displays a randomly chosen card.");
		println(chosenCard() + " of " + chosenSuit());
	}

	private String chosenCard(){
		String card = "";
		int rank = rgen.nextInt(1, 13);
		switch (rank) {
		case 1: card = "Ace"; break;
		case 2: card = "2"; break;
		case 3: card = "3"; break;
		case 4: card = "4"; break;
		case 5: card = "5"; break;
		case 6: card = "6"; break;
		case 7: card = "7"; break;
		case 8: card = "8"; break;
		case 9: card = "9"; break;
		case 10: card = "10"; break;
		case 11: card = "Jack"; break;
		case 12: card = "Queen"; break;
		case 13: card = "King"; break;
		default: break;
		}
		return card;
	}
	
	private String chosenSuit(){
		String suit = "";
		int randomSuit = rgen.nextInt(1, 4);
		switch (randomSuit) {
		case 1: suit = "Clubs"; break;
		case 2: suit = "Diamonds"; break;
		case 3: suit = "Hearts"; break;
		case 4: suit = "Spades"; break;
		default: break;
		}
		return suit;
	}
	

	private RandomGenerator rgen = RandomGenerator.getInstance();
}
