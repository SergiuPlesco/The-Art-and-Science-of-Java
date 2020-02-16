/*
 * This program replace number in first verse and last word in second verse
 */
import acm.program.*;
public class TheOldMan extends ConsoleProgram {
	public void run(){
		
		for(int i = 1; i <= TENVERSES; i++){//for loop
			
			switch(i) {//switch case with different words for every case from 1 to 10
			case 1: word = "thumb"; break;
			case 2: word = "shoe"; break;
			case 3: word = "knee"; break;
			case 4: word = "door"; break;
			case 5: word = "hive"; break;
			case 6: word = "sticks"; break;
			case 7: word = "heaven"; break;
			case 8: word = "pate"; break;
			case 9: word = "spine"; break;
			case 10: word = "shin"; break;
			default: break;
			}
			
			/*
			 * Print the vers with changing number and the last word of the second verse.
			 */
					
			println("This old man, he played " + i + ".");
			println("He played knick-knack on my " + word + ".");
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("The old man came rolling home.");
			println(" ");
		}
	}
	private String word = ""; // variable word to use as a place-holder for different cases
	private static final int TENVERSES = 10; // number of times the last word is changing
}
