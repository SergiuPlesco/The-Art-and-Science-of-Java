/*
 * 
 */
import acm.program.*;
import acm.util.*;
public class GetCard extends ConsoleProgram {
	public void run(){
		
		for(int i = 0; i < 20; i++){
			int cardRank = rgen.nextInt(1, 13);
			int cardSuit = rgen.nextInt(1, 4);
			Card someCard = new Card(cardRank, cardSuit);
			println(someCard);
		}
		
	}
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
