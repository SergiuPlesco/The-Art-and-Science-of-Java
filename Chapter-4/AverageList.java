/*
 * This program reads in a list of integers
 * then prints out the average.
 */
import acm.program.*;
public class AverageList extends ConsoleProgram {
	public void run(){
		println("This program reads in a list of integers");
		println("and prints out the average, using " + SENTINEL);
		println("to signal the end of program.");
		
		int total = 0;
		int avrg = 0;
		int result = 0;
		while(true){
			int score = readInt("Enter score: ");
			avrg++;//increment by how many times user reads in integers
			if(score == SENTINEL) break;
			total += score;
			result = total / avrg; //average calculation
			
		}
		println(result);
	}
	private static final int SENTINEL = -1;
}
