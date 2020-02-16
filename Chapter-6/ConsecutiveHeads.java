/*
 * Program that simulates flipping a coin repeatedly
 * and continues until three consecutive heads a tossed. 
 * At that point, program should display the total number of 
 * times the coin was flipped.
 */
import acm.program.*;
import acm.util.*;
public class ConsecutiveHeads extends ConsoleProgram {
	public void run(){
		
		int flipCounter = 0;// flip counter
		int headsFlip = 0;//heads counter
		
		while(headsFlip < 3) {//loop to get 3 heads, we need 3 heads
			String flip = coinFlip();//assign result from coinFlip
			println(flip);//print result assigned to flip
			
			/*
			 * if heads start counting headsFlip, if 3 consecutive, stop and print
			 * if next loop is tails reset headsFlip to 0 and loop again
			 * 
			 */
			if(flip.equals("Heads")){
				headsFlip += 1;
			} else {
				headsFlip = 0;
			}
			
			flipCounter++;//count flips
			//flip = coinFlip();//assign result from coinFlip
		}
		println("It took " + flipCounter + " to get 3 heads");
		
	}
	
	private String coinFlip(){
		
		String flip = rgen.nextBoolean() ? "Heads" : "Tails";
			return flip;
		}
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
